package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n"}, d2 = {"Lcom/marrow2/data/test/remote/model/McqTimingRequestData;", "", "<init>", "()V", "", "firstAttemptTimeMs", "J", "getFirstAttemptTimeMs", "()J", "setFirstAttemptTimeMs", "(J)V", "changeAnswerTimeMs", "getChangeAnswerTimeMs", "setChangeAnswerTimeMs", "reviewTimeMs", "getReviewTimeMs", "setReviewTimeMs"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McqTimingRequestData {
    public static final int $stable = 8;

    @JsonProperty("fa")
    private long firstAttemptTimeMs = -1;

    @JsonProperty("ca")
    private long changeAnswerTimeMs = -1;

    @JsonProperty("rt")
    private long reviewTimeMs = -1;

    public final long getFirstAttemptTimeMs() {
        return this.firstAttemptTimeMs;
    }

    public final void setFirstAttemptTimeMs(long j) {
        this.firstAttemptTimeMs = j;
    }

    public final long getChangeAnswerTimeMs() {
        return this.changeAnswerTimeMs;
    }

    public final void setChangeAnswerTimeMs(long j) {
        this.changeAnswerTimeMs = j;
    }

    public final long getReviewTimeMs() {
        return this.reviewTimeMs;
    }

    public final void setReviewTimeMs(long j) {
        this.reviewTimeMs = j;
    }
}
