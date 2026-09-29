package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b¢\u0006\u0004\b\f\u0010\u0010J%\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b¢\u0006\u0004\b\n\u0010\u0010"}, d2 = {"Lo/setErrorContentDescription;", "", "<init>", "()V", "", "p0", "", "p1", "Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;", "read", "(I)Ljava/lang/String;", "write", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "()Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setErrorContentDescription {
    public static final setErrorContentDescription INSTANCE = new setErrorContentDescription();

    private setErrorContentDescription() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("category", "video");
        map2.put("card_reason", read(p1));
        map2.put("contentid", p0);
        map2.put("source", "video_home_page");
        return new Pair<>("suggested_card", map);
    }

    private static String read(int p0) {
        if (p0 == 1) {
            return "Paused";
        }
        return "Next";
    }

    public static Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("subject_id", p0);
        return new Pair<>("video_subject_selected", map);
    }

    public static Pair<String, Map<String, Object>> read() {
        return setAction.write("video_cadaveric_banner_shown", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return setAction.write("video_cadaveric_banner_clicked", VideoTimelineResponseBody.read());
    }
}
