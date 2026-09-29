package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface getStreetViewPanorama {

    public static final class AudioAttributesCompatParcelizer implements getStreetViewPanorama {
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanorama$RemoteActionCompatParcelizer;", "Lo/getStreetViewPanorama;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements getStreetViewPanorama {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanorama$IconCompatParcelizer;", "Lo/getStreetViewPanorama;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements getStreetViewPanorama {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStreetViewPanorama$read;", "Lo/getStreetViewPanorama;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements getStreetViewPanorama {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    public static final class write implements getStreetViewPanorama {
        private final getStreetViewPanoramaLocation IconCompatParcelizer;

        public write(getStreetViewPanoramaLocation getstreetviewpanoramalocation) {
            toMagicModuleMetaRepoModel.write(getstreetviewpanoramalocation, "");
            this.IconCompatParcelizer = getstreetviewpanoramalocation;
        }

        public final getStreetViewPanoramaLocation read() {
            return this.IconCompatParcelizer;
        }
    }
}
