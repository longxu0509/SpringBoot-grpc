package com.localserver.grpc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.localserver.clickhouse.service.IPlaneInfoService;
import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.mapper.DataSetMapper;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.service.impl.TableServiceImpl;
import com.localserver.utils.MapToObj;
import com.wr.grpc.lib.BaseResp;
import com.wr.grpc.lib.table.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class TableService extends TableServiceGrpc.TableServiceImplBase {
    @Autowired
    private IPlaneInfoService iPlaneInfoService;
    @Autowired
    TableServiceImpl tableService;
    @Autowired
    DataSetMapper dataSetMapper;
    @Autowired
    DataModelMapper dataModelMapper;
    /**
     * 数据源下的所有表
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(TableRequest request, StreamObserver<TableResponse> responseObserver) {
        // 数据源名称
        String dataSourceName = request.getDataSourceName();
        // 固定数据库
        List<String> allTables = iPlaneInfoService.findAllTables("Ticket_info");
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");
        TableResponse.Builder response = TableResponse.newBuilder();
        // 封装表名
        TableList.Builder tableList = TableList.newBuilder();
        for (int i = 0; i < allTables.size(); i++) {
            // 从里向外封装数据
            DBTable.Builder table = DBTable.newBuilder();
            table.setTableId(i + "");
            table.setTableName(allTables.get(i));
            // 暂时固定
            tableList.setDbName("Ticket_info");
            tableList.addDbTable(table);
        }
        response.addData(tableList).setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    /**
     * 数据源中表的 schema
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void schema(TableSchemaRequest request, StreamObserver<TableSchemaResponse> responseObserver) {
        // 数据源名称
        String dataSourceName = request.getDataSourceName();
        // 数据库名称
        String dbName = request.getDbName();
        // Todo 需要表名
        String tableId = request.getTableId();
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");

        TableSchemaResponse.Builder response = TableSchemaResponse.newBuilder();
        // 表的结构信息
        List<Map<String, Object>> tableSchema = iPlaneInfoService.findTableSchema("Ticket_info", "plane_info");
        for (Map<String, Object> map : tableSchema) {
            Schema.Builder schema = Schema.newBuilder();
            Set<String> column = map.keySet();
            Iterator<String> iterator = column.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                if ("name".equals(next)) {
                    schema.setName((String) map.get("name"));
                }
                if ("comment".equals(next)) {
                    schema.setDescr((String) map.get("comment"));
                }
                if ("type".equals(next)) {
                    schema.setType((String) map.get("type"));
                }
                if ("is_in_partition_key".equals(next)) {
                    int value = (int) map.get("is_in_partition_key");
                    if (value == 0) {
                        schema.setIsPartition(false);
                    } else {
                        schema.setIsPartition(true);
                    }
                }
            }
            response.addSchema(schema);
        }
        response.setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    /**
     * 数据集中单个数据表信息
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void info(DataTableInfoRequest request, StreamObserver<DataTableInfoResponse> responseObserver)   {
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");
        DataTableInfoResponse.Builder response = DataTableInfoResponse.newBuilder();
        //获取数据集信息
        DataSet dataSet = dataSetMapper.selectById(request.getDatasetId());
        //获取表元数据信息
        List<DataModel> table_info = dataModelMapper.selectList(new QueryWrapper<DataModel>().eq("table_name", request.getDataTableId()));
        //设置数据集信息
        response.setCreateTime(dataSet.getCreateTime());
        response.setCreateUser(dataSet.getCreateUser());
        response.setName(dataSet.getDataName());
        response.setDescr(dataSet.getDataDescr());
        response.setId(String.valueOf(dataSet.getId()));
        response.setDataSourceType(dataSet.getDataSourceType());
        //设置数据表信息
        response.setDbName("Ticket_info");
        response.setTableName("plane_info");
        response.setTableId("plane_info");
        //构建指标集合和维度集合
        Set<String> metricSet = new HashSet<>();
        Set<String> dimensionSet = new HashSet<>();
        for (DataModel table :table_info){
            if (table.getDataType() ==0)
                dimensionSet.add(table.getFieldName());
            else
                metricSet.add(table.getFieldName());
        }
        List<Map<String, Object>> tableSchema = iPlaneInfoService.findTableSchema("Ticket_info", "plane_info");
        for (Map<String, Object> map : tableSchema) {
            Set<String> column = map.keySet();
            int flag = 0;
            Map<String,Object> column_info = new HashMap<>();
            for (String next : column) {
                if ("name".equals(next)) {
                    String columnName = (String) map.get("name");
                    column_info.put("name",columnName);
                    if (metricSet.contains(columnName))
                        flag = 0;
                    else
                        flag = 1;
                }
                if ("comment".equals(next)) {
                    column_info.put("comment",(String) map.get("comment"));
                }
                if ("type".equals(next)) {
                    column_info.put("descr",(String) map.get("type"));
                }
                if ("is_in_partition_key".equals(next)) {
                    int value = (int) map.get("is_in_partition_key");
                    if (value == 0) {
                        column_info.put("isPartition",false);
                    } else {
                        column_info.put("isPartition",true);
                    }
                }

            }

           try {
               response.addSchema(MapToObj.mapToObj(column_info,Schema.Builder.class));
               if (flag ==0)
                   response.addDimensionList(MapToObj.mapToObj(column_info,DimensionList.Builder.class));
               else
                   response.addMetricList(MapToObj.mapToObj(column_info,MetricList.Builder.class));
           } catch (Exception e) {

           }
        }
        response.setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
