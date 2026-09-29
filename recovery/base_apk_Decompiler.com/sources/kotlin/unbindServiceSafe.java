package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lo/unbindServiceSafe;", "", "<init>", "()V", "read", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "Lo/unbindServiceSafe$IconCompatParcelizer;", "Lo/unbindServiceSafe$read;", "Lo/unbindServiceSafe$RemoteActionCompatParcelizer;", "Lo/unbindServiceSafe$write;", "Lo/unbindServiceSafe$AudioAttributesCompatParcelizer;", "Lo/unbindServiceSafe$MediaBrowserCompatItemReceiver;", "Lo/unbindServiceSafe$AudioAttributesImplApi26Parcelizer;", "Lo/unbindServiceSafe$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class unbindServiceSafe {

    public static final class read extends unbindServiceSafe {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    private unbindServiceSafe() {
    }

    public static final class RemoteActionCompatParcelizer extends unbindServiceSafe {
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.read = str2;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.read;
        }
    }

    public /* synthetic */ unbindServiceSafe(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unbindServiceSafe$write;", "Lo/unbindServiceSafe;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends unbindServiceSafe {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class AudioAttributesCompatParcelizer extends unbindServiceSafe {
        private final AndroidUtilsLight read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(AndroidUtilsLight androidUtilsLight) {
            super(null);
            toMagicModuleMetaRepoModel.write(androidUtilsLight, "");
            this.read = androidUtilsLight;
        }

        public final AndroidUtilsLight write() {
            return this.read;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends unbindServiceSafe {
        private final boolean IconCompatParcelizer;

        public MediaBrowserCompatCustomActionResultReceiver(boolean z) {
            super(null);
            this.IconCompatParcelizer = z;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unbindServiceSafe$MediaBrowserCompatItemReceiver;", "Lo/unbindServiceSafe;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends unbindServiceSafe {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends unbindServiceSafe {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String read() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unbindServiceSafe$IconCompatParcelizer;", "Lo/unbindServiceSafe;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends unbindServiceSafe {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
