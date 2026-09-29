package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lo/setCurrencyCode;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "read", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setCurrencyCode$write;", "Lo/setCurrencyCode$AudioAttributesCompatParcelizer;", "Lo/setCurrencyCode$IconCompatParcelizer;", "Lo/setCurrencyCode$read;", "Lo/setCurrencyCode$RemoteActionCompatParcelizer;", "Lo/setCurrencyCode$AudioAttributesImplApi21Parcelizer;", "Lo/setCurrencyCode$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setCurrencyCode$MediaBrowserCompatItemReceiver;", "Lo/setCurrencyCode$AudioAttributesImplApi26Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setCurrencyCode {

    public static final class MediaBrowserCompatCustomActionResultReceiver extends setCurrencyCode {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private setCurrencyCode() {
    }

    public static final class IconCompatParcelizer extends setCurrencyCode {
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final String write() {
            return this.write;
        }
    }

    public /* synthetic */ setCurrencyCode(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends setCurrencyCode {
        private final String IconCompatParcelizer;
        private final boolean read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.read = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends setCurrencyCode {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setCurrencyCode$AudioAttributesImplApi26Parcelizer;", "Lo/setCurrencyCode;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends setCurrencyCode {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setCurrencyCode$MediaBrowserCompatItemReceiver;", "Lo/setCurrencyCode;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends setCurrencyCode {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setCurrencyCode$write;", "Lo/setCurrencyCode;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setCurrencyCode {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setCurrencyCode$AudioAttributesCompatParcelizer;", "Lo/setCurrencyCode;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setCurrencyCode {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends setCurrencyCode {
        private final String AudioAttributesCompatParcelizer;
        private final Wallet IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, Wallet wallet) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(wallet, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = wallet;
        }

        public final Wallet AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
