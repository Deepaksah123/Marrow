package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseIndexAndCountAttribute {
    public static char IconCompatParcelizer(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    public static char AudioAttributesCompatParcelizer(long j) {
        char c = (char) j;
        parseStsd.AudioAttributesCompatParcelizer(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static boolean write(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
