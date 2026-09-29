package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSchemeDataSource {
    public static final long IconCompatParcelizer(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
