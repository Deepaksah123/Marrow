package kotlin;

import android.content.Context;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class normalizeRoleFlags implements createEmptyAdGroups {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final setCompositeSequenceableLoaderFactory IconCompatParcelizer;
    private final updateSelectedBaseUrl RemoteActionCompatParcelizer;
    private final DashSegmentIndex read;
    private final isMovingLiveWindow write;

    public normalizeRoleFlags(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.IconCompatParcelizer = new setCompositeSequenceableLoaderFactory(context, getstreampositionusforcontent);
        this.write = new isMovingLiveWindow(context, getstreampositionusforcontent);
        this.read = new DashSegmentIndex(context, getstreampositionusforcontent);
        this.RemoteActionCompatParcelizer = new updateSelectedBaseUrl(context, getstreampositionusforcontent);
    }

    @Override // kotlin.createEmptyAdGroups
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> RemoteActionCompatParcelizer(final VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.verifyCorrectness
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return normalizeRoleFlags.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, videoBookmarkTimeline);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse RemoteActionCompatParcelizer(normalizeRoleFlags normalizeroleflags, VideoBookmarkTimeline videoBookmarkTimeline) {
        normalizeroleflags.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(videoBookmarkTimeline);
        return new Success(new VideoTimelineResponseBody(videoBookmarkTimeline.getId(), true));
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> AudioAttributesCompatParcelizer(final VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.normalizeLanguage
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return normalizeRoleFlags.AudioAttributesCompatParcelizer(this.read, videoBookmarkTimeline);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse AudioAttributesCompatParcelizer(normalizeRoleFlags normalizeroleflags, VideoBookmarkTimeline videoBookmarkTimeline) {
        normalizeroleflags.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(videoBookmarkTimeline);
        return new Success(new VideoTimelineResponseBody(videoBookmarkTimeline.getId(), true));
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> read(VideoBookmarkTimeline videoBookmarkTimeline, int i) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        throw new UnsupportedOperationException("Cannot updateBookmarkTimeline");
    }
}
