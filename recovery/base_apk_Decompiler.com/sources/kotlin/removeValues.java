package kotlin;

import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.pearl.remote.model.PearlBookmarkRequestBody;
import com.marrow2.data.pearl.remote.model.PearlResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\tÀ\u0006\u0003"}, d2 = {"Lo/removeValues;", "", "", "p0", "Lcom/marrow2/data/pearl/remote/model/PearlBookmarkRequestBody;", "p1", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow2/data/pearl/remote/model/PearlResponseBody;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lcom/marrow2/data/pearl/remote/model/PearlBookmarkRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface removeValues {
    @getReviewTimeMs(read = "pearls/{id}/unbookmark")
    Object IconCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook PearlBookmarkRequestBody pearlBookmarkRequestBody, SampleVideos<? super NetworkApiResponse<PearlResponseBody>> sampleVideos);

    @getReviewTimeMs(read = "pearls/{id}/bookmark")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @getTimeTook PearlBookmarkRequestBody pearlBookmarkRequestBody, SampleVideos<? super NetworkApiResponse<PearlResponseBody>> sampleVideos);
}
