package kotlin;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
final class getAns implements GenericArrayType, flushData {
    private final Type write;

    public getAns(Type type) {
        toMagicModuleMetaRepoModel.write(type, "");
        this.write = type;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.write;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        sb.append(deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(this.write));
        sb.append(ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public final int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
