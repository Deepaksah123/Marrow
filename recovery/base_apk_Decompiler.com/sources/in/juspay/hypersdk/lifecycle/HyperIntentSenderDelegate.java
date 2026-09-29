package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJK\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperIntentSenderDelegate;", "Lin/juspay/hypersdk/ui/IntentSenderDelegate;", "Lin/juspay/hypersdk/core/JuspayServices;", "p0", "<init>", "(Lin/juspay/hypersdk/core/JuspayServices;)V", "", "clearQueue", "()V", "fragmentAttached", "Landroid/content/IntentSender;", "", "p1", "Landroid/content/Intent;", "p2", "p3", "p4", "p5", "Landroid/os/Bundle;", "p6", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "Ljava/util/Queue;", "Lin/juspay/hypersdk/lifecycle/HyperIntentSenderDelegate$IntentQueueData;", "intentSenderQueue", "Ljava/util/Queue;", "juspayServices", "Lin/juspay/hypersdk/core/JuspayServices;", "IntentQueueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HyperIntentSenderDelegate implements IntentSenderDelegate {
    private final Queue<IntentQueueData> intentSenderQueue;
    private final JuspayServices juspayServices;

    public HyperIntentSenderDelegate(JuspayServices juspayServices) {
        toMagicModuleMetaRepoModel.write(juspayServices, "");
        this.juspayServices = juspayServices;
        this.intentSenderQueue = new ConcurrentLinkedQueue();
    }

    public final void clearQueue() {
        this.intentSenderQueue.clear();
    }

    public final void fragmentAttached() {
        for (IntentQueueData intentQueueData : this.intentSenderQueue) {
            startIntentSenderForResult(intentQueueData.getIntentSender(), intentQueueData.getRequestCode(), intentQueueData.getFillInIntent(), intentQueueData.getFlagMask(), intentQueueData.getFlagValues(), intentQueueData.getExtraFlags(), intentQueueData.getOptions());
        }
    }

    @Override // in.juspay.hypersdk.ui.IntentSenderDelegate
    public final void startIntentSenderForResult(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5, Bundle p6) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            HyperFragment fragment = this.juspayServices.getFragment();
            if (fragment == null || !fragment.isAdded()) {
                this.intentSenderQueue.add(new IntentQueueData(p0, p1, p2, p3, p4, p5, p6));
            } else {
                fragment.startIntentSenderForResult(p0, p1, p2, p3, p4, p5, p6);
            }
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.START_INTENT_SENDER_FOR_RESULT, "Exception in startIntentSenderForResult", e);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010&\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0010R\u001c\u00100\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010\u0012"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperIntentSenderDelegate$IntentQueueData;", "", "Landroid/content/IntentSender;", "p0", "", "p1", "Landroid/content/Intent;", "p2", "p3", "p4", "p5", "Landroid/os/Bundle;", "p6", "<init>", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "component1", "()Landroid/content/IntentSender;", "component2", "()I", "component3", "()Landroid/content/Intent;", "component4", "component5", "component6", "component7", "()Landroid/os/Bundle;", "copy", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)Lin/juspay/hypersdk/lifecycle/HyperIntentSenderDelegate$IntentQueueData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "extraFlags", "I", "getExtraFlags", "fillInIntent", "Landroid/content/Intent;", "getFillInIntent", "flagMask", "getFlagMask", "flagValues", "getFlagValues", "intentSender", "Landroid/content/IntentSender;", "getIntentSender", "options", "Landroid/os/Bundle;", "getOptions", "requestCode", "getRequestCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class IntentQueueData {
        private final int extraFlags;
        private final Intent fillInIntent;
        private final int flagMask;
        private final int flagValues;
        private final IntentSender intentSender;
        private final Bundle options;
        private final int requestCode;

        public IntentQueueData(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(intentSender, "");
            this.intentSender = intentSender;
            this.requestCode = i;
            this.fillInIntent = intent;
            this.flagMask = i2;
            this.flagValues = i3;
            this.extraFlags = i4;
            this.options = bundle;
        }

        public final int getExtraFlags() {
            return this.extraFlags;
        }

        public final Intent getFillInIntent() {
            return this.fillInIntent;
        }

        public final int getFlagMask() {
            return this.flagMask;
        }

        public final int getFlagValues() {
            return this.flagValues;
        }

        public final IntentSender getIntentSender() {
            return this.intentSender;
        }

        public final Bundle getOptions() {
            return this.options;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public static /* synthetic */ IntentQueueData copy$default(IntentQueueData intentQueueData, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                intentSender = intentQueueData.intentSender;
            }
            if ((i5 & 2) != 0) {
                i = intentQueueData.requestCode;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                intent = intentQueueData.fillInIntent;
            }
            Intent intent2 = intent;
            if ((i5 & 8) != 0) {
                i2 = intentQueueData.flagMask;
            }
            int i7 = i2;
            if ((i5 & 16) != 0) {
                i3 = intentQueueData.flagValues;
            }
            int i8 = i3;
            if ((i5 & 32) != 0) {
                i4 = intentQueueData.extraFlags;
            }
            int i9 = i4;
            if ((i5 & 64) != 0) {
                bundle = intentQueueData.options;
            }
            return intentQueueData.copy(intentSender, i6, intent2, i7, i8, i9, bundle);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IntentSender getIntentSender() {
            return this.intentSender;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRequestCode() {
            return this.requestCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Intent getFillInIntent() {
            return this.fillInIntent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getFlagMask() {
            return this.flagMask;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getFlagValues() {
            return this.flagValues;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getExtraFlags() {
            return this.extraFlags;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Bundle getOptions() {
            return this.options;
        }

        public final IntentQueueData copy(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5, Bundle p6) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new IntentQueueData(p0, p1, p2, p3, p4, p5, p6);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IntentQueueData)) {
                return false;
            }
            IntentQueueData intentQueueData = (IntentQueueData) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.intentSender, intentQueueData.intentSender) && this.requestCode == intentQueueData.requestCode && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.fillInIntent, intentQueueData.fillInIntent) && this.flagMask == intentQueueData.flagMask && this.flagValues == intentQueueData.flagValues && this.extraFlags == intentQueueData.extraFlags && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.options, intentQueueData.options);
        }

        public final int hashCode() {
            int iHashCode = this.intentSender.hashCode();
            int iHashCode2 = Integer.hashCode(this.requestCode);
            Intent intent = this.fillInIntent;
            int iHashCode3 = intent == null ? 0 : intent.hashCode();
            int iHashCode4 = Integer.hashCode(this.flagMask);
            int iHashCode5 = Integer.hashCode(this.flagValues);
            int iHashCode6 = Integer.hashCode(this.extraFlags);
            Bundle bundle = this.options;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bundle != null ? bundle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntentQueueData(intentSender=");
            sb.append(this.intentSender);
            sb.append(", requestCode=");
            sb.append(this.requestCode);
            sb.append(", fillInIntent=");
            sb.append(this.fillInIntent);
            sb.append(", flagMask=");
            sb.append(this.flagMask);
            sb.append(", flagValues=");
            sb.append(this.flagValues);
            sb.append(", extraFlags=");
            sb.append(this.extraFlags);
            sb.append(", options=");
            sb.append(this.options);
            sb.append(')');
            return sb.toString();
        }
    }
}
