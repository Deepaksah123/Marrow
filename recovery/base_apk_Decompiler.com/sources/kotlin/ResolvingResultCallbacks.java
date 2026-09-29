package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/ResolvingResultCallbacks;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "IconCompatParcelizer", "Lo/ResolvingResultCallbacks$write;", "Lo/ResolvingResultCallbacks$AudioAttributesCompatParcelizer;", "Lo/ResolvingResultCallbacks$IconCompatParcelizer;", "Lo/ResolvingResultCallbacks$RemoteActionCompatParcelizer;", "Lo/ResolvingResultCallbacks$read;", "Lo/ResolvingResultCallbacks$AudioAttributesImplBaseParcelizer;", "Lo/ResolvingResultCallbacks$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ResolvingResultCallbacks {
    private ResolvingResultCallbacks() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ResolvingResultCallbacks$AudioAttributesCompatParcelizer;", "Lo/ResolvingResultCallbacks;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends ResolvingResultCallbacks {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ ResolvingResultCallbacks(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ResolvingResultCallbacks$MediaBrowserCompatCustomActionResultReceiver;", "Lo/ResolvingResultCallbacks;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends ResolvingResultCallbacks {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ResolvingResultCallbacks$write;", "Lo/ResolvingResultCallbacks;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends ResolvingResultCallbacks {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends ResolvingResultCallbacks {
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2, String str3) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends ResolvingResultCallbacks {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class read extends ResolvingResultCallbacks {
        private final String AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, String str2, String str3, String str4, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
            this.write = str3;
            this.RemoteActionCompatParcelizer = str4;
            this.IconCompatParcelizer = z;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean write() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ResolvingResultCallbacks$IconCompatParcelizer;", "Lo/ResolvingResultCallbacks;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends ResolvingResultCallbacks {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
