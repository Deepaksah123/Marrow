package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycResponseBody {

    @JsonProperty("accepted")
    public boolean isAccepted;
}
