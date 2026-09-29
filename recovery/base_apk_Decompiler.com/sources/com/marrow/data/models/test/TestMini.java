package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.getRenewGrpId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010(\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\"\u0010+\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u0010/\u001a\u00020.8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020.8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u00108\u001a\u00020.8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\"\u0010;\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\"\u0010?\u001a\u00020>8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001d\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R\"\u0010G\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001d\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010!R\"\u0010J\u001a\u00020.8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u00100\u001a\u0004\bK\u00102\"\u0004\bL\u00104R\"\u0010M\u001a\u00020.8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00100\u001a\u0004\bN\u00102\"\u0004\bO\u00104R\"\u0010P\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001d\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R$\u0010S\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010A\"\u0004\b\t\u0010CR\u0013\u0010U\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\bT\u0010\u000fR\u0011\u0010W\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\bV\u00102"}, d2 = {"Lcom/marrow/data/models/test/TestMini;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setReviewAvailable", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "setPaid", "setComingSoon", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "testType", "getTestType", "setTestType", "subjectId", "getSubjectId", "setSubjectId", "title", "getTitle", "setTitle", "", TestMini.KEY_DURATION, "I", "getDuration", "()I", "setDuration", "(I)V", "mcqCount", "getMcqCount", "setMcqCount", "booleanFlags", "getBooleanFlags", "setBooleanFlags", "rank", "getRank", "setRank", "status", "getStatus", "setStatus", "", "startTimestamp", "J", "getStartTimestamp", "()J", "setStartTimestamp", "(J)V", "endTimestamp", "getEndTimestamp", "setEndTimestamp", "modifiedEndTimestampMs", "getModifiedEndTimestampMs", "setModifiedEndTimestampMs", "testPattern", "getTestPattern", "setTestPattern", "", "isMockTest", "Z", "()Z", "setMockTest", "(Z)V", "maxMcqCount", "getMaxMcqCount", "setMaxMcqCount", "availabilityType", "getAvailabilityType", "setAvailabilityType", "userStartedTimestampMs", "getUserStartedTimestampMs", "setUserStartedTimestampMs", "userSubmittedTimestampMs", "getUserSubmittedTimestampMs", "setUserSubmittedTimestampMs", "testStatus", "getTestStatus", "setTestStatus", "isPaid", "getTestTypeChar", "testTypeChar", "getResultPublishTimestamp", "resultPublishTimestamp", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestMini {
    private static final int BOOLEAN_FLAG_IS_COMING_SOON = 4;
    private static final int BOOLEAN_FLAG_IS_PAID = 1;
    private static final int BOOLEAN_FLAG_IS_REVIEW_AVAILABLE = 2;
    private static final String KEY_DURATION = "duration";
    private static final String KEY_END_TIMESTAMP = "end_datetime";
    private static final String KEY_ID = "_id";
    private static final String KEY_IS_COMING_SOON = "is_coming_soon";
    private static final String KEY_IS_MOCK_TEST = "is_mock_test";
    private static final String KEY_IS_PAID = "is_paid";
    private static final String KEY_IS_REVIEW_AVAILABLE = "is_review_avl";
    private static final String KEY_MAX_MCQ_COUNT = "max_mcq_count";
    private static final String KEY_MCQ_COUNT = "mcq_count";
    private static final String KEY_RANK = "rank";
    private static final String KEY_START_TIMESTAMP = "start_datetime";
    private static final String KEY_STATUS = "status";
    private static final String KEY_SUBJECT_ID = "subject_id";
    private static final String KEY_TEST_MODIFIED_END_TIMESTAMP = "modified_end_timestamp";
    private static final String KEY_TEST_PATTERN = "test_pattern";
    private static final String KEY_TEST_TYPE = "test_type";
    private static final String KEY_TITLE = "title";
    public static final int LIVE_ONLY = 1;
    public static final int RANKED_VALID = -1;
    public static final int RANK_NOT_APPLICABLE = -2;
    public static final int RANK_NOT_CALCULATED = -1;
    public static final int RANK_PREDICTED = -2;
    public static final int STATUS_COMPLETED = 2;
    public static final int STATUS_IN_PROGRESS = 1;
    public static final int STATUS_NOT_STARTED = 0;
    public static final String TEST_TYPE_ALL = "all";
    public static final String TEST_TYPE_GRAND = "grand";
    public static final int TEST_TYPE_GRAND_INT = 2;
    public static final String TEST_TYPE_MINI = "mini";
    public static final int TEST_TYPE_MINI_INT = 1;
    public static final String TEST_TYPE_SUBJECT = "subject";
    public static final int TEST_TYPE_SUBJECT_INT = 3;
    public static final int TYPE_EXPIRED = 2;
    public static final int TYPE_LIVE = 1;
    public static final int TYPE_NONE = 4;
    public static final int TYPE_UPCOMING = 3;
    private int availabilityType;

    @JsonIgnore
    private int booleanFlags;

    @JsonProperty(KEY_DURATION)
    private int duration;

    @JsonProperty(KEY_END_TIMESTAMP)
    private long endTimestamp;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("is_mock_test")
    private boolean isMockTest;

    @JsonProperty("max_mcq_count")
    private int maxMcqCount;

    @JsonProperty(KEY_MCQ_COUNT)
    private int mcqCount;
    private long modifiedEndTimestampMs;

    @JsonProperty("rank")
    private int rank;

    @JsonProperty(KEY_START_TIMESTAMP)
    private long startTimestamp;

    @JsonProperty("status")
    private int status;

    @JsonProperty("subject_id")
    private String subjectId;

    @JsonProperty("test_pattern")
    private int testPattern;
    private int testStatus;

    @JsonProperty(KEY_TEST_TYPE)
    private String testType;

    @JsonProperty("title")
    private String title;
    private long userStartedTimestampMs;
    private long userSubmittedTimestampMs;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getTestType() {
        return this.testType;
    }

    public final void setTestType(String str) {
        this.testType = str;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final void setSubjectId(String str) {
        this.subjectId = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final void setMcqCount(int i) {
        this.mcqCount = i;
    }

    public final int getBooleanFlags() {
        return this.booleanFlags;
    }

    public final void setBooleanFlags(int i) {
        this.booleanFlags = i;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setStartTimestamp(long j) {
        this.startTimestamp = j;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final void setEndTimestamp(long j) {
        this.endTimestamp = j;
    }

    public final long getModifiedEndTimestampMs() {
        return this.modifiedEndTimestampMs;
    }

    public final void setModifiedEndTimestampMs(long j) {
        this.modifiedEndTimestampMs = j;
    }

    public final int getTestPattern() {
        return this.testPattern;
    }

    public final void setTestPattern(int i) {
        this.testPattern = i;
    }

    /* JADX INFO: renamed from: isMockTest, reason: from getter */
    public final boolean getIsMockTest() {
        return this.isMockTest;
    }

    public final void setMockTest(boolean z) {
        this.isMockTest = z;
    }

    public final int getMaxMcqCount() {
        return this.maxMcqCount;
    }

    public final void setMaxMcqCount(int i) {
        this.maxMcqCount = i;
    }

    public final int getAvailabilityType() {
        return this.availabilityType;
    }

    public final void setAvailabilityType(int i) {
        this.availabilityType = i;
    }

    public final long getUserStartedTimestampMs() {
        return this.userStartedTimestampMs;
    }

    public final void setUserStartedTimestampMs(long j) {
        this.userStartedTimestampMs = j;
    }

    public final long getUserSubmittedTimestampMs() {
        return this.userSubmittedTimestampMs;
    }

    public final void setUserSubmittedTimestampMs(long j) {
        this.userSubmittedTimestampMs = j;
    }

    public final int getTestStatus() {
        return this.testStatus;
    }

    public final void setTestStatus(int i) {
        this.testStatus = i;
    }

    public final boolean isPaid() {
        return (this.booleanFlags & 1) == 1;
    }

    public final void setPaid(boolean z) {
        if (z) {
            this.booleanFlags |= 1;
        } else {
            this.booleanFlags &= -2;
        }
    }

    public final String getTestTypeChar() {
        String strRemoteActionCompatParcelizer;
        String str = this.testType;
        if (str == null || (strRemoteActionCompatParcelizer = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(str, 1)) == null) {
            return null;
        }
        String upperCase = strRemoteActionCompatParcelizer.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        return upperCase;
    }

    @getRenewGrpId
    public final long getResultPublishTimestamp() {
        return this.endTimestamp;
    }

    @JsonProperty(KEY_IS_REVIEW_AVAILABLE)
    public final void setReviewAvailable(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.asBoolean()) {
            this.booleanFlags |= 2;
        } else {
            this.booleanFlags &= -3;
        }
    }

    @JsonProperty(KEY_IS_PAID)
    public final void setPaid(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.asBoolean()) {
            this.booleanFlags |= 1;
        } else {
            this.booleanFlags &= -2;
        }
    }

    @JsonProperty(KEY_IS_COMING_SOON)
    public final void setComingSoon(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.asBoolean()) {
            this.booleanFlags |= 4;
        } else {
            this.booleanFlags &= -5;
        }
    }
}
