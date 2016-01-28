package org.apache.spark.rdd;
/**
 * Fine-grained tests for local checkpointing.
 * For end-to-end tests, see CheckpointSuite.
 */
public  class LocalCheckpointSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   LocalCheckpointSuite () { throw new RuntimeException(); }
  public  void beforeEach () { throw new RuntimeException(); }
  /**
   * Helper method to create a simple RDD.
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<java.lang.Object> newRdd () { throw new RuntimeException(); }
  /**
   * Helper method to create a simple sorted RDD.
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<java.lang.Object> newSortedRdd () { throw new RuntimeException(); }
  /**
   * Helper method to test basic lineage truncation with caching.
   * <p>
   * @param rdd an RDD that is both marked for caching and local checkpointing
   * @param targetStorageLevel (undocumented)
   */
  private <T extends java.lang.Object> void testBasicLineageTruncationWithCaching (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.storage.StorageLevel targetStorageLevel) { throw new RuntimeException(); }
  /**
   * Helper method to test indirect lineage truncation.
   * <p>
   * Indirect lineage truncation here means the action is called on one of the
   * checkpointed RDD's descendants, but not on the checkpointed RDD itself.
   * <p>
   * @param rdd a locally checkpointed RDD
   * @param targetStorageLevel (undocumented)
   */
  private <T extends java.lang.Object> void testIndirectLineageTruncation (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.storage.StorageLevel targetStorageLevel) { throw new RuntimeException(); }
  /**
   * Helper method to test checkpointing without fully draining the iterator.
   * <p>
   * Not all RDD actions fully consume the iterator. As a result, a subset of the partitions
   * may not be cached. However, since we want to truncate the lineage safely, we explicitly
   * ensure that *all* partitions are fully cached. This method asserts this behavior.
   * <p>
   * @param rdd a locally checkpointed RDD
   * @param targetStorageLevel (undocumented)
   * @param targetCount (undocumented)
   */
  private <T extends java.lang.Object> void testWithoutDrainingIterator (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.storage.StorageLevel targetStorageLevel, int targetCount) { throw new RuntimeException(); }
  /**
   * Helper method to test whether the checkpoint blocks are found in the cache.
   * <p>
   * @param rdd a locally checkpointed RDD
   * @param targetStorageLevel (undocumented)
   */
  private <T extends java.lang.Object> void testCheckpointBlocksExist (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.storage.StorageLevel targetStorageLevel) { throw new RuntimeException(); }
}
