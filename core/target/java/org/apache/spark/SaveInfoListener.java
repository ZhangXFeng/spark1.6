package org.apache.spark;
/**
 * A simple listener that keeps track of the TaskInfos and StageInfos of all completed jobs.
 */
public  class SaveInfoListener implements org.apache.spark.scheduler.SparkListener {
  public   SaveInfoListener () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.StageInfo> completedStageInfos () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.TaskInfo> completedTaskInfos () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> jobCompletionCallback () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.StageInfo> getCompletedStageInfos () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskInfo> getCompletedTaskInfos () { throw new RuntimeException(); }
  /** Register a callback to be called on job end. */
  public  void registerJobCompletionCallback (scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> callback) { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd) { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted) { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd) { throw new RuntimeException(); }
}
