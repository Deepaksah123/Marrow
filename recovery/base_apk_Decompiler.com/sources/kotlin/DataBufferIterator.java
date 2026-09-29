package kotlin;

import com.marrow.data.api.models.response.plan.UpgradePlanResponse;
import kotlin.Metadata;
import kotlin.setLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lo/DataBufferIterator;", "", "<init>", "()V", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "IconCompatParcelizer", "MediaBrowserCompatMediaItem", "onCommand", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "write", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaDescriptionCompat", "onAddQueueItem", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/DataBufferIterator$read;", "Lo/DataBufferIterator$AudioAttributesCompatParcelizer;", "Lo/DataBufferIterator$IconCompatParcelizer;", "Lo/DataBufferIterator$write;", "Lo/DataBufferIterator$RemoteActionCompatParcelizer;", "Lo/DataBufferIterator$AudioAttributesImplBaseParcelizer;", "Lo/DataBufferIterator$AudioAttributesImplApi26Parcelizer;", "Lo/DataBufferIterator$MediaBrowserCompatCustomActionResultReceiver;", "Lo/DataBufferIterator$MediaBrowserCompatItemReceiver;", "Lo/DataBufferIterator$AudioAttributesImplApi21Parcelizer;", "Lo/DataBufferIterator$RatingCompat;", "Lo/DataBufferIterator$MediaMetadataCompat;", "Lo/DataBufferIterator$MediaBrowserCompatSearchResultReceiver;", "Lo/DataBufferIterator$MediaBrowserCompatMediaItem;", "Lo/DataBufferIterator$MediaDescriptionCompat;", "Lo/DataBufferIterator$onAddQueueItem;", "Lo/DataBufferIterator$onCommand;", "Lo/DataBufferIterator$handleMediaPlayPauseIfPendingOnHandler;", "Lo/DataBufferIterator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DataBufferIterator {

    public static final class MediaBrowserCompatItemReceiver extends DataBufferIterator {
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

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private DataBufferIterator() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$MediaMetadataCompat;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaMetadataCompat extends DataBufferIterator {
        public static final MediaMetadataCompat INSTANCE = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super(null);
        }
    }

    public /* synthetic */ DataBufferIterator(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$AudioAttributesCompatParcelizer;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends DataBufferIterator {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends DataBufferIterator {
        private final boolean IconCompatParcelizer;

        public handleMediaPlayPauseIfPendingOnHandler(boolean z) {
            super(null);
            this.IconCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$IconCompatParcelizer;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends DataBufferIterator {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatMediaItem extends DataBufferIterator {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$onCommand;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onCommand extends DataBufferIterator {
        public static final onCommand INSTANCE = new onCommand();

        private onCommand() {
            super(null);
        }
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends DataBufferIterator {
        private final UpgradePlanResponse write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(UpgradePlanResponse upgradePlanResponse) {
            super(null);
            toMagicModuleMetaRepoModel.write(upgradePlanResponse, "");
            this.write = upgradePlanResponse;
        }

        public final UpgradePlanResponse AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public static final class write extends DataBufferIterator {
        private final boolean AudioAttributesCompatParcelizer;

        public write(boolean z) {
            super(null);
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/DataBufferIterator$RemoteActionCompatParcelizer;", "Lo/DataBufferIterator;", "", "p0", "<init>", "(I)V", "write", "I", "RemoteActionCompatParcelizer", "()I"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends DataBufferIterator {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(int i) {
            super(null);
            this.RemoteActionCompatParcelizer = i;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public RemoteActionCompatParcelizer() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/DataBufferIterator$AudioAttributesImplBaseParcelizer;", "Lo/DataBufferIterator;", "", "p0", "<init>", "(I)V", "read", "I", "write", "()I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends DataBufferIterator {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        public AudioAttributesImplBaseParcelizer(int i) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
        }

        public /* synthetic */ AudioAttributesImplBaseParcelizer(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public AudioAttributesImplBaseParcelizer() {
            this(0, 1, null);
        }
    }

    public static final class MediaDescriptionCompat extends DataBufferIterator {
        private final long AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(String str, int i, String str2, String str3, int i2, long j) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.IconCompatParcelizer = str;
            this.write = i;
            this.read = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.AudioAttributesImplApi26Parcelizer = i2;
            this.AudioAttributesCompatParcelizer = j;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final long IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$onAddQueueItem;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class onAddQueueItem extends DataBufferIterator {
        public static final onAddQueueItem INSTANCE = new onAddQueueItem();

        private onAddQueueItem() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$read;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends DataBufferIterator {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferIterator$MediaBrowserCompatCustomActionResultReceiver;", "Lo/DataBufferIterator;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends DataBufferIterator {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends DataBufferIterator {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class RatingCompat extends DataBufferIterator {
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final boolean read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingCompat(String str, boolean z, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.read = z;
            this.IconCompatParcelizer = str2;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends DataBufferIterator {
        private final int RemoteActionCompatParcelizer;

        public AudioAttributesImplApi26Parcelizer() {
            super(null);
            this.RemoteActionCompatParcelizer = 2;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver extends DataBufferIterator {
        private final setLogger.write RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatSearchResultReceiver(setLogger.write writeVar) {
            super(null);
            toMagicModuleMetaRepoModel.write(writeVar, "");
            this.RemoteActionCompatParcelizer = writeVar;
        }

        public final setLogger.write read() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
