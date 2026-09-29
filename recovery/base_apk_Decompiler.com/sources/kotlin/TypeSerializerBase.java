package kotlin;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSerializerBase {
    public byte[] AudioAttributesCompatParcelizer;
    private final read AudioAttributesImplApi21Parcelizer;
    private final MediaCodec.CryptoInfo AudioAttributesImplApi26Parcelizer;
    public int[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    public int[] MediaBrowserCompatCustomActionResultReceiver;
    public int MediaBrowserCompatItemReceiver;
    public byte[] RemoteActionCompatParcelizer;
    public int read;
    public int write;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeSerializerBase() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.AudioAttributesImplApi26Parcelizer = cryptoInfo;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 ? new read(cryptoInfo) : null;
    }

    public final void write(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.MediaBrowserCompatItemReceiver = i;
        this.MediaBrowserCompatCustomActionResultReceiver = iArr;
        this.AudioAttributesImplBaseParcelizer = iArr2;
        this.RemoteActionCompatParcelizer = bArr;
        this.AudioAttributesCompatParcelizer = bArr2;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.read = i4;
        this.AudioAttributesImplApi26Parcelizer.numSubSamples = i;
        this.AudioAttributesImplApi26Parcelizer.numBytesOfClearData = iArr;
        this.AudioAttributesImplApi26Parcelizer.numBytesOfEncryptedData = iArr2;
        this.AudioAttributesImplApi26Parcelizer.key = bArr;
        this.AudioAttributesImplApi26Parcelizer.iv = bArr2;
        this.AudioAttributesImplApi26Parcelizer.mode = i2;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24) {
            ((read) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).read(i3, i4);
        }
    }

    public final MediaCodec.CryptoInfo RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(int i) {
        if (i == 0) {
            return;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            int[] iArr = new int[1];
            this.MediaBrowserCompatCustomActionResultReceiver = iArr;
            this.AudioAttributesImplApi26Parcelizer.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
        iArr2[0] = iArr2[0] + i;
    }

    static final class read {
        private final MediaCodec.CryptoInfo.Pattern IconCompatParcelizer;
        private final MediaCodec.CryptoInfo read;

        private read(MediaCodec.CryptoInfo cryptoInfo) {
            this.read = cryptoInfo;
            this.IconCompatParcelizer = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(int i, int i2) {
            this.IconCompatParcelizer.set(i, i2);
            this.read.setPattern(this.IconCompatParcelizer);
        }
    }
}
