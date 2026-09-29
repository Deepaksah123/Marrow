package kotlin;

import kotlin.Metadata;
import kotlin.registerDeadlineEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lo/getEventKey;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "write", "read", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "Lo/getEventKey$read;", "Lo/getEventKey$IconCompatParcelizer;", "Lo/getEventKey$write;", "Lo/getEventKey$AudioAttributesCompatParcelizer;", "Lo/getEventKey$RemoteActionCompatParcelizer;", "Lo/getEventKey$AudioAttributesImplBaseParcelizer;", "Lo/getEventKey$AudioAttributesImplApi26Parcelizer;", "Lo/getEventKey$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getEventKey$MediaBrowserCompatItemReceiver;", "Lo/getEventKey$AudioAttributesImplApi21Parcelizer;", "Lo/getEventKey$MediaMetadataCompat;", "Lo/getEventKey$MediaBrowserCompatSearchResultReceiver;", "Lo/getEventKey$RatingCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getEventKey {

    public static final class RemoteActionCompatParcelizer extends getEventKey {
        private final int write;

        public RemoteActionCompatParcelizer(int i) {
            super(null);
            this.write = i;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }
    }

    private getEventKey() {
    }

    public static final class AudioAttributesImplBaseParcelizer extends getEventKey {
        private final boolean write;

        public AudioAttributesImplBaseParcelizer(boolean z) {
            super(null);
            this.write = z;
        }

        public final boolean write() {
            return this.write;
        }
    }

    public /* synthetic */ getEventKey(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RatingCompat extends getEventKey {
        private final int read;

        public RatingCompat(int i) {
            super(null);
            this.read = i;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver extends getEventKey {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatSearchResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class MediaMetadataCompat extends getEventKey {
        private final String IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.read = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEventKey$AudioAttributesCompatParcelizer;", "Lo/getEventKey;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getEventKey {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEventKey$AudioAttributesImplApi26Parcelizer;", "Lo/getEventKey;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends getEventKey {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEventKey$AudioAttributesImplApi21Parcelizer;", "Lo/getEventKey;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends getEventKey {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEventKey$MediaBrowserCompatItemReceiver;", "Lo/getEventKey;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends getEventKey {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    public static final class write extends getEventKey {
        private final boolean AudioAttributesCompatParcelizer;

        public write(boolean z) {
            super(null);
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class read extends getEventKey {
        private final registerDeadlineEvent.RemoteActionCompatParcelizer IconCompatParcelizer;
        private final getModuleData<String, Integer, String, getShowPopup> RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public read(registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, getModuleData<? super String, ? super Integer, ? super String, getShowPopup> getmoduledata) {
            super(null);
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(getmoduledata, "");
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.write = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = getmoduledata;
        }

        public final registerDeadlineEvent.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.write;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        public final getModuleData<String, Integer, String, getShowPopup> RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends getEventKey {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEventKey$IconCompatParcelizer;", "Lo/getEventKey;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getEventKey {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
