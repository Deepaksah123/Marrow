package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class keyForInitializationData implements copyWithCryptoType<setHeight> {
    public static final keyForInitializationData AudioAttributesCompatParcelizer = new keyForInitializationData();

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ setHeight AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return write(format1, f);
    }

    private keyForInitializationData() {
    }

    private static setHeight write(Format1 format1, float f) throws IOException {
        boolean z = format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY;
        if (z) {
            format1.read();
        }
        float fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
        float fAudioAttributesImplApi21Parcelizer2 = (float) format1.AudioAttributesImplApi21Parcelizer();
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            format1.RatingCompat();
        }
        if (z) {
            format1.write();
        }
        return new setHeight((fAudioAttributesImplApi21Parcelizer / 100.0f) * f, (fAudioAttributesImplApi21Parcelizer2 / 100.0f) * f);
    }
}
