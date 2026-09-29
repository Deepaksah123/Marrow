package kotlin;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class enterReadingAtomHeaderState<T> extends parseTruns<T> implements Serializable {
    private Comparator<? super T>[] RemoteActionCompatParcelizer;

    enterReadingAtomHeaderState(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.RemoteActionCompatParcelizer = new Comparator[]{comparator, comparator2};
    }

    @Override // kotlin.parseTruns, java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.RemoteActionCompatParcelizer;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enterReadingAtomHeaderState) {
            return Arrays.equals(this.RemoteActionCompatParcelizer, ((enterReadingAtomHeaderState) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ordering.compound(");
        sb.append(Arrays.toString(this.RemoteActionCompatParcelizer));
        sb.append(")");
        return sb.toString();
    }
}
