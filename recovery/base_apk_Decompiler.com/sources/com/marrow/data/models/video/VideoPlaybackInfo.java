package com.marrow.data.models.video;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/marrow/data/models/video/VideoPlaybackInfo;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "<init>", "(JLjava/lang/String;IJJ)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "copy", "(JLjava/lang/String;IJJ)Lcom/marrow/data/models/video/VideoPlaybackInfo;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "dateInEpoch", "J", "getDateInEpoch", "pbConfig", "Ljava/lang/String;", "getPbConfig", "errCount", "I", "getErrCount", "underrunDurationMs", "getUnderrunDurationMs", "pbDurationMs", "getPbDurationMs"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoPlaybackInfo {
    private final long dateInEpoch;
    private final int errCount;
    private final String pbConfig;
    private final long pbDurationMs;
    private final long underrunDurationMs;

    public VideoPlaybackInfo(long j, String str, int i, long j2, long j3) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.dateInEpoch = j;
        this.pbConfig = str;
        this.errCount = i;
        this.underrunDurationMs = j2;
        this.pbDurationMs = j3;
    }

    public final long getDateInEpoch() {
        return this.dateInEpoch;
    }

    public final String getPbConfig() {
        return this.pbConfig;
    }

    public final int getErrCount() {
        return this.errCount;
    }

    public final long getUnderrunDurationMs() {
        return this.underrunDurationMs;
    }

    public final long getPbDurationMs() {
        return this.pbDurationMs;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDateInEpoch() {
        return this.dateInEpoch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPbConfig() {
        return this.pbConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getErrCount() {
        return this.errCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUnderrunDurationMs() {
        return this.underrunDurationMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPbDurationMs() {
        return this.pbDurationMs;
    }

    public final VideoPlaybackInfo copy(long p0, String p1, int p2, long p3, long p4) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return new VideoPlaybackInfo(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoPlaybackInfo)) {
            return false;
        }
        VideoPlaybackInfo videoPlaybackInfo = (VideoPlaybackInfo) p0;
        return this.dateInEpoch == videoPlaybackInfo.dateInEpoch && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pbConfig, (Object) videoPlaybackInfo.pbConfig) && this.errCount == videoPlaybackInfo.errCount && this.underrunDurationMs == videoPlaybackInfo.underrunDurationMs && this.pbDurationMs == videoPlaybackInfo.pbDurationMs;
    }

    public final int hashCode() {
        return (((((((Long.hashCode(this.dateInEpoch) * 31) + this.pbConfig.hashCode()) * 31) + Integer.hashCode(this.errCount)) * 31) + Long.hashCode(this.underrunDurationMs)) * 31) + Long.hashCode(this.pbDurationMs);
    }

    public final String toString() {
        long j = this.dateInEpoch;
        String str = this.pbConfig;
        int i = this.errCount;
        long j2 = this.underrunDurationMs;
        long j3 = this.pbDurationMs;
        StringBuilder sb = new StringBuilder("VideoPlaybackInfo(dateInEpoch=");
        sb.append(j);
        sb.append(", pbConfig=");
        sb.append(str);
        sb.append(", errCount=");
        sb.append(i);
        sb.append(", underrunDurationMs=");
        sb.append(j2);
        sb.append(", pbDurationMs=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
