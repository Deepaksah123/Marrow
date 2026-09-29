package kotlin;

/* JADX INFO: loaded from: classes.dex */
public interface LatmReader {
    IconCompatParcelizer read();

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class IconCompatParcelizer {
        public abstract String AudioAttributesCompatParcelizer();

        public abstract String IconCompatParcelizer();

        public static IconCompatParcelizer write(String str) {
            return IconCompatParcelizer(str, null);
        }

        static IconCompatParcelizer IconCompatParcelizer(String str, String str2) {
            return new H264Reader1(str, str2);
        }
    }
}
