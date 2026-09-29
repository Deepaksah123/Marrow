package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b0\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ=\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Lo/zzpt;", "", "<init>", "()V", "", "p0", "p1", "Lo/getSubscriptionExpiresOn;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "", "p2", "(Ljava/lang/String;ZZ)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzpt {
    public static final zzpt INSTANCE = new zzpt();

    private zzpt() {
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0, String p1) {
        Pair[] pairArr = new Pair[2];
        if (p0 == null) {
            p0 = "";
        }
        pairArr[0] = setAction.write("exam", p0);
        if (p1 == null) {
            p1 = "";
        }
        pairArr[1] = setAction.write("subject_title", p1);
        return new Pair<>("schema_filter", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairArr));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("schema_sort", VideoTimelineResponseBody.read(setAction.write("sort_type", p0)));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0, boolean p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("schema_detail_opened", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("schema_id", p0), setAction.write("schema_status", p1 ? "complete" : "incomplete"), setAction.write("weak_topic", Boolean.valueOf(p2))));
    }
}
