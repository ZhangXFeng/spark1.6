package org.apache.spark.shuffle.sort;
/**
 * Tests for the fallback logic in UnsafeShuffleManager. Actual tests of shuffling data are
 * performed in other suites.
 */
public  class SortShuffleManagerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers {
  public   SortShuffleManagerSuite () { throw new RuntimeException(); }
  private  class RuntimeExceptionAnswer implements org.mockito.stubbing.Answer<java.lang.Object> {
    public   RuntimeExceptionAnswer () { throw new RuntimeException(); }
    public  java.lang.Object answer (org.mockito.invocation.InvocationOnMock invocation) { throw new RuntimeException(); }
  }
  private  org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, java.lang.Object> shuffleDep (org.apache.spark.Partitioner partitioner, scala.Option<org.apache.spark.serializer.Serializer> serializer, scala.Option<scala.math.Ordering<java.lang.Object>> keyOrdering, scala.Option<org.apache.spark.Aggregator<java.lang.Object, java.lang.Object, java.lang.Object>> aggregator, boolean mapSideCombine) { throw new RuntimeException(); }
}
