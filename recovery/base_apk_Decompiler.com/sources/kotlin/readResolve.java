package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/readResolve;", "Lo/setColorFilter;", "<init>", "()V", "Lo/switchToNext;", "p0", "Lo/assignParameter;", "p1", "write", "(JFLo/_handleUnrecognizedCharacterEscape;I)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class readResolve implements setColorFilter {
    public static final readResolve INSTANCE = new readResolve();

    private readResolve() {
    }

    @Override // kotlin.setColorFilter
    public final long write(long j, float f, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1687113661);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        isFullscreen isfullscreenWrite = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6);
        if (assignParameter.write(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) > 0 && !isfullscreenWrite.MediaDescriptionCompat()) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1095627978);
            j = RequestPayload.RemoteActionCompatParcelizer(setShimmer.read(j, f, _handleunrecognizedcharacterescape, i & 126), j);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1095489470);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return j;
    }
}
