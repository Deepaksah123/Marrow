package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getId3TlenUs {
    private static String AudioAttributesCompatParcelizer(int i, int i2, String str) {
        if (i < 0) {
            return getConstantBitrateSeeker.IconCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return getConstantBitrateSeeker.IconCompatParcelizer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        String strIconCompatParcelizer;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strIconCompatParcelizer = getConstantBitrateSeeker.IconCompatParcelizer("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            strIconCompatParcelizer = getConstantBitrateSeeker.IconCompatParcelizer("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strIconCompatParcelizer);
    }

    public static int write(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AudioAttributesCompatParcelizer(i, i2, "index"));
        }
        return i;
    }

    public static void write(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? AudioAttributesCompatParcelizer(i, i3, "start index") : (i2 < 0 || i2 > i3) ? AudioAttributesCompatParcelizer(i2, i3, "end index") : getConstantBitrateSeeker.IconCompatParcelizer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
