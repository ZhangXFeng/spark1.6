package org.apache.spark.deploy.master;
public  class MasterSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.scalatest.concurrent.Eventually, org.scalatest.PrivateMethodTester {
  public   MasterSuite () { throw new RuntimeException(); }
  private  void basicScheduling (boolean spreadOut) { throw new RuntimeException(); }
  private  void basicSchedulingWithMoreMemory (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithMaxCores (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithCoresPerExecutor (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithCoresPerExecutorAndMaxCores (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithExecutorLimit (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithExecutorLimitAndMaxCores (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithExecutorLimitAndCoresPerExecutor (boolean spreadOut) { throw new RuntimeException(); }
  private  void schedulingWithEverything (boolean spreadOut) { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<int[]> _scheduleExecutorsOnWorkers () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.WorkerInfo workerInfo () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.WorkerInfo[] workerInfos () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.Master makeMaster (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.ApplicationInfo makeAppInfo (int memoryPerExecutorMb, scala.Option<java.lang.Object> coresPerExecutor, scala.Option<java.lang.Object> maxCores) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.WorkerInfo makeWorkerInfo (int memoryMb, int cores) { throw new RuntimeException(); }
  private  int[] scheduleExecutorsOnWorkers (org.apache.spark.deploy.master.Master master, org.apache.spark.deploy.master.ApplicationInfo appInfo, org.apache.spark.deploy.master.WorkerInfo[] workerInfos, boolean spreadOut) { throw new RuntimeException(); }
}
