package com.marrow.data.api.models.request.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;

/* JADX INFO: loaded from: classes.dex */
public class ProRequestBody extends MarrowRequestBody {

    @JsonProperty("message")
    public String message;

    @JsonProperty("page_source")
    public String pageSource;

    @JsonProperty("phone_number")
    public String phonenNumber;

    public ProRequestBody(int i, String str) {
        super(i);
        this.pageSource = str;
    }
}
