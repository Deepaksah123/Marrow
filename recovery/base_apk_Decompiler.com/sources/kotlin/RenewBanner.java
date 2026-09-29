package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class RenewBanner<T> implements RenewEligible<T>, Serializable {
    private final T read;

    @Override // kotlin.RenewEligible
    public final boolean write() {
        return true;
    }

    public RenewBanner(T t) {
        this.read = t;
    }

    @Override // kotlin.RenewEligible
    public final T RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        return String.valueOf(RemoteActionCompatParcelizer());
    }
}
