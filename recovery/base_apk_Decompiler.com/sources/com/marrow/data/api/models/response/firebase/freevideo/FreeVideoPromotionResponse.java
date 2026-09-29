package com.marrow.data.api.models.response.firebase.freevideo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import kotlin.Metadata;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoPromotionResponse;", "Lo/notifyManifestPublishTimeExpired;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "toJson", "()Lorg/json/JSONObject;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "subTitle", "getSubTitle", "setSubTitle", "toolbarTitle", "getToolbarTitle", "setToolbarTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreeVideoPromotionResponse implements notifyManifestPublishTimeExpired {

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE)
    private String subTitle;

    @JsonProperty("title")
    private String title;

    @JsonProperty("toolbar_title")
    private String toolbarTitle;

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final void setToolbarTitle(String str) {
        this.toolbarTitle = str;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    @JsonIgnore
    public final void fromJSON(JSONObject p0) {
        if (p0 != null) {
            this.toolbarTitle = p0.optString("toolbar_title");
            this.title = p0.optString("title");
            this.subTitle = p0.optString(CourseResponseKeyConstantsKt.KEY_SUBTITLE);
        }
    }

    @JsonIgnore
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("toolbar_title", this.toolbarTitle);
            jSONObject.put("title", this.title);
            jSONObject.put(CourseResponseKeyConstantsKt.KEY_SUBTITLE, this.subTitle);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
