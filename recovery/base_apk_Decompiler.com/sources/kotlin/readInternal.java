package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class readInternal extends lambdastatic1 {
    static final readInternal AudioAttributesCompatParcelizer;
    private transient Object[] IconCompatParcelizer;
    private transient Object[] read;

    static {
        Object[] objArr = new Object[0];
        AudioAttributesCompatParcelizer = new readInternal(objArr, objArr);
    }

    private readInternal(Object[] objArr, Object[] objArr2) {
        this.read = objArr;
        this.IconCompatParcelizer = objArr2;
    }

    @Override // kotlin.computeSeeker
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final synchronize iterator() {
        return MediaBrowserCompatItemReceiver().listIterator(0);
    }

    @Override // kotlin.lambdastatic1
    final boolean AudioAttributesImplApi26Parcelizer() {
        return true;
    }

    @Override // kotlin.computeSeeker
    final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.IconCompatParcelizer.length;
        return false;
    }

    @Override // kotlin.lambdastatic1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.lambdastatic1, kotlin.computeSeeker, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return MediaBrowserCompatItemReceiver().listIterator(0);
    }

    @Override // kotlin.computeSeeker
    final int read() {
        return 0;
    }

    @Override // kotlin.computeSeeker
    final int read(Object[] objArr) {
        System.arraycopy(this.read, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // kotlin.lambdastatic1
    final maybeReadSeekFrame MediaBrowserCompatCustomActionResultReceiver() {
        return headersMatch.write;
    }

    @Override // kotlin.computeSeeker
    final Object[] write() {
        return this.read;
    }
}
