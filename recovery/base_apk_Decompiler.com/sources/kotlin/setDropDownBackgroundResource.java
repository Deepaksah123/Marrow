package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0010\u0019\bB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u001cJ\u001e\u0010\r\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b\r\u0010\u001bJ\u001e\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\b\u0010\u0014J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u001eJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u001fJ'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0000¢\u0006\u0004\b\u0019\u0010\"J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\b\u0010#J \u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010$J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0006R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&"}, d2 = {"Lo/setDropDownBackgroundResource;", "E", "Lo/setTextAppearance;", "", "p0", "<init>", "(I)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Z", "p1", "", "(ILjava/lang/Object;)V", "write", "(Lo/setTextAppearance;)Z", "", "read", "(ILjava/util/Collection;)Z", "", "IconCompatParcelizer", "(Ljava/lang/Iterable;)Z", "", "(Ljava/util/List;)Z", "()Ljava/util/List;", "", "RemoteActionCompatParcelizer", "()V", "(Ljava/lang/Iterable;)V", "(Lo/setTextAppearance;)V", "(Ljava/util/List;)V", "(I)Ljava/lang/Object;", "(II)V", "", "", "(I[Ljava/lang/Object;)V", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lo/setDropDownBackgroundResource$RemoteActionCompatParcelizer;", "Lo/setDropDownBackgroundResource$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setDropDownBackgroundResource<E> extends setTextAppearance<E> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer<E> RemoteActionCompatParcelizer;

    public setDropDownBackgroundResource(int i) {
        super(i, null);
    }

    public /* synthetic */ setDropDownBackgroundResource(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean AudioAttributesCompatParcelizer(E p0) {
        int i = this.RemoteActionCompatParcelizer + 1;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr.length < i) {
            RemoteActionCompatParcelizer(i, objArr);
        }
        this.IconCompatParcelizer[this.RemoteActionCompatParcelizer] = p0;
        this.RemoteActionCompatParcelizer++;
        return true;
    }

    public final void AudioAttributesCompatParcelizer(int p0, E p1) {
        if (p0 < 0 || p0 > this.RemoteActionCompatParcelizer) {
            IconCompatParcelizer(p0);
        }
        int i = this.RemoteActionCompatParcelizer + 1;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr.length < i) {
            RemoteActionCompatParcelizer(i, objArr);
        }
        Object[] objArr2 = this.IconCompatParcelizer;
        if (p0 != this.RemoteActionCompatParcelizer) {
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, p0 + 1, p0, this.RemoteActionCompatParcelizer);
        }
        objArr2[p0] = p1;
        this.RemoteActionCompatParcelizer++;
    }

    public final boolean read(int p0, Collection<? extends E> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0 || p0 > this.RemoteActionCompatParcelizer) {
            IconCompatParcelizer(p0);
        }
        int i = 0;
        if (p1.isEmpty()) {
            return false;
        }
        int size = this.RemoteActionCompatParcelizer + p1.size();
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr.length < size) {
            RemoteActionCompatParcelizer(size, objArr);
        }
        Object[] objArr2 = this.IconCompatParcelizer;
        if (p0 != this.RemoteActionCompatParcelizer) {
            getOrderDetails.RemoteActionCompatParcelizer(objArr2, objArr2, p1.size() + p0, p0, this.RemoteActionCompatParcelizer);
        }
        for (Object obj : p1) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            objArr2[i + p0] = obj;
            i++;
        }
        this.RemoteActionCompatParcelizer += p1.size();
        return true;
    }

    private final void IconCompatParcelizer(int p0) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(p0);
        sb.append(" must be in 0..");
        sb.append(this.RemoteActionCompatParcelizer);
        AppCompatImageButton.IconCompatParcelizer(sb.toString());
    }

    public final boolean write(setTextAppearance<E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.RemoteActionCompatParcelizer;
        read((setTextAppearance) p0);
        return i != this.RemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(List<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer((List) p0);
        return i != this.RemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.RemoteActionCompatParcelizer;
        write((Iterable) p0);
        return i != this.RemoteActionCompatParcelizer;
    }

    private void read(setTextAppearance<E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.AudioAttributesImplApi21Parcelizer()) {
            return;
        }
        int i = this.RemoteActionCompatParcelizer + p0.RemoteActionCompatParcelizer;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr.length < i) {
            RemoteActionCompatParcelizer(i, objArr);
        }
        getOrderDetails.RemoteActionCompatParcelizer(p0.IconCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, 0, p0.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer += p0.RemoteActionCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(List<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        int i = this.RemoteActionCompatParcelizer;
        int size = p0.size() + i;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr.length < size) {
            RemoteActionCompatParcelizer(size, objArr);
        }
        Object[] objArr2 = this.IconCompatParcelizer;
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = p0.get(i2);
        }
        this.RemoteActionCompatParcelizer += p0.size();
    }

    public final void RemoteActionCompatParcelizer() {
        getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, 0, this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = 0;
    }

    private void RemoteActionCompatParcelizer(int p0, Object[] p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        int length = p1.length;
        this.IconCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(p1, new Object[Math.max(p0, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean IconCompatParcelizer(E p0) {
        int iWrite = write(p0);
        if (iWrite < 0) {
            return false;
        }
        AudioAttributesCompatParcelizer(iWrite);
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer((Iterable) p0);
        return i != this.RemoteActionCompatParcelizer;
    }

    public final E AudioAttributesCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(p0);
        }
        Object[] objArr = this.IconCompatParcelizer;
        E e = (E) objArr[p0];
        if (p0 != this.RemoteActionCompatParcelizer - 1) {
            getOrderDetails.RemoteActionCompatParcelizer(objArr, objArr, p0, p0 + 1, this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer--;
        objArr[this.RemoteActionCompatParcelizer] = null;
        return e;
    }

    public final void write(int p0, int p1) {
        if (p0 < 0 || p0 > this.RemoteActionCompatParcelizer || p1 < 0 || p1 > this.RemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Start (");
            sb.append(p0);
            sb.append(") and end (");
            sb.append(p1);
            sb.append(") must be in 0..");
            sb.append(this.RemoteActionCompatParcelizer);
            AppCompatImageButton.IconCompatParcelizer(sb.toString());
        }
        if (p1 < p0) {
            StringBuilder sb2 = new StringBuilder("Start (");
            sb2.append(p0);
            sb2.append(") is more than end (");
            sb2.append(p1);
            sb2.append(')');
            AppCompatImageButton.read(sb2.toString());
        }
        if (p1 != p0) {
            if (p1 < this.RemoteActionCompatParcelizer) {
                getOrderDetails.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.IconCompatParcelizer, p0, p1, this.RemoteActionCompatParcelizer);
            }
            int i = this.RemoteActionCompatParcelizer - (p1 - p0);
            getOrderDetails.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (Object) null, i, this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer = i;
        }
    }

    public final boolean AudioAttributesCompatParcelizer(Collection<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.IconCompatParcelizer;
        for (int i2 = this.RemoteActionCompatParcelizer - 1; i2 >= 0; i2--) {
            if (!p0.contains(objArr[i2])) {
                AudioAttributesCompatParcelizer(i2);
            }
        }
        return i != this.RemoteActionCompatParcelizer;
    }

    public final E write(int p0, E p1) {
        if (p0 < 0 || p0 >= this.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(p0);
        }
        Object[] objArr = this.IconCompatParcelizer;
        E e = (E) objArr[p0];
        objArr[p0] = p1;
        return e;
    }

    public final List<E> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer();
    }

    public final List<E> AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer<E> remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer;
        }
        RemoteActionCompatParcelizer<E> remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer<>(this);
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
        return remoteActionCompatParcelizer2;
    }

    static final class read<T> implements ListIterator<T>, getOffline {
        private int IconCompatParcelizer;
        private final List<T> RemoteActionCompatParcelizer;

        public read(List<T> list, int i) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.RemoteActionCompatParcelizer = list;
            this.IconCompatParcelizer = i - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer < this.RemoteActionCompatParcelizer.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            List<T> list = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.RemoteActionCompatParcelizer.remove(this.IconCompatParcelizer);
            this.IconCompatParcelizer--;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.IconCompatParcelizer >= 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.IconCompatParcelizer + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            List<T> list = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.IconCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            List<T> list = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = i;
            list.add(i, t);
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.RemoteActionCompatParcelizer.set(this.IconCompatParcelizer, t);
        }
    }

    static final class RemoteActionCompatParcelizer<T> implements List<T>, getModulesCompleted {
        private final setDropDownBackgroundResource<T> IconCompatParcelizer;

        public RemoteActionCompatParcelizer(setDropDownBackgroundResource<T> setdropdownbackgroundresource) {
            toMagicModuleMetaRepoModel.write(setdropdownbackgroundresource, "");
            this.IconCompatParcelizer = setdropdownbackgroundresource;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return read(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return write();
        }

        private int write() {
            return this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return this.IconCompatParcelizer.read(collection);
        }

        @Override // java.util.List
        public final T get(int i) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            return this.IconCompatParcelizer.read(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.IconCompatParcelizer.write(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new read(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            return this.IconCompatParcelizer.read(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, t);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return this.IconCompatParcelizer.read(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return this.IconCompatParcelizer.IconCompatParcelizer(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new read(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new read(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.IconCompatParcelizer.IconCompatParcelizer(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(collection);
        }

        private T read(int i) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer((Collection<? extends T>) collection);
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            return this.IconCompatParcelizer.write(i, t);
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = this;
            setSupportCompoundDrawablesTintMode.read(remoteActionCompatParcelizer, i, i2);
            return new AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            toMagicModuleMetaRepoModel.write(tArr, "");
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }
    }

    static final class AudioAttributesCompatParcelizer<T> implements List<T>, getModulesCompleted {
        private final int IconCompatParcelizer;
        private final List<T> read;
        private int write;

        public AudioAttributesCompatParcelizer(List<T> list, int i, int i2) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.read = list;
            this.IconCompatParcelizer = i;
            this.write = i2;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return read(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return IconCompatParcelizer();
        }

        private int IconCompatParcelizer() {
            return this.write - this.IconCompatParcelizer;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.write;
            for (int i2 = this.IconCompatParcelizer; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            return this.read.get(i + this.IconCompatParcelizer);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.write;
            for (int i2 = this.IconCompatParcelizer; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read.get(i2), obj)) {
                    return i2 - this.IconCompatParcelizer;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.write == this.IconCompatParcelizer;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new read(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.write - 1;
            int i2 = this.IconCompatParcelizer;
            if (i2 > i) {
                return -1;
            }
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.IconCompatParcelizer;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            List<T> list = this.read;
            int i = this.write;
            this.write = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.read.add(i + this.IconCompatParcelizer, t);
            this.write++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            this.read.addAll(i + this.IconCompatParcelizer, collection);
            this.write += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            this.read.addAll(this.write, collection);
            this.write += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.write - 1;
            int i2 = this.IconCompatParcelizer;
            if (i2 <= i) {
                while (true) {
                    this.read.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.write = this.IconCompatParcelizer;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new read(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new read(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.write;
            for (int i2 = this.IconCompatParcelizer; i2 < i; i2++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read.get(i2), obj)) {
                    this.read.remove(i2);
                    this.write--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            int i = this.write;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.write;
        }

        private T read(int i) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            this.write--;
            return this.read.remove(i + this.IconCompatParcelizer);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            int i = this.write;
            int i2 = i - 1;
            int i3 = this.IconCompatParcelizer;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.read.get(i2))) {
                        this.read.remove(i2);
                        this.write--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.write;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(this, i);
            return this.read.set(i + this.IconCompatParcelizer, t);
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer = this;
            setSupportCompoundDrawablesTintMode.read(audioAttributesCompatParcelizer, i, i2);
            return new AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            toMagicModuleMetaRepoModel.write(tArr, "");
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }
    }

    private void write(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(it.next());
        }
    }

    private void RemoteActionCompatParcelizer(Iterable<? extends E> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer(it.next());
        }
    }

    public setDropDownBackgroundResource() {
        this(0, 1, null);
    }
}
