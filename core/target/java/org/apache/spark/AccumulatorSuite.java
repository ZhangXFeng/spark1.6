package org.apache.spark;
public  class AccumulatorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.apache.spark.LocalSparkContext {
  /**
   * Run one or more Spark jobs and verify that the peak execution memory accumulator
   * is updated afterwards.
   * @param sc (undocumented)
   * @param testName (undocumented)
   * @param testBody (undocumented)
   */
  static public  void verifyPeakExecutionMemorySet (org.apache.spark.SparkContext sc, java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> testBody) { throw new RuntimeException(); }
  public   AccumulatorSuite () { throw new RuntimeException(); }
  public <A extends java.lang.Object> org.apache.spark.AccumulableParam<scala.collection.mutable.Set<A>, A> setAccum () { throw new RuntimeException(); }
  /**
   * Return the accumulable info that matches the specified name.
   * @param accums (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.AccumulableInfo findAccumulableInfo (scala.collection.Iterable<org.apache.spark.scheduler.AccumulableInfo> accums, java.lang.String name) { throw new RuntimeException(); }
  /**
   * Test whether internal accumulators are merged properly if some tasks fail.
   * @param failCondition (undocumented)
   */
  private  void testInternalAccumulatorsWithFailedTasks (scala.Function1<java.lang.Object, java.lang.Object> failCondition) { throw new RuntimeException(); }
}
