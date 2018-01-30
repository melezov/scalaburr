scalaVersion := "2.12.4"

val pieces = project settings(
  libraryDependencies += "com.propensive" %% "contextual" % "1.0.1"
)

val solver = project dependsOn pieces
