package org.apache.spark;
/**
 * Dummy RPC endpoint to simulate executors.
 */
public  class FakeExecutorEndpoint implements org.apache.spark.rpc.RpcEndpoint {
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  // not preceding
  public   FakeExecutorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv) { throw new RuntimeException(); }
}
