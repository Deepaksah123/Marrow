package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setActiveEdition {
    public static final RuntimeException IconCompatParcelizer(Throwable th) throws Throwable {
        toMagicModuleMetaRepoModel.write(th, "");
        throw th;
    }

    public static final boolean write(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        Class<?> superclass = th.getClass();
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) superclass.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }
}
