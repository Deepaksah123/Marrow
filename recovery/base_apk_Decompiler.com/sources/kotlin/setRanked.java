package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class setRanked extends getTestBeginTimestamp {
    public static final String IconCompatParcelizer(char c) {
        return getTestTypeChar.read(c);
    }

    public static final boolean IconCompatParcelizer(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
