package kotlin;

import com.marrow.data.api.models.response.lesson.LessonDynamicResponseBody;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.models.lesson.RevisionSubjectStatusModel;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import com.marrow2.data.lesson.remote.model.QBankStatsResponse;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface closeCurrentOutputStream {
    Object AudioAttributesCompatParcelizer(String str, int i, SampleVideos<? super List<CacheListener>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(List<String> list, int i, SampleVideos<? super List<? extends LessonDynamicResponseBody>> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super getContentMetadata> sampleVideos);

    Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super List<startLoadingManifest>> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super getContentMetadata> sampleVideos);

    Object IconCompatParcelizer(int i, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object IconCompatParcelizer(int i, boolean z, boolean z2);

    Object IconCompatParcelizer(String str, int i, int i2, SampleVideos<? super QBankStatsResponse> sampleVideos);

    Object IconCompatParcelizer(String str, int i, SampleVideos<? super List<CustomModuleTopicListModel>> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, SampleVideos<? super CacheDataSinkFactory> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super LessonResponseBody> sampleVideos);

    Object IconCompatParcelizer(List<String> list, List<Integer> list2, SampleVideos<? super Integer> sampleVideos);

    Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super List<String>> sampleVideos);

    Object MediaBrowserCompatItemReceiver(String str, SampleVideos<? super isReadingFromUpstream> sampleVideos);

    Object MediaBrowserCompatMediaItem(String str, SampleVideos<? super ColorParser> sampleVideos);

    Object MediaBrowserCompatSearchResultReceiver(String str, SampleVideos<? super Integer> sampleVideos);

    Object MediaDescriptionCompat(String str, SampleVideos<? super ColorParser> sampleVideos);

    Object MediaMetadataCompat(String str, SampleVideos<? super List<String>> sampleVideos);

    Object RatingCompat(String str, SampleVideos<? super getContentMetadata> sampleVideos);

    Object RemoteActionCompatParcelizer(int i, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object RemoteActionCompatParcelizer(StepResponseBody stepResponseBody, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, SampleVideos<? super RevisionSubjectStatusModel> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super Map<String, ? extends ArrayList<startFile>>> sampleVideos);

    Object RemoteActionCompatParcelizer(List<Integer> list, SampleVideos<? super Integer> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object handleMediaPlayPauseIfPendingOnHandler(String str, SampleVideos<? super isCached> sampleVideos);

    Object onAddQueueItem(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object onCommand(String str, SampleVideos<? super HashMap<String, int[]>> sampleVideos);

    Object onCustomAction(String str, SampleVideos<? super Boolean> sampleVideos);

    Object read(LessonResponseBody lessonResponseBody, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, String str2, closeCurrentSource closecurrentsource, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(String str, SampleVideos<? super Float> sampleVideos);

    Object read(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(SampleVideos<? super Map<String, ? extends VideoCacheInfo>> sampleVideos);

    Object write(int i, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object write(int i, SampleVideos<? super handleBeforeThrow> sampleVideos);

    Object write(long j, long j2, SampleVideos<? super Integer> sampleVideos);

    Object write(String str, int i, SampleVideos<? super Integer> sampleVideos);

    Object write(String str, int i, boolean z, int i2, int i3, SampleVideos<? super Integer> sampleVideos);

    Object write(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super List<isCached>> sampleVideos);

    Object write(SampleVideos<? super Integer> sampleVideos);
}
