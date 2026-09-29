package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkCompleteResponseBody {

    @JsonProperty("submitted_on")
    public long completionTimeMs;

    @JsonProperty("is_solved")
    public boolean isSolved;

    @JsonProperty("owner_category")
    public String ownerCategory;

    @JsonProperty("percentile")
    public float percentile;

    @JsonProperty("possible_score")
    public int possibleScore;

    @JsonProperty("score")
    public int score;

    public static MarkCompleteResponseBody newInstance() {
        MarkCompleteResponseBody markCompleteResponseBody = new MarkCompleteResponseBody();
        markCompleteResponseBody.isSolved = true;
        markCompleteResponseBody.completionTimeMs = System.currentTimeMillis();
        return markCompleteResponseBody;
    }
}
