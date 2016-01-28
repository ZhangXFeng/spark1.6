package org.apache.spark;
public  interface RDDCheckpointTester {
  public  org.apache.spark.HashPartitioner partitioner () ;
  public <T extends java.lang.Object> Object defaultCollectFunc (org.apache.spark.rdd.RDD<T> rdd) ;
  /** Implementations of this trait must implement this method */
  public  org.apache.spark.SparkContext sparkContext () ;
  /**
   * Test checkpointing of the RDD generated by the given operation. It tests whether the
   * serialized size of the RDD is reduce after checkpointing or not. This function should be called
   * on all RDDs that have a parent RDD (i.e., do not call on ParallelCollection, BlockRDD, etc.).
   * <p>
   * @param op an operation to run on the RDD
   * @param reliableCheckpoint if true, use reliable checkpoints, otherwise use local checkpoints
   * @param collectFunc a function for collecting the values in the RDD, in case there are
   *                    non-comparable types like arrays that we want to convert to something
   *                    that supports ==
   * @param evidence$1 (undocumented)
   */
  public <U extends java.lang.Object> void testRDD (scala.Function1<org.apache.spark.rdd.RDD<java.lang.Object>, org.apache.spark.rdd.RDD<U>> op, boolean reliableCheckpoint, scala.Function1<org.apache.spark.rdd.RDD<U>, java.lang.Object> collectFunc, scala.reflect.ClassTag<U> evidence$1) ;
  /**
   * Test whether checkpointing of the parent of the generated RDD also
   * truncates the lineage or not. Some RDDs like CoGroupedRDD hold on to its parent
   * RDDs partitions. So even if the parent RDD is checkpointed and its partitions changed,
   * the generated RDD will remember the partitions and therefore potentially the whole lineage.
   * This function should be called only those RDD whose partitions refer to parent RDD's
   * partitions (i.e., do not call it on simple RDD like MappedRDD).
   * <p>
   * @param op an operation to run on the RDD
   * @param reliableCheckpoint if true, use reliable checkpoints, otherwise use local checkpoints
   * @param collectFunc a function for collecting the values in the RDD, in case there are
   *                    non-comparable types like arrays that we want to convert to something
   *                    that supports ==
   * @param evidence$2 (undocumented)
   */
  public <U extends java.lang.Object> void testRDDPartitions (scala.Function1<org.apache.spark.rdd.RDD<java.lang.Object>, org.apache.spark.rdd.RDD<U>> op, boolean reliableCheckpoint, scala.Function1<org.apache.spark.rdd.RDD<U>, java.lang.Object> collectFunc, scala.reflect.ClassTag<U> evidence$2) ;
  /**
   * Get serialized sizes of the RDD and its partitions, in order to test whether the size shrinks
   * upon checkpointing. Ignores the checkpointData field, which may grow when we checkpoint.
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> getSerializedSizes (org.apache.spark.rdd.RDD<?> rdd) ;
  /**
   * Serialize and deserialize an object. This is useful to verify the objects
   * contents after deserialization (e.g., the contents of an RDD split after
   * it is sent to a slave along with a task)
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T serializeDeserialize (T obj) ;
  /**
   * Recursively force the initialization of the all members of an RDD and it parents.
   * @param rdd (undocumented)
   */
  public  void initializeRdd (org.apache.spark.rdd.RDD<?> rdd) ;
  /** Checkpoint the RDD either locally or reliably. */
  public  void checkpoint (org.apache.spark.rdd.RDD<?> rdd, boolean reliableCheckpoint) ;
  /** Run a test twice, once for local checkpointing and once for reliable checkpointing. */
  public  void runTest (java.lang.String name, boolean skipLocalCheckpoint, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> body) ;
  /**
   * Generate an RDD such that both the RDD and its partitions have large size.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> generateFatRDD () ;
  /**
   * Generate an pair RDD (with partitioner) such that both the RDD and its partitions
   * have large size.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> generateFatPairRDD () ;
}
