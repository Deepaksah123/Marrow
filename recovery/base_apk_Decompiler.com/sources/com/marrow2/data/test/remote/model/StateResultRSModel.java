package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.test.TopUser;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/marrow2/data/test/remote/model/StateResultRSModel;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "<init>", "(ILjava/lang/String;DII)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()D", "component4", "component5", "copy", "(ILjava/lang/String;DII)Lcom/marrow2/data/test/remote/model/StateResultRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", TopUser.KEY_RANK, "I", "getRank", "stateId", "Ljava/lang/String;", "getStateId", "percentile", "D", "getPercentile", "totalAttempt", "getTotalAttempt", "stateSolved", "getStateSolved"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StateResultRSModel {
    public static final int $stable = 0;
    private final double percentile;
    private final int rank;
    private final String stateId;
    private final int stateSolved;
    private final int totalAttempt;

    public StateResultRSModel(@JsonProperty(TopUser.KEY_RANK) int i, @JsonProperty("state_id") String str, @JsonProperty("percentile") double d, @JsonProperty("total_attempt") int i2, @JsonProperty("solved") int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.rank = i;
        this.stateId = str;
        this.percentile = d;
        this.totalAttempt = i2;
        this.stateSolved = i3;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final double getPercentile() {
        return this.percentile;
    }

    public final int getTotalAttempt() {
        return this.totalAttempt;
    }

    public final int getStateSolved() {
        return this.stateSolved;
    }

    public static /* synthetic */ StateResultRSModel copy$default(StateResultRSModel stateResultRSModel, int i, String str, double d, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = stateResultRSModel.rank;
        }
        if ((i4 & 2) != 0) {
            str = stateResultRSModel.stateId;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            d = stateResultRSModel.percentile;
        }
        double d2 = d;
        if ((i4 & 8) != 0) {
            i2 = stateResultRSModel.totalAttempt;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = stateResultRSModel.stateSolved;
        }
        return stateResultRSModel.copy(i, str2, d2, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateId() {
        return this.stateId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPercentile() {
        return this.percentile;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalAttempt() {
        return this.totalAttempt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStateSolved() {
        return this.stateSolved;
    }

    public final StateResultRSModel copy(@JsonProperty(TopUser.KEY_RANK) int p0, @JsonProperty("state_id") String p1, @JsonProperty("percentile") double p2, @JsonProperty("total_attempt") int p3, @JsonProperty("solved") int p4) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return new StateResultRSModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof StateResultRSModel)) {
            return false;
        }
        StateResultRSModel stateResultRSModel = (StateResultRSModel) p0;
        return this.rank == stateResultRSModel.rank && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.stateId, (Object) stateResultRSModel.stateId) && Double.compare(this.percentile, stateResultRSModel.percentile) == 0 && this.totalAttempt == stateResultRSModel.totalAttempt && this.stateSolved == stateResultRSModel.stateSolved;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.rank) * 31) + this.stateId.hashCode()) * 31) + Double.hashCode(this.percentile)) * 31) + Integer.hashCode(this.totalAttempt)) * 31) + Integer.hashCode(this.stateSolved);
    }

    public final String toString() {
        int i = this.rank;
        String str = this.stateId;
        double d = this.percentile;
        int i2 = this.totalAttempt;
        int i3 = this.stateSolved;
        StringBuilder sb = new StringBuilder("StateResultRSModel(rank=");
        sb.append(i);
        sb.append(", stateId=");
        sb.append(str);
        sb.append(", percentile=");
        sb.append(d);
        sb.append(", totalAttempt=");
        sb.append(i2);
        sb.append(", stateSolved=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
