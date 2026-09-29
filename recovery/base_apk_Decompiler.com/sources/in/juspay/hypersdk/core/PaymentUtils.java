package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.ThemeAlphaConstantsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentUtils extends Utils {
    private static final String LOG_TAG = "PaymentUtils";

    public static void clearCookies(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            CookieSyncManager.createInstance(context).sync();
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception e) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Failed to clear cookies", e);
        }
    }

    public static void deleteRecursive(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                for (File file2 : fileArrListFiles) {
                    deleteRecursive(file2);
                }
            }
            file.delete();
        }
    }

    public static String getConfigVariableDeclarations(Context context, SessionInfo sessionInfo, String str) {
        String deviceId = sessionInfo.getDeviceId();
        String androidId = sessionInfo.getAndroidId();
        if (deviceId == null || deviceId.isEmpty()) {
            deviceId = "";
        }
        StringBuilder sb = new StringBuilder("var clientId = '");
        sb.append(sessionInfo.getClientId());
        sb.append("';var juspayDeviceId = '");
        sb.append(deviceId);
        sb.append("';var juspayAndroidId = '");
        sb.append(androidId);
        sb.append("';var godelRemotesVersion = '");
        sb.append(PaymentSessionInfo.getGodelRemotesVersion(context));
        sb.append("';var godelVersion = '");
        sb.append(IntegrationUtils.getGodelVersion(context));
        sb.append("';var buildVersion = '");
        sb.append(IntegrationUtils.getGodelBuildVersion(context));
        sb.append("';var os_version = '");
        sb.append(SessionInfo.getOSVersion());
        sb.append("';var tenantId = '");
        sb.append(str);
        sb.append("';");
        return sb.toString();
    }

    public static ConnectivityReceiver getConnectivityReceiver(JuspayServices juspayServices) {
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            return new ConnectivityReceiver(juspayServices);
        } catch (Throwable th) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Failed to register Connectivity receiver (Ignoring)", th);
            return null;
        }
    }

    public static boolean hasTelephonyService(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Throwable th) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while trying to get telephony service. Returning false.", th);
            return false;
        }
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void logMemoryInfo(SdkTracker sdkTracker, ActivityManager.MemoryInfo memoryInfo) {
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "available_memory", Long.valueOf(memoryInfo.availMem));
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "threshold_memory", Long.valueOf(memoryInfo.threshold));
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "total_memory", Long.valueOf(memoryInfo.totalMem));
    }

    public static void refreshPage(JuspayWebView juspayWebView) {
        if (juspayWebView != null) {
            juspayWebView.addJsToWebView("window.location.reload(true);");
        }
    }

    public static void switchOffGodelIfLowOnMemory(Godel godel, JuspayServices juspayServices, PaymentSessionInfo paymentSessionInfo) {
        Exception exc;
        int i;
        try {
            Context context = juspayServices.getContext();
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                JSONObject webLabRules = godel.getWebLabRules();
                if (webLabRules != null) {
                    i = webLabRules.getInt("shouldUseMemory");
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append(" MB");
                        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.UTIL, "weblab_shouldUseMemory", sb.toString());
                    } catch (Exception e) {
                        exc = e;
                        sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while fetching shouldUseMemory from config", exc);
                    }
                } else {
                    i = 4;
                }
            } catch (Exception e2) {
                exc = e2;
                i = 4;
            }
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                int memoryClass = activityManager.getMemoryClass();
                if (memoryClass < i) {
                    paymentSessionInfo.setGodelDisabled(PaymentConstants.GodelOffReasons.LOW_ON_MEMORY);
                    StringBuilder sb2 = new StringBuilder("low on memory - Available memory : ");
                    sb2.append(memoryClass);
                    sb2.append(" MB");
                    sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.UTIL, "switching_godel_off", sb2.toString());
                }
                logMemoryInfo(sdkTracker, memoryInfo);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(memoryClass);
                sb3.append(" MB <");
                sb3.append(i);
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.UTIL, "switchoffgodeliflowonmemory", sb3.toString());
            }
        } catch (Exception unused) {
        }
    }

    public static String toJavascriptArray(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append("\"");
            sb.append(it.next());
            sb.append("\"");
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean validatePinning(X509Certificate[] x509CertificateArr, Set<String> set) throws CertificateException {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (x509CertificateArr.length <= 0) {
                JuspayLogger.d(LOG_TAG, sb.toString());
                return true;
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            messageDigest.update(encoded, 0, encoded.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            sb.append("    sha256/");
            sb.append(strEncodeToString);
            sb.append(" : ");
            sb.append(x509Certificate.getSubjectDN().toString());
            sb.append("\n");
            return !set.contains(strEncodeToString);
        } catch (NoSuchAlgorithmException unused) {
            throw new CertificateException("couldn't create digest");
        }
    }
}
