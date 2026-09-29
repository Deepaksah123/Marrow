package kotlin;

import com.google.android.gms.actions.SearchIntents;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.search.remote.model.SearchMcqResponseBody;
import com.marrow2.data.search.remote.model.SearchTextResponseBody;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lo/CodecSpecificDataUtil;", "", "", "p0", "p1", "", "p2", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow2/data/search/remote/model/SearchTextResponseBody;", "write", "(Ljava/lang/String;Ljava/lang/String;ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/search/remote/model/SearchMcqResponseBody;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CodecSpecificDataUtil {
    @setMcqTimingDetails(read = "search/{search_id}")
    Object read(@setRankRange(IconCompatParcelizer = "search_id") String str, @RankPairModel(read = "search_type") String str2, @RankPairModel(read = "edition") int i, SampleVideos<? super NetworkApiResponse<SearchMcqResponseBody>> sampleVideos);

    @setMcqTimingDetails(read = "search")
    Object write(@RankPairModel(read = SearchIntents.EXTRA_QUERY) String str, @RankPairModel(read = "search_type") String str2, @RankPairModel(read = "edition") int i, SampleVideos<? super NetworkApiResponse<List<SearchTextResponseBody>>> sampleVideos);
}
