package com.marrow.data.api.models.response.sync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.test.TopUser;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossDeviceSyncData {

    @JsonProperty("is_ranked")
    public int isRanked;

    @JsonProperty("possible_score")
    public int possibleScore;

    @JsonProperty(TopUser.KEY_RANK)
    public int rank;

    @JsonProperty("score")
    public int score;

    @JsonProperty("status")
    public int status;

    @JsonProperty("started_on")
    public long userStartedTimeStamp;

    @JsonProperty("submitted_on")
    public long userSubmissionTimestamp;
}
