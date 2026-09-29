package kotlin;

import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\n0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/marrow2/ui/feedback/analytics/LessonFeedbackAnalytics;", "", "<init>", "()V", "RATING", "", "QB_RATE", "rateQbank", "Lkotlin/Pair;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "rating", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRawData {
    public static final getRawData RemoteActionCompatParcelizer = new getRawData();

    private getRawData() {
    }

    public static Pair<String, HashMap<String, Object>> IconCompatParcelizer(int i) {
        HashMap map = new HashMap();
        map.put("rating", Integer.valueOf(i));
        return new Pair<>("qb_rate", map);
    }
}
