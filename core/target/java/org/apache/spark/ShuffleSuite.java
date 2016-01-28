package org.apache.spark;
public abstract class ShuffleSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.apache.spark.LocalSparkContext {
  static public  class AggregatedShuffleMetrics implements scala.Product, scala.Serializable {
    public  long recordsWritten () { throw new RuntimeException(); }
    public  long recordsRead () { throw new RuntimeException(); }
    public  long bytesWritten () { throw new RuntimeException(); }
    public  long byresRead () { throw new RuntimeException(); }
    // not preceding
    public   AggregatedShuffleMetrics (long recordsWritten, long recordsRead, long bytesWritten, long byresRead) { throw new RuntimeException(); }
  }
  // no position
  static public  class AggregatedShuffleMetrics$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AggregatedShuffleMetrics$ MODULE$ = null;
    public   AggregatedShuffleMetrics$ () { throw new RuntimeException(); }
  }
  static public  class NonJavaSerializableClass implements java.lang.Comparable<org.apache.spark.ShuffleSuite.NonJavaSerializableClass> {
    public  int value () { throw new RuntimeException(); }
    // not preceding
    public   NonJavaSerializableClass (int value) { throw new RuntimeException(); }
    public  int compareTo (org.apache.spark.ShuffleSuite.NonJavaSerializableClass o) { throw new RuntimeException(); }
  }
  static public  int mergeCombineException (int x, int y) { throw new RuntimeException(); }
  static public  org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics runAndReturnMetrics (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> job) { throw new RuntimeException(); }
  public   ShuffleSuite () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
}
