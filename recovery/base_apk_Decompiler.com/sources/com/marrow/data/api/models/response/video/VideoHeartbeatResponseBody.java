package com.marrow.data.api.models.response.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/marrow/data/api/models/response/video/VideoHeartbeatResponseBody;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(IILjava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/video/VideoHeartbeatResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "playbackInterval", "I", "getPlaybackInterval", "playbackStatus", "getPlaybackStatus", "errorMsg", "Ljava/lang/String;", "getErrorMsg", "errorTitle", "getErrorTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoHeartbeatResponseBody {
    private final String errorMsg;
    private final String errorTitle;
    private final int playbackInterval;
    private final int playbackStatus;

    public VideoHeartbeatResponseBody(@JsonProperty("pbintrvl") int i, @JsonProperty("status") int i2, @JsonProperty("err_msg") String str, @JsonProperty("err_title") String str2) {
        this.playbackInterval = i;
        this.playbackStatus = i2;
        this.errorMsg = str;
        this.errorTitle = str2;
    }

    public final int getPlaybackInterval() {
        return this.playbackInterval;
    }

    public final int getPlaybackStatus() {
        return this.playbackStatus;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public static /* synthetic */ VideoHeartbeatResponseBody copy$default(VideoHeartbeatResponseBody videoHeartbeatResponseBody, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoHeartbeatResponseBody.playbackInterval;
        }
        if ((i3 & 2) != 0) {
            i2 = videoHeartbeatResponseBody.playbackStatus;
        }
        if ((i3 & 4) != 0) {
            str = videoHeartbeatResponseBody.errorMsg;
        }
        if ((i3 & 8) != 0) {
            str2 = videoHeartbeatResponseBody.errorTitle;
        }
        return videoHeartbeatResponseBody.copy(i, i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPlaybackInterval() {
        return this.playbackInterval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlaybackStatus() {
        return this.playbackStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final VideoHeartbeatResponseBody copy(@JsonProperty("pbintrvl") int p0, @JsonProperty("status") int p1, @JsonProperty("err_msg") String p2, @JsonProperty("err_title") String p3) {
        return new VideoHeartbeatResponseBody(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoHeartbeatResponseBody)) {
            return false;
        }
        VideoHeartbeatResponseBody videoHeartbeatResponseBody = (VideoHeartbeatResponseBody) p0;
        return this.playbackInterval == videoHeartbeatResponseBody.playbackInterval && this.playbackStatus == videoHeartbeatResponseBody.playbackStatus && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorMsg, (Object) videoHeartbeatResponseBody.errorMsg) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorTitle, (Object) videoHeartbeatResponseBody.errorTitle);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.playbackInterval);
        int iHashCode2 = Integer.hashCode(this.playbackStatus);
        String str = this.errorMsg;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.errorTitle;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.playbackInterval;
        int i2 = this.playbackStatus;
        String str = this.errorMsg;
        String str2 = this.errorTitle;
        StringBuilder sb = new StringBuilder("VideoHeartbeatResponseBody(playbackInterval=");
        sb.append(i);
        sb.append(", playbackStatus=");
        sb.append(i2);
        sb.append(", errorMsg=");
        sb.append(str);
        sb.append(", errorTitle=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
