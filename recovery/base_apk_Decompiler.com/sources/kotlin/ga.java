package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class ga {
    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("InputMerger"), "");
    }

    public static final gb AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            toMagicModuleMetaRepoModel.read(objNewInstance, "");
            return (gb) objNewInstance;
        } catch (Exception e) {
            n.write();
            return null;
        }
    }
}
