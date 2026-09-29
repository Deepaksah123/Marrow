package kotlin;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\r\u0010\b\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\b\u0010\u0018J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u001dJ\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u001e\u0010\u001c\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\u0013\u0010!R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\""}, d2 = {"Lo/setCustomSelectionActionModeCallback;", "E", "Lo/setAutoSizeTextTypeUniformWithConfiguration;", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Z", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Iterable;)Z", "", "AudioAttributesImplApi26Parcelizer", "()V", "", "()Ljava/util/Set;", "AudioAttributesImplApi21Parcelizer", "read", "(Ljava/lang/Object;)I", "write", "(I)I", "", "([I)V", "", "([J)V", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "MediaBrowserCompatCustomActionResultReceiver", "", "(Ljava/util/Collection;)Z", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setCustomSelectionActionModeCallback<E> extends setAutoSizeTextTypeUniformWithConfiguration<E> {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int write;

    public /* synthetic */ setCustomSelectionActionModeCallback(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public setCustomSelectionActionModeCallback(int i) {
        super(null);
        if (i < 0) {
            AppCompatImageButton.read("Capacity must be a positive value.");
        }
        read(setAutoSizeTextTypeUniformWithPresetSizes.write(i));
    }

    private final void read(int p0) {
        long[] jArr;
        int iMax = p0 > 0 ? Math.max(7, setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(p0)) : 0;
        this.read = iMax;
        IconCompatParcelizer(iMax);
        this.AudioAttributesCompatParcelizer = iMax == 0 ? setCheckMarkDrawable.read : new Object[iMax];
        if (iMax == 0) {
            jArr = setTextSize.read();
        } else {
            jArr = new long[iMax];
            getOrderDetails.read(jArr, 4611686018427387903L, 0, jArr.length);
        }
        this.MediaBrowserCompatItemReceiver = jArr;
    }

    private final void IconCompatParcelizer(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
        }
        this.write = jArr;
        long[] jArr2 = this.write;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        MediaBrowserCompatItemReceiver();
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.write = setAutoSizeTextTypeUniformWithPresetSizes.RemoteActionCompatParcelizer(getRead()) - this.RemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(E p0) {
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        int i = read(p0);
        this.AudioAttributesCompatParcelizer[i] = p0;
        this.MediaBrowserCompatItemReceiver[i] = (((long) this.IconCompatParcelizer) & 2147483647L) | 4611686016279904256L;
        if (this.IconCompatParcelizer != Integer.MAX_VALUE) {
            this.MediaBrowserCompatItemReceiver[this.IconCompatParcelizer] = ((2147483647L & ((long) i)) << 31) | (this.MediaBrowserCompatItemReceiver[this.IconCompatParcelizer] & (-4611686016279904257L));
        }
        this.IconCompatParcelizer = i;
        if (this.MediaBrowserCompatCustomActionResultReceiver == Integer.MAX_VALUE) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
        }
        return getRemoteActionCompatParcelizer() != remoteActionCompatParcelizer;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(E p0) {
        int i = read(p0);
        this.AudioAttributesCompatParcelizer[i] = p0;
        this.MediaBrowserCompatItemReceiver[i] = (((long) this.IconCompatParcelizer) & 2147483647L) | 4611686016279904256L;
        if (this.IconCompatParcelizer != Integer.MAX_VALUE) {
            this.MediaBrowserCompatItemReceiver[this.IconCompatParcelizer] = ((2147483647L & ((long) i)) << 31) | (this.MediaBrowserCompatItemReceiver[this.IconCompatParcelizer] & (-4611686016279904257L));
        }
        this.IconCompatParcelizer = i;
        if (this.MediaBrowserCompatCustomActionResultReceiver == Integer.MAX_VALUE) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
        }
    }

    public final boolean AudioAttributesCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        IconCompatParcelizer((Iterable) p0);
        return remoteActionCompatParcelizer != getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AudioAttributesCompatParcelizer(E r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r0
            o.setAutoSizeTextTypeUniformWithConfiguration r2 = (kotlin.setAutoSizeTextTypeUniformWithConfiguration) r2
            if (r1 == 0) goto Le
            int r4 = r19.hashCode()
            goto Lf
        Le:
            r4 = 0
        Lf:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            int r5 = r2.read
            int r6 = r4 >>> 7
            r6 = r6 & r5
            r7 = 0
        L1c:
            long[] r8 = r2.write
            int r9 = r6 >> 3
            r10 = r6 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            r13 = 1
            int r9 = r9 + r13
            r8 = r8[r9]
            int r14 = 64 - r10
            long r8 = r8 << r14
            long r14 = (long) r10
            long r14 = -r14
            r16 = 63
            long r14 = r14 >> r16
            long r8 = r8 & r14
            long r10 = r11 >>> r10
            long r8 = r8 | r10
            r10 = r4 & 127(0x7f, float:1.78E-43)
            long r10 = (long) r10
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            r16 = r4
            long r3 = ~r10
            long r10 = r10 - r14
            long r3 = r3 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r10
        L4c:
            r14 = 0
            int r17 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r17 == 0) goto L6b
            int r14 = java.lang.Long.numberOfTrailingZeros(r3)
            int r14 = r14 >> 3
            int r14 = r14 + r6
            r14 = r14 & r5
            java.lang.Object[] r15 = r2.AudioAttributesCompatParcelizer
            r15 = r15[r14]
            boolean r15 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r15, r1)
            if (r15 == 0) goto L65
            goto L77
        L65:
            r14 = 1
            long r14 = r3 - r14
            long r3 = r3 & r14
            goto L4c
        L6b:
            long r3 = ~r8
            r17 = 6
            long r3 = r3 << r17
            long r3 = r3 & r8
            long r3 = r3 & r10
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L82
            r14 = -1
        L77:
            if (r14 < 0) goto L7b
            r3 = r13
            goto L7c
        L7b:
            r3 = 0
        L7c:
            if (r3 == 0) goto L81
            r0.RemoteActionCompatParcelizer(r14)
        L81:
            return r3
        L82:
            int r7 = r7 + 8
            int r6 = r6 + r7
            r6 = r6 & r5
            r4 = r16
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCustomSelectionActionModeCallback.AudioAttributesCompatParcelizer(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(E r15) {
        /*
            r14 = this;
            r0 = r14
            o.setAutoSizeTextTypeUniformWithConfiguration r0 = (kotlin.setAutoSizeTextTypeUniformWithConfiguration) r0
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
            int r3 = r0.read
            int r4 = r2 >>> 7
        L17:
            r4 = r4 & r3
            long[] r5 = r0.write
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
            java.lang.Object[] r12 = r0.AudioAttributesCompatParcelizer
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
            if (r5 == 0) goto L74
            r11 = -1
        L6e:
            if (r11 < 0) goto L73
            r14.RemoteActionCompatParcelizer(r11)
        L73:
            return
        L74:
            int r1 = r1 + 8
            int r4 = r4 + r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCustomSelectionActionModeCallback.write(java.lang.Object):void");
    }

    public final boolean RemoteActionCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        write((Iterable) p0);
        return remoteActionCompatParcelizer != getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r1, r2)
            java.lang.Object[] r2 = r0.AudioAttributesCompatParcelizer
            int r3 = r0.RemoteActionCompatParcelizer
            r4 = r0
            o.setAutoSizeTextTypeUniformWithConfiguration r4 = (kotlin.setAutoSizeTextTypeUniformWithConfiguration) r4
            long[] r4 = r4.write
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5a
            r7 = r6
        L19:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L55
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L33:
            if (r12 >= r10) goto L53
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r14, r15)
            if (r14 != 0) goto L4f
            r0.RemoteActionCompatParcelizer(r13)
        L4f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L33
        L53:
            if (r10 != r11) goto L5a
        L55:
            if (r7 == r5) goto L5a
            int r7 = r7 + 1
            goto L19
        L5a:
            int r0 = r0.RemoteActionCompatParcelizer
            if (r3 == r0) goto L60
            r0 = 1
            return r0
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCustomSelectionActionModeCallback.read(java.util.Collection):boolean");
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        this.RemoteActionCompatParcelizer--;
        long[] jArr = this.write;
        int i = this.read;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.AudioAttributesCompatParcelizer[p0] = null;
        long[] jArr2 = this.MediaBrowserCompatItemReceiver;
        long j2 = jArr2[p0];
        int i4 = (int) ((j2 >> 31) & 2147483647L);
        int i5 = (int) (j2 & 2147483647L);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & (-2147483648L)) | (((long) i5) & 2147483647L);
        } else {
            this.IconCompatParcelizer = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((((long) i4) & 2147483647L) << 31) | ((-4611686016279904257L) & jArr2[i5]);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = i4;
        }
        jArr2[p0] = 4611686018427387903L;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = 0;
        if (this.write != setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer) {
            long[] jArr = this.write;
            getOrderDetails.read(jArr, -9187201950435737472L, 0, jArr.length);
            long[] jArr2 = this.write;
            int i = this.read;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        getOrderDetails.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (Object) null, 0, this.read);
        long[] jArr3 = this.MediaBrowserCompatItemReceiver;
        getOrderDetails.read(jArr3, 4611686018427387903L, 0, jArr3.length);
        this.IconCompatParcelizer = Integer.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = Integer.MAX_VALUE;
        MediaBrowserCompatItemReceiver();
    }

    private final int write(int p0) {
        int i = this.read;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.write;
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
        if (this.read > 8 && Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer) << 5), setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(this.read) * 25)) <= 0) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            AudioAttributesCompatParcelizer(setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer(this.read));
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        long j;
        int i;
        int i2;
        long[] jArr3 = this.write;
        if (jArr3 == null) {
            return;
        }
        int i3 = this.read;
        Object[] objArr2 = this.AudioAttributesCompatParcelizer;
        long[] jArr4 = this.MediaBrowserCompatItemReceiver;
        long[] jArr5 = new long[i3];
        long j2 = 9223372034707292159L;
        int i4 = 0;
        getOrderDetails.read(jArr5, 9223372034707292159L, 0, i3);
        for (int i5 = 0; i5 < ((i3 + 7) >> 3); i5++) {
            long j3 = jArr3[i5] & (-9187201950435737472L);
            jArr3[i5] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(jArr3);
        int i6 = iIconCompatParcelizer - 1;
        jArr3[i6] = (jArr3[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr3[iIconCompatParcelizer] = jArr3[0];
        int i7 = 0;
        while (i7 != i3) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j4 = (jArr3[i8] >> i9) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr2[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i4) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 >>> 7;
                int iWrite = write(i11);
                int i12 = i11 & i3;
                if (((iWrite - i12) & i3) / 8 == ((i7 - i12) & i3) / 8) {
                    jArr3[i8] = (((long) (i10 & 127)) << i9) | (jArr3[i8] & (~(255 << i9)));
                    if (jArr5[i7] == 9223372034707292159L) {
                        long j5 = i7;
                        jArr5[i7] = j5 | (j5 << 32);
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i7++;
                    j2 = 9223372034707292159L;
                    i4 = 0;
                } else {
                    j = 9223372034707292159L;
                    int i13 = iWrite >> 3;
                    long j6 = jArr3[i13];
                    int i14 = (iWrite & 7) << 3;
                    if (((j6 >> i14) & 255) == 128) {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i13] = (j6 & (~(255 << i14))) | (((long) (i10 & 127)) << i14);
                        jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (128 << i9);
                        objArr2[iWrite] = objArr2[i7];
                        objArr2[i7] = null;
                        jArr[iWrite] = jArr[i7];
                        jArr[i7] = 4611686018427387903L;
                        int i15 = (int) (jArr2[i7] >> 32);
                        if (i15 != Integer.MAX_VALUE) {
                            jArr2[i15] = (jArr2[i15] & (-4294967296L)) | ((long) iWrite);
                            long j7 = -1;
                            jArr2[i7] = (jArr2[i7] & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)))) | (-4294967296L);
                        } else {
                            jArr2[i7] = ((long) iWrite) | 9223372032559808512L;
                        }
                        jArr2[iWrite] = (((long) i7) << 32) | 2147483647L;
                        i2 = i3;
                        objArr = objArr2;
                    } else {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i13] = (((long) (i10 & 127)) << i14) | (j6 & (~(255 << i14)));
                        Object obj2 = objArr2[iWrite];
                        objArr2[iWrite] = objArr2[i7];
                        objArr2[i7] = obj2;
                        long j8 = jArr[iWrite];
                        jArr[iWrite] = jArr[i7];
                        jArr[i7] = j8;
                        int i16 = (int) (jArr2[i7] >> 32);
                        if (i16 != Integer.MAX_VALUE) {
                            long j9 = iWrite;
                            jArr2[i16] = (jArr2[i16] & (-4294967296L)) | j9;
                            i2 = i3;
                            objArr = objArr2;
                            long j10 = -1;
                            jArr2[i7] = (((j10 - ((j10 >> 63) << 32)) | (((long) 0) << 32)) & jArr2[i7]) | (j9 << 32);
                        } else {
                            i2 = i3;
                            objArr = objArr2;
                            long j11 = iWrite;
                            jArr2[i7] = j11 | (j11 << 32);
                            i16 = i7;
                        }
                        jArr2[iWrite] = (((long) i16) << 32) | ((long) i7);
                        i7--;
                    }
                    i = 0;
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i7++;
                    i4 = i;
                    i3 = i2;
                    objArr2 = objArr;
                    j2 = j;
                    jArr4 = jArr;
                    jArr5 = jArr2;
                }
            } else {
                objArr = objArr2;
                jArr = jArr4;
                jArr2 = jArr5;
                j = j2;
                i = i4;
                i2 = i3;
                i7++;
                i4 = i;
                i3 = i2;
                objArr2 = objArr;
                j2 = j;
                jArr4 = jArr;
                jArr5 = jArr2;
            }
        }
        MediaBrowserCompatItemReceiver();
        read(jArr5);
    }

    private void AudioAttributesCompatParcelizer(int p0) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.write;
        Object[] objArr2 = this.AudioAttributesCompatParcelizer;
        long[] jArr3 = this.MediaBrowserCompatItemReceiver;
        int i = this.read;
        int[] iArr = new int[i];
        read(p0);
        long[] jArr4 = this.write;
        Object[] objArr3 = this.AudioAttributesCompatParcelizer;
        long[] jArr5 = this.MediaBrowserCompatItemReceiver;
        int i2 = this.read;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iWrite = write(i4 >>> 7);
                long j = i4 & 127;
                int i5 = iWrite >> 3;
                int i6 = (iWrite & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i5] & (~(255 << i6))) | (j << i6);
                jArr4[i5] = j2;
                jArr4[(((iWrite - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[iWrite] = obj;
                jArr5[iWrite] = jArr3[i3];
                iArr[i3] = iWrite;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i3++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        RemoteActionCompatParcelizer(iArr);
    }

    private final void read(long[] p0) {
        int i;
        long[] jArr = this.MediaBrowserCompatItemReceiver;
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = Integer.MAX_VALUE;
            if (i3 >= length) {
                break;
            }
            long j = jArr[i3];
            int i5 = (int) ((j >> 31) & 2147483647L);
            int i6 = (int) (j & 2147483647L);
            long j2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) p0[i5];
            if (i6 == Integer.MAX_VALUE) {
                i = i3;
            } else {
                long j3 = ((long) i2) << 32;
                i = i3;
                long j4 = -1;
                i4 = (int) (((j4 - ((j4 >> 63) << 32)) | j3) & p0[i6]);
            }
            jArr[i] = ((long) i4) | (((j & (-4611686018427387904L)) | j2) << 31);
            i3 = i + 1;
            i2 = 0;
        }
        if (this.IconCompatParcelizer != Integer.MAX_VALUE) {
            this.IconCompatParcelizer = (int) p0[this.IconCompatParcelizer];
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != Integer.MAX_VALUE) {
            this.MediaBrowserCompatCustomActionResultReceiver = (int) p0[this.MediaBrowserCompatCustomActionResultReceiver];
        }
    }

    private final void RemoteActionCompatParcelizer(int[] p0) {
        long[] jArr = this.MediaBrowserCompatItemReceiver;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & 2147483647L);
            int i4 = (int) (j & 2147483647L);
            long j2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p0[i3];
            if (i4 != Integer.MAX_VALUE) {
                i2 = p0[i4];
            }
            jArr[i] = (((j & (-4611686018427387904L)) | j2) << 31) | ((long) i2);
            i++;
        }
        if (this.IconCompatParcelizer != Integer.MAX_VALUE) {
            this.IconCompatParcelizer = p0[this.IconCompatParcelizer];
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != Integer.MAX_VALUE) {
            this.MediaBrowserCompatCustomActionResultReceiver = p0[this.MediaBrowserCompatCustomActionResultReceiver];
        }
    }

    public final Set<E> AudioAttributesCompatParcelizer() {
        return new setCompoundDrawablesRelative(this);
    }

    private void IconCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            MediaBrowserCompatCustomActionResultReceiver(it.next());
        }
    }

    private void write(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
    }

    private final int read(E p0) {
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.read;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.write;
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
                int iWrite = write(i2);
                if (this.write == 0 && ((this.write[iWrite >> 3] >> ((iWrite & 7) << 3)) & 255) != 254) {
                    AudioAttributesImplApi26Parcelizer();
                    iWrite = write(i2);
                }
                this.RemoteActionCompatParcelizer++;
                int i10 = iWrite >> 3;
                int i11 = (iWrite & 7) << 3;
                this.write -= ((this.write[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.write;
                int i12 = this.read;
                long j5 = (j2 << i11) | ((~(255 << i11)) & jArr2[i10]);
                jArr2[i10] = j5;
                jArr2[(((iWrite - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return iWrite;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public setCustomSelectionActionModeCallback() {
        this(0, 1, null);
    }
}
