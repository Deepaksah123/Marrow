package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class parseTraf<E> extends initExtraTracks<E> {
    static final initExtraTracks<Object> write = new parseTraf(new Object[0], 0);
    private final transient int AudioAttributesCompatParcelizer;
    private transient Object[] IconCompatParcelizer;

    @Override // kotlin.getNextTrackBundle
    final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getNextTrackBundle
    final int write() {
        return 0;
    }

    parseTraf(Object[] objArr, int i) {
        this.IconCompatParcelizer = objArr;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getNextTrackBundle
    final Object[] AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getNextTrackBundle
    final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle
    final int IconCompatParcelizer(Object[] objArr, int i) {
        System.arraycopy(this.IconCompatParcelizer, 0, objArr, i, this.AudioAttributesCompatParcelizer);
        return i + this.AudioAttributesCompatParcelizer;
    }

    @Override // java.util.List
    public final E get(int i) {
        parseStsd.write(i, this.AudioAttributesCompatParcelizer);
        return (E) Objects.requireNonNull(this.IconCompatParcelizer[i]);
    }

    @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle
    final Object writeReplace() {
        return super.writeReplace();
    }
}
