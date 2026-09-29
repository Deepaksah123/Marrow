package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class readAtomHeader extends parseTruns<Comparable<?>> implements Serializable {
    static final readAtomHeader RemoteActionCompatParcelizer = new readAtomHeader();

    @Override // kotlin.parseTruns, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return RemoteActionCompatParcelizer((Comparable) obj, (Comparable) obj2);
    }

    private static int RemoteActionCompatParcelizer(Comparable<?> comparable, Comparable<?> comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // kotlin.parseTruns
    public final <S extends Comparable<?>> parseTruns<S> AudioAttributesCompatParcelizer() {
        return parseTruns.IconCompatParcelizer();
    }

    private Object readResolve() {
        return RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private readAtomHeader() {
    }
}
