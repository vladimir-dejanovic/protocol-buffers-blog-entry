// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package xyz.itshark.blog.protobuf.generated;

public final class ExampleOuterClass {
  private ExampleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_itshark_blog_protobuf_Example_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_itshark_blog_protobuf_Example_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_itshark_blog_protobuf_Advanced_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_itshark_blog_protobuf_Example2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_itshark_blog_protobuf_Example2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_itshark_blog_protobuf_Example2_Internal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_itshark_blog_protobuf_Example2_Internal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rexample.proto\022\031xyz.itshark.blog.protob" +
      "uf\"<\n\007Example\022\n\n\002id\030\001 \001(\005\022\022\n\nfirst_name\030" +
      "\002 \001(\t\022\021\n\tlast_name\030\003 \001(\t\"\213\001\n\010Advanced\022\014\n" +
      "\004text\030\004 \003(\t\0224\n\tmy_status\030\003 \001(\0162!.xyz.its" +
      "hark.blog.protobuf.Status\022;\n\017message_exa" +
      "mple\030\005 \001(\0132\".xyz.itshark.blog.protobuf.E" +
      "xample\"i\n\010Example2\022C\n\rvalid_message\030\001 \001(" +
      "\0132,.xyz.itshark.blog.protobuf.Example2.I" +
      "nternal\032\030\n\010Internal\022\014\n\004text\030\001 \001(\t*+\n\006Sta" +
      "tus\022\013\n\007SUCCESS\020\000\022\010\n\004FAIL\020\001\022\n\n\006RANDOM\020\002B\'" +
      "\n#xyz.itshark.blog.protobuf.generatedP\001b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_xyz_itshark_blog_protobuf_Example_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xyz_itshark_blog_protobuf_Example_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_itshark_blog_protobuf_Example_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", });
    internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xyz_itshark_blog_protobuf_Advanced_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_itshark_blog_protobuf_Advanced_descriptor,
        new java.lang.String[] { "Text", "MyStatus", "MessageExample", });
    internal_static_xyz_itshark_blog_protobuf_Example2_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_xyz_itshark_blog_protobuf_Example2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_itshark_blog_protobuf_Example2_descriptor,
        new java.lang.String[] { "ValidMessage", });
    internal_static_xyz_itshark_blog_protobuf_Example2_Internal_descriptor =
      internal_static_xyz_itshark_blog_protobuf_Example2_descriptor.getNestedTypes().get(0);
    internal_static_xyz_itshark_blog_protobuf_Example2_Internal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_itshark_blog_protobuf_Example2_Internal_descriptor,
        new java.lang.String[] { "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}