package org.apache.spark.deploy.history;
public  class FsHistoryProviderSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.Matchers, org.apache.spark.Logging {
  public   FsHistoryProviderSuite () { throw new RuntimeException(); }
  private  java.io.File testDir () { throw new RuntimeException(); }
  /** Create a fake log file using the new log format used in Spark 1.3+ */
  private  java.io.File newLogFile (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, boolean inProgress, scala.Option<java.lang.String> codec) { throw new RuntimeException(); }
  /**
   * Asks the provider to check for logs and calls a function to perform checks on the updated
   * app list. Example:
   * <p>
   *     updateAndCheck(provider) { list =&gt;
   *       // asserts
   *     }
   * @param provider (undocumented)
   * @param checkFn (undocumented)
   */
  private  void updateAndCheck (org.apache.spark.deploy.history.FsHistoryProvider provider, scala.Function1<scala.collection.Seq<org.apache.spark.deploy.history.ApplicationHistoryInfo>, scala.runtime.BoxedUnit> checkFn) { throw new RuntimeException(); }
  private  void writeFile (java.io.File file, boolean isNewFormat, scala.Option<org.apache.spark.io.CompressionCodec> codec, scala.collection.Seq<org.apache.spark.scheduler.SparkListenerEvent> events) { throw new RuntimeException(); }
  private  void createEmptyFile (java.io.File file) { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf createTestConf () { throw new RuntimeException(); }
  private  java.io.File writeOldLog (java.lang.String fname, java.lang.String sparkVersion, scala.Option<org.apache.spark.io.CompressionCodec> codec, boolean completed, scala.collection.Seq<org.apache.spark.scheduler.SparkListenerEvent> events) { throw new RuntimeException(); }
  private  class SafeModeTestProvider extends org.apache.spark.deploy.history.FsHistoryProvider {
    public   SafeModeTestProvider (org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock) { throw new RuntimeException(); }
    public  boolean inSafeMode () { throw new RuntimeException(); }
      java.lang.Thread initialize () { throw new RuntimeException(); }
      boolean isFsInSafeMode () { throw new RuntimeException(); }
  }
}
