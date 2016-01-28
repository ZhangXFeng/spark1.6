package org.apache.spark.serializer;
/**
 * Tests to ensure that {@link Serializer} implementations obey the API contracts for methods that
 * describe properties of the serialized stream, such as
 * {@link Serializer.supportsRelocationOfSerializedObjects}.
 */
public  class SerializerPropertiesSuite extends org.apache.spark.SparkFunSuite {
  static public  Object generateRandomItem (scala.util.Random rand) { throw new RuntimeException(); }
  static public  void testSupportsRelocationOfSerializedObjects (org.apache.spark.serializer.Serializer serializer, scala.Function1<scala.util.Random, java.lang.Object> generateRandomItem) { throw new RuntimeException(); }
  public   SerializerPropertiesSuite () { throw new RuntimeException(); }
}
