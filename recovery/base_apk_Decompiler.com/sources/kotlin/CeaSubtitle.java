package kotlin;

import com.marrow.ui.activities.base.BaseActivity;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class CeaSubtitle {
    public static void RemoteActionCompatParcelizer(BaseActivity baseActivity, Lazy<BandwidthMeterEventListenerEventDispatcherHandlerAndListener> lazy) {
        baseActivity.syncManager = lazy;
    }
}
