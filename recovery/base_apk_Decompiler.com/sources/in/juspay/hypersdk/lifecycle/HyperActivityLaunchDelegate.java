package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperActivityLaunchDelegate;", "Lin/juspay/hypersdk/ui/ActivityLaunchDelegate;", "Lin/juspay/hypersdk/core/JuspayServices;", "p0", "<init>", "(Lin/juspay/hypersdk/core/JuspayServices;)V", "", "clearQueue", "()V", "fragmentAttached", "Landroid/content/Intent;", "", "p1", "Landroid/os/Bundle;", "p2", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "juspayServices", "Lin/juspay/hypersdk/core/JuspayServices;", "Ljava/util/Queue;", "Lin/juspay/hypersdk/lifecycle/HyperActivityLaunchDelegate$IntentQueueData;", "startActivityQueue", "Ljava/util/Queue;", "IntentQueueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HyperActivityLaunchDelegate implements ActivityLaunchDelegate {
    private final JuspayServices juspayServices;
    private final Queue<IntentQueueData> startActivityQueue;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperActivityLaunchDelegate$IntentQueueData;", "", "Landroid/content/Intent;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "<init>", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "component1", "()Landroid/content/Intent;", "component2", "()I", "component3", "()Landroid/os/Bundle;", "copy", "(Landroid/content/Intent;ILandroid/os/Bundle;)Lin/juspay/hypersdk/lifecycle/HyperActivityLaunchDelegate$IntentQueueData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "bundle", "Landroid/os/Bundle;", "getBundle", "intent", "Landroid/content/Intent;", "getIntent", "requestCode", "I", "getRequestCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class IntentQueueData {
        private final Bundle bundle;
        private final Intent intent;
        private final int requestCode;

        public IntentQueueData(Intent intent, int i, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(intent, "");
            this.intent = intent;
            this.requestCode = i;
            this.bundle = bundle;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public static /* synthetic */ IntentQueueData copy$default(IntentQueueData intentQueueData, Intent intent, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                intent = intentQueueData.intent;
            }
            if ((i2 & 2) != 0) {
                i = intentQueueData.requestCode;
            }
            if ((i2 & 4) != 0) {
                bundle = intentQueueData.bundle;
            }
            return intentQueueData.copy(intent, i, bundle);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRequestCode() {
            return this.requestCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        public final IntentQueueData copy(Intent p0, int p1, Bundle p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new IntentQueueData(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IntentQueueData)) {
                return false;
            }
            IntentQueueData intentQueueData = (IntentQueueData) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.intent, intentQueueData.intent) && this.requestCode == intentQueueData.requestCode && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bundle, intentQueueData.bundle);
        }

        public final int hashCode() {
            int iHashCode = this.intent.hashCode();
            int iHashCode2 = Integer.hashCode(this.requestCode);
            Bundle bundle = this.bundle;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntentQueueData(intent=");
            sb.append(this.intent);
            sb.append(", requestCode=");
            sb.append(this.requestCode);
            sb.append(", bundle=");
            sb.append(this.bundle);
            sb.append(')');
            return sb.toString();
        }
    }

    public HyperActivityLaunchDelegate(JuspayServices juspayServices) {
        toMagicModuleMetaRepoModel.write(juspayServices, "");
        this.juspayServices = juspayServices;
        this.startActivityQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.startActivityQueue.clear();
    }

    public final void fragmentAttached() {
        for (IntentQueueData intentQueueData : this.startActivityQueue) {
            startActivityForResult(intentQueueData.getIntent(), intentQueueData.getRequestCode(), intentQueueData.getBundle());
        }
    }

    @Override // in.juspay.hypersdk.ui.ActivityLaunchDelegate
    public final void startActivityForResult(Intent p0, int p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HyperFragment fragment = this.juspayServices.getFragment();
        if (fragment == null || !fragment.isAdded()) {
            this.startActivityQueue.add(new IntentQueueData(p0, p1, p2));
        } else {
            fragment.startActivityForResult(p0, p1, p2);
        }
    }
}
