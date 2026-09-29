package kotlin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.BuynowBannerResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.NotesResponse;
import com.marrow.data.api.models.response.firebase.PlanResponse;
import com.marrow.data.api.models.response.firebase.SlidesResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.withAdState;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\b\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u000f\u0010\u001fJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020 0\u0016H\u0016¢\u0006\u0004\b\u000b\u0010!R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\""}, d2 = {"Lo/copyDurationsUsWithSpaceForAdCount;", "Lo/withAdState$read;", "Lo/getStreamPositionUsForContent;", "p0", "<init>", "(Lo/getStreamPositionUsForContent;)V", "Lcom/marrow/data/api/models/response/firebase/PlanResponse;", "", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/api/models/response/firebase/PlanResponse;)V", "Lcom/marrow/data/api/models/response/firebase/VideoDownloadLimitResponse;", "IconCompatParcelizer", "(Lcom/marrow/data/api/models/response/firebase/VideoDownloadLimitResponse;)V", "", "", "read", "(Ljava/lang/String;)I", "", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "Lcom/marrow/data/api/models/response/firebase/FirebaseSyncResponse$Version;", "(Lcom/marrow/data/api/models/response/firebase/FirebaseSyncResponse$Version;)V", "", "Lcom/marrow/data/api/models/response/firebase/NotesResponse;", "([Lcom/marrow/data/api/models/response/firebase/NotesResponse;)V", "Lcom/marrow/data/api/models/response/firebase/SlidesResponse;", "write", "([Lcom/marrow/data/api/models/response/firebase/SlidesResponse;)V", "Lcom/marrow/data/api/models/response/firebase/BuyNowPromoResponse;", "(Lcom/marrow/data/api/models/response/firebase/BuyNowPromoResponse;)V", "Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;", "(Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;)V", "Lcom/marrow/data/api/models/response/firebase/WoqMarrowthon;", "([Lcom/marrow/data/api/models/response/firebase/WoqMarrowthon;)V", "Lo/getStreamPositionUsForContent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class copyDurationsUsWithSpaceForAdCount implements withAdState.read {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;

    @setSdkPayload
    public copyDurationsUsWithSpaceForAdCount(getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // o.withAdState.read
    public final void AudioAttributesCompatParcelizer(PlanResponse p0) {
        JSONObject json;
        toMagicModuleMetaRepoModel.write(p0, "");
        getStreamPositionUsForContent getstreampositionusforcontent = this.AudioAttributesCompatParcelizer;
        PlanResponse.Promo promo = p0.promo;
        AdaptationSet.AudioAttributesCompatParcelizer(getstreampositionusforcontent, "plan_promo", (promo == null || (json = promo.toJson()) == null) ? null : json.toString());
    }

    @Override // o.withAdState.read
    public final void IconCompatParcelizer(VideoDownloadLimitResponse p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getFreeLimit() != null) {
            AdaptationSet.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, "video_download_limit_free", p0.getFreeLimit().intValue());
        }
        if (p0.getProLimit() != null) {
            AdaptationSet.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, "video_download_limit_pro", p0.getProLimit().intValue());
        }
    }

    private final int read(String p0) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(p0);
    }

    @Override // o.withAdState.read
    public final Map<String, Integer> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.write(setAction.write("free_videos_version", Integer.valueOf(read("free_videos_version"))), setAction.write("plans_version", Integer.valueOf(read("plans_version"))), setAction.write("notes_version", Integer.valueOf(read("notes_version"))), setAction.write("slides_version", Integer.valueOf(read("slides_version"))), setAction.write("buynow_banner_version", Integer.valueOf(read("buynow_banner_version"))), setAction.write("woq_marrowthon_version", Integer.valueOf(read("woq_marrowthon_version"))), setAction.write("free_videos_fmge_version", Integer.valueOf(read("free_videos_fmge_version"))));
    }

    @Override // o.withAdState.read
    public final void read(FirebaseSyncResponse.Version p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getStreamPositionUsForContent getstreampositionusforcontent = this.AudioAttributesCompatParcelizer;
        AdaptationSet.RemoteActionCompatParcelizer(getstreampositionusforcontent, "plans_version", p0.plansVersion);
        AdaptationSet.RemoteActionCompatParcelizer(getstreampositionusforcontent, "notes_version", p0.notesVersion);
        AdaptationSet.RemoteActionCompatParcelizer(getstreampositionusforcontent, "slides_version", p0.slidesVersion);
        AdaptationSet.RemoteActionCompatParcelizer(getstreampositionusforcontent, "buynow_banner_version", p0.buynowBannerVersion);
        AdaptationSet.RemoteActionCompatParcelizer(getstreampositionusforcontent, "woq_marrowthon_version", p0.woqMarrowthonVersion);
    }

    @Override // o.withAdState.read
    public final void write(BuyNowPromoResponse p0) {
        if (p0 == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(p0.isLive());
        this.AudioAttributesCompatParcelizer.MediaMetadataCompat(p0.getLabelText());
    }

    @Override // o.withAdState.read
    public final void read(BuynowBannerResponse p0) throws JsonProcessingException {
        toMagicModuleMetaRepoModel.write(p0, "");
        AdaptationSet.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "buy_now_banner", new ObjectMapper().writeValueAsString(p0));
    }

    @Override // o.withAdState.read
    public final void AudioAttributesCompatParcelizer(NotesResponse[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (NotesResponse notesResponse : p0) {
            for (String str : notesResponse.getRootSubjectIds()) {
                getStreamPositionUsForContent getstreampositionusforcontent = this.AudioAttributesCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_notes");
                AdaptationSet.AudioAttributesCompatParcelizer(getstreampositionusforcontent, sb.toString(), notesResponse.getMessage());
            }
        }
    }

    @Override // o.withAdState.read
    public final void write(SlidesResponse[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (SlidesResponse slidesResponse : p0) {
            for (String str : slidesResponse.getRootSubjectIds()) {
                getStreamPositionUsForContent getstreampositionusforcontent = this.AudioAttributesCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_slides");
                AdaptationSet.AudioAttributesCompatParcelizer(getstreampositionusforcontent, sb.toString(), slidesResponse.getMessage());
            }
        }
    }

    @Override // o.withAdState.read
    public final void IconCompatParcelizer(WoqMarrowthon[] p0) throws JsonProcessingException {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (WoqMarrowthon woqMarrowthon : p0) {
            getStreamPositionUsForContent getstreampositionusforcontent = this.AudioAttributesCompatParcelizer;
            int courseId = woqMarrowthon.getCourseId();
            String strWriteValueAsString = new ObjectMapper().writeValueAsString(woqMarrowthon.getWoqData());
            if (strWriteValueAsString == null) {
                strWriteValueAsString = "";
            }
            getstreampositionusforcontent.AudioAttributesCompatParcelizer(courseId, strWriteValueAsString);
        }
    }
}
