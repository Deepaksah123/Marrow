package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setBytes {
    public static final setBytes RemoteActionCompatParcelizer = new setBytes();
    public static final int write = 0;

    private setBytes() {
    }

    public final setOnAnimationStart AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, long j5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplBaseParcelizer = (i2 & 1) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplBaseParcelizer() : j;
        long jAudioAttributesCompatParcelizer$default = (i2 & 2) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j2;
        long jMediaBrowserCompatSearchResultReceiver = (i2 & 4) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver() : j3;
        long jAudioAttributesCompatParcelizer$default2 = (i2 & 8) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j4;
        long jAudioAttributesCompatParcelizer$default3 = (i2 & 16) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesImplBaseParcelizer, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j5;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesImplBaseParcelizer)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jMediaBrowserCompatSearchResultReceiver)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        long j6 = jAudioAttributesCompatParcelizer$default;
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default2)) || (i & 3072) == 2048;
        boolean z5 = (((57344 & i) ^ CpioConstants.C_ISBLK) > 16384 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default3)) || (i & CpioConstants.C_ISBLK) == 16384;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z5 | z | z2 | z3 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            long j7 = jAudioAttributesCompatParcelizer$default3;
            long j8 = jAudioAttributesCompatParcelizer$default2;
            BuildConfig buildConfig = new BuildConfig(jMediaBrowserCompatSearchResultReceiver, switchToNext.AudioAttributesCompatParcelizer$default(jMediaBrowserCompatSearchResultReceiver, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), jAudioAttributesImplBaseParcelizer, switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j8, switchToNext.AudioAttributesCompatParcelizer$default(j8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j7, jAudioAttributesImplBaseParcelizer, j6, j8, j7, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(buildConfig);
            objOnPause = buildConfig;
        }
        BuildConfig buildConfig2 = (BuildConfig) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return buildConfig2;
    }
}
