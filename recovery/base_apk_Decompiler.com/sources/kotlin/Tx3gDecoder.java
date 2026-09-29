package kotlin;

import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes5.dex */
public final class Tx3gDecoder extends SequenceSerializer.RemoteActionCompatParcelizer<VideoTimelineItem> {
    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(VideoTimelineItem videoTimelineItem, VideoTimelineItem videoTimelineItem2) {
        return read2(videoTimelineItem, videoTimelineItem2);
    }

    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean read(VideoTimelineItem videoTimelineItem, VideoTimelineItem videoTimelineItem2) {
        return write(videoTimelineItem, videoTimelineItem2);
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private static boolean read2(VideoTimelineItem videoTimelineItem, VideoTimelineItem videoTimelineItem2) {
        toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
        toMagicModuleMetaRepoModel.write(videoTimelineItem2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) videoTimelineItem.getRemoteActionCompatParcelizer().getTimelineId(), (Object) videoTimelineItem2.getRemoteActionCompatParcelizer().getTimelineId()) && videoTimelineItem.getRemoteActionCompatParcelizer().getBookmarkType() == videoTimelineItem2.getRemoteActionCompatParcelizer().getBookmarkType();
    }

    private static boolean write(VideoTimelineItem videoTimelineItem, VideoTimelineItem videoTimelineItem2) {
        toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
        toMagicModuleMetaRepoModel.write(videoTimelineItem2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(videoTimelineItem, videoTimelineItem2);
    }
}
