package com.marrow.data.api.models.request.prelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResendOtpRequestBody extends PhoneNumberLoginRequestBody {

    @JsonProperty("retrytype")
    private String type;

    public ResendOtpRequestBody() {
        setRetryTypeText();
    }

    public void setRetryTypeText() {
        this.type = "text";
    }

    public void setRetryTypeVoice() {
        this.type = "voice";
    }

    public void setEmptyRetryType() {
        this.type = "";
    }
}
