package kotlin;

import com.marrow.data.models.lesson.AssociatedLessonIndex;
import com.marrow.data.models.lesson.LessonIndex;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getCachedSpans {
    public static final startFile read(LessonIndex lessonIndex) {
        List listRemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer2;
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        String id = lessonIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = lessonIndex.getTitle();
        String str = title == null ? "" : title;
        String subTitle = lessonIndex.getSubTitle();
        String str2 = subTitle == null ? "" : subTitle;
        String imageUrl = lessonIndex.getImageUrl();
        String str3 = imageUrl == null ? "" : imageUrl;
        String publishedStatus = lessonIndex.getPublishedStatus();
        String str4 = publishedStatus == null ? "" : publishedStatus;
        String subjectId = lessonIndex.getSubjectId();
        String str5 = subjectId == null ? "" : subjectId;
        String intro = lessonIndex.getIntro();
        String str6 = intro == null ? "" : intro;
        String lessonReadTimeText = lessonIndex.getLessonReadTimeText();
        String str7 = lessonReadTimeText == null ? "" : lessonReadTimeText;
        long lastUpdated = lessonIndex.getLastUpdated();
        long publishedTime = lessonIndex.getPublishedTime();
        int status = lessonIndex.getStatus();
        int myRating = lessonIndex.getMyRating();
        boolean zIsPaid = lessonIndex.isPaid();
        int totalPeopleRated = lessonIndex.getTotalPeopleRated();
        int ratingCount = lessonIndex.getRatingCount();
        int peopleSolved = lessonIndex.getPeopleSolved();
        int lessonNumber = lessonIndex.getLessonNumber();
        int possibleScore = lessonIndex.getPossibleScore();
        int score = lessonIndex.getScore();
        int masterOrder = lessonIndex.getMasterOrder();
        int mCQCount = lessonIndex.getMCQCount();
        boolean zIsIsServerContentUpdated = lessonIndex.isIsServerContentUpdated();
        boolean zIsOptional = lessonIndex.isOptional();
        String rootSubjectId = lessonIndex.getRootSubjectId();
        String str8 = rootSubjectId == null ? "" : rootSubjectId;
        int courseId = lessonIndex.getCourseId();
        String videoId = lessonIndex.getVideoId();
        String str9 = videoId == null ? "" : videoId;
        int booleanFlags = lessonIndex.getBooleanFlags();
        String[] parentIds = lessonIndex.getParentIds();
        if (parentIds == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(parentIds)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        float percentile = lessonIndex.getPercentile();
        long completionTimeMs = lessonIndex.getCompletionTimeMs();
        int editionValue = lessonIndex.getEditionValue();
        String[] highYieldIds = lessonIndex.getHighYieldIds();
        if (highYieldIds == null || (listRemoteActionCompatParcelizer2 = getOrderDetails.onCommand(highYieldIds)) == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list2 = listRemoteActionCompatParcelizer2;
        List<AssociatedLessonIndex> associatedLessons = lessonIndex.getAssociatedLessons();
        return new startFile(id, str, str2, str3, str4, str5, str6, str7, lastUpdated, publishedTime, status, myRating, zIsPaid, totalPeopleRated, ratingCount, peopleSolved, lessonNumber, possibleScore, score, masterOrder, mCQCount, zIsIsServerContentUpdated, zIsOptional, str8, courseId, str9, booleanFlags, list, false, percentile, completionTimeMs, editionValue, list2, associatedLessons != null ? getKeys.IconCompatParcelizer(associatedLessons) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), lessonIndex.getLastAttemptedTimeMs(), lessonIndex.getLessonActivityStatus(), 268435456, 0, null);
    }
}
