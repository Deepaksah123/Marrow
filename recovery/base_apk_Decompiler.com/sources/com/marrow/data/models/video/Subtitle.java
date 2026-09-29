package com.marrow.data.models.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import kotlin.isFirst;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Subtitle implements notifyManifestPublishTimeExpired {
    private static final String KEY_END_TIME = "end_time";
    private static final String KEY_START_TIME = "start_time";
    private static final String KEY_TITLE = "title";

    @isFirst(RemoteActionCompatParcelizer = KEY_END_TIME)
    @JsonProperty(KEY_END_TIME)
    public long endTimeMs;

    @isFirst(RemoteActionCompatParcelizer = KEY_START_TIME)
    @JsonProperty(KEY_START_TIME)
    public long startTimeMs;

    @JsonProperty("title")
    public String title;

    public static Subtitle[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        Subtitle[] subtitleArr = new Subtitle[length];
        for (int i = 0; i < length; i++) {
            Subtitle subtitle = new Subtitle();
            subtitleArr[i] = subtitle;
            subtitle.fromJSON(jSONArray.optJSONObject(i));
        }
        return subtitleArr;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.title = jSONObject.optString("title");
        this.startTimeMs = jSONObject.optInt(KEY_START_TIME);
        this.endTimeMs = jSONObject.optInt(KEY_END_TIME);
    }

    public static JSONArray toJSON(Subtitle[] subtitleArr) {
        if (subtitleArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Subtitle subtitle : subtitleArr) {
            jSONArray.put(subtitle.toJson());
        }
        return jSONArray;
    }

    private JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.read(jSONObject, KEY_END_TIME, Long.valueOf(this.endTimeMs));
        isDvbProfileDeclared.read(jSONObject, KEY_START_TIME, Long.valueOf(this.startTimeMs));
        isDvbProfileDeclared.write(jSONObject, "title", this.title);
        return jSONObject;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean inRange(long j) {
        return j >= this.startTimeMs && j < this.endTimeMs;
    }

    public long getEndTimeMs() {
        return this.endTimeMs;
    }
}
