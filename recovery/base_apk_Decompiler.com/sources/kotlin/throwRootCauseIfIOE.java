package kotlin;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* JADX INFO: loaded from: classes2.dex */
final class throwRootCauseIfIOE implements unwrapAndThrowAsIAE {
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int write;

    @Override // kotlin.unwrapAndThrowAsIAE
    public final int read() {
        return AviExtractor.FOURCC_avih;
    }

    public static throwRootCauseIfIOE IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        int iMediaMetadataCompat2 = asPropertyTypeDeserializer.MediaMetadataCompat();
        int iMediaMetadataCompat3 = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaMetadataCompat4 = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(12);
        return new throwRootCauseIfIOE(iMediaMetadataCompat, iMediaMetadataCompat2, iMediaMetadataCompat3, iMediaMetadataCompat4);
    }

    private throwRootCauseIfIOE(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return (this.write & 16) == 16;
    }
}
