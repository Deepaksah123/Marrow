package com.marrow.data.models.test;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestIndex implements PlayerEmsgHandlerManifestExpiryEventInfo {
    public static final String ALL_INDIA_ID = "-1";
    public static final int BOOLEAN_FLAG_IS_PAID = 1;
    public static final int BOOLEAN_FLAG_IS_REVIEW_AVAILABLE = 2;
    public static final String DEFAULT_TEST_LAST_VISITED_MCQ_ID = "";
    private static final int DEPRECATED_FLAG_IS_COMING_SOON = 4;
    private static final String KEY_AVAILABILITY_TYPE = "availability_type";
    private static final String KEY_CORRECT = "correct";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_DURATION = "duration";
    private static final String KEY_END_TIMESTAMP = "end_datetime";
    private static final String KEY_GUESS_STAT = "guess_stat";
    public static final String KEY_ID = "_id";
    private static final String KEY_INTRO = "intro";
    private static final String KEY_IS_ANONYMOUS = "is_anonymous";
    private static final String KEY_IS_PAID = "is_paid";
    private static final String KEY_IS_RANKED = "is_ranked";
    private static final String KEY_IS_REVIEW_AVAILABLE = "is_review_avl";
    private static final String KEY_IS_UPDATED = "is_updated";
    private static final String KEY_LAST_UPDATED = "last_updated";
    private static final String KEY_LIVE_STATUS = "live_status";
    private static final String KEY_MASTER_ORDER = "order";
    private static final String KEY_MCQ_COUNT = "mcq_count";
    private static final String KEY_MODIFIED_END_TIMESTAMP = "modified_end_datetime";
    private static final String KEY_PERCENTILE = "percentile";
    private static final String KEY_POSSIBLE_SCORE = "possible_score";
    private static final String KEY_RANK = "rank";
    private static final String KEY_SCORE = "score";
    private static final String KEY_SKIPPED = "skipped";
    private static final String KEY_SOLVED = "solved";
    private static final String KEY_STARTED_ON = "started_on";
    private static final String KEY_START_TIMESTAMP = "start_datetime";
    public static final String KEY_STATE_ID = "state_id";
    public static final String KEY_STATE_PERCENTILE = "state_percentile";
    public static final String KEY_STATE_RANK = "state_rank";
    public static final String KEY_STATE_TOTAL_ATTEMPT = "state_total_attempt";
    public static final String KEY_STATE_TOTAL_SOLVED = "state_solved";
    private static final String KEY_STATUS = "status";
    private static final String KEY_SUBJECT_ID = "subject_id";
    private static final String KEY_SUBMITTED_TIMESTAMP = "submitted_on";
    public static final String KEY_TEST_LAST_VISITED_MCQ_ID = "last_visited_mcq_id";
    public static final String KEY_TEST_MAX_MCQ_COUNT = "max_mcq_count";
    public static final String KEY_TEST_MOCK_TEST = "is_mock_test";
    public static final String KEY_TEST_PATTERN = "test_pattern";
    private static final String KEY_TEST_TYPE = "test_type";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TOTAL_ATTEMPT = "total_attempt";
    private static final String KEY_WRONG = "wrong";
    public static final int RANKED_VALID = -1;
    public static final int RANK_NOT_APPLICABLE = -2;
    public static final int RANK_NOT_CALCULATED = -1;
    public static final int RANK_PREDICTED = -2;
    public static final int STATUS_COMPLETED = 2;
    public static final int STATUS_IN_PROGRESS = 1;
    public static final int STATUS_NOT_STARTED = 0;
    public static final int TEST_PATTERN_AIIMS = 2;
    public static final int TEST_PATTERN_DEFAULT = 0;
    public static final int TEST_PATTERN_INICET = 4;
    public static final int TEST_PATTERN_INICET_GT_NEW = 7;
    public static final int TEST_PATTERN_INICET_NEW = 6;
    public static final int TEST_PATTERN_NEET_200 = 3;
    public static final int TEST_PATTERN_NEET_300 = 1;
    public static final String TEST_TYPE_200_MCQ_PATTERN = "200_mcq";
    public static final String TEST_TYPE_ALL = "all";
    public static final String TEST_TYPE_GRAND = "grand";
    public static final int TEST_TYPE_GRAND_INT = 2;
    public static final String TEST_TYPE_MINI = "mini";
    public static final int TEST_TYPE_MINI_INT = 1;
    public static final String TEST_TYPE_SUBJECT = "subject";
    public static final int TEST_TYPE_SUBJECT_INT = 3;

    @JsonProperty(KEY_AVAILABILITY_TYPE)
    private int availabilityType;

    @JsonProperty("is_anonymous")
    private boolean isAnonymous;

    @JsonProperty(KEY_TEST_MOCK_TEST)
    private boolean isMockTest;

    @JsonIgnore
    private int mBooleanFlags;

    @JsonProperty("correct")
    private int mCorrect;

    @JsonProperty("course_id")
    private int mCourseId;

    @JsonProperty(KEY_DURATION)
    private int mDuration;

    @JsonProperty(KEY_END_TIMESTAMP)
    private long mEndTimestamp;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty(KEY_INTRO)
    private String mIntro;

    @JsonProperty(KEY_LAST_UPDATED)
    private long mLastUpdated;

    @JsonProperty(KEY_MASTER_ORDER)
    private int mMasterOrder;

    @JsonProperty(KEY_MCQ_COUNT)
    private int mMcqCount;
    private long mModifiedEndTimestampMs;

    @JsonProperty("percentile")
    private double mPercentile;

    @JsonProperty("possible_score")
    private int mPossibleScore;

    @JsonProperty("published_status")
    private String mPublishedStatus;

    @JsonProperty("rank")
    private int mRank;

    @JsonProperty("score")
    private double mScore;

    @JsonProperty("skipped")
    private int mSkipped;

    @JsonProperty(KEY_SOLVED)
    private int mSolvedCount;

    @JsonProperty(KEY_START_TIMESTAMP)
    private long mStartTimestamp;

    @JsonProperty("status")
    private int mStatus;

    @JsonProperty("subject_id")
    private String mSubjectId;

    @JsonProperty(KEY_TEST_TYPE)
    private String mTestType;

    @JsonProperty("title")
    private String mTitle;

    @JsonProperty(KEY_TOTAL_ATTEMPT)
    private int mTotalAttempt;

    @JsonProperty(KEY_STARTED_ON)
    private long mUserStartedTimestamp;

    @JsonProperty(KEY_SUBMITTED_TIMESTAMP)
    private long mUserSubmissionTimeStamp;

    @JsonProperty("wrong")
    private int mWrong;

    @JsonProperty(KEY_TEST_MAX_MCQ_COUNT)
    private int maxMcqCount;

    @JsonProperty(KEY_STATE_PERCENTILE)
    private double statePercentile;

    @JsonProperty("state_rank")
    private int stateRank;

    @JsonProperty(KEY_STATE_TOTAL_SOLVED)
    private int stateSolved;

    @JsonProperty(KEY_STATE_TOTAL_ATTEMPT)
    private int stateTotalAttempt;

    @JsonProperty(KEY_TEST_PATTERN)
    private int testPattern;

    @JsonProperty(KEY_IS_RANKED)
    private int mIsRanked = -1;

    @JsonIgnore
    private boolean mDoNotConsider = false;

    @JsonProperty(KEY_IS_UPDATED)
    private boolean mIsServerContentUpdated = false;
    private boolean mIsFromDetailApi = false;

    @JsonProperty("state_id")
    private String stateId = ALL_INDIA_ID;

    @JsonProperty(KEY_TEST_LAST_VISITED_MCQ_ID)
    private String lastVisitedMcqId = "";

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getTestType() {
        return this.mTestType;
    }

    public void setTestType(String str) {
        this.mTestType = str;
    }

    public String getSubjectId() {
        return this.mSubjectId;
    }

    public void setSubjectId(String str) {
        this.mSubjectId = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getIntro() {
        return this.mIntro;
    }

    public void setIntro(String str) {
        this.mIntro = str;
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

    public int getDuration() {
        return this.mDuration;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public int getMcqCount() {
        return this.mMcqCount;
    }

    public void setMcqCount(int i) {
        this.mMcqCount = i;
    }

    public int getBooleanFlags() {
        return this.mBooleanFlags;
    }

    public void setBooleanFlags(int i) {
        this.mBooleanFlags = i;
    }

    public int getRank() {
        return this.mRank;
    }

    public void setRank(int i) {
        this.mRank = i;
    }

    public int getCorrect() {
        return this.mCorrect;
    }

    public void setCorrect(int i) {
        this.mCorrect = i;
    }

    public int getWrong() {
        return this.mWrong;
    }

    public void setWrong(int i) {
        this.mWrong = i;
    }

    public double getScore() {
        return this.mScore;
    }

    public void setScore(double d) {
        this.mScore = d;
    }

    public int getPossibleScore() {
        return this.mPossibleScore;
    }

    public void setPossibleScore(int i) {
        this.mPossibleScore = i;
    }

    public int getSkipped() {
        return this.mSkipped;
    }

    public void setSkipped(int i) {
        this.mSkipped = i;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public int getTotalAttempt() {
        return this.mTotalAttempt;
    }

    public void setTotalAttempt(int i) {
        this.mTotalAttempt = i;
    }

    public int getMasterOrder() {
        return this.mMasterOrder;
    }

    public void setMasterOrder(int i) {
        this.mMasterOrder = i;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public long getStartTimestamp() {
        return this.mStartTimestamp;
    }

    public void setStartTimestamp(long j) {
        this.mStartTimestamp = j;
    }

    public long getModifiedEndTimestampMs() {
        return this.mModifiedEndTimestampMs;
    }

    public void setModifiedEndTimestampMs(long j) {
        this.mModifiedEndTimestampMs = j;
    }

    public long getEndTimestamp() {
        return this.mEndTimestamp;
    }

    public void setEndTimestamp(long j) {
        this.mEndTimestamp = j;
    }

    public long getUserStartedTimestamp() {
        return this.mUserStartedTimestamp;
    }

    public void setUserStartedTimestamp(long j) {
        this.mUserStartedTimestamp = j;
    }

    public long getUserSubmissionTimestamp() {
        return this.mUserSubmissionTimeStamp;
    }

    public void setUserSubmissionTimestamp(long j) {
        this.mUserSubmissionTimeStamp = j;
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public boolean isPaid() {
        return (this.mBooleanFlags & 1) == 1;
    }

    public void setPaid(boolean z) {
        if (z) {
            this.mBooleanFlags |= 1;
        } else {
            this.mBooleanFlags &= -2;
        }
    }

    public boolean isReviewAvailable() {
        return (this.mBooleanFlags & 2) == 2;
    }

    public void setReviewAvailable(boolean z) {
        if (z) {
            this.mBooleanFlags |= 2;
        } else {
            this.mBooleanFlags &= -3;
        }
    }

    public String getTestTypeChar() {
        if (TextUtils.isEmpty(this.mTestType) || this.mTestType.length() == 0) {
            return null;
        }
        return this.mTestType.substring(0, 1).toUpperCase();
    }

    public boolean isDoNotConsider() {
        return this.mDoNotConsider;
    }

    public void setDoNotConsider(boolean z) {
        this.mDoNotConsider = z;
    }

    public int getSolvedCount() {
        return this.mSolvedCount;
    }

    public void setSolvedCount(int i) {
        this.mSolvedCount = i;
    }

    public double getPercentile() {
        return this.mPercentile;
    }

    public void setPercentile(double d) {
        this.mPercentile = d;
    }

    public boolean isServerContentUpdated() {
        return this.mIsServerContentUpdated;
    }

    public void setServerContentUpdated(boolean z) {
        this.mIsServerContentUpdated = z;
    }

    public boolean isStarted() {
        return this.mUserStartedTimestamp > 0;
    }

    public boolean isFromDetailApi() {
        return this.mIsFromDetailApi;
    }

    public void setFromDetailApi(boolean z) {
        this.mIsFromDetailApi = z;
    }

    public int getIsRanked() {
        return this.mIsRanked;
    }

    public void setRanked(int i) {
        this.mIsRanked = i;
    }

    public boolean isRankPredicted() {
        return this.mIsRanked == -2;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public void setIsAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public String getLastVisitedMcqId() {
        return this.lastVisitedMcqId;
    }

    public void setLastVisitedMcqId(String str) {
        this.lastVisitedMcqId = str;
    }

    @Deprecated
    public long getResultPublishTimestamp() {
        return getEndTimestamp();
    }

    @JsonProperty(KEY_IS_REVIEW_AVAILABLE)
    public void setReviewAvailable(JsonNode jsonNode) {
        if (jsonNode.asBoolean()) {
            this.mBooleanFlags |= 2;
        } else {
            this.mBooleanFlags &= -3;
        }
    }

    @JsonProperty(KEY_IS_PAID)
    public void setPaid(JsonNode jsonNode) {
        if (jsonNode.asBoolean()) {
            this.mBooleanFlags |= 1;
        } else {
            this.mBooleanFlags &= -2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof TestIndex) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(((TestIndex) obj).getId(), getId());
        }
        return super.equals(obj);
    }

    public long getTimeLeft() {
        return (this.mUserStartedTimestamp + (((long) this.mDuration) * 1000)) - System.currentTimeMillis();
    }

    public boolean isTestCompleted() {
        return this.mStatus == 2;
    }

    public boolean isTestDiscarded() {
        return this.mRank == -2;
    }

    public void setAvailabilityType(int i) {
        this.availabilityType = i;
    }

    public int getAvailabilityType() {
        return this.availabilityType;
    }

    public int getStateRank() {
        return this.stateRank;
    }

    public void setStateRank(int i) {
        this.stateRank = i;
    }

    public String getStateId() {
        return this.stateId;
    }

    public boolean isStateRankApplcable() {
        return !parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.stateId, ALL_INDIA_ID);
    }

    public void setStateId(String str) {
        this.stateId = str;
    }

    public double getStatePercentile() {
        return this.statePercentile;
    }

    public void setStatePercentile(double d) {
        this.statePercentile = d;
    }

    public int getStateTotalAttempt() {
        return this.stateTotalAttempt;
    }

    public void setStateTotalAttempt(int i) {
        this.stateTotalAttempt = i;
    }

    public int getStateSolvedCount() {
        return this.stateSolved;
    }

    public void setStateSolvedCount(int i) {
        this.stateSolved = i;
    }

    public void setTestPattern(int i) {
        this.testPattern = i;
    }

    public int getTestPattern() {
        return this.testPattern;
    }

    public void setIsMockTest(boolean z) {
        this.isMockTest = z;
    }

    public boolean getIsMockTest() {
        return this.isMockTest;
    }

    public int getMaxMcqCount() {
        return this.maxMcqCount;
    }

    public void setMaxMcqCount(int i) {
        this.maxMcqCount = i;
    }

    public long getTentativeEndTimestampMs() {
        long modifiedEndTimestampMs = getModifiedEndTimestampMs();
        return modifiedEndTimestampMs > 0 ? modifiedEndTimestampMs : getUserStartedTimestamp() + (((long) getDuration()) * 1000);
    }
}
