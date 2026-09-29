package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.models.plan.Subscription;

/* JADX INFO: loaded from: classes3.dex */
public final class ChunkSampleStreamEmbeddedSampleStream implements onSampleStreamReleased {
    private final discardUpstreamMediaChunksFromIndex RemoteActionCompatParcelizer;
    private final maybeNotifyPrimaryTrackFormatChanged write;

    @setSdkPayload
    public ChunkSampleStreamEmbeddedSampleStream(discardUpstreamMediaChunksFromIndex discardupstreammediachunksfromindex, maybeNotifyPrimaryTrackFormatChanged maybenotifyprimarytrackformatchanged) {
        toMagicModuleMetaRepoModel.write(discardupstreammediachunksfromindex, "");
        toMagicModuleMetaRepoModel.write(maybenotifyprimarytrackformatchanged, "");
        this.RemoteActionCompatParcelizer = discardupstreammediachunksfromindex;
        this.write = maybenotifyprimarytrackformatchanged;
    }

    @Override // kotlin.ChunkExtractor
    public final void read(Data<Subscription[]> data) {
        toMagicModuleMetaRepoModel.write(data, "");
        if (data.flushCache) {
            this.RemoteActionCompatParcelizer.read();
        }
        discardUpstreamMediaChunksFromIndex discardupstreammediachunksfromindex = this.RemoteActionCompatParcelizer;
        Subscription[] subscriptionArr = data.data;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subscriptionArr, "");
        discardupstreammediachunksfromindex.write(getOrderDetails.onCommand(subscriptionArr));
    }

    @Override // kotlin.ChunkExtractor
    public final SearchTextResponseBody<ApiResponse<Subscription[]>> RemoteActionCompatParcelizer() {
        return this.write.write();
    }
}
