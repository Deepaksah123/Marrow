package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TestMini;
import com.marrow.data.models.test.TopUser;
import in.juspay.hyper.constants.LogCategory;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0011\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001aH\u0014¢\u0006\u0002\u0010\u001bJ\b\u0010 \u001a\u00020\fH\u0016J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0017J\u0016\u0010$\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010%\u001a\u00020\u001aJ\u0006\u0010&\u001a\u00020\f¨\u0006("}, d2 = {"Lcom/marrow/data/db/tables/test/TestMiniTable;", "Lcom/marrow/data/db/tables/BaseCourseTable;", "Lcom/marrow/data/models/test/TestMini;", "Lcom/marrow/data/db/tables/test/ITestTableInfo;", LogCategory.CONTEXT, "Landroid/content/Context;", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "<init>", "(Landroid/content/Context;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "queryTestListCustom", "", "()[Lcom/marrow/data/models/test/TestMini;", "getTestList", "", "startTimestampMs", "", "endTimestampMs", "yearFilter", "", "(I)[Lcom/marrow/data/models/test/TestMini;", "Landroid/content/ContentValues;", "test", "newArray", "size", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/test/TestMini;)[Ljava/lang/String;", "getOldestTestStartTime", "getTakenGrandTestCount", "getTotalTakenGrandTestCount", "getLastUnsolvedGrandTestId", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashWrappingSegmentIndex extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<TestMini> {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private static final String[] read = {"_id", "title", "subject_id", "test_type", "duration", "mcq_count", "boolean_flags", "start_datetime", "end_datetime", "modified_end_datetime", "status", TopUser.KEY_RANK, "live_status", "test_begin_timestamp", "submission_timestamp", TestIndex.KEY_TEST_PATTERN, TestIndex.KEY_TEST_MOCK_TEST, TestIndex.KEY_TEST_MAX_MCQ_COUNT};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashWrappingSegmentIndex(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "_test", getstreampositionusforcontent);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return AudioAttributesCompatParcelizer((TestMini) obj);
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
        return RemoteActionCompatParcelizer((TestMini) obj);
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        throw new UnsupportedOperationException("TestMiniTable is shortcut table. Creation should be done through TestIndexTable");
    }

    private static TestMini read(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        TestMini testMini = new TestMini();
        testMini.setId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id"));
        testMini.setTitle(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "title"));
        testMini.setSubjectId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "subject_id"));
        testMini.setTestType(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "test_type"));
        testMini.setDuration(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "duration"));
        testMini.setMcqCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_count"));
        testMini.setBooleanFlags(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "boolean_flags"));
        testMini.setStartTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "start_datetime"));
        testMini.setEndTimestamp(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "end_datetime"));
        testMini.setModifiedEndTimestampMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "modified_end_datetime"));
        testMini.setStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "status"));
        testMini.setRank(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TopUser.KEY_RANK));
        testMini.setAvailabilityType(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "live_status"));
        testMini.setUserStartedTimestampMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "test_begin_timestamp"));
        testMini.setUserSubmittedTimestampMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "submission_timestamp"));
        testMini.setTestPattern(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_TEST_PATTERN));
        testMini.setMockTest(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, TestIndex.KEY_TEST_MOCK_TEST));
        testMini.setMaxMcqCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, TestIndex.KEY_TEST_MAX_MCQ_COUNT));
        return testMini;
    }

    public final List<TestMini> RemoteActionCompatParcelizer(long j, long j2) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s, %s", Arrays.copyOf(new Object[]{"start_datetime", "master_order"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), read, "start_datetime>=? AND start_datetime<?", strArr, str);
        try {
            List<TestMini> listIconCompatParcelizer = copyAdaptationSets.IconCompatParcelizer(cursorQuery, new getAnswerMap() { // from class: o.getAvailableLiveDurationUs
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    DashWrappingSegmentIndex dashWrappingSegmentIndex = this.AudioAttributesCompatParcelizer;
                    return DashWrappingSegmentIndex.AudioAttributesCompatParcelizer((Cursor) obj);
                }
            });
            MagicModuleMetaLSModel.IconCompatParcelizer(cursorQuery, null);
            return listIconCompatParcelizer;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TestMini AudioAttributesCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        TestMini testMini = read(cursor);
        testMini.setTestStatus(buildRepresentation.write(testMini));
        return testMini;
    }

    private static ContentValues RemoteActionCompatParcelizer(TestMini testMini) {
        toMagicModuleMetaRepoModel.write(testMini, "");
        throw new UnsupportedOperationException("TestMiniTable is shortcut table. Creation should be done through TestIndexTable");
    }

    private static TestMini[] MediaDescriptionCompat() {
        return new TestMini[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(TestMini testMini) {
        toMagicModuleMetaRepoModel.write(testMini, "");
        return new String[]{String.valueOf(testMini.getId())};
    }

    public final long AudioAttributesCompatParcelizer() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("min(%s)", Arrays.copyOf(new Object[]{"start_datetime"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("select %s from %s", Arrays.copyOf(new Object[]{str, "_test"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0L;
        }
        try {
            cursorRemoteActionCompatParcelizer.moveToFirst();
            return copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, str);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/DashWrappingSegmentIndex$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "", "read", "[Ljava/lang/String;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
