package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class getMetrics extends setOnEventListener {
    private final List<setPropertyByteArray> IconCompatParcelizer;

    getMetrics(List<setPropertyByteArray> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.IconCompatParcelizer = list;
    }

    @Override // kotlin.setOnEventListener
    public final List<setPropertyByteArray> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setOnEventListener) {
            return this.IconCompatParcelizer.equals(((setOnEventListener) obj).AudioAttributesCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ 1000003;
    }
}
