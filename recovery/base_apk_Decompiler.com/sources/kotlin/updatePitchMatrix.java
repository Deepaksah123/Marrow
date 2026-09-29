package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\bJ%\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u000b\u0010\bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\f\u0010\bJ%\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lo/updatePitchMatrix;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "RemoteActionCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "write", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updatePitchMatrix {
    public static final updatePitchMatrix INSTANCE = new updatePitchMatrix();

    private updatePitchMatrix() {
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("cm_join", new HashMap());
    }

    public static Pair<String, Map<String, Object>> AudioAttributesImplApi26Parcelizer() {
        return new Pair<>("cm_solve", new HashMap());
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("source", "cm_create");
        return new Pair<>("cm_review", map);
    }

    public static Pair<String, Map<String, Object>> write() {
        HashMap map = new HashMap();
        map.put("source", "cm_create");
        return new Pair<>("cm_copy", map);
    }

    public static Pair<String, Map<String, Object>> read() {
        HashMap map = new HashMap();
        map.put("source", "cm_create");
        return new Pair<>("cm_share", map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("source", "cm_create");
        return new Pair<>("cm_discard", map);
    }
}
