package kotlin;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parseTruns<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public static <C extends Comparable> parseTruns<C> IconCompatParcelizer() {
        return parseSampleGroups.RemoteActionCompatParcelizer;
    }

    public static <T> parseTruns<T> IconCompatParcelizer(Comparator<T> comparator) {
        if (comparator instanceof parseTruns) {
            return (parseTruns) comparator;
        }
        return new FixedSampleSizeRechunkerResults(comparator);
    }

    protected parseTruns() {
    }

    public <S extends T> parseTruns<S> AudioAttributesCompatParcelizer() {
        return new readAtomPayload(this);
    }

    public final <F> parseTruns<F> AudioAttributesCompatParcelizer(parseMvhd<F, ? extends T> parsemvhd) {
        return new rechunk(parsemvhd, this);
    }

    public final <U extends T> parseTruns<U> write(Comparator<? super U> comparator) {
        return new enterReadingAtomHeaderState(this, (Comparator) parseStsd.IconCompatParcelizer(comparator));
    }
}
