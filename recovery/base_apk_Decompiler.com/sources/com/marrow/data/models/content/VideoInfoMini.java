package com.marrow.data.models.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VideoInfoMini {
    private static final String KEY_ID = "_id";
    private static final String KEY_MEDIA_ID = "training_media_id";
    private static final String KEY_PSSH_DATA = "pssh_data";

    @JsonProperty("_id")
    String mId;

    @JsonProperty(KEY_MEDIA_ID)
    String mMediaId;

    @JsonProperty(KEY_PSSH_DATA)
    String psshData;

    public String getPsshData() {
        return this.psshData;
    }

    public void setPsshData(String str) {
        this.psshData = str;
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public class JsonParser {
        public JsonParser() {
        }

        public void fromJSON(JSONObject jSONObject) {
            VideoInfoMini.this.mId = jSONObject.optString("_id");
            VideoInfoMini.this.psshData = jSONObject.optString(VideoInfoMini.KEY_PSSH_DATA);
            VideoInfoMini.this.mMediaId = jSONObject.optString(VideoInfoMini.KEY_MEDIA_ID);
        }

        public JSONObject toJSON() {
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, "_id", VideoInfoMini.this.mId);
            isDvbProfileDeclared.write(jSONObject, VideoInfoMini.KEY_MEDIA_ID, VideoInfoMini.this.mMediaId);
            isDvbProfileDeclared.write(jSONObject, VideoInfoMini.KEY_PSSH_DATA, VideoInfoMini.this.psshData);
            return jSONObject;
        }
    }
}
