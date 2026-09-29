package kotlin;

import com.marrow.bgservices.sync.base.BaseSyncServicePresenter;
import com.marrow.data.models.plan.Subscription;
import kotlin.discardToEnd;
import kotlin.maybeFinishPrepare;

/* JADX INFO: loaded from: classes5.dex */
public final class discardSampleMetadataToRead extends BaseSyncServicePresenter<Subscription> implements discardToEnd.read {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public discardSampleMetadataToRead(getNextChunkIndex getnextchunkindex, ChunkExtractorTrackOutputProvider<Subscription> chunkExtractorTrackOutputProvider, getStreamPositionUsForContent getstreampositionusforcontent, maybeFinishPrepare.IconCompatParcelizer iconCompatParcelizer) {
        super(128, chunkExtractorTrackOutputProvider, getstreampositionusforcontent, getnextchunkindex, iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(chunkExtractorTrackOutputProvider, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
    }
}
