package com.marrow.data.api.models.request.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkVideoCompleteRequestBody extends MarrowRequestBody {

    @JsonProperty("result")
    public Result result;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
    }

    public MarkVideoCompleteRequestBody(int i) {
        super(i);
        this.result = new Result();
    }
}
