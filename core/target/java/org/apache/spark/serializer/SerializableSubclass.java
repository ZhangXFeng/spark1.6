package org.apache.spark.serializer;
public  class SerializableSubclass extends org.apache.spark.serializer.SerializableClass1 {
  public  java.lang.Object objectField () { throw new RuntimeException(); }
  // not preceding
  public   SerializableSubclass (java.lang.Object objectField) { throw new RuntimeException(); }
}
