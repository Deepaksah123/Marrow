package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.WalletConstantsBillingAddressFormat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/StyledPlayerControlViewSettingViewHolder;", "", "", "Lo/onFullScreenModeChanged;", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/List;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StyledPlayerControlViewSettingViewHolder {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<onFullScreenModeChanged> IconCompatParcelizer;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i6)) | i;
        int i9 = ~i;
        int i10 = ~(i9 | i6 | i5);
        int i11 = (~(i5 | i9)) | i6 | (~(i7 | i));
        int i12 = i6 + i + i4 + ((-381402339) * i3) + ((-2062754392) * i2);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i6) + 1063714816 + (1288888451 * i) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i4) + (1454768128 * i3) + (808452096 * i2) + ((-1790509056) * i13);
        int i15 = ((i6 * (-1355236691)) - 921838429) + (i * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i4 * (-1355236397)) + (i3 * (-1583251481)) + (i2 * 1682205048) + (i13 * (-427491328));
        int i16 = i14 + (i15 * i15 * 844169216);
        return i16 != 1 ? i16 != 2 ? IconCompatParcelizer(objArr) : read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    private StyledPlayerControlViewSettingViewHolder(List<onFullScreenModeChanged> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
    }

    public /* synthetic */ StyledPlayerControlViewSettingViewHolder(List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder = (StyledPlayerControlViewSettingViewHolder) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        List<onFullScreenModeChanged> list = styledPlayerControlViewSettingViewHolder.IconCompatParcelizer;
        int i5 = (i2 ^ 27) + ((i2 & 27) << 1);
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerControlViewSettingViewHolder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(-621896666, new Object[]{this, p0}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, 621896666)).booleanValue();
    }

    public final List<onFullScreenModeChanged> RemoteActionCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        return (List) AudioAttributesCompatParcelizer(1561159178, new Object[]{this}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1561159177);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
        return ((Integer) AudioAttributesCompatParcelizer(407600322, new Object[]{this}, WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -407600320)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        List<onFullScreenModeChanged> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("StyledPlayerControlViewSettingViewHolder(IconCompatParcelizer=");
        sb.append(list);
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 17;
        int i4 = ((i2 ^ 17) | i3) << 1;
        int i5 = -((i2 | 17) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        sb.append(")");
        String string = sb.toString();
        int i8 = RemoteActionCompatParcelizer;
        int i9 = i8 ^ 85;
        int i10 = ((((i8 & 85) | i9) << 1) - (~(-i9))) - 1;
        IconCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.IconCompatParcelizer) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 68);
            StyledPlayerControlViewSettingViewHolderExternalSyntheticLambda0 styledPlayerControlViewSettingViewHolderExternalSyntheticLambda0 = new StyledPlayerControlViewSettingViewHolderExternalSyntheticLambda0();
            List<onFullScreenModeChanged> list = this.IconCompatParcelizer;
            sendSetRequirements.write(setdownloadingstatestoqueued, styledPlayerControlViewSettingViewHolderExternalSyntheticLambda0, list).read(downloadHelper2, list);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i != 150) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.IconCompatParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new StyledPlayerControlViewSettingViewHolderExternalSyntheticLambda0()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        } else {
            this.IconCompatParcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if (r9 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        if ((!r9) != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        r9 = kotlin.StyledPlayerControlViewSettingViewHolder.RemoteActionCompatParcelizer + 25;
        kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r9 = kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer + 105;
        kotlin.StyledPlayerControlViewSettingViewHolder.RemoteActionCompatParcelizer = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        return false;
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
            o.StyledPlayerControlViewSettingViewHolder r2 = (kotlin.StyledPlayerControlViewSettingViewHolder) r2
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r9 = r9[r3]
            r5 = r9
            java.lang.Object r5 = (java.lang.Object) r5
            r5 = 2
            int r6 = r5 % r5
            int r6 = kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer
            r7 = r6 ^ 9
            r8 = r6 & 9
            r7 = r7 | r8
            int r7 = r7 << r3
            int r8 = ~r8
            r6 = r6 | 9
            r6 = r6 & r8
            int r6 = -r6
            r8 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << r3
            int r8 = r8 + r6
            int r6 = r8 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.RemoteActionCompatParcelizer = r6
            int r8 = r8 % r5
            if (r2 != r9) goto L4f
            r9 = r6 & 103(0x67, float:1.44E-43)
            r0 = r6 ^ 103(0x67, float:1.44E-43)
            r0 = r0 | r9
            r1 = r9 & r0
            r9 = r9 | r0
            int r1 = r1 + r9
            int r9 = r1 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r9
            int r1 = r1 % r5
            r9 = r6 & 71
            r0 = r6 ^ 71
            r0 = r0 | r9
            int r0 = -r0
            int r0 = -r0
            r1 = r9 ^ r0
            r9 = r9 & r0
            int r9 = r9 << r3
            int r1 = r1 + r9
            int r9 = r1 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r9
            int r1 = r1 % r5
            return r4
        L4f:
            boolean r7 = r9 instanceof kotlin.StyledPlayerControlViewSettingViewHolder
            if (r7 != 0) goto L75
            r9 = r6 ^ 117(0x75, float:1.64E-43)
            r0 = r6 & 117(0x75, float:1.64E-43)
            r9 = r9 | r0
            int r9 = r9 << r3
            int r0 = ~r0
            r2 = r6 | 117(0x75, float:1.64E-43)
            r0 = r0 & r2
            int r0 = -r0
            r2 = r9 ^ r0
            r9 = r9 & r0
            int r9 = r9 << r3
            int r2 = r2 + r9
            int r9 = r2 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r9
            int r2 = r2 % r5
            r9 = r6 ^ 116(0x74, float:1.63E-43)
            r0 = r6 & 116(0x74, float:1.63E-43)
            int r0 = r0 << r3
            int r9 = r9 + r0
            int r9 = r9 - r3
            int r0 = r9 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r0
            int r9 = r9 % r5
            return r1
        L75:
            o.StyledPlayerControlViewSettingViewHolder r9 = (kotlin.StyledPlayerControlViewSettingViewHolder) r9
            java.util.List<o.onFullScreenModeChanged> r2 = r2.IconCompatParcelizer
            java.util.List<o.onFullScreenModeChanged> r9 = r9.IconCompatParcelizer
            r7 = r6 & 109(0x6d, float:1.53E-43)
            r6 = r6 ^ 109(0x6d, float:1.53E-43)
            r6 = r6 | r7
            r8 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << r3
            int r8 = r8 + r6
            int r6 = r8 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r6
            int r8 = r8 % r5
            boolean r9 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r9)
            if (r8 == 0) goto L96
            r2 = 66
            int r2 = r2 / r0
            if (r9 != 0) goto L99
            goto La3
        L96:
            r9 = r9 ^ r3
            if (r9 == r3) goto La3
        L99:
            int r9 = kotlin.StyledPlayerControlViewSettingViewHolder.RemoteActionCompatParcelizer
            int r9 = r9 + 25
            int r0 = r9 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer = r0
            int r9 = r9 % r5
            return r4
        La3:
            int r9 = kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer
            int r9 = r9 + 105
            int r0 = r9 % 128
            kotlin.StyledPlayerControlViewSettingViewHolder.RemoteActionCompatParcelizer = r0
            int r9 = r9 % r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StyledPlayerControlViewSettingViewHolder.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        StyledPlayerControlViewSettingViewHolder styledPlayerControlViewSettingViewHolder = (StyledPlayerControlViewSettingViewHolder) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 & 94) + (i2 | 94)) - 1;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = styledPlayerControlViewSettingViewHolder.IconCompatParcelizer.hashCode();
        int i5 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(iHashCode);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
