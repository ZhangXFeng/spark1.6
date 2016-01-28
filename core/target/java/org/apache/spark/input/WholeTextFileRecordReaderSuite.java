package org.apache.spark.input;
/**
 * Tests the correctness of
 * {@link org.apache.spark.input.WholeTextFileRecordReader WholeTextFileRecordReader}. A temporary
 * directory is created as fake input. Temporal storage would be deleted in the end.
 */
public  class WholeTextFileRecordReaderSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.apache.spark.Logging {
  static private  scala.collection.immutable.IndexedSeq<java.lang.Object> testWords () { throw new RuntimeException(); }
  static private  java.lang.String[] fileNames () { throw new RuntimeException(); }
  static private  int[] fileLengths () { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, byte[]> files () { throw new RuntimeException(); }
  public   WholeTextFileRecordReaderSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  private  org.apache.hadoop.io.compress.CompressionCodecFactory factory () { throw new RuntimeException(); }
  public  void beforeAll () { throw new RuntimeException(); }
  public  void afterAll () { throw new RuntimeException(); }
  private  void createNativeFile (java.io.File inputDir, java.lang.String fileName, byte[] contents, boolean compress) { throw new RuntimeException(); }
}
