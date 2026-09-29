package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _merge {
    public static final int IconCompatParcelizer = 0;
    public static final _merge write = new _merge();

    private _merge() {
    }

    public final JsonIgnorePropertiesValue IconCompatParcelizer(long j, long j2, long j3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplBaseParcelizer = (i2 & 1) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplBaseParcelizer() : j;
        long jAudioAttributesCompatParcelizer$default = (i2 & 2) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j2;
        long jAudioAttributesCompatParcelizer$default2 = (i2 & 4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j3;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1370708026, i, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:161)");
        }
        boolean z = ((6 ^ (i & 14)) > 4 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesImplBaseParcelizer)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default2)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z | z2 | z3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new height(jAudioAttributesImplBaseParcelizer, jAudioAttributesCompatParcelizer$default, jAudioAttributesCompatParcelizer$default2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        height heightVar = (height) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return heightVar;
    }
}
