package com.marrow.data.dataprovider.video.playbackconfig.remote.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRootRequestBody;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRootRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "courseId", "Ljava/lang/String;", "getCourseId", "setCourseId", "(Ljava/lang/String;)V", "edition", "I", "getEdition", "setEdition", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaybackConfigRootRequestBody {

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private String courseId;

    @JsonProperty("edition")
    private int edition;

    public PlaybackConfigRootRequestBody(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.courseId = str;
        this.edition = i;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.courseId = str;
    }

    public final int getEdition() {
        return this.edition;
    }

    public final void setEdition(int i) {
        this.edition = i;
    }

    public static /* synthetic */ PlaybackConfigRootRequestBody copy$default(PlaybackConfigRootRequestBody playbackConfigRootRequestBody, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playbackConfigRootRequestBody.courseId;
        }
        if ((i2 & 2) != 0) {
            i = playbackConfigRootRequestBody.edition;
        }
        return playbackConfigRootRequestBody.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEdition() {
        return this.edition;
    }

    public final PlaybackConfigRootRequestBody copy(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PlaybackConfigRootRequestBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlaybackConfigRootRequestBody)) {
            return false;
        }
        PlaybackConfigRootRequestBody playbackConfigRootRequestBody = (PlaybackConfigRootRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) playbackConfigRootRequestBody.courseId) && this.edition == playbackConfigRootRequestBody.edition;
    }

    public final int hashCode() {
        return (this.courseId.hashCode() * 31) + Integer.hashCode(this.edition);
    }

    public final String toString() {
        String str = this.courseId;
        int i = this.edition;
        StringBuilder sb = new StringBuilder("PlaybackConfigRootRequestBody(courseId=");
        sb.append(str);
        sb.append(", edition=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
