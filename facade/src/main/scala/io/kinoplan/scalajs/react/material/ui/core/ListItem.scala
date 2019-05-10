package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ListItem extends ReactBridgeComponent with ListItemExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alignItems: AlignItems.Value = AlignItems.center,
    button: Boolean = false,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = None,
    ContainerComponent: Option[String | js.Function] = Some("li"),
    ContainerProps: js.Object = js.Object(),
    dense: Boolean = false,
    disabled: Boolean = false,
    disableGutters: Boolean = false,
    divider: Boolean = false,
    selected: Boolean = false
  ): WithProps = auto
}

trait ListItemExtensions {
  object AlignItems extends Enumeration {
    val flexStart = Value("flex-start")
    val center = Value("center")
  }

  object Underline extends Enumeration {
    val none = Value("none")
    val hover = Value("hover")
    val always = Value("always")
  }
}