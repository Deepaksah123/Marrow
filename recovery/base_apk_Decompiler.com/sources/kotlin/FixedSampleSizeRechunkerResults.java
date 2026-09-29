package kotlin;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class FixedSampleSizeRechunkerResults<T> extends parseTruns<T> implements Serializable {
    private Comparator<T> read;

    FixedSampleSizeRechunkerResults(Comparator<T> comparator) {
        this.read = (Comparator) parseStsd.IconCompatParcelizer(comparator);
    }

    @Override // kotlin.parseTruns, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.read.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FixedSampleSizeRechunkerResults) {
            return this.read.equals(((FixedSampleSizeRechunkerResults) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        return this.read.toString();
    }
}
