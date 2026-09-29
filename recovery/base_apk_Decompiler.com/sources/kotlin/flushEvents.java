package kotlin;

import com.marrow.data.models.video.cache.VideoCacheInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class flushEvents {
    public static final ListenerSetExternalSyntheticLambda1 write(VideoCacheInfo videoCacheInfo) {
        toMagicModuleMetaRepoModel.write(videoCacheInfo, "");
        String id = videoCacheInfo.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        long lastQueuedTimeMs = videoCacheInfo.getLastQueuedTimeMs();
        long lastUpdatedMs = videoCacheInfo.getLastUpdatedMs();
        long downloadStartedTimeMs = videoCacheInfo.getDownloadStartedTimeMs();
        float downloadPercent = videoCacheInfo.getDownloadPercent();
        int pixelRate = videoCacheInfo.getPixelRate();
        String referenceId = videoCacheInfo.getReferenceId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(referenceId, "");
        return new ListenerSetExternalSyntheticLambda1(id, lastUpdatedMs, lastQueuedTimeMs, downloadStartedTimeMs, downloadPercent, pixelRate, referenceId, videoCacheInfo.getDownloadStatus(), videoCacheInfo.getDownloadVersion());
    }
}
