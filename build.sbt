name := """introsbt"""

version := "1.0"

scalaVersion := "2.11.5"

// Akka
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.6",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test")

// Test
libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.1.6" % "test")

// Rapture
//libraryDependencies ++= Seq(
//  "com.propensive" %% "rapture-core" % "1.1.0",
//  "com.propensive" %% "rapture-io" % "0.10.0",
//  "com.propensive" %% "rapture-net" % "0.10.0",
//  "com.propensive" %% "rapture-json" % "1.1.0"
//)

// Argonaut (JSON)
libraryDependencies ++= Seq("io.argonaut" %% "argonaut" % "6.0.4")

// ScalikeJDBC
libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"       % "2.2.2",
  "com.h2database"  %  "h2"                % "1.4.184",
  "ch.qos.logback"  %  "logback-classic"   % "1.1.2"
)

// Joda Time
libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.7",
  "org.joda" % "joda-convert" % "1.2"
)
