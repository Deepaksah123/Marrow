package com.marrow2.data.bookmark.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0007"}, d2 = {"Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isUnBookmarked", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResetBookmarkResponseBody {
    public static final int $stable = 0;
    private final boolean isUnBookmarked;

    public ResetBookmarkResponseBody(@JsonProperty("is_unbookmarked") boolean z) {
        this.isUnBookmarked = z;
    }

    public /* synthetic */ ResetBookmarkResponseBody(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isUnBookmarked() {
        return this.isUnBookmarked;
    }

    public ResetBookmarkResponseBody() {
        this(false, 1, null);
    }

    public static /* synthetic */ ResetBookmarkResponseBody copy$default(ResetBookmarkResponseBody resetBookmarkResponseBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = resetBookmarkResponseBody.isUnBookmarked;
        }
        return resetBookmarkResponseBody.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUnBookmarked() {
        return this.isUnBookmarked;
    }

    public final ResetBookmarkResponseBody copy(@JsonProperty("is_unbookmarked") boolean p0) {
        return new ResetBookmarkResponseBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ResetBookmarkResponseBody) && this.isUnBookmarked == ((ResetBookmarkResponseBody) p0).isUnBookmarked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isUnBookmarked);
    }

    public final String toString() {
        boolean z = this.isUnBookmarked;
        StringBuilder sb = new StringBuilder("ResetBookmarkResponseBody(isUnBookmarked=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
