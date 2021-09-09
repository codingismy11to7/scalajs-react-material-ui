import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

  object Versions {
    val scalaCssV = "0.8.0-RC1"
    val scalaJsReactV = "2.0.0-RC3"
  }

  import Versions._

  //A -> Z
  val catsCore             = Def.setting("org.typelevel"                     %%% "cats-core"             % "2.6.1")
  val scalaCssCore         = Def.setting("com.github.japgolly.scalacss"      %%% "core"                  % scalaCssV)
  val scalaCssExtReact     = Def.setting("com.github.japgolly.scalacss"      %%% "ext-react"             % scalaCssV)
  val scalaCssExtScalatags = Def.setting("com.github.japgolly.scalacss"       %% "ext-scalatags"         % scalaCssV)
  val scalaJsDom           = Def.setting("org.scala-js"                      %%% "scalajs-dom"           % "1.1.0")
  val scalaJsReactCallback     = Def.setting("com.github.japgolly.scalajs-react" %%% "callback"                  % scalaJsReactV)
  val scalaJsReactCoreGeneric     = Def.setting("com.github.japgolly.scalajs-react" %%% "core-generic"                  % scalaJsReactV)
  val scalaJsReactCore     = Def.setting("com.github.japgolly.scalajs-react" %%% "core"                  % scalaJsReactV)
  val scalaJsReactDummyUtil     = Def.setting("com.github.japgolly.scalajs-react" %%% "util-dummy-defaults"                  % scalaJsReactV % Provided)
  val scalaJsReactExtra    = Def.setting("com.github.japgolly.scalajs-react" %%% "extra"                 % scalaJsReactV)
  val scalablyTypedRuntime = Def.setting("com.olvind"                        %%% "scalablytyped-runtime" % "2.4.2")
}
