ThisBuild / semanticdbEnabled := true

ThisBuild / semanticdbVersion := "4.4.23"

ThisBuild / scalafixScalaBinaryVersion := "2.13" //CrossVersion.binaryScalaVersion(scalaVersion.value)

ThisBuild / scalafixDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %% "scalafix" % "2.0.0-RC2",
  "com.github.liancheng" %% "organize-imports" % "0.5.0"
)

ThisBuild / scalacOptions ++= {
  if (scalaVersion.value startsWith "2")
    "-Yrangepos" :: Nil
  else
    Nil
}
