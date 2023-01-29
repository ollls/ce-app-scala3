ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.2.1"

Runtime / unmanagedClasspath += baseDirectory.value / "src" / "main" / "resources"

lazy val root = (project in file(".")).settings(
  name := "json-template-qh2",
  libraryDependencies ++= Seq(
     //"io.github.ollls" %% "quartz-h2" % "0.2.1.1",
     //"com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core"   % "2.19.1",
     //"com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.19.1" % "compile-internal"
    "org.typelevel" %% "cats-effect" % "3.4.5",
    "org.typelevel" %% "log4cats-slf4j" % "2.4.0", // Direct Slf4j Support - Recommended
     // "co.fs2" %% "fs2-core" % "3.4.0",
     //"co.fs2" %% "fs2-io" % "3.4.0",
     "ch.qos.logback" % "logback-classic" % "1.3.5",
     "org.slf4j" % "slf4j-api" % "2.0.4"
  )
)
