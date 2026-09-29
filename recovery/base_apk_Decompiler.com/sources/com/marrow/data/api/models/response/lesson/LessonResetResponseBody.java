package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.IResetResponseBody;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonResetResponseBody implements IResetResponseBody {

    @JsonProperty("is_reset")
    public boolean isReset = true;

    @Override // com.marrow.data.api.models.response.IResetResponseBody
    public boolean isResetDone() {
        return this.isReset;
    }
}
