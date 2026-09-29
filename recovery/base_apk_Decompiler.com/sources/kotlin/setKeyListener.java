package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u0014J!\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u000b\u0010\u0015J!\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u001aJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0007J \u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/setKeyListener;", "K", "V", "Lo/AppCompatButton;", "", "p0", "<init>", "(I)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "(I)I", "write", "(Ljava/lang/Object;)I", "MediaBrowserCompatCustomActionResultReceiver", "read", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Lo/AppCompatButton;)V", "", "(Ljava/util/Map;)V", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Object;", "(I)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;)V", "MediaBrowserCompatItemReceiver", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setKeyListener<K, V> extends AppCompatButton<K, V> {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int write;

    public /* synthetic */ setKeyListener(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public setKeyListener(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        write(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    private final void write(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.AudioAttributesCompatParcelizer = iMax;
        read(iMax);
        this.IconCompatParcelizer = iMax == 0 ? setCheckMarkDrawable.read : new Object[iMax];
        this.MediaBrowserCompatItemReceiver = iMax == 0 ? setCheckMarkDrawable.read : new Object[iMax];
    }

    private final void read(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            long[] jArr2 = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr2, -9187201950435737472L, 0, jArr2.length);
            int i = p0 >> 3;
            long j = 255 << ((p0 & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.RemoteActionCompatParcelizer = jArr;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.write = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer()) - this.write;
    }

    public final void RemoteActionCompatParcelizer(K p0, V p1) {
        int iWrite = write(p0);
        if (iWrite < 0) {
            iWrite = ~iWrite;
        }
        this.IconCompatParcelizer[iWrite] = p0;
        this.MediaBrowserCompatItemReceiver[iWrite] = p1;
    }

    public final V AudioAttributesCompatParcelizer(K p0, V p1) {
        int iWrite = write(p0);
        if (iWrite < 0) {
            iWrite = ~iWrite;
        }
        V v = (V) this.MediaBrowserCompatItemReceiver[iWrite];
        this.IconCompatParcelizer[iWrite] = p0;
        this.MediaBrowserCompatItemReceiver[iWrite] = p1;
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V IconCompatParcelizer(K r15) {
        /*
            r14 = this;
            r0 = r14
            o.AppCompatButton r0 = (kotlin.AppCompatButton) r0
            r1 = 0
            if (r15 == 0) goto Lb
            int r2 = r15.hashCode()
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r0.AudioAttributesCompatParcelizer
            int r4 = r2 >>> 7
        L17:
            r4 = r4 & r3
            long[] r5 = r0.RemoteActionCompatParcelizer
            int r6 = r4 >> 3
            r7 = r4 & 7
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
            r7 = r2 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r11 = ~r7
            long r7 = r7 - r9
            long r7 = r7 & r11
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L45:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L64
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r4
            r11 = r11 & r3
            java.lang.Object[] r12 = r0.IconCompatParcelizer
            r12 = r12[r11]
            boolean r12 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r12, r15)
            if (r12 == 0) goto L5e
            goto L6e
        L5e:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L45
        L64:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L77
            r11 = -1
        L6e:
            if (r11 < 0) goto L75
            java.lang.Object r14 = r14.AudioAttributesCompatParcelizer(r11)
            return r14
        L75:
            r14 = 0
            return r14
        L77:
            int r1 = r1 + 8
            int r4 = r4 + r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setKeyListener.IconCompatParcelizer(java.lang.Object):java.lang.Object");
    }

    public final V AudioAttributesCompatParcelizer(int p0) {
        this.write--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.IconCompatParcelizer[p0] = null;
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
        getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, 0, this.AudioAttributesCompatParcelizer);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final int RemoteActionCompatParcelizer(int p0) {
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

    private void AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesCompatParcelizer > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.write) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer) * 25)) <= 0) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            IconCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i;
        Object[] objArr;
        int i2;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        Object[] objArr2 = this.IconCompatParcelizer;
        Object[] objArr3 = this.MediaBrowserCompatItemReceiver;
        int i4 = 0;
        for (int i5 = 0; i5 < ((i3 + 7) >> 3); i5++) {
            long j = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(jArr);
        int i6 = iIconCompatParcelizer - 1;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iIconCompatParcelizer] = jArr[0];
        int i7 = 0;
        while (i7 != i3) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j2 = (jArr[i8] >> i9) & 255;
            if (j2 != 128 && j2 == 254) {
                Object obj = objArr2[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i4) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 >>> 7;
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i11);
                int i12 = i11 & i3;
                if (((iRemoteActionCompatParcelizer - i12) & i3) / 8 == ((i7 - i12) & i3) / 8) {
                    jArr[i8] = (((long) (i10 & 127)) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = jArr[i4];
                    i = i3;
                    objArr = objArr2;
                    i2 = i4;
                } else {
                    int i13 = iRemoteActionCompatParcelizer >> 3;
                    long j3 = jArr[i13];
                    int i14 = (iRemoteActionCompatParcelizer & 7) << 3;
                    if (((j3 >> i14) & 255) == 128) {
                        int i15 = i7;
                        i = i3;
                        objArr = objArr2;
                        jArr[i13] = ((~(255 << i14)) & j3) | (((long) (i10 & 127)) << i14);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[iRemoteActionCompatParcelizer] = objArr[i15];
                        objArr[i15] = null;
                        objArr3[iRemoteActionCompatParcelizer] = objArr3[i15];
                        objArr3[i15] = null;
                        i7 = i15;
                    } else {
                        i = i3;
                        objArr = objArr2;
                        int i16 = i7;
                        jArr[i13] = (((long) (i10 & 127)) << i14) | ((~(255 << i14)) & j3);
                        Object obj2 = objArr[iRemoteActionCompatParcelizer];
                        objArr[iRemoteActionCompatParcelizer] = objArr[i16];
                        objArr[i16] = obj2;
                        Object obj3 = objArr3[iRemoteActionCompatParcelizer];
                        objArr3[iRemoteActionCompatParcelizer] = objArr3[i16];
                        objArr3[i16] = obj3;
                        i7 = i16 - 1;
                    }
                    i2 = 0;
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = jArr[0];
                }
                i7++;
            } else {
                i = i3;
                objArr = objArr2;
                i2 = i4;
                i7++;
            }
            i4 = i2;
            i3 = i;
            objArr2 = objArr;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void IconCompatParcelizer(int p0) {
        int i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.IconCompatParcelizer;
        Object[] objArr2 = this.MediaBrowserCompatItemReceiver;
        int i2 = this.AudioAttributesCompatParcelizer;
        write(p0);
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        Object[] objArr3 = this.IconCompatParcelizer;
        Object[] objArr4 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i5 >>> 7);
                i = i4;
                long j = i5 & 127;
                int i6 = iRemoteActionCompatParcelizer >> 3;
                int i7 = (iRemoteActionCompatParcelizer & 7) << 3;
                long j2 = (j << i7) | (jArr2[i6] & (~(255 << i7)));
                jArr2[i6] = j2;
                jArr2[(((iRemoteActionCompatParcelizer - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr3[iRemoteActionCompatParcelizer] = obj;
                objArr4[iRemoteActionCompatParcelizer] = objArr2[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    public final void read(Map<K, ? extends V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (Map.Entry<K, ? extends V> entry : p0.entrySet()) {
            RemoteActionCompatParcelizer(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AudioAttributesCompatParcelizer(AppCompatButton<K, V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object[] objArr = p0.IconCompatParcelizer;
        Object[] objArr2 = p0.MediaBrowserCompatItemReceiver;
        long[] jArr = p0.RemoteActionCompatParcelizer;
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
                        int i4 = (i << 3) + i3;
                        RemoteActionCompatParcelizer(objArr[i4], objArr2[i4]);
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

    public final int write(K p0) {
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.AudioAttributesCompatParcelizer;
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
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                if (this.write == 0 && ((this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer >> 3] >> ((iRemoteActionCompatParcelizer & 7) << 3)) & 255) != 254) {
                    AudioAttributesImplApi26Parcelizer();
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                }
                this.write++;
                int i10 = iRemoteActionCompatParcelizer >> 3;
                int i11 = (iRemoteActionCompatParcelizer & 7) << 3;
                this.write -= ((this.RemoteActionCompatParcelizer[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.RemoteActionCompatParcelizer;
                int i12 = this.AudioAttributesCompatParcelizer;
                long j5 = (j2 << i11) | ((~(255 << i11)) & jArr2[i10]);
                jArr2[i10] = j5;
                jArr2[(((iRemoteActionCompatParcelizer - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return ~iRemoteActionCompatParcelizer;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public setKeyListener() {
        this(0, 1, null);
    }
}
