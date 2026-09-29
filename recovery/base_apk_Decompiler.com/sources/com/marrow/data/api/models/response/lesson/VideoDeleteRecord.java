package com.marrow.data.api.models.response.lesson;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u0019\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "videoId", "Ljava/lang/String;", "getVideoId", "editionId", "I", "getEditionId", "isShown", "Z", "()Z", "setShown", "(Z)V", "videoIdEditionId", "getVideoIdEditionId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoDeleteRecord {
    private final int editionId;
    private boolean isShown;
    private final String videoId;
    private final String videoIdEditionId;

    public VideoDeleteRecord(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.videoId = str;
        this.editionId = i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        this.videoIdEditionId = sb.toString();
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final int getEditionId() {
        return this.editionId;
    }

    /* JADX INFO: renamed from: isShown, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final void setShown(boolean z) {
        this.isShown = z;
    }

    public final String getVideoIdEditionId() {
        return this.videoIdEditionId;
    }

    public static /* synthetic */ VideoDeleteRecord copy$default(VideoDeleteRecord videoDeleteRecord, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoDeleteRecord.videoId;
        }
        if ((i2 & 2) != 0) {
            i = videoDeleteRecord.editionId;
        }
        return videoDeleteRecord.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEditionId() {
        return this.editionId;
    }

    public final VideoDeleteRecord copy(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new VideoDeleteRecord(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoDeleteRecord)) {
            return false;
        }
        VideoDeleteRecord videoDeleteRecord = (VideoDeleteRecord) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) videoDeleteRecord.videoId) && this.editionId == videoDeleteRecord.editionId;
    }

    public final int hashCode() {
        return (this.videoId.hashCode() * 31) + Integer.hashCode(this.editionId);
    }

    public final String toString() {
        String str = this.videoId;
        int i = this.editionId;
        StringBuilder sb = new StringBuilder("VideoDeleteRecord(videoId=");
        sb.append(str);
        sb.append(", editionId=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
