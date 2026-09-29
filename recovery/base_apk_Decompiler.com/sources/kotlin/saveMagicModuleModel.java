package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class saveMagicModuleModel {
    public static final MagicModuleLocalImpl write;

    static {
        saveMagicModuleStats savemagicmodulestats = new saveMagicModuleStats();
        try {
            write = savemagicmodulestats;
        } catch (ClassCastException e) {
            ClassLoader classLoader = savemagicmodulestats.getClass().getClassLoader();
            ClassLoader classLoader2 = MagicModuleLocalImpl.class.getClassLoader();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(classLoader, classLoader2)) {
                throw e;
            }
            StringBuilder sb = new StringBuilder("Instance class was loaded from a different classloader: ");
            sb.append(classLoader);
            sb.append(", base type classloader: ");
            sb.append(classLoader2);
            throw new ClassNotFoundException(sb.toString(), e);
        }
    }
}
