Revolver.settings

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.1"
)

initialCommands in console := "import scalaz._, Scalaz._"

scalacOptions ++= Seq("-unchecked", "deprecation")
