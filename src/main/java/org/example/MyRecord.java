// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/proto/MyRecord.proto


package org.example;
public final class MyRecord {
  private MyRecord() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.Record)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string location = 3;</code>
     * @return Whether the location field is set.
     */
    boolean hasLocation();
    /**
     * <code>optional string location = 3;</code>
     * @return The location.
     */
    java.lang.String getLocation();
    /**
     * <code>optional string location = 3;</code>
     * @return The bytes for location.
     */
    com.google.protobuf.ByteString
        getLocationBytes();
  }
  /**
   * Protobuf type {@code proto.Record}
   */
  public static final class Record extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.Record)
      RecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Record.newBuilder() to construct.
    private Record(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Record() {
      name_ = "";
      location_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Record();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.MyRecord.internal_static_proto_Record_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.MyRecord.internal_static_proto_Record_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.MyRecord.Record.class, org.example.MyRecord.Record.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>optional int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOCATION_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object location_ = "";
    /**
     * <code>optional string location = 3;</code>
     * @return Whether the location field is set.
     */
    @java.lang.Override
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string location = 3;</code>
     * @return The location.
     */
    @java.lang.Override
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          location_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string location = 3;</code>
     * @return The bytes for location.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, location_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, location_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.example.MyRecord.Record)) {
        return super.equals(obj);
      }
      org.example.MyRecord.Record other = (org.example.MyRecord.Record) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasLocation() != other.hasLocation()) return false;
      if (hasLocation()) {
        if (!getLocation()
            .equals(other.getLocation())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasLocation()) {
        hash = (37 * hash) + LOCATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocation().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.MyRecord.Record parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.MyRecord.Record parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.MyRecord.Record parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.MyRecord.Record parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.MyRecord.Record parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.MyRecord.Record parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.MyRecord.Record parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.MyRecord.Record parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.example.MyRecord.Record parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.example.MyRecord.Record parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.MyRecord.Record parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.MyRecord.Record parseFrom(
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
    public static Builder newBuilder(org.example.MyRecord.Record prototype) {
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
     * Protobuf type {@code proto.Record}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.Record)
        org.example.MyRecord.RecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.MyRecord.internal_static_proto_Record_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.MyRecord.internal_static_proto_Record_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.MyRecord.Record.class, org.example.MyRecord.Record.Builder.class);
      }

      // Construct using org.example.MyRecord.Record.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        name_ = "";
        location_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.MyRecord.internal_static_proto_Record_descriptor;
      }

      @java.lang.Override
      public org.example.MyRecord.Record getDefaultInstanceForType() {
        return org.example.MyRecord.Record.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.MyRecord.Record build() {
        org.example.MyRecord.Record result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.MyRecord.Record buildPartial() {
        org.example.MyRecord.Record result = new org.example.MyRecord.Record(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.example.MyRecord.Record result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.location_ = location_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof org.example.MyRecord.Record) {
          return mergeFrom((org.example.MyRecord.Record)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.MyRecord.Record other) {
        if (other == org.example.MyRecord.Record.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasLocation()) {
          location_ = other.location_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                location_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object location_ = "";
      /**
       * <code>optional string location = 3;</code>
       * @return Whether the location field is set.
       */
      public boolean hasLocation() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string location = 3;</code>
       * @return The location.
       */
      public java.lang.String getLocation() {
        java.lang.Object ref = location_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            location_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string location = 3;</code>
       * @return The bytes for location.
       */
      public com.google.protobuf.ByteString
          getLocationBytes() {
        java.lang.Object ref = location_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          location_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string location = 3;</code>
       * @param value The location to set.
       * @return This builder for chaining.
       */
      public Builder setLocation(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        location_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string location = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocation() {
        location_ = getDefaultInstance().getLocation();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string location = 3;</code>
       * @param value The bytes for location to set.
       * @return This builder for chaining.
       */
      public Builder setLocationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        location_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:proto.Record)
    }

    // @@protoc_insertion_point(class_scope:proto.Record)
    private static final org.example.MyRecord.Record DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.MyRecord.Record();
    }

    public static org.example.MyRecord.Record getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Record>
        PARSER = new com.google.protobuf.AbstractParser<Record>() {
      @java.lang.Override
      public Record parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Record> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Record> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.MyRecord.Record getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Record_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Record_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"src/main/java/proto/MyRecord.proto\022\005pr" +
      "oto\"4\n\006Record\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022" +
      "\020\n\010location\030\003 \001(\tB\r\n\013org.example"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_Record_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Record_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Record_descriptor,
        new java.lang.String[] { "Id", "Name", "Location", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
