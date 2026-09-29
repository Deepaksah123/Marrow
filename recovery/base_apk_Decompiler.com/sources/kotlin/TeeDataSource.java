package kotlin;

import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.models.lesson.RevisionSubjectStatusModel;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface TeeDataSource {
    Object AudioAttributesCompatParcelizer();

    Object AudioAttributesCompatParcelizer(LessonResponseBody lessonResponseBody);

    Object AudioAttributesCompatParcelizer(String str);

    Object AudioAttributesCompatParcelizer(String str, int i);

    Object AudioAttributesCompatParcelizer(String str, int i, SampleVideos<? super List<CacheListener>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, int i, boolean z, int i2, int i3, SampleVideos<? super Integer> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super List<startLoadingManifest>> sampleVideos);

    Object AudioAttributesCompatParcelizer(List<Integer> list, SampleVideos<? super Integer> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(String str);

    Object IconCompatParcelizer();

    Object IconCompatParcelizer(long j, long j2);

    Object IconCompatParcelizer(String str);

    Object IconCompatParcelizer(String str, float f);

    Object IconCompatParcelizer(String str, int i);

    Object IconCompatParcelizer(String str, SampleVideos<? super List<String>> sampleVideos);

    Object IconCompatParcelizer(List<String> list, List<Integer> list2, SampleVideos<? super Integer> sampleVideos);

    Object RemoteActionCompatParcelizer(String str);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super Integer> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, boolean z, SampleVideos<? super getContentMetadata> sampleVideos);

    Object read(String str);

    Object read(String str, int i);

    Object read(String str, String str2, SampleVideos<? super RevisionSubjectStatusModel> sampleVideos);

    Object read(String str, SampleVideos<? super Float> sampleVideos);

    Object write(int i, int i2, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super HomeLessonIndexV2> sampleVideos);

    Object write(String str);

    Object write(String str, int i);

    Object write(String str, int i, int i2);

    Object write(String str, int i, boolean z, int i2, int i3, SampleVideos<? super Integer> sampleVideos);

    Object write(String str, long j);

    Object write(String str, String str2);

    Object write(String str, SampleVideos<? super Map<String, ? extends ArrayList<startFile>>> sampleVideos);
}
