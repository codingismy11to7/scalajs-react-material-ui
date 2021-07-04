package io.kinoplan.demo.styles.demos.Accordion

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleAccordionStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%)
  )

  val heading = style(
    fontSize :=! theme.typography.pxToRem(15),
    fontWeight :=! theme.typography.fontWeightRegular.px
  )
}

object DefaultSimpleAccordionStyle extends SimpleAccordionStyle
