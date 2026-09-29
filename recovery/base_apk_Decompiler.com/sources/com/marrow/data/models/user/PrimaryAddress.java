package com.marrow.data.models.user;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class PrimaryAddress implements notifyManifestPublishTimeExpired {
    public static final String KEY_ADDRESS_LINE_1 = "line1";
    public static final String KEY_ADDRESS_LINE_2 = "line2";
    public static final String KEY_ADDRESS_LINE_3 = "line3";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_PINCODE = "pincode";
    private String mPincode = "";
    private String mAddressLine3 = "";
    private String mAddressLine2 = "";
    private String mAddressLine1 = "";
    private String mCountry = "";

    public String getCountry() {
        return this.mCountry;
    }

    public void setCountry(String str) {
        this.mCountry = str;
    }

    public String getAddressLine1() {
        return this.mAddressLine1;
    }

    public void setAddressLine1(String str) {
        this.mAddressLine1 = str;
    }

    public String getAddressLine2() {
        return this.mAddressLine2;
    }

    public void setAddressLine2(String str) {
        this.mAddressLine2 = str;
    }

    public String getAddressLine3() {
        return this.mAddressLine3;
    }

    public void setAddressLine3(String str) {
        this.mAddressLine3 = str;
    }

    public String getPincode() {
        return this.mPincode;
    }

    public void setPincode(String str) {
        this.mPincode = str;
    }

    public String getDisplayAddress() {
        return String.format(Locale.getDefault(), "%s\n%s\n%s\n%s\n%s", getAddressLine1(), getAddressLine2(), getAddressLine3(), getPincode(), getCountry());
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.mAddressLine1) && TextUtils.isEmpty(this.mAddressLine2) && TextUtils.isEmpty(this.mAddressLine3) && TextUtils.isEmpty(this.mPincode) && TextUtils.isEmpty(this.mPincode)) ? false : true;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mCountry = jSONObject.optString("country");
        this.mAddressLine1 = jSONObject.optString(KEY_ADDRESS_LINE_1);
        this.mAddressLine2 = jSONObject.optString(KEY_ADDRESS_LINE_2);
        this.mAddressLine3 = jSONObject.optString(KEY_ADDRESS_LINE_3);
        this.mPincode = jSONObject.optString("pincode");
    }

    public String toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("country", this.mCountry);
            jSONObject.put(KEY_ADDRESS_LINE_1, this.mAddressLine1);
            jSONObject.put(KEY_ADDRESS_LINE_2, this.mAddressLine2);
            jSONObject.put(KEY_ADDRESS_LINE_3, this.mAddressLine3);
            jSONObject.put("pincode", this.mPincode);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
