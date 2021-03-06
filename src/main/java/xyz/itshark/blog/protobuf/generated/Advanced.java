// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package xyz.itshark.blog.protobuf.generated;

/**
 * Protobuf type {@code xyz.itshark.blog.protobuf.Advanced}
 */
public  final class Advanced extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xyz.itshark.blog.protobuf.Advanced)
    AdvancedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Advanced.newBuilder() to construct.
  private Advanced(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Advanced() {
    text_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    myStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Advanced(
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
          case 24: {
            int rawValue = input.readEnum();

            myStatus_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              text_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            text_.add(s);
            break;
          }
          case 42: {
            xyz.itshark.blog.protobuf.generated.Example.Builder subBuilder = null;
            if (messageExample_ != null) {
              subBuilder = messageExample_.toBuilder();
            }
            messageExample_ = input.readMessage(xyz.itshark.blog.protobuf.generated.Example.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(messageExample_);
              messageExample_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        text_ = text_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.itshark.blog.protobuf.generated.ExampleOuterClass.internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.itshark.blog.protobuf.generated.ExampleOuterClass.internal_static_xyz_itshark_blog_protobuf_Advanced_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.itshark.blog.protobuf.generated.Advanced.class, xyz.itshark.blog.protobuf.generated.Advanced.Builder.class);
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList text_;
  /**
   * <code>repeated string text = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTextList() {
    return text_;
  }
  /**
   * <code>repeated string text = 4;</code>
   */
  public int getTextCount() {
    return text_.size();
  }
  /**
   * <code>repeated string text = 4;</code>
   */
  public java.lang.String getText(int index) {
    return text_.get(index);
  }
  /**
   * <code>repeated string text = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTextBytes(int index) {
    return text_.getByteString(index);
  }

  public static final int MY_STATUS_FIELD_NUMBER = 3;
  private int myStatus_;
  /**
   * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
   */
  public int getMyStatusValue() {
    return myStatus_;
  }
  /**
   * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
   */
  public xyz.itshark.blog.protobuf.generated.Status getMyStatus() {
    @SuppressWarnings("deprecation")
    xyz.itshark.blog.protobuf.generated.Status result = xyz.itshark.blog.protobuf.generated.Status.valueOf(myStatus_);
    return result == null ? xyz.itshark.blog.protobuf.generated.Status.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_EXAMPLE_FIELD_NUMBER = 5;
  private xyz.itshark.blog.protobuf.generated.Example messageExample_;
  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  public boolean hasMessageExample() {
    return messageExample_ != null;
  }
  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  public xyz.itshark.blog.protobuf.generated.Example getMessageExample() {
    return messageExample_ == null ? xyz.itshark.blog.protobuf.generated.Example.getDefaultInstance() : messageExample_;
  }
  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  public xyz.itshark.blog.protobuf.generated.ExampleOrBuilder getMessageExampleOrBuilder() {
    return getMessageExample();
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
    if (myStatus_ != xyz.itshark.blog.protobuf.generated.Status.SUCCESS.getNumber()) {
      output.writeEnum(3, myStatus_);
    }
    for (int i = 0; i < text_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, text_.getRaw(i));
    }
    if (messageExample_ != null) {
      output.writeMessage(5, getMessageExample());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (myStatus_ != xyz.itshark.blog.protobuf.generated.Status.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, myStatus_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < text_.size(); i++) {
        dataSize += computeStringSizeNoTag(text_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTextList().size();
    }
    if (messageExample_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMessageExample());
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
    if (!(obj instanceof xyz.itshark.blog.protobuf.generated.Advanced)) {
      return super.equals(obj);
    }
    xyz.itshark.blog.protobuf.generated.Advanced other = (xyz.itshark.blog.protobuf.generated.Advanced) obj;

    boolean result = true;
    result = result && getTextList()
        .equals(other.getTextList());
    result = result && myStatus_ == other.myStatus_;
    result = result && (hasMessageExample() == other.hasMessageExample());
    if (hasMessageExample()) {
      result = result && getMessageExample()
          .equals(other.getMessageExample());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTextCount() > 0) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getTextList().hashCode();
    }
    hash = (37 * hash) + MY_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + myStatus_;
    if (hasMessageExample()) {
      hash = (37 * hash) + MESSAGE_EXAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageExample().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.itshark.blog.protobuf.generated.Advanced parseFrom(
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
  public static Builder newBuilder(xyz.itshark.blog.protobuf.generated.Advanced prototype) {
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
   * Protobuf type {@code xyz.itshark.blog.protobuf.Advanced}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.itshark.blog.protobuf.Advanced)
      xyz.itshark.blog.protobuf.generated.AdvancedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.itshark.blog.protobuf.generated.ExampleOuterClass.internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.itshark.blog.protobuf.generated.ExampleOuterClass.internal_static_xyz_itshark_blog_protobuf_Advanced_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.itshark.blog.protobuf.generated.Advanced.class, xyz.itshark.blog.protobuf.generated.Advanced.Builder.class);
    }

    // Construct using xyz.itshark.blog.protobuf.generated.Advanced.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      text_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      myStatus_ = 0;

      if (messageExampleBuilder_ == null) {
        messageExample_ = null;
      } else {
        messageExample_ = null;
        messageExampleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.itshark.blog.protobuf.generated.ExampleOuterClass.internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor;
    }

    @java.lang.Override
    public xyz.itshark.blog.protobuf.generated.Advanced getDefaultInstanceForType() {
      return xyz.itshark.blog.protobuf.generated.Advanced.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.itshark.blog.protobuf.generated.Advanced build() {
      xyz.itshark.blog.protobuf.generated.Advanced result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.itshark.blog.protobuf.generated.Advanced buildPartial() {
      xyz.itshark.blog.protobuf.generated.Advanced result = new xyz.itshark.blog.protobuf.generated.Advanced(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        text_ = text_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.text_ = text_;
      result.myStatus_ = myStatus_;
      if (messageExampleBuilder_ == null) {
        result.messageExample_ = messageExample_;
      } else {
        result.messageExample_ = messageExampleBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.itshark.blog.protobuf.generated.Advanced) {
        return mergeFrom((xyz.itshark.blog.protobuf.generated.Advanced)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.itshark.blog.protobuf.generated.Advanced other) {
      if (other == xyz.itshark.blog.protobuf.generated.Advanced.getDefaultInstance()) return this;
      if (!other.text_.isEmpty()) {
        if (text_.isEmpty()) {
          text_ = other.text_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTextIsMutable();
          text_.addAll(other.text_);
        }
        onChanged();
      }
      if (other.myStatus_ != 0) {
        setMyStatusValue(other.getMyStatusValue());
      }
      if (other.hasMessageExample()) {
        mergeMessageExample(other.getMessageExample());
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
      xyz.itshark.blog.protobuf.generated.Advanced parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (xyz.itshark.blog.protobuf.generated.Advanced) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList text_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTextIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        text_ = new com.google.protobuf.LazyStringArrayList(text_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTextList() {
      return text_.getUnmodifiableView();
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public int getTextCount() {
      return text_.size();
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public java.lang.String getText(int index) {
      return text_.get(index);
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes(int index) {
      return text_.getByteString(index);
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public Builder setText(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTextIsMutable();
      text_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public Builder addText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTextIsMutable();
      text_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public Builder addAllText(
        java.lang.Iterable<java.lang.String> values) {
      ensureTextIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, text_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public Builder clearText() {
      text_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string text = 4;</code>
     */
    public Builder addTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTextIsMutable();
      text_.add(value);
      onChanged();
      return this;
    }

    private int myStatus_ = 0;
    /**
     * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
     */
    public int getMyStatusValue() {
      return myStatus_;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
     */
    public Builder setMyStatusValue(int value) {
      myStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
     */
    public xyz.itshark.blog.protobuf.generated.Status getMyStatus() {
      @SuppressWarnings("deprecation")
      xyz.itshark.blog.protobuf.generated.Status result = xyz.itshark.blog.protobuf.generated.Status.valueOf(myStatus_);
      return result == null ? xyz.itshark.blog.protobuf.generated.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
     */
    public Builder setMyStatus(xyz.itshark.blog.protobuf.generated.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      myStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
     */
    public Builder clearMyStatus() {
      
      myStatus_ = 0;
      onChanged();
      return this;
    }

    private xyz.itshark.blog.protobuf.generated.Example messageExample_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.itshark.blog.protobuf.generated.Example, xyz.itshark.blog.protobuf.generated.Example.Builder, xyz.itshark.blog.protobuf.generated.ExampleOrBuilder> messageExampleBuilder_;
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public boolean hasMessageExample() {
      return messageExampleBuilder_ != null || messageExample_ != null;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public xyz.itshark.blog.protobuf.generated.Example getMessageExample() {
      if (messageExampleBuilder_ == null) {
        return messageExample_ == null ? xyz.itshark.blog.protobuf.generated.Example.getDefaultInstance() : messageExample_;
      } else {
        return messageExampleBuilder_.getMessage();
      }
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public Builder setMessageExample(xyz.itshark.blog.protobuf.generated.Example value) {
      if (messageExampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messageExample_ = value;
        onChanged();
      } else {
        messageExampleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public Builder setMessageExample(
        xyz.itshark.blog.protobuf.generated.Example.Builder builderForValue) {
      if (messageExampleBuilder_ == null) {
        messageExample_ = builderForValue.build();
        onChanged();
      } else {
        messageExampleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public Builder mergeMessageExample(xyz.itshark.blog.protobuf.generated.Example value) {
      if (messageExampleBuilder_ == null) {
        if (messageExample_ != null) {
          messageExample_ =
            xyz.itshark.blog.protobuf.generated.Example.newBuilder(messageExample_).mergeFrom(value).buildPartial();
        } else {
          messageExample_ = value;
        }
        onChanged();
      } else {
        messageExampleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public Builder clearMessageExample() {
      if (messageExampleBuilder_ == null) {
        messageExample_ = null;
        onChanged();
      } else {
        messageExample_ = null;
        messageExampleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public xyz.itshark.blog.protobuf.generated.Example.Builder getMessageExampleBuilder() {
      
      onChanged();
      return getMessageExampleFieldBuilder().getBuilder();
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    public xyz.itshark.blog.protobuf.generated.ExampleOrBuilder getMessageExampleOrBuilder() {
      if (messageExampleBuilder_ != null) {
        return messageExampleBuilder_.getMessageOrBuilder();
      } else {
        return messageExample_ == null ?
            xyz.itshark.blog.protobuf.generated.Example.getDefaultInstance() : messageExample_;
      }
    }
    /**
     * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.itshark.blog.protobuf.generated.Example, xyz.itshark.blog.protobuf.generated.Example.Builder, xyz.itshark.blog.protobuf.generated.ExampleOrBuilder> 
        getMessageExampleFieldBuilder() {
      if (messageExampleBuilder_ == null) {
        messageExampleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            xyz.itshark.blog.protobuf.generated.Example, xyz.itshark.blog.protobuf.generated.Example.Builder, xyz.itshark.blog.protobuf.generated.ExampleOrBuilder>(
                getMessageExample(),
                getParentForChildren(),
                isClean());
        messageExample_ = null;
      }
      return messageExampleBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:xyz.itshark.blog.protobuf.Advanced)
  }

  // @@protoc_insertion_point(class_scope:xyz.itshark.blog.protobuf.Advanced)
  private static final xyz.itshark.blog.protobuf.generated.Advanced DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.itshark.blog.protobuf.generated.Advanced();
  }

  public static xyz.itshark.blog.protobuf.generated.Advanced getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Advanced>
      PARSER = new com.google.protobuf.AbstractParser<Advanced>() {
    @java.lang.Override
    public Advanced parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Advanced(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Advanced> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Advanced> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.itshark.blog.protobuf.generated.Advanced getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

