package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\bJ%\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u000b\u0010\bJ/\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\rJ/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lo/ICancelTokenStub;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "read", "()Lo/getSubscriptionExpiresOn;", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "p0", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ICancelTokenStub {
    public static final ICancelTokenStub INSTANCE = new ICancelTokenStub();

    private ICancelTokenStub() {
    }

    public static Pair<String, Map<String, Object>> read() {
        return new Pair<>("purchase_buy_notes_buy_now", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> write() {
        return new Pair<>("purchase_buy_notes_information_added", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("purchase_buy_notes_confirm_and_pay", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("purchase_buy_notes_track_purchase", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0) {
        if (p0 == null) {
            p0 = "";
        }
        return setAction.write("notes_address_form_opened", VideoTimelineResponseBody.read(setAction.write("plan_id", p0)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0) {
        if (p0 == null) {
            p0 = "";
        }
        return new Pair<>("notes_address_form_submitted", VideoTimelineResponseBody.read(setAction.write("plan_id", p0)));
    }
}
