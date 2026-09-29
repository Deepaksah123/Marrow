package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetTrackSelector18 extends lambdanew10 {
    private final long RemoteActionCompatParcelizer;

    public lambdasetTrackSelector18(long j) {
        super(lambdanew3.TAG);
        this.RemoteActionCompatParcelizer = j;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (obj instanceof lambdasetTrackSelector18) {
            return super.equals(obj) && this.RemoteActionCompatParcelizer == ((lambdasetTrackSelector18) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }

    @Override // kotlin.lambdanew10
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.RemoteActionCompatParcelizer)) ^ super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
