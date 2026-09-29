package com.marrow2.data.search.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.pearl.PearlMini;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/marrow2/data/search/remote/model/SearchMcqResponseBody;", "", "Lcom/marrow/data/models/mcq/McqIndex;", "p0", "", "p1", "p2", "<init>", "(Lcom/marrow/data/models/mcq/McqIndex;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/marrow/data/models/mcq/McqIndex;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/marrow/data/models/mcq/McqIndex;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/search/remote/model/SearchMcqResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "data", "Lcom/marrow/data/models/mcq/McqIndex;", "getData", "type", "Ljava/lang/String;", "getType", PearlMini.KEY_PEARL_DISPLAY_ID, "getDisplay_id"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchMcqResponseBody {
    public static final int $stable = 8;
    private final McqIndex data;
    private final String display_id;
    private final String type;

    public SearchMcqResponseBody(@JsonProperty("data") McqIndex mcqIndex, @JsonProperty("type") String str, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String str2) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.data = mcqIndex;
        this.type = str;
        this.display_id = str2;
    }

    public final McqIndex getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public final String getDisplay_id() {
        return this.display_id;
    }

    public static /* synthetic */ SearchMcqResponseBody copy$default(SearchMcqResponseBody searchMcqResponseBody, McqIndex mcqIndex, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            mcqIndex = searchMcqResponseBody.data;
        }
        if ((i & 2) != 0) {
            str = searchMcqResponseBody.type;
        }
        if ((i & 4) != 0) {
            str2 = searchMcqResponseBody.display_id;
        }
        return searchMcqResponseBody.copy(mcqIndex, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McqIndex getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplay_id() {
        return this.display_id;
    }

    public final SearchMcqResponseBody copy(@JsonProperty("data") McqIndex p0, @JsonProperty("type") String p1, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SearchMcqResponseBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SearchMcqResponseBody)) {
            return false;
        }
        SearchMcqResponseBody searchMcqResponseBody = (SearchMcqResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.data, searchMcqResponseBody.data) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.type, (Object) searchMcqResponseBody.type) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.display_id, (Object) searchMcqResponseBody.display_id);
    }

    public final int hashCode() {
        return (((this.data.hashCode() * 31) + this.type.hashCode()) * 31) + this.display_id.hashCode();
    }

    public final String toString() {
        McqIndex mcqIndex = this.data;
        String str = this.type;
        String str2 = this.display_id;
        StringBuilder sb = new StringBuilder("SearchMcqResponseBody(data=");
        sb.append(mcqIndex);
        sb.append(", type=");
        sb.append(str);
        sb.append(", display_id=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
