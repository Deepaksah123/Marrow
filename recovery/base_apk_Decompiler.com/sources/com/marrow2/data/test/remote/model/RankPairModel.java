package com.marrow2.data.test.remote.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/marrow2/data/test/remote/model/RankPairModel;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/test/remote/model/RankPairModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "scoreRange", "Ljava/lang/String;", "getScoreRange", "setScoreRange", "(Ljava/lang/String;)V", "rankRange", "getRankRange", "setRankRange"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RankPairModel {
    public static final int $stable = 8;
    private String rankRange;
    private String scoreRange;

    public RankPairModel(String str, String str2) {
        this.scoreRange = str;
        this.rankRange = str2;
    }

    public /* synthetic */ RankPairModel(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getScoreRange() {
        return this.scoreRange;
    }

    public final void setScoreRange(String str) {
        this.scoreRange = str;
    }

    public final String getRankRange() {
        return this.rankRange;
    }

    public final void setRankRange(String str) {
        this.rankRange = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RankPairModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RankPairModel copy$default(RankPairModel rankPairModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankPairModel.scoreRange;
        }
        if ((i & 2) != 0) {
            str2 = rankPairModel.rankRange;
        }
        return rankPairModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScoreRange() {
        return this.scoreRange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRankRange() {
        return this.rankRange;
    }

    public final RankPairModel copy(String p0, String p1) {
        return new RankPairModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RankPairModel)) {
            return false;
        }
        RankPairModel rankPairModel = (RankPairModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.scoreRange, (Object) rankPairModel.scoreRange) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rankRange, (Object) rankPairModel.rankRange);
    }

    public final int hashCode() {
        String str = this.scoreRange;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rankRange;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.scoreRange;
        String str2 = this.rankRange;
        StringBuilder sb = new StringBuilder("RankPairModel(scoreRange=");
        sb.append(str);
        sb.append(", rankRange=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
