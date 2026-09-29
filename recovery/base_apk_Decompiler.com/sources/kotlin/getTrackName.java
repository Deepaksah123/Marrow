package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import kotlin.parseCea708AccessibilityChannel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class getTrackName {
    public static boolean write(Context context) {
        NetworkInfo activeNetworkInfo;
        return context != null && (activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting() && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    public static LessonDynamicResponseBody<Boolean> write() {
        return parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.inferPrimaryTrackType
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return getTrackName.read();
            }
        });
    }

    static /* synthetic */ Boolean read() {
        try {
            return Boolean.valueOf(!InetAddress.getByName("www.google.com").getHostName().equals(""));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static int RemoteActionCompatParcelizer(Context context) {
        NetworkInfo activeNetworkInfo;
        if (!write(context) || (activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? -1 : 1;
        }
        return AudioAttributesImplApi21Parcelizer(context);
    }

    private static int IconCompatParcelizer(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType();
    }

    private static int AudioAttributesImplApi21Parcelizer(Context context) {
        switch (IconCompatParcelizer(context)) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 4:
            case 7:
            case 11:
            default:
                return 2;
            case 13:
                return 4;
        }
    }

    private static String read(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return "NETWORK_TYPE_GPRS";
            case 2:
                return "NETWORK_TYPE_EDGE";
            case 3:
                return "NETWORK_TYPE_UMTS";
            case 4:
                return "NETWORK_TYPE_CDMA";
            case 5:
                return "NETWORK_TYPE_EVDO_0";
            case 6:
                return "NETWORK_TYPE_EVDO_A";
            case 7:
                return "NETWORK_TYPE_1xRTT";
            case 8:
                return "NETWORK_TYPE_HSDPA";
            case 9:
                return "NETWORK_TYPE_HSUPA";
            case 10:
                return "NETWORK_TYPE_HSPA";
            case 11:
                return "NETWORK_TYPE_IDEN";
            case 12:
                return "NETWORK_TYPE_EVDO_B";
            case 13:
                return "NETWORK_TYPE_LTE";
            case 14:
                return "NETWORK_TYPE_EHRPD";
            case 15:
                return "NETWORK_TYPE_HSPAP";
            default:
                return "NETWORK_TYPE_UNKNOWN";
        }
    }

    private static String read(int i) {
        if (i == -1) {
            return "TYPE_NO_CONNECTION";
        }
        if (i == 1) {
            return "TYPE_WIFI";
        }
        if (i == 2) {
            return "TYPE_MOBILE_2G";
        }
        if (i == 3) {
            return "TYPE_MOBILE_3G";
        }
        if (i == 4) {
            return "TYPE_MOBILE_4G";
        }
        return "TYPE_UNKNOWN";
    }

    public static JSONObject AudioAttributesCompatParcelizer(Context context) {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, "has_telephony", String.valueOf(updateRepeatModeButton.write(context)));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        isDvbProfileDeclared.write(jSONObject, "internet_type", read(iRemoteActionCompatParcelizer));
        if (iRemoteActionCompatParcelizer >= 2) {
            int iIconCompatParcelizer = IconCompatParcelizer(context);
            isDvbProfileDeclared.write(jSONObject, "raw_type", String.valueOf(iIconCompatParcelizer));
            isDvbProfileDeclared.write(jSONObject, "raw_type_string", AudioAttributesCompatParcelizer(iIconCompatParcelizer));
            isDvbProfileDeclared.write(jSONObject, "carrier", read(context));
        }
        return jSONObject;
    }
}
