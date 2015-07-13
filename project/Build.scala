import sbt._
import sbt.Keys._

object ScalazexamplesBuild extends Build {

  lazy val scalazexamples = Project(
    id = "scalaz-examples",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scalaz-examples",
      organization := "steshaw",
      version := "0.1.0",
      scalaVersion := "2.11.7"
    )
  )
}
