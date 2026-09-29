package kotlin;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\b\u0010\r"}, d2 = {"Lo/AuthBridgeOtpRequestBody;", "", "<init>", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "write", "", "p1", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)[B"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthBridgeOtpRequestBody {
    public static final AuthBridgeOtpRequestBody INSTANCE = new AuthBridgeOtpRequestBody();

    private static int AudioAttributesCompatParcelizer(int p0) {
        return p0 + 22;
    }

    private static int write(int p0) {
        return p0 + 43;
    }

    private AuthBridgeOtpRequestBody() {
    }

    public static String AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int i = Integer.parseInt(String.valueOf(p1.charAt(21)));
        String strSubstring = p1.substring(22, AudioAttributesCompatParcelizer(i));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        String strSubstring2 = p1.substring(write(i), p1.length() - p0.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append(strSubstring2);
        String string = sb.toString();
        int length = string.length();
        int iMax = Math.max(length % 10, 3);
        int i2 = length / iMax;
        if (length % iMax != 0) {
            i2++;
        }
        String str = p0;
        int i3 = 0;
        int iCharAt = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            iCharAt += str.charAt(i4);
        }
        int iMax2 = Math.max(iCharAt % iMax, 2);
        if (iMax == iMax2) {
            iMax2 = 1;
        }
        int i5 = length % i2;
        if (i5 == 0) {
            i5 = i2;
        }
        int i6 = ((iMax2 - 1) * i2) + i5;
        String strSubstring3 = string.substring(i6);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring3, "");
        String strRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer(string, i6);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring3);
        sb2.append(strRemoteActionCompatParcelizer);
        List<String> listRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) sb2.toString(), i2);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        String string2 = "";
        int i7 = 0;
        for (String str2 : listRemoteActionCompatParcelizer) {
            int length2 = (i7 + iCharAt) % str2.length();
            String strSubstring4 = str2.substring(length2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring4, "");
            String strRemoteActionCompatParcelizer2 = TestGroupLSModel.RemoteActionCompatParcelizer(str2, length2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) string2);
            sb3.append(strSubstring4);
            sb3.append(strRemoteActionCompatParcelizer2);
            string2 = sb3.toString();
            arrayList.add(getShowPopup.INSTANCE);
            i7++;
        }
        int length3 = string2.length() % 4;
        if (length3 == 2) {
            i3 = 2;
        } else if (length3 == 3) {
            i3 = 1;
        }
        String str3 = TestGroupLSModel.read((CharSequence) "=", i3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append((Object) string2);
        sb4.append(str3);
        return new String(write(sb4.toString()), getSubmissionTimestamp.IconCompatParcelizer);
    }

    private static byte[] write(String p0) {
        byte[] bArrDecode = Base64.decode(p0, 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrDecode, "");
        return bArrDecode;
    }
}
