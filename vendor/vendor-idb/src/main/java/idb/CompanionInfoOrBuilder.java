// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface CompanionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.CompanionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string udid = 1;</code>
   * @return The udid.
   */
  java.lang.String getUdid();
  /**
   * <code>string udid = 1;</code>
   * @return The bytes for udid.
   */
  com.google.protobuf.ByteString
      getUdidBytes();

  /**
   * <code>string host = 2;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * uint64 port = 3; deprecated
   * </pre>
   *
   * <code>bool is_local = 4;</code>
   * @return The isLocal.
   */
  boolean getIsLocal();

  /**
   * <code>uint64 grpc_port = 5;</code>
   * @return The grpcPort.
   */
  long getGrpcPort();
}