package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/zaJ;", "", "<init>", "()V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "write", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/zaJ$read;", "Lo/zaJ$AudioAttributesCompatParcelizer;", "Lo/zaJ$write;", "Lo/zaJ$IconCompatParcelizer;", "Lo/zaJ$RemoteActionCompatParcelizer;", "Lo/zaJ$MediaBrowserCompatItemReceiver;", "Lo/zaJ$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zaJ {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaJ$MediaBrowserCompatItemReceiver;", "Lo/zaJ;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends zaJ {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    private zaJ() {
    }

    public static final class AudioAttributesImplApi21Parcelizer extends zaJ {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ zaJ(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaJ$write;", "Lo/zaJ;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zaJ {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaJ$IconCompatParcelizer;", "Lo/zaJ;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends zaJ {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class read extends zaJ {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaJ$AudioAttributesCompatParcelizer;", "Lo/zaJ;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends zaJ {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends zaJ {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
