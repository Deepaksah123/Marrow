package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription extends SubscriptionType {
    private static final String KEY_ACCESS_LEVEL = "access_level";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_EXPIRES_ON = "expires_on";
    private static final String KEY_ID = "_id";
    private static final String KEY_STARTED_ON = "started_on";
    private static final String KEY_USER_ID = "user_id";
    public static final int SUBSCRIPTION_FLAG_MCQ = 2;
    public static final int SUBSCRIPTION_FLAG_TEST = 4;
    public static final int SUBSCRIPTION_FLAG_VIDEO = 1;

    @JsonProperty(KEY_ACCESS_LEVEL)
    private String mAccessLevel;

    @JsonProperty("course_id")
    private int mCourseId = 1;

    @JsonProperty(KEY_EXPIRES_ON)
    private long mExpiresOn;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty(KEY_USER_ID)
    private String mUserId;

    @JsonProperty(KEY_STARTED_ON)
    private long startedOn;

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getAccessLevel() {
        return this.mAccessLevel;
    }

    public void setAccessLevel(String str) {
        this.mAccessLevel = str;
    }

    public long getExpiresOn() {
        return this.mExpiresOn;
    }

    public void setExpiresOn(long j) {
        this.mExpiresOn = j;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public void setStartedOn(long j) {
        this.startedOn = j;
    }

    public long getStartedOn() {
        return this.startedOn;
    }

    @Override // com.marrow.data.models.plan.SubscriptionType, kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        super.fromJSON(jSONObject);
        this.mId = jSONObject.optString("_id");
        this.mAccessLevel = jSONObject.optString(KEY_ACCESS_LEVEL);
        this.mExpiresOn = jSONObject.optLong(KEY_EXPIRES_ON);
        this.mUserId = jSONObject.optString(KEY_USER_ID);
        this.mCourseId = jSONObject.optInt("course_id");
        this.startedOn = jSONObject.optLong(KEY_STARTED_ON);
    }

    @Override // com.marrow.data.models.plan.SubscriptionType
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        isDvbProfileDeclared.write(json, KEY_ACCESS_LEVEL, this.mAccessLevel);
        isDvbProfileDeclared.read(json, KEY_EXPIRES_ON, Long.valueOf(this.mExpiresOn));
        isDvbProfileDeclared.write(json, "_id", this.mId);
        isDvbProfileDeclared.write(json, KEY_USER_ID, this.mUserId);
        isDvbProfileDeclared.read(json, "course_id", Integer.valueOf(this.mCourseId));
        isDvbProfileDeclared.read(json, KEY_STARTED_ON, Long.valueOf(this.startedOn));
        return json;
    }
}
