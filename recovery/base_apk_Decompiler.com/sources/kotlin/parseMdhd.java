package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseMdhd {
    private static boolean AudioAttributesCompatParcelizer(char c) {
        return c >= 'a' && c <= 'z';
    }

    private static int IconCompatParcelizer(char c) {
        return (char) ((c | ' ') - 97);
    }

    private static boolean read(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String read(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (read(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (read(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String IconCompatParcelizer(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (AudioAttributesCompatParcelizer(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (AudioAttributesCompatParcelizer(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean write(CharSequence charSequence, CharSequence charSequence2) {
        int iIconCompatParcelizer;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iIconCompatParcelizer = IconCompatParcelizer(cCharAt)) >= 26 || iIconCompatParcelizer != IconCompatParcelizer(cCharAt2))) {
                return false;
            }
        }
        return true;
    }
}
