package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setExtraTopOffset {
    /* JADX INFO: Access modifiers changed from: private */
    public static <T, C> T RemoteActionCompatParcelizer(Class<C> cls, String str) {
        String name;
        String string;
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Package r1 = cls.getPackage();
        if (r1 == null || (name = r1.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        toMagicModuleMetaRepoModel.write((Object) canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(canonicalName, "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(canonicalName, '.', '_', false));
        sb.append(str);
        String string2 = sb.toString();
        try {
            if (name.length() == 0) {
                string = string2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append('.');
                sb2.append(string2);
                string = sb2.toString();
            }
            Class<?> cls2 = Class.forName(string, true, cls.getClassLoader());
            toMagicModuleMetaRepoModel.read(cls2, "");
            return (T) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            StringBuilder sb3 = new StringBuilder("Cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(string2);
            sb3.append(" does not exist. Is Room annotation processor correctly configured?");
            throw new RuntimeException(sb3.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor ");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString(), e3);
        }
    }
}
