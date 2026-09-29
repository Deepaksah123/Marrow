package com.marrow.data.models.common;

import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DataSet implements notifyManifestPublishTimeExpired {
    private static final String KEY_ID = "_id";
    private static final String KEY_TITLE = "title";
    private String mId;
    private String mTitle;

    public static DataSet[] asDataSet(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        DataSet[] dataSetArr = new DataSet[length];
        for (int i = 0; i < length; i++) {
            DataSet dataSet = new DataSet();
            dataSetArr[i] = dataSet;
            dataSet.setId(strArr[i]);
            dataSetArr[i].setData(strArr[i]);
        }
        return dataSetArr;
    }

    public static String[] getData(DataSet[] dataSetArr) {
        int length = dataSetArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = dataSetArr[i].getData();
        }
        return strArr;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getData() {
        return this.mTitle;
    }

    public void setData(String str) {
        this.mTitle = str;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.mId;
            if (str != null) {
                jSONObject.put("_id", str);
            }
            String str2 = this.mTitle;
            if (str2 != null) {
                jSONObject.put("title", str2);
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mId = jSONObject.optString("_id");
        this.mTitle = jSONObject.optString("title");
    }

    public static DataSet[] fromJsonArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new DataSet[0];
        }
        int length = jSONArray.length();
        DataSet[] dataSetArr = new DataSet[length];
        for (int i = 0; i < length; i++) {
            DataSet dataSet = new DataSet();
            dataSetArr[i] = dataSet;
            dataSet.fromJSON(jSONArray.optJSONObject(i));
        }
        return dataSetArr;
    }

    public static JSONArray toJsonArray(DataSet[] dataSetArr) {
        JSONArray jSONArray = new JSONArray();
        if (dataSetArr != null) {
            for (DataSet dataSet : dataSetArr) {
                jSONArray.put(dataSet.toJSON());
            }
        }
        return jSONArray;
    }
}
