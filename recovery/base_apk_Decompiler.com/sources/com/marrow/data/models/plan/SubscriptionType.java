package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionType implements notifyManifestPublishTimeExpired {
    private static final String KEY_CONTENT_ID = "content_id";
    private static final String KEY_CONTENT_NAME_FOR_EVENT = "content_name_for_event";
    private static final String KEY_CONTENT_TYPE = "content_type";

    @JsonProperty("content_id")
    protected String mContentId;

    @JsonProperty(KEY_CONTENT_NAME_FOR_EVENT)
    protected String mContentNameForEvent;

    @JsonProperty(KEY_CONTENT_TYPE)
    protected String mContentType;

    public String getContentId() {
        return this.mContentId;
    }

    public void setContentId(String str) {
        this.mContentId = str;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public String getContentNameForEvent() {
        return this.mContentNameForEvent;
    }

    public void setContentNameForEvent(String str) {
        this.mContentNameForEvent = str;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        this.mContentId = jSONObject.optString("content_id");
        this.mContentType = jSONObject.optString(KEY_CONTENT_TYPE);
        this.mContentNameForEvent = jSONObject.optString(KEY_CONTENT_NAME_FOR_EVENT);
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, "content_id", this.mContentId);
        isDvbProfileDeclared.write(jSONObject, KEY_CONTENT_TYPE, this.mContentType);
        isDvbProfileDeclared.write(jSONObject, KEY_CONTENT_NAME_FOR_EVENT, this.mContentNameForEvent);
        return jSONObject;
    }

    public static SubscriptionType[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        SubscriptionType[] subscriptionTypeArr = new SubscriptionType[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            SubscriptionType subscriptionType = new SubscriptionType();
            subscriptionTypeArr[i] = subscriptionType;
            subscriptionType.fromJSON(jSONObjectOptJSONObject);
        }
        return subscriptionTypeArr;
    }

    public static JSONArray toJSON(SubscriptionType[] subscriptionTypeArr) {
        JSONArray jSONArray = new JSONArray();
        if (subscriptionTypeArr != null) {
            for (SubscriptionType subscriptionType : subscriptionTypeArr) {
                jSONArray.put(subscriptionType.toJSON());
            }
        }
        return jSONArray;
    }

    public boolean isQbank() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("mcq", this.mContentType);
    }

    public boolean isVideo() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("video", this.mContentType);
    }

    public boolean isTest() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("test", this.mContentType);
    }
}
