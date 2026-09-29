package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class lambdanew14 extends lambdanew10 {
    private boolean RemoteActionCompatParcelizer;

    protected lambdanew14(lambdanew3 lambdanew3Var) {
        super(lambdanew3Var);
        this.RemoteActionCompatParcelizer = false;
    }

    public boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public lambdanew14 AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
        return this;
    }

    @Override // kotlin.lambdanew10
    public boolean equals(Object obj) {
        if (obj instanceof lambdanew14) {
            return super.equals(obj) && this.RemoteActionCompatParcelizer == ((lambdanew14) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }

    @Override // kotlin.lambdanew10
    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.RemoteActionCompatParcelizer)) ^ super.hashCode();
    }
}
