package in.juspay.hypersdk.lifecycle;

import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperRequestPermissionDelegate;", "Lin/juspay/hypersdk/ui/RequestPermissionDelegate;", "Lin/juspay/hypersdk/core/JuspayServices;", "p0", "<init>", "(Lin/juspay/hypersdk/core/JuspayServices;)V", "", "clearQueue", "()V", "fragmentAttached", "", "", "", "p1", "requestPermission", "([Ljava/lang/String;I)V", "juspayServices", "Lin/juspay/hypersdk/core/JuspayServices;", "Ljava/util/Queue;", "Lin/juspay/hypersdk/lifecycle/HyperRequestPermissionDelegate$RequestQueueData;", "requestQueue", "Ljava/util/Queue;", "RequestQueueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HyperRequestPermissionDelegate implements RequestPermissionDelegate {
    private final JuspayServices juspayServices;
    private final Queue<RequestQueueData> requestQueue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperRequestPermissionDelegate$RequestQueueData;", "", "", "", "p0", "", "p1", "<init>", "([Ljava/lang/String;I)V", "requestCode", "I", "getRequestCode", "()I", "requests", "[Ljava/lang/String;", "getRequests", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class RequestQueueData {
        private final int requestCode;
        private final String[] requests;

        public RequestQueueData(String[] strArr, int i) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            this.requests = strArr;
            this.requestCode = i;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String[] getRequests() {
            return this.requests;
        }
    }

    public HyperRequestPermissionDelegate(JuspayServices juspayServices) {
        toMagicModuleMetaRepoModel.write(juspayServices, "");
        this.juspayServices = juspayServices;
        this.requestQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.requestQueue.clear();
    }

    public final void fragmentAttached() {
        for (RequestQueueData requestQueueData : this.requestQueue) {
            requestPermission(requestQueueData.getRequests(), requestQueueData.getRequestCode());
        }
    }

    @Override // in.juspay.hypersdk.ui.RequestPermissionDelegate
    public final void requestPermission(String[] p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HyperFragment fragment = this.juspayServices.getFragment();
        if (fragment == null || !fragment.isAdded()) {
            this.requestQueue.add(new RequestQueueData(p0, p1));
        } else {
            fragment.requestPermissions(p0, p1);
        }
    }
}
