package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: loaded from: classes.dex */
public class putSps {
    private static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long AudioAttributesCompatParcelizer = -1;

    public static SharedPreferences AudioAttributesImplApi26Parcelizer(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = r3[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String IconCompatParcelizer(java.io.File r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L50
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            if (r3 == 0) goto L35
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            int r4 = r3.length     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
            if (r4 == 0) goto L15
            r2 = r3[r5]     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4a
        L35:
            AudioAttributesCompatParcelizer(r1, r0)
            return r2
        L39:
            r6 = move-exception
            goto L4c
        L3b:
            r1 = r2
        L3c:
            o.DvbSubtitleReader r7 = kotlin.DvbSubtitleReader.read()     // Catch: java.lang.Throwable -> L4a
            java.util.Objects.toString(r6)     // Catch: java.lang.Throwable -> L4a
            r7.write()     // Catch: java.lang.Throwable -> L4a
            AudioAttributesCompatParcelizer(r1, r0)
            goto L50
        L4a:
            r6 = move-exception
            r2 = r1
        L4c:
            AudioAttributesCompatParcelizer(r2, r0)
            throw r6
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.putSps.IconCompatParcelizer(java.io.File, java.lang.String):java.lang.String");
    }

    public static int IconCompatParcelizer() {
        return read.IconCompatParcelizer().ordinal();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 o.putSps$read, still in use, count: 1, list:
      (r10v0 o.putSps$read) from 0x0076: INVOKE (r0v12 java.util.HashMap), ("x86"), (r10v0 o.putSps$read) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:157)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: loaded from: classes5.dex */
    static final class read {
        /* JADX INFO: Fake field, exist only in values array */
        X86_32,
        /* JADX INFO: Fake field, exist only in values array */
        X86_64,
        /* JADX INFO: Fake field, exist only in values array */
        ARM_UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        PPC,
        /* JADX INFO: Fake field, exist only in values array */
        PPC64,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV6,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7,
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7S,
        /* JADX INFO: Fake field, exist only in values array */
        ARM64;

        private static final Map<String, read> IconCompatParcelizer;

        private read() {
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesCompatParcelizer.clone();
        }

        static {
            HashMap map = new HashMap(4);
            IconCompatParcelizer = map;
            map.put("armeabi-v7a", readVar);
            map.put("armeabi", readVar);
            map.put("arm64-v8a", readVar);
            map.put("x86", readVar);
        }

        static read IconCompatParcelizer() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            read readVar = IconCompatParcelizer.get(str.toLowerCase(Locale.US));
            return readVar == null ? UNKNOWN : readVar;
        }
    }

    public static long read() {
        long j;
        synchronized (putSps.class) {
            if (AudioAttributesCompatParcelizer == -1) {
                String strIconCompatParcelizer = IconCompatParcelizer(new File("/proc/meminfo"), "MemTotal");
                long jIconCompatParcelizer = 0;
                if (!TextUtils.isEmpty(strIconCompatParcelizer)) {
                    String upperCase = strIconCompatParcelizer.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            jIconCompatParcelizer = IconCompatParcelizer(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            jIconCompatParcelizer = IconCompatParcelizer(upperCase, "MB", ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                        } else if (upperCase.endsWith("GB")) {
                            jIconCompatParcelizer = IconCompatParcelizer(upperCase, "GB", 1073741824);
                        } else {
                            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                            StringBuilder sb = new StringBuilder("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            dvbSubtitleReader.read(sb.toString());
                        }
                    } catch (NumberFormatException unused) {
                        DvbSubtitleReader.read().write();
                    }
                }
                AudioAttributesCompatParcelizer = jIconCompatParcelizer;
                j = AudioAttributesCompatParcelizer;
            } else {
                j = AudioAttributesCompatParcelizer;
            }
        }
        return j;
    }

    private static long IconCompatParcelizer(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static ActivityManager.RunningAppProcessInfo write(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(str)) {
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    public static String read(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static String IconCompatParcelizer(String str) {
        return read(str, "SHA-1");
    }

    private static String read(String str, String str2) {
        return read(str.getBytes(), str2);
    }

    private static String read(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return AudioAttributesCompatParcelizer(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            DvbSubtitleReader.read().write();
            return "";
        }
    }

    public static String write(String... strArr) {
        int length = strArr.length;
        ArrayList arrayList = new ArrayList();
        int length2 = strArr.length;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return IconCompatParcelizer(string);
        }
        return null;
    }

    public static long RemoteActionCompatParcelizer(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long read(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean write(Context context) {
        return (RemoteActionCompatParcelizer() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static boolean AudioAttributesCompatParcelizer(Context context, String str) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return true;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, str, "bool");
        if (iRemoteActionCompatParcelizer > 0) {
            return resources.getBoolean(iRemoteActionCompatParcelizer);
        }
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context, str, "string");
        if (iRemoteActionCompatParcelizer2 > 0) {
            return Boolean.parseBoolean(context.getString(iRemoteActionCompatParcelizer2));
        }
        return true;
    }

    public static int RemoteActionCompatParcelizer(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, AudioAttributesImplBaseParcelizer(context));
    }

    public static boolean RemoteActionCompatParcelizer() {
        return Build.PRODUCT.contains(PaymentConstants.Category.SDK) || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean write() {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        String str = Build.TAGS;
        if ((zRemoteActionCompatParcelizer || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zRemoteActionCompatParcelizer && new File("/system/xbin/su").exists();
        }
        return true;
    }

    private static boolean AudioAttributesImplBaseParcelizer() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int AudioAttributesCompatParcelizer() {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        ?? r0 = zRemoteActionCompatParcelizer;
        if (write()) {
            r0 = (zRemoteActionCompatParcelizer ? 1 : 0) | 2;
        }
        return AudioAttributesImplBaseParcelizer() ? r0 | 4 : r0;
    }

    public static String AudioAttributesCompatParcelizer(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = IconCompatParcelizer;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean MediaBrowserCompatItemReceiver(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static void AudioAttributesCompatParcelizer(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                DvbSubtitleReader.read().write();
            }
        }
    }

    private static String AudioAttributesImplBaseParcelizer(Context context) {
        int i = ((PackageItemInfo) context.getApplicationContext().getApplicationInfo()).icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return LogSubCategory.LifeCycle.ANDROID.equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static String read(Context context) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iRemoteActionCompatParcelizer == 0) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, "com.crashlytics.android.build_id", "string");
        }
        if (iRemoteActionCompatParcelizer != 0) {
            return context.getResources().getString(iRemoteActionCompatParcelizer);
        }
        return null;
    }

    public static List<H264ReaderSampleReader> AudioAttributesCompatParcelizer(Context context) {
        ArrayList arrayList = new ArrayList();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iRemoteActionCompatParcelizer == 0 || iRemoteActionCompatParcelizer2 == 0 || iRemoteActionCompatParcelizer3 == 0) {
            DvbSubtitleReader.read().IconCompatParcelizer(String.format("Could not find resources: %d %d %d", Integer.valueOf(iRemoteActionCompatParcelizer), Integer.valueOf(iRemoteActionCompatParcelizer2), Integer.valueOf(iRemoteActionCompatParcelizer3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iRemoteActionCompatParcelizer);
        String[] stringArray2 = context.getResources().getStringArray(iRemoteActionCompatParcelizer2);
        String[] stringArray3 = context.getResources().getStringArray(iRemoteActionCompatParcelizer3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            DvbSubtitleReader.read().IconCompatParcelizer(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i = 0; i < stringArray3.length; i++) {
            arrayList.add(new H264ReaderSampleReader(stringArray[i], stringArray2[i], stringArray3[i]));
        }
        return arrayList;
    }

    private static boolean RemoteActionCompatParcelizer(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean IconCompatParcelizer(Context context) {
        if (!RemoteActionCompatParcelizer(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean RemoteActionCompatParcelizer(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
