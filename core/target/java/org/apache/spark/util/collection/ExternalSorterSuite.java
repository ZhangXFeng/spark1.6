package org.apache.spark.util.collection;
public  class ExternalSorterSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   ExternalSorterSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf createSparkConf (boolean loadDefaults, boolean kryo) { throw new RuntimeException(); }
  /**
   * Run a test multiple times, each time with a different serializer.
   * @param name (undocumented)
   * @param loadDefaults (undocumented)
   * @param body (undocumented)
   */
  private  void testWithMultipleSer (java.lang.String name, boolean loadDefaults, scala.Function1<org.apache.spark.SparkConf, scala.runtime.BoxedUnit> body) { throw new RuntimeException(); }
  private  void emptyDataStream (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  void fewElementsPerPartition (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  void emptyPartitionsWithSpilling (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  void testSpillingInLocalCluster (org.apache.spark.SparkConf conf, int numReduceTasks) { throw new RuntimeException(); }
  private  void cleanupIntermediateFilesInSorter (boolean withFailures) { throw new RuntimeException(); }
  private  void cleanupIntermediateFilesInShuffle (boolean withFailures) { throw new RuntimeException(); }
  private  void basicSorterTest (org.apache.spark.SparkConf conf, boolean withPartialAgg, boolean withOrdering, boolean withSpilling) { throw new RuntimeException(); }
  private  void sortWithoutBreakingSortingContracts (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
}
