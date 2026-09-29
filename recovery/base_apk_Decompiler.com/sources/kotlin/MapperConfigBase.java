package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJg\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0019J%\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u001bJ5\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u001cJ=\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u001dJ'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J;\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\"¢\u0006\u0004\b\u0014\u0010#J\u0015\u0010\n\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010$J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0016\u0010\u0017\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010%\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010("}, d2 = {"Lo/MapperConfigBase;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "", "write", "(II[J)V", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "read", "(IIIIIIZZZI)V", "(IIIIIIZZZ)V", "RemoteActionCompatParcelizer", "(I)Z", "(IIIII)Z", "(IZZ)Z", "(IZ)Z", "(IIIII)V", "(IIIIII)V", "", "(JII)V", "AudioAttributesCompatParcelizer", "(I)V", "Lkotlin/Function4;", "(ILo/getMagicModuleStat;)Z", "(I)J", "IconCompatParcelizer", "[J", "I", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapperConfigBase {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public int IconCompatParcelizer;
    public long[] read = new long[PsExtractor.AUDIO_STREAM];

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public long[] RemoteActionCompatParcelizer = new long[PsExtractor.AUDIO_STREAM];

    public final int read() {
        return this.IconCompatParcelizer / 3;
    }

    private final void write(int p0, int p1, long[] p2) {
        int iMax = Math.max(p0 << 1, p1 + 3);
        long[] jArrCopyOf = Arrays.copyOf(p2, iMax);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
        this.read = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.RemoteActionCompatParcelizer, iMax);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf2, "");
        this.RemoteActionCompatParcelizer = jArrCopyOf2;
    }

    public final void write(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7, boolean p8) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == p1) {
                long j = jArr[i2];
                int i3 = ((int) (j >> 32)) + p2;
                int i4 = ((int) j) + p3;
                read(p0 & 33554431, i3, i4, i3 + p4, i4 + p5, p1, p6, p7, p8, i2);
                return;
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer(int p0) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            if ((((int) jArr[i3]) & 33554431) == (33554431 & p0)) {
                jArr[i2] = -1;
                jArr[i2 + 1] = -1;
                jArr[i3] = isAnnotationProcessingEnabled.RemoteActionCompatParcelizer();
                return true;
            }
        }
        return false;
    }

    public final boolean write(int p0, int p1, int p2, int p3, int p4) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (p0 & 33554431)) {
                long j2 = -1;
                jArr[i2] = (((long) p1) << 32) | (((long) p2) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
                long j3 = -1;
                jArr[i2 + 1] = (((long) p3) << 32) | (((long) p4) & ((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)));
                jArr[i3] = (((j >> 63) & 1) << 60) | j;
                return true;
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(int p0, boolean p1, boolean p2) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & p0)) {
                jArr[i3] = ((p1 ? 1L : 0L) * 2305843009213693952L) | ((-6917529027641081857L) & j) | ((p2 ? 1L : 0L) * 4611686018427387904L);
                return true;
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(int p0, boolean p1) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & p0)) {
                long j2 = p1 ? 1L : 0L;
                jArr[i3] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return true;
            }
        }
        return false;
    }

    public final void read(int p0, int p1, int p2, int p3, int p4) {
        MapperConfigBase mapperConfigBase = this;
        int i = p1;
        long[] jArr = mapperConfigBase.read;
        int i2 = mapperConfigBase.IconCompatParcelizer;
        int i3 = 0;
        int i4 = 0;
        while (i4 < jArr.length - 2 && i4 < i2) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == (p0 & 33554431)) {
                long j2 = jArr[i4];
                long j3 = ((long) i3) << 32;
                int i6 = i4;
                long j4 = -1;
                jArr[i6] = (((long) p2) & ((j4 - ((j4 >> 63) << 32)) | j3)) | (((long) i) << 32);
                long j5 = -1;
                jArr[i6 + 1] = (((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))) & ((long) p4)) | (((long) p3) << 32);
                jArr[i5] = (((j >> 63) & 1) << 60) | j;
                int i7 = p1 - ((int) (j2 >> 32));
                int i8 = p2 - ((int) j2);
                if ((i7 != 0) || (i8 != 0)) {
                    RemoteActionCompatParcelizer((isAnnotationProcessingEnabled.AudioAttributesCompatParcelizer() & j) | (((long) (33554431 & (i6 + 3))) << 25), i7, i8);
                    return;
                }
                return;
            }
            i = p1;
            i3 = 0;
            i4 += 3;
            mapperConfigBase = mapperConfigBase;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        r11 = r3;
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            r23 = this;
            r0 = r23
            long[] r1 = r0.read
            int r2 = r0.IconCompatParcelizer
            r3 = 0
            r4 = r3
        L8:
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r4 >= r5) goto Lab
            if (r4 >= r2) goto Lab
            int r5 = r4 + 2
            r5 = r1[r5]
            int r5 = (int) r5
            r6 = 33554431(0x1ffffff, float:9.403954E-38)
            r5 = r5 & r6
            r7 = r25
            if (r5 != r7) goto La5
            r8 = r1[r4]
            r5 = 32
            long r10 = r8 >> r5
            int r10 = (int) r10
            int r8 = (int) r8
            int r10 = r10 + r26
            int r8 = r8 + r27
        L28:
            int r9 = r4 + 3
            int r11 = r1.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto La2
            if (r9 >= r2) goto La2
            int r11 = r4 + 5
            r12 = r1[r11]
            int r14 = (int) r12
            r14 = r14 & r6
            r15 = r24 & r6
            if (r14 != r15) goto La0
            r14 = r1[r9]
            long r6 = r14 >> r5
            int r2 = (int) r6
            int r6 = (int) r14
            int r2 = r10 - r2
            int r6 = r8 - r6
            long r14 = (long) r10
            r24 = r6
            long r6 = (long) r8
            r16 = r11
            r17 = r12
            long r11 = (long) r3
            long r11 = r11 << r5
            r13 = -1
            r19 = r4
            long r3 = (long) r13
            r20 = 63
            long r21 = r3 >> r20
            long r21 = r21 << r5
            long r3 = r3 - r21
            long r3 = r3 | r11
            long r3 = r3 & r6
            long r6 = r14 << r5
            long r3 = r3 | r6
            r1[r9] = r3
            int r10 = r10 + r28
            long r3 = (long) r10
            int r8 = r8 + r29
            long r6 = (long) r8
            int r8 = r19 + 4
            long r3 = r3 << r5
            r11 = 0
            long r9 = (long) r11
            long r9 = r9 << r5
            long r11 = (long) r13
            long r13 = r11 >> r20
            long r13 = r13 << r5
            long r11 = r11 - r13
            long r9 = r9 | r11
            long r5 = r6 & r9
            long r3 = r3 | r5
            r1[r8] = r3
            long r3 = r17 >> r20
            r5 = 1
            long r3 = r3 & r5
            r5 = 60
            long r3 = r3 << r5
            long r3 = r3 | r17
            r1[r16] = r3
            if (r2 != 0) goto L89
            if (r24 == 0) goto Lab
        L89:
            long r3 = kotlin.isAnnotationProcessingEnabled.AudioAttributesCompatParcelizer()
            int r1 = r19 + 6
            r6 = 33554431(0x1ffffff, float:9.403954E-38)
            r1 = r1 & r6
            long r5 = (long) r1
            long r3 = r3 & r17
            r1 = 25
            long r5 = r5 << r1
            long r3 = r3 | r5
            r8 = r24
            r0.RemoteActionCompatParcelizer(r3, r2, r8)
            return
        La0:
            r4 = r9
            goto L28
        La2:
            r11 = r3
            r4 = r9
            goto La6
        La5:
            r11 = r3
        La6:
            int r4 = r4 + 3
            r3 = r11
            goto L8
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MapperConfigBase.read(int, int, int, int, int, int):void");
    }

    private final void RemoteActionCompatParcelizer(long p0, int p1, int p2) {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        int i6;
        char c2;
        long[] jArr = this.read;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        read();
        int i7 = 0;
        jArr2[0] = p0;
        for (int i8 = 1; i8 > 0; i8 = i) {
            i = i8 - 1;
            long j = jArr2[i];
            int i9 = (int) j;
            char c3 = 25;
            int i10 = 33554431;
            int i11 = ((int) (j >> 25)) & 33554431;
            int i12 = ((int) (j >> 50)) & AnalyticsListener.EVENT_DRM_KEYS_LOADED;
            int i13 = i12 == 1023 ? this.IconCompatParcelizer : (i12 * 3) + i11;
            if (i11 < 0) {
                return;
            }
            while (i11 < jArr.length - 2 && i11 < i13) {
                int i14 = i11 + 2;
                long j2 = jArr[i14];
                if ((((int) (j2 >> c3)) & i10) == (i9 & i10)) {
                    long j3 = jArr[i11];
                    int i15 = i11 + 1;
                    i3 = i9;
                    long j4 = jArr[i15];
                    i4 = i11;
                    long j5 = ((long) i7) << 32;
                    i2 = i;
                    long j6 = -1;
                    jArr[i4] = (((j6 - ((j6 >> 63) << 32)) | j5) & ((long) (((int) j3) + p2))) | (((long) (((int) (j3 >> 32)) + p1)) << 32);
                    i6 = 0;
                    long j7 = -1;
                    jArr[i15] = (((long) (((int) j4) + p2)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)))) | (((long) (((int) (j4 >> 32)) + p1)) << 32);
                    jArr[i14] = (((j2 >> 63) & 1) << 60) | j2;
                    c2 = '2';
                    if ((((int) (j2 >> 50)) & AnalyticsListener.EVENT_DRM_KEYS_LOADED) > 0) {
                        i5 = 33554431;
                        c = 25;
                        jArr2[i2] = (isAnnotationProcessingEnabled.AudioAttributesCompatParcelizer() & j2) | (((long) ((i4 + 3) & 33554431)) << 25);
                        i2++;
                    } else {
                        c = 25;
                        i5 = 33554431;
                    }
                } else {
                    i2 = i;
                    i3 = i9;
                    c = c3;
                    i4 = i11;
                    i5 = i10;
                    i6 = i7;
                    c2 = '2';
                }
                i11 = i4 + 3;
                i10 = i5;
                i7 = i6;
                i9 = i3;
                c3 = c;
                i = i2;
            }
            i7 = i7;
        }
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & p0)) {
                jArr[i3] = (((j >> 63) & 1) << 60) | j;
                return;
            }
        }
    }

    public final boolean read(int p0, getMagicModuleStat<? super Integer, ? super Integer, ? super Integer, ? super Integer, getShowPopup> p1) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & p0)) {
                long j = jArr[i2];
                long j2 = jArr[i2 + 1];
                p1.write(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final long write(int p0) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & p0)) {
                return jArr[i2];
            }
        }
        return Long.MAX_VALUE;
    }

    public final void RemoteActionCompatParcelizer() {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != isAnnotationProcessingEnabled.RemoteActionCompatParcelizer()) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.IconCompatParcelizer = i2;
        this.read = jArr2;
        this.RemoteActionCompatParcelizer = jArr;
    }

    public final void IconCompatParcelizer() {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-1152921504606846977L);
        }
    }

    public final void read(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7, boolean p8, int p9) {
        long[] jArr = this.read;
        int i = this.IconCompatParcelizer;
        int i2 = i + 3;
        this.IconCompatParcelizer = i2;
        int length = jArr.length;
        if (length <= i2) {
            write(length, i, jArr);
        }
        long[] jArr2 = this.read;
        long j = -1;
        jArr2[i] = (((long) p1) << 32) | (((long) p2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
        long j2 = -1;
        jArr2[i + 1] = (((long) p3) << 32) | (((long) p4) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
        int i3 = p5 & 33554431;
        jArr2[i + 2] = ((p8 ? 1L : 0L) << 63) | ((p7 ? 1L : 0L) << 62) | ((p6 ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50) | (((long) i3) << 25) | (p0 & 33554431);
        if (p5 >= 0) {
            int i4 = p9;
            if (i4 == -1) {
                i4 = i - 3;
            }
            while (i4 >= 0) {
                int i5 = i4 + 2;
                long j3 = jArr2[i5];
                if ((((int) j3) & 33554431) == i3) {
                    jArr2[i5] = (((long) Math.min((i - i4) / 3, AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50) | (j3 & isAnnotationProcessingEnabled.IconCompatParcelizer());
                    return;
                }
                i4 -= 3;
            }
        }
    }
}
