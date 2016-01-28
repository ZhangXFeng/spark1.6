package org.apache.spark.ui.scope;
/**
 * Tests that this listener populates and cleans up its data structures properly.
 */
public  class RDDOperationGraphListenerSuite extends org.apache.spark.SparkFunSuite {
  public   RDDOperationGraphListenerSuite () { throw new RuntimeException(); }
  private  int jobIdCounter () { throw new RuntimeException(); }
  private  int stageIdCounter () { throw new RuntimeException(); }
  private  int maxRetainedJobs () { throw new RuntimeException(); }
  private  int maxRetainedStages () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  /** Start a job with the specified number of stages. */
  private  int startJob (int numStages, org.apache.spark.ui.scope.RDDOperationGraphListener listener) { throw new RuntimeException(); }
  /** Start the stage specified by the given ID. */
  private  void startStage (int stageId, org.apache.spark.ui.scope.RDDOperationGraphListener listener) { throw new RuntimeException(); }
  /** Finish the stage specified by the given ID. */
  private  void endStage (int stageId, org.apache.spark.ui.scope.RDDOperationGraphListener listener) { throw new RuntimeException(); }
  /** Finish the job specified by the given ID. */
  private  void endJob (int jobId, org.apache.spark.ui.scope.RDDOperationGraphListener listener) { throw new RuntimeException(); }
}
