package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/setFontFamily;", "", "<init>", "()V", "write", "read", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setFontFamily$write;", "Lo/setFontFamily$AudioAttributesCompatParcelizer;", "Lo/setFontFamily$read;", "Lo/setFontFamily$IconCompatParcelizer;", "Lo/setFontFamily$RemoteActionCompatParcelizer;", "Lo/setFontFamily$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setFontFamily {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setFontFamily$write;", "Lo/setFontFamily;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setFontFamily {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private setFontFamily() {
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class read extends setFontFamily {
        private final String IconCompatParcelizer;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.write = i;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }
    }

    public /* synthetic */ setFontFamily(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setFontFamily$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setFontFamily;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends setFontFamily {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class IconCompatParcelizer extends setFontFamily {
        private final int IconCompatParcelizer;

        public IconCompatParcelizer(int i) {
            super(null);
            this.IconCompatParcelizer = i;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setFontFamily$AudioAttributesCompatParcelizer;", "Lo/setFontFamily;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setFontFamily {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class RemoteActionCompatParcelizer extends setFontFamily {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
