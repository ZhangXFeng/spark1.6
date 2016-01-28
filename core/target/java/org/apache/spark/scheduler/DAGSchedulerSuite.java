package org.apache.spark.scheduler;
public  class DAGSchedulerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext, org.scalatest.concurrent.Timeouts {
  public   DAGSchedulerSuite () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  /** Set of TaskSets the DAGScheduler has requested executed. */
  public  scala.collection.mutable.Buffer<org.apache.spark.scheduler.TaskSet> taskSets () { throw new RuntimeException(); }
  /** Stages for which the DAGScheduler has called TaskScheduler.cancelTasks(). */
  public  scala.collection.mutable.HashSet<java.lang.Object> cancelledStages () { throw new RuntimeException(); }
  public  java.lang.Object taskScheduler () { throw new RuntimeException(); }
  /** Length of time to wait while draining listener events. */
  public  int WAIT_TIMEOUT_MILLIS () { throw new RuntimeException(); }
  public  java.lang.Object sparkListener () { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler scheduler () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGSchedulerEventProcessLoop dagEventProcessLoopTester () { throw new RuntimeException(); }
  /**
   * Set of cache locations to return from our mock BlockManagerMaster.
   * Keys are (rdd ID, partition ID). Anything not present will return an empty
   * list of cache locations silently.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> cacheLocations () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster blockManagerMaster () { throw new RuntimeException(); }
  /** The list of results that DAGScheduler has collected. */
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> results () { throw new RuntimeException(); }
  public  java.lang.Exception failure () { throw new RuntimeException(); }
  public  java.lang.Object jobListener () { throw new RuntimeException(); }
  /** A simple helper class for creating custom JobListeners */
  public  class SimpleListener implements org.apache.spark.scheduler.JobListener {
    public   SimpleListener () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> results () { throw new RuntimeException(); }
    public  java.lang.Exception failure () { throw new RuntimeException(); }
    public  void taskSucceeded (int index, Object result) { throw new RuntimeException(); }
    public  void jobFailed (java.lang.Exception exception) { throw new RuntimeException(); }
  }
  public  void afterAll () { throw new RuntimeException(); }
  /**
   * Process the supplied event as if it were the top of the DAGScheduler event queue, expecting
   * the scheduler not to exit.
   * <p>
   * After processing the event, submit waiting stages as is done on most iterations of the
   * DAGScheduler event loop.
   * @param event (undocumented)
   */
  private  void runEvent (org.apache.spark.scheduler.DAGSchedulerEvent event) { throw new RuntimeException(); }
  /**
   * When we submit dummy Jobs, this is the compute function we supply. Except in a local test
   * below, we do not expect this function to ever be executed; instead, we will return results
   * directly through CompletionEvents.
   * @return (undocumented)
   */
  private  scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, java.lang.Object> jobComputeFunc () { throw new RuntimeException(); }
  /** Send the given CompletionEvent messages for the tasks in the TaskSet. */
  private  void complete (org.apache.spark.scheduler.TaskSet taskSet, scala.collection.Seq<scala.Tuple2<org.apache.spark.TaskEndReason, java.lang.Object>> results) { throw new RuntimeException(); }
  private  void completeWithAccumulator (long accumId, org.apache.spark.scheduler.TaskSet taskSet, scala.collection.Seq<scala.Tuple2<org.apache.spark.TaskEndReason, java.lang.Object>> results) { throw new RuntimeException(); }
  /** Submits a job to the scheduler and returns the job id. */
  private  int submit (org.apache.spark.rdd.RDD<?> rdd, int[] partitions, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<java.lang.Object>, ?> func, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties) { throw new RuntimeException(); }
  /** Submits a map stage to the scheduler and returns the job id. */
  private  int submitMapStage (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, org.apache.spark.scheduler.JobListener listener) { throw new RuntimeException(); }
  /** Sends TaskSetFailed to the scheduler. */
  private  void failed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String message) { throw new RuntimeException(); }
  /** Sends JobCancelled to the DAG scheduler. */
  private  void cancel (int jobId) { throw new RuntimeException(); }
  private  void checkStageId (int stageId, int attempt, org.apache.spark.scheduler.TaskSet stageAttempt) { throw new RuntimeException(); }
  private  void setupStageAbortTest (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  boolean ended () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobResult jobResult () { throw new RuntimeException(); }
  public  class EndListener implements org.apache.spark.scheduler.SparkListener {
    public   EndListener () { throw new RuntimeException(); }
    public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd) { throw new RuntimeException(); }
  }
  /**
   * Common code to get the next stage attempt, confirm it's the one we expect, and complete it
   * successfully.
   * <p>
   * @param stageId - The current stageId
   * @param attemptIdx - The current attempt count
   * @param numShufflePartitions - The number of partitions in the next stage
   */
  private  void completeShuffleMapStageSuccessfully (int stageId, int attemptIdx, int numShufflePartitions) { throw new RuntimeException(); }
  /**
   * Common code to get the next stage attempt, confirm it's the one we expect, and complete it
   * with all FetchFailure.
   * <p>
   * @param stageId - The current stageId
   * @param attemptIdx - The current attempt count
   * @param shuffleDep - The shuffle dependency of the stage with a fetch failure
   */
  private  void completeNextStageWithFetchFailure (int stageId, int attemptIdx, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep) { throw new RuntimeException(); }
  /**
   * Common code to get the next result stage attempt, confirm it's the one we expect, and
   * complete it with a success where we return 42.
   * <p>
   * @param stageId - The current stageId
   * @param attemptIdx - The current attempt count
   * @param partitionToResult (undocumented)
   */
  private  void completeNextResultStageWithSuccess (int stageId, int attemptIdx, scala.Function1<java.lang.Object, java.lang.Object> partitionToResult) { throw new RuntimeException(); }
  public  void checkJobPropertiesAndPriority (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String expected, int priority) { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, scala.runtime.Nothing$> launchJobsThatShareStageAndCancelFirst () { throw new RuntimeException(); }
  /**
   * Assert that the supplied TaskSet has exactly the given hosts as its preferred locations.
   * Note that this checks only the host and not the executor ID.
   * @param taskSet (undocumented)
   * @param hosts (undocumented)
   */
  private  void assertLocations (org.apache.spark.scheduler.TaskSet taskSet, scala.collection.Seq<scala.collection.Seq<java.lang.String>> hosts) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.MapStatus makeMapStatus (java.lang.String host, int reduces, byte sizes) { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManagerId makeBlockManagerId (java.lang.String host) { throw new RuntimeException(); }
  private  void assertDataStructuresEmpty () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskInfo createFakeTaskInfo () { throw new RuntimeException(); }
}
