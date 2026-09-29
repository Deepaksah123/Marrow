package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0007\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018"}, d2 = {"Lo/setBackgroundDrawable;", "Lo/ActionMenuPresenterSavedState;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "(I)Z", "", "AudioAttributesImplApi21Parcelizer", "()V", "write", "AudioAttributesImplBaseParcelizer", "(I)I", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "(Lo/ActionMenuPresenterSavedState;)V", "AudioAttributesCompatParcelizer", "read", "(Lo/ActionMenuPresenterSavedState;)Z", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setBackgroundDrawable extends ActionMenuPresenterSavedState {
    private int write;

    public setBackgroundDrawable(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        MediaBrowserCompatItemReceiver(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    public /* synthetic */ setBackgroundDrawable(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void MediaBrowserCompatItemReceiver(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.IconCompatParcelizer = iMax;
        MediaBrowserCompatCustomActionResultReceiver(iMax);
        this.RemoteActionCompatParcelizer = new int[iMax];
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
        }
        this.AudioAttributesCompatParcelizer = jArr;
        long[] jArr2 = this.AudioAttributesCompatParcelizer;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        RemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer() {
        this.write = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getIconCompatParcelizer()) - this.read;
    }

    public final boolean RemoteActionCompatParcelizer(int p0) {
        int i = this.read;
        this.RemoteActionCompatParcelizer[write(p0)] = p0;
        return this.read != i;
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        this.RemoteActionCompatParcelizer[write(p0)] = p0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r0
            o.ActionMenuPresenterSavedState r1 = (kotlin.ActionMenuPresenterSavedState) r1
            int r2 = java.lang.Integer.hashCode(r19)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r1.IconCompatParcelizer
            int r4 = r2 >>> 7
            r4 = r4 & r3
            r6 = 0
        L16:
            long[] r7 = r1.AudioAttributesCompatParcelizer
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r15 = 63
            long r13 = r13 >> r15
            long r7 = r7 & r13
            long r9 = r10 >>> r9
            long r7 = r7 | r9
            r9 = r2 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            r15 = r6
            long r5 = ~r9
            long r9 = r9 - r13
            long r5 = r5 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r9
        L44:
            r13 = 0
            int r16 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r16 == 0) goto L61
            int r13 = java.lang.Long.numberOfTrailingZeros(r5)
            int r13 = r13 >> 3
            int r13 = r13 + r4
            r13 = r13 & r3
            int[] r14 = r1.RemoteActionCompatParcelizer
            r14 = r14[r13]
            r11 = r19
            if (r14 != r11) goto L5b
            goto L6f
        L5b:
            r13 = 1
            long r13 = r5 - r13
            long r5 = r5 & r13
            goto L44
        L61:
            r11 = r19
            long r5 = ~r7
            r17 = 6
            long r5 = r5 << r17
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 == 0) goto L7a
            r13 = -1
        L6f:
            if (r13 < 0) goto L73
            r5 = r12
            goto L74
        L73:
            r5 = 0
        L74:
            if (r5 == 0) goto L79
            r0.AudioAttributesImplApi26Parcelizer(r13)
        L79:
            return r5
        L7a:
            int r6 = r15 + 8
            int r4 = r4 + r6
            r4 = r4 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBackgroundDrawable.read(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplApi21Parcelizer(int r15) {
        /*
            r14 = this;
            r0 = r14
            o.ActionMenuPresenterSavedState r0 = (kotlin.ActionMenuPresenterSavedState) r0
            int r1 = java.lang.Integer.hashCode(r15)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r0.IconCompatParcelizer
            int r3 = r1 >>> 7
            r3 = r3 & r2
            r4 = 0
        L14:
            long[] r5 = r0.AudioAttributesCompatParcelizer
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
            int[] r12 = r0.RemoteActionCompatParcelizer
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
            if (r5 == 0) goto L6c
            r11 = -1
        L66:
            if (r11 < 0) goto L6b
            r14.AudioAttributesImplApi26Parcelizer(r11)
        L6b:
            return
        L6c:
            int r4 = r4 + 8
            int r3 = r3 + r4
            r3 = r3 & r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBackgroundDrawable.AudioAttributesImplApi21Parcelizer(int):void");
    }

    public final boolean read(ActionMenuPresenterSavedState p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.read;
        IconCompatParcelizer(p0);
        return i != this.read;
    }

    private final void AudioAttributesImplApi26Parcelizer(int p0) {
        this.read--;
        long[] jArr = this.AudioAttributesCompatParcelizer;
        int i = this.IconCompatParcelizer;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
    }

    public final void write() {
        this.read = 0;
        if (this.AudioAttributesCompatParcelizer != setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer) {
            long[] jArr = this.AudioAttributesCompatParcelizer;
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
            long[] jArr2 = this.AudioAttributesCompatParcelizer;
            int i = this.IconCompatParcelizer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        RemoteActionCompatParcelizer();
    }

    private final int AudioAttributesImplBaseParcelizer(int p0) {
        int i = this.IconCompatParcelizer;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.AudioAttributesCompatParcelizer;
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

    private void AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.read) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.IconCompatParcelizer) * 25)) <= 0) {
            AudioAttributesImplBaseParcelizer();
        } else {
            MediaDescriptionCompat(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        char c;
        int i;
        long[] jArr = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        int[] iArr = this.RemoteActionCompatParcelizer;
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
                int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i9);
                int i10 = i9 & i2;
                if (((iAudioAttributesImplBaseParcelizer - i10) & i2) / 8 == ((i5 - i10) & i2) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i11 = iAudioAttributesImplBaseParcelizer >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iAudioAttributesImplBaseParcelizer & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        int i13 = i5;
                        jArr[i11] = ((~(255 << i12)) & j4) | (((long) (i8 & 127)) << i12);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        iArr[iAudioAttributesImplBaseParcelizer] = iArr[i13];
                        iArr[i13] = 0;
                        i = i13;
                    } else {
                        int i14 = i5;
                        jArr[i11] = (((long) (i8 & 127)) << i12) | ((~(255 << i12)) & j4);
                        int i15 = iArr[iAudioAttributesImplBaseParcelizer];
                        iArr[iAudioAttributesImplBaseParcelizer] = iArr[i14];
                        iArr[i14] = i15;
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
        RemoteActionCompatParcelizer();
    }

    private void MediaDescriptionCompat(int p0) {
        long[] jArr = this.AudioAttributesCompatParcelizer;
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        MediaBrowserCompatItemReceiver(p0);
        long[] jArr2 = this.AudioAttributesCompatParcelizer;
        int[] iArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        for (int i3 = 0; i3 < i; i3++) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iAudioAttributesImplBaseParcelizer >> 3;
                int i7 = (iAudioAttributesImplBaseParcelizer & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((iAudioAttributesImplBaseParcelizer - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr2[iAudioAttributesImplBaseParcelizer] = i4;
            }
        }
    }

    private void IconCompatParcelizer(ActionMenuPresenterSavedState p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int[] iArr = p0.RemoteActionCompatParcelizer;
        long[] jArr = p0.AudioAttributesCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        AudioAttributesImplApi21Parcelizer(iArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final int write(int p0) {
        int iHashCode = Integer.hashCode(p0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = this.IconCompatParcelizer;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.AudioAttributesCompatParcelizer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = i & 127;
            int i8 = i5;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i2);
                if (this.write == 0 && ((this.AudioAttributesCompatParcelizer[iAudioAttributesImplBaseParcelizer >> 3] >> ((iAudioAttributesImplBaseParcelizer & 7) << 3)) & 255) != 254) {
                    AudioAttributesImplApi21Parcelizer();
                    iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i2);
                }
                this.read++;
                int i9 = iAudioAttributesImplBaseParcelizer >> 3;
                int i10 = (iAudioAttributesImplBaseParcelizer & 7) << 3;
                this.write -= ((this.AudioAttributesCompatParcelizer[i9] >> i10) & 255) != 128 ? 0 : 1;
                long[] jArr2 = this.AudioAttributesCompatParcelizer;
                int i11 = this.IconCompatParcelizer;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((iAudioAttributesImplBaseParcelizer - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return iAudioAttributesImplBaseParcelizer;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public setBackgroundDrawable() {
        this(0, 1, null);
    }
}
