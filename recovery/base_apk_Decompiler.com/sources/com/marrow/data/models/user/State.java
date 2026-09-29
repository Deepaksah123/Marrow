package com.marrow.data.models.user;

import com.marrow.data.models.common.DataSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class State extends DataSet {
    public static final int FMG_STATE_ID = 101;
    private static final String KEY_ID = "_id";
    private int mId;

    @Override // com.marrow.data.models.common.DataSet
    public String getId() {
        return String.valueOf(this.mId);
    }

    public int getIdInt() {
        return this.mId;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public String getName() {
        return getData();
    }

    public void setName(String str) {
        setData(str);
    }

    @Override // com.marrow.data.models.common.DataSet, kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mId = jSONObject.optInt("_id");
        super.fromJSON(jSONObject);
    }

    @Override // com.marrow.data.models.common.DataSet
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        try {
            json.put("_id", this.mId);
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return json;
        }
    }
}
