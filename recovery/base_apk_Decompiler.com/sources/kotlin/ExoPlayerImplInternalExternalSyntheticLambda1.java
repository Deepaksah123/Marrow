package kotlin;

import android.graphics.Color;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplInternalExternalSyntheticLambda1 implements copyWithCryptoType<Integer> {
    public static final ExoPlayerImplInternalExternalSyntheticLambda1 RemoteActionCompatParcelizer = new ExoPlayerImplInternalExternalSyntheticLambda1();

    @Override // kotlin.copyWithCryptoType
    public final /* bridge */ /* synthetic */ Integer AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return AudioAttributesCompatParcelizer(format1);
    }

    private ExoPlayerImplInternalExternalSyntheticLambda1() {
    }

    private static Integer AudioAttributesCompatParcelizer(Format1 format1) throws IOException {
        boolean z = format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY;
        if (z) {
            format1.read();
        }
        double dAudioAttributesImplApi21Parcelizer = format1.AudioAttributesImplApi21Parcelizer();
        double dAudioAttributesImplApi21Parcelizer2 = format1.AudioAttributesImplApi21Parcelizer();
        double dAudioAttributesImplApi21Parcelizer3 = format1.AudioAttributesImplApi21Parcelizer();
        double dAudioAttributesImplApi21Parcelizer4 = format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.NUMBER ? format1.AudioAttributesImplApi21Parcelizer() : 1.0d;
        if (z) {
            format1.write();
        }
        if (dAudioAttributesImplApi21Parcelizer <= 1.0d && dAudioAttributesImplApi21Parcelizer2 <= 1.0d && dAudioAttributesImplApi21Parcelizer3 <= 1.0d) {
            dAudioAttributesImplApi21Parcelizer *= 255.0d;
            dAudioAttributesImplApi21Parcelizer2 *= 255.0d;
            dAudioAttributesImplApi21Parcelizer3 *= 255.0d;
            if (dAudioAttributesImplApi21Parcelizer4 <= 1.0d) {
                dAudioAttributesImplApi21Parcelizer4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dAudioAttributesImplApi21Parcelizer4, (int) dAudioAttributesImplApi21Parcelizer, (int) dAudioAttributesImplApi21Parcelizer2, (int) dAudioAttributesImplApi21Parcelizer3));
    }
}
