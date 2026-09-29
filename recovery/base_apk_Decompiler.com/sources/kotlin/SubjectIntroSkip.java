package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class SubjectIntroSkip {
    public static final String RemoteActionCompatParcelizer(String str) {
        Integer next;
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = str;
        if (str2.length() == 0 || !read(str, 0, true)) {
            return str;
        }
        if (str.length() == 1 || !read(str, 1, true)) {
            return IconCompatParcelizer(str);
        }
        Iterator<Integer> it = TestGroupLSModel.read((CharSequence) str2).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!read(str, next.intValue(), true)) {
                break;
            }
        }
        Integer num = next;
        if (num == null) {
            return write(str, true);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, iIntValue);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(write(strSubstring, true));
        String strSubstring2 = str.substring(iIntValue);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    private static final boolean read(String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    private static final String write(String str, boolean z) {
        return AudioAttributesCompatParcelizer(str);
    }

    public static final String write(String str) {
        char cCharAt;
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        StringBuilder sb = new StringBuilder();
        sb.append(upperCase);
        sb.append(strSubstring);
        return sb.toString();
    }

    private static String IconCompatParcelizer(String str) {
        char cCharAt;
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        StringBuilder sb = new StringBuilder();
        sb.append(lowerCase);
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final String AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
