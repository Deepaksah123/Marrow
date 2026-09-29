package kotlin;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J#\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0015J)\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0016J\u001d\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0017¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u001a"}, d2 = {"Lo/AliasesKt;", "", "<init>", "()V", "", "p0", "p1", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/ArrayList;", "", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(Ljava/util/ArrayList;Ljava/lang/String;II)V", "", "RemoteActionCompatParcelizer", "([B)Ljava/lang/String;", "()Ljava/lang/String;", "(I)Ljava/lang/String;", "(Ljava/lang/String;I)Ljava/lang/String;", "(Ljava/util/ArrayList;I)Ljava/lang/String;", "", "", "(Ljava/lang/String;[J)J", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasesKt {
    public static final AliasesKt INSTANCE = new AliasesKt();

    private AliasesKt() {
    }

    @getMagicModuleMeta
    public static final String write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            Charset charsetForName = Charset.forName(CharsetNames.UTF_8);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
            byte[] bytes = p1.getBytes(charsetForName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(bytes));
            int length = strRemoteActionCompatParcelizer.length();
            int iMax = Math.max(length % 10, 3);
            int length2 = p0.length();
            int i = 0;
            for (int i2 = 0; i2 < length2; i2++) {
                if (p0.charAt(i2) == ' ') {
                    i++;
                }
            }
            int i3 = 1;
            int iRemoteActionCompatParcelizer = (int) RemoteActionCompatParcelizer(p0, new long[i + 1]);
            int iMax2 = Math.max(iRemoteActionCompatParcelizer % iMax, 2);
            if (iMax2 != iMax) {
                i3 = iMax2;
            }
            int i4 = length / iMax;
            if (length % iMax != 0) {
                i4++;
            }
            ArrayList arrayList = new ArrayList();
            AudioAttributesCompatParcelizer(arrayList, strRemoteActionCompatParcelizer, length, i4);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = arrayList.get(i5);
                toMagicModuleMetaRepoModel.write(obj);
                arrayList.set(i5, RemoteActionCompatParcelizer((String) arrayList.get(i5), (iRemoteActionCompatParcelizer + i5) % ((String) obj).length()));
            }
            String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((ArrayList<String>) arrayList, i3);
            int i6 = Integer.parseInt(write());
            toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer2);
            int iMin = Math.min(i6, strRemoteActionCompatParcelizer2.length());
            String strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(21);
            String strSubstring = strRemoteActionCompatParcelizer2.substring(0, iMin);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            String strRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(21);
            String strSubstring2 = strRemoteActionCompatParcelizer2.substring(iMin);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
            String strRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(p0.length());
            StringBuilder sb = new StringBuilder();
            sb.append(strRemoteActionCompatParcelizer3);
            sb.append(iMin);
            sb.append(strSubstring);
            sb.append(strRemoteActionCompatParcelizer4);
            sb.append(strSubstring2);
            sb.append(strRemoteActionCompatParcelizer5);
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static void AudioAttributesCompatParcelizer(ArrayList<String> p0, String p1, int p2, int p3) {
        int i = 0;
        while (i < p2) {
            int i2 = i + p3;
            if (p2 > i2) {
                String strSubstring = p1.substring(i, i2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                p0.add(strSubstring);
            } else {
                String strSubstring2 = p1.substring(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                p0.add(strSubstring2);
            }
            i = i2;
        }
    }

    private static String RemoteActionCompatParcelizer(byte[] p0) {
        String strEncodeToString = Base64.encodeToString(p0, 2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
        return strEncodeToString;
    }

    private static String write() {
        String string = "";
        for (int i = 0; i <= 0; i++) {
            int iNextInt = new Random().nextInt(9);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(iNextInt + 1);
            string = sb.toString();
        }
        return string;
    }

    private static String RemoteActionCompatParcelizer(int p0) {
        String string = "";
        for (int i = 0; i < p0; i++) {
            char cCharAt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(new Random().nextInt(52));
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(cCharAt);
            string = sb.toString();
        }
        return string;
    }

    private static String RemoteActionCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write((Object) p0);
        if (p1 > p0.length()) {
            return p0;
        }
        int length = p0.length() - p1;
        String strSubstring = p0.substring(length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        String strSubstring2 = p0.substring(0, length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append(strSubstring2);
        return sb.toString();
    }

    private static String RemoteActionCompatParcelizer(ArrayList<String> p0, int p1) {
        if (p1 <= p0.size()) {
            int size = p0.size();
            String string = "";
            for (int size2 = p0.size() - p1; size2 < size; size2++) {
                String str = p0.get(size2);
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append((Object) str);
                string = sb.toString();
            }
            int size3 = p0.size();
            for (int i = 0; i < size3 - p1; i++) {
                String str2 = p0.get(i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append((Object) str2);
                string = sb2.toString();
            }
            return string;
        }
        return p0.toString();
    }

    private static long RemoteActionCompatParcelizer(String p0, long[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int length = p0.length();
        int i = 0;
        long jCharAt = 0;
        long j = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (p0.charAt(i2) == ' ') {
                j += jCharAt;
                p1[i] = jCharAt;
                i++;
                jCharAt = 0;
            } else {
                jCharAt += (long) p0.charAt(i2);
            }
        }
        p1[i] = jCharAt;
        return j + jCharAt;
    }

    private static String RemoteActionCompatParcelizer(String p0) {
        StringBuilder sb = new StringBuilder(p0);
        if (p0.length() < 0) {
            return p0;
        }
        if (TestGroupLSModel.write((CharSequence) String.valueOf(p0.charAt(p0.length() - 2)), (CharSequence) "=", false)) {
            sb.delete(p0.length() - 2, p0.length());
        } else if (TestGroupLSModel.write((CharSequence) String.valueOf(p0.charAt(p0.length() - 1)), (CharSequence) "=", false)) {
            sb.delete(p0.length() - 1, p0.length());
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
