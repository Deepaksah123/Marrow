package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lo/onDataRangeChanged;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "write", "onCustomAction", "AudioAttributesImplApi26Parcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplBaseParcelizer", "onAddQueueItem", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "MediaBrowserCompatMediaItem", "MediaBrowserCompatCustomActionResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "onCommand", "MediaMetadataCompat", "onPlayFromMediaId", "Lo/onDataRangeChanged$write;", "Lo/onDataRangeChanged$RemoteActionCompatParcelizer;", "Lo/onDataRangeChanged$AudioAttributesCompatParcelizer;", "Lo/onDataRangeChanged$IconCompatParcelizer;", "Lo/onDataRangeChanged$read;", "Lo/onDataRangeChanged$MediaBrowserCompatItemReceiver;", "Lo/onDataRangeChanged$AudioAttributesImplApi26Parcelizer;", "Lo/onDataRangeChanged$MediaBrowserCompatCustomActionResultReceiver;", "Lo/onDataRangeChanged$AudioAttributesImplBaseParcelizer;", "Lo/onDataRangeChanged$AudioAttributesImplApi21Parcelizer;", "Lo/onDataRangeChanged$MediaDescriptionCompat;", "Lo/onDataRangeChanged$RatingCompat;", "Lo/onDataRangeChanged$MediaBrowserCompatMediaItem;", "Lo/onDataRangeChanged$MediaMetadataCompat;", "Lo/onDataRangeChanged$MediaBrowserCompatSearchResultReceiver;", "Lo/onDataRangeChanged$onCustomAction;", "Lo/onDataRangeChanged$handleMediaPlayPauseIfPendingOnHandler;", "Lo/onDataRangeChanged$onCommand;", "Lo/onDataRangeChanged$onAddQueueItem;", "Lo/onDataRangeChanged$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "Lo/onDataRangeChanged$onPlayFromMediaId;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class onDataRangeChanged {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$AudioAttributesCompatParcelizer;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends onDataRangeChanged {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    private onDataRangeChanged() {
    }

    public static final class MediaBrowserCompatItemReceiver extends onDataRangeChanged {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ onDataRangeChanged(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends onDataRangeChanged {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String read() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$RemoteActionCompatParcelizer;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends onDataRangeChanged {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaDescriptionCompat extends onDataRangeChanged {
        private final String IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.read = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$write;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends onDataRangeChanged {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$onCustomAction;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onCustomAction extends onDataRangeChanged {
        public static final onCustomAction INSTANCE = new onCustomAction();

        private onCustomAction() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$AudioAttributesImplApi26Parcelizer;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends onDataRangeChanged {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends onDataRangeChanged {
        public static final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver INSTANCE = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$AudioAttributesImplBaseParcelizer;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends onDataRangeChanged {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$onAddQueueItem;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onAddQueueItem extends onDataRangeChanged {
        public static final onAddQueueItem INSTANCE = new onAddQueueItem();

        private onAddQueueItem() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$MediaBrowserCompatSearchResultReceiver;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends onDataRangeChanged {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$IconCompatParcelizer;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends onDataRangeChanged {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$MediaBrowserCompatMediaItem;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem extends onDataRangeChanged {
        public static final MediaBrowserCompatMediaItem INSTANCE = new MediaBrowserCompatMediaItem();

        private MediaBrowserCompatMediaItem() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$MediaBrowserCompatCustomActionResultReceiver;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends onDataRangeChanged {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$handleMediaPlayPauseIfPendingOnHandler;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class handleMediaPlayPauseIfPendingOnHandler extends onDataRangeChanged {
        public static final handleMediaPlayPauseIfPendingOnHandler INSTANCE = new handleMediaPlayPauseIfPendingOnHandler();

        private handleMediaPlayPauseIfPendingOnHandler() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$RatingCompat;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RatingCompat extends onDataRangeChanged {
        public static final RatingCompat INSTANCE = new RatingCompat();

        private RatingCompat() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends onDataRangeChanged {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class onCommand extends onDataRangeChanged {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onCommand(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }

    public static final class MediaMetadataCompat extends onDataRangeChanged {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onDataRangeChanged$onPlayFromMediaId;", "Lo/onDataRangeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onPlayFromMediaId extends onDataRangeChanged {
        public static final onPlayFromMediaId INSTANCE = new onPlayFromMediaId();

        private onPlayFromMediaId() {
            super(null);
        }
    }
}
