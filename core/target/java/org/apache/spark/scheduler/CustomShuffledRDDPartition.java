package org.apache.spark.scheduler;
  class CustomShuffledRDDPartition implements org.apache.spark.Partition {
  public  int index () { throw new RuntimeException(); }
  public  int startIndexInParent () { throw new RuntimeException(); }
  public  int endIndexInParent () { throw new RuntimeException(); }
  // not preceding
  public   CustomShuffledRDDPartition (int index, int startIndexInParent, int endIndexInParent) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
}
