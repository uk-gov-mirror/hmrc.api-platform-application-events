import sbt._

object LibraryDependencies {

  lazy val applicationDomainVersion = "0.90.0"

  def apply() = compileDependencies ++ testDependencies

  lazy val compileDependencies = Seq(
    "uk.gov.hmrc"       %% "api-platform-application-domain" % applicationDomainVersion
  )

  lazy val testDependencies = Seq(
    "com.vladsch.flexmark"  % "flexmark-all"                             % "0.62.2",
    "org.mockito"          %% "mockito-scala-scalatest"                  % "2.0.0",
    "uk.gov.hmrc"          %% "api-platform-application-domain-fixtures" % applicationDomainVersion
  ).map(_ % "test")
}
