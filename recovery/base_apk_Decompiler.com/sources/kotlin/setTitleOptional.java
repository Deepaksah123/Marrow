package kotlin;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class setTitleOptional<K, V> extends AppCompatCheckBox<K, V> implements Map<K, V> {
    private setTitleOptional<K, V>.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private setTitleOptional<K, V>.write RemoteActionCompatParcelizer;
    private setTitleOptional<K, V>.read write;

    public setTitleOptional() {
    }

    public setTitleOptional(int i) {
        super(i);
    }

    public setTitleOptional(AppCompatCheckBox appCompatCheckBox) {
        super(appCompatCheckBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean read(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AppCompatCheckBox, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AppCompatCheckBox, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AppCompatCheckBox, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.AppCompatCheckBox, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        RemoteActionCompatParcelizer(getRemoteActionCompatParcelizer() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean RemoteActionCompatParcelizer(Collection<?> collection) {
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return remoteActionCompatParcelizer != getRemoteActionCompatParcelizer();
    }

    public final boolean IconCompatParcelizer(Collection<?> collection) {
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        for (int remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer() - 1; remoteActionCompatParcelizer2 >= 0; remoteActionCompatParcelizer2--) {
            if (!collection.contains(write(remoteActionCompatParcelizer2))) {
                AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2);
            }
        }
        return remoteActionCompatParcelizer != getRemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        setTitleOptional<K, V>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.IconCompatParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        setTitleOptional<K, V>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = audioAttributesCompatParcelizer2;
        return audioAttributesCompatParcelizer2;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        setTitleOptional<K, V>.read readVar = this.write;
        if (readVar != null) {
            return readVar;
        }
        setTitleOptional<K, V>.read readVar2 = new read();
        this.write = readVar2;
        return readVar2;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        setTitleOptional<K, V>.write writeVar = this.RemoteActionCompatParcelizer;
        if (writeVar != null) {
            return writeVar;
        }
        setTitleOptional<K, V>.write writeVar2 = new write();
        this.RemoteActionCompatParcelizer = writeVar2;
        return writeVar2;
    }

    final class AudioAttributesCompatParcelizer extends AbstractSet<Map.Entry<K, V>> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new RemoteActionCompatParcelizer();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return setTitleOptional.this.getRemoteActionCompatParcelizer();
        }
    }

    final class read implements Set<K> {
        read() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            setTitleOptional.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return setTitleOptional.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return setTitleOptional.this.read(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return setTitleOptional.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new IconCompatParcelizer();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int iWrite = setTitleOptional.this.write(obj);
            if (iWrite < 0) {
                return false;
            }
            setTitleOptional.this.AudioAttributesCompatParcelizer(iWrite);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return setTitleOptional.this.RemoteActionCompatParcelizer(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return setTitleOptional.this.IconCompatParcelizer(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return setTitleOptional.this.getRemoteActionCompatParcelizer();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int remoteActionCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer();
            Object[] objArr = new Object[remoteActionCompatParcelizer];
            for (int i = 0; i < remoteActionCompatParcelizer; i++) {
                objArr[i] = setTitleOptional.this.write(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = setTitleOptional.this.write(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return setTitleOptional.IconCompatParcelizer(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int iHashCode = 0;
            for (int remoteActionCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer() - 1; remoteActionCompatParcelizer >= 0; remoteActionCompatParcelizer--) {
                K kWrite = setTitleOptional.this.write(remoteActionCompatParcelizer);
                iHashCode += kWrite == null ? 0 : kWrite.hashCode();
            }
            return iHashCode;
        }
    }

    final class write implements Collection<V> {
        write() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            setTitleOptional.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return setTitleOptional.this.IconCompatParcelizer(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return setTitleOptional.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new MediaBrowserCompatItemReceiver();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int iIconCompatParcelizer = setTitleOptional.this.IconCompatParcelizer(obj);
            if (iIconCompatParcelizer < 0) {
                return false;
            }
            setTitleOptional.this.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int remoteActionCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer();
            int i = 0;
            boolean z = false;
            while (i < remoteActionCompatParcelizer) {
                if (collection.contains(setTitleOptional.this.IconCompatParcelizer(i))) {
                    setTitleOptional.this.AudioAttributesCompatParcelizer(i);
                    i--;
                    remoteActionCompatParcelizer--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int remoteActionCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer();
            int i = 0;
            boolean z = false;
            while (i < remoteActionCompatParcelizer) {
                if (!collection.contains(setTitleOptional.this.IconCompatParcelizer(i))) {
                    setTitleOptional.this.AudioAttributesCompatParcelizer(i);
                    i--;
                    remoteActionCompatParcelizer--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return setTitleOptional.this.getRemoteActionCompatParcelizer();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            int remoteActionCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer();
            Object[] objArr = new Object[remoteActionCompatParcelizer];
            for (int i = 0; i < remoteActionCompatParcelizer; i++) {
                objArr[i] = setTitleOptional.this.IconCompatParcelizer(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = setTitleOptional.this.IconCompatParcelizer(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class IconCompatParcelizer extends setWindowCallback<K> {
        IconCompatParcelizer() {
            super(setTitleOptional.this.getRemoteActionCompatParcelizer());
        }

        @Override // kotlin.setWindowCallback
        protected final K write(int i) {
            return setTitleOptional.this.write(i);
        }

        @Override // kotlin.setWindowCallback
        protected final void AudioAttributesCompatParcelizer(int i) {
            setTitleOptional.this.AudioAttributesCompatParcelizer(i);
        }
    }

    final class MediaBrowserCompatItemReceiver extends setWindowCallback<V> {
        MediaBrowserCompatItemReceiver() {
            super(setTitleOptional.this.getRemoteActionCompatParcelizer());
        }

        @Override // kotlin.setWindowCallback
        protected final V write(int i) {
            return setTitleOptional.this.IconCompatParcelizer(i);
        }

        @Override // kotlin.setWindowCallback
        protected final void AudioAttributesCompatParcelizer(int i) {
            setTitleOptional.this.AudioAttributesCompatParcelizer(i);
        }
    }

    final class RemoteActionCompatParcelizer implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        private int IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private int read = -1;

        RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer = setTitleOptional.this.getRemoteActionCompatParcelizer() - 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.read < this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.read++;
            this.RemoteActionCompatParcelizer = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException();
            }
            setTitleOptional.this.AudioAttributesCompatParcelizer(this.read);
            this.read--;
            this.IconCompatParcelizer--;
            this.RemoteActionCompatParcelizer = false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return setTitleOptional.this.write(this.read);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return setTitleOptional.this.IconCompatParcelizer(this.read);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return setTitleOptional.this.RemoteActionCompatParcelizer(this.read, v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return setCheckMarkDrawable.IconCompatParcelizer(entry.getKey(), setTitleOptional.this.write(this.read)) && setCheckMarkDrawable.IconCompatParcelizer(entry.getValue(), setTitleOptional.this.IconCompatParcelizer(this.read));
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kWrite = setTitleOptional.this.write(this.read);
            V vIconCompatParcelizer = setTitleOptional.this.IconCompatParcelizer(this.read);
            return (kWrite == null ? 0 : kWrite.hashCode()) ^ (vIconCompatParcelizer != null ? vIconCompatParcelizer.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    static <T> boolean IconCompatParcelizer(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
