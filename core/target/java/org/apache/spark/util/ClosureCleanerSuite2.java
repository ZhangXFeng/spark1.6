package org.apache.spark.util;
/**
 * Another test suite for the closure cleaner that is finer-grained.
 * For tests involving end-to-end Spark jobs, see {{ClosureCleanerSuite}}.
 */
public  class ClosureCleanerSuite2 extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.PrivateMethodTester {
  public   ClosureCleanerSuite2 () { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerInstance closureSerializer () { throw new RuntimeException(); }
  public  void beforeAll () { throw new RuntimeException(); }
  public  void afterAll () { throw new RuntimeException(); }
  private  int someSerializableValue () { throw new RuntimeException(); }
  private  org.apache.spark.util.NonSerializable someNonSerializableValue () { throw new RuntimeException(); }
  private  int someSerializableMethod () { throw new RuntimeException(); }
  private  org.apache.spark.util.NonSerializable someNonSerializableMethod () { throw new RuntimeException(); }
  /** Assert that the given closure is serializable (or not). */
  private  void assertSerializable (java.lang.Object closure, boolean serializable) { throw new RuntimeException(); }
  /**
   * Helper method for testing whether closure cleaning works as expected.
   * This cleans the given closure twice, with and without transitive cleaning.
   * <p>
   * @param closure closure to test cleaning with
   * @param serializableBefore if true, verify that the closure is serializable
   *                           before cleaning, otherwise assert that it is not
   * @param serializableAfter if true, assert that the closure is serializable
   *                          after cleaning otherwise assert that it is not
   */
  private  void verifyCleaning (java.lang.Object closure, boolean serializableBefore, boolean serializableAfter) { throw new RuntimeException(); }
  /** Helper method for testing whether closure cleaning works as expected. */
  private  void verifyCleaning (java.lang.Object closure, boolean serializableBefore, boolean serializableAfter, boolean transitive) { throw new RuntimeException(); }
  /**
   * Return the fields accessed by the given closure by class.
   * This also optionally finds the fields transitively referenced through methods invocations.
   * @param closure (undocumented)
   * @param outerClasses (undocumented)
   * @param findTransitively (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.Class<?>, scala.collection.immutable.Set<java.lang.String>> findAccessedFields (java.lang.Object closure, scala.collection.Seq<java.lang.Class<?>> outerClasses, boolean findTransitively) { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _isClosure () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.immutable.List<java.lang.Class<?>>> _getInnerClosureClasses () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.Tuple2<scala.collection.immutable.List<java.lang.Class<?>>, scala.collection.immutable.List<java.lang.Object>>> _getOuterClassesAndObjects () { throw new RuntimeException(); }
  private  boolean isClosure (java.lang.Object obj) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.Class<?>> getInnerClosureClasses (java.lang.Object closure) { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.immutable.List<java.lang.Class<?>>, scala.collection.immutable.List<java.lang.Object>> getOuterClassesAndObjects (java.lang.Object closure) { throw new RuntimeException(); }
}
