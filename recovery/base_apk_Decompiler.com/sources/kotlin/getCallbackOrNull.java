package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lo/getCallbackOrNull;", "", "<init>", "()V", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "Lo/getCallbackOrNull$write;", "Lo/getCallbackOrNull$IconCompatParcelizer;", "Lo/getCallbackOrNull$read;", "Lo/getCallbackOrNull$AudioAttributesCompatParcelizer;", "Lo/getCallbackOrNull$RemoteActionCompatParcelizer;", "Lo/getCallbackOrNull$AudioAttributesImplApi26Parcelizer;", "Lo/getCallbackOrNull$MediaBrowserCompatItemReceiver;", "Lo/getCallbackOrNull$AudioAttributesImplBaseParcelizer;", "Lo/getCallbackOrNull$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getCallbackOrNull$AudioAttributesImplApi21Parcelizer;", "Lo/getCallbackOrNull$MediaBrowserCompatMediaItem;", "Lo/getCallbackOrNull$MediaBrowserCompatSearchResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getCallbackOrNull {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$write;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getCallbackOrNull {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private getCallbackOrNull() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$IconCompatParcelizer;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getCallbackOrNull {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ getCallbackOrNull(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$AudioAttributesCompatParcelizer;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getCallbackOrNull {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends getCallbackOrNull {
        private final int write;

        public AudioAttributesImplApi26Parcelizer(int i) {
            super(null);
            this.write = i;
        }

        public final int read() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$RemoteActionCompatParcelizer;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getCallbackOrNull {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends getCallbackOrNull {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final boolean read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str, String str2, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.read = z;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean read() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$read;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getCallbackOrNull {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends getCallbackOrNull {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$AudioAttributesImplApi21Parcelizer;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends getCallbackOrNull {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends getCallbackOrNull {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatMediaItem extends getCallbackOrNull {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getCallbackOrNull$MediaBrowserCompatSearchResultReceiver;", "Lo/getCallbackOrNull;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends getCallbackOrNull {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }
    }
}
