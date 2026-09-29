package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lo/SignInHubActivity;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "read", "()Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignInHubActivity {
    public static final SignInHubActivity INSTANCE = new SignInHubActivity();

    private SignInHubActivity() {
    }

    public static Pair<String, Map<String, String>> read() {
        return new Pair<>("edition_update_popup_shown", VideoTimelineResponseBody.read(setAction.write("new_edition", "8.5")));
    }

    public static Pair<String, Map<String, String>> RemoteActionCompatParcelizer() {
        return new Pair<>("edition_update_popup_clicked", VideoTimelineResponseBody.read(setAction.write("new_edition", "8.5")));
    }
}
