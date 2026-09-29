package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.updateVideoFrameProcessingOffsetCounters;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000eJ-\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/colorRangeToString;", "", "<init>", "()V", "Lo/updateVideoFrameProcessingOffsetCounters$read;", "p0", "Lo/getSubscriptionExpiresOn;", "", "", "IconCompatParcelizer", "(Lo/updateVideoFrameProcessingOffsetCounters$read;)Lo/getSubscriptionExpiresOn;", "read", "()Lo/getSubscriptionExpiresOn;", "", "(I)Lo/getSubscriptionExpiresOn;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "p1", "write", "(Ljava/lang/String;Ljava/lang/Integer;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class colorRangeToString {
    public static final colorRangeToString INSTANCE = new colorRangeToString();

    private colorRangeToString() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(updateVideoFrameProcessingOffsetCounters.read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put(FilterParams.KEY_MODE, p0 == updateVideoFrameProcessingOffsetCounters.read.RemoteActionCompatParcelizer ? "qa" : "review");
        return new Pair<>("bm_mode", map);
    }

    public static Pair<String, Map<String, Object>> read() {
        return new Pair<>("bm_list", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("subject", "all"), setAction.write("bookmark_type", 0)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(int p0) {
        return new Pair<>("bm_list", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("subject", "all"), setAction.write("bookmark_type", Integer.valueOf(p0))));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("bm_list", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("subject", p0), setAction.write("bookmark_type", 0)));
    }

    public static Pair<String, Map<String, Object>> write(String p0, Integer p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("subject", p0);
        if (p1 != null) {
            map2.put("bookmark_type", p1);
        }
        return setAction.write("bm_filter", map);
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("bm_filter", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("subject", p0), setAction.write("bookmark_type", Integer.valueOf(p1))));
    }
}
