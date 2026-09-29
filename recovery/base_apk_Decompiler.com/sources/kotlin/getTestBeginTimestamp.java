package kotlin;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class getTestBeginTimestamp {
    public static final boolean RemoteActionCompatParcelizer(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String write(char c, Locale locale) {
        toMagicModuleMetaRepoModel.write(locale, "");
        String strValueOf = String.valueOf(c);
        toMagicModuleMetaRepoModel.read(strValueOf, "");
        String upperCase = strValueOf.toUpperCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        return upperCase;
    }

    public static final String RemoteActionCompatParcelizer(char c, Locale locale) {
        toMagicModuleMetaRepoModel.write(locale, "");
        String strValueOf = String.valueOf(c);
        toMagicModuleMetaRepoModel.read(strValueOf, "");
        String lowerCase = strValueOf.toLowerCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return lowerCase;
    }

    public static final String read(char c, Locale locale) {
        toMagicModuleMetaRepoModel.write(locale, "");
        String strWrite = setStatusTimestamp.write(c, locale);
        if (strWrite.length() <= 1) {
            String strValueOf = String.valueOf(c);
            toMagicModuleMetaRepoModel.read(strValueOf, "");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) upperCase)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = strWrite.charAt(0);
            toMagicModuleMetaRepoModel.read(strWrite, "");
            String strSubstring = strWrite.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            toMagicModuleMetaRepoModel.read(strSubstring, "");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            StringBuilder sb = new StringBuilder();
            sb.append(cCharAt);
            sb.append(lowerCase);
            return sb.toString();
        }
        return strWrite;
    }

    public static final int AudioAttributesCompatParcelizer(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final int RemoteActionCompatParcelizer(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new newEncryptedObject(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
