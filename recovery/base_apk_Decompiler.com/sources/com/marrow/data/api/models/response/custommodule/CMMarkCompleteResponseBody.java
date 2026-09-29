package com.marrow.data.api.models.response.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CMMarkCompleteResponseBody extends MarkCompleteResponseBody {

    @JsonProperty("status")
    public int status;
}
