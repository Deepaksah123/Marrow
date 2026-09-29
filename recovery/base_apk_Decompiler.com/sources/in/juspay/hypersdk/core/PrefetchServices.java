package in.juspay.hypersdk.core;

import android.content.Context;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.utils.network.NetUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class PrefetchServices {
    private static final String LOG_TAG = "PrefetchServices";

    static /* synthetic */ void lambda$preFetch$0() {
    }

    public static void preFetch(Context context, JSONObject jSONObject, String str) {
        JuspayCoreLib.setApplicationContext(context.getApplicationContext());
        NetUtils.setApplicationHeaders(context);
        try {
            jSONObject.put("pre_fetch", "true");
            jSONObject.put("use_local_assets", jSONObject.optBoolean("useLocalAssets", context.getResources().getBoolean(R.bool.use_local_assets)));
            JuspayServices juspayServices = new JuspayServices(context, null, str, true);
            juspayServices.setBundleParameter(jSONObject);
            juspayServices.initiate(new Runnable() { // from class: in.juspay.hypersdk.core.PrefetchServices$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PrefetchServices.lambda$preFetch$0();
                }
            });
        } catch (Exception e) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.PREFETCH, "Exception happened in PREFETCH", e);
        }
    }
}
