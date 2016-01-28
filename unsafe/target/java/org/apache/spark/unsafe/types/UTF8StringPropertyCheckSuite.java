package org.apache.spark.unsafe.types;
/**
 * This TestSuite utilize ScalaCheck to generate randomized inputs for UTF8String testing.
 */
public  class UTF8StringPropertyCheckSuite extends org.scalatest.FunSuite implements org.scalatest.prop.GeneratorDrivenPropertyChecks, org.scalatest.Matchers {
  public   UTF8StringPropertyCheckSuite () { throw new RuntimeException(); }
  public  org.scalacheck.Gen<java.lang.Object> whitespaceChar () { throw new RuntimeException(); }
  public  org.scalacheck.Gen<java.lang.String> whitespaceString () { throw new RuntimeException(); }
  public  org.scalacheck.Gen<java.lang.String> randomString () { throw new RuntimeException(); }
  public  org.scalacheck.Gen<java.lang.Object> randomInt () { throw new RuntimeException(); }
  public  org.scalacheck.Gen<scala.collection.immutable.List<java.lang.String>> nullalbeSeq () { throw new RuntimeException(); }
}
