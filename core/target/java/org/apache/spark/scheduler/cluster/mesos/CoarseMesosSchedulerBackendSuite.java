package org.apache.spark.scheduler.cluster.mesos;
public  class CoarseMesosSchedulerBackendSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.mock.MockitoSugar, org.scalatest.BeforeAndAfter {
  public   CoarseMesosSchedulerBackendSuite () { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.Offer createOffer (java.lang.String offerId, java.lang.String slaveId, int mem, int cpu) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.CoarseMesosSchedulerBackend createSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler, org.apache.mesos.SchedulerDriver driver) { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
}
