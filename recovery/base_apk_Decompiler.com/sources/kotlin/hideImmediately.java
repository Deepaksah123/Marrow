package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/hideImmediately;", "", "Lo/isFullyVisible;", "p0", "<init>", "(Lo/isFullyVisible;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/isFullyVisible;", "write", "()Lo/isFullyVisible;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hideImmediately {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private isFullyVisible read;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i6 | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i5));
        int i13 = i5 + i3 + i2 + (513088896 * i4) + ((-1342203445) * i);
        int i14 = i13 * i13;
        int i15 = (665020156 * i5) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i2) + ((-771751936) * i4) + (1382285312 * i) + ((-350355456) * i14);
        int i16 = ((i5 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i2 * (-363641803)) + (i4 * (-2127225984)) + (i * (-1080704249)) + (i14 * (-1523187712));
        int i17 = i15 + (i16 * i16 * (-227409920));
        return i17 != 1 ? i17 != 2 ? read(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private hideImmediately(isFullyVisible isfullyvisible) {
        toMagicModuleMetaRepoModel.write(isfullyvisible, "");
        this.read = isfullyvisible;
    }

    public /* synthetic */ hideImmediately(isFullyVisible isfullyvisible, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        isFullyVisible isfullyvisible2;
        if ((i & 1) != 0) {
            isfullyvisible2 = new isFullyVisible(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
            int i2 = write;
            int i3 = ((i2 & 118) + (i2 | 118)) - 1;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 ^ 95;
            int i6 = ((i2 & 95) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            isfullyvisible2 = isfullyvisible;
        }
        this(isfullyvisible2);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        hideImmediately hideimmediately = (hideImmediately) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        write = i3 % 128;
        int i4 = i3 % 2;
        isFullyVisible isfullyvisible = hideimmediately.read;
        int i5 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i6 = -(((~i2) & 91) | (i2 & (-92)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        write = i7 % 128;
        if (i7 % 2 != 0) {
            return isfullyvisible;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hideImmediately() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return ((Boolean) read(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 1707103608, iWrite3, -1707103606, new Object[]{this, p0}, iWrite)).booleanValue();
    }

    public final isFullyVisible write() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (isFullyVisible) read(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 23305950, iWrite3, -23305950, new Object[]{this}, iWrite);
    }

    public final int hashCode() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return ((Integer) read(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1238251008, iWrite3, 1238251009, new Object[]{this}, iWrite)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        isFullyVisible isfullyvisible = this.read;
        StringBuilder sb = new StringBuilder("hideImmediately(read=");
        int i2 = IconCompatParcelizer;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        write = i5 % 128;
        int i6 = i5 % 2;
        sb.append(isfullyvisible);
        sb.append(")");
        String string = sb.toString();
        maybeInvalidateForRendererCapabilitiesChange.write();
        System.identityHashCode(this);
        return string;
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        read(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.read) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 128);
            isFullyVisible isfullyvisible = this.read;
            sendSetRequirements.write(setdownloadingstatestoqueued, isFullyVisible.class, isfullyvisible).read(downloadHelper2, isfullyvisible);
        }
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i != 35) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.read = (isFullyVisible) setdownloadingstatestoqueued.read(isFullyVisible.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        } else {
            this.read = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        hideImmediately hideimmediately = (hideImmediately) objArr[0];
        int i = 2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int i2 = -(-((~(((-283137) & iWrite) | ((-283137) ^ iWrite))) * (-301)));
        int i3 = ((76661106 ^ i2) - (~(-(-((i2 & 76661106) << 1))))) - 1;
        int i4 = ~iWrite;
        int i5 = (940334922 & i4) | (iWrite & (-940334923)) | (940334922 & iWrite);
        int i6 = (i5 | (~i5)) & (~i5);
        int i7 = (i4 | iWrite) & (~iWrite);
        int i8 = (i7 & (-1014509040)) | ((~i7) & 1014509039);
        int i9 = i7 & 1014509039;
        int i10 = (i9 & i8) | (i8 ^ i9);
        int i11 = (i10 | (~i10)) & (~i10);
        int i12 = ((~i11) & i6) | ((~i6) & i11);
        int i13 = i11 & i6;
        int i14 = (i3 - (~(-(~(((i13 & i12) | (i12 ^ i13)) * (-301)))))) - 2;
        int i15 = (-1014509040) & iWrite;
        int i16 = (iWrite | (-1014509040)) & (~i15);
        int i17 = (i16 & i15) | (i16 ^ i15);
        int i18 = (i17 | (~i17)) & (~i17);
        int i19 = ((~i18) & 940334922) | (i18 & (-940334923));
        int i20 = i18 & 940334922;
        int i21 = ((i20 & i19) | (i19 ^ i20)) * 301;
        int i22 = i14 & i21;
        int i23 = (((i14 ^ i21) | i22) << 1) - ((i21 | i14) & (~i22));
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int i24 = ~(((-545308802) & iWrite2) | ((-545308802) ^ iWrite2));
        int i25 = (-38805101) & iWrite2;
        int i26 = ((-38805101) | iWrite2) & (~i25);
        int i27 = ~((i26 & i25) | (i26 ^ i25));
        int i28 = -(~(((i24 & i27) | (i24 ^ i27)) * 69));
        int i29 = (((-1142687686) ^ i28) + ((i28 & (-1142687686)) << 1)) - 1;
        int i30 = (-2108678274) & iWrite2;
        int i31 = ((-2108678274) | iWrite2) & (~i30);
        int i32 = (i31 & i30) | (i31 ^ i30);
        int i33 = (i32 | (~i32)) & (~i32);
        int i34 = ((~i33) & 1563369472) | ((-1563369473) & i33);
        int i35 = i33 & 1563369472;
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = (iWrite2 & (-1602174573)) | ((-1602174573) ^ iWrite2);
        int i38 = (i37 | (~i37)) & (~i37);
        int i39 = i36 ^ i38;
        int i40 = i38 & i36;
        int i41 = ((i40 & i39) | (i39 ^ i40)) * (-69);
        int i42 = (i29 | i41) << 1;
        int i43 = -(i41 ^ i29);
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int i45 = (i44 & (-2147464741)) + ((-2147464741) | i44);
        int i46 = (i45 ^ (-1)) + (i45 << 1);
        int iHashCode = hideimmediately.read.hashCode();
        if (i23 > i46) {
            int i47 = 76 / 0;
        }
        int i48 = IconCompatParcelizer + 48;
        int i49 = (i48 ^ (-1)) + (i48 << 1);
        write = i49 % 128;
        int i50 = i49 % 2;
        return Integer.valueOf(iHashCode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if ((r9 instanceof kotlin.hideImmediately) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2.read, ((kotlin.hideImmediately) r9).read)) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r9 = kotlin.hideImmediately.IconCompatParcelizer;
        r2 = r9 & 57;
        r2 = (r2 - (~((r9 ^ 57) | r2))) - 1;
        kotlin.hideImmediately.write = r2 % 128;
        r2 = r2 % 2;
        r2 = r9 & 51;
        r9 = r9 | 51;
        r3 = (r2 & r9) + (r9 | r2);
        kotlin.hideImmediately.write = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if ((r3 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r9 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r9 = kotlin.hideImmediately.write;
        r0 = (r9 ^ 44) + ((r9 & 44) << 1);
        r9 = (r0 ^ (-1)) + (r0 << 1);
        kotlin.hideImmediately.IconCompatParcelizer = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        r9 = r6 & 15;
        r0 = (r6 ^ 15) | r9;
        r2 = (r9 ^ r0) + ((r9 & r0) << 1);
        r9 = r2 % 128;
        kotlin.hideImmediately.write = r9;
        r2 = r2 % 2;
        r0 = r9 & 75;
        r9 = (r9 ^ 75) | r0;
        r2 = (r0 ^ r9) + ((r9 & r0) << 1);
        kotlin.hideImmediately.IconCompatParcelizer = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        if ((r2 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r2 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r2 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r0 = r8 & 21;
        r9 = ((r8 ^ 21) | r0) << 1;
        r0 = -((~r0) & (r8 | 21));
        r1 = (r9 & r0) + (r9 | r0);
        kotlin.hideImmediately.IconCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r9) {
        /*
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = r9[r0]
            o.hideImmediately r2 = (kotlin.hideImmediately) r2
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r9 = r9[r3]
            r5 = r9
            java.lang.Object r5 = (java.lang.Object) r5
            r5 = 2
            int r6 = r5 % r5
            int r6 = kotlin.hideImmediately.IconCompatParcelizer
            r7 = r6 & 5
            r8 = r6 ^ 5
            r8 = r8 | r7
            int r7 = r7 + r8
            int r8 = r7 % 128
            kotlin.hideImmediately.write = r8
            int r7 = r7 % r5
            if (r7 != 0) goto L2b
            r7 = 70
            int r7 = r7 / r0
            if (r2 != r9) goto L42
            goto L2d
        L2b:
            if (r2 != r9) goto L42
        L2d:
            r9 = r8 ^ 21
            r0 = r8 & 21
            r9 = r9 | r0
            int r9 = r9 << r3
            int r0 = ~r0
            r1 = r8 | 21
            r0 = r0 & r1
            int r0 = -r0
            r1 = r9 & r0
            r9 = r9 | r0
            int r1 = r1 + r9
            int r9 = r1 % 128
            kotlin.hideImmediately.IconCompatParcelizer = r9
            int r1 = r1 % r5
            return r4
        L42:
            boolean r7 = r9 instanceof kotlin.hideImmediately
            if (r7 == 0) goto L87
            o.hideImmediately r9 = (kotlin.hideImmediately) r9
            o.isFullyVisible r2 = r2.read
            o.isFullyVisible r9 = r9.read
            boolean r9 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r9)
            r9 = r9 ^ r3
            if (r9 == 0) goto L75
            int r9 = kotlin.hideImmediately.IconCompatParcelizer
            r2 = r9 & 57
            r4 = r9 ^ 57
            r4 = r4 | r2
            int r4 = ~r4
            int r2 = r2 - r4
            int r2 = r2 - r3
            int r3 = r2 % 128
            kotlin.hideImmediately.write = r3
            int r2 = r2 % r5
            r2 = r9 & 51
            r9 = r9 | 51
            r3 = r2 & r9
            r9 = r9 | r2
            int r3 = r3 + r9
            int r9 = r3 % 128
            kotlin.hideImmediately.write = r9
            int r3 = r3 % r5
            if (r3 != 0) goto L74
            r9 = 84
            int r9 = r9 / r0
        L74:
            return r1
        L75:
            int r9 = kotlin.hideImmediately.write
            r0 = r9 ^ 44
            r9 = r9 & 44
            int r9 = r9 << r3
            int r0 = r0 + r9
            r9 = r0 ^ (-1)
            int r0 = r0 << r3
            int r9 = r9 + r0
            int r0 = r9 % 128
            kotlin.hideImmediately.IconCompatParcelizer = r0
            int r9 = r9 % r5
            return r4
        L87:
            r9 = r6 & 15
            r0 = r6 ^ 15
            r0 = r0 | r9
            r2 = r9 ^ r0
            r9 = r9 & r0
            int r9 = r9 << r3
            int r2 = r2 + r9
            int r9 = r2 % 128
            kotlin.hideImmediately.write = r9
            int r2 = r2 % r5
            r0 = r9 & 75
            r9 = r9 ^ 75
            r9 = r9 | r0
            r2 = r0 ^ r9
            r9 = r9 & r0
            int r9 = r9 << r3
            int r2 = r2 + r9
            int r9 = r2 % 128
            kotlin.hideImmediately.IconCompatParcelizer = r9
            int r2 = r2 % r5
            if (r2 != 0) goto La8
            return r1
        La8:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hideImmediately.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }
}
