package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJV\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010(R\"\u00102\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010#"}, d2 = {"Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "", "", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "p6", "<init>", "(DIIIILjava/lang/String;D)V", "component1", "()D", "component2", "()I", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "copy", "(DIIIILjava/lang/String;D)Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "score", "D", "getScore", "setScore", "(D)V", "correct", "I", "getCorrect", "setCorrect", "(I)V", "wrong", "getWrong", "setWrong", "total", "getTotal", "setTotal", "possibleScore", "getPossibleScore", "setPossibleScore", "subjectId", "Ljava/lang/String;", "getSubjectId", "setSubjectId", "(Ljava/lang/String;)V", "percentile", "getPercentile", "setPercentile"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestSubjectStatModel {
    public static final int $stable = 8;
    private int correct;
    private double percentile;
    private int possibleScore;
    private double score;
    private String subjectId;
    private int total;
    private int wrong;

    public TestSubjectStatModel(@JsonProperty("score") double d, @JsonProperty("correct") int i, @JsonProperty("wrong") int i2, @JsonProperty("total") int i3, @JsonProperty("possible_score") int i4, @JsonProperty("subject_id") String str, @JsonProperty("percentile") double d2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.score = d;
        this.correct = i;
        this.wrong = i2;
        this.total = i3;
        this.possibleScore = i4;
        this.subjectId = str;
        this.percentile = d2;
    }

    public final double getScore() {
        return this.score;
    }

    public final void setScore(double d) {
        this.score = d;
    }

    public final int getCorrect() {
        return this.correct;
    }

    public final void setCorrect(int i) {
        this.correct = i;
    }

    public final int getWrong() {
        return this.wrong;
    }

    public final void setWrong(int i) {
        this.wrong = i;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public final int getPossibleScore() {
        return this.possibleScore;
    }

    public final void setPossibleScore(int i) {
        this.possibleScore = i;
    }

    public /* synthetic */ TestSubjectStatModel(double d, int i, int i2, int i3, int i4, String str, double d2, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i5 & 1) != 0 ? 0.0d : d, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? i4 : 0, (i5 & 32) != 0 ? "" : str, (i5 & 64) != 0 ? -1.0d : d2);
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final void setSubjectId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.subjectId = str;
    }

    public final double getPercentile() {
        return this.percentile;
    }

    public final void setPercentile(double d) {
        this.percentile = d;
    }

    public TestSubjectStatModel() {
        this(0.0d, 0, 0, 0, 0, null, 0.0d, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCorrect() {
        return this.correct;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWrong() {
        return this.wrong;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPossibleScore() {
        return this.possibleScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getPercentile() {
        return this.percentile;
    }

    public final TestSubjectStatModel copy(@JsonProperty("score") double p0, @JsonProperty("correct") int p1, @JsonProperty("wrong") int p2, @JsonProperty("total") int p3, @JsonProperty("possible_score") int p4, @JsonProperty("subject_id") String p5, @JsonProperty("percentile") double p6) {
        toMagicModuleMetaRepoModel.write(p5, "");
        return new TestSubjectStatModel(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestSubjectStatModel)) {
            return false;
        }
        TestSubjectStatModel testSubjectStatModel = (TestSubjectStatModel) p0;
        return Double.compare(this.score, testSubjectStatModel.score) == 0 && this.correct == testSubjectStatModel.correct && this.wrong == testSubjectStatModel.wrong && this.total == testSubjectStatModel.total && this.possibleScore == testSubjectStatModel.possibleScore && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectId, (Object) testSubjectStatModel.subjectId) && Double.compare(this.percentile, testSubjectStatModel.percentile) == 0;
    }

    public final int hashCode() {
        return (((((((((((Double.hashCode(this.score) * 31) + Integer.hashCode(this.correct)) * 31) + Integer.hashCode(this.wrong)) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.possibleScore)) * 31) + this.subjectId.hashCode()) * 31) + Double.hashCode(this.percentile);
    }

    public final String toString() {
        double d = this.score;
        int i = this.correct;
        int i2 = this.wrong;
        int i3 = this.total;
        int i4 = this.possibleScore;
        String str = this.subjectId;
        double d2 = this.percentile;
        StringBuilder sb = new StringBuilder("TestSubjectStatModel(score=");
        sb.append(d);
        sb.append(", correct=");
        sb.append(i);
        sb.append(", wrong=");
        sb.append(i2);
        sb.append(", total=");
        sb.append(i3);
        sb.append(", possibleScore=");
        sb.append(i4);
        sb.append(", subjectId=");
        sb.append(str);
        sb.append(", percentile=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}
