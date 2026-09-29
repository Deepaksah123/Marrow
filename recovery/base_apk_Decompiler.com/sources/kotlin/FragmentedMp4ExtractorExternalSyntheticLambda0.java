package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class FragmentedMp4ExtractorExternalSyntheticLambda0<E> extends onEmsgLeafAtomRead<E> {
    private transient E write;

    @Override // kotlin.getNextTrackBundle
    final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    FragmentedMp4ExtractorExternalSyntheticLambda0(E e) {
        this.write = (E) parseStsd.IconCompatParcelizer(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.write.equals(obj);
    }

    @Override // kotlin.getNextTrackBundle
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final getCurrentSampleFlags<E> iterator() {
        return parseSaio.IconCompatParcelizer(this.write);
    }

    @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
    public final initExtraTracks<E> read() {
        return initExtraTracks.read(this.write);
    }

    @Override // kotlin.getNextTrackBundle
    final int IconCompatParcelizer(Object[] objArr, int i) {
        objArr[i] = this.write;
        return i + 1;
    }

    @Override // kotlin.onEmsgLeafAtomRead, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.write.toString());
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
    final Object writeReplace() {
        return super.writeReplace();
    }
}
