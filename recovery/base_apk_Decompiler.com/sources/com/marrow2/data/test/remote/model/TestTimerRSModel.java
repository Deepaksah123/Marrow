package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestTimerRSModel {

    @JsonProperty("_id")
    public String id;

    @JsonProperty("started_on")
    public long startedOn;

    @JsonProperty("status")
    public int status;
}
