package kotlin;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* JADX INFO: loaded from: classes2.dex */
final class throwIfRTE implements unwrapAndThrowAsIAE {
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    @Override // kotlin.unwrapAndThrowAsIAE
    public final int read() {
        return AviExtractor.FOURCC_strh;
    }

    public static throwIfRTE AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(12);
        int iMediaMetadataCompat2 = asPropertyTypeDeserializer.MediaMetadataCompat();
        int iMediaMetadataCompat3 = asPropertyTypeDeserializer.MediaMetadataCompat();
        int iMediaMetadataCompat4 = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaMetadataCompat5 = asPropertyTypeDeserializer.MediaMetadataCompat();
        int iMediaMetadataCompat6 = asPropertyTypeDeserializer.MediaMetadataCompat();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        return new throwIfRTE(iMediaMetadataCompat, iMediaMetadataCompat2, iMediaMetadataCompat3, iMediaMetadataCompat4, iMediaMetadataCompat5, iMediaMetadataCompat6);
    }

    private throwIfRTE(int i, int i2, int i3, int i4, int i5, int i6) {
        this.write = i;
        this.IconCompatParcelizer = i2;
        this.read = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.RemoteActionCompatParcelizer = i5;
        this.MediaBrowserCompatItemReceiver = i6;
    }

    public final int AudioAttributesCompatParcelizer() {
        int i = this.write;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        StringBuilder sb = new StringBuilder("Found unsupported streamType fourCC: ");
        sb.append(Integer.toHexString(this.write));
        prune.RemoteActionCompatParcelizer("AviStreamHeaderChunk", sb.toString());
        return -1;
    }

    public final long write() {
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, ((long) this.read) * 1000000, this.AudioAttributesCompatParcelizer);
    }
}
