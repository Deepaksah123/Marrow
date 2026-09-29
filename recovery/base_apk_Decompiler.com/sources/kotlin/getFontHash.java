package kotlin;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class getFontHash implements TypeVariable<GenericDeclaration>, flushData {
    private final deleteCourseTables IconCompatParcelizer;

    public getFontHash(deleteCourseTables deletecoursetables) {
        toMagicModuleMetaRepoModel.write(deletecoursetables, "");
        this.IconCompatParcelizer = deletecoursetables;
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.IconCompatParcelizer.write();
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        StringBuilder sb = new StringBuilder("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        sb.append(this.IconCompatParcelizer);
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf(sb.toString())));
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<deleteOfflineDownloadedFiles> listRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(deleteTablesForEditionSwitch.AudioAttributesCompatParcelizer((deleteOfflineDownloadedFiles) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getName(), (Object) typeVariable.getName()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    public final int hashCode() {
        return getGenericDeclaration().hashCode() ^ getName().hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
