package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface McqPearlInfo {
    boolean read();

    public static final class AudioAttributesCompatParcelizer implements McqPearlInfo {
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.McqPearlInfo
        public final boolean read() {
            return false;
        }

        private AudioAttributesCompatParcelizer() {
        }
    }
}
