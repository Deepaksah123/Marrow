package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getInsetsIgnoringVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000k\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\b\u001a(\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u0001H\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\r*\u00020\u0001H\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0082\b\u001a\u0014\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010$\u001a\u00020\"*\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001aO\u0010%\u001a\u00020\r*\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*2\u001d\u0010+\u001a\u0019\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0,¢\u0006\u0002\b.H\u0082@¢\u0006\u0002\u0010/\"\u0016\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"rememberPagerState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "", "initialPageOffsetFraction", "", "pageCount", "Lkotlin/Function0;", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "PagerState", "currentPage", "currentPageOffsetFraction", "animateToNextPage", "", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", "F", "MaxPagesForAnimateScroll", "PagesToPrefetch", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "debugLog", "generateMsg", "", "calculateNewMaxScrollOffset", "", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "calculateNewMinScrollOffset", "animateScrollToPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "targetPage", "targetPageOffsetToSnappedPosition", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "updateTargetPage", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GeobFrame {
    private static final removeEventListener AudioAttributesCompatParcelizer;
    private static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private static final float write = assignParameter.IconCompatParcelizer(56.0f);

    public static final ApicFrame AudioAttributesCompatParcelizer(final int i, final float f, final getCreatedOnDateMs<Integer> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        Object[] objArr = new Object[0];
        parseManyDecDigits<setVideoEffects, ?> parsemanydecdigits = setVideoEffects.INSTANCE.read();
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) || (i2 & 6) == 4;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f)) || (i2 & 48) == 32;
        if ((((i2 & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) <= 256 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems)) && (i2 & RendererCapabilities.MODE_SUPPORT_MASK) != 256) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z3 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getCreatedOnDateMs() { // from class: o.MlltFrame
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return GeobFrame.IconCompatParcelizer(i, f, getcreatedondatems);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setVideoEffects setvideoeffects = (setVideoEffects) addTimesI.read(objArr, parsemanydecdigits, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0);
        setvideoeffects.IconCompatParcelizer().write(getcreatedondatems);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setvideoeffects;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setVideoEffects IconCompatParcelizer(int i, float f, getCreatedOnDateMs getcreatedondatems) {
        return new setVideoEffects(i, f, getcreatedondatems);
    }

    public static final Object read(ApicFrame apicFrame, SampleVideos<? super getShowPopup> sampleVideos) {
        if (apicFrame.AudioAttributesImplApi21Parcelizer() + 1 >= apicFrame.write()) {
            return getShowPopup.INSTANCE;
        }
        Object objIconCompatParcelizer$default = ApicFrame.IconCompatParcelizer$default(apicFrame, apicFrame.AudioAttributesImplApi21Parcelizer() + 1, BitmapDescriptorFactory.HUE_RED, null, sampleVideos, 6, null);
        return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public static final Object write(ApicFrame apicFrame, SampleVideos<? super getShowPopup> sampleVideos) {
        if (apicFrame.AudioAttributesImplApi21Parcelizer() - 1 < 0) {
            return getShowPopup.INSTANCE;
        }
        Object objIconCompatParcelizer$default = ApicFrame.IconCompatParcelizer$default(apicFrame, apicFrame.AudioAttributesImplApi21Parcelizer() - 1, BitmapDescriptorFactory.HUE_RED, null, sampleVideos, 6, null);
        return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public static final float IconCompatParcelizer() {
        return write;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Lo/GeobFrame$AudioAttributesCompatParcelizer;", "Lo/bufferMapProperty;", "", "read", "F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements bufferMapProperty {
        private final float read = 1.0f;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final float IconCompatParcelizer = 1.0f;

        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final float getRead() {
            return this.read;
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final float getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final removeEventListener read() {
        return AudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/GeobFrame$read;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "read", "I", "onFastForward", "()I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "onAddQueueItem", "", "Lo/weirdNumberException;", "RemoteActionCompatParcelizer", "Ljava/util/Map;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements withHandlersFrom {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Map<weirdNumberException, Integer> write = VideoTimelineResponseBody.read();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
        }

        read() {
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getWrite() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.write;
        }
    }

    public static final long RemoteActionCompatParcelizer(addDrmEventListener adddrmeventlistener, int i) {
        long j;
        long jMediaMetadataCompat;
        long j2 = i;
        long remoteActionCompatParcelizer = adddrmeventlistener.getRemoteActionCompatParcelizer() + adddrmeventlistener.getAudioAttributesCompatParcelizer();
        long j3 = adddrmeventlistener.read();
        long read2 = adddrmeventlistener.getRead();
        long remoteActionCompatParcelizer2 = adddrmeventlistener.getRemoteActionCompatParcelizer();
        if (adddrmeventlistener.getIconCompatParcelizer() == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            jMediaMetadataCompat = adddrmeventlistener.MediaMetadataCompat() >> 32;
            j = remoteActionCompatParcelizer2;
        } else {
            j = remoteActionCompatParcelizer2;
            long j4 = -1;
            jMediaMetadataCompat = adddrmeventlistener.MediaMetadataCompat() & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
        }
        int i2 = (int) jMediaMetadataCompat;
        return getQues.write(((((j2 * remoteActionCompatParcelizer) + j3) + read2) - j) - ((long) (i2 - getQues.write(adddrmeventlistener.getRatingCompat().write(i2, adddrmeventlistener.getAudioAttributesCompatParcelizer(), adddrmeventlistener.read(), adddrmeventlistener.getRead(), i - 1, i), 0, i2))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(removeEventListener removeeventlistener, int i) {
        long jMediaMetadataCompat;
        if (removeeventlistener.getIconCompatParcelizer() == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            jMediaMetadataCompat = removeeventlistener.MediaMetadataCompat() >> 32;
        } else {
            long j = -1;
            jMediaMetadataCompat = removeeventlistener.MediaMetadataCompat() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        }
        int i2 = (int) jMediaMetadataCompat;
        return getQues.write(removeeventlistener.getRatingCompat().write(i2, removeeventlistener.getAudioAttributesCompatParcelizer(), removeeventlistener.read(), removeeventlistener.getRead(), 0, i), 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(final getAudioSessionId getaudiosessionid, int i, float f, setOrientation<Float> setorientation, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        int iRemoteActionCompatParcelizer;
        magicModuleSubmissionRequestBody.invoke(getaudiosessionid, QBankStatsResponse.RemoteActionCompatParcelizer(i));
        boolean z = i > getaudiosessionid.write();
        int iIconCompatParcelizer = (getaudiosessionid.IconCompatParcelizer() - getaudiosessionid.write()) + 1;
        if (((z && i > getaudiosessionid.IconCompatParcelizer()) || (!z && i < getaudiosessionid.write())) && Math.abs(i - getaudiosessionid.write()) >= 3) {
            if (z) {
                iRemoteActionCompatParcelizer = getQues.write(i - iIconCompatParcelizer, getaudiosessionid.write());
            } else {
                iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(iIconCompatParcelizer + i, getaudiosessionid.write());
            }
            getaudiosessionid.write(iRemoteActionCompatParcelizer, 0);
        }
        float f2 = getAudioSessionId.read$default(getaudiosessionid, i, 0, 2, null);
        final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
        Object objAudioAttributesCompatParcelizer$default = setTitleMarginStart.AudioAttributesCompatParcelizer$default(BitmapDescriptorFactory.HUE_RED, f2 + f, BitmapDescriptorFactory.HUE_RED, setorientation, new MagicModuleSubmissionRequestBody() { // from class: o.Id3Frame
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GeobFrame.IconCompatParcelizer(remoteActionCompatParcelizer, getaudiosessionid, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, sampleVideos, 4, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getAudioSessionId getaudiosessionid, float f, float f2) {
        remoteActionCompatParcelizer.read += getaudiosessionid.IconCompatParcelizer(f - remoteActionCompatParcelizer.read);
        return getShowPopup.INSTANCE;
    }

    static {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer = new removeEventListener(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 0, 0, 0, superDispatchKeyEvent.AudioAttributesCompatParcelizer, 0, 0, false, 0, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, getInsetsIgnoringVisibility.write.INSTANCE, new read(), false, null, null, College.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer), audioAttributesCompatParcelizer, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), 393216, null);
    }
}
