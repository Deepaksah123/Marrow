package com.marrow.data.models.content;

import in.juspay.hypersdk.core.PaymentConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ImageInfo {
    private String encryptKey;
    private String imageType;
    private String imageUrl;
    private int sort;
    private int tHeight;
    private int tWidth;
    private int timeStamp;

    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.imageUrl = jSONObject.optString("url");
        this.imageType = jSONObject.optString("img_ext");
        this.encryptKey = jSONObject.optString("enc_key");
        this.timeStamp = jSONObject.optInt(PaymentConstants.TIMESTAMP);
        this.sort = jSONObject.optInt("order");
        this.tWidth = jSONObject.optInt("twidth", 16);
        this.tHeight = jSONObject.optInt("theight", 9);
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public void setEncryptKey(String str) {
        this.encryptKey = str;
    }

    public static ImageInfo[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ImageInfo[] imageInfoArr = new ImageInfo[length];
        for (int i = 0; i < length; i++) {
            ImageInfo imageInfo = new ImageInfo();
            imageInfoArr[i] = imageInfo;
            imageInfo.fromJSON(jSONArray.optJSONObject(i));
        }
        return imageInfoArr;
    }

    public String getFileName() {
        String str = this.imageUrl;
        return str.substring(str.lastIndexOf(47) + 1, this.imageUrl.length());
    }

    public int getSort() {
        return this.sort;
    }

    public int getTimeStamp() {
        return this.timeStamp;
    }

    public int getHeight() {
        return this.tHeight;
    }

    public int getWidth() {
        return this.tWidth;
    }
}
