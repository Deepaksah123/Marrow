package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR\"\u0010\u001c\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/marrow/data/models/test/StateResult;", "", "<init>", "()V", "", TopUser.KEY_RANK, "I", "getRank", "()I", "setRank", "(I)V", "", "stateId", "Ljava/lang/String;", "getStateId", "()Ljava/lang/String;", "setStateId", "(Ljava/lang/String;)V", "", "percentile", "D", "getPercentile", "()D", "setPercentile", "(D)V", "totalAttempt", "getTotalAttempt", "setTotalAttempt", "stateSolved", "getStateSolved", "setStateSolved"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StateResult {

    @JsonProperty("percentile")
    private double percentile;

    @JsonProperty(TopUser.KEY_RANK)
    private int rank;

    @JsonProperty("state_id")
    private String stateId = TestIndex.ALL_INDIA_ID;

    @JsonProperty("solved")
    private int stateSolved;

    @JsonProperty("total_attempt")
    private int totalAttempt;

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final void setStateId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.stateId = str;
    }

    public final double getPercentile() {
        return this.percentile;
    }

    public final void setPercentile(double d) {
        this.percentile = d;
    }

    public final int getTotalAttempt() {
        return this.totalAttempt;
    }

    public final void setTotalAttempt(int i) {
        this.totalAttempt = i;
    }

    public final int getStateSolved() {
        return this.stateSolved;
    }

    public final void setStateSolved(int i) {
        this.stateSolved = i;
    }
}
