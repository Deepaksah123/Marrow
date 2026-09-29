package kotlin;

import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TestStatusResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J \u0010 \u001a\f\u0012\b\u0012\u00060!j\u0002`\"0\u00032\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001a\u0010%\u001a\u00020\u00192\n\u0010&\u001a\u00060'j\u0002`(H¦@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010-J\"\u0010.\u001a\u00060/j\u0002`02\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013H¦@¢\u0006\u0002\u00102J\u001a\u00103\u001a\u00060/j\u0002`02\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001e\u00104\u001a\u0002052\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u001bH¦@¢\u0006\u0002\u00107J\u001e\u00108\u001a\u0002092\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u001bH¦@¢\u0006\u0002\u00107J6\u0010;\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\nJ\u0010\u0010C\u001a\u0004\u0018\u00010DH¦@¢\u0006\u0002\u0010\nJ\u000e\u0010E\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010F\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010G\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\nJ\u001e\u0010H\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\tH¦@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\tH¦@¢\u0006\u0002\u0010NJ$\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\tH¦@¢\u0006\u0002\u0010RJ\u001e\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH¦@¢\u0006\u0002\u0010[J\u001e\u0010\\\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u0013H¦@¢\u0006\u0002\u00102J\u0016\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001e\u0010`\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010a\u001a\u00020\tH¦@¢\u0006\u0002\u0010RJ\u0016\u0010b\u001a\u00020\u00192\u0006\u0010c\u001a\u00020dH¦@¢\u0006\u0002\u0010eJ\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020d0\u00032\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J \u0010g\u001a\u0004\u0018\u00010d2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010h\u001a\u00020\u0013H¦@¢\u0006\u0002\u00102J\u0016\u0010i\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014¨\u0006jÀ\u0006\u0003"}, d2 = {"Lcom/marrow2/domain/test/TestUseCase;", "", "getAllTestInYear", "", "Lcom/marrow2/domain/test/model/TestMiniUCModel;", "year", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOldestTestStartTime", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMonthOfLatestTestFromCombinedTabs", "Ljava/time/YearMonth;", "allTestsList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTest", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveDeviceInfo", "Lcom/marrow/data/models/test/TestStatusResponse;", "Lcom/marrow2/domain/test/model/ActiveDeviceStatusUCModel;", "setAnonymous", "", "isAnonymous", "", "testId", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateActiveDeviceInfo", "Lcom/marrow2/domain/test/ActiveDeviceStatus;", "getMcqAnswers", "Lcom/marrow2/data/mcq/local/model/McqAnswerRepoModel;", "Lcom/marrow2/data/mcq/repo/model/McqAnswerUCModel;", "startTestTimer", "Lcom/marrow2/data/test/repo/TimerUpdateStatus;", "submitMcqTime", "testMcqTimeUCModel", "Lcom/marrow2/data/test/local/model/TestMcqTimeRepoModel;", "Lcom/marrow2/domain/test/model/TestMcqTimeUCModel;", "(Lcom/marrow2/data/test/local/model/TestMcqTimeRepoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTestTooltipShown", "setTestTooltipShown", "isShown", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStateRankAndTopUsers", "Lcom/marrow2/data/topuser/model/TestTopScoreRepoModel;", "Lcom/marrow2/data/topuser/model/ResultUCModel;", "stateId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllIndiaTopUsers", "getUpdatedTestForScore", "Lcom/marrow2/domain/test/model/TestScoreUCModel;", "forceDownloadScoreData", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestAnalyticsWithSubjectNames", "Lcom/marrow2/domain/test/model/TestAnalyticsUCModel;", "shouldSortByOrder", "submitTest", "Lcom/marrow2/domain/test/model/SubmitTestUCModel;", "isDiscarded", "forceSubmit", "testType", "isCustomModule", "(Ljava/lang/String;ZZIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTestNotificationVisible", "getNudgeContentInfo", "Lcom/marrow2/domain/test/model/GTNudgeContentUCModel;", "setGTNudgeShown", "getAndStoreGtNudgeInformation", "getTestCompletionCount", "getTestStatus", "startTimestamp", "endTimestamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestAcademicYear", "startTime", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestGroups", "Lcom/marrow2/domain/test/model/TestGroupUCModel;", "testStartTimeMs", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestSubmissionStatus", "Lcom/marrow2/ui/test/analytics/TestAnalytics$SubmissionStatus;", "testRank", "testStatus", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestTypeFromInitials", "testInitials", "Lcom/marrow2/ui/home/model/HomeTestInitials;", "(Lcom/marrow2/ui/home/model/HomeTestInitials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTestLastVisitedMcqId", "lastVisitedMcqId", "recordTestSectionSkipped", "testGroupId", "updateTestModifiedEndTimestamp", "endTimeStamp", "setMcqTimerDetails", "mcqTimerAnalyticsUcModel", "Lcom/marrow2/domain/test/model/McqTimerAnalyticsUcModel;", "(Lcom/marrow2/domain/test/model/McqTimerAnalyticsUcModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMcqTimerDetails", "getMcqTimerDetail", "mcqId", "deleteMcqTimerDetails", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface crc32 {
    Object AudioAttributesCompatParcelizer(String str, long j, SampleVideos<? super List<getCodecsOfType>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super List<dropTable>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, boolean z, SampleVideos<? super getCodecCountOfType> sampleVideos);

    Object AudioAttributesCompatParcelizer(List<getBigEndianInt> list);

    Object AudioAttributesCompatParcelizer(FlagSet flagSet, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object AudioAttributesCompatParcelizer(formatInvariant formatinvariant, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super getCStringLength> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super TestStatusResponse> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object MediaBrowserCompatItemReceiver(String str, SampleVideos<? super castNonNullTypeArray> sampleVideos);

    Object MediaBrowserCompatItemReceiver(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(int i, int i2);

    Object RemoteActionCompatParcelizer(long j, SampleVideos<? super String> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, SampleVideos<? super checkGlError> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super checkGlError> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super Long> sampleVideos);

    Object RemoteActionCompatParcelizer(getContextAttributionTag getcontextattributiontag);

    Object read(int i, SampleVideos<? super List<getBigEndianInt>> sampleVideos);

    Object read(long j, long j2);

    Object read(String str, long j, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, String str2, SampleVideos<? super formatInvariant> sampleVideos);

    Object read(String str, SampleVideos<? super TestIndex> sampleVideos);

    Object read(String str, boolean z, SampleVideos<? super getCurrentOrMainLooper> sampleVideos);

    Object read(String str, boolean z, boolean z2, boolean z3, SampleVideos<? super getAudioContentTypeForStreamType> sampleVideos);

    Object read(SampleVideos<? super Integer> sampleVideos);

    Object write(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(SampleVideos<? super durationUsToSampleCount> sampleVideos);

    Object write(boolean z, String str, SampleVideos<? super getShowPopup> sampleVideos);
}
