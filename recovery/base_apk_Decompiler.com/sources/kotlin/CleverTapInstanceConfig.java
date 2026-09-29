package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010+R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010.\u001a\u00020/X\u0086T¢\u0006\u0002\n\u0000R\u0013\u00100\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b1\u0010\u000eR\u0011\u00102\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105R\u0010\u00106\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u00107\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000b¨\u00069"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "buttonColors", "Landroidx/compose/material/ButtonColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CleverTapInstanceConfig {
    private static final float AudioAttributesCompatParcelizer;
    private static final float AudioAttributesImplApi21Parcelizer;
    private static final float AudioAttributesImplApi26Parcelizer;
    private static final float AudioAttributesImplBaseParcelizer;
    public static final int IconCompatParcelizer = 0;
    private static final float MediaBrowserCompatCustomActionResultReceiver;
    private static final float MediaBrowserCompatItemReceiver;
    private static final getReturnTransition MediaBrowserCompatMediaItem;
    private static final float RatingCompat;
    private static final float RemoteActionCompatParcelizer;
    private static final getReturnTransition read;
    public static final CleverTapInstanceConfig write = new CleverTapInstanceConfig();

    private CleverTapInstanceConfig() {
    }

    public final getReturnTransition AudioAttributesCompatParcelizer() {
        return read;
    }

    public final float IconCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public final float read() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public final HorizontalSquareImageView AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplApi26Parcelizer = (i2 & 1) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer() : j;
        long j5 = (i2 & 2) != 0 ? setJavaScriptInterface.read(jAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, i & 14) : j2;
        long jRemoteActionCompatParcelizer = (i2 & 4) != 0 ? RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver()) : j3;
        long jAudioAttributesCompatParcelizer$default = (i2 & 8) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j4;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:412)");
        }
        Rattr rattr = new Rattr(jAudioAttributesImplApi26Parcelizer, j5, jRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer$default, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return rattr;
    }

    public final HorizontalSquareImageView RemoteActionCompatParcelizer(long j, long j2, long j3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplBaseParcelizer = (i2 & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer() : j;
        long jAudioAttributesImplApi26Parcelizer = (i2 & 2) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer() : j2;
        long jAudioAttributesCompatParcelizer$default = (i2 & 4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j3;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
        }
        Rattr rattr = new Rattr(jAudioAttributesImplBaseParcelizer, jAudioAttributesImplApi26Parcelizer, jAudioAttributesImplBaseParcelizer, jAudioAttributesCompatParcelizer$default, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return rattr;
    }

    public final getReturnTransition RemoteActionCompatParcelizer() {
        return MediaBrowserCompatMediaItem;
    }

    public final setMultiValueForKey IconCompatParcelizer(float f, float f2, float f3, float f4, float f5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(2.0f);
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(8.0f);
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = assignParameter.IconCompatParcelizer(4.0f);
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = assignParameter.IconCompatParcelizer(4.0f);
        }
        float f10 = f5;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f6)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f7)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f8)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f9)) || (i & 3072) == 2048;
        boolean z5 = (((57344 & i) ^ CpioConstants.C_ISBLK) > 16384 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f10)) || (i & CpioConstants.C_ISBLK) == 16384;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z | z2 | z3 | z4 | z5) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new Core(f6, f7, f8, f9, f10, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        Core core = (Core) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return core;
    }

    static {
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
        AudioAttributesCompatParcelizer = fIconCompatParcelizer;
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(8.0f);
        RemoteActionCompatParcelizer = fIconCompatParcelizer2;
        getReturnTransition getreturntransition = getParentFragment.read(fIconCompatParcelizer, fIconCompatParcelizer2, fIconCompatParcelizer, fIconCompatParcelizer2);
        read = getreturntransition;
        AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(64.0f);
        AudioAttributesImplApi21Parcelizer = assignParameter.IconCompatParcelizer(36.0f);
        MediaBrowserCompatCustomActionResultReceiver = assignParameter.IconCompatParcelizer(18.0f);
        AudioAttributesImplBaseParcelizer = assignParameter.IconCompatParcelizer(8.0f);
        MediaBrowserCompatItemReceiver = assignParameter.IconCompatParcelizer(1.0f);
        float fIconCompatParcelizer3 = assignParameter.IconCompatParcelizer(8.0f);
        RatingCompat = fIconCompatParcelizer3;
        MediaBrowserCompatMediaItem = getParentFragment.read(fIconCompatParcelizer3, getreturntransition.getRead(), fIconCompatParcelizer3, getreturntransition.getRemoteActionCompatParcelizer());
    }
}
