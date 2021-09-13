package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.util.Effect.Dispatch

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.html.ReactEventFromHtml

object MuiClickAwayListener extends ReactBridgeComponent with MuiClickAwayListenerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ClickAwayListener")
  @js.native
  object RawComponent extends js.Function

  def apply[F[_] : Dispatch](
    mouseEvent: js.UndefOr[Boolean | MouseEvent.Value] = js.undefined,
    onClickAway: js.UndefOr[ReactHandler1[F, ReactEventFromHtml]],
    touchEvent: js.UndefOr[Boolean | TouchEvent.Value] = js.undefined
  ): WithProps = auto
}

trait MuiClickAwayListenerExtensions {
  object MouseEvent extends Enumeration {
    type Value = String

    val onClick = "onClick"
    val onMouseDown = "onMouseDown"
    val onMouseUp = "onMouseUp"
  }

  object TouchEvent extends Enumeration {
    type Value = String

    val onTouchStart = "onTouchStart"
    val onTouchEnd = "onTouchEnd"
  }
}
