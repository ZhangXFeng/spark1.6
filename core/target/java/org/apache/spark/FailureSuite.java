package org.apache.spark;
public  class FailureSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   FailureSuite () { throw new RuntimeException(); }
}
