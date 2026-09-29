package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomTypefaceSpan {
    /* JADX INFO: Access modifiers changed from: private */
    public static long write(String str, int i, int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(str, "");
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i2 > str.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i3 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += (long) i3;
            }
            i++;
        }
        return j;
    }
}
