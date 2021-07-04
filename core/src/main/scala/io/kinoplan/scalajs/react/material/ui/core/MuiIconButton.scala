package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiIconButton extends ReactBridgeComponent with MuiIconButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "IconButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    edge: js.UndefOr[Edge.Value | Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiIconButtonExtensions {
  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
  }

  object Size extends Enumeration {
    type Value = String

    val small = "small"
  }

  object Edge extends Enumeration {
    type Value = String

    val start = "start"
    val end = "end"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorInherit = "colorInherit"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val disabled = "disabled"
    val label = "label"
    val focusVisible = "focusVisible"
  }
}
