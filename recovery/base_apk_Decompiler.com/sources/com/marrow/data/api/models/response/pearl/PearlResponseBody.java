package com.marrow.data.api.models.response.pearl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PearlResponseBody {
    private static final String KEY_BOOKMARKED = "bookmarked";
    private static final String KEY_BOOKMARK_LAST_UPDATED = "bookmark_last_updated";
    private static final String KEY_ID = "_id";

    @JsonProperty(KEY_BOOKMARK_LAST_UPDATED)
    public long bookmarkLastUpdated;

    @JsonProperty("_id")
    public String id;

    @JsonIgnore
    public int isBookmarked;

    @JsonSetter("bookmarked")
    public void setBookmarked(JsonNode jsonNode) {
        this.isBookmarked = jsonNode.asInt();
    }

    public PearlResponseBody() {
    }

    public PearlResponseBody(String str, int i, long j) {
        this.id = str;
        this.isBookmarked = i;
        this.bookmarkLastUpdated = j;
    }
}
