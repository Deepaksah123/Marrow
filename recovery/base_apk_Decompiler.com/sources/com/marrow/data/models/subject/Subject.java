package com.marrow.data.models.subject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.Editor;
import java.util.List;
import java.util.Map;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subject implements PlayerEmsgHandlerManifestExpiryEventInfo {
    public static final int CHILD_TYPE_LESSON = 1;
    public static final int CHILD_TYPE_SUBJECT = 0;
    protected static final String KEY_CATEGORY = "category";
    protected static final String KEY_CHILD_TYPE = "child_type";
    protected static final String KEY_COURSE_ID = "course_id";
    protected static final String KEY_EDITOR_DETAIL = "editor_detail";
    protected static final String KEY_GROUP_ID = "group_id";
    protected static final String KEY_ICON_THUMBNAIL = "icon_thumbnail";
    public static final String KEY_ICON_THUMBNAIL_URL = "url";
    protected static final String KEY_ID = "_id";
    protected static final String KEY_IMAGE_ATTRIBUTION = "image_attribution";
    protected static final String KEY_IS_INTERACTIVE = "is_interactive";
    protected static final String KEY_LAST_UPDATED = "last_updated";
    protected static final String KEY_PARENT_ID = "parent_id";
    private static final String KEY_PUBLISHED_STATUS = "published_status";
    protected static final String KEY_QBANK_LAST_UPDATED_TIME = "qbank_dynamics_last_updated";
    protected static final String KEY_SORT_ORDER = "order";
    public static final String KEY_SUGGESTED_CRITERION = "criterion";
    private static final String KEY_SUGGESTED_SUBJECTS = "suggested_subjects";
    public static final String KEY_SUGGESTED_SUBJECT_ID = "subject_id";
    protected static final String KEY_THUMBNAIL = "thumbnail";
    protected static final String KEY_TITLE = "title";
    protected static final String KEY_UPDATED_STATUS = "updated_status";
    protected static final String KEY_VIDEO_LAST_UPDATED_TIME = "video_dynamics_last_updated";
    public static final String ROOT_PARENT_ID = "100";

    @JsonProperty("category")
    private int category;

    @JsonProperty(KEY_GROUP_ID)
    private int groupId = 1;

    @JsonProperty(KEY_ICON_THUMBNAIL)
    private Map<String, String> iconThumbnail;

    @JsonProperty(KEY_IMAGE_ATTRIBUTION)
    private Map<String, String> imageAttribution;

    @JsonProperty("course_id")
    protected int mCourseId;

    @JsonIgnore
    protected boolean mDoNotConsider;

    @JsonProperty(KEY_EDITOR_DETAIL)
    private Editor mEditorDetail;

    @JsonProperty("_id")
    protected String mId;

    @JsonProperty("thumbnail")
    @Deprecated(since = "v11.26.0; Alternative - use background less thumbnail - iconThumbnail")
    protected String mImageUrl;

    @JsonProperty(KEY_IS_INTERACTIVE)
    protected boolean mIsInteractive;

    @JsonProperty(KEY_LAST_UPDATED)
    protected long mLastUpdated;

    @JsonProperty(KEY_PARENT_ID)
    protected String mParentId;

    @JsonProperty(KEY_PUBLISHED_STATUS)
    protected String mPublishedStatus;

    @JsonProperty(KEY_QBANK_LAST_UPDATED_TIME)
    protected long mQbankUpdatedTime;

    @JsonProperty(KEY_SORT_ORDER)
    protected int mSortOrder;

    @JsonProperty("title")
    protected String mTitle;

    @JsonProperty(KEY_VIDEO_LAST_UPDATED_TIME)
    protected long mVideoUpdatedTime;

    @JsonProperty(KEY_SUGGESTED_SUBJECTS)
    private List<Map<String, String>> suggestedSubjects;

    @JsonProperty(KEY_UPDATED_STATUS)
    private UpdatedStatus updatedStatus;

    public int getCategory() {
        return this.category;
    }

    public void setCategory(int i) {
        this.category = i;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public boolean getIsInteractive() {
        return this.mIsInteractive;
    }

    public void setInteractive(Boolean bool) {
        this.mIsInteractive = bool.booleanValue();
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public int getSortOrder() {
        return this.mSortOrder;
    }

    public void setSortOrder(int i) {
        this.mSortOrder = i;
    }

    public String getPublishedStatus() {
        return this.mPublishedStatus;
    }

    public void setPublishedStatus(String str) {
        this.mPublishedStatus = str;
    }

    @Override // kotlin.PlayerEmsgHandlerManifestExpiryEventInfo
    public boolean isPublished() {
        return "published".equals(this.mPublishedStatus);
    }

    public String getParentId() {
        return this.mParentId;
    }

    public void setParentId(String str) {
        this.mParentId = str;
    }

    public boolean isDoNotConsider() {
        return this.mDoNotConsider;
    }

    public void setDoNotConsider(boolean z) {
        this.mDoNotConsider = z;
    }

    public boolean isRootSubject() {
        return ROOT_PARENT_ID.equals(this.mParentId);
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public long getQbankUpdatedTime() {
        return this.mQbankUpdatedTime;
    }

    public void setQbankUpdatedTime(long j) {
        this.mQbankUpdatedTime = j;
    }

    public long getVideoUpdatedTime() {
        return this.mVideoUpdatedTime;
    }

    public void setVideoUpdatedTime(long j) {
        this.mVideoUpdatedTime = j;
    }

    public Editor getEditor() {
        return this.mEditorDetail;
    }

    public void setEditorDetail(Editor editor) {
        this.mEditorDetail = editor;
    }

    public Map<String, String> getImageAttribution() {
        return this.imageAttribution;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public void setGroupId(int i) {
        this.groupId = i;
    }

    public Map<String, String> getIconThumbnail() {
        return this.iconThumbnail;
    }

    public void setIconThumbnail(Map<String, String> map) {
        this.iconThumbnail = map;
    }

    public List<Map<String, String>> getSuggestedSubjects() {
        return this.suggestedSubjects;
    }

    public void setSuggestedSubjects(List<Map<String, String>> list) {
        this.suggestedSubjects = list;
    }

    public UpdatedStatus getUpdatedStatus() {
        return this.updatedStatus;
    }
}
