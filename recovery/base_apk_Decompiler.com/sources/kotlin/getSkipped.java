package kotlin;

import java.util.Comparator;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes.dex */
public class getSkipped extends getMaxMcqCount {
    public static final boolean read(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final String AudioAttributesCompatParcelizer(String str, char c, char c2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        String strReplace = str.replace(c, c2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strReplace, "");
        return strReplace;
    }

    public static final String read(String str, String str2, String str3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        String str4 = str;
        int iWrite = TestGroupLSModel.write((CharSequence) str4, str2, 0, false);
        if (iWrite < 0) {
            return str;
        }
        int length = str2.length();
        int iWrite2 = getQues.write(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i = 0;
        do {
            sb.append((CharSequence) str4, i, iWrite);
            sb.append(str3);
            i = iWrite + length;
            if (iWrite >= str.length()) {
                break;
            }
            iWrite = TestGroupLSModel.write((CharSequence) str4, str2, iWrite + iWrite2, false);
        } while (iWrite > 0);
        sb.append((CharSequence) str4, i, str.length());
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static final String RemoteActionCompatParcelizer(String str, String str2, String str3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        String str4 = str;
        int i = TestGroupLSModel.read((CharSequence) str4, str2, 0, false, 2);
        return i < 0 ? str : TestGroupLSModel.read(str4, i, str2.length() + i, str3).toString();
    }

    public static final String IconCompatParcelizer(char[] cArr) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        return new String(cArr);
    }

    public static final String AudioAttributesCompatParcelizer(char[] cArr, int i) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        setUrl.Companion remoteActionCompatParcelizer = setUrl.INSTANCE;
        setUrl.Companion.read(i, 8, cArr.length);
        return new String(cArr, i, 8 - i);
    }

    public static /* synthetic */ boolean MediaBrowserCompatCustomActionResultReceiver(String str, String str2) {
        return TestGroupLSModel.AudioAttributesCompatParcelizer(str, str2, false);
    }

    public static final boolean AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return TestGroupLSModel.IconCompatParcelizer(str, 0, str2, 0, str2.length(), z);
    }

    public static final boolean AudioAttributesCompatParcelizer(String str, String str2, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return TestGroupLSModel.IconCompatParcelizer(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean AudioAttributesImplApi21Parcelizer(String str, String str2) {
        return TestGroupLSModel.write(str, str2, false);
    }

    public static final boolean write(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return TestGroupLSModel.IconCompatParcelizer(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean IconCompatParcelizer(String str, int i, String str2, int i2, int i3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String read(CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Count 'n' must be non-negative, but was ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
        if (i > 0) {
            while (true) {
                sb2.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb2.toString();
        toMagicModuleMetaRepoModel.write((Object) string);
        return string;
    }

    public static final Comparator<String> AudioAttributesCompatParcelizer(toMagicModuleStatusUcModel tomagicmodulestatusucmodel) {
        toMagicModuleMetaRepoModel.write(tomagicmodulestatusucmodel, "");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(comparator, "");
        return comparator;
    }
}
