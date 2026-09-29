package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.models.tag.Tag;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldCancelLoad implements onChunkLoadCompleted {
    private final ChunkSampleStreamReleaseCallback IconCompatParcelizer;
    private final getPreferredQueueSize read;

    @setSdkPayload
    public shouldCancelLoad(ChunkSampleStreamReleaseCallback chunkSampleStreamReleaseCallback, getPreferredQueueSize getpreferredqueuesize) {
        toMagicModuleMetaRepoModel.write(chunkSampleStreamReleaseCallback, "");
        toMagicModuleMetaRepoModel.write(getpreferredqueuesize, "");
        this.IconCompatParcelizer = chunkSampleStreamReleaseCallback;
        this.read = getpreferredqueuesize;
    }

    @Override // kotlin.onChunkLoadCompleted
    public final void RemoteActionCompatParcelizer(Tag[] tagArr) {
        toMagicModuleMetaRepoModel.write(tagArr, "");
        this.IconCompatParcelizer.read(tagArr);
    }

    @Override // kotlin.onChunkLoadCompleted
    public final accessgetEmptyStatecp<ApiResponse<Tag[]>> RemoteActionCompatParcelizer(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        return this.read.read(strArr);
    }
}
