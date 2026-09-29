package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lambdanew12 extends lambdanew14 {
    private final ArrayList<lambdanew10> IconCompatParcelizer;

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ lambdanew14 AudioAttributesCompatParcelizer(boolean z) {
        return super.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public lambdanew12() {
        super(lambdanew3.ARRAY);
        this.IconCompatParcelizer = new ArrayList<>();
    }

    public lambdanew12(int i) {
        super(lambdanew3.ARRAY);
        this.IconCompatParcelizer = new ArrayList<>(i);
    }

    public final lambdanew12 write(lambdanew10 lambdanew10Var) {
        this.IconCompatParcelizer.add(lambdanew10Var);
        return this;
    }

    public final List<lambdanew10> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public boolean equals(Object obj) {
        if (obj instanceof lambdanew12) {
            return super.equals(obj) && this.IconCompatParcelizer.equals(((lambdanew12) obj).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (IconCompatParcelizer()) {
            sb.append("_ ");
        }
        sb.append(Arrays.toString(this.IconCompatParcelizer.toArray()).substring(1));
        return sb.toString();
    }
}
