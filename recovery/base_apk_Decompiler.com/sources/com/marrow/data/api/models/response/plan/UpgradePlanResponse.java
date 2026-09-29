package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\u0010R$\u0010!\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u0010R$\u0010$\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\u0010R$\u0010(\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-"}, d2 = {"Lcom/marrow/data/api/models/response/plan/UpgradePlanResponse;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "", "toJSON", "()Ljava/lang/String;", "url", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "description", "getDescription", "setDescription", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "smallButtonText", "getSmallButtonText", "setSmallButtonText", "bigButtonText", "getBigButtonText", "setBigButtonText", "id", "getId", "setId", "", "showPopup", "Ljava/lang/Boolean;", "getShowPopup", "()Ljava/lang/Boolean;", "setShowPopup", "(Ljava/lang/Boolean;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpgradePlanResponse {
    public static final String KEY_BIG_BUTTON_TEXT = "big_btn";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_ID = "_id";
    public static final String KEY_PRICE = "price";
    public static final String KEY_SHOW_POPUP = "show_popup";
    public static final String KEY_SMALL_BUTTON_TEXT = "small_btn";
    public static final String KEY_TITLE = "title";
    public static final String KEY_URL = "upgrade_url";

    @JsonProperty(KEY_BIG_BUTTON_TEXT)
    private String bigButtonText;

    @JsonProperty("description")
    private String description;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("price")
    private double price;

    @JsonProperty(KEY_SHOW_POPUP)
    private Boolean showPopup = Boolean.FALSE;

    @JsonProperty(KEY_SMALL_BUTTON_TEXT)
    private String smallButtonText;

    @JsonProperty("title")
    private String title;

    @JsonProperty(KEY_URL)
    private String url;

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final double getPrice() {
        return this.price;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public final String getSmallButtonText() {
        return this.smallButtonText;
    }

    public final void setSmallButtonText(String str) {
        this.smallButtonText = str;
    }

    public final String getBigButtonText() {
        return this.bigButtonText;
    }

    public final void setBigButtonText(String str) {
        this.bigButtonText = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final Boolean getShowPopup() {
        return this.showPopup;
    }

    public final void setShowPopup(Boolean bool) {
        this.showPopup = bool;
    }

    @JsonIgnore
    public final void fromJSON(JSONObject p0) {
        if (p0 != null) {
            this.url = p0.optString(KEY_URL);
            this.title = p0.optString("title");
            this.description = p0.optString("description");
            this.price = p0.optDouble("price", 0.0d);
            this.smallButtonText = p0.optString(KEY_SMALL_BUTTON_TEXT);
            this.bigButtonText = p0.optString(KEY_BIG_BUTTON_TEXT);
            this.id = p0.optString("_id");
            this.showPopup = Boolean.valueOf(p0.optBoolean(KEY_SHOW_POPUP));
        }
    }

    @JsonIgnore
    public final String toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_URL, this.url);
            jSONObject.put("title", this.title);
            jSONObject.put("description", this.description);
            jSONObject.put("price", this.price);
            jSONObject.put(KEY_BIG_BUTTON_TEXT, this.bigButtonText);
            jSONObject.put(KEY_SMALL_BUTTON_TEXT, this.smallButtonText);
            jSONObject.put("_id", this.id);
            jSONObject.put(KEY_SHOW_POPUP, this.showPopup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
