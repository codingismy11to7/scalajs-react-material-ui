package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.AppBar.{DefaultSimpleAppBarStyle, SimpleAppBarStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleAppBar extends ScalaCssReactImplicits {
  case class Props(style: SimpleAppBarStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple App Bar")(
          div(css.root,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(edge = MuiIconButton.Edge.start, color = MuiIconButton.Color.inherit)(css.menuButton,
                  aria.label := "menu",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6)(css.title,
                  "News"
                ),
                MuiButton(color = MuiButton.Color.inherit)("Login")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .renderBackend[Backend]
    .build

  def apply(style: SimpleAppBarStyle = DefaultSimpleAppBarStyle) = component(Props(style))
}
