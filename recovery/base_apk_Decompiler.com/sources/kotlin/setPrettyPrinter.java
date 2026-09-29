package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.getSystemGestureInsets;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\"\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"createRippleModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "createRippleModifierNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "rememberRipple", "Landroidx/compose/foundation/Indication;", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "material-ripple"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPrettyPrinter {
    private static final safeSizeOf<Float> RemoteActionCompatParcelizer = new safeSizeOf<>(15, 0, setShowText.read(), 2, null);

    public static final Module write(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs<setCurrentValue> getcreatedondatems) {
        return setSchema.write(insetVar, z, f, minimalPrettyPrinter, getcreatedondatems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setOrientation<Float> IconCompatParcelizer(isRound isround) {
        if (isround instanceof isVisible.read) {
            return RemoteActionCompatParcelizer;
        }
        if (!(isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) && !(isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer)) {
            return RemoteActionCompatParcelizer;
        }
        return new safeSizeOf(45, 0, setShowText.read(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setOrientation<Float> AudioAttributesCompatParcelizer(isRound isround) {
        if (!(isround instanceof isVisible.read) && !(isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer)) {
            return isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer ? new safeSizeOf(150, 0, setShowText.read(), 2, null) : RemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer;
    }
}
