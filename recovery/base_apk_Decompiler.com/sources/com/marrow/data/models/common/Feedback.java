package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feedback implements notifyManifestPublishTimeExpired {
    private static final String KEY_CONTENT_ID = "content_id";
    private static final String KEY_CONTENT_TYPE = "content_type";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_FEEDBACK_TYPE = "feedback_type";
    private static final String KEY_TITLE = "title";
    public static final int TYPE_COMPLAINT = 2;
    public static final int TYPE_FEEDBACK = 1;

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

    public String getContentType() {
        return this.mContentType;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public String getContentId() {
        return this.mContentId;
    }

    public void setContentId(String str) {
        this.mContentId = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public int getType() {
        return this.mType;
    }

    public void setType(int i) {
        this.mType = i;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mContentType = jSONObject.optString(KEY_CONTENT_TYPE);
        this.mContentId = jSONObject.optString("content_id");
        this.mTitle = jSONObject.optString("title");
        this.mType = jSONObject.optInt(KEY_FEEDBACK_TYPE);
        this.mDescription = jSONObject.optString("description");
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, KEY_CONTENT_TYPE, this.mContentType);
        isDvbProfileDeclared.write(jSONObject, "content_id", this.mContentId);
        isDvbProfileDeclared.write(jSONObject, "title", this.mTitle);
        isDvbProfileDeclared.write(jSONObject, "description", this.mDescription);
        isDvbProfileDeclared.read(jSONObject, KEY_FEEDBACK_TYPE, Integer.valueOf(this.mType));
        return jSONObject;
    }
}
