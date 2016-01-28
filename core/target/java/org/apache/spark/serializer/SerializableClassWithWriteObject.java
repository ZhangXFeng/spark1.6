package org.apache.spark.serializer;
public  class SerializableClassWithWriteObject implements java.io.Serializable {
  public  java.lang.Object objectField () { throw new RuntimeException(); }
  // not preceding
  public   SerializableClassWithWriteObject (java.lang.Object objectField) { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializableClass1 serializableObjectField () { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
}
