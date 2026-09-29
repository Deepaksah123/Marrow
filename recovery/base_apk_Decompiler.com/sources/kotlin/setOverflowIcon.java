package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d\u0082\u0001\u0001\u001f"}, d2 = {"Lo/setOverflowIcon;", "V", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "(J)Z", "equals", "(Ljava/lang/Object;)Z", "read", "(J)Ljava/lang/Object;", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "()Z", "", "toString", "()Ljava/lang/String;", "I", "write", "IconCompatParcelizer", "", "[J", "AudioAttributesImplBaseParcelizer", "", "[Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ActivityChooserViewInnerLayout;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class setOverflowIcon<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public long[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public Object[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public int AudioAttributesCompatParcelizer;
    public long[] read;
    public int write;

    private setOverflowIcon() {
        this.RemoteActionCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        this.read = setDefaultActionButtonContentDescription.read();
        this.MediaBrowserCompatCustomActionResultReceiver = setCheckMarkDrawable.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    private int getWrite() {
        return this.write;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.write == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof kotlin.setOverflowIcon
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.setOverflowIcon r1 = (kotlin.setOverflowIcon) r1
            int r3 = r1.getWrite()
            int r5 = r17.getWrite()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            long[] r3 = r0.read
            java.lang.Object[] r5 = r0.MediaBrowserCompatCustomActionResultReceiver
            long[] r0 = r0.RemoteActionCompatParcelizer
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L78
            r7 = r4
        L27:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L73
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L41:
            if (r12 >= r10) goto L71
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L62
            java.lang.Object r13 = r1.read(r14)
            if (r13 != 0) goto L61
            boolean r13 = r1.RemoteActionCompatParcelizer(r14)
            if (r13 != 0) goto L6d
        L61:
            return r4
        L62:
            java.lang.Object r14 = r1.read(r14)
            boolean r13 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r13, r14)
            if (r13 != 0) goto L6d
            return r4
        L6d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L41
        L71:
            if (r10 != r11) goto L78
        L73:
            if (r7 == r6) goto L78
            int r7 = r7 + 1
            goto L27
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverflowIcon.equals(java.lang.Object):boolean");
    }

    public String toString() {
        int i;
        int i2;
        if (AudioAttributesCompatParcelizer()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.read;
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.write) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V read(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r13.AudioAttributesCompatParcelizer
            int r2 = r0 >>> 7
            r2 = r2 & r1
            r3 = 0
        L11:
            long[] r4 = r13.RemoteActionCompatParcelizer
            int r5 = r2 >> 3
            r6 = r2 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r11 = 63
            long r9 = r9 >> r11
            long r4 = r4 & r9
            long r6 = r7 >>> r6
            long r4 = r4 | r6
            r6 = r0 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r6
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r10 = ~r6
            long r6 = r6 - r8
            long r6 = r6 & r10
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r2
            r10 = r10 & r1
            long[] r11 = r13.read
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6e
            r10 = -1
        L65:
            if (r10 < 0) goto L6c
            java.lang.Object[] r13 = r13.MediaBrowserCompatCustomActionResultReceiver
            r13 = r13[r10]
            return r13
        L6c:
            r13 = 0
            return r13
        L6e:
            int r3 = r3 + 8
            int r2 = r2 + r3
            r2 = r2 & r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverflowIcon.read(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r0.AudioAttributesCompatParcelizer
            int r3 = r1 >>> 7
            r3 = r3 & r2
            r4 = 0
            r5 = r4
        L14:
            long[] r6 = r0.RemoteActionCompatParcelizer
            int r7 = r3 >> 3
            r8 = r3 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r14 = 63
            long r12 = r12 >> r14
            long r6 = r6 & r12
            long r8 = r9 >>> r8
            long r6 = r6 | r8
            r8 = r1 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r14 = ~r8
            long r8 = r8 - r12
            long r8 = r8 & r14
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            long[] r14 = r0.read
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L5a
            if (r10 < 0) goto L69
            return r11
        L5a:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L41
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6a
        L69:
            return r4
        L6a:
            int r5 = r5 + 8
            int r3 = r3 + r5
            r3 = r3 & r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverflowIcon.RemoteActionCompatParcelizer(long):boolean");
    }

    public int hashCode() {
        long[] jArr = this.read;
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public /* synthetic */ setOverflowIcon(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
