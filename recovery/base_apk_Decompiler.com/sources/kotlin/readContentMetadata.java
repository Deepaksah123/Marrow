package kotlin;

import com.marrow.data.api.models.response.notespurchase.NotesPurchasePlanDetailsResponse;
import com.marrow2.core.network.model.NetworkApiResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lo/readContentMetadata;", "", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow/data/api/models/response/notespurchase/NotesPurchasePlanDetailsResponse;", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface readContentMetadata {
    @setMcqTimingDetails(read = "plan/i/get_default_notes_plan")
    Object RemoteActionCompatParcelizer(SampleVideos<? super NetworkApiResponse<NotesPurchasePlanDetailsResponse>> sampleVideos);
}
