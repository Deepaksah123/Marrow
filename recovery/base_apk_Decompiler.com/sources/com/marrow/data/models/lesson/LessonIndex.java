package com.marrow.data.models.lesson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import java.io.Serializable;
import java.util.List;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonIndex implements PlayerEmsgHandlerManifestExpiryEventInfo, Serializable {
    public static final String AR_QBANK_UNSET = "";
    public static final int BOOLEAN_FLAG_HAS_VIDEO = 2;
    public static final int BOOLEAN_FLAG_IS_COMING_SOON = 1;
    private static final String KEY_AR_QBANK_ID = "ar_qbank_id";
    private static final String KEY_ASSOCIATED_LESSON = "associated_lessons";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_EDITION_VALUE = "edition";
    private static final String KEY_EXPIRES_ON = "expires_on";
    private static final String KEY_HAS_SUBTITLE = "is_subtitle";
    private static final String KEY_HYT_IDS = "hyt_ids";
    private static final String KEY_HYVT_MCQ_COUNT = "hyvt_mcq_count";
    private static final String KEY_ID = "_id";
    private static final String KEY_INTRO = "intro";
    private static final String KEY_IS_ACTIVE = "is_active";
    private static final String KEY_IS_OPTIONAL = "is_opt";
    private static final String KEY_IS_PAID = "is_paid";
    private static final String KEY_IS_UPDATED = "is_updated";
    private static final String KEY_LABEL = "label";
    private static final String KEY_LAST_UPDATED = "last_updated";
    private static final String KEY_LESSON_NUMBER = "lesson_number";
    private static final String KEY_LESSON_READ_TIME = "lesson_read_time";
    private static final String KEY_LESSON_TYPE = "lesson_type";
    private static final String KEY_MASTER_ORDER = "master_order";
    private static final String KEY_MCQ_COUNT = "mcq_count";
    private static final String KEY_MY_RATING = "my_rating";
    private static final String KEY_PERCENTILE = "percentile";
    private static final String KEY_POSSIBLE_SCORE = "possible_score";
    private static final String KEY_PUBLISHED_STATUS = "published_status";
    private static final String KEY_PUBLISHED_TIME = "published_on";
    private static final String KEY_RATING = "rating";
    private static final String KEY_ROOT_SUBJECT_ID = "root_subject_id";
    private static final String KEY_SCORE = "score";
    private static final String KEY_SOLVED = "solved";
    private static final String KEY_STATUS = "status";
    private static final String KEY_SUBJECT_ID = "subject_id";
    private static final String KEY_SUBMISSION_TIME = "submitted_on";
    private static final String KEY_SUB_TITLE = "sub_title";
    private static final String KEY_TAG_TYPE = "type";
    private static final String KEY_THUMBNAIL = "thumbnail";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TOTAL_RATINGS = "total_ratings";
    private static final String KEY_UPDATED_STATUS_V2 = "updated_status_v2";
    private static final String KEY_VIDEO_ID = "video_id";
    public static final String TAG_TYPE_NEW = "new";
    public static final String TAG_TYPE_TIMELINE_UPDATE = "timeline_update";

    @JsonProperty(KEY_ASSOCIATED_LESSON)
    private List<AssociatedLessonIndex> associatedLessons;

    @JsonProperty(KEY_EDITION_VALUE)
    private int editionValue;

    @JsonProperty(KEY_HAS_SUBTITLE)
    private boolean hasVideoSubtitle;

    @JsonProperty(KEY_HYT_IDS)
    private String[] highYieldIds;
    private boolean isActiveForNewTag;

    @JsonProperty(KEY_IS_OPTIONAL)
    private boolean isOptional;
    private boolean isTagActive;
    private int lessonActivityStatus;

    @JsonIgnore
    private int mBooleanFlags;

    @JsonProperty("course_id")
    private int mCourseId;

    @JsonIgnore
    private boolean mDontConsider;

    @JsonIgnore
    public String mId;

    @JsonProperty("thumbnail")
    private String mImageUrl;

    @JsonProperty(KEY_INTRO)
    private String mIntro;

    @JsonProperty(KEY_IS_PAID)
    private boolean mIsPaid;
    private long mLastAttemptedTimeMs;

    @JsonProperty(KEY_LAST_UPDATED)
    private long mLastUpdated;

    @JsonProperty(KEY_SUBMISSION_TIME)
    private long mLessonCompletionTimeMs;

    @JsonProperty(KEY_LESSON_NUMBER)
    private int mLessonNumber;

    @JsonProperty(KEY_LESSON_READ_TIME)
    private String mLessonReadTimeText;

    @JsonProperty(KEY_MCQ_COUNT)
    private int mMCQCount;

    @JsonProperty(KEY_MASTER_ORDER)
    private int mMasterOrder;

    @JsonProperty(KEY_MY_RATING)
    private int mMyRating;

    @JsonIgnore
    private String[] mParentIds;

    @JsonProperty(KEY_SOLVED)
    private int mPeopleSolved;

    @JsonProperty("possible_score")
    private int mPossibleScore;

    @JsonProperty(KEY_PUBLISHED_STATUS)
    private String mPublishedStatus;

    @JsonProperty(KEY_PUBLISHED_TIME)
    private long mPublishedTime;

    @JsonProperty(KEY_RATING)
    private int mRatingCount;

    @JsonIgnore
    public String mRootSubjectId;

    @JsonProperty("score")
    private int mScore;

    @JsonProperty("status")
    private int mStatus;

    @JsonProperty(KEY_SUB_TITLE)
    private String mSubTitle;

    @JsonProperty("subject_id")
    private String mSubjectId;

    @JsonProperty("title")
    private String mTitle;

    @JsonProperty(KEY_TOTAL_RATINGS)
    private int mTotalPeopleRated;

    @JsonProperty(KEY_VIDEO_ID)
    private String mVideoId;
    private long newTagExpiryMs;

    @JsonProperty("percentile")
    private float percentile;
    private long tagExpiryMs;
    private String tagLabel;
    private String tagType;

    @JsonProperty(KEY_IS_UPDATED)
    protected boolean mIsServerContentUpdated = false;

    @JsonProperty(KEY_HYVT_MCQ_COUNT)
    private int pytMcqCount = 0;

    @JsonProperty(KEY_LESSON_TYPE)
    private int lessonType = 1;
    private String activeRecallQbankId = "";

    @JsonSetter("_id")
    public void setId(JsonNode jsonNode) {
        this.mId = jsonNode.asText();
    }

    public String getActiveRecallQbankId() {
        return this.activeRecallQbankId;
    }

    @JsonSetter(KEY_AR_QBANK_ID)
    public void setActiveRecallQbankId(JsonNode jsonNode) {
        this.activeRecallQbankId = jsonNode.asText();
    }

    public void setActiveRecallQbankId(String str) {
        this.activeRecallQbankId = str;
    }

    public int getLessonType() {
        return this.lessonType;
    }

    @JsonSetter(KEY_LESSON_TYPE)
    public void setLessonType(int i) {
        this.lessonType = i;
    }

    @JsonSetter(KEY_ROOT_SUBJECT_ID)
    public void setRootSubjectId(JsonNode jsonNode) {
        this.mRootSubjectId = jsonNode.asText();
    }

    @JsonSetter("is_coming_soon")
    public void setComingSoon(JsonNode jsonNode) {
        setComingSoon(jsonNode.booleanValue());
    }

    @JsonSetter("has_video")
    public void setHasVideo(JsonNode jsonNode) {
        setHasVideo(jsonNode.booleanValue());
    }

    @JsonSetter("updated_status")
    public void setNewLesson(JsonNode jsonNode) {
        if (jsonNode.has("is_active")) {
            this.isActiveForNewTag = jsonNode.get("is_active").asBoolean();
        }
        if (jsonNode.has(KEY_EXPIRES_ON)) {
            this.newTagExpiryMs = jsonNode.get(KEY_EXPIRES_ON).asLong();
        }
    }

    @JsonSetter(KEY_UPDATED_STATUS_V2)
    public void setUpdatedLesson(JsonNode jsonNode) {
        if (jsonNode.has("type")) {
            this.tagType = jsonNode.get("type").asText();
        }
        if (jsonNode.has("is_active")) {
            this.isTagActive = jsonNode.get("is_active").asBoolean();
        }
        if (jsonNode.has("label")) {
            this.tagLabel = jsonNode.get("label").asText();
        }
        if (jsonNode.has(KEY_EXPIRES_ON)) {
            this.tagExpiryMs = jsonNode.get(KEY_EXPIRES_ON).asLong();
        }
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setPaid(boolean z) {
        this.mIsPaid = z;
    }

    public boolean isPaid() {
        return this.mIsPaid;
    }

    public boolean isComingSoon() {
        return (this.mBooleanFlags & 1) == 1;
    }

    private void setComingSoon(boolean z) {
        if (z) {
            this.mBooleanFlags |= 1;
        } else {
            this.mBooleanFlags &= -2;
        }
    }

    public boolean hasVideo() {
        return (this.mBooleanFlags & 2) == 2;
    }

    private void setHasVideo(boolean z) {
        if (z) {
            this.mBooleanFlags |= 2;
        } else {
            this.mBooleanFlags &= -3;
        }
    }

    public float getPercentile() {
        return this.percentile;
    }

    public void setPercentile(float f) {
        this.percentile = f;
    }

    public String getRootSubjectId() {
        return this.mRootSubjectId;
    }

    public void setRootSubjectId(String str) {
        this.mRootSubjectId = str;
    }

    public String getPublishedStatus() {
        return this.mPublishedStatus;
    }

    public void setPublishedStatus(String str) {
        this.mPublishedStatus = str;
    }

    public String getSubTitle() {
        return this.mSubTitle;
    }

    public void setSubTitle(String str) {
        this.mSubTitle = str;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getSubjectId() {
        return this.mSubjectId;
    }

    public void setSubjectId(String str) {
        this.mSubjectId = str;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public long getPublishedTime() {
        return this.mPublishedTime;
    }

    public void setPublishedTime(long j) {
        this.mPublishedTime = j;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public int getPossibleScore() {
        return this.mPossibleScore;
    }

    public void setPossibleScore(int i) {
        this.mPossibleScore = i;
    }

    public boolean isOptional() {
        return this.isOptional;
    }

    public void setOptional(boolean z) {
        this.isOptional = z;
    }

    public int getScore() {
        return this.mScore;
    }

    public void setScore(int i) {
        this.mScore = i;
    }

    public String getIntro() {
        return this.mIntro;
    }

    public void setIntro(String str) {
        this.mIntro = str;
    }

    private boolean hasRating() {
        return this.mTotalPeopleRated > 0;
    }

    public float getAverageRating() {
        return hasRating() ? this.mRatingCount / this.mTotalPeopleRated : BitmapDescriptorFactory.HUE_RED;
    }

    public int getTotalPeopleRated() {
        return this.mTotalPeopleRated;
    }

    public void setTotalPeopleRated(int i) {
        this.mTotalPeopleRated = i;
    }

    public int getRatingCount() {
        return this.mRatingCount;
    }

    public void setRatingCount(int i) {
        this.mRatingCount = i;
    }

    public int getPeopleSolved() {
        return this.mPeopleSolved;
    }

    public void setPeopleSolved(int i) {
        this.mPeopleSolved = i;
    }

    public int getLessonNumber() {
        return this.mLessonNumber;
    }

    public void setLessonNumber(int i) {
        this.mLessonNumber = i;
    }

    @Override // kotlin.PlayerEmsgHandlerManifestExpiryEventInfo
    public boolean isPublished() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("published", this.mPublishedStatus);
    }

    public int getMasterOrder() {
        return this.mMasterOrder;
    }

    public void setMasterOrder(int i) {
        this.mMasterOrder = i;
    }

    public int getMCQCount() {
        return this.mMCQCount;
    }

    public void setMCQCount(int i) {
        this.mMCQCount = i;
    }

    public boolean isIsServerContentUpdated() {
        return this.mIsServerContentUpdated;
    }

    public void setServerContentUpdated(boolean z) {
        this.mIsServerContentUpdated = z;
    }

    public int getBooleanFlags() {
        return this.mBooleanFlags;
    }

    public void setBooleanFlags(int i) {
        this.mBooleanFlags = i;
    }

    public int getMyRating() {
        return this.mMyRating;
    }

    public void setMyRating(int i) {
        this.mMyRating = i;
    }

    public String getLessonReadTimeText() {
        return this.mLessonReadTimeText;
    }

    public void setLessonReadTimeText(String str) {
        this.mLessonReadTimeText = str;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public String getVideoId() {
        return this.mVideoId;
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public String[] getParentIds() {
        return this.mParentIds;
    }

    public void setVideoId(String str) {
        this.mVideoId = str;
    }

    @JsonSetter("subject_ids")
    public void setParentIds(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            ArrayNode arrayNode = (ArrayNode) jsonNode;
            int size = arrayNode.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = arrayNode.get(i).asText();
            }
            this.mParentIds = strArr;
        }
    }

    public void setParentIds(String[] strArr) {
        this.mParentIds = strArr;
    }

    public boolean isDontConsider() {
        return this.mDontConsider;
    }

    public void setDontConsider(boolean z) {
        this.mDontConsider = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LessonIndex) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mId, ((LessonIndex) obj).mId);
        }
        return super.equals(obj);
    }

    public long getCompletionTimeMs() {
        return this.mLessonCompletionTimeMs;
    }

    public void setCompletionTimeMs(long j) {
        this.mLessonCompletionTimeMs = j;
    }

    public long getLastAttemptedTimeMs() {
        return this.mLastAttemptedTimeMs;
    }

    public void setLastAttemptedTimeMs(long j) {
        this.mLastAttemptedTimeMs = j;
    }

    public void setHasVideoSubtitle(boolean z) {
        this.hasVideoSubtitle = z;
    }

    public int getEditionValue() {
        return this.editionValue;
    }

    public void setEditionValue(int i) {
        this.editionValue = i;
    }

    public void setLessonActivityStatus(int i) {
        this.lessonActivityStatus = i;
    }

    public int getLessonActivityStatus() {
        return this.lessonActivityStatus;
    }

    public HomeLessonIndexV2 toHomeLessonIndex(int i) {
        return new HomeLessonIndexV2(this, i);
    }

    public void setHighYieldIds(String[] strArr) {
        this.highYieldIds = strArr;
    }

    public String[] getHighYieldIds() {
        return this.highYieldIds;
    }

    public void setPytMcqCount(int i) {
        this.pytMcqCount = i;
    }

    public int getPytMcqCount() {
        return this.pytMcqCount;
    }

    public List<AssociatedLessonIndex> getAssociatedLessons() {
        return this.associatedLessons;
    }

    public void setAssociatedLessons(List<AssociatedLessonIndex> list) {
        this.associatedLessons = list;
    }

    public long getExpiryTimeMs() {
        return this.newTagExpiryMs;
    }

    public boolean isActiveForNewTag() {
        return this.isActiveForNewTag;
    }

    public void setNewTagToShow(boolean z) {
        this.isActiveForNewTag = z;
    }

    public void setNewExpiryTimeMs(long j) {
        this.newTagExpiryMs = j;
    }

    public String getTagType() {
        return this.tagType;
    }

    public void setTagType(String str) {
        this.tagType = str;
    }

    public boolean isTagActive() {
        return this.isTagActive;
    }

    public void setTagActive(boolean z) {
        this.isTagActive = z;
    }

    public String getTagLabel() {
        return this.tagLabel;
    }

    public void setTagLabel(String str) {
        this.tagLabel = str;
    }

    public long getTagExpiryMs() {
        return this.tagExpiryMs;
    }

    public void setTagExpiryMs(long j) {
        this.tagExpiryMs = j;
    }
}
