package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getBigButtonText {
    public static final double write(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final int RemoteActionCompatParcelizer(int i, int i2) {
        return toMagicModuleMetaRepoModel.read(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int RemoteActionCompatParcelizer(long j, long j2) {
        return toMagicModuleMetaRepoModel.read(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final String AudioAttributesCompatParcelizer(long j) {
        if (j >= 0) {
            String string = Long.toString(j, setStatusTimestamp.RemoteActionCompatParcelizer(10));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j2, setStatusTimestamp.RemoteActionCompatParcelizer(10));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        sb.append(string2);
        String string3 = Long.toString(j3, setStatusTimestamp.RemoteActionCompatParcelizer(10));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        sb.append(string3);
        return sb.toString();
    }
}
