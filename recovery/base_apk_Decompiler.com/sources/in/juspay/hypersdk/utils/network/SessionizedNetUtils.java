package in.juspay.hypersdk.utils.network;

import in.juspay.hypersdk.data.SessionInfo;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class SessionizedNetUtils extends NetUtils {
    private final SessionInfo sessionInfo;

    public SessionizedNetUtils(SessionInfo sessionInfo, int i, int i2, boolean z) {
        super(i, i2, z);
        this.sessionInfo = sessionInfo;
    }

    private String trimClientId(String str) {
        Matcher matcher = Pattern.compile("^(.*)_android$", 2).matcher(str);
        return (!matcher.matches() || matcher.groupCount() <= 0) ? str : matcher.group(1);
    }

    @Override // in.juspay.hypersdk.utils.network.NetUtils
    protected Map<String, String> getDefaultSDKHeaders() {
        Map<String, String> defaultSDKHeaders = super.getDefaultSDKHeaders();
        defaultSDKHeaders.put("x-merchant-id", this.sessionInfo.tryGetMerchantId());
        String strTryGetClientId = this.sessionInfo.tryGetClientId();
        if (strTryGetClientId != null) {
            strTryGetClientId = trimClientId(strTryGetClientId);
        }
        defaultSDKHeaders.put("x-client-id", strTryGetClientId);
        return defaultSDKHeaders;
    }
}
