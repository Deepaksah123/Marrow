package kotlin;

import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.models.lesson.RevisionSubjectStatusModel;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface getLastOpenedUri {
    Object AudioAttributesCompatParcelizer();

    Object AudioAttributesCompatParcelizer(String str);

    Object AudioAttributesCompatParcelizer(String str, int i);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, boolean z);

    Object AudioAttributesCompatParcelizer(CopyOnWriteMultiset copyOnWriteMultiset);

    Object AudioAttributesImplApi21Parcelizer(String str);

    Object AudioAttributesImplApi26Parcelizer(String str);

    Object AudioAttributesImplBaseParcelizer(String str);

    Object AudioAttributesImplBaseParcelizer(String str, int i);

    Object IconCompatParcelizer();

    Object IconCompatParcelizer(String str);

    Object IconCompatParcelizer(String str, int i);

    Object IconCompatParcelizer(String str, SampleVideos<? super Map<String, ? extends ArrayList<startFile>>> sampleVideos);

    Object MediaBrowserCompatCustomActionResultReceiver(String str);

    Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super Integer> sampleVideos);

    Object MediaBrowserCompatItemReceiver(String str);

    Object MediaBrowserCompatMediaItem(String str);

    Object RemoteActionCompatParcelizer(int i, int i2, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object RemoteActionCompatParcelizer(LessonResponseBody lessonResponseBody, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(StepResponseBody stepResponseBody);

    Object RemoteActionCompatParcelizer(String str);

    Object RemoteActionCompatParcelizer(String str, int i);

    Object RemoteActionCompatParcelizer(String str, int i, boolean z, int i2, int i3, SampleVideos<? super Integer> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, long j);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super List<String>> sampleVideos);

    Object read();

    Object read(int i, int i2, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object read(String str);

    Object read(String str, int i);

    Object read(String str, int i, int i2);

    Object read(String str, SampleVideos<? super Float> sampleVideos);

    Object read(List<String> list, List<Integer> list2, SampleVideos<? super Integer> sampleVideos);

    Object read(SampleVideos<? super Map<String, ? extends VideoCacheInfo>> sampleVideos);

    Object write(long j, long j2);

    Object write(String str);

    Object write(String str, float f);

    Object write(String str, int i);

    Object write(String str, int i, SampleVideos<? super List<CacheListener>> sampleVideos);

    Object write(String str, int i, boolean z, int i2, int i3, SampleVideos<? super Integer> sampleVideos);

    Object write(String str, String str2);

    Object write(String str, String str2, SampleVideos<? super RevisionSubjectStatusModel> sampleVideos);

    Object write(String str, SampleVideos<? super List<startLoadingManifest>> sampleVideos);

    Object write(String str, boolean z, SampleVideos<? super getContentMetadata> sampleVideos);

    Object write(List<Integer> list, SampleVideos<? super Integer> sampleVideos);
}
