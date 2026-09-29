package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getMsInterimHtmlEndTime {
    public static final Class<?> write(ClassLoader classLoader, String str) {
        toMagicModuleMetaRepoModel.write(classLoader, "");
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
