package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getScore {

    public enum AudioAttributesCompatParcelizer {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");

        private String AudioAttributesImplApi21Parcelizer;

        AudioAttributesCompatParcelizer(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.AudioAttributesImplApi21Parcelizer;
        }
    }

    public enum read {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");

        private String AudioAttributesImplBaseParcelizer;

        read(String str) {
            this.AudioAttributesImplBaseParcelizer = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.AudioAttributesImplBaseParcelizer;
        }
    }
}
