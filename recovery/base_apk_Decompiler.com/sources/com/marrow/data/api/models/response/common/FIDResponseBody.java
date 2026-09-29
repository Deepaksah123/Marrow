package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/response/common/FIDResponseBody;", "", "<init>", "()V", "", "isAccepted", "Z", "", "fidRequirementStatus", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FIDResponseBody {

    @JsonProperty("fid_required")
    public int fidRequirementStatus;

    @JsonProperty("accepted")
    public boolean isAccepted;
}
