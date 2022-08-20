// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: table.proto

package com.wr.grpc.lib.table;

/**
 * Protobuf type {@code table.TableSchemaResponse}
 */
public final class TableSchemaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:table.TableSchemaResponse)
    TableSchemaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableSchemaResponse.newBuilder() to construct.
  private TableSchemaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableSchemaResponse() {
    schema_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableSchemaResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TableSchemaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              schema_ = new java.util.ArrayList<com.wr.grpc.lib.table.Schema>();
              mutable_bitField0_ |= 0x00000001;
            }
            schema_.add(
                input.readMessage(com.wr.grpc.lib.table.Schema.parser(), extensionRegistry));
            break;
          }
          case 2042: {
            com.wr.grpc.lib.BaseResp.Builder subBuilder = null;
            if (baseResp_ != null) {
              subBuilder = baseResp_.toBuilder();
            }
            baseResp_ = input.readMessage(com.wr.grpc.lib.BaseResp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseResp_);
              baseResp_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        schema_ = java.util.Collections.unmodifiableList(schema_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wr.grpc.lib.table.TableInfo.internal_static_table_TableSchemaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wr.grpc.lib.table.TableInfo.internal_static_table_TableSchemaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wr.grpc.lib.table.TableSchemaResponse.class, com.wr.grpc.lib.table.TableSchemaResponse.Builder.class);
  }

  public static final int SCHEMA_FIELD_NUMBER = 1;
  private java.util.List<com.wr.grpc.lib.table.Schema> schema_;
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.wr.grpc.lib.table.Schema> getSchemaList() {
    return schema_;
  }
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wr.grpc.lib.table.SchemaOrBuilder> 
      getSchemaOrBuilderList() {
    return schema_;
  }
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  @java.lang.Override
  public int getSchemaCount() {
    return schema_.size();
  }
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  @java.lang.Override
  public com.wr.grpc.lib.table.Schema getSchema(int index) {
    return schema_.get(index);
  }
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  @java.lang.Override
  public com.wr.grpc.lib.table.SchemaOrBuilder getSchemaOrBuilder(
      int index) {
    return schema_.get(index);
  }

  public static final int BASERESP_FIELD_NUMBER = 255;
  private com.wr.grpc.lib.BaseResp baseResp_;
  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   * @return Whether the baseResp field is set.
   */
  @java.lang.Override
  public boolean hasBaseResp() {
    return baseResp_ != null;
  }
  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   * @return The baseResp.
   */
  @java.lang.Override
  public com.wr.grpc.lib.BaseResp getBaseResp() {
    return baseResp_ == null ? com.wr.grpc.lib.BaseResp.getDefaultInstance() : baseResp_;
  }
  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   */
  @java.lang.Override
  public com.wr.grpc.lib.BaseRespOrBuilder getBaseRespOrBuilder() {
    return getBaseResp();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < schema_.size(); i++) {
      output.writeMessage(1, schema_.get(i));
    }
    if (baseResp_ != null) {
      output.writeMessage(255, getBaseResp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < schema_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, schema_.get(i));
    }
    if (baseResp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(255, getBaseResp());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wr.grpc.lib.table.TableSchemaResponse)) {
      return super.equals(obj);
    }
    com.wr.grpc.lib.table.TableSchemaResponse other = (com.wr.grpc.lib.table.TableSchemaResponse) obj;

    if (!getSchemaList()
        .equals(other.getSchemaList())) return false;
    if (hasBaseResp() != other.hasBaseResp()) return false;
    if (hasBaseResp()) {
      if (!getBaseResp()
          .equals(other.getBaseResp())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSchemaCount() > 0) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchemaList().hashCode();
    }
    if (hasBaseResp()) {
      hash = (37 * hash) + BASERESP_FIELD_NUMBER;
      hash = (53 * hash) + getBaseResp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.table.TableSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wr.grpc.lib.table.TableSchemaResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code table.TableSchemaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:table.TableSchemaResponse)
      com.wr.grpc.lib.table.TableSchemaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wr.grpc.lib.table.TableInfo.internal_static_table_TableSchemaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wr.grpc.lib.table.TableInfo.internal_static_table_TableSchemaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wr.grpc.lib.table.TableSchemaResponse.class, com.wr.grpc.lib.table.TableSchemaResponse.Builder.class);
    }

    // Construct using com.wr.grpc.lib.table.TableSchemaResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSchemaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (schemaBuilder_ == null) {
        schema_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        schemaBuilder_.clear();
      }
      if (baseRespBuilder_ == null) {
        baseResp_ = null;
      } else {
        baseResp_ = null;
        baseRespBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wr.grpc.lib.table.TableInfo.internal_static_table_TableSchemaResponse_descriptor;
    }

    @java.lang.Override
    public com.wr.grpc.lib.table.TableSchemaResponse getDefaultInstanceForType() {
      return com.wr.grpc.lib.table.TableSchemaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wr.grpc.lib.table.TableSchemaResponse build() {
      com.wr.grpc.lib.table.TableSchemaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wr.grpc.lib.table.TableSchemaResponse buildPartial() {
      com.wr.grpc.lib.table.TableSchemaResponse result = new com.wr.grpc.lib.table.TableSchemaResponse(this);
      int from_bitField0_ = bitField0_;
      if (schemaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          schema_ = java.util.Collections.unmodifiableList(schema_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schema_ = schema_;
      } else {
        result.schema_ = schemaBuilder_.build();
      }
      if (baseRespBuilder_ == null) {
        result.baseResp_ = baseResp_;
      } else {
        result.baseResp_ = baseRespBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wr.grpc.lib.table.TableSchemaResponse) {
        return mergeFrom((com.wr.grpc.lib.table.TableSchemaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wr.grpc.lib.table.TableSchemaResponse other) {
      if (other == com.wr.grpc.lib.table.TableSchemaResponse.getDefaultInstance()) return this;
      if (schemaBuilder_ == null) {
        if (!other.schema_.isEmpty()) {
          if (schema_.isEmpty()) {
            schema_ = other.schema_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSchemaIsMutable();
            schema_.addAll(other.schema_);
          }
          onChanged();
        }
      } else {
        if (!other.schema_.isEmpty()) {
          if (schemaBuilder_.isEmpty()) {
            schemaBuilder_.dispose();
            schemaBuilder_ = null;
            schema_ = other.schema_;
            bitField0_ = (bitField0_ & ~0x00000001);
            schemaBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSchemaFieldBuilder() : null;
          } else {
            schemaBuilder_.addAllMessages(other.schema_);
          }
        }
      }
      if (other.hasBaseResp()) {
        mergeBaseResp(other.getBaseResp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wr.grpc.lib.table.TableSchemaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wr.grpc.lib.table.TableSchemaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wr.grpc.lib.table.Schema> schema_ =
      java.util.Collections.emptyList();
    private void ensureSchemaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        schema_ = new java.util.ArrayList<com.wr.grpc.lib.table.Schema>(schema_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wr.grpc.lib.table.Schema, com.wr.grpc.lib.table.Schema.Builder, com.wr.grpc.lib.table.SchemaOrBuilder> schemaBuilder_;

    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public java.util.List<com.wr.grpc.lib.table.Schema> getSchemaList() {
      if (schemaBuilder_ == null) {
        return java.util.Collections.unmodifiableList(schema_);
      } else {
        return schemaBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public int getSchemaCount() {
      if (schemaBuilder_ == null) {
        return schema_.size();
      } else {
        return schemaBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public com.wr.grpc.lib.table.Schema getSchema(int index) {
      if (schemaBuilder_ == null) {
        return schema_.get(index);
      } else {
        return schemaBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder setSchema(
        int index, com.wr.grpc.lib.table.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemaIsMutable();
        schema_.set(index, value);
        onChanged();
      } else {
        schemaBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder setSchema(
        int index, com.wr.grpc.lib.table.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        ensureSchemaIsMutable();
        schema_.set(index, builderForValue.build());
        onChanged();
      } else {
        schemaBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder addSchema(com.wr.grpc.lib.table.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemaIsMutable();
        schema_.add(value);
        onChanged();
      } else {
        schemaBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder addSchema(
        int index, com.wr.grpc.lib.table.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemaIsMutable();
        schema_.add(index, value);
        onChanged();
      } else {
        schemaBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder addSchema(
        com.wr.grpc.lib.table.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        ensureSchemaIsMutable();
        schema_.add(builderForValue.build());
        onChanged();
      } else {
        schemaBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder addSchema(
        int index, com.wr.grpc.lib.table.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        ensureSchemaIsMutable();
        schema_.add(index, builderForValue.build());
        onChanged();
      } else {
        schemaBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder addAllSchema(
        java.lang.Iterable<? extends com.wr.grpc.lib.table.Schema> values) {
      if (schemaBuilder_ == null) {
        ensureSchemaIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schema_);
        onChanged();
      } else {
        schemaBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder clearSchema() {
      if (schemaBuilder_ == null) {
        schema_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        schemaBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public Builder removeSchema(int index) {
      if (schemaBuilder_ == null) {
        ensureSchemaIsMutable();
        schema_.remove(index);
        onChanged();
      } else {
        schemaBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public com.wr.grpc.lib.table.Schema.Builder getSchemaBuilder(
        int index) {
      return getSchemaFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public com.wr.grpc.lib.table.SchemaOrBuilder getSchemaOrBuilder(
        int index) {
      if (schemaBuilder_ == null) {
        return schema_.get(index);  } else {
        return schemaBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public java.util.List<? extends com.wr.grpc.lib.table.SchemaOrBuilder> 
         getSchemaOrBuilderList() {
      if (schemaBuilder_ != null) {
        return schemaBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(schema_);
      }
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public com.wr.grpc.lib.table.Schema.Builder addSchemaBuilder() {
      return getSchemaFieldBuilder().addBuilder(
          com.wr.grpc.lib.table.Schema.getDefaultInstance());
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public com.wr.grpc.lib.table.Schema.Builder addSchemaBuilder(
        int index) {
      return getSchemaFieldBuilder().addBuilder(
          index, com.wr.grpc.lib.table.Schema.getDefaultInstance());
    }
    /**
     * <pre>
     * 表名
     * </pre>
     *
     * <code>repeated .table.Schema schema = 1;</code>
     */
    public java.util.List<com.wr.grpc.lib.table.Schema.Builder> 
         getSchemaBuilderList() {
      return getSchemaFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wr.grpc.lib.table.Schema, com.wr.grpc.lib.table.Schema.Builder, com.wr.grpc.lib.table.SchemaOrBuilder> 
        getSchemaFieldBuilder() {
      if (schemaBuilder_ == null) {
        schemaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wr.grpc.lib.table.Schema, com.wr.grpc.lib.table.Schema.Builder, com.wr.grpc.lib.table.SchemaOrBuilder>(
                schema_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        schema_ = null;
      }
      return schemaBuilder_;
    }

    private com.wr.grpc.lib.BaseResp baseResp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wr.grpc.lib.BaseResp, com.wr.grpc.lib.BaseResp.Builder, com.wr.grpc.lib.BaseRespOrBuilder> baseRespBuilder_;
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     * @return Whether the baseResp field is set.
     */
    public boolean hasBaseResp() {
      return baseRespBuilder_ != null || baseResp_ != null;
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     * @return The baseResp.
     */
    public com.wr.grpc.lib.BaseResp getBaseResp() {
      if (baseRespBuilder_ == null) {
        return baseResp_ == null ? com.wr.grpc.lib.BaseResp.getDefaultInstance() : baseResp_;
      } else {
        return baseRespBuilder_.getMessage();
      }
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public Builder setBaseResp(com.wr.grpc.lib.BaseResp value) {
      if (baseRespBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseResp_ = value;
        onChanged();
      } else {
        baseRespBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public Builder setBaseResp(
        com.wr.grpc.lib.BaseResp.Builder builderForValue) {
      if (baseRespBuilder_ == null) {
        baseResp_ = builderForValue.build();
        onChanged();
      } else {
        baseRespBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public Builder mergeBaseResp(com.wr.grpc.lib.BaseResp value) {
      if (baseRespBuilder_ == null) {
        if (baseResp_ != null) {
          baseResp_ =
            com.wr.grpc.lib.BaseResp.newBuilder(baseResp_).mergeFrom(value).buildPartial();
        } else {
          baseResp_ = value;
        }
        onChanged();
      } else {
        baseRespBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public Builder clearBaseResp() {
      if (baseRespBuilder_ == null) {
        baseResp_ = null;
        onChanged();
      } else {
        baseResp_ = null;
        baseRespBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public com.wr.grpc.lib.BaseResp.Builder getBaseRespBuilder() {
      
      onChanged();
      return getBaseRespFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    public com.wr.grpc.lib.BaseRespOrBuilder getBaseRespOrBuilder() {
      if (baseRespBuilder_ != null) {
        return baseRespBuilder_.getMessageOrBuilder();
      } else {
        return baseResp_ == null ?
            com.wr.grpc.lib.BaseResp.getDefaultInstance() : baseResp_;
      }
    }
    /**
     * <code>.base.BaseResp baseResp = 255;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wr.grpc.lib.BaseResp, com.wr.grpc.lib.BaseResp.Builder, com.wr.grpc.lib.BaseRespOrBuilder> 
        getBaseRespFieldBuilder() {
      if (baseRespBuilder_ == null) {
        baseRespBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wr.grpc.lib.BaseResp, com.wr.grpc.lib.BaseResp.Builder, com.wr.grpc.lib.BaseRespOrBuilder>(
                getBaseResp(),
                getParentForChildren(),
                isClean());
        baseResp_ = null;
      }
      return baseRespBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:table.TableSchemaResponse)
  }

  // @@protoc_insertion_point(class_scope:table.TableSchemaResponse)
  private static final com.wr.grpc.lib.table.TableSchemaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wr.grpc.lib.table.TableSchemaResponse();
  }

  public static com.wr.grpc.lib.table.TableSchemaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableSchemaResponse>
      PARSER = new com.google.protobuf.AbstractParser<TableSchemaResponse>() {
    @java.lang.Override
    public TableSchemaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TableSchemaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TableSchemaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableSchemaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wr.grpc.lib.table.TableSchemaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

