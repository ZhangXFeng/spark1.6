package other.supplier;
public  class CustomLeaderElectionAgent implements org.apache.spark.deploy.master.LeaderElectionAgent {
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance () { throw new RuntimeException(); }
  // not preceding
  public   CustomLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable masterInstance) { throw new RuntimeException(); }
}
