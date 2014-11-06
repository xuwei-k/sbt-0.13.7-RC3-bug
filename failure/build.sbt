val commonSettings = Seq(
  scalaVersion := "2.11.4",
  updateOptions := updateOptions.value.withCachedResolution(true)
)

lazy val a = project.settings(commonSettings: _*).settings(
  libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"
)

lazy val b = project.settings(commonSettings: _*).dependsOn(
  a,
  a % "test->test"
)

