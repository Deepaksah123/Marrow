package kotlin;

import com.marrow.data.api.models.response.lesson.LessonDynamicResponseBody;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody;
import com.marrow2.data.lesson.remote.model.MarkLessonCompleteRequestBody;
import com.marrow2.data.lesson.remote.model.QBankStatsResponse;
import com.marrow2.data.lesson.remote.model.ResetLessonResponseBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CacheDataSink {
    Object AudioAttributesCompatParcelizer(String str, MarkLessonCompleteRequestBody markLessonCompleteRequestBody, SampleVideos<? super MarkCompleteResponseBody> sampleVideos);

    Object IconCompatParcelizer(int i, List<String> list, SampleVideos<? super List<? extends LessonDynamicResponseBody>> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super LessonResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, int i, int i2, SampleVideos<? super QBankStatsResponse> sampleVideos);

    Object write(int i, SampleVideos<? super ResetLessonResponseBody> sampleVideos);
}
