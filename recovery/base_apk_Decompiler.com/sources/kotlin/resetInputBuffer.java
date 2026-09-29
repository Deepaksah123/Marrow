package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class resetInputBuffer {
    private final processOutputMediaFormatChanged RemoteActionCompatParcelizer;

    static {
        new read().RemoteActionCompatParcelizer();
    }

    resetInputBuffer(processOutputMediaFormatChanged processoutputmediaformatchanged) {
        this.RemoteActionCompatParcelizer = processoutputmediaformatchanged;
    }

    public final byte[] AudioAttributesCompatParcelizer() {
        return codecAdaptationWorkaroundMode.AudioAttributesCompatParcelizer(this);
    }

    public static read RemoteActionCompatParcelizer() {
        return new read();
    }

    public final processOutputMediaFormatChanged read() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class read {
        private processOutputMediaFormatChanged write = null;

        read() {
        }

        public final resetInputBuffer RemoteActionCompatParcelizer() {
            return new resetInputBuffer(this.write);
        }

        public final read IconCompatParcelizer(processOutputMediaFormatChanged processoutputmediaformatchanged) {
            this.write = processoutputmediaformatchanged;
            return this;
        }
    }
}
