package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.setService, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001aB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "getFinal$annotations", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SafePublicationLazyImpl<T> implements RenewEligible<T>, Serializable {
    public static final write RemoteActionCompatParcelizer = new write(null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> read = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private final Object IconCompatParcelizer;
    private volatile Object _value;
    private volatile getCreatedOnDateMs<? extends T> write;

    public SafePublicationLazyImpl(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.write = getcreatedondatems;
        this._value = UpgradeCardContent.INSTANCE;
        this.IconCompatParcelizer = UpgradeCardContent.INSTANCE;
    }

    @Override // kotlin.RenewEligible
    public final T RemoteActionCompatParcelizer() {
        T t = (T) this._value;
        if (t != UpgradeCardContent.INSTANCE) {
            return t;
        }
        getCreatedOnDateMs<? extends T> getcreatedondatems = this.write;
        if (getcreatedondatems != null) {
            T tInvoke = getcreatedondatems.invoke();
            if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, UpgradeCardContent.INSTANCE, tInvoke)) {
                this.write = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    @Override // kotlin.RenewEligible
    public final boolean write() {
        return this._value != UpgradeCardContent.INSTANCE;
    }

    public final String toString() {
        return write() ? String.valueOf(RemoteActionCompatParcelizer()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new RenewBanner(RemoteActionCompatParcelizer());
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: renamed from: o.setService$write */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RP\u0010\b\u001a>\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u0001*\u001e\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/setService$write;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lo/setService;", "read", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
