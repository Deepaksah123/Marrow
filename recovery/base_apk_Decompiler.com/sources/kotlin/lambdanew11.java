package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdanew11 extends lambdasetMediaSourceFactory17 {
    private final double read;

    public lambdanew11(double d) {
        super(lambdasetLoadControl19.IEEE_754_DOUBLE_PRECISION_FLOAT);
        this.read = d;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (obj instanceof lambdanew11) {
            return super.equals(obj) && this.read == ((lambdanew11) obj).read;
        }
        return false;
    }

    @Override // kotlin.lambdasetMediaSourceFactory17, kotlin.lambdanew10
    public final int hashCode() {
        return Objects.hashCode(Double.valueOf(this.read)) ^ super.hashCode();
    }

    @Override // kotlin.lambdasetMediaSourceFactory17
    public final String toString() {
        return String.valueOf(this.read);
    }
}
