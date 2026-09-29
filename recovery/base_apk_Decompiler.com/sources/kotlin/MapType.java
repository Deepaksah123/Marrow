package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapType extends CollectionLikeType {
    private byte[] RemoteActionCompatParcelizer;
    private volatile boolean read;

    protected abstract void read(byte[] bArr, int i) throws IOException;

    public MapType(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, byte[] bArr) {
        MapType mapType;
        byte[] bArr2;
        super(_hastyperesolver, subTypeValidator, 3, c0170format, i, obj, C.TIME_UNSET, C.TIME_UNSET);
        if (bArr == null) {
            bArr2 = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
            mapType = this;
        } else {
            mapType = this;
            bArr2 = bArr;
        }
        mapType.RemoteActionCompatParcelizer = bArr2;
    }

    public final byte[] RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
        this.read = true;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        try {
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            int iAudioAttributesCompatParcelizer = 0;
            int i = 0;
            while (iAudioAttributesCompatParcelizer != -1 && !this.read) {
                read(i);
                iAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, i, 16384);
                if (iAudioAttributesCompatParcelizer != -1) {
                    i += iAudioAttributesCompatParcelizer;
                }
            }
            if (!this.read) {
                read(this.RemoteActionCompatParcelizer, i);
            }
        } finally {
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        }
    }

    private void read(int i) {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        if (bArr.length < i + 16384) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
