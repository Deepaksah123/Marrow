package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setEdition {
    public static final int RemoteActionCompatParcelizer(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final int RemoteActionCompatParcelizer(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final void read(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(AudioAttributesCompatParcelizer(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final String AudioAttributesCompatParcelizer(Object obj, Object obj2) {
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(obj2, "");
        StringBuilder sb = new StringBuilder("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
}
