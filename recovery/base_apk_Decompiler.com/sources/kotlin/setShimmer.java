package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\" \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u0004\u0010\u000b"}, d2 = {"Lo/switchToNext;", "p0", "Lo/assignParameter;", "p1", "read", "(JFLo/_handleUnrecognizedCharacterEscape;I)J", "Lo/CharacterEscapes;", "Lo/setColorFilter;", "AudioAttributesCompatParcelizer", "Lo/CharacterEscapes;", "RemoteActionCompatParcelizer", "()Lo/CharacterEscapes;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setShimmer {
    private static final CharacterEscapes<setColorFilter> AudioAttributesCompatParcelizer = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.startShimmer
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setShimmer.AudioAttributesImplApi26Parcelizer();
        }
    });
    private static final CharacterEscapes<assignParameter> IconCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.stopShimmer
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setShimmer.IconCompatParcelizer();
        }
    }, 1, null);

    public static final CharacterEscapes<setColorFilter> RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setColorFilter AudioAttributesImplApi26Parcelizer() {
        return readResolve.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(long j, float f, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(setJavaScriptInterface.read(j, _handleunrecognizedcharacterescape, i & 14), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jAudioAttributesCompatParcelizer$default;
    }

    public static final CharacterEscapes<assignParameter> read() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final assignParameter IconCompatParcelizer() {
        return assignParameter.read(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));
    }
}
