package org.apache.spark.deploy.history;
/**
 * A collection of tests against the historyserver, including comparing responses from the json
 * metrics api to a set of known "golden files".  If new endpoints / parameters are added,
 * cases should be added to this test suite.  The expected outcomes can be genered by running
 * the HistoryServerSuite.main.  Note that this will blindly generate new expectation files matching
 * the current behavior -- the developer must verify that behavior is correct.
 * <p>
 * Similarly, if the behavior is changed, HistoryServerSuite.main can be run to update the
 * expectations.  However, in general this should be done with extreme caution, as the metrics
 * are considered part of Spark's public api.
 */
public  class HistoryServerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.Matchers, org.scalatest.mock.MockitoSugar, org.apache.spark.JsonTestUtils {
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static public  scala.Tuple3<java.lang.Object, scala.Option<java.io.InputStream>, scala.Option<java.lang.String>> connectAndGetInputStream (java.net.URL url) { throw new RuntimeException(); }
  static public  java.lang.String sanitizePath (java.lang.String path) { throw new RuntimeException(); }
  public   HistoryServerSuite () { throw new RuntimeException(); }
  private  java.io.File logDir () { throw new RuntimeException(); }
  private  java.io.File expRoot () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.FsHistoryProvider provider () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.HistoryServer server () { throw new RuntimeException(); }
  private  int port () { throw new RuntimeException(); }
  public  void init () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> cases () { throw new RuntimeException(); }
  public  void doDownloadTest (java.lang.String appId, scala.Option<java.lang.Object> attemptId, boolean legacy) { throw new RuntimeException(); }
  public  scala.Tuple3<java.lang.Object, scala.Option<java.lang.String>, scala.Option<java.lang.String>> getContentAndCode (java.lang.String path, int port) { throw new RuntimeException(); }
  public  java.lang.String getUrl (java.lang.String path) { throw new RuntimeException(); }
  public  java.net.URL generateURL (java.lang.String path) { throw new RuntimeException(); }
  public  void generateExpectation (java.lang.String name, java.lang.String path) { throw new RuntimeException(); }
}
