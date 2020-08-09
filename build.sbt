name := "time-usage"

scalaVersion := "2.11.8"

//scalacOptions ++= Seq("-deprecation")

libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.0"// used for base64 encoding
libraryDependencies += "commons-codec" % "commons-codec" % "1.10"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.4"

// include the common dir
//commonSourcePackages += "common"


