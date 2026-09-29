package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lo/zzfx;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "p0", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzfx {
    public static final zzfx INSTANCE = new zzfx();

    private zzfx() {
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer() {
        return new Pair<>("recent_updates_opened", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("recent_update_id", p0);
        return new Pair<>("recent_updates_read", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("recent_update_id", p0);
        return new Pair<>("recent_updates_share", map);
    }
}
