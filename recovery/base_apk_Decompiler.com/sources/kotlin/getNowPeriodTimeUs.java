package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.api.models.response.test.TestStartResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.test.StateResult;
import com.marrow.data.models.test.TestAttendeeData;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TopUser;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getNowPeriodTimeUs extends primaryTrack<TestIndex> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return write((TestIndex) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return MediaDescriptionCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return IconCompatParcelizer((TestIndex) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNowPeriodTimeUs(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "_test", getstreampositionusforcontent);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TestIndex IconCompatParcelizer(boolean z) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listWrite = IntermediateLoginResponseBody.write(String.valueOf(jCurrentTimeMillis), String.valueOf(jCurrentTimeMillis), "2");
        if (!z) {
            str = "end_datetime>? AND start_datetime<? AND status <> ? ";
        } else {
            listWrite.add("grand");
            str = "end_datetime>? AND start_datetime<? AND status <> ?  AND test_type =? ";
        }
        return (TestIndex) AudioAttributesCompatParcelizer(str, (String[]) listWrite.toArray(new String[0]), "end_datetime ASC LIMIT 1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TestIndex RemoteActionCompatParcelizer(boolean z) {
        String str;
        List listWrite = IntermediateLoginResponseBody.write(SessionDescription.SUPPORTED_SDP_VERSION, String.valueOf(System.currentTimeMillis()), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        if (!z) {
            str = "test_begin_timestamp>? AND test_begin_timestamp<? AND status =? ";
        } else {
            listWrite.add("grand");
            str = "test_begin_timestamp>? AND test_begin_timestamp<? AND status =?  AND test_type =? ";
        }
        return (TestIndex) AudioAttributesCompatParcelizer(str, (String[]) listWrite.toArray(new String[0]), "end_datetime ASC LIMIT 1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TestIndex read(boolean z) {
        String str;
        List listWrite = IntermediateLoginResponseBody.write(String.valueOf(System.currentTimeMillis()), "2");
        if (!z) {
            str = "end_datetime<? AND status <> ? ";
        } else {
            listWrite.add("grand");
            str = "end_datetime<? AND status <> ?  AND test_type =? ";
        }
        return (TestIndex) AudioAttributesCompatParcelizer(str, (String[]) listWrite.toArray(new String[0]), "end_datetime DESC LIMIT 1");
    }

    public final TestIndex[] write() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return read("end_datetime>? AND end_datetime<? AND status =?  AND is_ranked =?  AND boolean_flags & 2=2", new String[]{String.valueOf(jCurrentTimeMillis - 86400000), String.valueOf(jCurrentTimeMillis - 900000), "2", TestIndex.ALL_INDIA_ID}, "end_datetime DESC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TestIndex AudioAttributesCompatParcelizer(boolean z) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listWrite = IntermediateLoginResponseBody.write(String.valueOf(jCurrentTimeMillis), String.valueOf(jCurrentTimeMillis), "2");
        if (!z) {
            str = "end_datetime>? AND start_datetime<? AND status <> ? ";
        } else {
            listWrite.add("grand");
            str = "end_datetime>? AND start_datetime<? AND status <> ?  AND test_type =? ";
        }
        return (TestIndex) AudioAttributesCompatParcelizer(str, (String[]) listWrite.toArray(new String[0]), "start_datetime DESC LIMIT 1");
    }

    public final void read(TestAttendeeData testAttendeeData) {
        toMagicModuleMetaRepoModel.write(testAttendeeData, "");
        String strMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        String[] strArr = {testAttendeeData.getTestId()};
        if (write(MediaBrowserCompatSearchResultReceiver(), strArr) <= 0) {
            return;
        }
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("score", Double.valueOf(testAttendeeData.getScore())), setAction.write("possible_score", Integer.valueOf(testAttendeeData.getPossibleScore())), setAction.write(TopUser.KEY_RANK, Integer.valueOf(testAttendeeData.getRank())), setAction.write("is_ranked", Integer.valueOf(testAttendeeData.getIsRanked())), setAction.write("submission_timestamp", Long.valueOf(testAttendeeData.getSubmissionTimestamp())), setAction.write("test_begin_timestamp", Long.valueOf(testAttendeeData.getTestBeginTimestamp())), setAction.write("status", Integer.valueOf(testAttendeeData.getStatus())), setAction.write("is_updated", 1)), strMediaBrowserCompatSearchResultReceiver, strArr);
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.putAll(VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("title", "TEXT"), setAction.write("test_type", "TEXT"), setAction.write("subject_id", "TEXT"), setAction.write("intro", "TEXT"), setAction.write("published_status", "TEXT"), setAction.write("start_datetime", "INTEGER"), setAction.write("end_datetime", "INTEGER"), setAction.write("modified_end_datetime", "INTEGER"), setAction.write("last_updated", "INTEGER"), setAction.write("test_begin_timestamp", "INTEGER"), setAction.write("submission_timestamp", "INTEGER"), setAction.write("boolean_flags", "INTEGER"), setAction.write("duration", "INTEGER"), setAction.write("mcq_count", "INTEGER"), setAction.write(TopUser.KEY_RANK, "INTEGER"), setAction.write("correct", "INTEGER"), setAction.write("wrong", "INTEGER"), setAction.write("score", "REAL"), setAction.write("possible_score", "INTEGER"), setAction.write("skipped", "INTEGER"), setAction.write("total_attempt", "INTEGER"), setAction.write("status", "INTEGER"), setAction.write("do_not_consider", "INTEGER"), setAction.write("percentile", "REAL"), setAction.write("solved", "INTEGER"), setAction.write("is_updated", "INTEGER"), setAction.write("is_ranked", "INTEGER"), setAction.write(TopUser.KEY_IS_ANONYMOUS, "INTEGER"), setAction.write("live_status", "INTEGER"), setAction.write("state_id", "TEXT"), setAction.write(TestIndex.KEY_STATE_PERCENTILE, "REAL"), setAction.write("state_rank", "INTEGER"), setAction.write(TestIndex.KEY_STATE_TOTAL_ATTEMPT, "INTEGER"), setAction.write(TestIndex.KEY_STATE_TOTAL_SOLVED, "INTEGER"), setAction.write(TestIndex.KEY_TEST_PATTERN, "INTEGER"), setAction.write("master_order", "INTEGER"), setAction.write(TestIndex.KEY_TEST_MOCK_TEST, "INTEGER"), setAction.write(TestIndex.KEY_TEST_MAX_MCQ_COUNT, "INTEGER"), setAction.write(TestIndex.KEY_TEST_LAST_VISITED_MCQ_ID, "TEXT")));
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static TestIndex read(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        TestIndex testIndex = new TestIndex();
        testIndex.setId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id"));
        testIndex.setTitle(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "title"));
        testIndex.setIntro(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "intro"));
        testIndex.setSubjectId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "subject_id"));
        testIndex.setPublishedStatus(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "published_status"));
        testIndex.setTestType(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "test_type"));
        testIndex.setCourseId(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, FilterParams.KEY_COURSE_ID));
        testIndex.setDuration(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "duration"));
        testIndex.setMcqCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_count"));
        testIndex.setBooleanFlags(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "boolean_flags"));
        testIndex.setStartTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "start_datetime"));
        testIndex.setEndTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "end_datetime"));
        testIndex.setModifiedEndTimestampMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "modified_end_datetime"));
        testIndex.setLastUpdated(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_updated"));
        testIndex.setUserStartedTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "test_begin_timestamp"));
        testIndex.setUserSubmissionTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "submission_timestamp"));
        testIndex.setCorrect(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "correct"));
        testIndex.setWrong(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "wrong"));
        testIndex.setSkipped(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "skipped"));
        testIndex.setScore(copyAdaptationSets.write(cursor, "score"));
        testIndex.setPossibleScore(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "possible_score"));
        testIndex.setMasterOrder(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "master_order"));
        testIndex.setStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "status"));
        testIndex.setRank(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TopUser.KEY_RANK));
        testIndex.setSolvedCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "solved"));
        testIndex.setPercentile(copyAdaptationSets.write(cursor, "percentile"));
        testIndex.setTotalAttempt(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "total_attempt"));
        testIndex.setDoNotConsider(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "do_not_consider"));
        testIndex.setServerContentUpdated(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_updated"));
        testIndex.setRanked(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "is_ranked"));
        testIndex.setIsAnonymous(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, TopUser.KEY_IS_ANONYMOUS));
        testIndex.setAvailabilityType(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "live_status"));
        testIndex.setStateId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "state_id"));
        testIndex.setStatePercentile(copyAdaptationSets.write(cursor, TestIndex.KEY_STATE_PERCENTILE));
        testIndex.setStateRank(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "state_rank"));
        testIndex.setStateTotalAttempt(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_STATE_TOTAL_ATTEMPT));
        testIndex.setStateSolvedCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_STATE_TOTAL_SOLVED));
        testIndex.setTestPattern(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_TEST_PATTERN));
        testIndex.setIsMockTest(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, TestIndex.KEY_TEST_MOCK_TEST));
        testIndex.setMaxMcqCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_TEST_MAX_MCQ_COUNT));
        testIndex.setLastVisitedMcqId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, TestIndex.KEY_TEST_LAST_VISITED_MCQ_ID));
        return testIndex;
    }

    private static ContentValues IconCompatParcelizer(TestIndex testIndex) {
        toMagicModuleMetaRepoModel.write(testIndex, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", testIndex.getId()), setAction.write("title", testIndex.getTitle()), setAction.write("intro", testIndex.getIntro()), setAction.write("subject_id", testIndex.getSubjectId()), setAction.write("published_status", testIndex.getPublishedStatus()), setAction.write("test_type", testIndex.getTestType()), setAction.write("duration", Integer.valueOf(testIndex.getDuration())), setAction.write("mcq_count", Integer.valueOf(testIndex.getMcqCount())), setAction.write("status", Integer.valueOf(testIndex.getStatus())), setAction.write("boolean_flags", Integer.valueOf(testIndex.getBooleanFlags())), setAction.write("start_datetime", Long.valueOf(testIndex.getStartTimestamp())), setAction.write("end_datetime", Long.valueOf(testIndex.getEndTimestamp())), setAction.write("last_updated", Long.valueOf(testIndex.getLastUpdated())), setAction.write("test_begin_timestamp", Long.valueOf(testIndex.getUserStartedTimestamp())), setAction.write("submission_timestamp", Long.valueOf(testIndex.getUserSubmissionTimestamp())), setAction.write("correct", Integer.valueOf(testIndex.getCorrect())), setAction.write("wrong", Integer.valueOf(testIndex.getWrong())), setAction.write("skipped", Integer.valueOf(testIndex.getSkipped())), setAction.write("score", Double.valueOf(testIndex.getScore())), setAction.write("possible_score", Integer.valueOf(testIndex.getPossibleScore())), setAction.write(TopUser.KEY_RANK, Integer.valueOf(testIndex.getRank())), setAction.write("is_updated", Integer.valueOf(testIndex.isServerContentUpdated() ? 1 : 0)), setAction.write("is_ranked", Integer.valueOf(testIndex.getIsRanked())), setAction.write("solved", Integer.valueOf(testIndex.getSolvedCount())), setAction.write("percentile", Double.valueOf(testIndex.getPercentile())), setAction.write("total_attempt", Integer.valueOf(testIndex.getTotalAttempt())), setAction.write("do_not_consider", Integer.valueOf(testIndex.isDoNotConsider() ? 1 : 0)), setAction.write("master_order", Integer.valueOf(testIndex.getMasterOrder())), setAction.write(FilterParams.KEY_COURSE_ID, Integer.valueOf(testIndex.getCourseId())), setAction.write(TopUser.KEY_IS_ANONYMOUS, Integer.valueOf(testIndex.isAnonymous() ? 1 : 0)), setAction.write("live_status", Integer.valueOf(testIndex.getAvailabilityType())), setAction.write("state_id", testIndex.getStateId()), setAction.write(TestIndex.KEY_STATE_PERCENTILE, Double.valueOf(testIndex.getStatePercentile())), setAction.write("state_rank", Integer.valueOf(testIndex.getStateRank())), setAction.write(TestIndex.KEY_STATE_TOTAL_ATTEMPT, Integer.valueOf(testIndex.getStateTotalAttempt())), setAction.write(TestIndex.KEY_STATE_TOTAL_SOLVED, Integer.valueOf(testIndex.getStateSolvedCount())), setAction.write(TestIndex.KEY_TEST_PATTERN, Integer.valueOf(testIndex.getTestPattern())), setAction.write(TestIndex.KEY_TEST_MOCK_TEST, Integer.valueOf(testIndex.getIsMockTest() ? 1 : 0)), setAction.write(TestIndex.KEY_TEST_MAX_MCQ_COUNT, Integer.valueOf(testIndex.getMaxMcqCount())), setAction.write(TestIndex.KEY_TEST_LAST_VISITED_MCQ_ID, testIndex.getLastVisitedMcqId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.primaryTrack
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public TestIndex[] read(String str, String[] strArr, String str2) {
        Object obj = super.read(str, strArr, str2);
        if (obj == null) {
            obj = new TestIndex[0];
        }
        TestIndex[] testIndexArr = (TestIndex[]) obj;
        return (TestIndex[]) Arrays.copyOf(testIndexArr, testIndexArr.length);
    }

    private final void AudioAttributesCompatParcelizer(TestIndex[] testIndexArr) {
        for (TestIndex testIndex : testIndexArr) {
            AudioAttributesCompatParcelizer(testIndex);
        }
    }

    private final void write(TestIndex[] testIndexArr) {
        if (testIndexArr == null || testIndexArr.length == 0) {
            return;
        }
        int length = testIndexArr.length;
        Uri uriMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        ContentValues[] contentValuesArr = new ContentValues[length];
        for (int i = 0; i < length; i++) {
            contentValuesArr[i] = IconCompatParcelizer(testIndexArr[i]);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().bulkInsert(uriMediaBrowserCompatItemReceiver, contentValuesArr);
    }

    private final void IconCompatParcelizer(TestIndex[] testIndexArr) {
        if (testIndexArr == null || testIndexArr.length == 0) {
            return;
        }
        if (IconCompatParcelizer("_id", buildRepresentation.AudioAttributesCompatParcelizer(testIndexArr)) == 0) {
            write(testIndexArr);
        } else {
            AudioAttributesCompatParcelizer(testIndexArr);
        }
    }

    @Override // kotlin.DashMediaPeriodTrackGroupInfoTrackGroupCategory
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(TestIndex[] testIndexArr) {
        IconCompatParcelizer(testIndexArr);
    }

    private static TestIndex[] MediaDescriptionCompat() {
        return new TestIndex[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] write(TestIndex testIndex) {
        toMagicModuleMetaRepoModel.write(testIndex, "");
        String id = testIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        return new String[]{id};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final TestIndex a_(String... strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        return (TestIndex) super.a_((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void RemoteActionCompatParcelizer(TestStartResponseBody testStartResponseBody) {
        toMagicModuleMetaRepoModel.write(testStartResponseBody, "");
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("status", Integer.valueOf(testStartResponseBody.status)), setAction.write("test_begin_timestamp", Long.valueOf(testStartResponseBody.startedOn))), MediaBrowserCompatSearchResultReceiver(), new String[]{testStartResponseBody.id});
    }

    public final boolean AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return write("_id =?  AND is_updated =? ", new String[]{str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE}) > 0;
    }

    public final void read(boolean z, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_updated", Integer.valueOf(z ? 1 : 0));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void MediaBrowserCompatItemReceiver(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TestIndex.KEY_TEST_LAST_VISITED_MCQ_ID, str2);
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("modified_end_datetime", Long.valueOf(j));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void RemoteActionCompatParcelizer(boolean z, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TopUser.KEY_IS_ANONYMOUS, Integer.valueOf(z ? 1 : 0));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final StateResult AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String[][] strArrWrite = write(new String[]{"state_id", "state_rank", TestIndex.KEY_STATE_TOTAL_ATTEMPT, TestIndex.KEY_STATE_TOTAL_SOLVED, TestIndex.KEY_STATE_PERCENTILE}, "_id =? ", new String[]{str}, null);
        if (strArrWrite == null) {
            return null;
        }
        StateResult stateResult = new StateResult();
        String str2 = strArrWrite[0][0];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        stateResult.setStateId(str2);
        String str3 = strArrWrite[0][1];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        stateResult.setRank(Integer.parseInt(str3));
        String str4 = strArrWrite[0][2];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        stateResult.setTotalAttempt(Integer.parseInt(str4));
        String str5 = strArrWrite[0][3];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        stateResult.setStateSolved(Integer.parseInt(str5));
        String str6 = strArrWrite[0][4];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        stateResult.setPercentile(Double.parseDouble(str6));
        return stateResult;
    }

    public final void AudioAttributesCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return;
        }
        String str = DashMediaPeriodTrackGroupInfoTrackGroupCategory.read("_id", (String[]) list.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(str, (String[]) null);
    }
}
