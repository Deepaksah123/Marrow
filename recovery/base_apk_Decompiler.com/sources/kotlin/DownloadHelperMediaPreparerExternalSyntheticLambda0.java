package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadHelperMediaPreparerExternalSyntheticLambda0 {
    private static Class<?> write = RemoteActionCompatParcelizer();

    DownloadHelperMediaPreparerExternalSyntheticLambda0() {
    }

    private static Class<?> RemoteActionCompatParcelizer() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static mergeRequest write() {
        mergeRequest mergerequestIconCompatParcelizer = IconCompatParcelizer("getEmptyRegistry");
        return mergerequestIconCompatParcelizer != null ? mergerequestIconCompatParcelizer : mergeRequest.write;
    }

    private static final mergeRequest IconCompatParcelizer(String str) {
        Class<?> cls = write;
        if (cls == null) {
            return null;
        }
        try {
            return (mergeRequest) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
