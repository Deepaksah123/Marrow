package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.RenewEligibleKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SynchronizedLazyImpl<T> implements RenewEligible<T>, Serializable {
    private volatile Object AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private getCreatedOnDateMs<? extends T> write;

    private SynchronizedLazyImpl(getCreatedOnDateMs<? extends T> getcreatedondatems, Object obj) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.write = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = UpgradeCardContent.INSTANCE;
        this.IconCompatParcelizer = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(getCreatedOnDateMs getcreatedondatems, Object obj, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getcreatedondatems, (i & 2) != 0 ? null : obj);
    }

    @Override // kotlin.RenewEligible
    public final T RemoteActionCompatParcelizer() {
        T tInvoke;
        T t = (T) this.AudioAttributesCompatParcelizer;
        if (t != UpgradeCardContent.INSTANCE) {
            return t;
        }
        synchronized (this.IconCompatParcelizer) {
            tInvoke = (T) this.AudioAttributesCompatParcelizer;
            if (tInvoke == UpgradeCardContent.INSTANCE) {
                getCreatedOnDateMs<? extends T> getcreatedondatems = this.write;
                toMagicModuleMetaRepoModel.write(getcreatedondatems);
                tInvoke = getcreatedondatems.invoke();
                this.AudioAttributesCompatParcelizer = tInvoke;
                this.write = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.RenewEligible
    public final boolean write() {
        return this.AudioAttributesCompatParcelizer != UpgradeCardContent.INSTANCE;
    }

    public final String toString() {
        return write() ? String.valueOf(RemoteActionCompatParcelizer()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new RenewBanner(RemoteActionCompatParcelizer());
    }
}
