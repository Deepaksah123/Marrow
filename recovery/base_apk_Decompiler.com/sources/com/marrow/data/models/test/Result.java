package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/marrow/data/models/test/Result;", "", "<init>", "()V", "Lcom/marrow/data/models/test/StateResult;", "stateResult", "Lcom/marrow/data/models/test/StateResult;", "getStateResult", "()Lcom/marrow/data/models/test/StateResult;", "setStateResult", "(Lcom/marrow/data/models/test/StateResult;)V", "", "Lcom/marrow/data/models/test/TopUser;", "topRankers", "[Lcom/marrow/data/models/test/TopUser;", "getTopRankers", "()[Lcom/marrow/data/models/test/TopUser;", "setTopRankers", "([Lcom/marrow/data/models/test/TopUser;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Result {

    @JsonProperty("state_result")
    private StateResult stateResult;

    @JsonProperty("top_rankers")
    private TopUser[] topRankers;

    public final StateResult getStateResult() {
        return this.stateResult;
    }

    public final void setStateResult(StateResult stateResult) {
        this.stateResult = stateResult;
    }

    public final TopUser[] getTopRankers() {
        return this.topRankers;
    }

    public final void setTopRankers(TopUser[] topUserArr) {
        this.topRankers = topUserArr;
    }
}
