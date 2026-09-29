package in.juspay.hypersdk.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MPINUtil {
    private static final String TAG = "MPINUtil";
    private static HashMap<String, MPINUtil> orchestrator;
    private final ComponentName component;
    private GodelServiceConnection connection;

    private MPINUtil(JuspayServices juspayServices, String str, String str2) {
        this.connection = new GodelServiceConnection(juspayServices);
        this.component = new ComponentName(str, str2);
    }

    private boolean bind(Context context) {
        Intent intent = new Intent();
        intent.setComponent(this.component);
        return context.bindService(intent, this.connection, 1);
    }

    public static void closeAllConnections(Context context) {
        HashMap<String, MPINUtil> map = orchestrator;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                closeConnection(it.next(), context);
            }
        }
        orchestrator = null;
    }

    public static void closeConnection(String str, Context context) {
        HashMap<String, MPINUtil> map = orchestrator;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        MPINUtil mPINUtil = orchestrator.get(str);
        if (mPINUtil != null) {
            mPINUtil.unbind(context);
        }
        orchestrator.remove(str);
    }

    public static void communicate(String str, String str2, int i, Bundle bundle, JuspayServices juspayServices, String str3) {
        MPINUtil mPINUtil;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            StringBuilder sb = new StringBuilder("Attempting to communicate to ");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", sb.toString());
            if (orchestrator == null) {
                orchestrator = new HashMap<>();
            }
            if (orchestrator.containsKey(str)) {
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", "Fetching existing instance from orchestrator");
                mPINUtil = orchestrator.get(str);
            } else {
                MPINUtil mPINUtil2 = new MPINUtil(juspayServices, str, str2);
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", "Creating new MPINUtil instance in orchestrator");
                if (!mPINUtil2.bind(juspayServices.getContext())) {
                    sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", "Failed to bind to MPIN SDK. Reporting Bind Failure back to mApp");
                    reportBindFailure(i, juspayServices, str3);
                    return;
                } else {
                    orchestrator.put(str, mPINUtil2);
                    mPINUtil = mPINUtil2;
                }
            }
            if (mPINUtil != null && mPINUtil.connection != null) {
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", "Requesting a connection with MPIN SDK");
                mPINUtil.connection.request(i, bundle, new GodelServiceResponseHandler(str3, juspayServices));
                return;
            }
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", (mPINUtil == null ? "mpinUtil" : "mpinUtil.connection").concat(" is null. Reporting Bind Failure back to mApp"));
            reportBindFailure(i, juspayServices, str3);
        } catch (Exception e) {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.MPIN_UTIL, "mpinutil_communicate", "Failed to bind to MPIN SDK. Reporting Bind Failure back to mApp");
            sdkTracker.trackAndLogException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.MPIN_UTIL, "Exception while trying to connect", e);
            reportBindFailure(i, juspayServices, str3);
        }
    }

    static void reportBindFailure(int i, JuspayServices juspayServices, String str) {
        if (str != null) {
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", i);
                jSONObject.put("error", true);
                jSONObject.put("message", "BIND_FAILURE");
            } catch (Exception e) {
                sdkTracker.trackAndLogException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.MPIN_UTIL, "Exception while creating bind failure response", e);
            }
            juspayServices.getJBridge().invokeCallbackInDUIWebview(str, jSONObject.toString());
        }
    }

    private void unbind(Context context) {
        GodelServiceConnection godelServiceConnection = this.connection;
        if (godelServiceConnection == null || !godelServiceConnection.isBound) {
            return;
        }
        try {
            context.unbindService(godelServiceConnection);
        } catch (Exception unused) {
        }
        this.connection = null;
    }
}
