package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersmshandler.JuspayDuiHook;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin._isNaN;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectivityReceiver extends BroadcastReceiver implements JuspayDuiHook {
    private static final String LOG_TAG = "ConnectivityReceiver";
    private final Map<Activity, Boolean> attachedMap = new WeakHashMap();
    private final JuspayServices juspayServices;

    public ConnectivityReceiver(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    private boolean isMobileDataOn() {
        try {
            Context context = this.juspayServices.getContext();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            boolean z = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0;
            if (_isNaN.checkSelfPermission(context, "android.permission.READ_BASIC_PHONE_STATE") == 0) {
                if (telephonyManager.isDataEnabled() && z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean isNetworkAvailable() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.juspayServices.getContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.IS_NETWORK_AVAILABLE, "network failure", e);
            return false;
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public void attach(Activity activity) {
        Boolean bool = this.attachedMap.get(activity);
        if (bool == null || !bool.booleanValue()) {
            activity.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            JuspayServices juspayServices = this.juspayServices;
            String str = LOG_TAG;
            juspayServices.sdkDebug(str, "Attaching the ".concat(String.valueOf(str)));
            this.attachedMap.put(activity, Boolean.TRUE);
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public void detach(Activity activity) {
        Boolean bool = this.attachedMap.get(activity);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        activity.unregisterReceiver(this);
        JuspayServices juspayServices = this.juspayServices;
        String str = LOG_TAG;
        juspayServices.sdkDebug(str, "Detaching the ".concat(String.valueOf(str)));
        this.attachedMap.put(activity, Boolean.FALSE);
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public String execute(Activity activity, String str, JSONObject jSONObject) {
        return String.valueOf(isNetworkAvailable());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("connected", String.valueOf(isNetworkAvailable()));
            jSONObject.put("networkType", getNetworkType());
            jSONObject.put("isMobileDataOn", String.valueOf(isMobileDataOn()));
        } catch (JSONException unused) {
        }
        this.juspayServices.getJBridge().invokeFnInDUIWebview("onNetworkChange", jSONObject.toString());
    }

    private String getNetworkType() {
        return this.juspayServices.getSessionInfo().getNetworkInfo() != null ? this.juspayServices.getSessionInfo().getNetworkInfo() : "";
    }
}
