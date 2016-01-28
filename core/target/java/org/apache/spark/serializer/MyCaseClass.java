package org.apache.spark.serializer;
public  class MyCaseClass implements scala.Product, scala.Serializable {
  public  int foo () { throw new RuntimeException(); }
  public  java.lang.String bar () { throw new RuntimeException(); }
  // not preceding
  public   MyCaseClass (int foo, java.lang.String bar) { throw new RuntimeException(); }
}
