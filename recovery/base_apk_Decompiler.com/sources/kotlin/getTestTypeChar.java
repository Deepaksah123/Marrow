package kotlin;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class getTestTypeChar {
    public static final String read(char c) {
        String strValueOf = String.valueOf(c);
        toMagicModuleMetaRepoModel.read(strValueOf, "");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        toMagicModuleMetaRepoModel.read(upperCase, "");
        String strSubstring = upperCase.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        toMagicModuleMetaRepoModel.read(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        StringBuilder sb = new StringBuilder();
        sb.append(cCharAt);
        sb.append(lowerCase);
        return sb.toString();
    }
}
