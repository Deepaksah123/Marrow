package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class UnrecognizedInputFormatException implements createEmptyAdGroups {
    private final createEmptyAdGroups RemoteActionCompatParcelizer;
    private final createEmptyAdGroups read;

    @setSdkPayload
    public UnrecognizedInputFormatException(createEmptyAdGroups createemptyadgroups, createEmptyAdGroups createemptyadgroups2) {
        toMagicModuleMetaRepoModel.write(createemptyadgroups, "");
        toMagicModuleMetaRepoModel.write(createemptyadgroups2, "");
        this.RemoteActionCompatParcelizer = createemptyadgroups;
        this.read = createemptyadgroups2;
    }

    @Override // kotlin.createEmptyAdGroups
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> RemoteActionCompatParcelizer(final VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(videoBookmarkTimeline);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.WrappingMediaSource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UnrecognizedInputFormatException.RemoteActionCompatParcelizer(this.write, videoBookmarkTimeline, (MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpWrite = accessgetemptystatecpRemoteActionCompatParcelizer.write(new getSubjectTitle() { // from class: o.AdPlaybackState
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return UnrecognizedInputFormatException.IconCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        return accessgetemptystatecpWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (SchemaCompletionStatusRSModel) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel RemoteActionCompatParcelizer(UnrecognizedInputFormatException unrecognizedInputFormatException, VideoBookmarkTimeline videoBookmarkTimeline, MarrowResponse marrowResponse) {
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            accessgetemptystatecpRemoteActionCompatParcelizer = unrecognizedInputFormatException.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(videoBookmarkTimeline);
        } else {
            accessgetemptystatecpRemoteActionCompatParcelizer = accessgetEmptyStatecp.read(marrowResponse);
        }
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel read(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (SchemaCompletionStatusRSModel) getanswermap.invoke(obj);
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> AudioAttributesCompatParcelizer(final VideoBookmarkTimeline videoBookmarkTimeline) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(videoBookmarkTimeline);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.r8lambdacUQ2lpOq050zv7fWt85fuy1Z_sk
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UnrecognizedInputFormatException.AudioAttributesCompatParcelizer(this.read, videoBookmarkTimeline, (MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpWrite = accessgetemptystatecpAudioAttributesCompatParcelizer.write(new getSubjectTitle() { // from class: o.TrackGroupArrayExternalSyntheticLambda0
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return UnrecognizedInputFormatException.read(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        return accessgetemptystatecpWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel AudioAttributesCompatParcelizer(UnrecognizedInputFormatException unrecognizedInputFormatException, VideoBookmarkTimeline videoBookmarkTimeline, MarrowResponse marrowResponse) {
        accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if ((marrowResponse instanceof Success) && ((VideoTimelineResponseBody) ((Success) marrowResponse).getData()).getStatus()) {
            accessgetemptystatecpAudioAttributesCompatParcelizer = unrecognizedInputFormatException.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(videoBookmarkTimeline);
        } else {
            accessgetemptystatecpAudioAttributesCompatParcelizer = accessgetEmptyStatecp.read(marrowResponse);
        }
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> read(VideoBookmarkTimeline videoBookmarkTimeline, int i) {
        toMagicModuleMetaRepoModel.write(videoBookmarkTimeline, "");
        if (i == 0) {
            return AudioAttributesCompatParcelizer(videoBookmarkTimeline);
        }
        return RemoteActionCompatParcelizer(videoBookmarkTimeline);
    }
}
