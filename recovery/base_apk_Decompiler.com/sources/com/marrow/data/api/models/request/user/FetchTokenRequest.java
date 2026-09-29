package com.marrow.data.api.models.request.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class FetchTokenRequest implements Serializable {

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public int courseId;

    @JsonProperty(LoggedUserResponse.KEY_REFRESH_TOKEN)
    public String refreshToken;

    @JsonProperty("user_id")
    public String userId;
}
