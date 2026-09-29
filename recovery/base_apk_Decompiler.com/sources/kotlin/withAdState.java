package kotlin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.BuynowBannerResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.NotesResponse;
import com.marrow.data.api.models.response.firebase.PlanResponse;
import com.marrow.data.api.models.response.firebase.SlidesResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface withAdState {

    public interface RemoteActionCompatParcelizer {
        LessonDynamicResponseBody<FirebaseSyncResponse> AudioAttributesCompatParcelizer(Map<String, Integer> map);

        accessgetEmptyStatecp<VideoDownloadLimitResponse> AudioAttributesCompatParcelizer();

        accessgetEmptyStatecp<WoqMarrowthon[]> RemoteActionCompatParcelizer();

        accessgetEmptyStatecp<BuyNowPromoResponse> write();
    }

    public interface read {
        void AudioAttributesCompatParcelizer(PlanResponse planResponse);

        void AudioAttributesCompatParcelizer(NotesResponse[] notesResponseArr);

        void IconCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse);

        void IconCompatParcelizer(WoqMarrowthon[] woqMarrowthonArr) throws JsonProcessingException;

        Map<String, Integer> RemoteActionCompatParcelizer();

        void read(BuynowBannerResponse buynowBannerResponse) throws JsonProcessingException;

        void read(FirebaseSyncResponse.Version version);

        void write(BuyNowPromoResponse buyNowPromoResponse);

        void write(SlidesResponse[] slidesResponseArr);
    }

    accessgetEmptyStatecp<VideoDownloadLimitResponse> IconCompatParcelizer();

    void IconCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse) throws JsonProcessingException;

    LessonDynamicResponseBody<FirebaseSyncResponse> RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(WoqMarrowthon[] woqMarrowthonArr) throws JsonProcessingException;

    accessgetEmptyStatecp<BuyNowPromoResponse> read();

    accessgetEmptyStatecp<WoqMarrowthon[]> write();

    void write(BuyNowPromoResponse buyNowPromoResponse) throws JsonProcessingException;

    void write(FirebaseSyncResponse firebaseSyncResponse) throws JsonProcessingException;
}
