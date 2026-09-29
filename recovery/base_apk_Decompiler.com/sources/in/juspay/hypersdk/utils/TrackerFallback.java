package in.juspay.hypersdk.utils;

import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.api.models.response.payment.SdkPayloadKt;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.C0156TypeKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TrackerFallback {
    private int count;
    private boolean enableTrackerFallback;
    private NetUtils netUtils;
    private List<String> requiredKeysList;

    public TrackerFallback(JSONObject jSONObject) {
        this.count = 3;
        if (jSONObject == null || !jSONObject.has("enableTrackerFallback")) {
            return;
        }
        try {
            this.netUtils = new NetUtils(0, 0);
            this.enableTrackerFallback = jSONObject.optBoolean("enableTrackerFallback", true);
            this.count = jSONObject.optInt("trackerFallbackAttempts", 3);
            this.requiredKeysList = Arrays.asList("action", "orderId", "clientId", "merchantId", PayloadKt.KEY_JP_CUSTOMER_ID, "os", "os_version", "app_version", SdkPayloadKt.KEY_JP_REQUEST_ID);
        } catch (Exception unused) {
        }
    }

    private HashMap<String, String> getQueryParams(JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        ArrayList<String> arrayList = new ArrayList();
        LogType logType2 = LogType.PROCESS_END;
        if (logType == logType2) {
            arrayList.add("errorMessage");
            arrayList.add("errorCode");
        }
        if (logType == LogType.INITIATE_RESULT || logType == logType2) {
            arrayList.add(PaymentConstants.CLIENT_ID);
            arrayList.add(PaymentConstants.MERCHANT_ID);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        JSONObject sessionData = juspayServices.getSessionInfo().getSessionData();
        HashMap<String, String> map = new HashMap<>();
        List<String> list = this.requiredKeysList;
        if (list != null) {
            for (String str : list) {
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(str)) {
                    map.put(str, jSONObjectOptJSONObject.optString(str, ""));
                } else if (sessionData.has(str)) {
                    map.put(str, sessionData.optString(str, ""));
                } else if (jSONObject.has(str)) {
                    map.put(str, jSONObject.optString(str, ""));
                }
            }
        }
        for (String str2 : arrayList) {
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(str2)) {
                map.put(str2, jSONObjectOptJSONObject.optString(str2, ""));
            } else if (jSONObject.has(str2)) {
                map.put(str2, jSONObject.optString(str2, ""));
            }
        }
        map.put("sessionId", juspayServices.getSessionInfo().getSessionId());
        map.put("logtype", logType.name());
        return map;
    }

    /* JADX INFO: renamed from: lambda$log$0$in-juspay-hypersdk-utils-TrackerFallback, reason: not valid java name */
    /* synthetic */ void m374lambda$log$0$injuspayhypersdkutilsTrackerFallback(JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        try {
            if (!this.enableTrackerFallback || this.netUtils == null) {
                return;
            }
            for (int i = 0; i < this.count; i++) {
                C0156TypeKt c0156TypeKtDoGet = this.netUtils.doGet("https://assets.juspay.in/a.html", new HashMap(), getQueryParams(juspayServices, jSONObject, logType), new JSONObject(), null);
                try {
                    if (c0156TypeKtDoGet.getCode() == 200) {
                        c0156TypeKtDoGet.close();
                        return;
                    }
                    c0156TypeKtDoGet.close();
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    public void log(final JSONObject jSONObject, final JuspayServices juspayServices, final LogType logType) {
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.utils.TrackerFallback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m374lambda$log$0$injuspayhypersdkutilsTrackerFallback(juspayServices, jSONObject, logType);
            }
        });
    }
}
