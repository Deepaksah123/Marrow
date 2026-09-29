package kotlin;

import com.marrow2.data.test.remote.model.TestAnalyticsRSModel;

/* JADX INFO: loaded from: classes3.dex */
public final class getFboId {
    public static final GlProgramUniform write(TestAnalyticsRSModel testAnalyticsRSModel) {
        toMagicModuleMetaRepoModel.write(testAnalyticsRSModel, "");
        return new GlProgramUniform(testAnalyticsRSModel.getTestId(), testAnalyticsRSModel.getChangeCorrect(), testAnalyticsRSModel.getChangeWrong(), testAnalyticsRSModel.getChangeTotal(), IntermediateLoginResponseBody.onPlay(testAnalyticsRSModel.getNeetRanks()), testAnalyticsRSModel.getFirstAttemptTimeSeconds(), testAnalyticsRSModel.getReviewAttemptTimeSeconds(), testAnalyticsRSModel.getAverageTimeSeconds(), testAnalyticsRSModel.getMyStat(), testAnalyticsRSModel.getTopUserStat(), testAnalyticsRSModel.getGuessedStat());
    }
}
