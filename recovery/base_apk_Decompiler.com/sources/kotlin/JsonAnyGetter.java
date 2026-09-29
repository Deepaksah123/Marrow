package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/isFullscreen;", "p0", "Lo/setImageAssetsFolder;", "RemoteActionCompatParcelizer", "(Lo/isFullscreen;Lo/_handleUnrecognizedCharacterEscape;I)Lo/setImageAssetsFolder;", "Lo/switchToNext;", "p1", "p2", "read", "(JJJ)J", "", "write", "(JJJ)F", "p3", "(JFJJ)F", "AudioAttributesCompatParcelizer", "(JJ)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonAnyGetter {
    public static final setImageAssetsFolder RemoteActionCompatParcelizer(isFullscreen isfullscreen, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jAudioAttributesImplApi26Parcelizer = isfullscreen.AudioAttributesImplApi26Parcelizer();
        long j = isfullscreen.read();
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-2060762245);
        long jIconCompatParcelizer = setJavaScriptInterface.IconCompatParcelizer(isfullscreen, j);
        if (jIconCompatParcelizer == 16) {
            jIconCompatParcelizer = ((switchToNext) _handleunrecognizedcharacterescape.write(R.RemoteActionCompatParcelizer())).getIconCompatParcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(jIconCompatParcelizer, GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesImplApi26Parcelizer);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(j);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new setImageAssetsFolder(isfullscreen.AudioAttributesImplApi26Parcelizer(), read(jAudioAttributesImplApi26Parcelizer, jAudioAttributesCompatParcelizer$default, j), null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setImageAssetsFolder setimageassetsfolder = (setImageAssetsFolder) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setimageassetsfolder;
    }

    public static final long read(long j, long j2, long j3) {
        float fWrite;
        float f = read(j, 0.4f, j2, j3);
        float f2 = read(j, 0.2f, j2, j3);
        if (f >= 4.5f) {
            fWrite = 0.4f;
        } else {
            fWrite = f2 < 4.5f ? 0.2f : write(j, j2, j3);
        }
        return switchToNext.AudioAttributesCompatParcelizer$default(j, fWrite, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    private static final float write(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float f4 = (read(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (BitmapDescriptorFactory.HUE_RED <= f4 && f4 <= 0.01f) {
                return f2;
            }
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    private static final float read(long j, float f, long j2, long j3) {
        long jRemoteActionCompatParcelizer = RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(j, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j3);
        return AudioAttributesCompatParcelizer(RequestPayload.RemoteActionCompatParcelizer(j2, jRemoteActionCompatParcelizer), jRemoteActionCompatParcelizer);
    }

    public static final float AudioAttributesCompatParcelizer(long j, long j2) {
        float fRemoteActionCompatParcelizer = RequestPayload.RemoteActionCompatParcelizer(j) + 0.05f;
        float fRemoteActionCompatParcelizer2 = RequestPayload.RemoteActionCompatParcelizer(j2) + 0.05f;
        return Math.max(fRemoteActionCompatParcelizer, fRemoteActionCompatParcelizer2) / Math.min(fRemoteActionCompatParcelizer, fRemoteActionCompatParcelizer2);
    }
}
