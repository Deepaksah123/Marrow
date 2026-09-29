package com.marrow.data.api.models.request.prelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.PhoneNumber;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumberLoginRequestBody {

    @JsonProperty("force_attach")
    public boolean forceLogin;

    @JsonProperty("primary_contact")
    private PhoneNumber mPhoneNumber;

    @JsonProperty("config_hash")
    public String rcToken;

    public void setRcToken(String str) {
        this.rcToken = str;
    }

    public void setPhoneNumber(String str, String str2) {
        this.mPhoneNumber = new PhoneNumber(str, str2);
    }
}
