package kotlin;

import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.schema.remote.model.SchemaCompletionStatusRSModel;
import com.marrow2.data.schema.remote.model.SchemaDetailRSModel;
import com.marrow2.data.schema.remote.model.SchemaUserStatusRSModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lo/getBinder;", "", "", "p0", "", "p1", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;", "IconCompatParcelizer", "(JLjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/schema/remote/model/SchemaCompletionStatusRSModel;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/schema/remote/model/SchemaDetailRSModel;", "(Ljava/lang/String;JLo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface getBinder {
    @setMcqTimingDetails(read = "subtopic/{id}")
    Object AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, @RankPairModel(read = "last_lesson_submitted_on") long j, SampleVideos<? super NetworkApiResponse<SchemaDetailRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "subtopic/{id}/status")
    Object AudioAttributesCompatParcelizer(@setRankRange(IconCompatParcelizer = "id") String str, SampleVideos<? super NetworkApiResponse<SchemaCompletionStatusRSModel>> sampleVideos);

    @setMcqTimingDetails(read = "subtopic/i/status")
    Object IconCompatParcelizer(@RankPairModel(read = "last_updated") long j, @RankPairModel(read = "since_id") String str, SampleVideos<? super NetworkApiResponse<List<SchemaUserStatusRSModel>>> sampleVideos);
}
