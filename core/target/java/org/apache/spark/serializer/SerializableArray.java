package org.apache.spark.serializer;
public  class SerializableArray implements java.io.Serializable {
  public  java.lang.Object[] arrayField () { throw new RuntimeException(); }
  // not preceding
  public   SerializableArray (java.lang.Object[] arrayField) { throw new RuntimeException(); }
}
