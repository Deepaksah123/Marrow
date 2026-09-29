package kotlin;

import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class getGetterUnchecked {
    public static final void IconCompatParcelizer(hasGetter hasgetter, anyIgnorals.write writeVar, anyIgnorals.write writeVar2) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(writeVar2, "");
        if (writeVar == anyIgnorals.write.IconCompatParcelizer && writeVar2 == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            StringBuilder sb = new StringBuilder("State must be at least '");
            sb.append(anyIgnorals.write.read);
            sb.append("' to be moved to '");
            sb.append(writeVar2);
            sb.append("' in component ");
            sb.append(hasgetter);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (writeVar != anyIgnorals.write.AudioAttributesCompatParcelizer || writeVar == writeVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("State is '");
        sb2.append(anyIgnorals.write.AudioAttributesCompatParcelizer);
        sb2.append("' and cannot be moved to `");
        sb2.append(writeVar2);
        sb2.append("` in component ");
        sb2.append(hasgetter);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
