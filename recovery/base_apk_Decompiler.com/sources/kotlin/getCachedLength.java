package kotlin;

import com.marrow.data.models.lesson.LessonIndex;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getCachedLength {
    public static final getContentMetadata AudioAttributesCompatParcelizer(LessonIndex lessonIndex) {
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        String id = lessonIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = lessonIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        int mCQCount = lessonIndex.getMCQCount();
        int status = lessonIndex.getStatus();
        long completionTimeMs = lessonIndex.getCompletionTimeMs();
        String subjectId = lessonIndex.getSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
        String rootSubjectId = lessonIndex.getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        boolean zIsComingSoon = lessonIndex.isComingSoon();
        long lastAttemptedTimeMs = lessonIndex.getLastAttemptedTimeMs();
        float percentile = lessonIndex.getPercentile();
        boolean zIsPaid = lessonIndex.isPaid();
        boolean zIsDontConsider = lessonIndex.isDontConsider();
        long lastUpdated = lessonIndex.getLastUpdated();
        boolean zHasVideo = lessonIndex.hasVideo();
        int myRating = lessonIndex.getMyRating();
        String imageUrl = lessonIndex.getImageUrl();
        String str = imageUrl == null ? "" : imageUrl;
        int possibleScore = lessonIndex.getPossibleScore();
        int score = lessonIndex.getScore();
        int pytMcqCount = lessonIndex.getPytMcqCount();
        String lessonReadTimeText = lessonIndex.getLessonReadTimeText();
        String str2 = lessonReadTimeText == null ? "" : lessonReadTimeText;
        int courseId = lessonIndex.getCourseId();
        int status2 = lessonIndex.getStatus();
        int totalPeopleRated = lessonIndex.getTotalPeopleRated();
        int ratingCount = lessonIndex.getRatingCount();
        int booleanFlags = lessonIndex.getBooleanFlags();
        String[] parentIds = lessonIndex.getParentIds();
        if (parentIds == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(parentIds)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new getContentMetadata(id, title, mCQCount, status, completionTimeMs, subjectId, zIsComingSoon, rootSubjectId, lastAttemptedTimeMs, percentile, zIsPaid, zIsDontConsider, lastUpdated, zHasVideo, myRating, str, possibleScore, score, totalPeopleRated, ratingCount, pytMcqCount, str2, courseId, booleanFlags, listRemoteActionCompatParcelizer, status2, lessonIndex.getEditionValue(), lessonIndex.getAverageRating(), lessonIndex.getLessonNumber(), lessonIndex.getActiveRecallQbankId());
    }
}
