package org.apache.spark;
/**
 * A test suite for the heartbeating behavior between the driver and the executors.
 */
public  class HeartbeatReceiverSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester, org.apache.spark.LocalSparkContext {
  public   HeartbeatReceiverSuite () { throw new RuntimeException(); }
  private  java.lang.String executorId1 () { throw new RuntimeException(); }
  private  java.lang.String executorId2 () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskSchedulerImpl scheduler () { throw new RuntimeException(); }
  private  org.apache.spark.HeartbeatReceiver heartbeatReceiver () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef heartbeatReceiverRef () { throw new RuntimeException(); }
  private  org.apache.spark.util.ManualClock heartbeatReceiverClock () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Map<java.lang.String, java.lang.Object>> _executorLastSeen () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _executorTimeoutMs () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.util.concurrent.ExecutorService> _killExecutorThread () { throw new RuntimeException(); }
  /**
   * Before each test, set up the SparkContext and a custom {@link HeartbeatReceiver}
   * that uses a manual clock.
   */
  public  void beforeEach () { throw new RuntimeException(); }
  /**
   * After each test, clean up all state and stop the {@link SparkContext}.
   */
  public  void afterEach () { throw new RuntimeException(); }
  /** Manually send a heartbeat and return the response. */
  private  void triggerHeartbeat (java.lang.String executorId, boolean executorShouldReregister) { throw new RuntimeException(); }
  private  void addExecutorAndVerify (java.lang.String executorId) { throw new RuntimeException(); }
  private  void removeExecutorAndVerify (java.lang.String executorId) { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.String, java.lang.Object> getTrackedExecutors () { throw new RuntimeException(); }
}
