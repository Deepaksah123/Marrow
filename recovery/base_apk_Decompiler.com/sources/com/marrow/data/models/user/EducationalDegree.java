package com.marrow.data.models.user;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@Deprecated
public class EducationalDegree {
    public static final int INVALID_YEAR = -1;
    private static final String KEY_DEGREE = "degree";
    private static final String KEY_ID = "_id";
    private static final String KEY_INSTITUTE = "institutes";
    private static final String KEY_PASSING_YEAR = "yop";
    private static final String KEY_STATE_ID = "state_id";

    @JsonProperty(KEY_DEGREE)
    private String mDegree;

    @JsonProperty(KEY_INSTITUTE)
    private String mInstitute;

    @JsonProperty("_id")
    private String mInstituteId;

    @JsonProperty("yop")
    private int mPassingYear = -1;

    @JsonProperty("state_id")
    private int mStateId;

    @JsonIgnore
    public int getPassingYear() {
        return this.mPassingYear;
    }

    @JsonIgnore
    public void setPassingYear(int i) {
        this.mPassingYear = i;
    }

    @JsonIgnore
    public String getInstitute() {
        return this.mInstitute;
    }

    @JsonIgnore
    public void setInstitute(String str) {
        this.mInstitute = str;
    }

    @JsonIgnore
    public void setInstitute(Institute institute) {
        this.mInstitute = institute.getName();
        this.mStateId = institute.getStateId();
        this.mInstituteId = institute.getId();
    }

    @JsonIgnore
    public String getDegree() {
        return this.mDegree;
    }

    @JsonIgnore
    public void setDegree(String str) {
        this.mDegree = str;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return TextUtils.isEmpty(this.mDegree);
    }

    private void fromJSON(JSONObject jSONObject) {
        this.mDegree = jSONObject.optString(KEY_DEGREE);
        this.mPassingYear = jSONObject.optInt("yop");
        this.mInstitute = jSONObject.optString(KEY_INSTITUTE);
        this.mInstituteId = jSONObject.optString("_id");
        this.mStateId = jSONObject.optInt("state_id");
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_DEGREE, this.mDegree);
            jSONObject.put("yop", this.mPassingYear);
            jSONObject.put(KEY_INSTITUTE, this.mInstitute);
            jSONObject.put("state_id", this.mStateId);
            jSONObject.put("_id", this.mInstituteId);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONArray getJSONArray(List<EducationalDegree> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<EducationalDegree> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJsonObject());
            }
        }
        return jSONArray;
    }

    public boolean hasId() {
        return !TextUtils.isEmpty(this.mInstituteId);
    }

    public static List<EducationalDegree> toDegrees(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            EducationalDegree educationalDegree = new EducationalDegree();
            educationalDegree.fromJSON(jSONArray.optJSONObject(i));
            arrayList.add(educationalDegree);
        }
        return arrayList;
    }

    public Institute asInstitute() {
        Institute institute = new Institute();
        institute.setId(this.mInstituteId);
        institute.setStateId(this.mStateId);
        institute.setName(this.mInstitute);
        return institute;
    }
}
