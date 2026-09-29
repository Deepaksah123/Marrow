package com.marrow2.data.mcq.remote;

import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.bookmark.remote.model.McqBookmarkResponseBody;
import com.marrow2.data.bookmark.remote.model.ResetBookmarkRequestBody;
import com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.RankPairModel;
import kotlin.SampleVideos;
import kotlin.getReviewTimeMs;
import kotlin.getTimeTook;
import kotlin.setMcqTimingDetails;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/marrow2/data/mcq/remote/McqService;", "", "Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkRequestBody;", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "resetMcqBookmarks", "(Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/bookmark/remote/model/McqBookmarkResponseBody;", "bookmarkMcq", "unBookmarkMcq", "", "p1", "", "Lcom/marrow2/data/mcq/remote/McqFaqResponseBody;", "getMcqFaq", "(Ljava/lang/String;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "", "", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "getPearlRelatedMcq", "(ILjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface McqService {
    @getReviewTimeMs(read = "mcq/i/bookmark")
    Object bookmarkMcq(@getTimeTook ResetBookmarkRequestBody resetBookmarkRequestBody, SampleVideos<? super NetworkApiResponse<McqBookmarkResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "faq")
    Object getMcqFaq(@RankPairModel(read = DownloadService.KEY_CONTENT_ID) String str, @RankPairModel(read = "content_type") String str2, SampleVideos<? super NetworkApiResponse<List<McqFaqResponseBody>>> sampleVideos);

    @setMcqTimingDetails(read = "mcq/i/pearl_related_mcq")
    Object getPearlRelatedMcq(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "pearl_id") String str, SampleVideos<? super NetworkApiResponse<McqResponseBody[]>> sampleVideos);

    @getReviewTimeMs(read = "mcq/i/unbookmark_all")
    Object resetMcqBookmarks(@getTimeTook ResetBookmarkRequestBody resetBookmarkRequestBody, SampleVideos<? super NetworkApiResponse<ResetBookmarkResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "mcq/i/unbookmark")
    Object unBookmarkMcq(@getTimeTook ResetBookmarkRequestBody resetBookmarkRequestBody, SampleVideos<? super NetworkApiResponse<McqBookmarkResponseBody>> sampleVideos);
}
