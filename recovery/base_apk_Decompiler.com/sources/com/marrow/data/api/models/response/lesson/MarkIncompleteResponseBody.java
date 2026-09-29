package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkIncompleteResponseBody {

    @JsonProperty("_id")
    public String id;

    @JsonProperty("reset_lesson")
    public boolean isLessonReset;
}
