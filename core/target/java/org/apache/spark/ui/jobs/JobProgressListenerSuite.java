package org.apache.spark.ui.jobs;
public  class JobProgressListenerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.Matchers {
  public   JobProgressListenerSuite () { throw new RuntimeException(); }
  public  long jobSubmissionTime () { throw new RuntimeException(); }
  public  long jobCompletionTime () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.SparkListenerStageSubmitted createStageStartEvent (int stageId) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.SparkListenerStageCompleted createStageEndEvent (int stageId, boolean failed) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.SparkListenerJobStart createJobStartEvent (int jobId, scala.collection.Seq<java.lang.Object> stageIds, scala.Option<java.lang.String> jobGroup) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.SparkListenerJobEnd createJobEndEvent (int jobId, boolean failed) { throw new RuntimeException(); }
  private  void runJob (org.apache.spark.scheduler.SparkListener listener, int jobId, boolean shouldFail) { throw new RuntimeException(); }
  private  void assertActiveJobsStateIsEmpty (org.apache.spark.ui.jobs.JobProgressListener listener) { throw new RuntimeException(); }
}
