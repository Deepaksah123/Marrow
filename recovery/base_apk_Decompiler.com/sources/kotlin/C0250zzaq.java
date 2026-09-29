package kotlin;

import com.marrow.data.models.mcq.McqParentInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.zzaq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\f\u0010\bJ-\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lo/zzaq;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "IconCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "p0", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0250zzaq {
    public static final C0250zzaq INSTANCE = new C0250zzaq();

    private C0250zzaq() {
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("source", "qbank_top_half");
        return new Pair<>("custom_module_clicked", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put(McqParentInfo.PARENT_TYPE_CUSTOM_MODULE, p0);
        return new Pair<>("cm_card_clicked", map);
    }

    public static Pair<String, Map<String, String>> read() {
        HashMap map = new HashMap();
        map.put("source", "qbank");
        return new Pair<>("lesson_list", map);
    }

    public static Pair<String, Map<String, String>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("subject_id", p0);
        return new Pair<>("qb_subject_selected", map);
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("source", p0);
        return new Pair<>("bm_opened", map);
    }

    public static Pair<String, Map<String, String>> write() {
        return new Pair<>("schema_opened", VideoTimelineResponseBody.read());
    }
}
