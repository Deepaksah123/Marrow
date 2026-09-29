package com.marrow.data.models.tag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag {

    @JsonProperty("group")
    public String group;

    @JsonProperty("_id")
    public String id;

    @JsonProperty("sort_order")
    public int sortOrder;

    @JsonProperty("title")
    public String title;
}
