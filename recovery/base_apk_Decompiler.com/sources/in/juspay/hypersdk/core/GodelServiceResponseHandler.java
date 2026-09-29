package in.juspay.hypersdk.core;

import android.os.Handler;
import android.os.Message;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.utils.Utils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class GodelServiceResponseHandler extends Handler {
    private static final String TAG = "GodelServiceResponseHandler";
    private String callBackFnName;
    private final JuspayServices juspayServices;

    GodelServiceResponseHandler(String str, JuspayServices juspayServices) {
        this.callBackFnName = str;
        this.juspayServices = juspayServices;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.callBackFnName != null) {
            SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
            try {
                JSONObject json = Utils.toJSON(message.getData());
                json.put("code", message.what);
                StringBuilder sb = new StringBuilder("Got response from the MPIN SDK: ");
                sb.append(json.toString(2));
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_SERVICE_RESPONSE_HANDLER, "gsrh_handle_message", sb.toString());
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_SERVICE_RESPONSE_HANDLER, "gsrh_handle_message", "Sending response back to micro-app");
                this.juspayServices.getJBridge().invokeCallbackInDUIWebview(this.callBackFnName, json.toString());
            } catch (Exception e) {
                sdkTracker.trackAndLogException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.MPIN_UTIL, "Exception while trying to handle message", e);
            }
        }
        this.callBackFnName = null;
    }
}
