package com.marrow.data.models.content;

import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class Section implements notifyManifestPublishTimeExpired {
    public static final int COLLAPSE = 1;
    public static final int DONT_COLLAPSE = 0;
    public static final String KEY_BODY = "body";
    public static final String KEY_COLLAPSIBLE = "collapsible";
    public static final String KEY_TITLE = "title";
    private ContentBody[] mBodyContents;
    private int mIsCollapsible;
    private String mSectionName;

    public boolean isCollapsible() {
        return this.mIsCollapsible == 1;
    }

    public void setCollapsible(boolean z) {
        this.mIsCollapsible = z ? 1 : 0;
    }

    public ContentBody[] getBodyContents() {
        return this.mBodyContents;
    }

    public void setBodyContents(ContentBody[] contentBodyArr) {
        this.mBodyContents = contentBodyArr;
    }

    public String getSectionName() {
        return this.mSectionName;
    }

    public void setSectionName(String str) {
        this.mSectionName = str;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mIsCollapsible = jSONObject.optInt(KEY_COLLAPSIBLE);
            this.mSectionName = jSONObject.optString("title");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("body");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                ContentBody[] contentBodyArr = new ContentBody[length];
                for (int i = 0; i < length; i++) {
                    ContentBody contentBody = new ContentBody();
                    contentBodyArr[i] = contentBody;
                    contentBody.fromJSON(jSONArrayOptJSONArray.optJSONObject(i));
                }
                this.mBodyContents = contentBodyArr;
            }
        }
    }

    public static Section[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        Section[] sectionArr = new Section[length];
        for (int i = 0; i < length; i++) {
            Section section = new Section();
            sectionArr[i] = section;
            section.fromJSON(jSONArray.optJSONObject(i));
        }
        return sectionArr;
    }
}
