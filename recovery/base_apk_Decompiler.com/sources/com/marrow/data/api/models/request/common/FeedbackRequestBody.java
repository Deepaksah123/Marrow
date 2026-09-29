package com.marrow.data.api.models.request.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackRequestBody extends MarrowRequestBody {
    public static final int ERROR_CONFUSING_QUESTION = 2;
    public static final int ERROR_FACTUAL = 1;
    public static final int ERROR_INADEQUATE_EXPLN = 3;
    private static final String KEY_CONTENT_ID = "content_id";
    private static final String KEY_CONTENT_TYPE = "content_type";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_ERROR_TYPES = "error_types";
    private static final String KEY_FEEDBACK_TYPE = "feedback_type";
    private static final String KEY_TITLE = "title";
    public static final int TYPE_COMPLAINT = 2;
    public static final int TYPE_FEEDBACK = 1;

    @JsonProperty(KEY_ERROR_TYPES)
    private List<Integer> errorTypes;

    @JsonProperty("content_id")
    private String mContentId;

    @JsonProperty(KEY_CONTENT_TYPE)
    private String mContentType;

    @JsonProperty("description")
    private String mDescription;

    @JsonProperty("title")
    private String mTitle;

    @JsonProperty(KEY_FEEDBACK_TYPE)
    private int mType;

    public FeedbackRequestBody(int i) {
        super(i);
        this.mTitle = "";
        this.mDescription = "";
    }

    public String getContentType() {
        return this.mContentType;
    }

    public FeedbackRequestBody setContentType(String str) {
        this.mContentType = str;
        return this;
    }

    public String getContentId() {
        return this.mContentId;
    }

    public FeedbackRequestBody setContentId(String str) {
        this.mContentId = str;
        return this;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public FeedbackRequestBody setTitle(String str) {
        this.mTitle = str;
        return this;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public FeedbackRequestBody setDescription(String str) {
        this.mDescription = str;
        return this;
    }

    public int getType() {
        return this.mType;
    }

    public FeedbackRequestBody setType(int i) {
        this.mType = i;
        return this;
    }

    public List<Integer> getErrorTypes() {
        return this.errorTypes;
    }

    public FeedbackRequestBody setErrorTypes(List<Integer> list) {
        this.errorTypes = list;
        return this;
    }
}
