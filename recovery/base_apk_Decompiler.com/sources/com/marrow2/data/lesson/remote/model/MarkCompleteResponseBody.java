package com.marrow2.data.lesson.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJf\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010\u001bR\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0012\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u00102R\"\u00103\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R\"\u00108\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u00107R$\u0010;\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010?R$\u0010@\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010<\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010?"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/MarkCompleteResponseBody;", "", "", "p0", "", "p1", "", "p2", "", "p3", "p4", "", "p5", "p6", "p7", "<init>", "(ZJFIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Z", "component2", "()J", "component3", "()F", "component4", "()I", "component5", "component6", "()Ljava/lang/String;", "component7", "()Ljava/lang/Integer;", "component8", "copy", "(ZJFIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/marrow2/data/lesson/remote/model/MarkCompleteResponseBody;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "isSolved", "Z", "setSolved", "(Z)V", "completionTimeMs", "J", "getCompletionTimeMs", "setCompletionTimeMs", "(J)V", "percentile", "F", "getPercentile", "setPercentile", "(F)V", "possibleScore", "I", "getPossibleScore", "setPossibleScore", "(I)V", "score", "getScore", "setScore", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "status", "Ljava/lang/Integer;", "getStatus", "setStatus", "(Ljava/lang/Integer;)V", "ownerCategory", "getOwnerCategory", "setOwnerCategory"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarkCompleteResponseBody {
    public static final int $stable = 8;
    private long completionTimeMs;
    private String id;
    private boolean isSolved;
    private String ownerCategory;
    private float percentile;
    private int possibleScore;
    private int score;
    private Integer status;

    public MarkCompleteResponseBody(@JsonProperty("is_solved") boolean z, @JsonProperty("submitted_on") long j, @JsonProperty("percentile") float f, @JsonProperty("possible_score") int i, @JsonProperty("score") int i2, @JsonProperty("_id") String str, @JsonProperty("status") Integer num, @JsonProperty("owner_category") String str2) {
        this.isSolved = z;
        this.completionTimeMs = j;
        this.percentile = f;
        this.possibleScore = i;
        this.score = i2;
        this.id = str;
        this.status = num;
        this.ownerCategory = str2;
    }

    public /* synthetic */ MarkCompleteResponseBody(boolean z, long j, float f, int i, int i2, String str, Integer num, String str2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str2);
    }

    public final boolean isSolved() {
        return this.isSolved;
    }

    public final void setSolved(boolean z) {
        this.isSolved = z;
    }

    public final long getCompletionTimeMs() {
        return this.completionTimeMs;
    }

    public final void setCompletionTimeMs(long j) {
        this.completionTimeMs = j;
    }

    public final float getPercentile() {
        return this.percentile;
    }

    public final void setPercentile(float f) {
        this.percentile = f;
    }

    public final int getPossibleScore() {
        return this.possibleScore;
    }

    public final void setPossibleScore(int i) {
        this.possibleScore = i;
    }

    public final int getScore() {
        return this.score;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final String getOwnerCategory() {
        return this.ownerCategory;
    }

    public final void setOwnerCategory(String str) {
        this.ownerCategory = str;
    }

    public MarkCompleteResponseBody() {
        this(false, 0L, BitmapDescriptorFactory.HUE_RED, 0, 0, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSolved() {
        return this.isSolved;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCompletionTimeMs() {
        return this.completionTimeMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPercentile() {
        return this.percentile;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPossibleScore() {
        return this.possibleScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOwnerCategory() {
        return this.ownerCategory;
    }

    public final MarkCompleteResponseBody copy(@JsonProperty("is_solved") boolean p0, @JsonProperty("submitted_on") long p1, @JsonProperty("percentile") float p2, @JsonProperty("possible_score") int p3, @JsonProperty("score") int p4, @JsonProperty("_id") String p5, @JsonProperty("status") Integer p6, @JsonProperty("owner_category") String p7) {
        return new MarkCompleteResponseBody(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MarkCompleteResponseBody)) {
            return false;
        }
        MarkCompleteResponseBody markCompleteResponseBody = (MarkCompleteResponseBody) p0;
        return this.isSolved == markCompleteResponseBody.isSolved && this.completionTimeMs == markCompleteResponseBody.completionTimeMs && Float.compare(this.percentile, markCompleteResponseBody.percentile) == 0 && this.possibleScore == markCompleteResponseBody.possibleScore && this.score == markCompleteResponseBody.score && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) markCompleteResponseBody.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.status, markCompleteResponseBody.status) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.ownerCategory, (Object) markCompleteResponseBody.ownerCategory);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSolved);
        int iHashCode2 = Long.hashCode(this.completionTimeMs);
        int iHashCode3 = Float.hashCode(this.percentile);
        int iHashCode4 = Integer.hashCode(this.possibleScore);
        int iHashCode5 = Integer.hashCode(this.score);
        String str = this.id;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num = this.status;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str2 = this.ownerCategory;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.isSolved;
        long j = this.completionTimeMs;
        float f = this.percentile;
        int i = this.possibleScore;
        int i2 = this.score;
        String str = this.id;
        Integer num = this.status;
        String str2 = this.ownerCategory;
        StringBuilder sb = new StringBuilder("MarkCompleteResponseBody(isSolved=");
        sb.append(z);
        sb.append(", completionTimeMs=");
        sb.append(j);
        sb.append(", percentile=");
        sb.append(f);
        sb.append(", possibleScore=");
        sb.append(i);
        sb.append(", score=");
        sb.append(i2);
        sb.append(", id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(num);
        sb.append(", ownerCategory=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
