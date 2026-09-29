package kotlin;

import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.models.user.NotesDispatchAddressRequest;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lo/createCacheDirectories;", "", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lo/LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/plan/RenewEligible;", "RemoteActionCompatParcelizer", "Lcom/marrow/data/models/user/NotesDispatchAddressRequest;", "p0", "read", "(Lcom/marrow/data/models/user/NotesDispatchAddressRequest;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface createCacheDirectories {
    @setMcqTimingDetails(read = "rf_coupon")
    Object AudioAttributesCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0>>> sampleVideos);

    @setMcqTimingDetails(read = "coupon/i/renew")
    Object RemoteActionCompatParcelizer(SampleVideos<? super NetworkApiResponse<RenewEligible>> sampleVideos);

    @getReviewTimeMs(read = "notes/i/add_notes_dispatch_address")
    Object read(@getTimeTook NotesDispatchAddressRequest notesDispatchAddressRequest, SampleVideos<? super NetworkApiResponse<Object>> sampleVideos);
}
