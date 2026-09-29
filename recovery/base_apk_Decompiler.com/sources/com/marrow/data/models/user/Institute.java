package com.marrow.data.models.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class Institute implements Serializable {
    public static final String FMG_INSTITUTE_ID = "fmg_institute_id";
    private static final String KEY_ID = "_id";
    private static final String KEY_STATE_ID = "state_id";
    private static final String KEY_TITLE = "title";

    @JsonProperty("_id")
    private String mId;

    @JsonProperty("state_id")
    private int mStateId = -1;

    @JsonProperty("title")
    private String mTitle;

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getName() {
        return this.mTitle;
    }

    public void setName(String str) {
        this.mTitle = str;
    }

    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mId = jSONObject.optString("_id");
        this.mTitle = jSONObject.optString("title");
        this.mStateId = jSONObject.optInt("state_id");
    }

    public int getStateId() {
        return this.mStateId;
    }

    public void setStateId(int i) {
        this.mStateId = i;
    }
}
