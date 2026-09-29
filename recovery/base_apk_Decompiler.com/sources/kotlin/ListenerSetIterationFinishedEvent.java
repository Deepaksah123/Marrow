package kotlin;

import com.marrow.data.models.video.VideoResumeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSetIterationFinishedEvent {
    public static final ListenerSetListenerHolder write(VideoResumeInfo videoResumeInfo) {
        toMagicModuleMetaRepoModel.write(videoResumeInfo, "");
        String videoId = videoResumeInfo.getVideoId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoId, "");
        long resumeTimeMs = videoResumeInfo.getResumeTimeMs();
        long totalDurationMs = videoResumeInfo.getTotalDurationMs();
        String referenceId = videoResumeInfo.getReferenceId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(referenceId, "");
        return new ListenerSetListenerHolder(videoId, resumeTimeMs, totalDurationMs, referenceId);
    }
}
