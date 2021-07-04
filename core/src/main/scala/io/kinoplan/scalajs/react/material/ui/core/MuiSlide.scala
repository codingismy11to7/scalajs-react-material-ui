package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.TransitionTimeout

object MuiSlide extends ReactBridgeComponent with MuiSlideExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Slide")
  @js.native
  object RawComponent extends js.Function

  def apply(
             direction: js.UndefOr[Direction.Value] = js.undefined,
             in: js.UndefOr[Boolean] = js.undefined,
             mountOnEnter: js.UndefOr[Boolean] = js.undefined,
             unmountOnExit: js.UndefOr[Boolean] = js.undefined,
             appear: js.UndefOr[Boolean] = js.undefined,
             enter: js.UndefOr[Boolean] = js.undefined,
             exit: js.UndefOr[Boolean] = js.undefined,
             timeout: js.UndefOr[Int | TransitionTimeout] = js.undefined,
             onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
             onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
             onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
             onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
             onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
             onExited: js.UndefOr[Handler1[html.Element]] = js.undefined
  ): WithProps = auto
}

trait MuiSlideExtensions {
  object Direction extends Enumeration {
    type Value = String

    val down = "down"
    val left = "left"
    val right = "right"
    val up = "up"
  }
}
