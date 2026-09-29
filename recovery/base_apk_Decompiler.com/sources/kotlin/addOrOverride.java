package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class addOrOverride {
    private static Class<?> write = AudioAttributesCompatParcelizer();

    addOrOverride() {
    }

    private static Class<?> AudioAttributesCompatParcelizer() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static asAnnotations IconCompatParcelizer() {
        if (write != null) {
            try {
                return IconCompatParcelizer("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return asAnnotations.write;
    }

    private static final asAnnotations IconCompatParcelizer(String str) throws Exception {
        return (asAnnotations) write.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
