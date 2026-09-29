package kotlin;

import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.withAdState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015"}, d2 = {"Lo/AdPlaybackStateAdGroup;", "Lo/withAdState$RemoteActionCompatParcelizer;", "Lo/SingleSampleMediaPeriodSampleStreamImpl;", "p0", "<init>", "(Lo/SingleSampleMediaPeriodSampleStreamImpl;)V", "", "", "", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/response/firebase/FirebaseSyncResponse;", "AudioAttributesCompatParcelizer", "(Ljava/util/Map;)Lo/LessonDynamicResponseBody;", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/response/firebase/VideoDownloadLimitResponse;", "()Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/response/firebase/BuyNowPromoResponse;", "write", "", "Lcom/marrow/data/api/models/response/firebase/WoqMarrowthon;", "RemoteActionCompatParcelizer", "Lo/SingleSampleMediaPeriodSampleStreamImpl;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdPlaybackStateAdGroup implements withAdState.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SingleSampleMediaPeriodSampleStreamImpl RemoteActionCompatParcelizer;

    @setSdkPayload
    public AdPlaybackStateAdGroup(SingleSampleMediaPeriodSampleStreamImpl singleSampleMediaPeriodSampleStreamImpl) {
        toMagicModuleMetaRepoModel.write(singleSampleMediaPeriodSampleStreamImpl, "");
        this.RemoteActionCompatParcelizer = singleSampleMediaPeriodSampleStreamImpl;
    }

    @Override // o.withAdState.RemoteActionCompatParcelizer
    public final LessonDynamicResponseBody<FirebaseSyncResponse> AudioAttributesCompatParcelizer(Map<String, Integer> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LessonDynamicResponseBody<FirebaseSyncResponse> lessonDynamicResponseBodyAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyAudioAttributesCompatParcelizer, "");
        return lessonDynamicResponseBodyAudioAttributesCompatParcelizer;
    }

    @Override // o.withAdState.RemoteActionCompatParcelizer
    public final accessgetEmptyStatecp<VideoDownloadLimitResponse> AudioAttributesCompatParcelizer() {
        accessgetEmptyStatecp<VideoDownloadLimitResponse> accessgetemptystatecp = this.RemoteActionCompatParcelizer.read("https://medengageclinical.firebaseio.com/mrw/mrw_config/video_download_limit.json");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp, "");
        return accessgetemptystatecp;
    }

    @Override // o.withAdState.RemoteActionCompatParcelizer
    public final accessgetEmptyStatecp<BuyNowPromoResponse> write() {
        accessgetEmptyStatecp<BuyNowPromoResponse> accessgetemptystatecpRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("https://medengageclinical.firebaseio.com/mrw/mrw_config/promo_config.json");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }

    @Override // o.withAdState.RemoteActionCompatParcelizer
    public final accessgetEmptyStatecp<WoqMarrowthon[]> RemoteActionCompatParcelizer() {
        accessgetEmptyStatecp<WoqMarrowthon[]> accessgetemptystatecpWrite = this.RemoteActionCompatParcelizer.write("https://medengageclinical.firebaseio.com/mrw/woq_marrowthon_v2.json");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        return accessgetemptystatecpWrite;
    }
}
