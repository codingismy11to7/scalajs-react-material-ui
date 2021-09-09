package io.kinoplan.scalajs.react.material.ui

import scala.scalajs.js
import scala.scalajs.js.|

import japgolly.scalajs.react.facade.SyntheticEvent
import japgolly.scalajs.react.util.DefaultEffects.{Sync => DS}

package object lab {
  type Handler1[A]                              = A => DS[Unit]
  type Handler2[A, B]                           = (A, B) => DS[Unit]
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type ComponentPropType                        = String | js.Function
  type ComponentRefType                         = js.Function | js.Object
}
