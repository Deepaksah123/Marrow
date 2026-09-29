package kotlin;

import kotlin.AbstractC0251zzar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lo/fromBytes;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "read", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "Lo/fromBytes$RemoteActionCompatParcelizer;", "Lo/fromBytes$read;", "Lo/fromBytes$write;", "Lo/fromBytes$IconCompatParcelizer;", "Lo/fromBytes$AudioAttributesCompatParcelizer;", "Lo/fromBytes$AudioAttributesImplApi21Parcelizer;", "Lo/fromBytes$AudioAttributesImplApi26Parcelizer;", "Lo/fromBytes$AudioAttributesImplBaseParcelizer;", "Lo/fromBytes$MediaBrowserCompatItemReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class fromBytes {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromBytes$IconCompatParcelizer;", "Lo/fromBytes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends fromBytes {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    private fromBytes() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromBytes$AudioAttributesImplApi21Parcelizer;", "Lo/fromBytes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends fromBytes {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    public /* synthetic */ fromBytes(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends fromBytes {
        private final int AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(int i) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends fromBytes {
        private final int RemoteActionCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(int i, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = i;
            this.write = str;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends fromBytes {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromBytes$read;", "Lo/fromBytes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends fromBytes {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromBytes$write;", "Lo/fromBytes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends fromBytes {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromBytes$MediaBrowserCompatItemReceiver;", "Lo/fromBytes;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends fromBytes {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    public static final class AudioAttributesCompatParcelizer extends fromBytes {
        private final AbstractC0251zzar.MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            super(null);
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
            this.AudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver;
        }

        public final AbstractC0251zzar.MediaBrowserCompatItemReceiver read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
