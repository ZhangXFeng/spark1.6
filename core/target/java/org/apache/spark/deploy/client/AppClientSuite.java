package org.apache.spark.deploy.client;
/**
 * End-to-end tests for application client in standalone mode.
 */
public  class AppClientSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterAll {
  public   AppClientSuite () { throw new RuntimeException(); }
  private  int numWorkers () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  org.apache.spark.SecurityManager securityManager () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEnv masterRpcEnv () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.rpc.RpcEnv> workerRpcEnvs () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.Master master () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.deploy.worker.Worker> workers () { throw new RuntimeException(); }
  /**
   * Start the local cluster.
   * Note: local-cluster mode is insufficient because we want a reference to the Master.
   */
  public  void beforeAll () { throw new RuntimeException(); }
  public  void afterAll () { throw new RuntimeException(); }
  /** Return a SparkConf for applications that want to talk to our Master. */
  private  org.apache.spark.SparkConf appConf () { throw new RuntimeException(); }
  /** Make a master to which our application will send executor requests. */
  private  org.apache.spark.deploy.master.Master makeMaster () { throw new RuntimeException(); }
  /** Make a few workers that talk to our master. */
  private  scala.collection.Seq<org.apache.spark.deploy.worker.Worker> makeWorkers (int cores, int memory) { throw new RuntimeException(); }
  /** Get the Master state */
  private  org.apache.spark.deploy.DeployMessages.MasterStateResponse getMasterState () { throw new RuntimeException(); }
  /** Get the applictions that are active from Master */
  private  scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> getApplications () { throw new RuntimeException(); }
  /** Application Listener to collect events */
  private  class AppClientCollector implements org.apache.spark.deploy.client.AppClientListener, org.apache.spark.Logging {
    public   AppClientCollector () { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.String> connectedIdList () { throw new RuntimeException(); }
    public  int disconnectedCount () { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.String> deadReasonList () { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.String> execAddedList () { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.String> execRemovedList () { throw new RuntimeException(); }
    public  void connected (java.lang.String id) { throw new RuntimeException(); }
    public  void disconnected () { throw new RuntimeException(); }
    public  void dead (java.lang.String reason) { throw new RuntimeException(); }
    public  void executorAdded (java.lang.String id, java.lang.String workerId, java.lang.String hostPort, int cores, int memory) { throw new RuntimeException(); }
    public  void executorRemoved (java.lang.String id, java.lang.String message, scala.Option<java.lang.Object> exitStatus) { throw new RuntimeException(); }
  }
  /** Create AppClient and supporting objects */
  private  class AppClientInst {
    public   AppClientInst (java.lang.String masterUrl) { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
    private  org.apache.spark.deploy.Command cmd () { throw new RuntimeException(); }
    private  org.apache.spark.deploy.ApplicationDescription desc () { throw new RuntimeException(); }
    public  org.apache.spark.deploy.client.AppClientSuite.AppClientCollector listener () { throw new RuntimeException(); }
    public  org.apache.spark.deploy.client.AppClient client () { throw new RuntimeException(); }
  }
}
