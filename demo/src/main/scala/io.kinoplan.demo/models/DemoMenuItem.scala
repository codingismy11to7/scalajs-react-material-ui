package io.kinoplan.demo.models

import io.kinoplan.demo.router.AppRouter.{DemoAppBarRoute, DemoAvatarsRoute, Page}

case class DemoMenuItem(
  idx: Int,
  label: String,
  location: Page
)

object DemoMenuItem {
  val demos = List(
    DemoMenuItem(1, "App Bar", DemoAppBarRoute),
    DemoMenuItem(2, "Avatars", DemoAvatarsRoute),
  )
}