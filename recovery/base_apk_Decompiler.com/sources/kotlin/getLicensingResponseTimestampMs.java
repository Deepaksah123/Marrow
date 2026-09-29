package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.getLicensingResponseTimestampMs;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\b¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0011\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0012\u0010\u001e\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "nextOrClosed", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrIfClosed", "onClosedAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "next", "getNext", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "trySetNext", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "()Z", "getPrev", "cleanPrev", "", "markAsClosed", "isRemoved", "remove", "aliveSegmentLeft", "getAliveSegmentLeft", "aliveSegmentRight", "getAliveSegmentRight", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getLicensingResponseTimestampMs<N extends getLicensingResponseTimestampMs<N>> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(getLicensingResponseTimestampMs.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getLicensingResponseTimestampMs.class, Object.class, "_prev$volatile");

    public abstract boolean MediaBrowserCompatItemReceiver();

    public getLicensingResponseTimestampMs(N n) {
        this._prev$volatile = n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesImplApi21Parcelizer() {
        return read.get(this);
    }

    public final boolean AudioAttributesCompatParcelizer(N n) {
        return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, null, n);
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return RemoteActionCompatParcelizer() == null;
    }

    public final N IconCompatParcelizer() {
        return (N) IconCompatParcelizer.get(this);
    }

    public final void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer.set(this, null);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, null, VideoAnalyticInterimSession.RemoteActionCompatParcelizer);
    }

    public final void AudioAttributesImplBaseParcelizer() {
        Object obj;
        getCollegeId.write();
        if (AudioAttributesImplApi26Parcelizer()) {
            return;
        }
        while (true) {
            getLicensingResponseTimestampMs getlicensingresponsetimestampms = read();
            getLicensingResponseTimestampMs getlicensingresponsetimestampmsWrite = write();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = IconCompatParcelizer;
            do {
                obj = atomicReferenceFieldUpdater.get(getlicensingresponsetimestampmsWrite);
            } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, getlicensingresponsetimestampmsWrite, obj, ((getLicensingResponseTimestampMs) obj) == null ? null : getlicensingresponsetimestampms));
            if (getlicensingresponsetimestampms != null) {
                read.set(getlicensingresponsetimestampms, getlicensingresponsetimestampmsWrite);
            }
            if (!getlicensingresponsetimestampmsWrite.MediaBrowserCompatItemReceiver() || getlicensingresponsetimestampmsWrite.AudioAttributesImplApi26Parcelizer()) {
                if (getlicensingresponsetimestampms == null || !getlicensingresponsetimestampms.MediaBrowserCompatItemReceiver()) {
                    return;
                }
            }
        }
    }

    private final N read() {
        N n = (N) IconCompatParcelizer();
        while (n != null && n.MediaBrowserCompatItemReceiver()) {
            n = (N) IconCompatParcelizer.get(n);
        }
        return n;
    }

    private final N write() {
        getLicensingResponseTimestampMs getlicensingresponsetimestampmsRemoteActionCompatParcelizer;
        getCollegeId.write();
        N n = (N) RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(n);
        while (n.MediaBrowserCompatItemReceiver() && (getlicensingresponsetimestampmsRemoteActionCompatParcelizer = n.RemoteActionCompatParcelizer()) != null) {
            n = (N) getlicensingresponsetimestampmsRemoteActionCompatParcelizer;
        }
        return n;
    }

    public final N RemoteActionCompatParcelizer() {
        Object objAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (objAudioAttributesImplApi21Parcelizer == VideoAnalyticInterimSession.RemoteActionCompatParcelizer) {
            return null;
        }
        return (N) objAudioAttributesImplApi21Parcelizer;
    }
}
