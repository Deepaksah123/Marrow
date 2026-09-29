package com.marrow.data.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber implements Serializable {
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_IS_VERIFIED = "is_verified";
    private static final String KEY_NATIONAL_NUMBER = "national_number";

    @JsonProperty(KEY_COUNTRY_CODE)
    private String mCountryCode;

    @JsonProperty(KEY_IS_VERIFIED)
    private int mIsVerified;

    @JsonProperty(KEY_NATIONAL_NUMBER)
    private String mNationalNumber;

    public PhoneNumber() {
        this.mCountryCode = "+91";
    }

    public PhoneNumber(String str, String str2) {
        this.mCountryCode = str;
        this.mNationalNumber = str2;
        this.mIsVerified = 0;
    }

    @JsonIgnore
    public String getCountryCode() {
        return this.mCountryCode;
    }

    @JsonIgnore
    public void setCountryCode(String str) {
        this.mCountryCode = str;
    }

    @JsonIgnore
    public String getNationalNumber() {
        return this.mNationalNumber;
    }

    @JsonIgnore
    public void setNationalNumber(String str) {
        this.mNationalNumber = str;
    }

    @JsonIgnore
    public boolean isVerified() {
        return this.mIsVerified != 0;
    }

    @JsonIgnore
    public void setVerified(boolean z) {
        this.mIsVerified = z ? 1 : 0;
    }

    public String asSingleEntity() {
        String string = this.mCountryCode;
        if (string != null && string.length() > 0 && !this.mCountryCode.startsWith("+")) {
            StringBuilder sb = new StringBuilder("+");
            sb.append(this.mCountryCode);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(this.mNationalNumber);
        return sb2.toString();
    }

    public String toString() {
        return JsonParser.toJSON(this).toString();
    }

    public static class JsonParser {
        public static PhoneNumber fromJSON(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.mCountryCode = jSONObject.optString(PhoneNumber.KEY_COUNTRY_CODE);
            phoneNumber.mNationalNumber = jSONObject.optString(PhoneNumber.KEY_NATIONAL_NUMBER);
            phoneNumber.mIsVerified = jSONObject.optInt(PhoneNumber.KEY_IS_VERIFIED, 0);
            return phoneNumber;
        }

        public static JSONObject toJSON(PhoneNumber phoneNumber) {
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, PhoneNumber.KEY_COUNTRY_CODE, phoneNumber.mCountryCode);
            isDvbProfileDeclared.write(jSONObject, PhoneNumber.KEY_NATIONAL_NUMBER, phoneNumber.mNationalNumber);
            isDvbProfileDeclared.read(jSONObject, PhoneNumber.KEY_IS_VERIFIED, Integer.valueOf(phoneNumber.mIsVerified));
            return jSONObject;
        }
    }
}
