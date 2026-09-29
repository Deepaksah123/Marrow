package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface shouldStartPlayback {
    List<String> IconCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(String str);

    void write(setBackBuffer setbackbuffer);

    default void RemoteActionCompatParcelizer(String str, Set<String> set) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            write(new setBackBuffer((String) it.next(), str));
        }
    }
}
