package com.marrow.data.api.models.response.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomModuleQuotaResponseBody implements Serializable {

    @JsonProperty("daily_allowed")
    public int dailyAllowed;

    @JsonProperty("daily_created")
    public int dailyCreated;

    @JsonProperty("free_quota_allowed")
    public int freeUserAllowed;

    @JsonProperty("monthly_allowed")
    public int monthlyAllowed;

    @JsonProperty("monthly_created")
    public int monthlyCreated;

    @JsonProperty("total_created")
    public int totalCustomModuleCreated;
}
