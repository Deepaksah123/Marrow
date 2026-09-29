package com.marrow.data.api.models.response.gta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048GX\u0087D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\b"}, d2 = {"Lcom/marrow/data/api/models/response/gta/SubjectStat;", "", "<init>", "()V", "", "subjPercentile", "I", "getSubjPercentile", "()I", "possibleScore", "getPossibleScore", "subjScore", "getSubjScore", "getModifiedScore", "modifiedScore"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubjectStat {

    @JsonProperty("possible_score")
    private final int possibleScore;

    @JsonProperty("percentile")
    private final int subjPercentile = -1;

    @JsonProperty("score")
    private final int subjScore;

    public final int getSubjPercentile() {
        return this.subjPercentile;
    }

    public final int getPossibleScore() {
        return this.possibleScore;
    }

    public final int getSubjScore() {
        int i = this.subjScore;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int getModifiedScore() {
        if (this.possibleScore != 0) {
            return (getSubjScore() * 100) / this.possibleScore;
        }
        return 0;
    }
}
