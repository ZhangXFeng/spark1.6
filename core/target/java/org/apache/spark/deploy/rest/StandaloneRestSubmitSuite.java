package org.apache.spark.deploy.rest;
/**
 * Tests for the REST application submission protocol used in standalone cluster mode.
 */
public  class StandaloneRestSubmitSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  public   StandaloneRestSubmitSuite () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.rpc.RpcEnv> rpcEnv () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.rest.RestSubmissionServer> server () { throw new RuntimeException(); }
  public  void afterEach () { throw new RuntimeException(); }
  /** Start a dummy server that responds to requests using the specified parameters. */
  private  java.lang.String startDummyServer (java.lang.String submitId, java.lang.String submitMessage, java.lang.String killMessage, scala.Enumeration.Value state, scala.Option<java.lang.Exception> exception) { throw new RuntimeException(); }
  /** Start a smarter dummy server that keeps track of submitted driver states. */
  private  java.lang.String startSmartServer () { throw new RuntimeException(); }
  /** Start a dummy server that is faulty in many ways... */
  private  java.lang.String startFaultyServer () { throw new RuntimeException(); }
  /**
   * Start a {@link StandaloneRestServer} that communicates with the given endpoint.
   * If <code>faulty</code> is true, start an {@link FaultyStandaloneRestServer} instead.
   * Return the master URL that corresponds to the address of this server.
   * @param makeFakeMaster (undocumented)
   * @param faulty (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String startServer (scala.Function1<org.apache.spark.rpc.RpcEnv, org.apache.spark.rpc.RpcEndpoint> makeFakeMaster, boolean faulty) { throw new RuntimeException(); }
  /** Create a submit request with real parameters using Spark submit. */
  private  org.apache.spark.deploy.rest.CreateSubmissionRequest constructSubmitRequest (java.lang.String masterUrl, java.lang.String[] appArgs) { throw new RuntimeException(); }
  /** Return the response as a submit response, or fail with error otherwise. */
  private  org.apache.spark.deploy.rest.CreateSubmissionResponse getSubmitResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse response) { throw new RuntimeException(); }
  /** Return the response as a kill response, or fail with error otherwise. */
  private  org.apache.spark.deploy.rest.KillSubmissionResponse getKillResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse response) { throw new RuntimeException(); }
  /** Return the response as a status response, or fail with error otherwise. */
  private  org.apache.spark.deploy.rest.SubmissionStatusResponse getStatusResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse response) { throw new RuntimeException(); }
  /** Return the response as an error response, or fail if the response was not an error. */
  private  org.apache.spark.deploy.rest.ErrorResponse getErrorResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse response) { throw new RuntimeException(); }
  /**
   * Send an HTTP request to the given URL using the method and the body specified.
   * Return the connection object.
   * @param url (undocumented)
   * @param method (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  private  java.net.HttpURLConnection sendHttpRequest (java.lang.String url, java.lang.String method, java.lang.String body) { throw new RuntimeException(); }
  /**
   * Send an HTTP request to the given URL using the method and the body specified.
   * Return a 2-tuple of the response message from the server and the response code.
   * @param url (undocumented)
   * @param method (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.deploy.rest.SubmitRestProtocolResponse, java.lang.Object> sendHttpRequestWithResponse (java.lang.String url, java.lang.String method, java.lang.String body) { throw new RuntimeException(); }
}
