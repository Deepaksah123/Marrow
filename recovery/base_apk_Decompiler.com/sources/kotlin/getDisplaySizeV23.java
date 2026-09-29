package kotlin;

import com.marrow.data.models.test.TestIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class getDisplaySizeV23 {
    public static final getCurrentOrMainLooper write(TestIndex testIndex) {
        toMagicModuleMetaRepoModel.write(testIndex, "");
        String id = testIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String stateId = testIndex.getStateId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stateId, "");
        int possibleScore = testIndex.getPossibleScore();
        double statePercentile = testIndex.getStatePercentile();
        double percentile = testIndex.getPercentile();
        boolean zIsReviewAvailable = testIndex.isReviewAvailable();
        boolean zIsTestDiscarded = testIndex.isTestDiscarded();
        boolean zIsRankPredicted = testIndex.isRankPredicted();
        boolean zIsAnonymous = testIndex.isAnonymous();
        int rank = testIndex.getRank();
        int stateRank = testIndex.getStateRank();
        int correct = testIndex.getCorrect();
        int wrong = testIndex.getWrong();
        int skipped = testIndex.getSkipped();
        int totalAttempt = testIndex.getTotalAttempt();
        int solvedCount = testIndex.getSolvedCount();
        double score = testIndex.getScore();
        long endTimestamp = testIndex.getEndTimestamp();
        long userStartedTimestamp = testIndex.getUserStartedTimestamp();
        String title = testIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        boolean zIsPaid = testIndex.isPaid();
        int isRanked = testIndex.getIsRanked();
        long userSubmissionTimestamp = testIndex.getUserSubmissionTimestamp();
        int duration = testIndex.getDuration();
        String testType = testIndex.getTestType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
        String title2 = testIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title2, "");
        return new getCurrentOrMainLooper(id, stateId, possibleScore, statePercentile, percentile, zIsReviewAvailable, zIsTestDiscarded, zIsRankPredicted, zIsAnonymous, rank, stateRank, correct, wrong, skipped, totalAttempt, solvedCount, score, endTimestamp, userStartedTimestamp, title, zIsPaid, isRanked, userSubmissionTimestamp, duration, testType, title2, testIndex.getTestPattern());
    }
}
