// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datasource.proto

package com.wr.grpc.lib.datasource;

/**
 * Protobuf type {@code datasource.ListResponse}
 */
public final class ListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:datasource.ListResponse)
    ListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListResponse.newBuilder() to construct.
  private ListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListResponse() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListResponse(
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
              data_ = new java.util.ArrayList<com.wr.grpc.lib.datasource.Data>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.wr.grpc.lib.datasource.Data.parser(), extensionRegistry));
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
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_ListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_ListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wr.grpc.lib.datasource.ListResponse.class, com.wr.grpc.lib.datasource.ListResponse.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private java.util.List<com.wr.grpc.lib.datasource.Data> data_;
  /**
   * <code>repeated .datasource.Data data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.wr.grpc.lib.datasource.Data> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .datasource.Data data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wr.grpc.lib.datasource.DataOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .datasource.Data data = 1;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .datasource.Data data = 1;</code>
   */
  @java.lang.Override
  public com.wr.grpc.lib.datasource.Data getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .datasource.Data data = 1;</code>
   */
  @java.lang.Override
  public com.wr.grpc.lib.datasource.DataOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
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
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
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
    if (!(obj instanceof com.wr.grpc.lib.datasource.ListResponse)) {
      return super.equals(obj);
    }
    com.wr.grpc.lib.datasource.ListResponse other = (com.wr.grpc.lib.datasource.ListResponse) obj;

    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    if (hasBaseResp()) {
      hash = (37 * hash) + BASERESP_FIELD_NUMBER;
      hash = (53 * hash) + getBaseResp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.ListResponse parseFrom(
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
  public static Builder newBuilder(com.wr.grpc.lib.datasource.ListResponse prototype) {
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
   * Protobuf type {@code datasource.ListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:datasource.ListResponse)
      com.wr.grpc.lib.datasource.ListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_ListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_ListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wr.grpc.lib.datasource.ListResponse.class, com.wr.grpc.lib.datasource.ListResponse.Builder.class);
    }

    // Construct using com.wr.grpc.lib.datasource.ListResponse.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
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
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_ListResponse_descriptor;
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.ListResponse getDefaultInstanceForType() {
      return com.wr.grpc.lib.datasource.ListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.ListResponse build() {
      com.wr.grpc.lib.datasource.ListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.ListResponse buildPartial() {
      com.wr.grpc.lib.datasource.ListResponse result = new com.wr.grpc.lib.datasource.ListResponse(this);
      int from_bitField0_ = bitField0_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.wr.grpc.lib.datasource.ListResponse) {
        return mergeFrom((com.wr.grpc.lib.datasource.ListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wr.grpc.lib.datasource.ListResponse other) {
      if (other == com.wr.grpc.lib.datasource.ListResponse.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
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
      com.wr.grpc.lib.datasource.ListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wr.grpc.lib.datasource.ListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wr.grpc.lib.datasource.Data> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.wr.grpc.lib.datasource.Data>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wr.grpc.lib.datasource.Data, com.wr.grpc.lib.datasource.Data.Builder, com.wr.grpc.lib.datasource.DataOrBuilder> dataBuilder_;

    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public java.util.List<com.wr.grpc.lib.datasource.Data> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public com.wr.grpc.lib.datasource.Data getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder setData(
        int index, com.wr.grpc.lib.datasource.Data value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder setData(
        int index, com.wr.grpc.lib.datasource.Data.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder addData(com.wr.grpc.lib.datasource.Data value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder addData(
        int index, com.wr.grpc.lib.datasource.Data value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder addData(
        com.wr.grpc.lib.datasource.Data.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder addData(
        int index, com.wr.grpc.lib.datasource.Data.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.wr.grpc.lib.datasource.Data> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public com.wr.grpc.lib.datasource.Data.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public com.wr.grpc.lib.datasource.DataOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public java.util.List<? extends com.wr.grpc.lib.datasource.DataOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public com.wr.grpc.lib.datasource.Data.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.wr.grpc.lib.datasource.Data.getDefaultInstance());
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public com.wr.grpc.lib.datasource.Data.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.wr.grpc.lib.datasource.Data.getDefaultInstance());
    }
    /**
     * <code>repeated .datasource.Data data = 1;</code>
     */
    public java.util.List<com.wr.grpc.lib.datasource.Data.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wr.grpc.lib.datasource.Data, com.wr.grpc.lib.datasource.Data.Builder, com.wr.grpc.lib.datasource.DataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wr.grpc.lib.datasource.Data, com.wr.grpc.lib.datasource.Data.Builder, com.wr.grpc.lib.datasource.DataOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:datasource.ListResponse)
  }

  // @@protoc_insertion_point(class_scope:datasource.ListResponse)
  private static final com.wr.grpc.lib.datasource.ListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wr.grpc.lib.datasource.ListResponse();
  }

  public static com.wr.grpc.lib.datasource.ListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListResponse>() {
    @java.lang.Override
    public ListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wr.grpc.lib.datasource.ListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

