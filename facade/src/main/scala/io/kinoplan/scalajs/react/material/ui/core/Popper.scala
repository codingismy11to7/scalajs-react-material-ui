package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Popper extends ReactBridgeComponent with PopperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Popper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchorEl: Option[js.Object | js.Function] = None,
    container: Option[js.Object | js.Function] = None,
    disablePortal: Boolean = false,
    keepMounted: Option[Boolean] = None,
    modifiers: js.Object = js.Object(),
    open: Boolean,
    placement: Placement.Value = Placement.bottom,
    popperOptions: js.Object = js.Object(),
    transition: Boolean = false
  ): WithProps = auto
}

trait PopperExtensions {
  object Placement extends Enumeration {
    val bottomEnd = Value("bottom-end")
    val bottomStart = Value("bottom-start")
    val bottom = Value("bottom")
    val leftEnd = Value("left-end")
    val leftStart = Value("left-start")
    val left = Value("left")
    val rightEnd = Value("right-end")
    val rightStart = Value("right-start")
    val right = Value("right")
    val topEnd = Value("top-end")
    val topStart = Value("top-start")
    val top = Value("top")
  }
}