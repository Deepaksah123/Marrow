package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/common/RatingResponseBody;", "Ljava/io/Serializable;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/marrow/data/api/models/response/common/RatingResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "isRated", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RatingResponseBody implements Serializable {
    private final String id;
    private final boolean isRated;

    public RatingResponseBody(String str, boolean z) {
        this.id = str;
        this.isRated = z;
    }

    public /* synthetic */ RatingResponseBody(String str, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    @JsonProperty("_id")
    public final String getId() {
        return this.id;
    }

    @JsonProperty("my_rating")
    public final boolean isRated() {
        return this.isRated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingResponseBody() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RatingResponseBody copy$default(RatingResponseBody ratingResponseBody, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ratingResponseBody.id;
        }
        if ((i & 2) != 0) {
            z = ratingResponseBody.isRated;
        }
        return ratingResponseBody.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRated() {
        return this.isRated;
    }

    public final RatingResponseBody copy(String p0, boolean p1) {
        return new RatingResponseBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RatingResponseBody)) {
            return false;
        }
        RatingResponseBody ratingResponseBody = (RatingResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) ratingResponseBody.id) && this.isRated == ratingResponseBody.isRated;
    }

    public final int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isRated);
    }

    public final String toString() {
        String str = this.id;
        boolean z = this.isRated;
        StringBuilder sb = new StringBuilder("RatingResponseBody(id=");
        sb.append(str);
        sb.append(", isRated=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
