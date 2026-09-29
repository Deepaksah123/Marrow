package kotlin;

import com.marrow.data.models.test.TestStatusResponse;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletWalletOptions {
    public static final Wallet write(TestStatusResponse testStatusResponse) {
        toMagicModuleMetaRepoModel.write(testStatusResponse, "");
        String testId = testStatusResponse.getTestId();
        String activeDeviceId = testStatusResponse.getActiveDeviceId();
        String str = activeDeviceId == null ? "" : activeDeviceId;
        String platform = testStatusResponse.getPlatform();
        String str2 = platform == null ? "" : platform;
        int testStatus = testStatusResponse.getTestStatus();
        List<String> instructions = testStatusResponse.getInstructions();
        if (instructions == null) {
            instructions = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new Wallet(testId, str, str2, testStatus, instructions);
    }
}
