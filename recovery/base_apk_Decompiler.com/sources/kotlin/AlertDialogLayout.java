package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J%\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/AlertDialogLayout;", "K", "Lo/setSupportBackgroundTintMode;", "", "p0", "<init>", "(I)V", "", "MediaBrowserCompatItemReceiver", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "(I)I", "read", "(Ljava/lang/Object;)I", "RemoteActionCompatParcelizer", "p1", "p2", "(Ljava/lang/Object;II)I", "(Ljava/lang/Object;)V", "write", "(Ljava/lang/Object;I)V", "AudioAttributesImplApi21Parcelizer", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AlertDialogLayout<K> extends setSupportBackgroundTintMode<K> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public /* synthetic */ AlertDialogLayout(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public AlertDialogLayout(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        RemoteActionCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.write = iMax;
        AudioAttributesCompatParcelizer(iMax);
        this.AudioAttributesCompatParcelizer = new Object[iMax];
        this.AudioAttributesImplBaseParcelizer = new int[iMax];
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
        }
        this.RemoteActionCompatParcelizer = jArr;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        read();
    }

    private final void read() {
        this.RemoteActionCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getWrite()) - this.read;
    }

    public final void RemoteActionCompatParcelizer(K p0, int p1) {
        int i = read(p0);
        if (i < 0) {
            i = ~i;
        }
        this.AudioAttributesCompatParcelizer[i] = p0;
        this.AudioAttributesImplBaseParcelizer[i] = p1;
    }

    public final int RemoteActionCompatParcelizer(K p0, int p1, int p2) {
        int i = read(p0);
        if (i < 0) {
            i = ~i;
        } else {
            p2 = this.AudioAttributesImplBaseParcelizer[i];
        }
        this.AudioAttributesCompatParcelizer[i] = p0;
        this.AudioAttributesImplBaseParcelizer[i] = p1;
        return p2;
    }

    public final void IconCompatParcelizer(K p0) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer >= 0) {
            read(iRemoteActionCompatParcelizer);
        }
    }

    public final void read(int p0) {
        this.read--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.write;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.AudioAttributesCompatParcelizer[p0] = null;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = 0;
        if (this.RemoteActionCompatParcelizer != setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
            long[] jArr2 = this.RemoteActionCompatParcelizer;
            int i = this.write;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        getOrderDetails.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (Object) null, 0, this.write);
        read();
    }

    private final int IconCompatParcelizer(int p0) {
        int i = this.write;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.write > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.read) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.write) * 25)) <= 0) {
            MediaBrowserCompatCustomActionResultReceiver();
        } else {
            write(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.write));
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        int i2;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i3 = this.write;
        Object[] objArr = this.AudioAttributesCompatParcelizer;
        int[] iArr = this.AudioAttributesImplBaseParcelizer;
        int i4 = 0;
        for (int i5 = 0; i5 < ((i3 + 7) >> 3); i5++) {
            long j = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(jArr);
        int i6 = iIconCompatParcelizer - 1;
        long j2 = 72057594037927935L;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iIconCompatParcelizer] = jArr[0];
        int i7 = 0;
        while (i7 != i3) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i4) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 >>> 7;
                int iIconCompatParcelizer2 = IconCompatParcelizer(i11);
                int i12 = i11 & i3;
                if (((iIconCompatParcelizer2 - i12) & i3) / 8 == ((i7 - i12) & i3) / 8) {
                    jArr[i8] = (((long) (i10 & 127)) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[i4] & j2) | Long.MIN_VALUE;
                    i7++;
                } else {
                    int i13 = iIconCompatParcelizer2 >> 3;
                    long j4 = jArr[i13];
                    int i14 = (iIconCompatParcelizer2 & 7) << 3;
                    if (((j4 >> i14) & 255) == 128) {
                        int i15 = i7;
                        jArr[i13] = ((~(255 << i14)) & j4) | (((long) (i10 & 127)) << i14);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[iIconCompatParcelizer2] = objArr[i15];
                        objArr[i15] = null;
                        iArr[iIconCompatParcelizer2] = iArr[i15];
                        iArr[i15] = 0;
                        i2 = i15;
                    } else {
                        int i16 = i7;
                        jArr[i13] = (((long) (i10 & 127)) << i14) | ((~(255 << i14)) & j4);
                        Object obj2 = objArr[iIconCompatParcelizer2];
                        objArr[iIconCompatParcelizer2] = objArr[i16];
                        objArr[i16] = obj2;
                        int i17 = iArr[iIconCompatParcelizer2];
                        iArr[iIconCompatParcelizer2] = iArr[i16];
                        iArr[i16] = i17;
                        i2 = i16 - 1;
                    }
                    i = 0;
                    j2 = 72057594037927935L;
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i7 = i2 + 1;
                    i4 = i;
                }
            } else {
                i = i4;
                i7++;
                i4 = i;
            }
        }
        read();
    }

    private void write(int p0) {
        int i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.AudioAttributesCompatParcelizer;
        int[] iArr = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.write;
        RemoteActionCompatParcelizer(p0);
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        Object[] objArr2 = this.AudioAttributesCompatParcelizer;
        int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.write;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iIconCompatParcelizer = IconCompatParcelizer(i5 >>> 7);
                i = i4;
                long j = i5 & 127;
                int i6 = iIconCompatParcelizer >> 3;
                int i7 = (iIconCompatParcelizer & 7) << 3;
                long j2 = (j << i7) | (jArr2[i6] & (~(255 << i7)));
                jArr2[i6] = j2;
                jArr2[(((iIconCompatParcelizer - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr2[iIconCompatParcelizer] = obj;
                iArr2[iIconCompatParcelizer] = iArr[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    private final int read(K p0) {
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.write;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iIconCompatParcelizer = IconCompatParcelizer(i2);
                if (this.RemoteActionCompatParcelizer == 0 && ((this.RemoteActionCompatParcelizer[iIconCompatParcelizer >> 3] >> ((iIconCompatParcelizer & 7) << 3)) & 255) != 254) {
                    MediaBrowserCompatItemReceiver();
                    iIconCompatParcelizer = IconCompatParcelizer(i2);
                }
                this.read++;
                int i10 = iIconCompatParcelizer >> 3;
                int i11 = (iIconCompatParcelizer & 7) << 3;
                this.RemoteActionCompatParcelizer -= ((this.RemoteActionCompatParcelizer[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.RemoteActionCompatParcelizer;
                int i12 = this.write;
                long j5 = (j2 << i11) | ((~(255 << i11)) & jArr2[i10]);
                jArr2[i10] = j5;
                jArr2[(((iIconCompatParcelizer - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return ~iIconCompatParcelizer;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public AlertDialogLayout() {
        this(0, 1, null);
    }
}
