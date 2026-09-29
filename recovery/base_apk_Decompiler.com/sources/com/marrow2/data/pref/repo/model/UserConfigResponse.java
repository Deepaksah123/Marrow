package com.marrow2.data.pref.repo.model;

import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.sendRemoveDownload;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/marrow2/data/pref/repo/model/UserConfigResponse;", "", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/marrow2/data/pref/repo/model/UserConfigResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "showPearlDeletionPopup", "Z", "getShowPearlDeletionPopup"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserConfigResponse {
    public static final int $stable = 0;
    private boolean showPearlDeletionPopup;

    public UserConfigResponse(boolean z) {
        this.showPearlDeletionPopup = z;
    }

    public /* synthetic */ UserConfigResponse(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getShowPearlDeletionPopup() {
        return this.showPearlDeletionPopup;
    }

    public UserConfigResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ UserConfigResponse copy$default(UserConfigResponse userConfigResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userConfigResponse.showPearlDeletionPopup;
        }
        return userConfigResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowPearlDeletionPopup() {
        return this.showPearlDeletionPopup;
    }

    public final UserConfigResponse copy(boolean p0) {
        return new UserConfigResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof UserConfigResponse) && this.showPearlDeletionPopup == ((UserConfigResponse) p0).showPearlDeletionPopup;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showPearlDeletionPopup);
    }

    public final String toString() {
        boolean z = this.showPearlDeletionPopup;
        StringBuilder sb = new StringBuilder("UserConfigResponse(showPearlDeletionPopup=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 139);
        downloadHelper2.write(this.showPearlDeletionPopup);
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
        if (i != 60) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.showPearlDeletionPopup = ((Boolean) setdownloadingstatestoqueued.read(Boolean.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).booleanValue();
        } else {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }
}
