package com.marrow2.data.recentUpdates.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.pearl.PearlMini;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesReferencesResponse;", "", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesReferencesResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "type", "I", "getType", "displayId", "Ljava/lang/String;", "getDisplayId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesReferencesResponse {
    public static final int $stable = 0;
    private final String displayId;
    private final int type;

    public RecentUpdatesReferencesResponse(@JsonProperty("type") int i, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String str) {
        this.type = i;
        this.displayId = str;
    }

    public /* synthetic */ RecentUpdatesReferencesResponse(int i, String str, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }

    public final int getType() {
        return this.type;
    }

    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentUpdatesReferencesResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecentUpdatesReferencesResponse copy$default(RecentUpdatesReferencesResponse recentUpdatesReferencesResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentUpdatesReferencesResponse.type;
        }
        if ((i2 & 2) != 0) {
            str = recentUpdatesReferencesResponse.displayId;
        }
        return recentUpdatesReferencesResponse.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayId() {
        return this.displayId;
    }

    public final RecentUpdatesReferencesResponse copy(@JsonProperty("type") int p0, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String p1) {
        return new RecentUpdatesReferencesResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecentUpdatesReferencesResponse)) {
            return false;
        }
        RecentUpdatesReferencesResponse recentUpdatesReferencesResponse = (RecentUpdatesReferencesResponse) p0;
        return this.type == recentUpdatesReferencesResponse.type && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.displayId, (Object) recentUpdatesReferencesResponse.displayId);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.type);
        String str = this.displayId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.type;
        String str = this.displayId;
        StringBuilder sb = new StringBuilder("RecentUpdatesReferencesResponse(type=");
        sb.append(i);
        sb.append(", displayId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
