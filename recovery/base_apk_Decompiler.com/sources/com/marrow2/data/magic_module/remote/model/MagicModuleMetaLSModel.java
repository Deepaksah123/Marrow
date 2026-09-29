package com.marrow2.data.magic_module.remote.model;

import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!Jx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0013R\u0017\u0010(\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0013R\u001a\u0010-\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010\u0016R\u001a\u0010/\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001aR\u001a\u00105\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u001aR\u001a\u00107\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010\u0018R\u001a\u00109\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010\u001aR\u001c\u0010;\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001fR\u001c\u0010>\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010!"}, d2 = {"Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaLSModel;", "", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJIIJILjava/lang/Long;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()J", "component5", "()I", "component6", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZJIIJILjava/lang/Long;Ljava/lang/Integer;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaLSModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "isFirstModule", "Z", "createdOn", "J", "getCreatedOn", "mcqCount", "I", "getMcqCount", "status", "getStatus", "submittedOn", "getSubmittedOn", "correctCount", "getCorrectCount", "pausedModuleDate", "Ljava/lang/Long;", "getPausedModuleDate", "errorCode", "Ljava/lang/Integer;", "getErrorCode"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleMetaLSModel {
    public static final int $stable = 0;
    private int correctCount;
    private long createdOn;
    private Integer errorCode;
    private String id;
    private boolean isFirstModule;
    private int mcqCount;
    private Long pausedModuleDate;
    private int status;
    private long submittedOn;
    private String title;

    public MagicModuleMetaLSModel(String str, String str2, boolean z, long j, int i, int i2, long j2, int i3, Long l, Integer num) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.title = str2;
        this.isFirstModule = z;
        this.createdOn = j;
        this.mcqCount = i;
        this.status = i2;
        this.submittedOn = j2;
        this.correctCount = i3;
        this.pausedModuleDate = l;
        this.errorCode = num;
    }

    public /* synthetic */ MagicModuleMetaLSModel(String str, String str2, boolean z, long j, int i, int i2, long j2, int i3, Long l, Integer num, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, z, j, i, i2, j2, i3, (i4 & 256) != 0 ? null : l, (i4 & 512) != 0 ? null : num);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isFirstModule() {
        return this.isFirstModule;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final Long getPausedModuleDate() {
        return this.pausedModuleDate;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFirstModule() {
        return this.isFirstModule;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreatedOn() {
        return this.createdOn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getPausedModuleDate() {
        return this.pausedModuleDate;
    }

    public final MagicModuleMetaLSModel copy(String p0, String p1, boolean p2, long p3, int p4, int p5, long p6, int p7, Long p8, Integer p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new MagicModuleMetaLSModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleMetaLSModel)) {
            return false;
        }
        MagicModuleMetaLSModel magicModuleMetaLSModel = (MagicModuleMetaLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleMetaLSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) magicModuleMetaLSModel.title) && this.isFirstModule == magicModuleMetaLSModel.isFirstModule && this.createdOn == magicModuleMetaLSModel.createdOn && this.mcqCount == magicModuleMetaLSModel.mcqCount && this.status == magicModuleMetaLSModel.status && this.submittedOn == magicModuleMetaLSModel.submittedOn && this.correctCount == magicModuleMetaLSModel.correctCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pausedModuleDate, magicModuleMetaLSModel.pausedModuleDate) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.errorCode, magicModuleMetaLSModel.errorCode);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isFirstModule);
        int iHashCode4 = Long.hashCode(this.createdOn);
        int iHashCode5 = Integer.hashCode(this.mcqCount);
        int iHashCode6 = Integer.hashCode(this.status);
        int iHashCode7 = Long.hashCode(this.submittedOn);
        int iHashCode8 = Integer.hashCode(this.correctCount);
        Long l = this.pausedModuleDate;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Integer num = this.errorCode;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z = this.isFirstModule;
        long j = this.createdOn;
        int i = this.mcqCount;
        int i2 = this.status;
        long j2 = this.submittedOn;
        int i3 = this.correctCount;
        Long l = this.pausedModuleDate;
        Integer num = this.errorCode;
        StringBuilder sb = new StringBuilder("MagicModuleMetaLSModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", isFirstModule=");
        sb.append(z);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", submittedOn=");
        sb.append(j2);
        sb.append(", correctCount=");
        sb.append(i3);
        sb.append(", pausedModuleDate=");
        sb.append(l);
        sb.append(", errorCode=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 113);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.correctCount));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 78);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.createdOn);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 160);
        Integer num = this.errorCode;
        sendSetRequirements.write(setdownloadingstatestoqueued, Integer.class, num).read(downloadHelper2, num);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 47);
        downloadHelper2.AudioAttributesCompatParcelizer(this.id);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 45);
        downloadHelper2.write(this.isFirstModule);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 40);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.mcqCount));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 80);
        Long l = this.pausedModuleDate;
        sendSetRequirements.write(setdownloadingstatestoqueued, Long.class, l).read(downloadHelper2, l);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 89);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.status));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 112);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(this.submittedOn);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 73);
        downloadHelper2.AudioAttributesCompatParcelizer(this.title);
    }

    public /* synthetic */ MagicModuleMetaLSModel() {
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
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
        if (i == 40) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.mcqCount = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
        if (i == 44) {
            if (z) {
                this.submittedOn = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 63) {
            if (z) {
                this.errorCode = (Integer) setdownloadingstatestoqueued.read(Integer.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.errorCode = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 75) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.status = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e3) {
                throw new getPercentDownloaded(e3);
            }
        }
        if (i == 120) {
            if (z) {
                this.createdOn = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 124) {
            if (z) {
                this.isFirstModule = ((Boolean) setdownloadingstatestoqueued.read(Boolean.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).booleanValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 130) {
            if (!z) {
                this.title = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.title = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.title = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 159) {
            if (i != 163) {
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                return;
            } else if (z) {
                this.pausedModuleDate = (Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.pausedModuleDate = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (!z) {
            this.id = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.id = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.id = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
