// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package xyz.itshark.blog.protobuf.generated;

public interface AdvancedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.itshark.blog.protobuf.Advanced)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string text = 4;</code>
   */
  java.util.List<java.lang.String>
      getTextList();
  /**
   * <code>repeated string text = 4;</code>
   */
  int getTextCount();
  /**
   * <code>repeated string text = 4;</code>
   */
  java.lang.String getText(int index);
  /**
   * <code>repeated string text = 4;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes(int index);

  /**
   * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
   */
  int getMyStatusValue();
  /**
   * <code>.xyz.itshark.blog.protobuf.Status my_status = 3;</code>
   */
  xyz.itshark.blog.protobuf.generated.Status getMyStatus();

  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  boolean hasMessageExample();
  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  xyz.itshark.blog.protobuf.generated.Example getMessageExample();
  /**
   * <code>.xyz.itshark.blog.protobuf.Example message_example = 5;</code>
   */
  xyz.itshark.blog.protobuf.generated.ExampleOrBuilder getMessageExampleOrBuilder();
}
