package com.marrow.data.models.pearl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.EncryptedContentArray;
import com.marrow.data.models.content.ContentBody;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pearl extends EncryptedContentArray<ContentBody> implements PlayerEmsgHandlerManifestExpiryEventInfo {
    private static final String KEY_ACTIVE_MCQ_COUNT = "active_mcq_count";
    private static final String KEY_BODY_ENCRYPT = "body_encrypt";
    private static final String KEY_BOOKMARK_LAST_UPDATED = "bookmark_last_updated";
    private static final String KEY_LAST_UPDATED = "last_updated";
    private static final String KEY_PEARL_DISPLAY_ID = "display_id";
    private static final String KEY_PEARL_NUMBER = "pearl_number";
    private static final String KEY_THUMBNAIL_HEIGHT = "theight";
    private static final String KEY_THUMBNAIL_WIDTH = "twidth";

    @JsonProperty(KEY_BOOKMARK_LAST_UPDATED)
    public long bookmarkLastUpdated;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private int mCourseId;

    @JsonIgnore
    private boolean mDoNotConsider;

    @JsonProperty(KEY_LAST_UPDATED)
    private long mLastUpdated;

    @JsonProperty("published_status")
    private String mPublishedStatus;

    @JsonProperty(KEY_THUMBNAIL_HEIGHT)
    private int mThumbnailHeight;

    @JsonProperty(KEY_THUMBNAIL_WIDTH)
    private int mThumbnailWidth;
    private String pearlBodyEncrypt;

    @JsonProperty(KEY_ACTIVE_MCQ_COUNT)
    private int relatedMcqCount;

    @JsonProperty("tlicense")
    private String mImageCitationLicense = "";

    @JsonProperty("tauthor")
    private String mImageCitationAuthor = "";

    @JsonProperty("tsource")
    private String mImageCitationLink = "";
    private PearlMini mMini = new PearlMini();

    public int isBookmarked() {
        return this.mMini.isBookmarked;
    }

    public void setBookmarked(int i) {
        this.mMini.setBookmarked(i);
    }

    public String getId() {
        return this.mMini.getId();
    }

    public void setId(String str) {
        this.mMini.setId(str);
    }

    public boolean isHtmlPearl() {
        return this.mMini.isHtmlPearl();
    }

    public boolean isImagePearl() {
        return this.mMini.isImagePearl();
    }

    public String getPearlType() {
        return this.mMini.getPearlType();
    }

    public void setPearlType(String str) {
        this.mMini.setPearlType(str);
    }

    public String getTitle() {
        return this.mMini.getTitle();
    }

    public void setTitle(String str) {
        this.mMini.setTitle(str);
    }

    public String getSubjectId() {
        return this.mMini.getSubjectId();
    }

    public String[] getRootSubjectIds() {
        return this.mMini.getKeyRootSubjectIds();
    }

    public void setRootSubjectIds(String[] strArr) {
        this.mMini.setKeyRootSubjectIds(strArr);
    }

    public String[] getSubjectIds() {
        return this.mMini.getKeySubjectIds();
    }

    public void setSubjectIds(String[] strArr) {
        this.mMini.setKeySubjectIds(strArr);
    }

    public void setSubjectId(String str) {
        this.mMini.setSubjectId(str);
    }

    public void setThumbnailUrl(String str) {
        this.mMini.setThumbnailUrl(str);
    }

    public void setThumbnailV2Url(String str) {
        this.mMini.setThumbnailV2Url(str);
    }

    public int getThumbnailWidth() {
        return this.mThumbnailWidth;
    }

    public void setThumbnailWidth(int i) {
        this.mThumbnailWidth = i;
    }

    public int getThumbnailHeight() {
        return this.mThumbnailHeight;
    }

    public void setThumbnailHeight(int i) {
        this.mThumbnailHeight = i;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public String getImageUrl() {
        return this.mMini.getImageUrl();
    }

    public String getImageV2Url() {
        return this.mMini.getImageV2Url();
    }

    public float getAspectRatio() {
        int i = this.mThumbnailWidth;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.mThumbnailHeight / i;
    }

    @Override // kotlin.PlayerEmsgHandlerManifestExpiryEventInfo
    public boolean isPublished() {
        return "published".equals(this.mPublishedStatus);
    }

    public String getPublishedStatus() {
        return this.mPublishedStatus;
    }

    public void setPublishedStatus(String str) {
        this.mPublishedStatus = str;
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public void setRelatedMcqCount(int i) {
        this.relatedMcqCount = i;
    }

    public int getRelatedMcqCount() {
        return this.relatedMcqCount;
    }

    public boolean hasBody() {
        ContentBody[] decryptedContent = getDecryptedContent();
        return decryptedContent != null && decryptedContent.length > 0;
    }

    public PearlMini getMini() {
        return this.mMini;
    }

    public String getReadableHtml() {
        ContentBody[] decryptedContent = getDecryptedContent();
        if (decryptedContent == null) {
            return null;
        }
        return ContentBody.getReadableHtml(decryptedContent);
    }

    public String getPearlDisplayId() {
        return this.mMini.getPearlDisplayId();
    }

    public void setPearlDisplayId(String str) {
        this.mMini.setPearlDisplayId(str);
    }

    public boolean isDoNotConsider() {
        return this.mDoNotConsider;
    }

    public void setDoNotConsider(boolean z) {
        this.mDoNotConsider = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marrow.data.models.EncryptedContentArray
    public ContentBody newEncryptedObject() {
        return new ContentBody();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marrow.data.models.EncryptedContentArray
    public ContentBody[] newEncryptedArray(int i) {
        return new ContentBody[i];
    }

    public static Pearl[] fromJsonArray(ArrayNode arrayNode, boolean z) {
        if (arrayNode == null) {
            return null;
        }
        int size = arrayNode.size();
        Pearl[] pearlArr = new Pearl[size];
        for (int i = 0; i < size; i++) {
            Pearl pearl = new Pearl();
            pearl.fromJSON(arrayNode.get(i));
            pearl.setDoNotConsider(z);
            pearlArr[i] = pearl;
        }
        return pearlArr;
    }

    public static ArrayList<Pearl> fromJsonArray2(ArrayNode arrayNode, boolean z) {
        if (arrayNode == null) {
            return null;
        }
        int size = arrayNode.size();
        ArrayList<Pearl> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Pearl pearl = new Pearl();
            pearl.fromJSON(arrayNode.get(i));
            pearl.setDoNotConsider(z);
            arrayList.add(pearl);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fromJSON(java.lang.String r3, com.fasterxml.jackson.databind.JsonNode r4) {
        /*
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -1628912797: goto L48;
                case -1537907854: goto L3e;
                case -1349817701: goto L34;
                case -860858926: goto L2a;
                case 338699282: goto L20;
                case 787894472: goto L16;
                case 1465833407: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L52
        Lc:
            java.lang.String r0 = "course_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 6
            goto L53
        L16:
            java.lang.String r0 = "body_encrypt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 5
            goto L53
        L20:
            java.lang.String r0 = "last_updated"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 4
            goto L53
        L2a:
            java.lang.String r0 = "twidth"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 3
            goto L53
        L34:
            java.lang.String r0 = "theight"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 2
            goto L53
        L3e:
            java.lang.String r0 = "active_mcq_count"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = r1
            goto L53
        L48:
            java.lang.String r0 = "published_status"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L52
            r0 = 0
            goto L53
        L52:
            r0 = -1
        L53:
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L87;
                case 2: goto L80;
                case 3: goto L79;
                case 4: goto L72;
                case 5: goto L64;
                case 6: goto L5d;
                default: goto L56;
            }
        L56:
            com.marrow.data.models.pearl.PearlMini r2 = r2.mMini
            boolean r2 = r2.fromJSON(r3, r4)
            return r2
        L5d:
            int r3 = r4.asInt()
            r2.mCourseId = r3
            return r1
        L64:
            java.lang.String r3 = r4.asText()
            com.marrow.data.models.pearl.PearlMini r4 = r2.mMini
            java.lang.String r4 = r4.getId()
            r2.initEncryptedContent(r4, r3)
            return r1
        L72:
            long r3 = r4.asLong()
            r2.mLastUpdated = r3
            return r1
        L79:
            int r3 = r4.asInt()
            r2.mThumbnailWidth = r3
            return r1
        L80:
            int r3 = r4.asInt()
            r2.mThumbnailHeight = r3
            return r1
        L87:
            int r3 = r4.asInt()
            r2.relatedMcqCount = r3
            return r1
        L8e:
            java.lang.String r3 = r4.asText()
            r2.mPublishedStatus = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.pearl.Pearl.fromJSON(java.lang.String, com.fasterxml.jackson.databind.JsonNode):boolean");
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

    public String getImageCitationLicense() {
        return this.mImageCitationLicense;
    }

    public void setImageCitationLicense(String str) {
        this.mImageCitationLicense = str;
    }

    public String getImageCitationAuthor() {
        return this.mImageCitationAuthor;
    }

    public void setImageCitationAuthor(String str) {
        this.mImageCitationAuthor = str;
    }

    public String getImageCitationLink() {
        return this.mImageCitationLink;
    }

    public void setImageCitationLink(String str) {
        this.mImageCitationLink = str;
    }

    @JsonProperty("_id")
    public void setId(JsonNode jsonNode) {
        this.mMini.fromJSON("_id", jsonNode);
        initEncryptedContent(this.mMini.getId(), this.pearlBodyEncrypt);
    }

    @JsonProperty(PearlMini.KEY_PEARL_TYPE)
    public void setPearlType(JsonNode jsonNode) {
        this.mMini.fromJSON(PearlMini.KEY_PEARL_TYPE, jsonNode);
    }

    @JsonProperty("title")
    public void setTitle(JsonNode jsonNode) {
        this.mMini.fromJSON("title", jsonNode);
    }

    @JsonProperty("display_id")
    public void setPearlNumber(JsonNode jsonNode) {
        this.mMini.fromJSON("display_id", jsonNode);
    }

    @JsonProperty("subject_id")
    public void setSubjectId(JsonNode jsonNode) {
        this.mMini.fromJSON("subject_id", jsonNode);
    }

    @JsonProperty(PearlMini.KEY_THUMBNAIL)
    public void setThumbnailUrl(JsonNode jsonNode) {
        this.mMini.fromJSON(PearlMini.KEY_THUMBNAIL, jsonNode);
    }

    @JsonProperty(PearlMini.KEY_THUMBNAIL_V2)
    public void setThumbnailV2Url(JsonNode jsonNode) {
        this.mMini.fromJSON(PearlMini.KEY_THUMBNAIL_V2, jsonNode);
    }

    @JsonProperty(KEY_BODY_ENCRYPT)
    public void setBodyEncrypt(JsonNode jsonNode) {
        this.pearlBodyEncrypt = jsonNode.asText();
        initEncryptedContent(this.mMini.getId(), jsonNode.asText());
    }

    @JsonProperty(PearlMini.KEY_ROOT_SUBJECT_IDS)
    public void setRootSubjectIds(JsonNode jsonNode) {
        this.mMini.fromJSON(PearlMini.KEY_ROOT_SUBJECT_IDS, jsonNode);
    }

    @JsonProperty("subject_ids")
    public void setSubjectIds(JsonNode jsonNode) {
        this.mMini.fromJSON("subject_ids", jsonNode);
    }

    @JsonIgnore
    public void setBodyEncrypt(String str, String str2) {
        initEncryptedContent(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pearl) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(((Pearl) obj).getId(), getId());
        }
        return super.equals(obj);
    }

    public boolean hasImageCitation() {
        return (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationAuthor) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLink) && parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLicense)) ? false : true;
    }

    public String getImageCitation() {
        StringBuilder sb = new StringBuilder("");
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLink)) {
            sb.append("Source: ");
            sb.append(this.mImageCitationLink);
            sb.append("\n\n");
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationAuthor)) {
            sb.append("Author: ");
            sb.append(this.mImageCitationAuthor);
            sb.append("\n\n");
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.mImageCitationLicense)) {
            sb.append("License: ");
            sb.append(this.mImageCitationLicense);
        }
        return sb.toString();
    }
}
