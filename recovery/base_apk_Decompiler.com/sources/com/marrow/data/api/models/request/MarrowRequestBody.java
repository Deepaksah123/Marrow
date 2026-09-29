package com.marrow.data.api.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class MarrowRequestBody implements Serializable {

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public String courseId;

    public MarrowRequestBody(int i) {
        this.courseId = String.valueOf(i);
    }
}
