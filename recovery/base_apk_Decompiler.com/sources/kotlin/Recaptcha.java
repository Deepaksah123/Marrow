package kotlin;

import kotlin.Metadata;
import kotlin.isTrafficRestricted;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lo/Recaptcha;", "", "<init>", "()V", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "RatingCompat", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "write", "Lo/Recaptcha$write;", "Lo/Recaptcha$IconCompatParcelizer;", "Lo/Recaptcha$AudioAttributesCompatParcelizer;", "Lo/Recaptcha$read;", "Lo/Recaptcha$RemoteActionCompatParcelizer;", "Lo/Recaptcha$MediaBrowserCompatItemReceiver;", "Lo/Recaptcha$AudioAttributesImplApi26Parcelizer;", "Lo/Recaptcha$MediaBrowserCompatCustomActionResultReceiver;", "Lo/Recaptcha$AudioAttributesImplApi21Parcelizer;", "Lo/Recaptcha$AudioAttributesImplBaseParcelizer;", "Lo/Recaptcha$RatingCompat;", "Lo/Recaptcha$MediaMetadataCompat;", "Lo/Recaptcha$MediaBrowserCompatSearchResultReceiver;", "Lo/Recaptcha$MediaBrowserCompatMediaItem;", "Lo/Recaptcha$MediaDescriptionCompat;", "Lo/Recaptcha$handleMediaPlayPauseIfPendingOnHandler;", "Lo/Recaptcha$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Recaptcha {

    public static final class handleMediaPlayPauseIfPendingOnHandler extends Recaptcha {
        private final int IconCompatParcelizer;

        public handleMediaPlayPauseIfPendingOnHandler(int i) {
            super(null);
            this.IconCompatParcelizer = i;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    private Recaptcha() {
    }

    public static final class MediaBrowserCompatItemReceiver extends Recaptcha {
        private final isTrafficRestricted.AudioAttributesImplApi26Parcelizer write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            this.write = audioAttributesImplApi26Parcelizer;
        }

        public final isTrafficRestricted.AudioAttributesImplApi26Parcelizer read() {
            return this.write;
        }
    }

    public /* synthetic */ Recaptcha(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends Recaptcha {
        private final String AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String write() {
            return this.write;
        }
    }

    public static final class MediaDescriptionCompat extends Recaptcha {
        private final String IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class MediaMetadataCompat extends Recaptcha {
        private final String read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(int i, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = i;
            this.read = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$AudioAttributesCompatParcelizer;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends Recaptcha {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$IconCompatParcelizer;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends Recaptcha {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$read;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends Recaptcha {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$RatingCompat;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RatingCompat extends Recaptcha {
        public static final RatingCompat INSTANCE = new RatingCompat();

        private RatingCompat() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$AudioAttributesImplBaseParcelizer;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends Recaptcha {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$MediaBrowserCompatCustomActionResultReceiver;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends Recaptcha {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$AudioAttributesImplApi26Parcelizer;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends Recaptcha {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$MediaBrowserCompatSearchResultReceiver;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends Recaptcha {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$AudioAttributesImplApi21Parcelizer;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends Recaptcha {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$MediaBrowserCompatMediaItem;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem extends Recaptcha {
        public static final MediaBrowserCompatMediaItem INSTANCE = new MediaBrowserCompatMediaItem();

        private MediaBrowserCompatMediaItem() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Recaptcha$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "Lo/Recaptcha;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends Recaptcha {
        public static final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver INSTANCE = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/Recaptcha$write;", "Lo/Recaptcha;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class write extends Recaptcha {
        public static final write INSTANCE = new write();

        public final int hashCode() {
            return 1788306280;
        }

        private write() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "write";
        }
    }
}
