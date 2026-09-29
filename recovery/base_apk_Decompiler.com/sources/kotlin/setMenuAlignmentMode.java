package kotlin;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/setMenuAlignmentMode;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "", "write", "(Z)Ljava/util/Map;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setMenuAlignmentMode {
    public static final setMenuAlignmentMode INSTANCE = new setMenuAlignmentMode();

    private setMenuAlignmentMode() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("filter", p2);
        map2.put("source", p1);
        if (p3 != null) {
            String lowerCase = p3.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            map2.put("filter_subject", lowerCase);
        }
        return new Pair<>(p0, map);
    }

    public static Map<String, Object> write(boolean p0) {
        HashMap map = new HashMap();
        map.put("toggle", p0 ? "show" : "hide");
        return map;
    }

    public static Map<String, Object> RemoteActionCompatParcelizer(boolean p0) {
        HashMap map = new HashMap();
        map.put("toggle", p0 ? "single" : "multi");
        return map;
    }
}
