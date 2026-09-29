package kotlin;

import com.marrow.data.api.models.request.user.TrackUserRequestBody;
import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.pearl.PearlResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.common.NetworkStat;
import com.marrow.data.models.common.Schema;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.core.network.model.EmptyBody;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\u0014J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0014JF\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0014J2\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001b\u0010\u0014J2\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001d\u0010\u0014J&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u001fJ2\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0014J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\"J&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001d\u0010$J\u001c\u0010\u001b\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010\u0003\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\"J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020'0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020&H§@¢\u0006\u0004\b\u001b\u0010(À\u0006\u0003"}, d2 = {"Lo/CachedRegionTracker;", "", "", "p0", "", "p1", "", "p2", "", "p3", "p4", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow/data/api/models/response/lesson/LessonIndexResponseBody;", "RemoteActionCompatParcelizer", "(JLjava/lang/String;IZILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/CourseConfigV2;", "IconCompatParcelizer", "(IIILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/subject/Subject;", "(JLjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/test/TestIndex;", "AudioAttributesImplApi26Parcelizer", "write", "(JLjava/lang/String;IILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/Schema;", "Lcom/marrow/data/models/pearl/Pearl;", "read", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "AudioAttributesCompatParcelizer", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "(JLo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/pearl/PearlResponseBody;", "Lcom/marrow/data/api/models/response/sync/CrossDeviceSyncResponseObject;", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/FeaturedCard;", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/models/common/NetworkStat;", "Lcom/marrow/data/api/models/request/user/TrackUserRequestBody;", "Lcom/marrow2/core/network/model/EmptyBody;", "(Ljava/lang/String;Lcom/marrow/data/api/models/request/user/TrackUserRequestBody;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CachedRegionTracker {
    @setMcqTimingDetails(read = "featured_card?fc_detail=1")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "edition") int i, SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos);

    @setMcqTimingDetails(read = "mcq/i/bookmarked_v2")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<McqResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "test?ntr=1&field_set=basic")
    Object AudioAttributesImplApi26Parcelizer(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos);

    @setMcqTimingDetails(read = "course_config/i/base_config")
    Object IconCompatParcelizer(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "edition") int i2, @RankPairModel(read = CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION) int i3, SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos);

    @setMcqTimingDetails(read = "pearls/i/bookmarked_v2")
    Object IconCompatParcelizer(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<PearlResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "video_timeline_bookmark")
    Object IconCompatParcelizer(@RankPairModel(read = "last_updated") long j, SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos);

    @setMcqTimingDetails(read = CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON)
    Object RemoteActionCompatParcelizer(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, @RankPairModel(read = "default_edition") int i, @RankPairModel(read = "is_first_load") boolean z, @RankPairModel(read = "limit") int i2, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "subject")
    Object RemoteActionCompatParcelizer(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos);

    @setMcqTimingDetails
    Object RemoteActionCompatParcelizer(@StateResultRSModel String str, SampleVideos<? super NetworkApiResponse<List<CrossDeviceSyncResponseObject>>> sampleVideos);

    @setMcqTimingDetails(read = CourseConfigKeyConstantsKt.KEY_PEARLS)
    Object read(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<Pearl>>> sampleVideos);

    @getReviewTimeMs(read = "user/{id}/track_user")
    Object read(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook TrackUserRequestBody trackUserRequestBody, SampleVideos<? super NetworkApiResponse<EmptyBody>> sampleVideos);

    @setMcqTimingDetails
    Object read(@StateResultRSModel String str, SampleVideos<? super NetworkStat> sampleVideos);

    @setMcqTimingDetails(read = "lesson/i/video_sync_for_edition")
    Object write(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, @RankPairModel(read = "edition") int i, @RankPairModel(read = FilterParams.KEY_COURSE_ID) int i2, SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "subtopic")
    Object write(@RankPairModel(read = "pagination_version") long j, @RankPairModel(read = "cursor") String str, SampleVideos<? super NetworkApiResponse<List<Schema>>> sampleVideos);
}
