package kotlin;

import com.marrow.data.models.pearl.PearlMini;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesFilterResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lo/updateInPlace;", "", "", "p0", "p1", "", "p2", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesResponse;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;ILo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesFilterResponse;", "write", "(Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface updateInPlace {
    @setMcqTimingDetails(read = "qbank_updates")
    Object IconCompatParcelizer(@RankPairModel(read = "page") String str, @RankPairModel(read = PearlMini.KEY_ROOT_SUBJECT_IDS) String str2, @RankPairModel(read = "limit") int i, SampleVideos<? super NetworkApiResponse<List<RecentUpdatesResponse>>> sampleVideos);

    @setMcqTimingDetails(read = "qbank_updates/{recent_update_id}")
    Object RemoteActionCompatParcelizer(@setRankRange(IconCompatParcelizer = "recent_update_id") String str, SampleVideos<? super NetworkApiResponse<RecentUpdatesResponse>> sampleVideos);

    @setMcqTimingDetails(read = "qbank_updates/i/filters")
    Object write(SampleVideos<? super NetworkApiResponse<RecentUpdatesFilterResponse>> sampleVideos);
}
