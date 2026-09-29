package com.marrow.data.dataprovider.video.playbackconfig.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;", "", "", "p0", "p1", "", "p2", "<init>", "(ZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isPersistent", "Z", "playbackAllowed", "getPlaybackAllowed", "errorMsg", "Ljava/lang/String;", "getErrorMsg"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaybackConfigRsModel {
    private final String errorMsg;
    private final boolean isPersistent;
    private final boolean playbackAllowed;

    public PlaybackConfigRsModel(@JsonProperty("persistent") boolean z, @JsonProperty("playback_allowed") boolean z2, @JsonProperty("message") String str) {
        this.isPersistent = z;
        this.playbackAllowed = z2;
        this.errorMsg = str;
    }

    public final boolean isPersistent() {
        return this.isPersistent;
    }

    public final boolean getPlaybackAllowed() {
        return this.playbackAllowed;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public static /* synthetic */ PlaybackConfigRsModel copy$default(PlaybackConfigRsModel playbackConfigRsModel, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = playbackConfigRsModel.isPersistent;
        }
        if ((i & 2) != 0) {
            z2 = playbackConfigRsModel.playbackAllowed;
        }
        if ((i & 4) != 0) {
            str = playbackConfigRsModel.errorMsg;
        }
        return playbackConfigRsModel.copy(z, z2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsPersistent() {
        return this.isPersistent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPlaybackAllowed() {
        return this.playbackAllowed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final PlaybackConfigRsModel copy(@JsonProperty("persistent") boolean p0, @JsonProperty("playback_allowed") boolean p1, @JsonProperty("message") String p2) {
        return new PlaybackConfigRsModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlaybackConfigRsModel)) {
            return false;
        }
        PlaybackConfigRsModel playbackConfigRsModel = (PlaybackConfigRsModel) p0;
        return this.isPersistent == playbackConfigRsModel.isPersistent && this.playbackAllowed == playbackConfigRsModel.playbackAllowed && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.errorMsg, (Object) playbackConfigRsModel.errorMsg);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isPersistent);
        int iHashCode2 = Boolean.hashCode(this.playbackAllowed);
        String str = this.errorMsg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z = this.isPersistent;
        boolean z2 = this.playbackAllowed;
        String str = this.errorMsg;
        StringBuilder sb = new StringBuilder("PlaybackConfigRsModel(isPersistent=");
        sb.append(z);
        sb.append(", playbackAllowed=");
        sb.append(z2);
        sb.append(", errorMsg=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
