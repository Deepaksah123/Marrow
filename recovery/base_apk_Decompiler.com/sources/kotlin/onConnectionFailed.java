package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\f\u0010\nJ%\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\r\u0010\nJ-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/onConnectionFailed;", "", "<init>", "()V", "", "p0", "Lo/getSubscriptionExpiresOn;", "", "", "RemoteActionCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "(Z)Lo/getSubscriptionExpiresOn;", "write", "AudioAttributesCompatParcelizer", "read", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "(Z)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onConnectionFailed {
    public static final onConnectionFailed INSTANCE = new onConnectionFailed();

    private onConnectionFailed() {
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("magic_module_solve", VideoTimelineResponseBody.read(setAction.write(FilterParams.KEY_MODE, IconCompatParcelizer(false))));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(boolean p0) {
        return new Pair<>("magic_module_submit", VideoTimelineResponseBody.read(setAction.write(FilterParams.KEY_MODE, IconCompatParcelizer(p0))));
    }

    public static Pair<String, Map<String, Object>> write() {
        return new Pair<>("magic_module_review", new HashMap());
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("magic_module_banner_show", new HashMap());
    }

    public static Pair<String, Map<String, Object>> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("source", p0);
        return new Pair<>("magic_module_opened", map);
    }

    private static String IconCompatParcelizer(boolean p0) {
        return p0 ? "exam" : "regular";
    }
}
