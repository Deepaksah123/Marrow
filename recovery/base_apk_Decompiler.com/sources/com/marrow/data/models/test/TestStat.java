package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestStat {
    public static final String KEY_CORRECT = "correct";
    public static final String KEY_POSSIBLE_SCORE = "possible_score";
    public static final String KEY_SCORE = "score";
    public static final String KEY_TOTAL = "total";
    public static final String KEY_WRONG = "wrong";

    @JsonProperty("correct")
    public int correct;

    @JsonProperty("possible_score")
    public int possibleScore;

    @JsonProperty("score")
    public double score;

    @JsonProperty("total")
    public int total;

    @JsonProperty("wrong")
    public int wrong;

    public void fromJson(JsonNode jsonNode) {
        this.correct = jsonNode.get("correct").asInt();
        this.wrong = jsonNode.get("wrong").asInt();
        this.total = jsonNode.get("total").asInt();
        this.score = jsonNode.get("score").asDouble();
        this.possibleScore = jsonNode.get("possible_score").asInt();
    }
}
