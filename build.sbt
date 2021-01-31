name := "sbt_unit_integration_test"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++=Seq("org.scalatest" %% "scalatest" % "3.0.8" % Test,
                      "org.mockito" %% "mockito-scala" % "1.5.12" % Test)



