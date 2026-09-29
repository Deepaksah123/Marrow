package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecurityResponseBody {

    @JsonProperty("fid_key")
    public String fidKey;

    @JsonProperty("fid_required")
    public int fidRequirementStatus;

    @JsonProperty("accepted")
    public boolean isAccepted;
}
