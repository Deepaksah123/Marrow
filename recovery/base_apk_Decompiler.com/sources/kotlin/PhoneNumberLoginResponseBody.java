package kotlin;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PhoneNumberLoginResponseBody extends hasManyAccounts {
    public static final <T extends Comparable<? super T>> void IconCompatParcelizer(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void IconCompatParcelizer(List<T> list, Comparator<? super T> comparator) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
