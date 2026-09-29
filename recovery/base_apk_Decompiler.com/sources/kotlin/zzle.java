package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/zzle;", "", "<init>", "()V", "", "p0", "", "p1", "Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Ljava/lang/String;Z)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzle {
    public static final zzle INSTANCE = new zzle();

    private zzle() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("schema_mcq_opened", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("schema_id", p0), setAction.write("weak_topic", Boolean.valueOf(p1))));
    }
}
