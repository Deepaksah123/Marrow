package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/isAtLeastN;", "", "<init>", "()V", "", "p0", "Lo/getSubscriptionExpiresOn;", "", "", "write", "(I)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAtLeastN {
    public static final isAtLeastN INSTANCE = new isAtLeastN();

    private isAtLeastN() {
    }

    public static Pair<String, Map<String, Integer>> write(int p0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(p0));
        return new Pair<>("country_check_banner_shown", linkedHashMap);
    }

    public static Pair<String, Map<String, Integer>> IconCompatParcelizer(int p0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(p0));
        return new Pair<>("country_check_vpn_popup_shown", linkedHashMap);
    }
}
