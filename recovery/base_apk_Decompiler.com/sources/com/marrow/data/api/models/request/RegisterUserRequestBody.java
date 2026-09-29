package com.marrow.data.api.models.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterUserRequestBody implements Serializable {

    @JsonProperty("email")
    public String email;

    @JsonProperty("name")
    public String name;

    @JsonProperty("no_objection")
    public boolean noObjection;

    @JsonProperty("phone_number")
    public String phoneNumber;

    @JsonProperty("sheet_name")
    public String sheetName;
}
