package org.apache.spark.storage;
public  class BlockManagerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester, org.apache.spark.util.ResetSystemProperties {
  public   BlockManagerSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager store () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager store2 () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager store3 () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster master () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr () { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker () { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.hash.HashShuffleManager shuffleManager () { throw new RuntimeException(); }
  public  org.apache.spark.serializer.KryoSerializer serializer () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.storage.RDDBlockId rdd (int rddId, int splitId) { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager makeBlockManager (long maxMem, java.lang.String name) { throw new RuntimeException(); }
  public  void beforeEach () { throw new RuntimeException(); }
  public  void afterEach () { throw new RuntimeException(); }
  /**
   * Verify the result of MemoryStore#unrollSafely is as expected.
   * @param expected (undocumented)
   * @param result (undocumented)
   * @param shouldBeArray (undocumented)
   */
  private  void verifyUnroll (scala.collection.Iterator<java.lang.Object> expected, scala.util.Either<java.lang.Object[], scala.collection.Iterator<java.lang.Object>> result, boolean shouldBeArray) { throw new RuntimeException(); }
}
