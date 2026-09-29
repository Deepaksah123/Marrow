package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.api.models.response.user.SyncUserResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.plan.Subscription;

/* JADX INFO: loaded from: classes3.dex */
public final class discardUpstream implements discardDownstreamMediaChunks<SyncUserResponse> {
    private ApplicationData AudioAttributesCompatParcelizer;
    private ChunkHolder AudioAttributesImplBaseParcelizer;
    private logErrorMessage IconCompatParcelizer;
    private getStreamPositionUsForContent RemoteActionCompatParcelizer;
    private ChunkExtractor<Subscription> read;
    private getNextChunkIndex write;

    @setSdkPayload
    public discardUpstream(ChunkExtractor<Subscription> chunkExtractor, ApplicationData applicationData, getStreamPositionUsForContent getstreampositionusforcontent, getNextChunkIndex getnextchunkindex, ChunkHolder chunkHolder, logErrorMessage logerrormessage) {
        this.read = chunkExtractor;
        this.AudioAttributesCompatParcelizer = applicationData;
        this.write = getnextchunkindex;
        this.IconCompatParcelizer = logerrormessage;
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
        this.AudioAttributesImplBaseParcelizer = chunkHolder;
    }

    @Override // kotlin.discardDownstreamMediaChunks
    public final void read(Data<SyncUserResponse> data) {
        SyncUserResponse syncUserResponse = data.data;
        if (syncUserResponse.notesPurchasedDate != null) {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(syncUserResponse.notesPurchasedDate.longValue());
        }
        try {
            Data<Subscription[]> dataCloneFor = Data.cloneFor(data, syncUserResponse.subscriptions);
            if (this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer() != (dataCloneFor.data != null ? dataCloneFor.data.length : 0)) {
                this.RemoteActionCompatParcelizer.onCommand(null);
            }
            dataCloneFor.flushCache = true;
            this.read.read(dataCloneFor);
        } catch (Exception unused) {
        }
        try {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver(syncUserResponse.isRenewEligible);
        } catch (Exception unused2) {
        }
        this.write.read(LoggedUserResponse.getLoggedUser(syncUserResponse));
        this.AudioAttributesCompatParcelizer.onProfileUpdated(true);
    }

    @Override // kotlin.discardDownstreamMediaChunks
    public final SearchTextResponseBody<ApiResponse<SyncUserResponse>> IconCompatParcelizer() {
        return this.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
    }
}
