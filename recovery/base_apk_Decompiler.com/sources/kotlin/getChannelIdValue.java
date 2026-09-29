package kotlin;

import com.marrow.data.models.ResponseError;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;

/* JADX INFO: loaded from: classes4.dex */
public final class getChannelIdValue {
    public static final SealedLessonDetailsModel.Lesson RemoteActionCompatParcelizer(PriorityTaskManager priorityTaskManager, int i) {
        toMagicModuleMetaRepoModel.write(priorityTaskManager, "");
        String audioAttributesCompatParcelizer = priorityTaskManager.getAudioAttributesCompatParcelizer();
        String read = priorityTaskManager.getRead();
        int audioAttributesImplApi26Parcelizer = priorityTaskManager.getAudioAttributesImplApi26Parcelizer();
        boolean mediaBrowserCompatCustomActionResultReceiver = priorityTaskManager.getMediaBrowserCompatCustomActionResultReceiver();
        boolean mediaBrowserCompatMediaItem = priorityTaskManager.getMediaBrowserCompatMediaItem();
        String iconCompatParcelizer = priorityTaskManager.getIconCompatParcelizer();
        return new SealedLessonDetailsModel.Lesson(audioAttributesCompatParcelizer, read, priorityTaskManager.getMediaDescriptionCompat(), 2, 0, audioAttributesImplApi26Parcelizer, !mediaBrowserCompatCustomActionResultReceiver, 0, 0, mediaBrowserCompatMediaItem, priorityTaskManager.getMediaBrowserCompatCustomActionResultReceiver(), iconCompatParcelizer, priorityTaskManager.getOnPause(), priorityTaskManager.getOnMediaButtonEvent(), priorityTaskManager.getWrite(), priorityTaskManager.getRemoteActionCompatParcelizer(), priorityTaskManager.getMediaMetadataCompat(), priorityTaskManager.getHandleMediaPlayPauseIfPendingOnHandler(), priorityTaskManager.getOnCommand(), priorityTaskManager.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), !priorityTaskManager.getOnPlayFromMediaId(), i, ResponseError.NO_INTERNET_ERROR, null);
    }

    public static final SealedLessonDetailsModel.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(PriorityTaskManager priorityTaskManager, int i, String str) {
        toMagicModuleMetaRepoModel.write(priorityTaskManager, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new SealedLessonDetailsModel.AudioAttributesCompatParcelizer(priorityTaskManager.getRead(), str, i);
    }
}
