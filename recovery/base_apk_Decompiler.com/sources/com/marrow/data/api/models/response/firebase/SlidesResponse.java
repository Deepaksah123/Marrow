package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/SlidesResponse;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()[Ljava/lang/String;", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/marrow/data/api/models/response/firebase/SlidesResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "message", "Ljava/lang/String;", "getMessage", "rootSubjectIds", "[Ljava/lang/String;", "getRootSubjectIds"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlidesResponse {
    private final String message;
    private final String[] rootSubjectIds;

    public SlidesResponse(@JsonProperty("message") String str, @JsonProperty("root_subject_id") String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.message = str;
        this.rootSubjectIds = strArr;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String[] getRootSubjectIds() {
        return this.rootSubjectIds;
    }

    public static /* synthetic */ SlidesResponse copy$default(SlidesResponse slidesResponse, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slidesResponse.message;
        }
        if ((i & 2) != 0) {
            strArr = slidesResponse.rootSubjectIds;
        }
        return slidesResponse.copy(str, strArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getRootSubjectIds() {
        return this.rootSubjectIds;
    }

    public final SlidesResponse copy(@JsonProperty("message") String p0, @JsonProperty("root_subject_id") String[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SlidesResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SlidesResponse)) {
            return false;
        }
        SlidesResponse slidesResponse = (SlidesResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) slidesResponse.message) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.rootSubjectIds, slidesResponse.rootSubjectIds);
    }

    public final int hashCode() {
        return (this.message.hashCode() * 31) + Arrays.hashCode(this.rootSubjectIds);
    }

    public final String toString() {
        String str = this.message;
        String string = Arrays.toString(this.rootSubjectIds);
        StringBuilder sb = new StringBuilder("SlidesResponse(message=");
        sb.append(str);
        sb.append(", rootSubjectIds=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
