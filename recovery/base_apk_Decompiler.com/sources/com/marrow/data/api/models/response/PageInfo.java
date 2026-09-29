package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0010R\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/marrow/data/api/models/response/PageInfo;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/marrow/data/api/models/response/PageInfo;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "loadMore", "Z", "getLoadMore", "prevLoadMore", "getPrevLoadMore", "nextUrl", "Ljava/lang/String;", "getNextUrl", "previousUrl", "getPreviousUrl", "resultCount", "Ljava/lang/Integer;", "getResultCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PageInfo {
    private final boolean loadMore;
    private final String nextUrl;
    private final boolean prevLoadMore;
    private final String previousUrl;
    private final Integer resultCount;

    public PageInfo(@JsonProperty("load_more") boolean z, @JsonProperty("previous_load_more") boolean z2, @JsonProperty("next") String str, @JsonProperty("previous") String str2, @JsonProperty("result_count") Integer num) {
        this.loadMore = z;
        this.prevLoadMore = z2;
        this.nextUrl = str;
        this.previousUrl = str2;
        this.resultCount = num;
    }

    public /* synthetic */ PageInfo(boolean z, boolean z2, String str, String str2, Integer num, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, num);
    }

    public final boolean getLoadMore() {
        return this.loadMore;
    }

    public final boolean getPrevLoadMore() {
        return this.prevLoadMore;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final String getPreviousUrl() {
        return this.previousUrl;
    }

    public final Integer getResultCount() {
        return this.resultCount;
    }

    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, boolean z, boolean z2, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pageInfo.loadMore;
        }
        if ((i & 2) != 0) {
            z2 = pageInfo.prevLoadMore;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = pageInfo.nextUrl;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = pageInfo.previousUrl;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            num = pageInfo.resultCount;
        }
        return pageInfo.copy(z, z3, str3, str4, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLoadMore() {
        return this.loadMore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPrevLoadMore() {
        return this.prevLoadMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextUrl() {
        return this.nextUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviousUrl() {
        return this.previousUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    public final PageInfo copy(@JsonProperty("load_more") boolean p0, @JsonProperty("previous_load_more") boolean p1, @JsonProperty("next") String p2, @JsonProperty("previous") String p3, @JsonProperty("result_count") Integer p4) {
        return new PageInfo(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PageInfo)) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) p0;
        return this.loadMore == pageInfo.loadMore && this.prevLoadMore == pageInfo.prevLoadMore && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.nextUrl, (Object) pageInfo.nextUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.previousUrl, (Object) pageInfo.previousUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.resultCount, pageInfo.resultCount);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.loadMore);
        int iHashCode2 = Boolean.hashCode(this.prevLoadMore);
        String str = this.nextUrl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.previousUrl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.resultCount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.loadMore;
        boolean z2 = this.prevLoadMore;
        String str = this.nextUrl;
        String str2 = this.previousUrl;
        Integer num = this.resultCount;
        StringBuilder sb = new StringBuilder("PageInfo(loadMore=");
        sb.append(z);
        sb.append(", prevLoadMore=");
        sb.append(z2);
        sb.append(", nextUrl=");
        sb.append(str);
        sb.append(", previousUrl=");
        sb.append(str2);
        sb.append(", resultCount=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
