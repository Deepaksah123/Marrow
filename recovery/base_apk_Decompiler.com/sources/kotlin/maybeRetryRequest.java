package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeRetryRequest extends requiresSecureDecoder<setUseDrmSessionsForClearContent> {
    public maybeRetryRequest() {
    }

    public maybeRetryRequest(List<setUseDrmSessionsForClearContent> list) {
        super(list);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // kotlin.requiresSecureDecoder
    public final Entry IconCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer()).IconCompatParcelizer((int) createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver());
    }
}
