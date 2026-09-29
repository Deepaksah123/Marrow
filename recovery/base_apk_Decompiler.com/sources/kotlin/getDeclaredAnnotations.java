package kotlin;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* JADX INFO: loaded from: classes2.dex */
final class getDeclaredAnnotations implements unwrapAndThrowAsIAE {
    public final String IconCompatParcelizer;

    @Override // kotlin.unwrapAndThrowAsIAE
    public final int read() {
        return AviExtractor.FOURCC_strn;
    }

    public static getDeclaredAnnotations write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return new getDeclaredAnnotations(asPropertyTypeDeserializer.read(asPropertyTypeDeserializer.IconCompatParcelizer()));
    }

    private getDeclaredAnnotations(String str) {
        this.IconCompatParcelizer = str;
    }
}
