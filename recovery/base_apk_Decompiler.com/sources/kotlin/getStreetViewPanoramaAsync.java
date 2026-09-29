package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/getStreetViewPanoramaAsync;", "", "<init>", "()V", "read", "AudioAttributesImplApi21Parcelizer", "write", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/getStreetViewPanoramaAsync$RemoteActionCompatParcelizer;", "Lo/getStreetViewPanoramaAsync$read;", "Lo/getStreetViewPanoramaAsync$write;", "Lo/getStreetViewPanoramaAsync$AudioAttributesCompatParcelizer;", "Lo/getStreetViewPanoramaAsync$IconCompatParcelizer;", "Lo/getStreetViewPanoramaAsync$AudioAttributesImplBaseParcelizer;", "Lo/getStreetViewPanoramaAsync$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getStreetViewPanoramaAsync {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanoramaAsync$read;", "Lo/getStreetViewPanoramaAsync;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getStreetViewPanoramaAsync {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    private getStreetViewPanoramaAsync() {
    }

    public static final class AudioAttributesImplApi21Parcelizer extends getStreetViewPanoramaAsync {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public /* synthetic */ getStreetViewPanoramaAsync(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class write extends getStreetViewPanoramaAsync {
        private final int write;

        public write(int i) {
            super(null);
            this.write = i;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanoramaAsync$AudioAttributesCompatParcelizer;", "Lo/getStreetViewPanoramaAsync;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getStreetViewPanoramaAsync {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends getStreetViewPanoramaAsync {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanoramaAsync$IconCompatParcelizer;", "Lo/getStreetViewPanoramaAsync;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getStreetViewPanoramaAsync {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanoramaAsync$RemoteActionCompatParcelizer;", "Lo/getStreetViewPanoramaAsync;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getStreetViewPanoramaAsync {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
