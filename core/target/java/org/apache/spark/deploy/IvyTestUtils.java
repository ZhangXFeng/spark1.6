package org.apache.spark.deploy;
// no position
  class IvyTestUtils {
  /**
   * Create the path for the jar and pom from the maven coordinate. Extension should be <code>jar</code>
   * or <code>pom</code>.
   * @param artifact (undocumented)
   * @param prefix (undocumented)
   * @param ext (undocumented)
   * @param useIvyLayout (undocumented)
   * @return (undocumented)
   */
  static   java.io.File pathFromCoordinate (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, java.io.File prefix, java.lang.String ext, boolean useIvyLayout) { throw new RuntimeException(); }
  /** Returns the artifact naming based on standard ivy or maven format. */
  static   java.lang.String artifactName (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, boolean useIvyLayout, java.lang.String ext) { throw new RuntimeException(); }
  /** Returns the directory for the given groupId based on standard ivy or maven format. */
  static private  java.lang.String getBaseGroupDirectory (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, boolean useIvyLayout) { throw new RuntimeException(); }
  /** Write the contents to a file to the supplied directory. */
  static   java.io.File writeFile (java.io.File dir, java.lang.String fileName, java.lang.String contents) { throw new RuntimeException(); }
  /** Create an example Python file. */
  static private  java.io.File createPythonFile (java.io.File dir) { throw new RuntimeException(); }
  /** Create an example R package that calls the given Java class. */
  static private  scala.collection.Seq<scala.Tuple2<java.lang.String, java.io.File>> createRFiles (java.io.File dir, java.lang.String className, java.lang.String packageName) { throw new RuntimeException(); }
  /** Create a simple testable Class. */
  static private  java.io.File createJavaClass (java.io.File dir, java.lang.String className, java.lang.String packageName) { throw new RuntimeException(); }
  static private  java.io.File createDescriptor (java.io.File tempPath, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate>> dependencies, boolean useIvyLayout) { throw new RuntimeException(); }
  /** Helper method to write artifact information in the pom. */
  static private  java.lang.String pomArtifactWriter (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, int tabCount) { throw new RuntimeException(); }
  /** Create a pom file for this artifact. */
  static private  java.io.File createPom (java.io.File dir, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate>> dependencies) { throw new RuntimeException(); }
  /** Helper method to write artifact information in the ivy.xml. */
  static private  java.lang.String ivyArtifactWriter (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact) { throw new RuntimeException(); }
  /** Create a pom file for this artifact. */
  static private  java.io.File createIvyDescriptor (java.io.File dir, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate>> dependencies) { throw new RuntimeException(); }
  /** Create the jar for the given maven coordinate, using the supplied files. */
  static   java.io.File packJar (java.io.File dir, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.collection.Seq<scala.Tuple2<java.lang.String, java.io.File>> files, boolean useIvyLayout, boolean withR, scala.Option<java.util.jar.Manifest> withManifest) { throw new RuntimeException(); }
  /**
   * Creates a jar and pom file, mocking a Maven repository. The root path can be supplied with
   * <code>tempDir</code>, dependencies can be created into the same repo, and python files can also be packed
   * inside the jar.
   * <p>
   * @param artifact The maven coordinate to generate the jar and pom for.
   * @param dependencies List of dependencies this artifact might have to also create jars and poms.
   * @param tempDir The root folder of the repository
   * @param useIvyLayout whether to mock the Ivy layout for local repository testing
   * @param withPython Whether to pack python files inside the jar for extensive testing.
   * @return Root path of the repository
   * @param withR (undocumented)
   */
  static private  java.io.File createLocalRepository (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate>> dependencies, scala.Option<java.io.File> tempDir, boolean useIvyLayout, boolean withPython, boolean withR) { throw new RuntimeException(); }
  /**
   * Creates a suite of jars and poms, with or without dependencies, mocking a maven repository.
   * @param artifact The main maven coordinate to generate the jar and pom for.
   * @param dependencies List of dependencies this artifact might have to also create jars and poms.
   * @param rootDir The root folder of the repository (like <code>~/.m2/repositories</code>)
   * @param useIvyLayout whether to mock the Ivy layout for local repository testing
   * @param withPython Whether to pack python files inside the jar for extensive testing.
   * @return Root path of the repository. Will be <code>rootDir</code> if supplied.
   * @param withR (undocumented)
   */
  static   java.io.File createLocalRepositoryForTests (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<java.lang.String> dependencies, scala.Option<java.io.File> rootDir, boolean useIvyLayout, boolean withPython, boolean withR) { throw new RuntimeException(); }
  /**
   * Creates a repository for a test, and cleans it up afterwards.
   * <p>
   * @param artifact The main maven coordinate to generate the jar and pom for.
   * @param dependencies List of dependencies this artifact might have to also create jars and poms.
   * @param rootDir The root folder of the repository (like <code>~/.m2/repositories</code>)
   * @param useIvyLayout whether to mock the Ivy layout for local repository testing
   * @param withPython Whether to pack python files inside the jar for extensive testing.
   * @return Root path of the repository. Will be <code>rootDir</code> if supplied.
   * @param withR (undocumented)
   * @param ivySettings (undocumented)
   * @param f (undocumented)
   */
  static   void withRepository (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<java.lang.String> dependencies, scala.Option<java.io.File> rootDir, boolean useIvyLayout, boolean withPython, boolean withR, org.apache.ivy.core.settings.IvySettings ivySettings, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /** Deletes the test packages from the ivy cache */
  static private  void purgeLocalIvyCache (org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate artifact, scala.Option<scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate>> dependencies, org.apache.ivy.core.settings.IvySettings ivySettings) { throw new RuntimeException(); }
}
