package com.marrow.data.models.content;

import java.util.ArrayList;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class ContentBody implements notifyManifestPublishTimeExpired {
    private static final String KEY_BODY_HTML = "body_html";
    private static final String KEY_CONDITIONAL_END_TIME = "cond_html_et";
    private static final String KEY_CONDITIONAL_START_TIME = "cond_html_st";
    private static final String KEY_MULTI_THUMBNAIL = "multi_thumbnail";
    private static final String KEY_SHOW_DUMMY_REFERENCE = "show_dummy";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VIDEO = "video";
    private static final String KEY_YOUTUBE = "youtube";
    private static final long MS_CONDITIONAL_HTML_DEFAULT_DURATION = 7776000000L;
    public static final String TYPE_CONDITIONAL_HTML = "cond_html";
    public static final String TYPE_HTML = "html";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_VIDEO = "video";
    private String mBodyType;
    private String mHtmlContent;
    private ContentImage[] mImagesInfo;
    private VideoInfo mVideoInfo;
    private long msInterimHtmlEndTime;
    private long msInterimHtmlStartTime;
    private boolean showDummyReference;

    public boolean isHtmlContent() {
        return "html".equals(this.mBodyType);
    }

    public boolean isConditionalHtmlContent() {
        return TYPE_CONDITIONAL_HTML.equals(this.mBodyType);
    }

    public boolean isImageContent() {
        return "image".equals(this.mBodyType);
    }

    public boolean isVideo() {
        return "video".equals(this.mBodyType);
    }

    public ContentImage[] getImagesInfo() {
        return this.mImagesInfo;
    }

    public void setImagesInfo(ContentImage... contentImageArr) {
        this.mImagesInfo = contentImageArr;
    }

    public String getHtmlContent() {
        return this.mHtmlContent;
    }

    public void setHtmlContent(String str) {
        this.mHtmlContent = str;
    }

    public String getBodyType() {
        return this.mBodyType;
    }

    public void setBodyType(String str) {
        this.mBodyType = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // kotlin.notifyManifestPublishTimeExpired
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void fromJSON(org.json.JSONObject r8) {
        /*
            r7 = this;
            if (r8 == 0) goto La2
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.optString(r0)
            r7.mBodyType = r0
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "video"
            switch(r1) {
                case -870893912: goto L36;
                case 3213227: goto L2c;
                case 100313435: goto L22;
                case 112202875: goto L1a;
                default: goto L19;
            }
        L19:
            goto L40
        L1a:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L40
            r0 = r2
            goto L41
        L22:
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L2c:
            java.lang.String r1 = "html"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L36:
            java.lang.String r1 = "cond_html"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L40:
            r0 = -1
        L41:
            java.lang.String r1 = "show_dummy"
            java.lang.String r6 = "body_html"
            if (r0 == 0) goto L7c
            if (r0 == r4) goto L6f
            if (r0 == r3) goto L62
            if (r0 == r2) goto L4e
            goto La2
        L4e:
            org.json.JSONObject r8 = r8.optJSONObject(r5)
            com.marrow.data.models.content.VideoInfo r0 = new com.marrow.data.models.content.VideoInfo
            r0.<init>()
            com.marrow.data.models.content.VideoInfo$JsonParser r1 = new com.marrow.data.models.content.VideoInfo$JsonParser
            r1.<init>()
            r1.fromJSON(r8)
            r7.mVideoInfo = r0
            return
        L62:
            java.lang.String r0 = "multi_thumbnail"
            org.json.JSONArray r8 = r8.optJSONArray(r0)
            com.marrow.data.models.content.ContentImage[] r8 = com.marrow.data.models.content.ContentImage.fromJSON(r8)
            r7.mImagesInfo = r8
            return
        L6f:
            java.lang.String r0 = r8.optString(r6)
            r7.mHtmlContent = r0
            boolean r8 = r8.optBoolean(r1)
            r7.showDummyReference = r8
            return
        L7c:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r8.optString(r6)
            r7.mHtmlContent = r0
            java.lang.String r0 = "cond_html_st"
            long r2 = r8.optLong(r0, r2)
            r7.msInterimHtmlStartTime = r2
            r4 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r2 = r2 + r4
            java.lang.String r0 = "cond_html_et"
            long r2 = r8.optLong(r0, r2)
            r7.msInterimHtmlEndTime = r2
            boolean r8 = r8.optBoolean(r1)
            r7.showDummyReference = r8
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.content.ContentBody.fromJSON(org.json.JSONObject):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject toJSON() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r8.mBodyType
            if (r1 != 0) goto La
            return r0
        La:
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "video"
            switch(r2) {
                case -870893912: goto L36;
                case 3213227: goto L2c;
                case 100313435: goto L22;
                case 112202875: goto L1a;
                default: goto L19;
            }
        L19:
            goto L40
        L1a:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L40
            r1 = r3
            goto L41
        L22:
            java.lang.String r2 = "image"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            r1 = r4
            goto L41
        L2c:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            r1 = r5
            goto L41
        L36:
            java.lang.String r2 = "cond_html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            r1 = 0
            goto L41
        L40:
            r1 = -1
        L41:
            java.lang.String r2 = "show_dummy"
            java.lang.String r7 = "body_html"
            if (r1 == 0) goto L6c
            if (r1 == r5) goto L90
            if (r1 == r4) goto L60
            if (r1 == r3) goto L4e
            goto L9e
        L4e:
            com.marrow.data.models.content.VideoInfo r1 = r8.mVideoInfo
            java.util.Objects.requireNonNull(r1)
            com.marrow.data.models.content.VideoInfo$JsonParser r2 = new com.marrow.data.models.content.VideoInfo$JsonParser
            r2.<init>()
            org.json.JSONObject r1 = r2.toJSON()
            kotlin.isDvbProfileDeclared.read(r0, r6, r1)
            goto L9e
        L60:
            com.marrow.data.models.content.ContentImage[] r1 = r8.mImagesInfo
            org.json.JSONArray r1 = com.marrow.data.models.content.ContentImage.toJSON(r1)
            java.lang.String r2 = "multi_thumbnail"
            kotlin.isDvbProfileDeclared.write(r0, r2, r1)
            goto L9e
        L6c:
            long r3 = r8.msInterimHtmlStartTime
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "cond_html_st"
            kotlin.isDvbProfileDeclared.read(r0, r3, r1)
            long r3 = r8.msInterimHtmlEndTime
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "cond_html_et"
            kotlin.isDvbProfileDeclared.read(r0, r3, r1)
            java.lang.String r1 = r8.mHtmlContent
            kotlin.isDvbProfileDeclared.write(r0, r7, r1)
            boolean r1 = r8.showDummyReference
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.isDvbProfileDeclared.AudioAttributesCompatParcelizer(r0, r2, r1)
        L90:
            java.lang.String r1 = r8.mHtmlContent
            kotlin.isDvbProfileDeclared.write(r0, r7, r1)
            boolean r1 = r8.showDummyReference
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.isDvbProfileDeclared.AudioAttributesCompatParcelizer(r0, r2, r1)
        L9e:
            java.lang.String r1 = "type"
            java.lang.String r8 = r8.mBodyType
            kotlin.isDvbProfileDeclared.write(r0, r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.content.ContentBody.toJSON():org.json.JSONObject");
    }

    public static JSONArray toJSON(ContentBody[] contentBodyArr) {
        JSONArray jSONArray = new JSONArray();
        if (contentBodyArr != null && contentBodyArr.length != 0) {
            for (ContentBody contentBody : contentBodyArr) {
                jSONArray.put(contentBody.toJSON());
            }
        }
        return jSONArray;
    }

    public static ContentBody[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ContentBody[] contentBodyArr = new ContentBody[length];
        for (int i = 0; i < length; i++) {
            ContentBody contentBody = new ContentBody();
            contentBodyArr[i] = contentBody;
            contentBody.fromJSON(jSONArray.optJSONObject(i));
        }
        return contentBodyArr;
    }

    public static ContentBody[] fromSection(Section[] sectionArr) {
        if (sectionArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Section section : sectionArr) {
            int length = section.getBodyContents() != null ? section.getBodyContents().length : 0;
            for (int i = 0; i < length; i++) {
                arrayList.add(section.getBodyContents()[i]);
            }
        }
        return (ContentBody[]) arrayList.toArray(new ContentBody[arrayList.size()]);
    }

    public static String getReadableHtml(ContentBody[] contentBodyArr) {
        if (contentBodyArr != null && contentBodyArr.length != 0) {
            StringBuilder sb = null;
            for (ContentBody contentBody : contentBodyArr) {
                if (contentBody.isHtmlContent()) {
                    if (sb == null) {
                        sb = new StringBuilder(contentBody.getHtmlContent());
                    } else {
                        sb.append("\n");
                        sb.append(contentBody.getHtmlContent());
                    }
                    if (sb.length() >= 50) {
                        return sb.toString();
                    }
                }
            }
            if (sb != null) {
                return sb.toString();
            }
        }
        return null;
    }

    public VideoInfo getVideo() {
        return this.mVideoInfo;
    }

    public static ContentBody getFirstNonEmptyBody(ContentBody[] contentBodyArr) {
        if (contentBodyArr == null || contentBodyArr.length == 0) {
            return null;
        }
        for (ContentBody contentBody : contentBodyArr) {
            if (!contentBody.isHtmlContent() || !parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) contentBody.getHtmlContent())) {
                return contentBody;
            }
        }
        return null;
    }

    public static ContentBody getLastHtmlBody(ContentBody[] contentBodyArr) {
        if (contentBodyArr == null || contentBodyArr.length == 0) {
            return null;
        }
        for (int length = contentBodyArr.length - 1; length >= 0; length--) {
            if (contentBodyArr[length].isHtmlContent() || contentBodyArr[length].isConditionalHtmlContent()) {
                return contentBodyArr[length];
            }
        }
        return null;
    }

    public long getMsInterimHtmlStartTime() {
        return this.msInterimHtmlStartTime;
    }

    public void setMsInterimHtmlStartTime(long j) {
        this.msInterimHtmlStartTime = j;
    }

    public long getMsInterimHtmlEndTime() {
        return this.msInterimHtmlEndTime;
    }

    public void setMsInterimHtmlEndTime(long j) {
        this.msInterimHtmlEndTime = j;
    }

    public void setShowDummyReference(boolean z) {
        this.showDummyReference = z;
    }

    public boolean isShowDummyReference() {
        return this.showDummyReference;
    }
}
