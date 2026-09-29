package com.marrow.data.models.mcq;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015"}, d2 = {"Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;JJJZ)Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "mcqId", "Ljava/lang/String;", "getMcqId", "parentId", "getParentId", "firstAttemptTime", "J", "getFirstAttemptTime", "changeAnswerTime", "getChangeAnswerTime", "reviewTime", "getReviewTime", "hasBeenAnswered", "Z", "getHasBeenAnswered"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqTimerAnalyticsModel {
    private final long changeAnswerTime;
    private final long firstAttemptTime;
    private final boolean hasBeenAnswered;
    private final String mcqId;
    private final String parentId;
    private final long reviewTime;

    public McqTimerAnalyticsModel(String str, String str2, long j, long j2, long j3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.mcqId = str;
        this.parentId = str2;
        this.firstAttemptTime = j;
        this.changeAnswerTime = j2;
        this.reviewTime = j3;
        this.hasBeenAnswered = z;
    }

    public final String getMcqId() {
        return this.mcqId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final long getFirstAttemptTime() {
        return this.firstAttemptTime;
    }

    public final long getChangeAnswerTime() {
        return this.changeAnswerTime;
    }

    public final long getReviewTime() {
        return this.reviewTime;
    }

    public final boolean getHasBeenAnswered() {
        return this.hasBeenAnswered;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMcqId() {
        return this.mcqId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getFirstAttemptTime() {
        return this.firstAttemptTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getChangeAnswerTime() {
        return this.changeAnswerTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getReviewTime() {
        return this.reviewTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasBeenAnswered() {
        return this.hasBeenAnswered;
    }

    public final McqTimerAnalyticsModel copy(String p0, String p1, long p2, long p3, long p4, boolean p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new McqTimerAnalyticsModel(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof McqTimerAnalyticsModel)) {
            return false;
        }
        McqTimerAnalyticsModel mcqTimerAnalyticsModel = (McqTimerAnalyticsModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.mcqId, (Object) mcqTimerAnalyticsModel.mcqId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.parentId, (Object) mcqTimerAnalyticsModel.parentId) && this.firstAttemptTime == mcqTimerAnalyticsModel.firstAttemptTime && this.changeAnswerTime == mcqTimerAnalyticsModel.changeAnswerTime && this.reviewTime == mcqTimerAnalyticsModel.reviewTime && this.hasBeenAnswered == mcqTimerAnalyticsModel.hasBeenAnswered;
    }

    public final int hashCode() {
        return (((((((((this.mcqId.hashCode() * 31) + this.parentId.hashCode()) * 31) + Long.hashCode(this.firstAttemptTime)) * 31) + Long.hashCode(this.changeAnswerTime)) * 31) + Long.hashCode(this.reviewTime)) * 31) + Boolean.hashCode(this.hasBeenAnswered);
    }

    public final String toString() {
        String str = this.mcqId;
        String str2 = this.parentId;
        long j = this.firstAttemptTime;
        long j2 = this.changeAnswerTime;
        long j3 = this.reviewTime;
        boolean z = this.hasBeenAnswered;
        StringBuilder sb = new StringBuilder("McqTimerAnalyticsModel(mcqId=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", firstAttemptTime=");
        sb.append(j);
        sb.append(", changeAnswerTime=");
        sb.append(j2);
        sb.append(", reviewTime=");
        sb.append(j3);
        sb.append(", hasBeenAnswered=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
