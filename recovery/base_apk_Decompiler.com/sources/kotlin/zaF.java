package kotlin;

import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000fJ-\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fJ5\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/zaF;", "", "<init>", "()V", "Lo/zaB;", "p0", "", "p1", "Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Lo/zaB;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "", "read", "(Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zaF {
    public static final zaF INSTANCE = new zaF();

    private zaF() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(zaB p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("device_kyc_initiated", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("source", PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(p1)), setAction.write("initiate_kyc", Boolean.valueOf(p0.getInitiateKyc())), setAction.write(LoggedUserResponse.KEY_KYC_STATUS, p0.getKycStatus()), setAction.write("transaction_id", p0.getTransactionId())));
    }

    public static Pair<String, Map<String, String>> read(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("user_id", p0);
        map2.put("device_count", String.valueOf(p1));
        return new Pair<>("device_kyc_enabled", map);
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("user_id", p0);
        return new Pair<>("hyperverge_link_click", map);
    }

    public static Pair<String, Map<String, String>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("user_id", p0);
        return new Pair<>("hyperverge_link_failed", map);
    }

    public static Pair<String, Map<String, String>> RemoteActionCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new Pair<>("kyc_upload_result", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("transaction_id", p1), setAction.write("result", p0)));
    }
}
