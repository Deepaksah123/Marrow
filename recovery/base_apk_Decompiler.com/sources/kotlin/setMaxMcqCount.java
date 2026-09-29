package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface setMaxMcqCount extends setShowLegalPopup {
    void AudioAttributesCompatParcelizer(Throwable th);

    public static final class read implements setMaxMcqCount {
        private final getAnswerMap<Throwable, getShowPopup> read;

        /* JADX WARN: Multi-variable type inference failed */
        public read(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
            this.read = getanswermap;
        }

        @Override // kotlin.setMaxMcqCount
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            this.read.invoke(th);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelHandler.UserSupplied[");
            sb.append(isVerified.read(this.read));
            sb.append('@');
            sb.append(isVerified.IconCompatParcelizer(this));
            sb.append(']');
            return sb.toString();
        }
    }
}
