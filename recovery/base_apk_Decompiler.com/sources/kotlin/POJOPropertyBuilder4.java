package kotlin;

import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class POJOPropertyBuilder4 implements findAccess {
    private final withoutNonVisible RemoteActionCompatParcelizer;

    public POJOPropertyBuilder4(withoutNonVisible withoutnonvisible) {
        toMagicModuleMetaRepoModel.write(withoutnonvisible, "");
        this.RemoteActionCompatParcelizer = withoutnonvisible;
    }

    @Override // kotlin.findAccess
    public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar != anyIgnorals.read.ON_CREATE) {
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(String.valueOf(readVar)).toString());
        }
        hasgetter.getLifecycle().AudioAttributesCompatParcelizer(this);
        this.RemoteActionCompatParcelizer.write();
    }
}
