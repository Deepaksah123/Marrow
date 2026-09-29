package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.EnvironmentData;
import com.marrow.data.api.models.response.sync.SyncResult;

/* JADX INFO: loaded from: classes3.dex */
public final class getLastMediaChunk<T> {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final getNextChunkIndex IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer<T> read;
    private final ChunkExtractorTrackOutputProvider<T> write;

    public interface AudioAttributesCompatParcelizer<T> {
        void IconCompatParcelizer(Exception exc);

        void RemoteActionCompatParcelizer(getLastMediaChunk<T> getlastmediachunk, SyncResult syncResult);
    }

    public getLastMediaChunk(ChunkExtractorTrackOutputProvider<T> chunkExtractorTrackOutputProvider, getStreamPositionUsForContent getstreampositionusforcontent, getNextChunkIndex getnextchunkindex, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        this.write = chunkExtractorTrackOutputProvider;
        this.read = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = getnextchunkindex;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SyncResult AudioAttributesCompatParcelizer() {
        int length;
        SyncResult syncResult = new SyncResult();
        while (syncResult.recursionCount < 50 && !syncResult.completed) {
            syncResult.recursionCount++;
            if (!this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                break;
            }
            try {
                ChunkExtractorTrackOutputProvider<T> chunkExtractorTrackOutputProvider = this.write;
                boolean z = chunkExtractorTrackOutputProvider instanceof discardDownstreamMediaChunks;
                boolean z2 = chunkExtractorTrackOutputProvider instanceof ChunkExtractor;
                discardDownstreamMediaChunks discarddownstreammediachunks = z ? (discardDownstreamMediaChunks) chunkExtractorTrackOutputProvider : 0;
                ChunkExtractor chunkExtractor = z2 ? (ChunkExtractor) chunkExtractorTrackOutputProvider : 0;
                ApiResponse apiResponse = z ? (ApiResponse) discarddownstreammediachunks.IconCompatParcelizer().read().AudioAttributesCompatParcelizer() : null;
                ApiResponse apiResponse2 = z2 ? (ApiResponse) chunkExtractor.RemoteActionCompatParcelizer().read().AudioAttributesCompatParcelizer() : null;
                ApiResponse apiResponse3 = z ? apiResponse : apiResponse2;
                if (apiResponse3 != null && apiResponse3.isSuccessful() && apiResponse3.data != null) {
                    read(apiResponse3.data.environmentData);
                    if (z) {
                        discarddownstreammediachunks.read(apiResponse.data);
                        length = 1;
                    } else {
                        chunkExtractor.read(apiResponse2.data);
                        length = ((Object[]) apiResponse2.data.data).length;
                    }
                    syncResult.completed = true ^ apiResponse3.data.loadMore;
                    syncResult.totalDataToSync = apiResponse3.data.total;
                    syncResult.syncedSoFar += length;
                    AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer = this.read;
                    if (audioAttributesCompatParcelizer != null) {
                        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, syncResult);
                    }
                }
                syncResult.completed = false;
                return syncResult;
            } catch (Exception e) {
                getSegmentEndTimeUs.IconCompatParcelizer(e);
                AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer2 = this.read;
                if (audioAttributesCompatParcelizer2 != null) {
                    audioAttributesCompatParcelizer2.IconCompatParcelizer(e);
                }
            }
        }
        return syncResult;
    }

    private void read(EnvironmentData environmentData) {
        if (environmentData != null && environmentData.versionData != null) {
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat(environmentData.versionData.toJSON());
        } else {
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat((String) null);
        }
    }
}
