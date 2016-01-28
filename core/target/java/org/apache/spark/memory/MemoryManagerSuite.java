package org.apache.spark.memory;
/**
 * Helper trait for sharing code among {@link MemoryManager} tests.
 */
  interface MemoryManagerSuite extends org.scalatest.BeforeAndAfterEach {
  public  scala.collection.mutable.ArrayBuffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks () ;
  /**
   * The amount of space requested in the last call to {@link MemoryStore.evictBlocksToFreeSpace}.
   * <p>
   * This set whenever {@link MemoryStore.evictBlocksToFreeSpace} is called, and cleared when the test
   * code makes explicit assertions on this variable through
   * {@link assertEvictBlocksToFreeSpaceCalled}.
   * @return (undocumented)
   */
  public  java.util.concurrent.atomic.AtomicLong evictBlocksToFreeSpaceCalled () ;
  public  void beforeEach () ;
  /**
   * Make a mocked {@link MemoryStore} whose {@link MemoryStore.evictBlocksToFreeSpace} method is stubbed.
   * <p>
   * This allows our test code to release storage memory when these methods are called
   * without relying on {@link org.apache.spark.storage.BlockManager} and all of its dependencies.
   * @param mm (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.MemoryStore makeMemoryStore (org.apache.spark.memory.MemoryManager mm) ;
  /**
   * Simulate the part of {@link MemoryStore.evictBlocksToFreeSpace} that releases storage memory.
   * <p>
   * This is a significant simplification of the real method, which actually drops existing
   * blocks based on the size of each block. Instead, here we simply release as many bytes
   * as needed to ensure the requested amount of free space. This allows us to set up the
   * test without relying on the {@link org.apache.spark.storage.BlockManager}, which brings in
   * many other dependencies.
   * <p>
   * Every call to this method will set a global variable, {@link evictBlocksToFreeSpaceCalled}, that
   * records the number of bytes this is called with. This variable is expected to be cleared
   * by the test code later through {@link assertEvictBlocksToFreeSpaceCalled}.
   * @param mm (undocumented)
   * @return (undocumented)
   */
  public  org.mockito.stubbing.Answer<java.lang.Object> evictBlocksToFreeSpaceAnswer (org.apache.spark.memory.MemoryManager mm) ;
  /**
   * Assert that {@link MemoryStore.evictBlocksToFreeSpace} is called with the given parameters.
   * @param ms (undocumented)
   * @param numBytes (undocumented)
   */
  public  void assertEvictBlocksToFreeSpaceCalled (org.apache.spark.storage.MemoryStore ms, long numBytes) ;
  /**
   * Assert that {@link MemoryStore.evictBlocksToFreeSpace} is NOT called.
   * @param ms (undocumented)
   */
  public <T extends java.lang.Object> void assertEvictBlocksToFreeSpaceNotCalled (org.apache.spark.storage.MemoryStore ms) ;
  /**
   * Create a MemoryManager with the specified execution memory limits and no storage memory.
   * @param maxOnHeapExecutionMemory (undocumented)
   * @param maxOffHeapExecutionMemory (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.memory.MemoryManager createMemoryManager (long maxOnHeapExecutionMemory, long maxOffHeapExecutionMemory) ;
  public  scala.concurrent.ExecutionContextExecutor ec () ;
}
