package kotlin;

import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.pearl.PearlResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.common.NetworkStat;
import com.marrow.data.models.common.Schema;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getRegionEndTimeMs {
    Object AudioAttributesCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos);

    Object IconCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos);

    Object IconCompatParcelizer(long j, SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos);

    Object MediaBrowserCompatItemReceiver(long j, String str, SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos);

    Object RemoteActionCompatParcelizer(int i, SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos);

    Object RemoteActionCompatParcelizer(long j, String str, SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, int i, boolean z, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, NetworkStat networkStat, SampleVideos<? super getShowPopup> sampleVideos);

    Object read(long j, String str, int i, int i2, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos);

    Object read(long j, String str, SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos);

    Object write(int i, int i2, int i3, SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos);

    Object write(long j, String str, SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos);

    Object write(SampleVideos<? super NetworkStat> sampleVideos);
}
