package kotlin;

import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface SingleSampleMediaPeriodSampleStreamImpl {
    @setMcqTimingDetails(read = "marrow_sync")
    LessonDynamicResponseBody<FirebaseSyncResponse> AudioAttributesCompatParcelizer(@setScoreRange Map<String, Integer> map);

    @setMcqTimingDetails
    accessgetEmptyStatecp<BuyNowPromoResponse> RemoteActionCompatParcelizer(@StateResultRSModel String str);

    @setMcqTimingDetails
    accessgetEmptyStatecp<VideoDownloadLimitResponse> read(@StateResultRSModel String str);

    @setMcqTimingDetails
    accessgetEmptyStatecp<WoqMarrowthon[]> write(@StateResultRSModel String str);
}
