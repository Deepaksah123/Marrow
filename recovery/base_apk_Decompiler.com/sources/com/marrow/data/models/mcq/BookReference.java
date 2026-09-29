package com.marrow.data.models.mcq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookReference implements notifyManifestPublishTimeExpired {
    private static final String KEY_ID = "_id";
    private static final String KEY_TEXT = "text";
    private static final String KEY_THUMBNAIL = "thumbnail";
    private static final String KEY_TITLE = "title";

    @JsonProperty("_id")
    private String mId;

    @JsonProperty("thumbnail")
    private String mImageUrl;

    @JsonProperty("text")
    private String mText;

    @JsonProperty("title")
    private String mTitle;

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mId = jSONObject.optString("_id");
        this.mText = jSONObject.optString("text");
        this.mTitle = jSONObject.optString("title");
        this.mImageUrl = jSONObject.optString("thumbnail");
    }

    public static BookReference[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        BookReference[] bookReferenceArr = new BookReference[length];
        for (int i = 0; i < length; i++) {
            BookReference bookReference = new BookReference();
            bookReferenceArr[i] = bookReference;
            bookReference.fromJSON(jSONArray.optJSONObject(i));
        }
        return bookReferenceArr;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thumbnail", this.mImageUrl);
            jSONObject.put("text", this.mText);
            jSONObject.put("title", this.mTitle);
            jSONObject.put("_id", this.mId);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONArray toJSONArray(BookReference... bookReferenceArr) {
        JSONArray jSONArray = new JSONArray();
        if (bookReferenceArr != null) {
            for (BookReference bookReference : bookReferenceArr) {
                jSONArray.put(bookReference.toJSON());
            }
        }
        return jSONArray;
    }
}
