package kotlin;

import com.marrow.data.models.mcq.BookReference;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.mcq.McqPearlInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.isHoleSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class throwIfCanceled {
    public static final McqIndex RemoteActionCompatParcelizer(isHoleSpan isholespan) {
        toMagicModuleMetaRepoModel.write(isholespan, "");
        McqIndex mcqIndex = new McqIndex();
        mcqIndex.setMcqId(isholespan.getOnPause());
        mcqIndex.setBookmarkId(isholespan.getRead());
        mcqIndex.setOption1AnsweredCount(isholespan.getOnMediaButtonEvent());
        mcqIndex.setOption2AnsweredCount(isholespan.getOnPrepareFromSearch());
        mcqIndex.setOption3AnsweredCount(isholespan.getOnPrepareFromMediaId());
        mcqIndex.setOption4AnsweredCount(isholespan.getOnPlayFromUri());
        mcqIndex.setOption5AnsweredCount(isholespan.getOnPlayFromSearch());
        mcqIndex.setOption6AnsweredCount(isholespan.getOnPrepare());
        mcqIndex.setOption7AnsweredCount(isholespan.getOnRewind());
        mcqIndex.setOption8AnsweredCount(isholespan.getOnRemoveQueueItemAt());
        mcqIndex.setAnswerPointer(isholespan.getWrite());
        mcqIndex.setSubjectId(isholespan.getOnSetCaptioningEnabled());
        mcqIndex.setImageUrl(isholespan.getMediaBrowserCompatMediaItem());
        mcqIndex.setImageUrlV2(isholespan.getMediaDescriptionCompat());
        mcqIndex.setMcqType(isholespan.getOnFastForward());
        List<isHoleSpan.IconCompatParcelizer> list = isholespan.read();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (isHoleSpan.IconCompatParcelizer iconCompatParcelizer : list) {
            BookReference bookReference = new BookReference();
            bookReference.setId(iconCompatParcelizer.RemoteActionCompatParcelizer());
            bookReference.setText(iconCompatParcelizer.read());
            bookReference.setImageUrl(iconCompatParcelizer.IconCompatParcelizer());
            bookReference.setTitle(iconCompatParcelizer.AudioAttributesCompatParcelizer());
            arrayList.add(bookReference);
        }
        mcqIndex.setReferences((BookReference[]) arrayList.toArray(new BookReference[0]));
        mcqIndex.setMagicLine(isholespan.getOnCustomAction());
        mcqIndex.setBookmarkLastUpdated(isholespan.getMediaBrowserCompatItemReceiver());
        mcqIndex.setStarred(isholespan.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        mcqIndex.setThumbnailHeight(isholespan.getOnSetPlaybackSpeed());
        mcqIndex.setThumbnailWidth(isholespan.getOnSetShuffleMode());
        mcqIndex.initEncryptedContent(mcqIndex.getMcqId(), isholespan.getOnPlayFromMediaId());
        mcqIndex.setPearlIds(McqPearlInfo.newArray(isholespan.getOnPause(), (String[]) isholespan.onRemoveQueueItem().toArray(new String[0])));
        mcqIndex.setRootSubjectId(isholespan.getOnRemoveQueueItem());
        mcqIndex.setDontConsider(isholespan.getOnCommand());
        mcqIndex.setImageCitationLink(isholespan.getMediaMetadataCompat());
        mcqIndex.setImageCitationAuthor(isholespan.getMediaBrowserCompatSearchResultReceiver());
        mcqIndex.setImageCitationLicense(isholespan.getRatingCompat());
        mcqIndex.mcqUpdateStatus = isholespan.getOnPlay();
        mcqIndex.setStatusUpdateEndTimeMs(isholespan.getOnSeekTo());
        mcqIndex.setStatusUpdateStartTimeMs(isholespan.getOnSetRating());
        mcqIndex.setFeedbackStatus(isholespan.getAudioAttributesImplApi26Parcelizer());
        mcqIndex.setTags((String[]) isholespan.onSetPlaybackSpeed().toArray(new String[0]));
        mcqIndex.setDisplayId(isholespan.getAudioAttributesImplApi21Parcelizer());
        mcqIndex.setActiveLessonPaid(isholespan.getOnAddQueueItem());
        String audioAttributesCompatParcelizer = isholespan.getAudioAttributesCompatParcelizer();
        mcqIndex.setActiveLessonId(audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer : "");
        mcqIndex.setLocked(isholespan.getHandleMediaPlayPauseIfPendingOnHandler());
        mcqIndex.setBookmarkType(isholespan.getMediaBrowserCompatCustomActionResultReceiver());
        mcqIndex.setCourseId(isholespan.getAudioAttributesImplBaseParcelizer());
        return mcqIndex;
    }

    public static final isHoleSpan write(McqIndex mcqIndex) {
        List listRemoteActionCompatParcelizer;
        String str = "";
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        String mcqId = mcqIndex.getMcqId();
        String bookmarkId = mcqIndex.getBookmarkId();
        int option1AnsweredCount = mcqIndex.getOption1AnsweredCount();
        int option2AnsweredCount = mcqIndex.getOption2AnsweredCount();
        int option3AnsweredCount = mcqIndex.getOption3AnsweredCount();
        int option4AnsweredCount = mcqIndex.getOption4AnsweredCount();
        int option5AnsweredCount = mcqIndex.getOption5AnsweredCount();
        int option6AnsweredCount = mcqIndex.getOption6AnsweredCount();
        int option7AnsweredCount = mcqIndex.getOption7AnsweredCount();
        int option8AnsweredCount = mcqIndex.getOption8AnsweredCount();
        String answerPointer = mcqIndex.getAnswerPointer();
        String subjectId = mcqIndex.getSubjectId();
        String imageUrl = mcqIndex.getImageUrl();
        String str2 = imageUrl == null ? "" : imageUrl;
        String imageUrlV2 = mcqIndex.getImageUrlV2();
        String str3 = imageUrlV2 == null ? "" : imageUrlV2;
        int mcqType = mcqIndex.getMcqType();
        List listOnCommand = getOrderDetails.onCommand(mcqIndex.getReferences());
        String str4 = str2;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        Iterator it = listOnCommand.iterator();
        while (it.hasNext()) {
            BookReference bookReference = (BookReference) it.next();
            Iterator it2 = it;
            String id = bookReference.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, str);
            String str5 = answerPointer;
            String text = bookReference.getText();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, str);
            int i = option8AnsweredCount;
            String title = bookReference.getTitle();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, str);
            String imageUrl2 = bookReference.getImageUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl2, str);
            arrayList.add(new isHoleSpan.IconCompatParcelizer(id, text, title, imageUrl2));
            it = it2;
            answerPointer = str5;
            option8AnsweredCount = i;
            str = str;
        }
        String str6 = str;
        int i2 = option8AnsweredCount;
        String str7 = answerPointer;
        ArrayList arrayList2 = arrayList;
        String magicLine = mcqIndex.getMagicLine();
        String str8 = magicLine == null ? str6 : magicLine;
        long bookmarkLastUpdated = mcqIndex.getBookmarkLastUpdated();
        boolean zIsStarred = mcqIndex.isStarred();
        int thumbnailHeight = mcqIndex.getThumbnailHeight();
        int thumbnailWidth = mcqIndex.getThumbnailWidth();
        String encryptedContent = mcqIndex.getEncryptedContent();
        List<String> pearlIds = mcqIndex.getPearlIds();
        String rootSubjectId = mcqIndex.getRootSubjectId();
        boolean isDontConsider = mcqIndex.getIsDontConsider();
        String imageCitationLink = mcqIndex.getImageCitationLink();
        String imageCitationAuthor = mcqIndex.getImageCitationAuthor();
        String imageCitationLicense = mcqIndex.getImageCitationLicense();
        int i3 = mcqIndex.mcqUpdateStatus;
        long statusUpdateEndTimeMs = mcqIndex.getStatusUpdateEndTimeMs();
        long statusUpdateStartTimeMs = mcqIndex.getStatusUpdateStartTimeMs();
        int feedbackStatus = mcqIndex.getFeedbackStatus();
        String[] tags = mcqIndex.getTags();
        if (tags == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(tags)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        String displayId = mcqIndex.getDisplayId();
        boolean isActiveLessonPaid = mcqIndex.getIsActiveLessonPaid();
        String activeLessonId = mcqIndex.getActiveLessonId();
        return new isHoleSpan(mcqId, bookmarkId, option1AnsweredCount, option2AnsweredCount, option3AnsweredCount, option4AnsweredCount, option5AnsweredCount, option6AnsweredCount, option7AnsweredCount, i2, str7, subjectId, str4, str3, mcqType, arrayList2, str8, bookmarkLastUpdated, zIsStarred, thumbnailWidth, thumbnailHeight, encryptedContent, pearlIds, rootSubjectId, isDontConsider, imageCitationLink, imageCitationAuthor, imageCitationLicense, i3, statusUpdateStartTimeMs, statusUpdateEndTimeMs, feedbackStatus, list, displayId, isActiveLessonPaid, activeLessonId == null ? str6 : activeLessonId, mcqIndex.getIsLocked(), mcqIndex.getBookmarkType(), mcqIndex.getCourseId());
    }
}
