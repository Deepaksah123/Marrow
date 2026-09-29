package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/marrow2/data/test/remote/model/TestStatModel;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(IIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/marrow2/data/test/remote/model/TestStatModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "score", "I", "getScore", "correct", "getCorrect", "wrong", "getWrong", "total", "getTotal", "possibleScore", "getPossibleScore"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestStatModel {
    public static final int $stable = 0;
    private final int correct;
    private final int possibleScore;
    private final int score;
    private final int total;
    private final int wrong;

    public TestStatModel(@JsonProperty("score") int i, @JsonProperty("correct") int i2, @JsonProperty("wrong") int i3, @JsonProperty("total") int i4, @JsonProperty("possible_score") int i5) {
        this.score = i;
        this.correct = i2;
        this.wrong = i3;
        this.total = i4;
        this.possibleScore = i5;
    }

    public /* synthetic */ TestStatModel(int i, int i2, int i3, int i4, int i5, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public final int getScore() {
        return this.score;
    }

    public final int getCorrect() {
        return this.correct;
    }

    public final int getWrong() {
        return this.wrong;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getPossibleScore() {
        return this.possibleScore;
    }

    public TestStatModel() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ TestStatModel copy$default(TestStatModel testStatModel, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = testStatModel.score;
        }
        if ((i6 & 2) != 0) {
            i2 = testStatModel.correct;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = testStatModel.wrong;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = testStatModel.total;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = testStatModel.possibleScore;
        }
        return testStatModel.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScore() {
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

    public final TestStatModel copy(@JsonProperty("score") int p0, @JsonProperty("correct") int p1, @JsonProperty("wrong") int p2, @JsonProperty("total") int p3, @JsonProperty("possible_score") int p4) {
        return new TestStatModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestStatModel)) {
            return false;
        }
        TestStatModel testStatModel = (TestStatModel) p0;
        return this.score == testStatModel.score && this.correct == testStatModel.correct && this.wrong == testStatModel.wrong && this.total == testStatModel.total && this.possibleScore == testStatModel.possibleScore;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.score) * 31) + Integer.hashCode(this.correct)) * 31) + Integer.hashCode(this.wrong)) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.possibleScore);
    }

    public final String toString() {
        int i = this.score;
        int i2 = this.correct;
        int i3 = this.wrong;
        int i4 = this.total;
        int i5 = this.possibleScore;
        StringBuilder sb = new StringBuilder("TestStatModel(score=");
        sb.append(i);
        sb.append(", correct=");
        sb.append(i2);
        sb.append(", wrong=");
        sb.append(i3);
        sb.append(", total=");
        sb.append(i4);
        sb.append(", possibleScore=");
        sb.append(i5);
        sb.append(")");
        return sb.toString();
    }
}
