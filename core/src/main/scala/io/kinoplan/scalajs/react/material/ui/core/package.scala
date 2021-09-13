package io.kinoplan.scalajs.react.material.ui

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEventTypes
import japgolly.scalajs.react.facade.SyntheticEvent
import org.scalajs.dom.raw.HTMLElement

package object core {
  type JsFun0[F[_]]                                   = js.Function0[F[Unit]]
  type OptJsFun1[A]                             = js.Function1[A, Unit]
  type OptJsFun2[A, B]                          = js.Function2[A, B, Unit]
  type OnJSEv1[E <: SyntheticEvent[_]]          = OptJsFun1[E]
  type OnJSEv2[E <: SyntheticEvent[_], A]       = OptJsFun2[E, A]
  type Handler1[F[_], A]                              = A => F[Unit]
  type Handler2[F[_], A, B]                           = (A, B) => F[Unit]
  type Handler3[F[_], A, B, C]                        = (A, B, C) => F[Unit]
  type ReactHandler1[F[_], E <: SyntheticEvent[_]]    = Handler1[F, E]
  type ReactHandler2[F[_], E <: SyntheticEvent[_], A] = Handler2[F, E, A]
  type CssProperties                            = js.Any
  type ComponentPropType                        = String | js.Function
  type ComponentRefType                         = js.Function | js.Object
  type ComponentContainerType                   = js.Function | js.Object
}

@js.native
@JSGlobal
abstract class HTMLMultipleSelectElement extends HTMLElement {
  var value: js.Array[String] = js.native
}

@js.native
@JSGlobal
abstract class HTMLNumberInputElement extends HTMLElement {
  var value: Int = js.native
}

object html extends ReactEventTypes {
  type MultipleSelect = HTMLMultipleSelectElement
  type NumberInput = HTMLNumberInputElement

  final type ReactEventFromMultipleSelect = ReactEventFrom[MultipleSelect]
  final type ReactEventFromNumberInput = ReactEventFrom[NumberInput]
}
