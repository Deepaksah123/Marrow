package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanResponse implements Serializable {

    @JsonProperty("promo")
    public Promo promo;

    @JsonProperty("version")
    public int version;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Promo {

        @JsonProperty("disclaimer")
        public String disclaimer;

        @JsonProperty("text")
        public String text;

        @JsonIgnore
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", this.text);
                jSONObject.put("disclaimer", this.disclaimer);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        @JsonIgnore
        public void fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.text = jSONObject.optString("text");
            this.disclaimer = jSONObject.optString("disclaimer");
        }
    }
}
