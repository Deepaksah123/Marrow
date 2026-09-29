package com.marrow.data.models.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.PhoneNumber;
import kotlin.isDvbProfileDeclared;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserShortInfo {
    private static final String KEY_CREATED_ON = "created_on";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_FIRST_NAME = "fname";
    private static final String KEY_ID = "_id";
    private static final String KEY_LAST_NAME = "lname";
    private static final String KEY_PHONE_NUMBER = "primary_contact";
    private static final String KEY_SUBSCRIPTION = "subscription";

    @JsonProperty("created_on")
    public long createdOn;

    @JsonProperty("email")
    public String email;

    @JsonProperty("fname")
    public String firstName;

    @JsonProperty("_id")
    public String id;

    @JsonProperty("lname")
    public String lastName;

    @JsonProperty("primary_contact")
    public PhoneNumber phoneNumber;

    @JsonProperty(KEY_SUBSCRIPTION)
    public String[] subscriptions;

    public String getDisplayName() {
        String str = this.lastName;
        if (".".equals(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName);
        sb.append(" ");
        sb.append(str);
        return sb.toString().trim();
    }

    public boolean hasProPlan() {
        String[] strArr = this.subscriptions;
        return strArr != null && strArr.length > 0;
    }

    public static class JsonParser {
        public static UserShortInfo fromJSON(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            UserShortInfo userShortInfo = new UserShortInfo();
            userShortInfo.id = jSONObject.optString("_id");
            userShortInfo.email = jSONObject.optString("email");
            userShortInfo.firstName = jSONObject.optString("fname");
            userShortInfo.lastName = jSONObject.optString("lname");
            userShortInfo.createdOn = jSONObject.optLong("created_on");
            userShortInfo.phoneNumber = PhoneNumber.JsonParser.fromJSON(jSONObject.optJSONObject("primary_contact"));
            userShortInfo.createdOn = jSONObject.optLong("created_on");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(UserShortInfo.KEY_SUBSCRIPTION);
            if (jSONArrayOptJSONArray != null) {
                userShortInfo.subscriptions = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONArrayOptJSONArray);
            }
            return userShortInfo;
        }

        public static UserShortInfo[] fromJSON(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            UserShortInfo[] userShortInfoArr = new UserShortInfo[length];
            for (int i = 0; i < length; i++) {
                userShortInfoArr[i] = fromJSON(jSONArray.optJSONObject(i));
            }
            return userShortInfoArr;
        }

        public static JSONObject toJSON(UserShortInfo userShortInfo) {
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, "_id", userShortInfo.id);
            isDvbProfileDeclared.write(jSONObject, "email", userShortInfo.email);
            isDvbProfileDeclared.write(jSONObject, "fname", userShortInfo.firstName);
            isDvbProfileDeclared.write(jSONObject, "lname", userShortInfo.lastName);
            isDvbProfileDeclared.read(jSONObject, "created_on", Long.valueOf(userShortInfo.createdOn));
            isDvbProfileDeclared.read(jSONObject, "primary_contact", PhoneNumber.JsonParser.toJSON(userShortInfo.phoneNumber));
            isDvbProfileDeclared.write(jSONObject, UserShortInfo.KEY_SUBSCRIPTION, parseLastSegmentNumberSupplementalProperty.IconCompatParcelizer(userShortInfo.subscriptions));
            isDvbProfileDeclared.read(jSONObject, "created_on", Long.valueOf(userShortInfo.createdOn));
            return jSONObject;
        }

        public static JSONArray toJSON(UserShortInfo[] userShortInfoArr) {
            if (userShortInfoArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (UserShortInfo userShortInfo : userShortInfoArr) {
                jSONArray.put(toJSON(userShortInfo));
            }
            return jSONArray;
        }
    }
}
