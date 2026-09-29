package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class lambdasetMediaSourceFactory17 extends lambdanew10 {
    public static final lambdasetMediaSourceFactory17 RemoteActionCompatParcelizer = new lambdasetMediaSourceFactory17(lambdasetLoadControl19.BREAK);
    private final lambdasetLoadControl19 read;

    protected lambdasetMediaSourceFactory17(lambdasetLoadControl19 lambdasetloadcontrol19) {
        super(lambdanew3.SPECIAL);
        this.read = (lambdasetLoadControl19) Objects.requireNonNull(lambdasetloadcontrol19);
    }

    @Override // kotlin.lambdanew10
    public boolean equals(Object obj) {
        if (obj instanceof lambdasetMediaSourceFactory17) {
            return super.equals(obj) && this.read == ((lambdasetMediaSourceFactory17) obj).read;
        }
        return false;
    }

    @Override // kotlin.lambdanew10
    public int hashCode() {
        return Objects.hashCode(this.read) ^ super.hashCode();
    }

    public String toString() {
        return this.read.name();
    }
}
