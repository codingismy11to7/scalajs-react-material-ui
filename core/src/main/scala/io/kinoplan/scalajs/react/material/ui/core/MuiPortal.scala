package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.util.Effect.Dispatch

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiPortal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Portal")
  @js.native
  object RawComponent extends js.Function

  def apply[F[_] : Dispatch](
    container: js.UndefOr[ComponentRefType] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[JsFun0[F]] = js.undefined
  ): WithProps = auto
}
