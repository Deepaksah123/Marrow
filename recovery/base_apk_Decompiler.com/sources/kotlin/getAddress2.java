package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\bJ5\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Lo/getAddress2;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "p0", "p1", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAddress2 {
    public static final getAddress2 INSTANCE = new getAddress2();

    private getAddress2() {
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer() {
        return new Pair<>("qb_exit", new HashMap());
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return new Pair<>("cm_exit", new HashMap());
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        return new Pair<>("qb_submit", map);
    }
}
