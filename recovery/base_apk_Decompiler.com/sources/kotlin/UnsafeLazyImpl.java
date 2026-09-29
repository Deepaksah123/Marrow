package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.getSmallButtonText, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0002J\u0019\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0002¢\u0006\u0002\u0010\u0018R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnsafeLazyImpl<T> implements RenewEligible<T>, Serializable {
    private Object IconCompatParcelizer;
    private getCreatedOnDateMs<? extends T> read;

    public UnsafeLazyImpl(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.read = getcreatedondatems;
        this.IconCompatParcelizer = UpgradeCardContent.INSTANCE;
    }

    @Override // kotlin.RenewEligible
    public final T RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == UpgradeCardContent.INSTANCE) {
            getCreatedOnDateMs<? extends T> getcreatedondatems = this.read;
            toMagicModuleMetaRepoModel.write(getcreatedondatems);
            this.IconCompatParcelizer = getcreatedondatems.invoke();
            this.read = null;
        }
        return (T) this.IconCompatParcelizer;
    }

    @Override // kotlin.RenewEligible
    public final boolean write() {
        return this.IconCompatParcelizer != UpgradeCardContent.INSTANCE;
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
}
