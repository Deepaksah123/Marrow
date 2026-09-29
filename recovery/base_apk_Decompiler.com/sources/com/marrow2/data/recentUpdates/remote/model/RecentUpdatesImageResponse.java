package com.marrow2.data.recentUpdates.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0005"}, d2 = {"Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "imageUrl", "Ljava/lang/String;", "getImageUrl", "setImageUrl"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesImageResponse {
    public static final int $stable = 8;
    private String imageUrl;

    public RecentUpdatesImageResponse(@JsonProperty("url") String str) {
        this.imageUrl = str;
    }

    public /* synthetic */ RecentUpdatesImageResponse(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentUpdatesImageResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecentUpdatesImageResponse copy$default(RecentUpdatesImageResponse recentUpdatesImageResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentUpdatesImageResponse.imageUrl;
        }
        return recentUpdatesImageResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final RecentUpdatesImageResponse copy(@JsonProperty("url") String p0) {
        return new RecentUpdatesImageResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof RecentUpdatesImageResponse) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.imageUrl, (Object) ((RecentUpdatesImageResponse) p0).imageUrl);
    }

    public final int hashCode() {
        String str = this.imageUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.imageUrl;
        StringBuilder sb = new StringBuilder("RecentUpdatesImageResponse(imageUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
