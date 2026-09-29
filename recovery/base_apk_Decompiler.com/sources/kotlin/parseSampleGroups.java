package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class parseSampleGroups extends parseTruns<Comparable<?>> implements Serializable {
    static final parseSampleGroups RemoteActionCompatParcelizer = new parseSampleGroups();

    @Override // kotlin.parseTruns, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return AudioAttributesCompatParcelizer((Comparable) obj, (Comparable) obj2);
    }

    private static int AudioAttributesCompatParcelizer(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override // kotlin.parseTruns
    public final <S extends Comparable<?>> parseTruns<S> AudioAttributesCompatParcelizer() {
        return readAtomHeader.RemoteActionCompatParcelizer;
    }

    private Object readResolve() {
        return RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private parseSampleGroups() {
    }
}
