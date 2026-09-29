package kotlin;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0012\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\nJ\u001d\u0010\u001f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\"\u0010\rJ\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140#¢\u0006\u0004\b$\u0010%J'\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#\"\u0004\b\u0001\u0010&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b$\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b+\u0010!R\"\u0010.\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b \u0010\u0017\"\u0004\b,\u0010\u0007R*\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010/\u001a\u0004\b.\u0010%\"\u0004\b+\u00100R\"\u0010,\u001a\u0002018\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b \u00102\u001a\u0004\b+\u00103\"\u0004\b \u00104R\u0014\u0010\u0013\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017"}, d2 = {"Lo/setCustomView;", "E", "", "", "", "p0", "<init>", "(I)V", "", "add", "(Ljava/lang/Object;)Z", "", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "contains", "containsAll", "AudioAttributesCompatParcelizer", "", "equals", "hashCode", "()I", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "write", "(I)Ljava/lang/Object;", "retainAll", "", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "I", "IconCompatParcelizer", "[Ljava/lang/Object;", "([Ljava/lang/Object;)V", "", "[I", "()[I", "([I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setCustomView<E> implements Collection<E>, Set<E>, FinalDataRsModel {
    private Object[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int[] read;

    public setCustomView(int i) {
        this.read = setCheckMarkDrawable.write;
        this.RemoteActionCompatParcelizer = setCheckMarkDrawable.read;
        if (i > 0) {
            setHideOnContentScrollEnabled.write(this, i);
        }
    }

    public /* synthetic */ setCustomView(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int[] getRead() {
        return this.read;
    }

    public final void write(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.read = iArr;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Object[] getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Object[] objArr) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        this.RemoteActionCompatParcelizer = objArr;
    }

    private void read(int i) {
        this.IconCompatParcelizer = i;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    private int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return getOrderDetails.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 0, this.IconCompatParcelizer);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        T[] tArr = (T[]) setActionBarHideOffset.RemoteActionCompatParcelizer(p0, this.IconCompatParcelizer);
        getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, tArr, 0, 0, this.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new AudioAttributesCompatParcelizer();
    }

    final class AudioAttributesCompatParcelizer extends setWindowCallback<E> {
        public AudioAttributesCompatParcelizer() {
            super(setCustomView.this.write());
        }

        @Override // kotlin.setWindowCallback
        protected final E write(int i) {
            return setCustomView.this.RemoteActionCompatParcelizer(i);
        }

        @Override // kotlin.setWindowCallback
        protected final void AudioAttributesCompatParcelizer(int i) {
            setCustomView.this.write(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (write() != 0) {
            write(setCheckMarkDrawable.write);
            RemoteActionCompatParcelizer(setCheckMarkDrawable.read);
            read(0);
        }
        if (write() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    private void AudioAttributesCompatParcelizer(int p0) {
        int iWrite = write();
        if (getRead().length < p0) {
            int[] read = getRead();
            Object[] remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
            setHideOnContentScrollEnabled.write(this, p0);
            if (write() > 0) {
                getOrderDetails.RemoteActionCompatParcelizer(read, getRead(), 0, write(), 6);
                getOrderDetails.read(remoteActionCompatParcelizer, getRemoteActionCompatParcelizer(), 0, write(), 6);
            }
        }
        if (write() != iWrite) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object p0) {
        return AudioAttributesCompatParcelizer(p0) >= 0;
    }

    private int AudioAttributesCompatParcelizer(Object p0) {
        return p0 == null ? setHideOnContentScrollEnabled.write(this) : setHideOnContentScrollEnabled.RemoteActionCompatParcelizer(this, p0, p0.hashCode());
    }

    public final E RemoteActionCompatParcelizer(int p0) {
        return (E) getRemoteActionCompatParcelizer()[p0];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return write() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E p0) {
        int i;
        int iRemoteActionCompatParcelizer;
        int iWrite = write();
        if (p0 == null) {
            iRemoteActionCompatParcelizer = setHideOnContentScrollEnabled.write(this);
            i = 0;
        } else {
            int iHashCode = p0.hashCode();
            i = iHashCode;
            iRemoteActionCompatParcelizer = setHideOnContentScrollEnabled.RemoteActionCompatParcelizer(this, p0, iHashCode);
        }
        if (iRemoteActionCompatParcelizer >= 0) {
            return false;
        }
        int i2 = ~iRemoteActionCompatParcelizer;
        if (iWrite >= getRead().length) {
            int i3 = 8;
            if (iWrite >= 8) {
                i3 = (iWrite >> 1) + iWrite;
            } else if (iWrite < 4) {
                i3 = 4;
            }
            int[] read = getRead();
            Object[] remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
            setHideOnContentScrollEnabled.write(this, i3);
            if (iWrite != write()) {
                throw new ConcurrentModificationException();
            }
            if (getRead().length != 0) {
                getOrderDetails.RemoteActionCompatParcelizer(read, getRead(), 0, read.length, 6);
                getOrderDetails.read(remoteActionCompatParcelizer, getRemoteActionCompatParcelizer(), 0, remoteActionCompatParcelizer.length, 6);
            }
        }
        if (i2 < iWrite) {
            int i4 = i2 + 1;
            getOrderDetails.read(getRead(), getRead(), i4, i2, iWrite);
            getOrderDetails.RemoteActionCompatParcelizer(getRemoteActionCompatParcelizer(), getRemoteActionCompatParcelizer(), i4, i2, iWrite);
        }
        if (iWrite != write() || i2 >= getRead().length) {
            throw new ConcurrentModificationException();
        }
        getRead()[i2] = i;
        getRemoteActionCompatParcelizer()[i2] = p0;
        read(write() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object p0) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        write(iAudioAttributesCompatParcelizer);
        return true;
    }

    public final E write(int p0) {
        int iWrite = write();
        E e = (E) getRemoteActionCompatParcelizer()[p0];
        if (iWrite <= 1) {
            clear();
            return e;
        }
        int i = iWrite - 1;
        if (getRead().length > 8 && write() < getRead().length / 3) {
            int iWrite2 = write() > 8 ? write() + (write() >> 1) : 8;
            int[] read = getRead();
            Object[] remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
            setHideOnContentScrollEnabled.write(this, iWrite2);
            if (p0 > 0) {
                getOrderDetails.RemoteActionCompatParcelizer(read, getRead(), 0, p0, 6);
                getOrderDetails.read(remoteActionCompatParcelizer, getRemoteActionCompatParcelizer(), 0, p0, 6);
            }
            if (p0 < i) {
                int i2 = p0 + 1;
                getOrderDetails.read(read, getRead(), p0, i2, iWrite);
                getOrderDetails.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, getRemoteActionCompatParcelizer(), p0, i2, iWrite);
            }
        } else {
            if (p0 < i) {
                int i3 = p0 + 1;
                getOrderDetails.read(getRead(), getRead(), p0, i3, iWrite);
                getOrderDetails.RemoteActionCompatParcelizer(getRemoteActionCompatParcelizer(), getRemoteActionCompatParcelizer(), p0, i3, iWrite);
            }
            getRemoteActionCompatParcelizer()[i] = null;
        }
        if (iWrite != write()) {
            throw new ConcurrentModificationException();
        }
        read(i);
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Set) || size() != ((Set) p0).size()) {
            return false;
        }
        try {
            int iWrite = write();
            for (int i = 0; i < iWrite; i++) {
                if (!((Set) p0).contains(RemoteActionCompatParcelizer(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] read = getRead();
        int iWrite = write();
        int i = 0;
        for (int i2 = 0; i2 < iWrite; i2++) {
            i += read[i2];
        }
        return i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(write() * 14);
        sb.append('{');
        int iWrite = write();
        for (int i = 0; i < iWrite; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (eRemoteActionCompatParcelizer != this) {
                sb.append(eRemoteActionCompatParcelizer);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends Object> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(write() + p0.size());
        Iterator<? extends E> it = p0.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends Object> it = p0.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = false;
        for (int iWrite = write() - 1; iWrite >= 0; iWrite--) {
            if (!IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(p0, getRemoteActionCompatParcelizer()[iWrite])) {
                write(iWrite);
                z = true;
            }
        }
        return z;
    }

    public setCustomView() {
        this(0, 1, null);
    }
}
