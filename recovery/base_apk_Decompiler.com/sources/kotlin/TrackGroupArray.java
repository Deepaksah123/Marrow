package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackGroupArray implements createEmptyAdGroups {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final SingleSampleMediaPeriod1 read;

    public TrackGroupArray(SingleSampleMediaPeriod1 singleSampleMediaPeriod1, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(singleSampleMediaPeriod1, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.read = singleSampleMediaPeriod1;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> RemoteActionCompatParcelizer(VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        return ResponseExtensionsKt.toMarrowResponse(this.read.AudioAttributesCompatParcelizer(videoBookmarkTimeline.getId(), new MarrowRequestBody(this.AudioAttributesCompatParcelizer.onRemoveQueueItem())));
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> AudioAttributesCompatParcelizer(VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        return ResponseExtensionsKt.toMarrowResponse(this.read.IconCompatParcelizer(videoBookmarkTimeline.getId(), new MarrowRequestBody(this.AudioAttributesCompatParcelizer.onRemoveQueueItem())));
    }

    @Override // kotlin.createEmptyAdGroups
    public final int IconCompatParcelizer() {
        throw new UnsupportedOperationException("Cannot get bookmark count directly from the remote Api directly");
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> read(VideoBookmarkTimeline videoBookmarkTimeline, int i) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        throw new UnsupportedOperationException("Cannot updateBookmarkTimeline");
    }
}
