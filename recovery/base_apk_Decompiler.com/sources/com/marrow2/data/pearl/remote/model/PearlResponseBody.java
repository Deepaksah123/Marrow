package com.marrow2.data.pearl.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010&"}, d2 = {"Lcom/marrow2/data/pearl/remote/model/PearlResponseBody;", "", "", "p0", "", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/marrow2/data/pearl/remote/model/PearlResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "bookmarkLastUpdated", "Ljava/lang/Long;", "getBookmarkLastUpdated", "setBookmarkLastUpdated", "(Ljava/lang/Long;)V", "bookmarked", "Ljava/lang/Integer;", "getBookmarked", "setBookmarked", "(Ljava/lang/Integer;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PearlResponseBody {
    public static final int $stable = 8;
    private Long bookmarkLastUpdated;
    private Integer bookmarked;
    private String id;

    public PearlResponseBody(@JsonProperty("_id") String str, @JsonProperty("bookmark_last_updated") Long l, @JsonProperty("bookmarked") Integer num) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
        this.bookmarkLastUpdated = l;
        this.bookmarked = num;
    }

    public /* synthetic */ PearlResponseBody(String str, Long l, Integer num, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
    }

    public final Long getBookmarkLastUpdated() {
        return this.bookmarkLastUpdated;
    }

    public final void setBookmarkLastUpdated(Long l) {
        this.bookmarkLastUpdated = l;
    }

    public final Integer getBookmarked() {
        return this.bookmarked;
    }

    public final void setBookmarked(Integer num) {
        this.bookmarked = num;
    }

    public static /* synthetic */ PearlResponseBody copy$default(PearlResponseBody pearlResponseBody, String str, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pearlResponseBody.id;
        }
        if ((i & 2) != 0) {
            l = pearlResponseBody.bookmarkLastUpdated;
        }
        if ((i & 4) != 0) {
            num = pearlResponseBody.bookmarked;
        }
        return pearlResponseBody.copy(str, l, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBookmarkLastUpdated() {
        return this.bookmarkLastUpdated;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBookmarked() {
        return this.bookmarked;
    }

    public final PearlResponseBody copy(@JsonProperty("_id") String p0, @JsonProperty("bookmark_last_updated") Long p1, @JsonProperty("bookmarked") Integer p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PearlResponseBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PearlResponseBody)) {
            return false;
        }
        PearlResponseBody pearlResponseBody = (PearlResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) pearlResponseBody.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bookmarkLastUpdated, pearlResponseBody.bookmarkLastUpdated) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bookmarked, pearlResponseBody.bookmarked);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        Long l = this.bookmarkLastUpdated;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Integer num = this.bookmarked;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        Long l = this.bookmarkLastUpdated;
        Integer num = this.bookmarked;
        StringBuilder sb = new StringBuilder("PearlResponseBody(id=");
        sb.append(str);
        sb.append(", bookmarkLastUpdated=");
        sb.append(l);
        sb.append(", bookmarked=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
