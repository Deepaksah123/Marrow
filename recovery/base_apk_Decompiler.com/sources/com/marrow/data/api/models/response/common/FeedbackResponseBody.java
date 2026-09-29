package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.api.models.response.user.LoggedUserResponse;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedbackResponseBody {

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    private String mContentId;

    @JsonProperty("content_type")
    String mContentType;

    @JsonProperty(LoggedUserResponse.KEY_CREATED_ON)
    private String mCreatedOn;

    @JsonProperty("feedback_type")
    private String mFeedbackType;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty("last_updated")
    private String mLastUpdated;

    @JsonProperty("title")
    private String mTitle;

    @JsonProperty("user_id")
    private String mUserId;
}
