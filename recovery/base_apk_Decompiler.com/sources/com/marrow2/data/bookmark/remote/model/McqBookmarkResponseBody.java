package com.marrow2.data.bookmark.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/marrow2/data/bookmark/remote/model/McqBookmarkResponseBody;", "", "", "p0", "p1", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/marrow2/data/bookmark/remote/model/McqBookmarkResponseBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isUnBookmarked", "Z", "isBookmarked"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqBookmarkResponseBody {
    public static final int $stable = 0;
    private final boolean isBookmarked;
    private final boolean isUnBookmarked;

    public McqBookmarkResponseBody(@JsonProperty("is_unbookmarked") boolean z, @JsonProperty("is_bookmarked") boolean z2) {
        this.isUnBookmarked = z;
        this.isBookmarked = z2;
    }

    public /* synthetic */ McqBookmarkResponseBody(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isUnBookmarked() {
        return this.isUnBookmarked;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public McqBookmarkResponseBody() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ McqBookmarkResponseBody copy$default(McqBookmarkResponseBody mcqBookmarkResponseBody, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mcqBookmarkResponseBody.isUnBookmarked;
        }
        if ((i & 2) != 0) {
            z2 = mcqBookmarkResponseBody.isBookmarked;
        }
        return mcqBookmarkResponseBody.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUnBookmarked() {
        return this.isUnBookmarked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsBookmarked() {
        return this.isBookmarked;
    }

    public final McqBookmarkResponseBody copy(@JsonProperty("is_unbookmarked") boolean p0, @JsonProperty("is_bookmarked") boolean p1) {
        return new McqBookmarkResponseBody(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof McqBookmarkResponseBody)) {
            return false;
        }
        McqBookmarkResponseBody mcqBookmarkResponseBody = (McqBookmarkResponseBody) p0;
        return this.isUnBookmarked == mcqBookmarkResponseBody.isUnBookmarked && this.isBookmarked == mcqBookmarkResponseBody.isBookmarked;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.isUnBookmarked) * 31) + Boolean.hashCode(this.isBookmarked);
    }

    public final String toString() {
        boolean z = this.isUnBookmarked;
        boolean z2 = this.isBookmarked;
        StringBuilder sb = new StringBuilder("McqBookmarkResponseBody(isUnBookmarked=");
        sb.append(z);
        sb.append(", isBookmarked=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
