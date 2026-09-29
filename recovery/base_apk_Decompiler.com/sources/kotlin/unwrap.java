package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/unwrap;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "write", "Lo/unwrap$IconCompatParcelizer;", "Lo/unwrap$AudioAttributesCompatParcelizer;", "Lo/unwrap$RemoteActionCompatParcelizer;", "Lo/unwrap$read;", "Lo/unwrap$write;", "Lo/unwrap$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class unwrap {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unwrap$RemoteActionCompatParcelizer;", "Lo/unwrap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends unwrap {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    private unwrap() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unwrap$MediaBrowserCompatCustomActionResultReceiver;", "Lo/unwrap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends unwrap {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    public /* synthetic */ unwrap(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unwrap$AudioAttributesCompatParcelizer;", "Lo/unwrap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends unwrap {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends unwrap {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class read extends unwrap {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String read() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/unwrap$write;", "Lo/unwrap;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends unwrap {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
