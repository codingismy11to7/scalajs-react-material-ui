package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultImageAvatarsStyle, ImageAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar

object ImageAvatars extends ScalaCssReactImplicits {
  case class Props(style: ImageAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Image avatars")(
          div(css.root,
            MuiAvatar()(css.avatar, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg"),
            MuiAvatar()(css.avatar, alt := "Travis Howard", src := "/static/images/avatar/2.jpg"),
            MuiAvatar()(css.avatar, alt := "Cindy Baker", src := "/static/images/avatar/3.jpg")
          )
        )
      )
    }
    .build

  def apply(style: ImageAvatarsStyle = DefaultImageAvatarsStyle) = component(Props(style))
}
