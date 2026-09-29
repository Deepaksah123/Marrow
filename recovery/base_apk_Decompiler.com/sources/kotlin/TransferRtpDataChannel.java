package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/TransferRtpDataChannel;", "", "<init>", "()V", "", "p0", "p1", "Lo/getSubscriptionExpiresOn;", "", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferRtpDataChannel {
    public static final TransferRtpDataChannel INSTANCE = new TransferRtpDataChannel();

    private TransferRtpDataChannel() {
    }

    public static Pair<String, Map<String, String>> write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return setAction.write("purchase_success", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("plan_id", p0), setAction.write("group_id", p1)));
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return setAction.write("purchase_failure", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("plan_id", p0), setAction.write("group_id", p1)));
    }
}
