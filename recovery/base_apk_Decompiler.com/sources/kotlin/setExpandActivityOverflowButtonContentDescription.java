package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0005J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setExpandActivityOverflowButtonContentDescription;", "Lo/setOverlayMode;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "read", "write", "(I)I", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "p1", "(II)V", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setExpandActivityOverflowButtonContentDescription extends setOverlayMode {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int write;

    public setExpandActivityOverflowButtonContentDescription(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        MediaBrowserCompatCustomActionResultReceiver(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    public /* synthetic */ setExpandActivityOverflowButtonContentDescription(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(int p0) {
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.write = iMax;
        AudioAttributesImplApi21Parcelizer(iMax);
        this.RemoteActionCompatParcelizer = new int[iMax];
        this.AudioAttributesImplBaseParcelizer = new int[iMax];
    }

    private final void AudioAttributesImplApi21Parcelizer(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
        }
        this.read = jArr;
        long[] jArr2 = this.read;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        write();
    }

    private final void write() {
        this.write = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getWrite()) - this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(int p0, int p1) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer < 0) {
            iRemoteActionCompatParcelizer = ~iRemoteActionCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer] = p0;
        this.AudioAttributesImplBaseParcelizer[iRemoteActionCompatParcelizer] = p1;
    }

    public final void RemoteActionCompatParcelizer(int p0, int p1) {
        IconCompatParcelizer(p0, p1);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer = 0;
        if (this.read != setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer) {
            long[] jArr = this.read;
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
            long[] jArr2 = this.read;
            int i = this.write;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        write();
    }

    private final int write(int p0) {
        int i = this.write;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.read;
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
        if (this.write > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.IconCompatParcelizer) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.write) * 25)) <= 0) {
            read();
        } else {
            MediaBrowserCompatItemReceiver(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.write));
        }
    }

    private void read() {
        char c;
        int i;
        long[] jArr = this.read;
        int i2 = this.write;
        int[] iArr = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
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
                int iWrite = write(i9);
                int i10 = i9 & i2;
                if (((iWrite - i10) & i2) / 8 == ((i5 - i10) & i2) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[getOrderDetails.IconCompatParcelizer(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i11 = iWrite >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iWrite & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        int i13 = i5;
                        jArr[i11] = ((~(255 << i12)) & j4) | (((long) (i8 & 127)) << i12);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        iArr[iWrite] = iArr[i13];
                        iArr[i13] = 0;
                        iArr2[iWrite] = iArr2[i13];
                        iArr2[i13] = 0;
                        i = i13;
                    } else {
                        int i14 = i5;
                        jArr[i11] = (((long) (i8 & 127)) << i12) | ((~(255 << i12)) & j4);
                        int i15 = iArr[iWrite];
                        iArr[iWrite] = iArr[i14];
                        iArr[i14] = i15;
                        int i16 = iArr2[iWrite];
                        iArr2[iWrite] = iArr2[i14];
                        iArr2[i14] = i16;
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
        write();
    }

    private void MediaBrowserCompatItemReceiver(int p0) {
        long[] jArr;
        setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = this;
        long[] jArr2 = setexpandactivityoverflowbuttoncontentdescription.read;
        int[] iArr = setexpandactivityoverflowbuttoncontentdescription.RemoteActionCompatParcelizer;
        int[] iArr2 = setexpandactivityoverflowbuttoncontentdescription.AudioAttributesImplBaseParcelizer;
        int i = setexpandactivityoverflowbuttoncontentdescription.write;
        MediaBrowserCompatCustomActionResultReceiver(p0);
        long[] jArr3 = setexpandactivityoverflowbuttoncontentdescription.read;
        int[] iArr3 = setexpandactivityoverflowbuttoncontentdescription.RemoteActionCompatParcelizer;
        int[] iArr4 = setexpandactivityoverflowbuttoncontentdescription.AudioAttributesImplBaseParcelizer;
        int i2 = setexpandactivityoverflowbuttoncontentdescription.write;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iWrite = setexpandactivityoverflowbuttoncontentdescription.write(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iWrite >> 3;
                int i7 = (iWrite & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                jArr3[i6] = j2;
                jArr3[(((iWrite - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr3[iWrite] = i4;
                iArr4[iWrite] = iArr2[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            setexpandactivityoverflowbuttoncontentdescription = this;
            jArr2 = jArr;
        }
    }

    private final int RemoteActionCompatParcelizer(int p0) {
        int iHashCode = Integer.hashCode(p0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = this.write;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.read;
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
                int iWrite = write(i2);
                if (this.write == 0 && ((this.read[iWrite >> 3] >> ((iWrite & 7) << 3)) & 255) != 254) {
                    RemoteActionCompatParcelizer();
                    iWrite = write(i2);
                }
                this.IconCompatParcelizer++;
                int i9 = iWrite >> 3;
                int i10 = (iWrite & 7) << 3;
                this.write -= ((this.read[i9] >> i10) & 255) != 128 ? 0 : 1;
                long[] jArr2 = this.read;
                int i11 = this.write;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((iWrite - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return ~iWrite;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public setExpandActivityOverflowButtonContentDescription() {
        this(0, 1, null);
    }
}
