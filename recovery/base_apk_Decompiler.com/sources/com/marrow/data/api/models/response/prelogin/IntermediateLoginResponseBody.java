package com.marrow.data.api.models.response.prelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.user.UserShortInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntermediateLoginResponseBody extends LoggedUserResponse {

    @JsonProperty("t_token")
    public String intermediateToken;

    @JsonProperty("users")
    private UserShortInfo[] userMini;

    public UserShortInfo[] getAccounts() {
        return this.userMini;
    }

    public boolean hasManyAccounts() {
        UserShortInfo[] userShortInfoArr;
        return (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.intermediateToken) || (userShortInfoArr = this.userMini) == null || userShortInfoArr.length <= 1) ? false : true;
    }
}
