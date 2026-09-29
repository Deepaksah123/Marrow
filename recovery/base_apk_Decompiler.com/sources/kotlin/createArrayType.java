package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class createArrayType {
    private final ArrayList<resolveWithoutSuperTypes> write = new ArrayList<>();

    public final void RemoteActionCompatParcelizer(resolveWithoutSuperTypes resolvewithoutsupertypes) {
        toMagicModuleMetaRepoModel.write(resolvewithoutsupertypes, "");
        this.write.add(resolvewithoutsupertypes);
    }

    public final void read(resolveWithoutSuperTypes resolvewithoutsupertypes) {
        toMagicModuleMetaRepoModel.write(resolvewithoutsupertypes, "");
        this.write.remove(resolvewithoutsupertypes);
    }

    public final void IconCompatParcelizer() {
        for (int iWrite = IntermediateLoginResponseBody.write((List) this.write); iWrite >= 0; iWrite--) {
            this.write.get(iWrite).AudioAttributesCompatParcelizer();
        }
    }
}
