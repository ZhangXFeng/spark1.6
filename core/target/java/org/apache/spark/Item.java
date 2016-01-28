package org.apache.spark;
public  class Item implements scala.Product, scala.Serializable {
  public  int value () { throw new RuntimeException(); }
  // not preceding
  public   Item (int value) { throw new RuntimeException(); }
}
