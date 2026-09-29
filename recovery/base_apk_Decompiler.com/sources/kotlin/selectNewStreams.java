package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.models.subject.SubjectFilterModel;
import com.marrow.data.models.video.Timeline;
import java.util.List;
import kotlin.newSampleStreamArray;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class selectNewStreams implements newSampleStreamArray {
    private final newSampleStreamArray.IconCompatParcelizer write;

    @setSdkPayload
    public selectNewStreams(newSampleStreamArray.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.write = iconCompatParcelizer;
    }

    @Override // kotlin.newSampleStreamArray
    public final accessgetEmptyStatecp<SubjectFilterModel[]> write() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.newSampleStreamArray
    public final int read() {
        return this.write.write();
    }

    @Override // kotlin.newSampleStreamArray
    public final int RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.newSampleStreamArray
    public final accessgetEmptyStatecp<VideoBookmarkTimelineModel[]> read(final String str) {
        accessgetEmptyStatecp<VideoBookmarkTimelineModel[]> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.releaseOrphanEmbeddedStreams
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return selectNewStreams.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, str);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoBookmarkTimelineModel[] AudioAttributesCompatParcelizer(selectNewStreams selectnewstreams, String str) {
        return selectnewstreams.write.IconCompatParcelizer(str);
    }

    @Override // kotlin.newSampleStreamArray
    public final VideoBookmarkTimeline write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.write.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.newSampleStreamArray
    public final void IconCompatParcelizer() {
        this.write.IconCompatParcelizer();
    }

    @Override // kotlin.newSampleStreamArray
    public final List<Timeline> AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Timeline[] timelineArrRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str);
        if (timelineArrRemoteActionCompatParcelizer == null) {
            timelineArrRemoteActionCompatParcelizer = new Timeline[0];
        }
        return getOrderDetails.onCommand(timelineArrRemoteActionCompatParcelizer);
    }
}
