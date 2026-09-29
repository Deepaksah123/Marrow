package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VersionUpdateData implements notifyManifestPublishTimeExpired {
    public static final int ACTION_TYPE_ALWAYS = 2;
    public static final int ACTION_TYPE_CLEAR = 0;
    public static final int ACTION_TYPE_UNKNOWN = -1;
    public static final int ACTION_TYPE_WAIT_USER_REACTS = 1;
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_ID = "_id";
    private static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    private static final String LOCAL_KEY_FOR_BUILD = "for_build";
    public static final int TYPE_DISMISSALBE_DIALOG = 2;
    public static final int TYPE_LOGOUT = 1;
    public static final int TYPE_NON_DISMISSABLE_DIALOG = 3;
    public static final int TYPE_SNACKBAR = 4;

    @JsonProperty("description")
    public String mDescription;

    @JsonProperty(LOCAL_KEY_FOR_BUILD)
    public int mForBuild;

    @JsonProperty("_id")
    public long mId;

    @JsonProperty("type")
    public int mType;

    @JsonProperty("url")
    public String mUrl;

    @Override // kotlin.notifyManifestPublishTimeExpired
    @JsonIgnore
    public void fromJSON(JSONObject jSONObject) {
        this.mId = jSONObject.optLong("_id");
        this.mType = jSONObject.optInt("type");
        this.mDescription = jSONObject.optString("description");
        this.mUrl = jSONObject.optString("url");
        this.mForBuild = jSONObject.optInt(LOCAL_KEY_FOR_BUILD);
    }

    @JsonIgnore
    public void fromJSON(JsonNode jsonNode) {
        this.mId = jsonNode.get("_id") != null ? jsonNode.get("_id").asLong() : 0L;
        this.mType = jsonNode.get("type") != null ? jsonNode.get("type").asInt() : 0;
        this.mDescription = jsonNode.get("description") != null ? jsonNode.get("description").asText() : null;
        this.mUrl = jsonNode.get("url") != null ? jsonNode.get("url").asText() : null;
    }

    @JsonIgnore
    public String toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_id", this.mId);
            jSONObject.put("type", this.mType);
            jSONObject.put("description", this.mDescription);
            jSONObject.put("url", this.mUrl);
            jSONObject.put(LOCAL_KEY_FOR_BUILD, this.mForBuild);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JsonIgnore
    public void setForBuild(int i) {
        this.mForBuild = i;
    }
}
