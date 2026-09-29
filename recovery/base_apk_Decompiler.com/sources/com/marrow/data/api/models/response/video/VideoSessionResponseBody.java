package com.marrow.data.api.models.response.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoSessionResponseBody {

    @JsonProperty("data")
    public String data;

    @JsonProperty("_id")
    public String id;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, "_id", this.id);
        isDvbProfileDeclared.write(jSONObject, "data", this.data);
        return jSONObject.toString();
    }
}
