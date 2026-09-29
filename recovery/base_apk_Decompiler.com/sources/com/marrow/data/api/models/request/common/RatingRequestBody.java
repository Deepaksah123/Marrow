package com.marrow.data.api.models.request.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;

/* JADX INFO: loaded from: classes.dex */
public class RatingRequestBody extends MarrowRequestBody {

    @JsonProperty("rating")
    public int rating;

    @JsonProperty("rating_tags")
    public String[] tags;

    public RatingRequestBody(int i, int i2) {
        super(i);
        this.rating = i2;
    }
}
