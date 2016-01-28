package org.apache.spark.scheduler;
/**
 * Test whether ReplayListenerBus replays events from logs correctly.
 */
public  class ReplayListenerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   ReplayListenerSuite () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fileSystem () { throw new RuntimeException(); }
  private  java.io.File testDir () { throw new RuntimeException(); }
  /**
   * Test end-to-end replaying of events.
   * <p>
   * This test runs a few simple jobs with event logging enabled, and compares each emitted
   * event to the corresponding event replayed from the event logs. This test makes the
   * assumption that the event logging behavior is correct (tested in a separate suite).
   * @param codecName (undocumented)
   */
  private  void testApplicationReplay (scala.Option<java.lang.String> codecName) { throw new RuntimeException(); }
  /**
   * A simple listener that buffers all the events it receives.
   * <p>
   * The event buffering functionality must be implemented within EventLoggingListener itself.
   * This is because of the following race condition: the event may be mutated between being
   * processed by one listener and being processed by another. Thus, in order to establish
   * a fair comparison between the original events and the replayed events, both functionalities
   * must be implemented within one listener (i.e. the EventLoggingListener).
   * <p>
   * This child listener inherits only the event buffering functionality, but does not actually
   * log the events.
   */
  private  class EventMonster extends org.apache.spark.scheduler.EventLoggingListener {
    public   EventMonster (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
    public  void start () { throw new RuntimeException(); }
  }
}
