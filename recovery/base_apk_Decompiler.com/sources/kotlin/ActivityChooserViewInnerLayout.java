package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u0011J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006J \u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/ActivityChooserViewInnerLayout;", "V", "Lo/setOverflowIcon;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "()V", "IconCompatParcelizer", "write", "", "(J)I", "(I)I", "AudioAttributesCompatParcelizer", "read", "(J)Ljava/lang/Object;", "(I)Ljava/lang/Object;", "p1", "(JLjava/lang/Object;)V", "AudioAttributesImplApi26Parcelizer", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActivityChooserViewInnerLayout<V> extends setOverflowIcon<V> {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int read;

    public /* synthetic */ ActivityChooserViewInnerLayout(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public ActivityChooserViewInnerLayout(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        AudioAttributesCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.AudioAttributesCompatParcelizer = iMax;
        read(iMax);
        this.read = new long[iMax];
        this.MediaBrowserCompatCustomActionResultReceiver = new Object[iMax];
    }

    private final void read(int p0) {
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
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        this.read = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer()) - this.write;
    }

    public final void IconCompatParcelizer(long p0, V p1) {
        int iWrite = write(p0);
        this.read[iWrite] = p0;
        this.MediaBrowserCompatCustomActionResultReceiver[iWrite] = p1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r12 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V IconCompatParcelizer(long r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r0
            o.setOverflowIcon r1 = (kotlin.setOverflowIcon) r1
            int r2 = java.lang.Long.hashCode(r16)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r1.AudioAttributesCompatParcelizer
            int r4 = r2 >>> 7
            r4 = r4 & r3
            r5 = 0
        L15:
            long[] r6 = r1.RemoteActionCompatParcelizer
            int r7 = r4 >> 3
            r8 = r4 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            int r7 = r7 + 1
            r6 = r6[r7]
            int r11 = 64 - r8
            long r6 = r6 << r11
            long r11 = (long) r8
            long r11 = -r11
            r13 = 63
            long r11 = r11 >> r13
            long r6 = r6 & r11
            long r8 = r9 >>> r8
            long r6 = r6 | r8
            r8 = r2 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r10
            long r8 = r8 ^ r6
            long r12 = ~r8
            long r8 = r8 - r10
            long r8 = r8 & r12
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
        L42:
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 == 0) goto L5f
            int r12 = java.lang.Long.numberOfTrailingZeros(r8)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r3
            long[] r13 = r1.read
            r13 = r13[r12]
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L59
            goto L69
        L59:
            r12 = 1
            long r12 = r8 - r12
            long r8 = r8 & r12
            goto L42
        L5f:
            long r8 = ~r6
            r14 = 6
            long r8 = r8 << r14
            long r6 = r6 & r8
            long r6 = r6 & r10
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto L72
            r12 = -1
        L69:
            if (r12 < 0) goto L70
            java.lang.Object r0 = r15.write(r12)
            return r0
        L70:
            r0 = 0
            return r0
        L72:
            int r5 = r5 + 8
            int r4 = r4 + r5
            r4 = r4 & r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityChooserViewInnerLayout.IconCompatParcelizer(long):java.lang.Object");
    }

    private V write(int p0) {
        this.write--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        V v = (V) this.MediaBrowserCompatCustomActionResultReceiver[p0];
        this.MediaBrowserCompatCustomActionResultReceiver[p0] = null;
        return v;
    }

    public final void IconCompatParcelizer() {
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
        getOrderDetails.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, (Object) null, 0, this.AudioAttributesCompatParcelizer);
        AudioAttributesCompatParcelizer();
    }

    private final int IconCompatParcelizer(int p0) {
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

    private void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.write) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer) * 25)) <= 0) {
            write();
        } else {
            RemoteActionCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
    }

    private void write() {
        char c;
        int i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        long[] jArr2 = this.read;
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
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
                int iHashCode = Long.hashCode(jArr2[i5]) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int i9 = i8 >>> 7;
                int iIconCompatParcelizer2 = IconCompatParcelizer(i9);
                int i10 = i9 & i2;
                if (((iIconCompatParcelizer2 - i10) & i2) / 8 == ((i5 - i10) & i2) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i11 = iIconCompatParcelizer2 >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iIconCompatParcelizer2 & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        int i13 = i5;
                        jArr[i11] = ((~(255 << i12)) & j4) | (((long) (i8 & 127)) << i12);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[iIconCompatParcelizer2] = jArr2[i13];
                        jArr2[i13] = 0;
                        objArr[iIconCompatParcelizer2] = objArr[i13];
                        objArr[i13] = null;
                        i = i13;
                    } else {
                        int i14 = i5;
                        jArr[i11] = (((long) (i8 & 127)) << i12) | ((~(255 << i12)) & j4);
                        long j5 = jArr2[iIconCompatParcelizer2];
                        jArr2[iIconCompatParcelizer2] = jArr2[i14];
                        jArr2[i14] = j5;
                        Object obj = objArr[iIconCompatParcelizer2];
                        objArr[iIconCompatParcelizer2] = objArr[i14];
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
        AudioAttributesCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer(int p0) {
        long[] jArr;
        ActivityChooserViewInnerLayout<V> activityChooserViewInnerLayout = this;
        long[] jArr2 = activityChooserViewInnerLayout.RemoteActionCompatParcelizer;
        long[] jArr3 = activityChooserViewInnerLayout.read;
        Object[] objArr = activityChooserViewInnerLayout.MediaBrowserCompatCustomActionResultReceiver;
        int i = activityChooserViewInnerLayout.AudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer(p0);
        long[] jArr4 = activityChooserViewInnerLayout.RemoteActionCompatParcelizer;
        long[] jArr5 = activityChooserViewInnerLayout.read;
        Object[] objArr2 = activityChooserViewInnerLayout.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = activityChooserViewInnerLayout.AudioAttributesCompatParcelizer;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int iHashCode = Long.hashCode(j) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iIconCompatParcelizer = activityChooserViewInnerLayout.IconCompatParcelizer(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = iIconCompatParcelizer >> 3;
                int i6 = (iIconCompatParcelizer & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i5] & (~(255 << i6))) | (j2 << i6);
                jArr4[i5] = j3;
                jArr4[(((iIconCompatParcelizer - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr5[iIconCompatParcelizer] = j;
                objArr2[iIconCompatParcelizer] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            activityChooserViewInnerLayout = this;
            jArr2 = jArr;
        }
    }

    private final int write(long p0) {
        int iHashCode = Long.hashCode(p0) * (-862048943);
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
                if (this.read[iNumberOfTrailingZeros] == p0) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iIconCompatParcelizer = IconCompatParcelizer(i2);
                if (this.read == 0 && ((this.RemoteActionCompatParcelizer[iIconCompatParcelizer >> 3] >> ((iIconCompatParcelizer & 7) << 3)) & 255) != 254) {
                    RemoteActionCompatParcelizer();
                    iIconCompatParcelizer = IconCompatParcelizer(i2);
                }
                this.write++;
                int i9 = iIconCompatParcelizer >> 3;
                int i10 = (iIconCompatParcelizer & 7) << 3;
                this.read -= ((this.RemoteActionCompatParcelizer[i9] >> i10) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.RemoteActionCompatParcelizer;
                int i11 = this.AudioAttributesCompatParcelizer;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((iIconCompatParcelizer - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return iIconCompatParcelizer;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public ActivityChooserViewInnerLayout() {
        this(0, 1, null);
    }
}
