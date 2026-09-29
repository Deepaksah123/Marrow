package com.marrow.api.models.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LegalAgreementRequest extends MarrowRequestBody {

    @JsonProperty("legal_agreed")
    public String legalAgreed;

    public LegalAgreementRequest(int i) {
        super(i);
    }
}
