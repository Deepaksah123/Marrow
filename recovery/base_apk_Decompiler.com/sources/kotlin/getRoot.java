package kotlin;

import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/getRoot;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "read", "RemoteActionCompatParcelizer", "Lo/getRoot$IconCompatParcelizer;", "Lo/getRoot$RemoteActionCompatParcelizer;", "Lo/getRoot$read;", "Lo/getRoot$write;", "Lo/getRoot$AudioAttributesCompatParcelizer;", "Lo/getRoot$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getRoot {

    public static final class AudioAttributesCompatParcelizer extends getRoot {
        private final VideoTimelineItem write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(VideoTimelineItem videoTimelineItem) {
            super(null);
            toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
            this.write = videoTimelineItem;
        }

        public final VideoTimelineItem AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    private getRoot() {
    }

    public static final class write extends getRoot {
        private final VideoTimelineItem AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(VideoTimelineItem videoTimelineItem) {
            super(null);
            toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
            this.AudioAttributesCompatParcelizer = videoTimelineItem;
        }

        public final VideoTimelineItem write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ getRoot(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRoot$IconCompatParcelizer;", "Lo/getRoot;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getRoot {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRoot$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getRoot;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends getRoot {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRoot$read;", "Lo/getRoot;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getRoot {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRoot$RemoteActionCompatParcelizer;", "Lo/getRoot;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getRoot {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
