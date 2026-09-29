package kotlin;

import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
public enum MetadataDecoderFactory1 implements getDownloadIndex.write {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    private final int IconCompatParcelizer;

    static {
        new Object() { // from class: o.MetadataDecoderFactory1.2
        };
    }

    @Override // o.getDownloadIndex.write
    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static MetadataDecoderFactory1 read(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static getDownloadIndex.AudioAttributesCompatParcelizer write() {
        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer implements getDownloadIndex.AudioAttributesCompatParcelizer {
        static final getDownloadIndex.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    MetadataDecoderFactory1(int i) {
        this.IconCompatParcelizer = i;
    }
}
