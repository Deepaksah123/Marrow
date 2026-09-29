package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/VideoDownloadLimitResponse;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow/data/api/models/response/firebase/VideoDownloadLimitResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "freeLimit", "Ljava/lang/Integer;", "getFreeLimit", "proLimit", "getProLimit"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoDownloadLimitResponse {
    private final Integer freeLimit;
    private final Integer proLimit;

    public VideoDownloadLimitResponse(@JsonProperty("free_limit") Integer num, @JsonProperty("pro_limit") Integer num2) {
        this.freeLimit = num;
        this.proLimit = num2;
    }

    public final Integer getFreeLimit() {
        return this.freeLimit;
    }

    public final Integer getProLimit() {
        return this.proLimit;
    }

    public static /* synthetic */ VideoDownloadLimitResponse copy$default(VideoDownloadLimitResponse videoDownloadLimitResponse, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = videoDownloadLimitResponse.freeLimit;
        }
        if ((i & 2) != 0) {
            num2 = videoDownloadLimitResponse.proLimit;
        }
        return videoDownloadLimitResponse.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFreeLimit() {
        return this.freeLimit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getProLimit() {
        return this.proLimit;
    }

    public final VideoDownloadLimitResponse copy(@JsonProperty("free_limit") Integer p0, @JsonProperty("pro_limit") Integer p1) {
        return new VideoDownloadLimitResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoDownloadLimitResponse)) {
            return false;
        }
        VideoDownloadLimitResponse videoDownloadLimitResponse = (VideoDownloadLimitResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.freeLimit, videoDownloadLimitResponse.freeLimit) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.proLimit, videoDownloadLimitResponse.proLimit);
    }

    public final int hashCode() {
        Integer num = this.freeLimit;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.proLimit;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.freeLimit;
        Integer num2 = this.proLimit;
        StringBuilder sb = new StringBuilder("VideoDownloadLimitResponse(freeLimit=");
        sb.append(num);
        sb.append(", proLimit=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
