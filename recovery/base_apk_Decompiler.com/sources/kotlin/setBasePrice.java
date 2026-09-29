package kotlin;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class setBasePrice {
    public static final <T> T[] AudioAttributesCompatParcelizer(T[] tArr, int i) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        toMagicModuleMetaRepoModel.read(objNewInstance, "");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final void read(int i, int i2) {
        if (i <= i2) {
            return;
        }
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(i);
        sb.append(") is greater than size (");
        sb.append(i2);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final <T> int IconCompatParcelizer(T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }
}
