package org.apache.spark.rdd;
/**
 * Tests whether scopes are passed from the RDD operation to the RDDs correctly.
 */
public  class RDDOperationScopeSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   RDDOperationScopeSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDDOperationScope scope1 () { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDDOperationScope scope2 () { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDDOperationScope scope3 () { throw new RuntimeException(); }
}
