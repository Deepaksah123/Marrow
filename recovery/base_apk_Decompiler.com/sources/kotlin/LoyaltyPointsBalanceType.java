package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lo/LoyaltyPointsBalanceType;", "", "<init>", "()V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "RatingCompat", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "MediaMetadataCompat", "read", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/LoyaltyPointsBalanceType$RemoteActionCompatParcelizer;", "Lo/LoyaltyPointsBalanceType$AudioAttributesCompatParcelizer;", "Lo/LoyaltyPointsBalanceType$read;", "Lo/LoyaltyPointsBalanceType$IconCompatParcelizer;", "Lo/LoyaltyPointsBalanceType$write;", "Lo/LoyaltyPointsBalanceType$MediaBrowserCompatCustomActionResultReceiver;", "Lo/LoyaltyPointsBalanceType$MediaBrowserCompatItemReceiver;", "Lo/LoyaltyPointsBalanceType$AudioAttributesImplApi26Parcelizer;", "Lo/LoyaltyPointsBalanceType$AudioAttributesImplBaseParcelizer;", "Lo/LoyaltyPointsBalanceType$AudioAttributesImplApi21Parcelizer;", "Lo/LoyaltyPointsBalanceType$MediaBrowserCompatMediaItem;", "Lo/LoyaltyPointsBalanceType$RatingCompat;", "Lo/LoyaltyPointsBalanceType$MediaMetadataCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoyaltyPointsBalanceType {

    public static final class AudioAttributesImplApi21Parcelizer extends LoyaltyPointsBalanceType {
        private final int RemoteActionCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer(int i) {
            super(null);
            this.RemoteActionCompatParcelizer = i;
        }

        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private LoyaltyPointsBalanceType() {
    }

    public /* synthetic */ LoyaltyPointsBalanceType(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$MediaBrowserCompatMediaItem;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem extends LoyaltyPointsBalanceType {
        public static final MediaBrowserCompatMediaItem INSTANCE = new MediaBrowserCompatMediaItem();

        private MediaBrowserCompatMediaItem() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends LoyaltyPointsBalanceType {
        private final getBigEndianInt AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(getBigEndianInt getbigendianint) {
            super(null);
            toMagicModuleMetaRepoModel.write(getbigendianint, "");
            this.AudioAttributesCompatParcelizer = getbigendianint;
        }

        public final getBigEndianInt IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$AudioAttributesImplBaseParcelizer;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends LoyaltyPointsBalanceType {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$RatingCompat;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RatingCompat extends LoyaltyPointsBalanceType {
        public static final RatingCompat INSTANCE = new RatingCompat();

        private RatingCompat() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$MediaBrowserCompatCustomActionResultReceiver;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends LoyaltyPointsBalanceType {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends LoyaltyPointsBalanceType {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String write() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$AudioAttributesCompatParcelizer;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends LoyaltyPointsBalanceType {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$write;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends LoyaltyPointsBalanceType {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class MediaMetadataCompat extends LoyaltyPointsBalanceType {
        private final int IconCompatParcelizer;

        public MediaMetadataCompat(int i) {
            super(null);
            this.IconCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$read;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends LoyaltyPointsBalanceType {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/LoyaltyPointsBalanceType$IconCompatParcelizer;", "Lo/LoyaltyPointsBalanceType;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends LoyaltyPointsBalanceType {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends LoyaltyPointsBalanceType {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }
}
