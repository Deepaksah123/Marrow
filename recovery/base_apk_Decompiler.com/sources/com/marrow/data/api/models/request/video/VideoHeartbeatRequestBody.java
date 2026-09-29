package com.marrow.data.api.models.request.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/marrow/data/api/models/request/video/VideoHeartbeatRequestBody;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/request/video/VideoHeartbeatRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "playbackStatus", "I", "getPlaybackStatus", "deviceId", "Ljava/lang/String;", "getDeviceId", "userId", "getUserId", "videoId", "getVideoId", "playbackSessionId", "getPlaybackSessionId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoHeartbeatRequestBody {

    @JsonProperty("device_id")
    private final String deviceId;

    @JsonProperty("pb_s_id")
    private final String playbackSessionId;

    @JsonProperty("playback_status")
    private final int playbackStatus;

    @JsonProperty("user_id")
    private final String userId;

    @JsonProperty("vid")
    private final String videoId;

    public VideoHeartbeatRequestBody(int i, String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.playbackStatus = i;
        this.deviceId = str;
        this.userId = str2;
        this.videoId = str3;
        this.playbackSessionId = str4;
    }

    public final int getPlaybackStatus() {
        return this.playbackStatus;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public static /* synthetic */ VideoHeartbeatRequestBody copy$default(VideoHeartbeatRequestBody videoHeartbeatRequestBody, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoHeartbeatRequestBody.playbackStatus;
        }
        if ((i2 & 2) != 0) {
            str = videoHeartbeatRequestBody.deviceId;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = videoHeartbeatRequestBody.userId;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = videoHeartbeatRequestBody.videoId;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = videoHeartbeatRequestBody.playbackSessionId;
        }
        return videoHeartbeatRequestBody.copy(i, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPlaybackStatus() {
        return this.playbackStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public final VideoHeartbeatRequestBody copy(int p0, String p1, String p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new VideoHeartbeatRequestBody(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoHeartbeatRequestBody)) {
            return false;
        }
        VideoHeartbeatRequestBody videoHeartbeatRequestBody = (VideoHeartbeatRequestBody) p0;
        return this.playbackStatus == videoHeartbeatRequestBody.playbackStatus && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceId, (Object) videoHeartbeatRequestBody.deviceId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) videoHeartbeatRequestBody.userId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) videoHeartbeatRequestBody.videoId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.playbackSessionId, (Object) videoHeartbeatRequestBody.playbackSessionId);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.playbackStatus) * 31) + this.deviceId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.videoId.hashCode()) * 31) + this.playbackSessionId.hashCode();
    }

    public final String toString() {
        int i = this.playbackStatus;
        String str = this.deviceId;
        String str2 = this.userId;
        String str3 = this.videoId;
        String str4 = this.playbackSessionId;
        StringBuilder sb = new StringBuilder("VideoHeartbeatRequestBody(playbackStatus=");
        sb.append(i);
        sb.append(", deviceId=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", videoId=");
        sb.append(str3);
        sb.append(", playbackSessionId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
