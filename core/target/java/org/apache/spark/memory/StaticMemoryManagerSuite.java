package org.apache.spark.memory;
public  class StaticMemoryManagerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.memory.MemoryManagerSuite {
  public   StaticMemoryManagerSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  /**
   * Make a {@link StaticMemoryManager} and a {@link MemoryStore} with limited class dependencies.
   * @param maxExecutionMem (undocumented)
   * @param maxStorageMem (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.memory.StaticMemoryManager, org.apache.spark.storage.MemoryStore> makeThings (long maxExecutionMem, long maxStorageMem) { throw new RuntimeException(); }
  protected  org.apache.spark.memory.StaticMemoryManager createMemoryManager (long maxOnHeapExecutionMemory, long maxOffHeapExecutionMemory) { throw new RuntimeException(); }
}
