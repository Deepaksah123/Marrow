package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.setSwitchPadding;
import o.setSwitchPadding.AudioAttributesCompatParcelizer;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001ac\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\u000b\u001a\u0002H\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001aY\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\u000b\u001a\u0002H\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000fH\u0007¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateValue", "Landroidx/compose/runtime/State;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "initialValue", "targetValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setThumbDrawable {
    public static final setSwitchPadding AudioAttributesCompatParcelizer(String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new setSwitchPadding(str);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setSwitchPadding setswitchpadding = (setSwitchPadding) objOnPause;
        setswitchpadding.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setswitchpadding;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements _wrapError {
        final /* synthetic */ setSwitchPadding AudioAttributesCompatParcelizer;
        final /* synthetic */ setSwitchPadding.AudioAttributesCompatParcelizer write;

        public read(setSwitchPadding setswitchpadding, setSwitchPadding.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = setswitchpadding;
            this.write = audioAttributesCompatParcelizer;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write);
        }
    }

    public static final <T, V extends ScrollingTabContainerView> parseDouble<T> AudioAttributesCompatParcelizer(final setSwitchPadding setswitchpadding, final T t, final T t2, evictionCount<T, V> evictioncount, final setSplitTrack<T> setsplittrack, String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = setswitchpadding.new AudioAttributesCompatParcelizer(t, t2, evictioncount, setsplittrack, str2);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        final setSwitchPadding.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (setSwitchPadding.AudioAttributesCompatParcelizer) objOnPause;
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(t)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(t2)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        if ((((57344 & i) ^ CpioConstants.C_ISBLK) <= 16384 || !_handleunrecognizedcharacterescape.IconCompatParcelizer(setsplittrack)) && (i & CpioConstants.C_ISBLK) != 16384) {
            z = false;
        }
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z3 | z) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new getCreatedOnDateMs() { // from class: o.setTextOn
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setThumbDrawable.IconCompatParcelizer(t, audioAttributesCompatParcelizer, t2, setsplittrack);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.write((getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescape, 0);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setswitchpadding);
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if (zIconCompatParcelizer || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new getAnswerMap() { // from class: o.setThumbTintMode
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setThumbDrawable.AudioAttributesCompatParcelizer(setswitchpadding, audioAttributesCompatParcelizer, (StreamConstraintsException) obj);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        StreamReadException.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescape, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return audioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Object obj, setSwitchPadding.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Object obj2, setSplitTrack setsplittrack) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer())) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(obj, obj2, setsplittrack);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError AudioAttributesCompatParcelizer(setSwitchPadding setswitchpadding, setSwitchPadding.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, StreamConstraintsException streamConstraintsException) {
        setswitchpadding.AudioAttributesCompatParcelizer((setSwitchPadding.AudioAttributesCompatParcelizer<?, ?>) audioAttributesCompatParcelizer);
        return new read(setswitchpadding, audioAttributesCompatParcelizer);
    }

    public static final parseDouble<Float> IconCompatParcelizer(setSwitchPadding setswitchpadding, float f, float f2, setSplitTrack<Float> setsplittrack, String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i3 = i << 3;
        parseDouble<Float> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setswitchpadding, Float.valueOf(f), Float.valueOf(f2), hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE), setsplittrack, str2, _handleunrecognizedcharacterescape, (i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (57344 & i3) | (i3 & 458752), 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }
}
