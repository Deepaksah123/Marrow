package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class initialCapacity {
    public final long[] AudioAttributesCompatParcelizer;
    public final ObjectBuffer AudioAttributesImplApi21Parcelizer;
    public final long[] AudioAttributesImplApi26Parcelizer;
    public final int[] AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int[] RemoteActionCompatParcelizer;
    public final long read;
    public final int write;

    public initialCapacity(ObjectBuffer objectBuffer, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        buildTypeSerializer.IconCompatParcelizer(iArr.length == jArr2.length);
        buildTypeSerializer.IconCompatParcelizer(jArr.length == jArr2.length);
        buildTypeSerializer.IconCompatParcelizer(iArr2.length == jArr2.length);
        this.AudioAttributesImplApi21Parcelizer = objectBuffer;
        this.AudioAttributesCompatParcelizer = jArr;
        this.AudioAttributesImplBaseParcelizer = iArr;
        this.IconCompatParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = jArr2;
        this.RemoteActionCompatParcelizer = iArr2;
        this.read = j;
        this.write = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int write(long j) {
        for (int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, j, false); iRemoteActionCompatParcelizer >= 0; iRemoteActionCompatParcelizer--) {
            if ((this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer] & 1) != 0) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return -1;
    }

    public final int RemoteActionCompatParcelizer(long j) {
        for (int i = LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, j, true); i < this.AudioAttributesImplApi26Parcelizer.length; i++) {
            if ((this.RemoteActionCompatParcelizer[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }
}
