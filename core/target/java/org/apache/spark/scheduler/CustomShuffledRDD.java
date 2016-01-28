package org.apache.spark.scheduler;
/**
 * A special ShuffledRDD that supports a ShuffleDependency object from outside and launching reduce
 * tasks that read multiple map output partitions.
 */
public  class CustomShuffledRDD<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> {
  public  org.apache.spark.ShuffleDependency<K, V, C> dependency () { throw new RuntimeException(); }
  // not preceding
  public   CustomShuffledRDD (org.apache.spark.ShuffleDependency<K, V, C> dependency, int[] partitionStartIndices) { throw new RuntimeException(); }
  public   CustomShuffledRDD (org.apache.spark.ShuffleDependency<K, V, C> dep) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies () { throw new RuntimeException(); }
  public  scala.Some<org.apache.spark.scheduler.CoalescedPartitioner> partitioner () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<K, C>> compute (org.apache.spark.Partition p, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  public  void clearDependencies () { throw new RuntimeException(); }
}
