package com.dbrsn.sjsrn.component

import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Slider {

  @js.native
  @JSImport("react-native", "Slider")
  object RawComponent extends js.Object

  @js.native
  trait Props extends View.Props {
    val minimumTrackTintColor: js.UndefOr[String] = js.undefined
    val minimumValue: js.UndefOr[Double] = js.undefined
    val onSlidingComplete: js.UndefOr[js.Function1[Double, _]] = js.undefined
    val maximumTrackTintColor: js.UndefOr[String] = js.undefined
    val thumbImage: js.UndefOr[Image.Source] = js.undefined
    val trackImage: js.UndefOr[Image.Source] = js.undefined
    val minimumTrackImage: js.UndefOr[Image.Source] = js.undefined
    val maximumTrackImage: js.UndefOr[Image.Source] = js.undefined
    val onValueChange: js.UndefOr[js.Function1[Double, Unit]] = js.undefined
    val value: js.UndefOr[Double] = js.undefined
    val step: js.UndefOr[Double] = js.undefined
    val disabled: js.UndefOr[Boolean] = js.undefined
    val maximumValue: js.UndefOr[Double] = js.undefined
  }

  object Props {
    @inline
    def apply(
      minimumTrackTintColor: js.UndefOr[String] = js.undefined,
      minimumValue: js.UndefOr[Double] = js.undefined,
      onSlidingComplete: js.UndefOr[js.Function1[Double, _]] = js.undefined,
      maximumTrackTintColor: js.UndefOr[String] = js.undefined,
      thumbImage: js.UndefOr[Image.Source] = js.undefined,
      trackImage: js.UndefOr[Image.Source] = js.undefined,
      minimumTrackImage: js.UndefOr[Image.Source] = js.undefined,
      maximumTrackImage: js.UndefOr[Image.Source] = js.undefined,
      onValueChange: js.UndefOr[js.Function1[Double, Unit]] = js.undefined,
      value: js.UndefOr[Double] = js.undefined,
      step: js.UndefOr[Double] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      maximumValue: js.UndefOr[Double] = js.undefined,
      onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
      onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
      onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
      onMoveShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
      onResponderGrant: js.UndefOr[js.Function] = js.undefined,
      onResponderReject: js.UndefOr[js.Function] = js.undefined,
      onResponderMove: js.UndefOr[js.Function] = js.undefined,
      onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined,
      onResponderTerminate: js.UndefOr[js.Function] = js.undefined,
      renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
      onResponderRelease: js.UndefOr[js.Function] = js.undefined,
      onMagicTap: js.UndefOr[js.Function] = js.undefined,
      collapsable: js.UndefOr[Boolean] = js.undefined,
      shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
      onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined,
      onAccessibilityTap: js.UndefOr[js.Function0[_]] = js.undefined,
      accessibilityLabel: js.UndefOr[String] = js.undefined,
      AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined,
      removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
      style: js.UndefOr[js.Any] = js.undefined,
      accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] = js.undefined,
      onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined,
      collapsible: js.UndefOr[Boolean] = js.undefined,
      accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
      needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
      testID: js.UndefOr[String] = js.undefined,
      pointerEvents: js.UndefOr[PointerEvents] = js.undefined,
      importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined,
      accessible: js.UndefOr[Boolean] = js.undefined
    ): Props = js.Dynamic.literal(
      minimumTrackTintColor = minimumTrackTintColor,
      minimumValue = minimumValue,
      onSlidingComplete = onSlidingComplete,
      maximumTrackTintColor = maximumTrackTintColor,
      thumbImage = thumbImage,
      trackImage = trackImage,
      minimumTrackImage = minimumTrackImage,
      maximumTrackImage = maximumTrackImage,
      onValueChange = onValueChange,
      value = value,
      step = step,
      disabled = disabled,
      maximumValue = maximumValue,
      onStartShouldSetResponder = onStartShouldSetResponder,
      onMoveShouldSetResponder = onMoveShouldSetResponder,
      onStartShouldSetResponderCapture = onStartShouldSetResponderCapture,
      onMoveShouldSetResponderCapture = onMoveShouldSetResponderCapture,
      onResponderGrant = onResponderGrant,
      onResponderReject = onResponderReject,
      onResponderMove = onResponderMove,
      onResponderTerminationRequest = onResponderTerminationRequest,
      onResponderTerminate = onResponderTerminate,
      renderToHardwareTextureAndroid = renderToHardwareTextureAndroid,
      onResponderRelease = onResponderRelease,
      onMagicTap = onMagicTap,
      collapsable = collapsable,
      shouldRasterizeIOS = shouldRasterizeIOS,
      onLayout = onLayout,
      onAccessibilityTap = onAccessibilityTap,
      accessibilityLabel = accessibilityLabel,
      AccessibilityComponentType = AccessibilityComponentType,
      removeClippedSubviews = removeClippedSubviews,
      style = style,
      accessibilityTraits = accessibilityTraits,
      onAcccessibilityTap = onAcccessibilityTap,
      collapsible = collapsible,
      accessibilityViewIsModal = accessibilityViewIsModal,
      needsOffscreenAlphaCompositing = needsOffscreenAlphaCompositing,
      testID = testID,
      pointerEvents = pointerEvents,
      importantForAccessibility = importantForAccessibility,
      accessible = accessible
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
