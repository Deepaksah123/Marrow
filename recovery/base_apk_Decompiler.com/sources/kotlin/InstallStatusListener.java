package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\f\u0010\u000eJ5\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0010J%\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0011\u0010\bJ%\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0012\u0010\bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\f\u0010\bJ-\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ%\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/InstallStatusListener;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "IconCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "p0", "read", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "write", "", "(I)Lo/getSubscriptionExpiresOn;", "p1", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstallStatusListener {
    public static final InstallStatusListener INSTANCE = new InstallStatusListener();

    private InstallStatusListener() {
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer() {
        return new Pair<>("pearl_opened", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("subject", p0);
        return new Pair<>("pearl_subject_selected", map);
    }

    public static Pair<String, Map<String, String>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("subject", p0);
        return new Pair<>("pearl_subject_index_selected", map);
    }

    public static Pair<String, Map<String, String>> write(int p0) {
        HashMap map = new HashMap();
        map.put("bookmark_type", String.valueOf(p0));
        return new Pair<>("pearl_bookmark_filtered", map);
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("pearl_id", p0);
        map2.put("source", p1);
        return new Pair<>("pearl_detail_opened", map);
    }

    public static Pair<String, Map<String, String>> RemoteActionCompatParcelizer() {
        return new Pair<>("pearl_copy", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer() {
        return new Pair<>("pearl_report", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> write() {
        return new Pair<>("pearl_share", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(int p0) {
        HashMap map = new HashMap();
        map.put("bookmark_type", String.valueOf(p0));
        return new Pair<>("pearl_bookmark", map);
    }

    public static Pair<String, Map<String, String>> read() {
        return new Pair<>("pearl_related_mcq_opened", VideoTimelineResponseBody.read());
    }
}
