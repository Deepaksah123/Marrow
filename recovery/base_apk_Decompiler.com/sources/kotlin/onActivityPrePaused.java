package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "prefetchStrategy", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "cacheWindow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "EmptyLazyGridLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onActivityPrePaused {
    private static final destroyInternalPathIterator IconCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(int i) {
        return -1;
    }

    public static final onActivityPostCreated IconCompatParcelizer(final int i, final int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        Object[] objArr = new Object[0];
        parseManyDecDigits<onActivityPostCreated, ?> parsemanydecdigitsRemoteActionCompatParcelizer = onActivityPostCreated.INSTANCE.RemoteActionCompatParcelizer();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getCreatedOnDateMs() { // from class: o.onActivityResumed
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return onActivityPrePaused.IconCompatParcelizer(i, i2);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        onActivityPostCreated onactivitypostcreated = (onActivityPostCreated) addTimesI.read(objArr, parsemanydecdigitsRemoteActionCompatParcelizer, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return onactivitypostcreated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onActivityPostCreated IconCompatParcelizer(int i, int i2) {
        return new onActivityPostCreated(i, i2);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/onActivityPrePaused$read;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "read", "I", "onFastForward", "()I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "onAddQueueItem", "", "Lo/weirdNumberException;", "write", "Ljava/util/Map;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements withHandlersFrom {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final Map<weirdNumberException, Integer> IconCompatParcelizer = VideoTimelineResponseBody.read();

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
        }

        read() {
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getWrite() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    static {
        read readVar = new read();
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        superDispatchKeyEvent superdispatchkeyevent = superDispatchKeyEvent.write;
        read readVar2 = readVar;
        IconCompatParcelizer = new destroyInternalPathIterator(null, 0, false, BitmapDescriptorFactory.HUE_RED, readVar2, BitmapDescriptorFactory.HUE_RED, false, College.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer), bufferAnyProperty.IconCompatParcelizer$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null), 0, new getAnswerMap() { // from class: o.dispatchOnCancelled
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onActivityPrePaused.read(((Integer) obj).intValue());
            }
        }, new getAnswerMap() { // from class: o.dispatchOnLoadComplete
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(onActivityPrePaused.RemoteActionCompatParcelizer(((Integer) obj).intValue()));
            }
        }, listRemoteActionCompatParcelizer, 0, 0, 0, false, superdispatchkeyevent, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List read(int i) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}
