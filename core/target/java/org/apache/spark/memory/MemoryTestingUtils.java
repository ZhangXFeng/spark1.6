package org.apache.spark.memory;
// no position
/**
 * Helper methods for mocking out memory-management-related classes in tests.
 */
public  class MemoryTestingUtils {
  static public  org.apache.spark.TaskContext fakeTaskContext (org.apache.spark.SparkEnv env) { throw new RuntimeException(); }
}
