package kotlin;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lambdanew6 extends lambdanew10 {
    private final BigInteger IconCompatParcelizer;

    protected lambdanew6(lambdanew3 lambdanew3Var, BigInteger bigInteger) {
        super(lambdanew3Var);
        this.IconCompatParcelizer = (BigInteger) Objects.requireNonNull(bigInteger);
    }

    public final BigInteger RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.lambdanew10
    public boolean equals(Object obj) {
        if (obj instanceof lambdanew6) {
            return super.equals(obj) && this.IconCompatParcelizer.equals(((lambdanew6) obj).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.lambdanew10
    public int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ super.hashCode();
    }

    public String toString() {
        return this.IconCompatParcelizer.toString();
    }
}
