resolvers += Resolver.bintrayIvyRepo("manuzhang", "sbt-plugins")

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("io.gearpump.sbt" % "sbt-assembly" % "0.14.5"
  exclude("org.apache.maven", "maven-plugin-api"))

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.11")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
