package kotlin;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdanew5 extends lambdanew14 {
    private final LinkedHashMap<lambdanew10, lambdanew10> IconCompatParcelizer;
    private final List<lambdanew10> write;

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ lambdanew14 AudioAttributesCompatParcelizer(boolean z) {
        return super.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public lambdanew5() {
        super(lambdanew3.MAP);
        this.write = new LinkedList();
        this.IconCompatParcelizer = new LinkedHashMap<>();
    }

    public lambdanew5(int i) {
        super(lambdanew3.MAP);
        this.write = new LinkedList();
        this.IconCompatParcelizer = new LinkedHashMap<>(i);
    }

    public final lambdanew5 IconCompatParcelizer(lambdanew10 lambdanew10Var, lambdanew10 lambdanew10Var2) {
        if (this.IconCompatParcelizer.put(lambdanew10Var, lambdanew10Var2) == null) {
            this.write.add(lambdanew10Var);
        }
        return this;
    }

    public final lambdanew10 AudioAttributesCompatParcelizer(lambdanew10 lambdanew10Var) {
        return this.IconCompatParcelizer.get(lambdanew10Var);
    }

    public final Collection<lambdanew10> write() {
        return this.write;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (obj instanceof lambdanew5) {
            return super.equals(obj) && this.IconCompatParcelizer.equals(((lambdanew5) obj).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (IconCompatParcelizer()) {
            sb.append("{_ ");
        } else {
            sb.append("{ ");
        }
        for (lambdanew10 lambdanew10Var : this.write) {
            sb.append(lambdanew10Var);
            sb.append(": ");
            sb.append(this.IconCompatParcelizer.get(lambdanew10Var));
            sb.append(", ");
        }
        if (sb.toString().endsWith(", ")) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" }");
        return sb.toString();
    }
}
