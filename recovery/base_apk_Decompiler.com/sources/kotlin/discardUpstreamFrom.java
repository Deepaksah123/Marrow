package kotlin;

import com.marrow.bgservices.sync.base.BaseSyncServicePresenter;
import com.marrow.data.api.models.response.user.SyncUserResponse;
import kotlin.discardUpstreamSamples;
import kotlin.maybeFinishPrepare;

/* JADX INFO: loaded from: classes3.dex */
public final class discardUpstreamFrom extends BaseSyncServicePresenter<SyncUserResponse> implements discardUpstreamSamples.AudioAttributesCompatParcelizer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public discardUpstreamFrom(getNextChunkIndex getnextchunkindex, ChunkExtractorTrackOutputProvider<SyncUserResponse> chunkExtractorTrackOutputProvider, getStreamPositionUsForContent getstreampositionusforcontent, maybeFinishPrepare.IconCompatParcelizer iconCompatParcelizer) {
        super(1, chunkExtractorTrackOutputProvider, getstreampositionusforcontent, getnextchunkindex, iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(chunkExtractorTrackOutputProvider, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
    }
}
