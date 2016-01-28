package org.apache.spark;
/**
 * Dummy cluster manager to simulate responses to executor allocation requests.
 */
public  class FakeClusterManager implements org.apache.spark.rpc.RpcEndpoint {
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  // not preceding
  public   FakeClusterManager (org.apache.spark.rpc.RpcEnv rpcEnv) { throw new RuntimeException(); }
  private  int targetNumExecutors () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorIdsToKill () { throw new RuntimeException(); }
  public  int getTargetNumExecutors () { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getExecutorIdsToKill () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context) { throw new RuntimeException(); }
}
