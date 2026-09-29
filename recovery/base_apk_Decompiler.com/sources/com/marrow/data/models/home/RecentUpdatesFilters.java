package com.marrow.data.models.home;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/marrow/data/models/home/RecentUpdatesFilters;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/marrow/data/models/home/RecentUpdatesFilters;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "subjectIds", "Ljava/util/List;", "getSubjectIds"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesFilters {
    private final List<String> subjectIds;

    public RecentUpdatesFilters(@JsonProperty("subject_ids") List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.subjectIds = list;
    }

    public final List<String> getSubjectIds() {
        return this.subjectIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentUpdatesFilters copy$default(RecentUpdatesFilters recentUpdatesFilters, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recentUpdatesFilters.subjectIds;
        }
        return recentUpdatesFilters.copy(list);
    }

    public final List<String> component1() {
        return this.subjectIds;
    }

    public final RecentUpdatesFilters copy(@JsonProperty("subject_ids") List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new RecentUpdatesFilters(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof RecentUpdatesFilters) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjectIds, ((RecentUpdatesFilters) p0).subjectIds);
    }

    public final int hashCode() {
        return this.subjectIds.hashCode();
    }

    public final String toString() {
        List<String> list = this.subjectIds;
        StringBuilder sb = new StringBuilder("RecentUpdatesFilters(subjectIds=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
