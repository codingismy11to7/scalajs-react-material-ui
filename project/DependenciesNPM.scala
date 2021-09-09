object DependenciesNPM {

  object Versions {
    val reactV = "17.0.2"
    val reactSwipeableViewsV = "0.14.0"
  }

  import Versions._

  //A -> Z
  val materialUiCore                = "@material-ui/core"                  -> "4.12.3"
  val materialUiIcons               = "@material-ui/icons"                 -> "4.11.2"
  val materialUiLab                 = "@material-ui/lab"                   -> "4.0.0-alpha.60"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> "17.0.20"
  val typesReactDom                 = "@types/react-dom"                   -> "17.0.9"
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.1"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.3"
}
