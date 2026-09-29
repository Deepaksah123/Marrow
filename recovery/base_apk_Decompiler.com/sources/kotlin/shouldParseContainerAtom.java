package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class shouldParseContainerAtom<E> extends onEmsgLeafAtomRead<E> {
    static final shouldParseContainerAtom<Object> IconCompatParcelizer;
    private final transient int AudioAttributesCompatParcelizer;
    private transient Object[] MediaBrowserCompatCustomActionResultReceiver;
    private transient Object[] RemoteActionCompatParcelizer;
    private final transient int read;
    private final transient int write;

    @Override // kotlin.onEmsgLeafAtomRead
    final boolean AudioAttributesImplApi26Parcelizer() {
        return true;
    }

    @Override // kotlin.getNextTrackBundle
    final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getNextTrackBundle
    final int write() {
        return 0;
    }

    @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    static {
        Object[] objArr = new Object[0];
        IconCompatParcelizer = new shouldParseContainerAtom<>(objArr, 0, objArr, 0, 0);
    }

    shouldParseContainerAtom(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.RemoteActionCompatParcelizer = objArr;
        this.read = i;
        this.MediaBrowserCompatCustomActionResultReceiver = objArr2;
        this.AudioAttributesCompatParcelizer = i2;
        this.write = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int i = getDefaultSampleValues.read(obj);
        while (true) {
            int i2 = i & this.AudioAttributesCompatParcelizer;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            i = i2 + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.write;
    }

    @Override // kotlin.getNextTrackBundle
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final getCurrentSampleFlags<E> iterator() {
        return read().iterator();
    }

    @Override // kotlin.getNextTrackBundle
    final Object[] AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getNextTrackBundle
    final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.getNextTrackBundle
    final int IconCompatParcelizer(Object[] objArr, int i) {
        System.arraycopy(this.RemoteActionCompatParcelizer, 0, objArr, i, this.write);
        return i + this.write;
    }

    @Override // kotlin.onEmsgLeafAtomRead
    final initExtraTracks<E> AudioAttributesImplBaseParcelizer() {
        return initExtraTracks.read(this.RemoteActionCompatParcelizer, this.write);
    }

    @Override // kotlin.onEmsgLeafAtomRead, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.read;
    }

    @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
    final Object writeReplace() {
        return super.writeReplace();
    }
}
