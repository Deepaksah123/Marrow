package com.marrow.data.models.content;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ContentImage implements notifyManifestPublishTimeExpired {
    private static final String KEY_THUMBNAIL_HEIGHT = "theight";
    private static final String KEY_THUMBNAIL_WIDTH = "twidth";
    private static final String KEY_TITLE = "title";
    private static final String KEY_URL = "url";
    private static final String KEY_URL_V2 = "url_v2";
    private String mImageCitationAuthor;
    private String mImageCitationLicense;
    private String mImageCitationLink;
    private String mImageTitle;
    private String mImageUrl;
    private String mImageUrlV2;
    private int mThumbnailHeight;
    private int mThumbnailWidth;

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public String getImageUrlV2() {
        return this.mImageUrlV2;
    }

    public void setImageUrlV2(String str) {
        this.mImageUrlV2 = str;
    }

    public String getFinalImageUrl() {
        String str = this.mImageUrlV2;
        if (str != null && !str.isEmpty()) {
            return this.mImageUrlV2;
        }
        return this.mImageUrl;
    }

    public void setImageTitle(String str) {
        this.mImageTitle = str;
    }

    public String getImageTitle() {
        return this.mImageTitle;
    }

    public static ContentImage[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ContentImage[] contentImageArr = new ContentImage[length];
        for (int i = 0; i < length; i++) {
            ContentImage contentImage = new ContentImage();
            contentImageArr[i] = contentImage;
            contentImage.fromJSON(jSONArray.optJSONObject(i));
        }
        return contentImageArr;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mImageUrl = jSONObject.optString("url");
        this.mImageUrlV2 = jSONObject.optString(KEY_URL_V2);
        this.mImageTitle = jSONObject.optString("title");
        this.mImageCitationAuthor = jSONObject.optString("tauthor");
        this.mImageCitationLicense = jSONObject.optString("tlicense");
        this.mImageCitationLink = jSONObject.optString("tsource");
        String strOptString = jSONObject.optString(KEY_THUMBNAIL_WIDTH);
        String strOptString2 = jSONObject.optString(KEY_THUMBNAIL_HEIGHT);
        try {
            this.mThumbnailWidth = Integer.parseInt(strOptString);
            this.mThumbnailHeight = Integer.parseInt(strOptString2);
        } catch (Exception unused) {
            this.mThumbnailHeight = 0;
            this.mThumbnailWidth = 0;
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.mImageUrl);
            jSONObject.put(KEY_URL_V2, this.mImageUrlV2);
            jSONObject.put("title", this.mImageTitle);
            jSONObject.put(KEY_THUMBNAIL_WIDTH, this.mThumbnailWidth);
            jSONObject.put(KEY_THUMBNAIL_HEIGHT, this.mThumbnailHeight);
            jSONObject.put("tsource", this.mImageCitationLink);
            jSONObject.put("tauthor", this.mImageCitationAuthor);
            jSONObject.put("tlicense", this.mImageCitationLicense);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONArray toJSON(ContentImage[] contentImageArr) {
        JSONArray jSONArray = new JSONArray();
        if (contentImageArr != null && contentImageArr.length != 0) {
            for (ContentImage contentImage : contentImageArr) {
                jSONArray.put(contentImage.toJSON());
            }
        }
        return jSONArray;
    }

    public float getAspectRatio() {
        int i = this.mThumbnailWidth;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.mThumbnailHeight / i;
    }

    public int getThumbnailWidth() {
        return this.mThumbnailWidth;
    }

    public void setThumbnailWidth(int i) {
        this.mThumbnailWidth = i;
    }

    public int getThumbnailHeight() {
        return this.mThumbnailHeight;
    }

    public void setThumbnailHeight(int i) {
        this.mThumbnailHeight = i;
    }

    public String getImageCitationAuthor() {
        return this.mImageCitationAuthor;
    }

    public void setImageCitationAuthor(String str) {
        this.mImageCitationAuthor = str;
    }

    public String getImageCitationLicense() {
        return this.mImageCitationLicense;
    }

    public void setImageCitationLicense(String str) {
        this.mImageCitationLicense = str;
    }

    public String getImageCitationLink() {
        return this.mImageCitationLink;
    }

    public void setImageCitationLink(String str) {
        this.mImageCitationLink = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ContentImage) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(((ContentImage) obj).getFinalImageUrl(), getFinalImageUrl());
        }
        return super.equals(obj);
    }

    public boolean hasImageCitation() {
        return (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationAuthor) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLink) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLicense)) ? false : true;
    }

    public String getImageCitation() {
        StringBuilder sb = new StringBuilder("");
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLink)) {
            sb.append("Source: ");
            sb.append(this.mImageCitationLink);
            sb.append("\n\n");
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationAuthor)) {
            sb.append("Author: ");
            sb.append(this.mImageCitationAuthor);
            sb.append("\n\n");
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLicense)) {
            sb.append("License: ");
            sb.append(this.mImageCitationLicense);
        }
        return sb.toString();
    }
}
