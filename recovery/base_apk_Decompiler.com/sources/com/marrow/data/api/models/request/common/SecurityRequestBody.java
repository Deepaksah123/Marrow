package com.marrow.data.api.models.request.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecurityRequestBody extends MarrowRequestBody {

    @JsonProperty("app_info")
    public AppInfoRequestBody appInfoRequestBody;

    @JsonProperty("dr_dv_info")
    public String drDvInfo;

    public SecurityRequestBody(int i) {
        super(i);
    }
}
