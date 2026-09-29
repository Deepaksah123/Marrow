package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setPbConfig<E> {
    private final Object IconCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Object RemoteActionCompatParcelizer(Object obj) {
        return obj;
    }

    public static final Object read(Object obj, E e) {
        getCollegeId.write();
        if (obj == null) {
            return RemoteActionCompatParcelizer(e);
        }
        if (obj instanceof ArrayList) {
            toMagicModuleMetaRepoModel.read(obj, "");
            ((ArrayList) obj).add(e);
            return RemoteActionCompatParcelizer(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return RemoteActionCompatParcelizer(arrayList);
    }

    private static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return (obj2 instanceof setPbConfig) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ((setPbConfig) obj2).RemoteActionCompatParcelizer());
    }

    private static int AudioAttributesCompatParcelizer(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static String write(Object obj) {
        StringBuilder sb = new StringBuilder("InlineList(holder=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, obj);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return write(this.IconCompatParcelizer);
    }

    private /* synthetic */ Object RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
