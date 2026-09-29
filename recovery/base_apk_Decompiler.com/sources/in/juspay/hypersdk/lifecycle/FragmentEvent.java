package in.juspay.hypersdk.lifecycle;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lin/juspay/hypersdk/lifecycle/FragmentEvent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "ON_PAUSE", "ON_RESUME", "ON_STOP", "ON_DESTROY", "ON_SAVED_STATE_INSTANCE", "ON_ACTIVITY_RESULT", "ON_REQUEST_PERMISSION_RESULT", "ON_ATTACH"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum FragmentEvent {
    ON_PAUSE("onPause"),
    ON_RESUME("onResume"),
    ON_STOP("onStop"),
    ON_DESTROY("onDestroy"),
    ON_SAVED_STATE_INSTANCE("OnSavedStateInstance"),
    ON_ACTIVITY_RESULT("onActivityResult"),
    ON_REQUEST_PERMISSION_RESULT("onRequestPermissionResult"),
    ON_ATTACH("onAttach");

    private final String key;

    FragmentEvent(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
