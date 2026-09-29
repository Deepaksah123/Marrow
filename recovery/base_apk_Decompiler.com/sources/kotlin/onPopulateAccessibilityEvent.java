package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\u0014\u0010\u000e\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "sizeOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "offsetOnMainAxis", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onPopulateAccessibilityEvent {
    public static final int RemoteActionCompatParcelizer(FragmentManagerState fragmentManagerState) {
        long jMediaBrowserCompatItemReceiver;
        if (fragmentManagerState.RemoteActionCompatParcelizer() == superDispatchKeyEvent.write) {
            long j = -1;
            jMediaBrowserCompatItemReceiver = fragmentManagerState.MediaBrowserCompatItemReceiver() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        } else {
            jMediaBrowserCompatItemReceiver = fragmentManagerState.MediaBrowserCompatItemReceiver() >> 32;
        }
        return (int) jMediaBrowserCompatItemReceiver;
    }

    public static final int IconCompatParcelizer(onResumeFragments onresumefragments, superDispatchKeyEvent superdispatchkeyevent) {
        long jAudioAttributesImplApi21Parcelizer;
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            long j = -1;
            jAudioAttributesImplApi21Parcelizer = onresumefragments.AudioAttributesImplApi21Parcelizer() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        } else {
            jAudioAttributesImplApi21Parcelizer = onresumefragments.AudioAttributesImplApi21Parcelizer() >> 32;
        }
        return (int) jAudioAttributesImplApi21Parcelizer;
    }

    public static final int AudioAttributesCompatParcelizer(onResumeFragments onresumefragments, superDispatchKeyEvent superdispatchkeyevent) {
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            return hasReferringProperties.AudioAttributesCompatParcelizer(onresumefragments.AudioAttributesCompatParcelizer());
        }
        return hasReferringProperties.IconCompatParcelizer(onresumefragments.AudioAttributesCompatParcelizer());
    }
}
