package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getScope {
    public static final getScope RemoteActionCompatParcelizer = new getScope();
    public static final int read = 0;

    private getScope() {
    }

    public final canUseFor AudioAttributesCompatParcelizer(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3) {
        long j9;
        long jRemoteActionCompatParcelizer;
        long j10;
        int i4;
        long jRemoteActionCompatParcelizer2;
        long j11;
        long jRemoteActionCompatParcelizer3;
        long jMediaBrowserCompatMediaItem = (i3 & 1) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatMediaItem() : j;
        long j12 = (i3 & 2) != 0 ? jMediaBrowserCompatMediaItem : j2;
        float f3 = (i3 & 4) != 0 ? 0.54f : f;
        long jMediaBrowserCompatSearchResultReceiver = (i3 & 8) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver() : j3;
        long jMediaBrowserCompatItemReceiver = (i3 & 16) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver() : j4;
        float f4 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            j9 = jMediaBrowserCompatMediaItem;
            jRemoteActionCompatParcelizer = RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(jMediaBrowserCompatMediaItem, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver());
        } else {
            j9 = jMediaBrowserCompatMediaItem;
            jRemoteActionCompatParcelizer = j5;
        }
        if ((i3 & 128) != 0) {
            i4 = 6;
            j10 = jRemoteActionCompatParcelizer;
            jRemoteActionCompatParcelizer2 = RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(j12, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver());
        } else {
            j10 = jRemoteActionCompatParcelizer;
            i4 = 6;
            jRemoteActionCompatParcelizer2 = j6;
        }
        if ((i3 & 256) != 0) {
            long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(jMediaBrowserCompatSearchResultReceiver, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, i4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            i4 = 6;
            j11 = jMediaBrowserCompatSearchResultReceiver;
            jRemoteActionCompatParcelizer3 = RequestPayload.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer$default, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver());
        } else {
            j11 = jMediaBrowserCompatSearchResultReceiver;
            jRemoteActionCompatParcelizer3 = j7;
        }
        long jRemoteActionCompatParcelizer4 = (i3 & 512) != 0 ? RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(jMediaBrowserCompatItemReceiver, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, i4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver()) : j8;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:341)");
        }
        Rstyleable rstyleable = new Rstyleable(j9, switchToNext.AudioAttributesCompatParcelizer$default(j12, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j11, switchToNext.AudioAttributesCompatParcelizer$default(jMediaBrowserCompatItemReceiver, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j10, switchToNext.AudioAttributesCompatParcelizer$default(jRemoteActionCompatParcelizer2, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), jRemoteActionCompatParcelizer3, switchToNext.AudioAttributesCompatParcelizer$default(jRemoteActionCompatParcelizer4, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return rstyleable;
    }
}
