package com.marrow.data.models.pearl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PearlMini {
    public static final String KEY_BOOKMARKED = "bookmarked";
    public static final String KEY_ID = "_id";
    public static final String KEY_PEARL_DISPLAY_ID = "display_id";
    public static final String KEY_PEARL_TYPE = "pearl_type";
    public static final String KEY_ROOT_SUBJECT_IDS = "root_subject_ids";
    public static final String KEY_SUBJECT_ID = "subject_id";
    public static final String KEY_SUBJECT_IDS = "subject_ids";
    public static final String KEY_THUMBNAIL = "thumbnail";
    public static final String KEY_THUMBNAIL_V2 = "thumbnail_v2";
    public static final String KEY_TITLE = "title";
    public static final String TYPE_HTML = "html";
    public static final int TYPE_HTML_INT = 0;
    public static final String TYPE_IMAGE = "image";
    public static final int TYPE_IMAGE_INT = 1;

    @JsonIgnore
    public int isBookmarked;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty(KEY_PEARL_DISPLAY_ID)
    private String mPearlDisplayId;

    @JsonProperty(KEY_PEARL_TYPE)
    private String mPearlType;

    @JsonIgnore
    private String[] mRootSubjectIds;

    @JsonProperty("subject_id")
    private String mSubject;

    @JsonIgnore
    private String[] mSubjectIds;

    @JsonProperty("title")
    private String mThumbnailUrl;

    @JsonProperty(KEY_THUMBNAIL_V2)
    private String mThumbnailV2Url;

    @JsonProperty(KEY_THUMBNAIL)
    private String mTitle;

    @JsonSetter("bookmarked")
    public void setBookmarked(JsonNode jsonNode) {
        this.isBookmarked = jsonNode.asInt();
    }

    @JsonIgnore
    public void setBookmarked(int i) {
        this.isBookmarked = i;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public boolean isHtmlPearl() {
        return "html".equals(this.mPearlType);
    }

    public boolean isImagePearl() {
        return "image".equals(this.mPearlType);
    }

    public String getPearlType() {
        return this.mPearlType;
    }

    public void setPearlType(String str) {
        this.mPearlType = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getSubjectId() {
        return this.mSubject;
    }

    public void setKeyRootSubjectIds(String[] strArr) {
        this.mRootSubjectIds = strArr;
    }

    public String[] getKeyRootSubjectIds() {
        return this.mRootSubjectIds;
    }

    public void setKeySubjectIds(String[] strArr) {
        this.mSubjectIds = strArr;
    }

    public String[] getKeySubjectIds() {
        return this.mSubjectIds;
    }

    public void setSubjectId(String str) {
        this.mSubject = str;
    }

    public void setThumbnailUrl(String str) {
        this.mThumbnailUrl = str;
    }

    public String getImageUrl() {
        return this.mThumbnailUrl;
    }

    public void setThumbnailV2Url(String str) {
        this.mThumbnailV2Url = str;
    }

    public String getImageV2Url() {
        return this.mThumbnailV2Url;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fromJSON(java.lang.String r5, com.fasterxml.jackson.databind.JsonNode r6) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.pearl.PearlMini.fromJSON(java.lang.String, com.fasterxml.jackson.databind.JsonNode):boolean");
    }

    public void fromJSON(JsonNode jsonNode) {
        if (jsonNode != null) {
            Iterator<String> itFieldNames = jsonNode.fieldNames();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                fromJSON(next, jsonNode.get(next));
            }
        }
    }

    public String getPearlDisplayId() {
        return this.mPearlDisplayId;
    }

    public void setPearlDisplayId(String str) {
        this.mPearlDisplayId = str;
    }
}
