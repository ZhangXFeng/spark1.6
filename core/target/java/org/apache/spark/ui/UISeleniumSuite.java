package org.apache.spark.ui;
/**
 * Selenium tests for the Spark Web UI.
 */
public  class UISeleniumSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.selenium.WebBrowser, org.scalatest.Matchers, org.scalatest.BeforeAndAfterAll {
  public   UISeleniumSuite () { throw new RuntimeException(); }
  public  org.openqa.selenium.WebDriver webDriver () { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  public  void beforeAll () { throw new RuntimeException(); }
  public  void afterAll () { throw new RuntimeException(); }
  /**
   * Create a test SparkContext with the SparkUI enabled.
   * It is safe to <code>get</code> the SparkUI directly from the SparkContext returned here.
   * @param killEnabled (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.SparkContext newSparkContext (boolean killEnabled) { throw new RuntimeException(); }
  public  void goToUi (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  public  void goToUi (org.apache.spark.ui.SparkUI ui, java.lang.String path) { throw new RuntimeException(); }
  public  long parseDate (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue getJson (org.apache.spark.ui.SparkUI ui, java.lang.String path) { throw new RuntimeException(); }
  public  java.net.URL apiUrl (org.apache.spark.ui.SparkUI ui, java.lang.String path) { throw new RuntimeException(); }
}
