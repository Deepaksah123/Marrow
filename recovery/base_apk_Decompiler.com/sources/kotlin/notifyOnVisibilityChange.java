package kotlin;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\r"}, d2 = {"Lo/notifyOnVisibilityChange;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class notifyOnVisibilityChange {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7 | i5);
        int i9 = (~(i7 | (~i5))) | (~(i5 | i3));
        int i10 = (~(i3 | i6)) | i5;
        int i11 = i5 + i6 + i2 + ((-407681510) * i) + ((-298114539) * i4);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i5) + 672923648 + (2103481690 * i6) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i2) + ((-328728576) * i) + ((-2108424192) * i4) + ((-1296629760) * i12);
        int i14 = ((i5 * 57881544) - 1472685786) + (i6 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i2 * 57881749) + (i * 289608994) + (i4 * 969284153) + (i12 * 813891584);
        int i15 = i13 + (i14 * i14 * 454098944);
        return i15 != 1 ? i15 != 2 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : read(objArr);
    }

    private notifyOnVisibilityChange(String str) {
        this.IconCompatParcelizer = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ notifyOnVisibilityChange(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0) {
            int i2 = AudioAttributesCompatParcelizer;
            int i3 = i2 & 23;
            int i4 = (i2 | 23) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            read = i7;
            int i8 = i6 % 2;
            int i9 = (i7 ^ 57) + ((i7 & 57) << 1);
            AudioAttributesCompatParcelizer = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        notifyOnVisibilityChange notifyonvisibilitychange = (notifyOnVisibilityChange) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 + 17;
        read = i3 % 128;
        int i4 = i3 % 2;
        String str = notifyonvisibilitychange.IconCompatParcelizer;
        int i5 = i2 | 111;
        int i6 = ((i5 << 1) - (~(-((~(i2 & 111)) & i5)))) - 1;
        read = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public notifyOnVisibilityChange() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        int iWrite = Identity.write();
        int iWrite2 = Identity.write();
        return ((Boolean) read(Identity.write(), iWrite2, iWrite, Identity.write(), new Object[]{this, p0}, 306959644, -306959643)).booleanValue();
    }

    public final String write() {
        int iWrite = Identity.write();
        int iWrite2 = Identity.write();
        return (String) read(Identity.write(), iWrite2, iWrite, Identity.write(), new Object[]{this}, 713814684, -713814684);
    }

    public final int hashCode() {
        int iWrite = Identity.write();
        int iWrite2 = Identity.write();
        return ((Integer) read(Identity.write(), iWrite2, iWrite, Identity.write(), new Object[]{this}, -1159085938, 1159085940)).intValue();
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("notifyOnVisibilityChange(IconCompatParcelizer=");
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        read = i6 % 128;
        int i7 = i6 % 2;
        sb.append(str);
        sb.append(")");
        if (i7 != 0) {
            string = sb.toString();
            int i8 = 77 / 0;
        } else {
            string = sb.toString();
        }
        int i9 = read;
        int i10 = ((((i9 ^ 29) | (i9 & 29)) << 1) - (~(-(((~i9) & 29) | (i9 & (-30)))))) - 1;
        AudioAttributesCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 60);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i != 156) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.IconCompatParcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.IconCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        notifyOnVisibilityChange notifyonvisibilitychange = (notifyOnVisibilityChange) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 61;
        int i4 = ((i2 ^ 61) | i3) << 1;
        int i5 = -((i2 | 61) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        read = i7;
        int i8 = i6 % 2;
        if (notifyonvisibilitychange == obj) {
            int i9 = i7 & 7;
            int i10 = i9 + ((i7 ^ 7) | i9);
            AudioAttributesCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (!(obj instanceof notifyOnVisibilityChange)) {
            int i12 = (i7 & 26) + (i7 | 26);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            int i14 = i13 % 128;
            AudioAttributesCompatParcelizer = i14;
            int i15 = i13 % 2;
            int i16 = (i14 ^ 35) + ((i14 & 35) << 1);
            read = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        String str = notifyonvisibilitychange.IconCompatParcelizer;
        String str2 = ((notifyOnVisibilityChange) obj).IconCompatParcelizer;
        int i18 = i7 + 123;
        AudioAttributesCompatParcelizer = i18 % 128;
        if (i18 % 2 == 0) {
            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i19 = AudioAttributesCompatParcelizer;
            int i20 = ((i19 | 29) << 1) - (i19 ^ 29);
            read = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }
        int i22 = read;
        int i23 = i22 ^ 99;
        int i24 = ((((i22 & 99) | i23) << 1) - (~(-i23))) - 1;
        AudioAttributesCompatParcelizer = i24 % 128;
        int i25 = i24 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r0 = r2.hashCode();
        java.lang.System.identityHashCode(r5);
        kotlin.Identity.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = r3 & 111;
        r5 = ((((r3 ^ 111) | r2) << 1) - (~(-((~r2) & (r3 | 111))))) - 1;
        kotlin.notifyOnVisibilityChange.read = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            o.notifyOnVisibilityChange r5 = (kotlin.notifyOnVisibilityChange) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.notifyOnVisibilityChange.read
            int r2 = r2 + 10
            r2 = r2 ^ (-1)
            int r2 = (-2) - r2
            int r3 = r2 % 128
            kotlin.notifyOnVisibilityChange.AudioAttributesCompatParcelizer = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L1f
            java.lang.String r2 = r5.IconCompatParcelizer
            r4 = 72
            int r4 = r4 / r0
            if (r2 != 0) goto L3d
            goto L23
        L1f:
            java.lang.String r2 = r5.IconCompatParcelizer
            if (r2 != 0) goto L3d
        L23:
            r5 = r3 ^ 111(0x6f, float:1.56E-43)
            r2 = r3 & 111(0x6f, float:1.56E-43)
            r5 = r5 | r2
            int r5 = r5 << 1
            int r2 = ~r2
            r3 = r3 | 111(0x6f, float:1.56E-43)
            r2 = r2 & r3
            int r2 = -r2
            int r2 = ~r2
            int r5 = r5 - r2
            int r5 = r5 + (-1)
            int r2 = r5 % 128
            kotlin.notifyOnVisibilityChange.read = r2
            int r5 = r5 % r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L3d:
            int r0 = r2.hashCode()
            java.lang.System.identityHashCode(r5)
            kotlin.Identity.write()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.notifyOnVisibilityChange.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }
}
