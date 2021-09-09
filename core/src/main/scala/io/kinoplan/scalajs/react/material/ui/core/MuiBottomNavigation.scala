package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.html.ReactEvent

object MuiBottomNavigation extends ReactBridgeComponent with MuiBottomNavigationExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "BottomNavigation")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    onChange: js.UndefOr[ReactHandler2[ReactEvent, js.Any]] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiBottomNavigationExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }
}
