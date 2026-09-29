package com.marrow.data.api.models.response.timeline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/timeline/VideoTimelineResponseBody;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/marrow/data/api/models/response/timeline/VideoTimelineResponseBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "status", "Z", "getStatus", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoTimelineResponseBody {
    private static final String KEY_ID = "_id";
    private static final String KEY_STATUS = "status";
    private final String id;
    private final boolean status;

    public VideoTimelineResponseBody(@JsonProperty("_id") String str, @JsonProperty("status") boolean z) {
        this.id = str;
        this.status = z;
    }

    public /* synthetic */ VideoTimelineResponseBody(String str, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public static /* synthetic */ VideoTimelineResponseBody copy$default(VideoTimelineResponseBody videoTimelineResponseBody, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoTimelineResponseBody.id;
        }
        if ((i & 2) != 0) {
            z = videoTimelineResponseBody.status;
        }
        return videoTimelineResponseBody.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public final VideoTimelineResponseBody copy(@JsonProperty("_id") String p0, @JsonProperty("status") boolean p1) {
        return new VideoTimelineResponseBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoTimelineResponseBody)) {
            return false;
        }
        VideoTimelineResponseBody videoTimelineResponseBody = (VideoTimelineResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) videoTimelineResponseBody.id) && this.status == videoTimelineResponseBody.status;
    }

    public final int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.status);
    }

    public final String toString() {
        String str = this.id;
        boolean z = this.status;
        StringBuilder sb = new StringBuilder("VideoTimelineResponseBody(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
