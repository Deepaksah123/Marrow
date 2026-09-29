package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00108\u0007X\u0087D¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010,\u001a\b\u0012\u0004\u0012\u00020%0$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+"}, d2 = {"Lcom/marrow2/data/test/remote/model/TestAnalyticsRSModel;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setNeetComparison", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "setSubjectStat", "setTopperStat", "", "testId", "Ljava/lang/String;", "getTestId", "()Ljava/lang/String;", "", "changeCorrect", "I", "getChangeCorrect", "()I", "changeWrong", "getChangeWrong", "changeTotal", "getChangeTotal", "firstAttemptTimeSeconds", "getFirstAttemptTimeSeconds", "reviewAttemptTimeSeconds", "getReviewAttemptTimeSeconds", "averageTimeSeconds", "getAverageTimeSeconds", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "guessedStat", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "getGuessedStat", "()Lcom/marrow2/data/test/remote/model/TestStatModel;", "", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "topUserStat", "Ljava/util/List;", "getTopUserStat", "()Ljava/util/List;", "setTopUserStat", "(Ljava/util/List;)V", "myStat", "getMyStat", "setMyStat", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "neetRanks", "getNeetRanks", "setNeetRanks", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestAnalyticsRSModel {
    public static final String KEY_CORRECT = "correct";
    public static final String KEY_PERCENTILE = "percentile";
    public static final String KEY_POSSIBLE_SCORE = "possible_score";
    public static final String KEY_SCORE = "score";
    public static final String KEY_SUBJECT_ID = "subject_id";
    public static final String KEY_TOTAL = "total";
    public static final String KEY_WRONG = "wrong";

    @JsonProperty("average_time_per_mcq")
    private final int averageTimeSeconds;

    @JsonProperty("answer_change_correct")
    private final int changeCorrect;

    @JsonProperty("answer_change_total")
    private final int changeTotal;

    @JsonProperty("answer_change_wrong")
    private final int changeWrong;

    @JsonProperty("time_taken_for_1st_attempt")
    private final int firstAttemptTimeSeconds;

    @JsonProperty("guess_stat")
    private final TestStatModel guessedStat;

    @JsonProperty("time_taken_for_review_attempt")
    private final int reviewAttemptTimeSeconds;
    public static final int $stable = 8;

    @JsonProperty("_id")
    private final String testId = "";

    @JsonIgnore
    private List<TestSubjectStatModel> topUserStat = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    @JsonIgnore
    private List<TestSubjectStatModel> myStat = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    @JsonIgnore
    private List<RankPairModel> neetRanks = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    public final String getTestId() {
        return this.testId;
    }

    public final int getChangeCorrect() {
        return this.changeCorrect;
    }

    public final int getChangeWrong() {
        return this.changeWrong;
    }

    public final int getChangeTotal() {
        return this.changeTotal;
    }

    public final int getFirstAttemptTimeSeconds() {
        return this.firstAttemptTimeSeconds;
    }

    public final int getReviewAttemptTimeSeconds() {
        return this.reviewAttemptTimeSeconds;
    }

    public final int getAverageTimeSeconds() {
        return this.averageTimeSeconds;
    }

    public final TestStatModel getGuessedStat() {
        return this.guessedStat;
    }

    public final List<TestSubjectStatModel> getTopUserStat() {
        return this.topUserStat;
    }

    public final void setTopUserStat(List<TestSubjectStatModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.topUserStat = list;
    }

    public final List<TestSubjectStatModel> getMyStat() {
        return this.myStat;
    }

    public final void setMyStat(List<TestSubjectStatModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.myStat = list;
    }

    public final List<RankPairModel> getNeetRanks() {
        return this.neetRanks;
    }

    public final void setNeetRanks(List<RankPairModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.neetRanks = list;
    }

    @JsonProperty("neet_comparison")
    public final void setNeetComparison(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isArray()) {
            Iterator<JsonNode> itElements = p0.elements();
            ArrayList arrayList = new ArrayList();
            while (itElements.hasNext()) {
                JsonNode next = itElements.next();
                if (next.isArray()) {
                    Iterator<JsonNode> itElements2 = next.elements();
                    RankPairModel rankPairModel = new RankPairModel(null, null, 3, null);
                    int i = 0;
                    while (true) {
                        if (!itElements2.hasNext()) {
                            break;
                        }
                        String strAsText = itElements2.next().asText();
                        if (i == 0) {
                            rankPairModel.setScoreRange(strAsText);
                            i++;
                        } else {
                            rankPairModel.setRankRange(strAsText);
                            break;
                        }
                    }
                    arrayList.add(rankPairModel);
                }
            }
            this.neetRanks = arrayList;
        }
    }

    @JsonProperty("subject_stat")
    public final void setSubjectStat(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isObject()) {
            Iterator<String> itFieldNames = p0.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode = p0.get(next);
                TestSubjectStatModel testSubjectStatModel = new TestSubjectStatModel(0.0d, 0, 0, 0, 0, null, 0.0d, 127, null);
                toMagicModuleMetaRepoModel.write((Object) next);
                testSubjectStatModel.setSubjectId(next);
                if (jsonNode.get("percentile") != null) {
                    testSubjectStatModel.setPercentile(jsonNode.get("percentile").asDouble());
                }
                testSubjectStatModel.setCorrect(jsonNode.get("correct").asInt());
                testSubjectStatModel.setWrong(jsonNode.get("wrong").asInt());
                testSubjectStatModel.setTotal(jsonNode.get("total").asInt());
                testSubjectStatModel.setScore(jsonNode.get("score").asDouble());
                testSubjectStatModel.setPossibleScore(jsonNode.get("possible_score").asInt());
                arrayList.add(testSubjectStatModel);
            }
            this.myStat = arrayList;
        }
    }

    @JsonProperty("first_ranker_data")
    public final void setTopperStat(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isObject()) {
            Iterator<String> itFieldNames = p0.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode = p0.get(next);
                TestSubjectStatModel testSubjectStatModel = new TestSubjectStatModel(0.0d, 0, 0, 0, 0, null, 0.0d, 127, null);
                toMagicModuleMetaRepoModel.write((Object) next);
                testSubjectStatModel.setSubjectId(next);
                testSubjectStatModel.setCorrect(jsonNode.get("correct").asInt());
                testSubjectStatModel.setWrong(jsonNode.get("wrong").asInt());
                testSubjectStatModel.setTotal(jsonNode.get("total").asInt());
                testSubjectStatModel.setScore(jsonNode.get("score").asDouble());
                testSubjectStatModel.setPossibleScore(jsonNode.get("possible_score").asInt());
                arrayList.add(testSubjectStatModel);
            }
            this.topUserStat = arrayList;
        }
    }
}
