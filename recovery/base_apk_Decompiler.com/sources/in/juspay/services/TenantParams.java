package in.juspay.services;

import in.juspay.hyper.bridge.HyperBridge;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface TenantParams {
    default String getBaseContent() {
        return null;
    }

    default String getBootLoaderEndpoint() {
        return null;
    }

    List<Class<? extends HyperBridge>> getBridgeClasses();

    default JSONObject getLogsEndPoint() {
        return null;
    }

    String getTenant();
}
