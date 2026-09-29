package com.marrow.data.api.models.response.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestStartResponseBody {

    @JsonProperty("_id")
    public String id;

    @JsonProperty("started_on")
    public long startedOn;

    @JsonProperty("status")
    public int status;
}
