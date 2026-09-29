package com.marrow.data.api.models.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatencyInfo implements Serializable {

    @JsonProperty("host")
    public String host;

    @JsonProperty("response_time")
    public long msResponseTime;

    @JsonProperty("network_type")
    public int networkType;

    @JsonProperty(FilterParams.KEY_TAGS)
    public String[] tags;

    @JsonProperty(LogSubCategory.Action.USER)
    public String userId;

    public String toString() {
        StringBuilder sb = new StringBuilder("userId: ");
        sb.append(this.userId);
        sb.append(": host: ");
        sb.append(this.host);
        sb.append(": lesson: ");
        sb.append(this.tags[0]);
        sb.append(", subject: ");
        sb.append(this.tags[1]);
        sb.append(", networkType: ");
        sb.append(this.networkType);
        sb.append(", time: ");
        sb.append(this.msResponseTime);
        return sb.toString();
    }
}
