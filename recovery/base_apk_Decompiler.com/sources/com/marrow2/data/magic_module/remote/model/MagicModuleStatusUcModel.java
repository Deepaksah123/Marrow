package com.marrow2.data.magic_module.remote.model;

import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.Metadata;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetStopReason;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(IIILjava/lang/String;)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(IIILjava/lang/String;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "modulesCompleted", "I", "getModulesCompleted", "correctCount", "getCorrectCount", "needRevision", "getNeedRevision", "moduleId", "Ljava/lang/String;", "getModuleId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleStatusUcModel {
    public static final int $stable = 0;
    private int correctCount;
    private String moduleId;
    private int modulesCompleted;
    private int needRevision;

    public MagicModuleStatusUcModel(int i, int i2, int i3, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.modulesCompleted = i;
        this.correctCount = i2;
        this.needRevision = i3;
        this.moduleId = str;
    }

    public final int getModulesCompleted() {
        return this.modulesCompleted;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final int getNeedRevision() {
        return this.needRevision;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public static /* synthetic */ MagicModuleStatusUcModel copy$default(MagicModuleStatusUcModel magicModuleStatusUcModel, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = magicModuleStatusUcModel.modulesCompleted;
        }
        if ((i4 & 2) != 0) {
            i2 = magicModuleStatusUcModel.correctCount;
        }
        if ((i4 & 4) != 0) {
            i3 = magicModuleStatusUcModel.needRevision;
        }
        if ((i4 & 8) != 0) {
            str = magicModuleStatusUcModel.moduleId;
        }
        return magicModuleStatusUcModel.copy(i, i2, i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getModulesCompleted() {
        return this.modulesCompleted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNeedRevision() {
        return this.needRevision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    public final MagicModuleStatusUcModel copy(int p0, int p1, int p2, String p3) {
        toMagicModuleMetaRepoModel.write(p3, "");
        return new MagicModuleStatusUcModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleStatusUcModel)) {
            return false;
        }
        MagicModuleStatusUcModel magicModuleStatusUcModel = (MagicModuleStatusUcModel) p0;
        return this.modulesCompleted == magicModuleStatusUcModel.modulesCompleted && this.correctCount == magicModuleStatusUcModel.correctCount && this.needRevision == magicModuleStatusUcModel.needRevision && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.moduleId, (Object) magicModuleStatusUcModel.moduleId);
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.modulesCompleted) * 31) + Integer.hashCode(this.correctCount)) * 31) + Integer.hashCode(this.needRevision)) * 31) + this.moduleId.hashCode();
    }

    public final String toString() {
        int i = this.modulesCompleted;
        int i2 = this.correctCount;
        int i3 = this.needRevision;
        String str = this.moduleId;
        StringBuilder sb = new StringBuilder("MagicModuleStatusUcModel(modulesCompleted=");
        sb.append(i);
        sb.append(", correctCount=");
        sb.append(i2);
        sb.append(", needRevision=");
        sb.append(i3);
        sb.append(", moduleId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 113);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.correctCount));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 99);
        downloadHelper2.AudioAttributesCompatParcelizer(this.moduleId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 64);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.modulesCompleted));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 3);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.needRevision));
    }

    public /* synthetic */ MagicModuleStatusUcModel() {
    }

    public final /* synthetic */ void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 30) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.correctCount = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 82) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.modulesCompleted = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
        if (i == 167) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.needRevision = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e3) {
                throw new getPercentDownloaded(e3);
            }
        }
        if (i != 179) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.moduleId = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.moduleId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.moduleId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
