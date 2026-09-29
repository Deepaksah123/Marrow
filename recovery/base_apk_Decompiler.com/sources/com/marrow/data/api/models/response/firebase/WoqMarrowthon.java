package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/WoqMarrowthon;", "", "", "p0", "Lcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;", "p1", "<init>", "(ILcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;)V", "component1", "()I", "component2", "()Lcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;", "copy", "(ILcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;)Lcom/marrow/data/api/models/response/firebase/WoqMarrowthon;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "courseId", "I", "getCourseId", "woqData", "Lcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;", "getWoqData"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WoqMarrowthon {
    private final int courseId;
    private final WoqMarrowthonResponse woqData;

    public WoqMarrowthon(@JsonProperty(FilterParams.KEY_COURSE_ID) int i, @JsonProperty("data") WoqMarrowthonResponse woqMarrowthonResponse) {
        toMagicModuleMetaRepoModel.write(woqMarrowthonResponse, "");
        this.courseId = i;
        this.woqData = woqMarrowthonResponse;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final WoqMarrowthonResponse getWoqData() {
        return this.woqData;
    }

    public static /* synthetic */ WoqMarrowthon copy$default(WoqMarrowthon woqMarrowthon, int i, WoqMarrowthonResponse woqMarrowthonResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = woqMarrowthon.courseId;
        }
        if ((i2 & 2) != 0) {
            woqMarrowthonResponse = woqMarrowthon.woqData;
        }
        return woqMarrowthon.copy(i, woqMarrowthonResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WoqMarrowthonResponse getWoqData() {
        return this.woqData;
    }

    public final WoqMarrowthon copy(@JsonProperty(FilterParams.KEY_COURSE_ID) int p0, @JsonProperty("data") WoqMarrowthonResponse p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return new WoqMarrowthon(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WoqMarrowthon)) {
            return false;
        }
        WoqMarrowthon woqMarrowthon = (WoqMarrowthon) p0;
        return this.courseId == woqMarrowthon.courseId && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.woqData, woqMarrowthon.woqData);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + this.woqData.hashCode();
    }

    public final String toString() {
        int i = this.courseId;
        WoqMarrowthonResponse woqMarrowthonResponse = this.woqData;
        StringBuilder sb = new StringBuilder("WoqMarrowthon(courseId=");
        sb.append(i);
        sb.append(", woqData=");
        sb.append(woqMarrowthonResponse);
        sb.append(")");
        return sb.toString();
    }
}
