package kotlin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class getAccounts {
    public static final <T> List<T> RemoteActionCompatParcelizer(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listSingletonList, "");
        return listSingletonList;
    }

    public static final <E> List<E> IconCompatParcelizer() {
        return new getWorkFlowId(0, 1, null);
    }

    public static final <E> List<E> write(int i) {
        return new getWorkFlowId(i);
    }

    public static final <E> List<E> AudioAttributesCompatParcelizer(List<E> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return ((getWorkFlowId) list).IconCompatParcelizer();
    }

    public static final <T> List<T> write(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        List<T> listOnFastForward = IntermediateLoginResponseBody.onFastForward(iterable);
        Collections.shuffle(listOnFastForward);
        return listOnFastForward;
    }

    public static final <T> T[] read(int i, T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> Object[] read(T[] tArr, boolean z) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (z && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        return objArrCopyOf;
    }
}
