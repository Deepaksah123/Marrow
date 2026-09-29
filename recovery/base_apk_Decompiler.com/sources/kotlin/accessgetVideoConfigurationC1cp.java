package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class accessgetVideoConfigurationC1cp {
    private static final int IconCompatParcelizer = Runtime.getRuntime().availableProcessors();

    public static final int write() {
        return IconCompatParcelizer;
    }

    public static final String AudioAttributesCompatParcelizer(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
