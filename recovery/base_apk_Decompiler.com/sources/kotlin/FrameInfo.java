package kotlin;

import com.marrow.data.models.test.RankPair;
import com.marrow.data.models.test.TestAnalytics;
import com.marrow.data.models.test.TestStat;
import com.marrow.data.models.test.TestSubjectStat;
import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.data.test.remote.model.TestStatModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameInfo {
    public static final TestAnalytics AudioAttributesCompatParcelizer(inferFileTypeFromMimeType inferfiletypefrommimetype) {
        toMagicModuleMetaRepoModel.write(inferfiletypefrommimetype, "");
        TestAnalytics testAnalytics = new TestAnalytics();
        testAnalytics.testId = inferfiletypefrommimetype.getAudioAttributesCompatParcelizer();
        testAnalytics.changeCorrect = inferfiletypefrommimetype.getRemoteActionCompatParcelizer();
        testAnalytics.changeWrong = inferfiletypefrommimetype.getIconCompatParcelizer();
        testAnalytics.changeTotal = inferfiletypefrommimetype.getRead();
        testAnalytics.guessedStat = IconCompatParcelizer(inferfiletypefrommimetype.getWrite());
        testAnalytics.neetRanks = IconCompatParcelizer(inferfiletypefrommimetype.MediaBrowserCompatCustomActionResultReceiver());
        testAnalytics.firstAttemptTimeSeconds = inferfiletypefrommimetype.getAudioAttributesImplApi21Parcelizer();
        testAnalytics.reviewAttemptTimeSeconds = inferfiletypefrommimetype.getMediaBrowserCompatCustomActionResultReceiver();
        testAnalytics.averageTimeSeconds = inferfiletypefrommimetype.getAudioAttributesImplBaseParcelizer();
        testAnalytics.myStat = AudioAttributesCompatParcelizer(inferfiletypefrommimetype.AudioAttributesImplApi26Parcelizer());
        testAnalytics.topUserStat = AudioAttributesCompatParcelizer(inferfiletypefrommimetype.RatingCompat());
        return testAnalytics;
    }

    private static RankPair[] IconCompatParcelizer(List<RankPairModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        List<RankPairModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (RankPairModel rankPairModel : list2) {
            RankPair rankPair = new RankPair();
            rankPair.scoreRange = rankPairModel.getScoreRange();
            rankPair.rankRange = rankPairModel.getRankRange();
            arrayList2.add(Boolean.valueOf(arrayList.add(rankPair)));
        }
        return (RankPair[]) arrayList.toArray(new RankPair[0]);
    }

    private static TestStat IconCompatParcelizer(TestStatModel testStatModel) {
        if (testStatModel == null) {
            return null;
        }
        TestStat testStat = new TestStat();
        testStat.score = testStatModel.getScore();
        testStat.correct = testStatModel.getCorrect();
        testStat.wrong = testStatModel.getWrong();
        testStat.total = testStatModel.getTotal();
        testStat.possibleScore = testStatModel.getPossibleScore();
        return testStat;
    }

    private static TestSubjectStat[] AudioAttributesCompatParcelizer(List<TestSubjectStatModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        List<TestSubjectStatModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (TestSubjectStatModel testSubjectStatModel : list2) {
            TestSubjectStat testSubjectStat = new TestSubjectStat();
            testSubjectStat.subjectId = testSubjectStatModel.getSubjectId();
            testSubjectStat.score = testSubjectStatModel.getScore();
            testSubjectStat.possibleScore = testSubjectStatModel.getPossibleScore();
            testSubjectStat.correct = testSubjectStatModel.getCorrect();
            testSubjectStat.wrong = testSubjectStatModel.getWrong();
            testSubjectStat.percentile = testSubjectStatModel.getPercentile();
            testSubjectStat.total = testSubjectStatModel.getTotal();
            arrayList2.add(Boolean.valueOf(arrayList.add(testSubjectStat)));
        }
        return (TestSubjectStat[]) arrayList.toArray(new TestSubjectStat[0]);
    }
}
