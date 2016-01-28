package org.apache.spark;
/**
 * Base abstract class for all unit tests in Spark for handling common functionality.
 */
 abstract class SparkFunSuite extends org.scalatest.FunSuite implements org.apache.spark.Logging {
  public   SparkFunSuite () { throw new RuntimeException(); }
  /**
   * Log the suite name and the test name before and after each test.
   * <p>
   * Subclasses should never override this method. If they wish to run
   * custom code before and after each test, they should mix in the
   * {{org.scalatest.BeforeAndAfter}} trait instead.
   * @param test (undocumented)
   * @return (undocumented)
   */
  protected final  org.scalatest.Outcome withFixture (org.scalatest.Suite.NoArgTest test) { throw new RuntimeException(); }
}
