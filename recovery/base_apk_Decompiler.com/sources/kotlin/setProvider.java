package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setProvider;", "V", "Lo/setExpandedActionViewsExclusive;", "", "p0", "<init>", "(I)V", "", "read", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "(I)I", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "p1", "(ILjava/lang/Object;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(I)Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "(ILjava/lang/Object;)V", "MediaBrowserCompatItemReceiver", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setProvider<V> extends setExpandedActionViewsExclusive<V> {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int read;

    public /* synthetic */ setProvider(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public setProvider(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        AudioAttributesImplBaseParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    private final void AudioAttributesImplBaseParcelizer(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.AudioAttributesCompatParcelizer = iMax;
        MediaBrowserCompatCustomActionResultReceiver(iMax);
        this.IconCompatParcelizer = new int[iMax];
        this.MediaBrowserCompatItemReceiver = new Object[iMax];
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(int p0) {
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
        IconCompatParcelizer();
    }

    private final void IconCompatParcelizer() {
        this.read = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer()) - this.write;
    }

    public final void write(int p0, V p1) {
        int iWrite = write(p0);
        this.IconCompatParcelizer[iWrite] = p0;
        this.MediaBrowserCompatItemReceiver[iWrite] = p1;
    }

    public final V AudioAttributesCompatParcelizer(int p0, V p1) {
        int iWrite = write(p0);
        V v = (V) this.MediaBrowserCompatItemReceiver[iWrite];
        this.IconCompatParcelizer[iWrite] = p0;
        this.MediaBrowserCompatItemReceiver[iWrite] = p1;
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V RemoteActionCompatParcelizer(int r15) {
        /*
            r14 = this;
            r0 = r14
            o.setExpandedActionViewsExclusive r0 = (kotlin.setExpandedActionViewsExclusive) r0
            int r1 = java.lang.Integer.hashCode(r15)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r0.AudioAttributesCompatParcelizer
            int r3 = r1 >>> 7
            r3 = r3 & r2
            r4 = 0
        L14:
            long[] r5 = r0.RemoteActionCompatParcelizer
            int r6 = r3 >> 3
            r7 = r3 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            int r6 = r6 + 1
            r5 = r5[r6]
            int r10 = 64 - r7
            long r5 = r5 << r10
            long r10 = (long) r7
            long r10 = -r10
            r12 = 63
            long r10 = r10 >> r12
            long r5 = r5 & r10
            long r7 = r8 >>> r7
            long r5 = r5 | r7
            r7 = r1 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r11 = ~r7
            long r7 = r7 - r9
            long r7 = r7 & r11
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L41:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5c
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r2
            int[] r12 = r0.IconCompatParcelizer
            r12 = r12[r11]
            if (r12 != r15) goto L56
            goto L66
        L56:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L41
        L5c:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L6f
            r11 = -1
        L66:
            if (r11 < 0) goto L6d
            java.lang.Object r14 = r14.read(r11)
            return r14
        L6d:
            r14 = 0
            return r14
        L6f:
            int r4 = r4 + 8
            int r3 = r3 + r4
            r3 = r3 & r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setProvider.RemoteActionCompatParcelizer(int):java.lang.Object");
    }

    public final V read(int p0) {
        this.write--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        V v = (V) this.MediaBrowserCompatItemReceiver[p0];
        this.MediaBrowserCompatItemReceiver[p0] = null;
        return v;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write = 0;
        if (this.RemoteActionCompatParcelizer != setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
            long[] jArr2 = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        getOrderDetails.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, (Object) null, 0, this.AudioAttributesCompatParcelizer);
        IconCompatParcelizer();
    }

    private final int AudioAttributesImplApi26Parcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
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

    private void read() {
        if (this.AudioAttributesCompatParcelizer > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.write) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer) * 25)) <= 0) {
            MediaBrowserCompatCustomActionResultReceiver();
        } else {
            AudioAttributesImplApi21Parcelizer(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        char c;
        int i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        int[] iArr = this.IconCompatParcelizer;
        Object[] objArr = this.MediaBrowserCompatItemReceiver;
        char c2 = 0;
        for (int i3 = 0; i3 < ((i2 + 7) >> 3); i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(jArr);
        int i4 = iIconCompatParcelizer - 1;
        long j2 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[iIconCompatParcelizer] = jArr[0];
        int i5 = 0;
        while (i5 != i2) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j3 = (jArr[i6] >> i7) & 255;
            if (j3 != 128 && j3 == 254) {
                int iHashCode = Integer.hashCode(iArr[i5]) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int i9 = i8 >>> 7;
                int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i9);
                int i10 = i9 & i2;
                if (((iAudioAttributesImplApi26Parcelizer - i10) & i2) / 8 == ((i5 - i10) & i2) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i11 = iAudioAttributesImplApi26Parcelizer >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iAudioAttributesImplApi26Parcelizer & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        int i13 = i5;
                        jArr[i11] = ((~(255 << i12)) & j4) | (((long) (i8 & 127)) << i12);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        iArr[iAudioAttributesImplApi26Parcelizer] = iArr[i13];
                        iArr[i13] = 0;
                        objArr[iAudioAttributesImplApi26Parcelizer] = objArr[i13];
                        objArr[i13] = null;
                        i = i13;
                    } else {
                        int i14 = i5;
                        jArr[i11] = (((long) (i8 & 127)) << i12) | ((~(255 << i12)) & j4);
                        int i15 = iArr[iAudioAttributesImplApi26Parcelizer];
                        iArr[iAudioAttributesImplApi26Parcelizer] = iArr[i14];
                        iArr[i14] = i15;
                        Object obj = objArr[iAudioAttributesImplApi26Parcelizer];
                        objArr[iAudioAttributesImplApi26Parcelizer] = objArr[i14];
                        objArr[i14] = obj;
                        i = i14 - 1;
                    }
                    c = 0;
                    j2 = 72057594037927935L;
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i5 = i + 1;
                    c2 = c;
                }
            } else {
                c = c2;
                i5++;
                c2 = c;
            }
        }
        IconCompatParcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer(int p0) {
        long[] jArr;
        setProvider<V> setprovider = this;
        long[] jArr2 = setprovider.RemoteActionCompatParcelizer;
        int[] iArr = setprovider.IconCompatParcelizer;
        Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
        int i = setprovider.AudioAttributesCompatParcelizer;
        AudioAttributesImplBaseParcelizer(p0);
        long[] jArr3 = setprovider.RemoteActionCompatParcelizer;
        int[] iArr2 = setprovider.IconCompatParcelizer;
        Object[] objArr2 = setprovider.MediaBrowserCompatItemReceiver;
        int i2 = setprovider.AudioAttributesCompatParcelizer;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iAudioAttributesImplApi26Parcelizer = setprovider.AudioAttributesImplApi26Parcelizer(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iAudioAttributesImplApi26Parcelizer >> 3;
                int i7 = (iAudioAttributesImplApi26Parcelizer & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                jArr3[i6] = j2;
                jArr3[(((iAudioAttributesImplApi26Parcelizer - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr2[iAudioAttributesImplApi26Parcelizer] = i4;
                objArr2[iAudioAttributesImplApi26Parcelizer] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            setprovider = this;
            jArr2 = jArr;
        }
    }

    private final int write(int p0) {
        int iHashCode = Integer.hashCode(p0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = i & 127;
            int i8 = i5;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.IconCompatParcelizer[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i2);
                if (this.read == 0 && ((this.RemoteActionCompatParcelizer[iAudioAttributesImplApi26Parcelizer >> 3] >> ((iAudioAttributesImplApi26Parcelizer & 7) << 3)) & 255) != 254) {
                    read();
                    iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i2);
                }
                this.write++;
                int i9 = iAudioAttributesImplApi26Parcelizer >> 3;
                int i10 = (iAudioAttributesImplApi26Parcelizer & 7) << 3;
                this.read -= ((this.RemoteActionCompatParcelizer[i9] >> i10) & 255) != 128 ? 0 : 1;
                long[] jArr2 = this.RemoteActionCompatParcelizer;
                int i11 = this.AudioAttributesCompatParcelizer;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((iAudioAttributesImplApi26Parcelizer - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return iAudioAttributesImplApi26Parcelizer;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public setProvider() {
        this(0, 1, null);
    }
}
