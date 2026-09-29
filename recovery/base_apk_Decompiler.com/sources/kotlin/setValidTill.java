package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class setValidTill extends getAccounts {
    public static final <T> Collection<T> RemoteActionCompatParcelizer(T[] tArr, boolean z) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return new getGroupId(tArr, z);
    }

    public static final <T> List<T> RemoteActionCompatParcelizer() {
        return getVideoStartTime.write;
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length > 0 ? getOrderDetails.read(tArr) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final <T> List<T> write(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) tArr, true));
    }

    public static final <T> ArrayList<T> AudioAttributesCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) tArr, true));
    }

    public static final <T> List<T> AudioAttributesCompatParcelizer(T t) {
        return t != null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer(t) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final <T> List<T> read(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return getOrderDetails.AudioAttributesImplBaseParcelizer(tArr);
    }

    public static final newEncryptedObject read(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return new newEncryptedObject(0, collection.size() - 1);
    }

    public static final <T> int write(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return list.size() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> RemoteActionCompatParcelizer(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list.get(0));
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final <T extends Comparable<? super T>> int RemoteActionCompatParcelizer(List<? extends T> list, T t, int i, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        read(list.size(), 0, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int i5 = getConfigExpirySeconds.read(list.get(i4), t);
            if (i5 < 0) {
                i = i4 + 1;
            } else {
                if (i5 <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final <T> int IconCompatParcelizer(List<? extends T> list, int i, int i2, getAnswerMap<? super T, Integer> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        read(list.size(), 0, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iIntValue = getanswermap.invoke(list.get(i4)).intValue();
            if (iIntValue < 0) {
                i = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    private static final void read(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder("fromIndex (");
            sb.append(i2);
            sb.append(") is greater than toIndex (");
            sb.append(i3);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(i2);
            sb2.append(") is less than zero.");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 <= i) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("toIndex (");
        sb3.append(i3);
        sb3.append(") is greater than size (");
        sb3.append(i);
        sb3.append(").");
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static final void read() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void write() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}
