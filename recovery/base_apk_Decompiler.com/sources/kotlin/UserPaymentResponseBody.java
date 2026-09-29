package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UserPaymentResponseBody extends setValidTill {
    public static final <T> Integer IconCompatParcelizer(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> int RemoteActionCompatParcelizer(Iterable<? extends T> iterable, int i) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(Iterable<? extends Iterable<? extends T>> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
