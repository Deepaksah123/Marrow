package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Lo/index;", "", "<init>", "()V", "Lo/switchToNext;", "write", "(Lo/_handleUnrecognizedCharacterEscape;I)J", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class index {
    public static final index INSTANCE = new index();

    private index() {
    }

    public final long write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:201)");
        }
        long jRemoteActionCompatParcelizer = RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.8f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatSearchResultReceiver());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jRemoteActionCompatParcelizer;
    }

    public final long read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long jAudioAttributesImplApi21Parcelizer;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        isFullscreen isfullscreenWrite = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6);
        if (isfullscreenWrite.MediaDescriptionCompat()) {
            jAudioAttributesImplApi21Parcelizer = RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(isfullscreenWrite.MediaBrowserCompatSearchResultReceiver(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), isfullscreenWrite.AudioAttributesImplApi26Parcelizer());
        } else {
            jAudioAttributesImplApi21Parcelizer = isfullscreenWrite.AudioAttributesImplApi21Parcelizer();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jAudioAttributesImplApi21Parcelizer;
    }
}
