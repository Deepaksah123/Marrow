package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lo/zzdx;", "", "<init>", "()V", "IconCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "Lo/zzdx$AudioAttributesCompatParcelizer;", "Lo/zzdx$RemoteActionCompatParcelizer;", "Lo/zzdx$IconCompatParcelizer;", "Lo/zzdx$write;", "Lo/zzdx$read;", "Lo/zzdx$AudioAttributesImplBaseParcelizer;", "Lo/zzdx$MediaBrowserCompatItemReceiver;", "Lo/zzdx$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzdx {

    public static final class IconCompatParcelizer extends zzdx {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    private zzdx() {
    }

    public /* synthetic */ zzdx(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends zzdx {
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = i;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends zzdx {
        private final String RemoteActionCompatParcelizer;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = i;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzdx$AudioAttributesCompatParcelizer;", "Lo/zzdx;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends zzdx {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends zzdx {
        private final readBlockToCache IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final int read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str, String str2, int i, readBlockToCache readblocktocache) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
            this.read = i;
            this.IconCompatParcelizer = readblocktocache;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        public final readBlockToCache write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class write extends zzdx {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzdx$MediaBrowserCompatItemReceiver;", "Lo/zzdx;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends zzdx {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzdx$RemoteActionCompatParcelizer;", "Lo/zzdx;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends zzdx {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
