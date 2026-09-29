package com.marrow2.data.pref.repo.model;

import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.sendRemoveDownload;
import kotlin.sendSetStopReason;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/pref/repo/model/UpgradeContentRepoModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "description", "Ljava/lang/String;", "getDescription", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpgradeContentRepoModel {
    public static final int $stable = 0;
    private String description;
    private String title;

    public UpgradeContentRepoModel(String str, String str2) {
        this.description = str;
        this.title = str2;
    }

    public /* synthetic */ UpgradeContentRepoModel(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpgradeContentRepoModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpgradeContentRepoModel copy$default(UpgradeContentRepoModel upgradeContentRepoModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeContentRepoModel.description;
        }
        if ((i & 2) != 0) {
            str2 = upgradeContentRepoModel.title;
        }
        return upgradeContentRepoModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final UpgradeContentRepoModel copy(String p0, String p1) {
        return new UpgradeContentRepoModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpgradeContentRepoModel)) {
            return false;
        }
        UpgradeContentRepoModel upgradeContentRepoModel = (UpgradeContentRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) upgradeContentRepoModel.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) upgradeContentRepoModel.title);
    }

    public final int hashCode() {
        String str = this.description;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("UpgradeContentRepoModel(description=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 9);
        downloadHelper2.AudioAttributesCompatParcelizer(this.description);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 73);
        downloadHelper2.AudioAttributesCompatParcelizer(this.title);
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            write(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 31) {
            if (!z) {
                this.description = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.description = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.description = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 130) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.title = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.title = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.title = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
