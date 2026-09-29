package com.marrow.data.api.models.response.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProResponse {

    @JsonProperty("_id")
    public String _id;

    @JsonProperty("is_saved")
    public boolean isSaved;

    @JsonProperty("msg")
    public String msg;
}
