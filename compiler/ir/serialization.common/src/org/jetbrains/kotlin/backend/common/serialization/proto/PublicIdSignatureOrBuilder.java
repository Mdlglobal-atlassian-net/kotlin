// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface PublicIdSignatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.PublicIdSignature)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated int32 package_fq_name = 1 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getPackageFqNameList();
  /**
   * <code>repeated int32 package_fq_name = 1 [packed = true];</code>
   */
  int getPackageFqNameCount();
  /**
   * <code>repeated int32 package_fq_name = 1 [packed = true];</code>
   */
  int getPackageFqName(int index);

  /**
   * <code>repeated int32 declaration_fq_name = 2 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getDeclarationFqNameList();
  /**
   * <code>repeated int32 declaration_fq_name = 2 [packed = true];</code>
   */
  int getDeclarationFqNameCount();
  /**
   * <code>repeated int32 declaration_fq_name = 2 [packed = true];</code>
   */
  int getDeclarationFqName(int index);

  /**
   * <code>optional int64 member_uniq_id = 3;</code>
   */
  boolean hasMemberUniqId();
  /**
   * <code>optional int64 member_uniq_id = 3;</code>
   */
  long getMemberUniqId();

  /**
   * <code>optional int64 flags = 4 [default = 0];</code>
   */
  boolean hasFlags();
  /**
   * <code>optional int64 flags = 4 [default = 0];</code>
   */
  long getFlags();
}