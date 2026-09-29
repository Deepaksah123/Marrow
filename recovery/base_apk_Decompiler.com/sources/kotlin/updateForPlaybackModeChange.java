package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface updateForPlaybackModeChange {
    updateForPlaybackModeChange AudioAttributesCompatParcelizer();

    boolean AudioAttributesCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder);

    void AudioAttributesImplApi26Parcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder);

    boolean IconCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder);

    boolean RemoteActionCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder);

    void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder);

    boolean write();

    public enum write {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean AudioAttributesImplApi21Parcelizer;

        write(boolean z) {
            this.AudioAttributesImplApi21Parcelizer = z;
        }

        final boolean read() {
            return this.AudioAttributesImplApi21Parcelizer;
        }
    }
}
