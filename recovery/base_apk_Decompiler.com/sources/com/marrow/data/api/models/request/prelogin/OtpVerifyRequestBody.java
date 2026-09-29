package com.marrow.data.api.models.request.prelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtpVerifyRequestBody extends PhoneNumberLoginRequestBody {

    @JsonProperty("otp")
    private String mOtp;

    public void setOtp(String str) {
        this.mOtp = str;
    }
}
