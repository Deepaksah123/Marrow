package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/SavePasswordRequest;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "write", "()Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavePasswordRequest {
    public static final SavePasswordRequest INSTANCE = new SavePasswordRequest();

    private SavePasswordRequest() {
    }

    public static Pair<String, Map<String, String>> write() {
        return setAction.write("cm_submit", VideoTimelineResponseBody.read());
    }
}
