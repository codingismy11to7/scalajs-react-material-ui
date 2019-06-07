package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.Avatar.{IconAvatars, ImageAvatars, LetterAvatars}
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core.styles.{MuiThemeProvider, ThemeOptions, TypographyOptions, createMuiTheme}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object AvatarsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val theme = createMuiTheme(options = ThemeOptions(typography = Some(TypographyOptions(useNextVariants = Some(true)))))

      div(
        MuiThemeProvider(theme = theme)(
          ImageAvatars(),
          LetterAvatars(),
          IconAvatars()
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("AvatarsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}