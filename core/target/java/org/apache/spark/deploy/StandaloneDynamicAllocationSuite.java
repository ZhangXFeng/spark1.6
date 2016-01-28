package org.apache.spark.deploy;
/**
 * End-to-end tests for dynamic allocation in standalone mode.
 */
public  class StandaloneDynamicAllocationSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterAll, org.scalatest.PrivateMethodTester {
  public   StandaloneDynamicAllocationSuite () { throw new RuntimeException(); }
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
  /** Kill all executors belonging to this application. */
  private  boolean killAllExecutors (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  /** Kill N executors belonging to this application. */
  private  boolean killNExecutors (org.apache.spark.SparkContext sc, int n) { throw new RuntimeException(); }
  /** Kill the given executor, specifying whether to force kill it. */
  private  boolean killExecutor (org.apache.spark.SparkContext sc, java.lang.String executorId, boolean force) { throw new RuntimeException(); }
  /**
   * Return a list of executor IDs belonging to this application.
   * <p>
   * Note that we must use the executor IDs according to the Master, which has the most
   * updated view. We cannot rely on the executor IDs according to the driver because we
   * don't wait for executors to register. Otherwise the tests will take much longer to run.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> getExecutorIds (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  /**
   * Sync executor IDs between the driver and the Master.
   * <p>
   * This allows us to avoid waiting for new executors to register with the driver before
   * we submit a request to kill them. This must be called before each kill request.
   * @param sc (undocumented)
   */
  private  void syncExecutors (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
