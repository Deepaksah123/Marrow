package com.marrow.data.models.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&"}, d2 = {"Lcom/marrow/data/models/video/VideoSubtitle;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/marrow/data/models/video/VideoSubtitle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "subtitleEnc", "Ljava/lang/String;", "getSubtitleEnc", "subtitleId", "getSubtitleId", "remoteLastUpdated", "J", "getRemoteLastUpdated", "lessonId", "getLessonId", "setLessonId", "(Ljava/lang/String;)V", "lastSyncTimeMs", "getLastSyncTimeMs", "setLastSyncTimeMs", "(J)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoSubtitle {
    private long lastSyncTimeMs;
    private String lessonId;

    @isFirst(RemoteActionCompatParcelizer = "last_updated")
    private final long remoteLastUpdated;

    @isFirst(RemoteActionCompatParcelizer = "subtitles_enc")
    private final String subtitleEnc;

    @isFirst(RemoteActionCompatParcelizer = "_id")
    private final String subtitleId;

    public VideoSubtitle(@JsonProperty("subtitles_enc") String str, @JsonProperty("_id") String str2, @JsonProperty("last_updated") long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.subtitleEnc = str;
        this.subtitleId = str2;
        this.remoteLastUpdated = j;
        this.lessonId = "";
        this.lastSyncTimeMs = System.currentTimeMillis();
    }

    public /* synthetic */ VideoSubtitle(String str, String str2, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i & 4) != 0 ? 0L : j);
    }

    public final String getSubtitleEnc() {
        return this.subtitleEnc;
    }

    public final String getSubtitleId() {
        return this.subtitleId;
    }

    public final long getRemoteLastUpdated() {
        return this.remoteLastUpdated;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final void setLessonId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.lessonId = str;
    }

    public final long getLastSyncTimeMs() {
        return this.lastSyncTimeMs;
    }

    public final void setLastSyncTimeMs(long j) {
        this.lastSyncTimeMs = j;
    }

    public static /* synthetic */ VideoSubtitle copy$default(VideoSubtitle videoSubtitle, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoSubtitle.subtitleEnc;
        }
        if ((i & 2) != 0) {
            str2 = videoSubtitle.subtitleId;
        }
        if ((i & 4) != 0) {
            j = videoSubtitle.remoteLastUpdated;
        }
        return videoSubtitle.copy(str, str2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubtitleEnc() {
        return this.subtitleEnc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleId() {
        return this.subtitleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRemoteLastUpdated() {
        return this.remoteLastUpdated;
    }

    public final VideoSubtitle copy(@JsonProperty("subtitles_enc") String p0, @JsonProperty("_id") String p1, @JsonProperty("last_updated") long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new VideoSubtitle(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoSubtitle)) {
            return false;
        }
        VideoSubtitle videoSubtitle = (VideoSubtitle) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subtitleEnc, (Object) videoSubtitle.subtitleEnc) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subtitleId, (Object) videoSubtitle.subtitleId) && this.remoteLastUpdated == videoSubtitle.remoteLastUpdated;
    }

    public final int hashCode() {
        return (((this.subtitleEnc.hashCode() * 31) + this.subtitleId.hashCode()) * 31) + Long.hashCode(this.remoteLastUpdated);
    }

    public final String toString() {
        String str = this.subtitleEnc;
        String str2 = this.subtitleId;
        long j = this.remoteLastUpdated;
        StringBuilder sb = new StringBuilder("VideoSubtitle(subtitleEnc=");
        sb.append(str);
        sb.append(", subtitleId=");
        sb.append(str2);
        sb.append(", remoteLastUpdated=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
