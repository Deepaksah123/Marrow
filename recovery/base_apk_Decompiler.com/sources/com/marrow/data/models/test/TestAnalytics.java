package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestAnalytics {
    private static final String KEY_AVERAGE_ATTEMPT_TIME = "average_time_per_mcq";
    private static final String KEY_CHANGE_CORRECT = "answer_change_correct";
    private static final String KEY_CHANGE_TOTAL = "answer_change_total";
    private static final String KEY_CHANGE_WRONG = "answer_change_wrong";
    private static final String KEY_FIRST_ATTEMPT_TIME = "time_taken_for_1st_attempt";
    private static final String KEY_GUESSED_STAT = "guess_stat";
    private static final String KEY_NEET_COMPARISON = "neet_comparison";
    private static final String KEY_REVIEW_ATTEMPT_TIME = "time_taken_for_review_attempt";
    private static final String KEY_SUBJECT_STAT = "subject_stat";
    private static final String KEY_TOPPER_STAT = "first_ranker_data";

    @JsonProperty(KEY_AVERAGE_ATTEMPT_TIME)
    public int averageTimeSeconds;

    @JsonProperty(KEY_CHANGE_CORRECT)
    public int changeCorrect;

    @JsonProperty(KEY_CHANGE_TOTAL)
    public int changeTotal;

    @JsonProperty(KEY_CHANGE_WRONG)
    public int changeWrong;

    @JsonProperty(KEY_FIRST_ATTEMPT_TIME)
    public int firstAttemptTimeSeconds;

    @JsonProperty(KEY_GUESSED_STAT)
    public TestStat guessedStat;

    @JsonIgnore
    public TestSubjectStat[] myStat;

    @JsonIgnore
    public RankPair[] neetRanks;

    @JsonProperty(KEY_REVIEW_ATTEMPT_TIME)
    public int reviewAttemptTimeSeconds;
    public String testId;

    @JsonIgnore
    public TestSubjectStat[] topUserStat;

    @JsonProperty(KEY_NEET_COMPARISON)
    public void setNeetComparison(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            Iterator<JsonNode> itElements = jsonNode.elements();
            ArrayList arrayList = new ArrayList();
            while (itElements.hasNext()) {
                JsonNode next = itElements.next();
                if (next.isArray()) {
                    Iterator<JsonNode> itElements2 = next.elements();
                    RankPair rankPair = new RankPair();
                    int i = 0;
                    while (true) {
                        if (!itElements2.hasNext()) {
                            break;
                        }
                        String strAsText = itElements2.next().asText();
                        if (i == 0) {
                            rankPair.scoreRange = strAsText;
                            i++;
                        } else {
                            rankPair.rankRange = strAsText;
                            break;
                        }
                    }
                    arrayList.add(rankPair);
                }
            }
            this.neetRanks = (RankPair[]) arrayList.toArray(new RankPair[arrayList.size()]);
        }
    }

    @JsonProperty(KEY_SUBJECT_STAT)
    public void setSubjectStat(JsonNode jsonNode) {
        if (jsonNode.isObject()) {
            Iterator<String> itFieldNames = jsonNode.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode2 = jsonNode.get(next);
                TestSubjectStat testSubjectStat = new TestSubjectStat();
                testSubjectStat.subjectId = next;
                if (jsonNode2.get("percentile") != null) {
                    testSubjectStat.percentile = jsonNode2.get("percentile").asDouble();
                }
                testSubjectStat.fromJson(jsonNode2);
                arrayList.add(testSubjectStat);
            }
            this.myStat = (TestSubjectStat[]) arrayList.toArray(new TestSubjectStat[arrayList.size()]);
        }
    }

    @JsonProperty(KEY_TOPPER_STAT)
    public void setTopperStat(JsonNode jsonNode) {
        if (jsonNode.isObject()) {
            Iterator<String> itFieldNames = jsonNode.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode2 = jsonNode.get(next);
                TestSubjectStat testSubjectStat = new TestSubjectStat();
                testSubjectStat.subjectId = next;
                testSubjectStat.fromJson(jsonNode2);
                arrayList.add(testSubjectStat);
            }
            this.topUserStat = (TestSubjectStat[]) arrayList.toArray(new TestSubjectStat[arrayList.size()]);
        }
    }
}
