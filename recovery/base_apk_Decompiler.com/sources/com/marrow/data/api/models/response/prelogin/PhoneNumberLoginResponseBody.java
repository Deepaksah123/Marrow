package com.marrow.data.api.models.response.prelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumberLoginResponseBody implements Serializable {

    @JsonProperty("is_sent")
    public boolean isSent;

    @JsonProperty("msg")
    public String message;
}
