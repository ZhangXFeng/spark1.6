package org.apache.spark.storage;
public  class ShuffleBlockFetcherIteratorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.PrivateMethodTester {
  public   ShuffleBlockFetcherIteratorSuite () { throw new RuntimeException(); }
  /** Creates a mock {@link BlockTransferService} that returns data from the given map. */
  private  org.apache.spark.network.BlockTransferService createMockTransfer (scala.collection.immutable.Map<org.apache.spark.storage.BlockId, org.apache.spark.network.buffer.ManagedBuffer> data) { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer createMockManagedBuffer () { throw new RuntimeException(); }
}
