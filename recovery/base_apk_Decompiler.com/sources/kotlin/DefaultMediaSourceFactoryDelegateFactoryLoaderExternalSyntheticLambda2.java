package kotlin;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2 implements Serializable {
    private static String RemoteActionCompatParcelizer = "[]";
    private static String write;
    private final Context AudioAttributesCompatParcelizer;

    public DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2(Context context) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        this.AudioAttributesCompatParcelizer = context;
    }

    private static List<String> IconCompatParcelizer(String str, String str2) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                if (strNextElement.startsWith("com.google.android.") || strNextElement.startsWith("android.")) {
                    messageDigest.update(strNextElement.getBytes(CharsetNames.UTF_8));
                } else if (strNextElement.startsWith(str)) {
                    messageDigest2.update(strNextElement.getBytes(CharsetNames.UTF_8));
                } else {
                    messageDigest3.update(strNextElement.getBytes(CharsetNames.UTF_8));
                }
            }
            dexFile.close();
            StringBuilder sb = new StringBuilder("sys_");
            sb.append(String.format("%032x", new BigInteger(1, messageDigest.digest())));
            arrayList.add(sb.toString());
            StringBuilder sb2 = new StringBuilder("deps_");
            sb2.append(String.format("%032x", new BigInteger(1, messageDigest3.digest())));
            arrayList.add(sb2.toString());
            StringBuilder sb3 = new StringBuilder("app_");
            sb3.append(String.format("%032x", new BigInteger(1, messageDigest2.digest())));
            arrayList.add(sb3.toString());
            StringBuilder sb4 = new StringBuilder("aver_");
            sb4.append(Build.VERSION.RELEASE);
            arrayList.add(sb4.toString());
            StringBuilder sb5 = new StringBuilder("sdk_");
            sb5.append("4.0.2_41".replace('.', '_'));
            arrayList.add(sb5.toString());
            return arrayList;
        } catch (Throwable th) {
            dexFile.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2)) {
            return false;
        }
        Context contextRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        Context contextRemoteActionCompatParcelizer2 = ((DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2) obj).RemoteActionCompatParcelizer();
        return contextRemoteActionCompatParcelizer != null ? contextRemoteActionCompatParcelizer.equals(contextRemoteActionCompatParcelizer2) : contextRemoteActionCompatParcelizer2 == null;
    }

    private Context RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @JavascriptInterface
    public final String getDebugInfo() {
        String strWriteValueAsString;
        String str = RemoteActionCompatParcelizer;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            strWriteValueAsString = RemoteActionCompatParcelizer;
            if (strWriteValueAsString == null) {
                try {
                    strWriteValueAsString = new ObjectMapper().writeValueAsString(IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getPackageName(), this.AudioAttributesCompatParcelizer.getPackageCodePath()));
                    RemoteActionCompatParcelizer = strWriteValueAsString;
                } catch (IOException | NoSuchAlgorithmException unused) {
                    return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
                }
            }
        }
        return strWriteValueAsString;
    }

    @JavascriptInterface
    public final String getSysDebug() {
        String strWriteValueAsString;
        String str = write;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            strWriteValueAsString = write;
            if (strWriteValueAsString == null) {
                try {
                    strWriteValueAsString = new ObjectMapper().writeValueAsString(AudioAttributesCompatParcelizer());
                    write = strWriteValueAsString;
                } catch (IOException unused) {
                    return "{}";
                }
            }
        }
        return strWriteValueAsString;
    }

    public final int hashCode() {
        Context contextRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return (contextRemoteActionCompatParcelizer == null ? 43 : contextRemoteActionCompatParcelizer.hashCode()) + 59;
    }

    private static Map<String, String> AudioAttributesCompatParcelizer() {
        HashMap map = new HashMap();
        Process processStart = null;
        try {
            processStart = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), CharsetNames.UTF_8));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        processStart.destroy();
                        return map;
                    }
                    if (line.endsWith("]")) {
                        sb.replace(0, sb.length() == 0 ? 0 : sb.length() - 1, line);
                        String[] strArrSplit = sb.toString().split("]: \\[");
                        String strSubstring = strArrSplit[0].substring(1);
                        if (strSubstring.startsWith("ro")) {
                            map.put(strSubstring, strArrSplit[1].substring(0, r5.length() - 2));
                        }
                    } else {
                        sb.append(line);
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HCaptchaDebugInfo(context=");
        sb.append(RemoteActionCompatParcelizer());
        sb.append(")");
        return sb.toString();
    }
}
