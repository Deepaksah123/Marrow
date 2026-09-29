package in.juspay.hypersdk.services;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SdkConfigService {
    private static final String sdkConfigLocation = "sdk_config.json";
    private final JuspayServices juspayServices;
    private JSONObject sdkConfig = new JSONObject();

    public SdkConfigService(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        renewConfig(juspayServices.getContext());
    }

    public JSONObject getSdkConfig() {
        return this.sdkConfig;
    }

    public void renewConfig(Context context) {
        try {
            String fromFile = this.juspayServices.getFileProviderService().readFromFile(context, sdkConfigLocation);
            if (fromFile.isEmpty()) {
                fromFile = "{}";
            }
            this.sdkConfig = new JSONObject(fromFile);
        } catch (JSONException e) {
            this.juspayServices.getSdkTracker().trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, PaymentConstants.SDK_CONFIG, "Exception while parsing renewed sdk config", e);
        }
    }
}
