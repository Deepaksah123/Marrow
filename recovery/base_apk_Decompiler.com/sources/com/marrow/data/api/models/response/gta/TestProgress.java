package com.marrow.data.api.models.response.gta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.test.TopUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8G@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020'0&8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b1\u0010#R\"\u00103\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010/\"\u0004\b6\u00107"}, d2 = {"Lcom/marrow/data/api/models/response/gta/TestProgress;", "", "<init>", "()V", "", "isAwaited", "()Z", "", "percentile", "Ljava/lang/Float;", "getPercentile", "()Ljava/lang/Float;", "setPercentile", "(Ljava/lang/Float;)V", "", "possibleScore", "Ljava/lang/Integer;", "getPossibleScore", "()Ljava/lang/Integer;", "setPossibleScore", "(Ljava/lang/Integer;)V", "score", "getScore", "setScore", "", "submittedOn", "Ljava/lang/Long;", "getSubmittedOn", "()Ljava/lang/Long;", "setSubmittedOn", "(Ljava/lang/Long;)V", "", "testId", "Ljava/lang/String;", "getTestId", "()Ljava/lang/String;", "setTestId", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lcom/marrow/data/api/models/response/gta/SubjectStat;", "subjectStatMap", "Ljava/util/HashMap;", "getSubjectStatMap", "()Ljava/util/HashMap;", "setSubjectStatMap", "(Ljava/util/HashMap;)V", "getPercentage", "()I", "percentage", "getSubmittedOnDate", "submittedOnDate", TopUser.KEY_RANK, "I", "getRank", "setRank", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestProgress {

    @JsonProperty("percentile")
    private Float percentile;

    @JsonProperty("possible_score")
    private Integer possibleScore;

    @JsonProperty("score")
    private Integer score;

    @JsonProperty("submitted_on")
    private Long submittedOn;

    @JsonProperty("test_id")
    private String testId = "";

    @JsonProperty("subject_stat")
    private HashMap<String, SubjectStat> subjectStatMap = new HashMap<>();
    private int rank = -1;

    public final Float getPercentile() {
        return this.percentile;
    }

    public final void setPercentile(Float f) {
        this.percentile = f;
    }

    public final Integer getPossibleScore() {
        return this.possibleScore;
    }

    public final void setPossibleScore(Integer num) {
        this.possibleScore = num;
    }

    public final void setScore(Integer num) {
        this.score = num;
    }

    public final Integer getScore() {
        Integer num = this.score;
        if (num != null) {
            toMagicModuleMetaRepoModel.write(num);
            if (num.intValue() < 0) {
                return 0;
            }
        }
        return this.score;
    }

    public final Long getSubmittedOn() {
        return this.submittedOn;
    }

    public final void setSubmittedOn(Long l) {
        this.submittedOn = l;
    }

    public final String getTestId() {
        return this.testId;
    }

    public final void setTestId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.testId = str;
    }

    public final HashMap<String, SubjectStat> getSubjectStatMap() {
        return this.subjectStatMap;
    }

    public final void setSubjectStatMap(HashMap<String, SubjectStat> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.subjectStatMap = map;
    }

    public final int getPercentage() {
        Integer num = this.possibleScore;
        if (num != null && num.intValue() == 0) {
            return 0;
        }
        Integer score = getScore();
        toMagicModuleMetaRepoModel.write(score);
        int iIntValue = score.intValue();
        Integer num2 = this.possibleScore;
        toMagicModuleMetaRepoModel.write(num2);
        return (iIntValue * 100) / num2.intValue();
    }

    public final String getSubmittedOnDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        Long l = this.submittedOn;
        String str = simpleDateFormat.format(l != null ? new Date(l.longValue()) : null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final boolean isAwaited() {
        return this.rank == -1;
    }
}
