package org.apache.spark.memory;
public  class UnifiedMemoryManagerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.memory.MemoryManagerSuite, org.scalatest.PrivateMethodTester {
  public   UnifiedMemoryManagerSuite () { throw new RuntimeException(); }
  private  org.apache.spark.storage.TestBlockId dummyBlock () { throw new RuntimeException(); }
  private  double storageFraction () { throw new RuntimeException(); }
  /**
   * Make a {@link UnifiedMemoryManager} and a {@link MemoryStore} with limited class dependencies.
   * @param maxMemory (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.memory.UnifiedMemoryManager, org.apache.spark.storage.MemoryStore> makeThings (long maxMemory) { throw new RuntimeException(); }
  protected  org.apache.spark.memory.UnifiedMemoryManager createMemoryManager (long maxOnHeapExecutionMemory, long maxOffHeapExecutionMemory) { throw new RuntimeException(); }
}
