package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface PatternItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/PatternItem$read;", "Lo/PatternItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements PatternItem {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements PatternItem {
        private final String write;

        public AudioAttributesImplApi21Parcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public static final class IconCompatParcelizer implements PatternItem {
        private final String IconCompatParcelizer;

        public IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/PatternItem$MediaBrowserCompatCustomActionResultReceiver;", "Lo/PatternItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver implements PatternItem {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/PatternItem$RemoteActionCompatParcelizer;", "Lo/PatternItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements PatternItem {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/PatternItem$write;", "Lo/PatternItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements PatternItem {
        public static final write INSTANCE = new write();

        private write() {
        }
    }

    public static final class AudioAttributesCompatParcelizer implements PatternItem {
        private final String read;

        public AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }
}
