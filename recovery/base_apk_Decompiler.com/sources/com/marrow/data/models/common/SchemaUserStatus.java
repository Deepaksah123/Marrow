package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014Jj\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010.\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0016R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0012R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\u0014R\u001a\u00104\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0014R\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\u0014R\u0011\u0010<\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b;\u0010\u0014"}, d2 = {"Lcom/marrow/data/models/common/SchemaUserStatus;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;IDDLjava/lang/String;IJII)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()D", "component4", "component5", "component6", "component7", "()J", "component8", "component9", "copy", "(Ljava/lang/String;IDDLjava/lang/String;IJII)Lcom/marrow/data/models/common/SchemaUserStatus;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "attemptedCount", "I", "getAttemptedCount", "completenessScore", "D", "getCompletenessScore", "correctnessScore", "getCorrectnessScore", "schemaId", "getSchemaId", "mcqCount", "getMcqCount", "lastUpdated", "J", "getLastUpdated", "correctCount", "getCorrectCount", "wrongCount", "getWrongCount", "getSkippedCount", "skippedCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaUserStatus {
    private final int attemptedCount;
    private final double completenessScore;
    private final int correctCount;
    private final double correctnessScore;
    private final String id;
    private final long lastUpdated;
    private final int mcqCount;
    private final String schemaId;
    private final int wrongCount;

    public SchemaUserStatus(@JsonProperty("_id") String str, @JsonProperty("attempted_count") int i, @JsonProperty("completeness") double d, @JsonProperty("correctness") double d2, @JsonProperty("hyt_id") String str2, @JsonProperty("hyt_mcq_count") int i2, @JsonProperty("last_updated") long j, @JsonProperty("correct_count") int i3, @JsonProperty("incorrect_count") int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.attemptedCount = i;
        this.completenessScore = d;
        this.correctnessScore = d2;
        this.schemaId = str2;
        this.mcqCount = i2;
        this.lastUpdated = j;
        this.correctCount = i3;
        this.wrongCount = i4;
    }

    public /* synthetic */ SchemaUserStatus(String str, int i, double d, double d2, String str2, int i2, long j, int i3, int i4, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, d, d2, str2, i2, j, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4);
    }

    public final String getId() {
        return this.id;
    }

    public final int getAttemptedCount() {
        return this.attemptedCount;
    }

    public final double getCompletenessScore() {
        return this.completenessScore;
    }

    public final double getCorrectnessScore() {
        return this.correctnessScore;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final int getWrongCount() {
        return this.wrongCount;
    }

    public final int getSkippedCount() {
        return this.mcqCount - (this.correctCount + this.wrongCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAttemptedCount() {
        return this.attemptedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getCompletenessScore() {
        return this.completenessScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getCorrectnessScore() {
        return this.correctnessScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWrongCount() {
        return this.wrongCount;
    }

    public final SchemaUserStatus copy(@JsonProperty("_id") String p0, @JsonProperty("attempted_count") int p1, @JsonProperty("completeness") double p2, @JsonProperty("correctness") double p3, @JsonProperty("hyt_id") String p4, @JsonProperty("hyt_mcq_count") int p5, @JsonProperty("last_updated") long p6, @JsonProperty("correct_count") int p7, @JsonProperty("incorrect_count") int p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new SchemaUserStatus(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaUserStatus)) {
            return false;
        }
        SchemaUserStatus schemaUserStatus = (SchemaUserStatus) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) schemaUserStatus.id) && this.attemptedCount == schemaUserStatus.attemptedCount && Double.compare(this.completenessScore, schemaUserStatus.completenessScore) == 0 && Double.compare(this.correctnessScore, schemaUserStatus.correctnessScore) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaUserStatus.schemaId) && this.mcqCount == schemaUserStatus.mcqCount && this.lastUpdated == schemaUserStatus.lastUpdated && this.correctCount == schemaUserStatus.correctCount && this.wrongCount == schemaUserStatus.wrongCount;
    }

    public final int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.attemptedCount)) * 31) + Double.hashCode(this.completenessScore)) * 31) + Double.hashCode(this.correctnessScore)) * 31) + this.schemaId.hashCode()) * 31) + Integer.hashCode(this.mcqCount)) * 31) + Long.hashCode(this.lastUpdated)) * 31) + Integer.hashCode(this.correctCount)) * 31) + Integer.hashCode(this.wrongCount);
    }

    public final String toString() {
        String str = this.id;
        int i = this.attemptedCount;
        double d = this.completenessScore;
        double d2 = this.correctnessScore;
        String str2 = this.schemaId;
        int i2 = this.mcqCount;
        long j = this.lastUpdated;
        int i3 = this.correctCount;
        int i4 = this.wrongCount;
        StringBuilder sb = new StringBuilder("SchemaUserStatus(id=");
        sb.append(str);
        sb.append(", attemptedCount=");
        sb.append(i);
        sb.append(", completenessScore=");
        sb.append(d);
        sb.append(", correctnessScore=");
        sb.append(d2);
        sb.append(", schemaId=");
        sb.append(str2);
        sb.append(", mcqCount=");
        sb.append(i2);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", correctCount=");
        sb.append(i3);
        sb.append(", wrongCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
