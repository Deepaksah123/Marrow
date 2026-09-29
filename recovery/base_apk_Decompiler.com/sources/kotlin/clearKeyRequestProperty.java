package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class clearKeyRequestProperty {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    static {
        new read().RemoteActionCompatParcelizer();
    }

    clearKeyRequestProperty(long j, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public static read IconCompatParcelizer() {
        return new read();
    }

    public final long read() {
        return this.IconCompatParcelizer;
    }

    public final AudioAttributesCompatParcelizer write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class read {
        private long IconCompatParcelizer = 0;
        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.REASON_UNKNOWN;

        read() {
        }

        public final clearKeyRequestProperty RemoteActionCompatParcelizer() {
            return new clearKeyRequestProperty(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }

        public final read AudioAttributesCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
            return this;
        }

        public final read RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            return this;
        }
    }

    public enum AudioAttributesCompatParcelizer implements AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int AudioAttributesImplApi21Parcelizer;

        AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1
        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }
    }
}
