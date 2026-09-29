package kotlin;

import com.marrow.data.models.plan.NotesSubscriptionResponse;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.data.subscription.remote.model.PlanSubscriptionRSModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lo/chooseEGLConfig;", "", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow2/data/subscription/remote/model/PlanSubscriptionRSModel;", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "p0", "Lcom/marrow/data/models/plan/NotesSubscriptionResponse;", "AudioAttributesCompatParcelizer", "(ILo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface chooseEGLConfig {
    @setMcqTimingDetails(read = "subscription/i/notes_subscription")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = "edition") int i, SampleVideos<? super NetworkApiResponse<NotesSubscriptionResponse>> sampleVideos);

    @setMcqTimingDetails(read = "payment")
    Object read(SampleVideos<? super NetworkApiResponse<List<PlanSubscriptionRSModel>>> sampleVideos);
}
