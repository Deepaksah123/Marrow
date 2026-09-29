package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.selectModule;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/updateSelectedIndex;", "", "", "Lo/updateTrackLists;", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/List;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class updateSelectedIndex {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<updateTrackLists> write;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~((~i3) | i7 | i5);
        int i9 = ~i5;
        int i10 = (~(i7 | i3)) | (~(i7 | i9)) | (~(i9 | i3));
        int i11 = (~(i9 | i)) | i3;
        int i12 = i + i3 + i2 + ((-946781377) * i6) + ((-59450693) * i4);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i) - 346488832) + (357422218 * i3) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i2) + ((-1205993472) * i6) + ((-1651113984) * i4) + ((-884408320) * i13);
        int i15 = ((i * 358501064) - 1042343473) + (i3 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i2 * 358500791) + (i6 * (-249165559)) + (i4 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        return i16 != 1 ? i16 != 2 ? read(objArr) : AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    private updateSelectedIndex(List<updateTrackLists> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ updateSelectedIndex(List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        List listRemoteActionCompatParcelizer;
        if ((i & 1) != 0) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 81;
            int i4 = -(-(i2 | 81));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            AudioAttributesCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                int i6 = 54 / 0;
            } else {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            int i7 = AudioAttributesCompatParcelizer;
            int i8 = i7 & 3;
            int i9 = (i8 - (~((i7 ^ 3) | i8))) - 1;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            list = listRemoteActionCompatParcelizer;
        }
        this(list);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        updateSelectedIndex updateselectedindex = (updateSelectedIndex) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 ^ 25;
        int i4 = ((i2 & 25) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        RemoteActionCompatParcelizer = i7;
        int i8 = i6 % 2;
        List<updateTrackLists> list = updateselectedindex.write;
        if (i8 != 0) {
            throw null;
        }
        int i9 = i7 + 66;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        AudioAttributesCompatParcelizer = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 21 / 0;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public updateSelectedIndex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        int iRemoteActionCompatParcelizer = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        return ((Boolean) write(16571521, iRemoteActionCompatParcelizer2, -16571519, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, new Object[]{this, p0})).booleanValue();
    }

    public final List<updateTrackLists> RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        return (List) write(-1215621208, iRemoteActionCompatParcelizer2, 1215621208, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, new Object[]{this});
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer();
        return ((Integer) write(-1408281685, iRemoteActionCompatParcelizer2, 1408281686, selectModule.IconCompatParcelizer.AnonymousClass3.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, new Object[]{this})).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        List<updateTrackLists> list = this.write;
        StringBuilder sb = new StringBuilder("updateSelectedIndex(write=");
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (((i2 ^ 13) | (i2 & 13)) << 1) - (((~i2) & 13) | (i2 & (-14)));
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i5 = RemoteActionCompatParcelizer;
        int i6 = i5 & 119;
        int i7 = ((i5 | 119) & (~i6)) + (i6 << 1);
        AudioAttributesCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.write) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 46);
            StyledPlayerControlViewPlaybackSpeedAdapter styledPlayerControlViewPlaybackSpeedAdapter = new StyledPlayerControlViewPlaybackSpeedAdapter();
            List<updateTrackLists> list = this.write;
            sendSetRequirements.write(setdownloadingstatestoqueued, styledPlayerControlViewPlaybackSpeedAdapter, list).read(downloadHelper2, list);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i != 129) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.write = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new StyledPlayerControlViewPlaybackSpeedAdapter()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        } else {
            this.write = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        updateSelectedIndex updateselectedindex = (updateSelectedIndex) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = ((i2 ^ 57) | (i2 & 57)) << 1;
        int i4 = -(((~i2) & 57) | (i2 & (-58)));
        int i5 = (i3 & i4) + (i4 | i3);
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = updateselectedindex.write.hashCode();
        int i7 = AudioAttributesCompatParcelizer;
        int i8 = (i7 ^ 93) + ((i7 & 93) << 1);
        RemoteActionCompatParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            return Integer.valueOf(iHashCode);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        updateSelectedIndex updateselectedindex = (updateSelectedIndex) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 + 111;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (updateselectedindex == obj) {
            int i5 = i2 + 107;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof updateSelectedIndex)) {
            int i7 = (((i2 & (-46)) | ((~i2) & 45)) - (~((i2 & 45) << 1))) - 1;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i2 & 9;
            int i10 = (((~i9) & (i2 | 9)) - (~(i9 << 1))) - 1;
            RemoteActionCompatParcelizer = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updateselectedindex.write, ((updateSelectedIndex) obj).write))) {
            int i11 = AudioAttributesCompatParcelizer;
            int i12 = i11 & 55;
            int i13 = ((i11 | 55) & (~i12)) + (i12 << 1);
            RemoteActionCompatParcelizer = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 99 / 0;
            }
            return true;
        }
        int i15 = RemoteActionCompatParcelizer;
        int i16 = i15 + 85;
        AudioAttributesCompatParcelizer = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 & 101;
        int i19 = i18 + ((i15 ^ 101) | i18);
        AudioAttributesCompatParcelizer = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }
}
