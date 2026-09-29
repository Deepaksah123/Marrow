package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadHelper<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> read = new Comparator<Comparable>() { // from class: o.DownloadHelper.4
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return AudioAttributesCompatParcelizer(comparable, comparable2);
        }

        private static int AudioAttributesCompatParcelizer(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private final boolean AudioAttributesCompatParcelizer;
    private DownloadHelper<K, V>.read AudioAttributesImplApi21Parcelizer;
    private IconCompatParcelizer<K, V> AudioAttributesImplApi26Parcelizer;
    private DownloadHelper<K, V>.RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
    final IconCompatParcelizer<K, V> IconCompatParcelizer;
    private final Comparator<? super K> MediaBrowserCompatItemReceiver;
    int RemoteActionCompatParcelizer;
    int write;

    public DownloadHelper() {
        this(read, true);
    }

    public DownloadHelper(byte b) {
        this(read, false);
    }

    private DownloadHelper(Comparator<? super K> comparator, boolean z) {
        this.RemoteActionCompatParcelizer = 0;
        this.write = 0;
        this.MediaBrowserCompatItemReceiver = comparator == null ? read : comparator;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = new IconCompatParcelizer<>(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        IconCompatParcelizer<K, V> iconCompatParcelizer = read(obj);
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return read(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        if (v == null && !this.AudioAttributesCompatParcelizer) {
            throw new NullPointerException("value == null");
        }
        IconCompatParcelizer<K, V> iconCompatParcelizerWrite = write((Object) k, true);
        V v2 = iconCompatParcelizerWrite.AudioAttributesImplApi21Parcelizer;
        iconCompatParcelizerWrite.AudioAttributesImplApi21Parcelizer = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.RemoteActionCompatParcelizer = 0;
        this.write++;
        IconCompatParcelizer<K, V> iconCompatParcelizer = this.IconCompatParcelizer;
        iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        iconCompatParcelizer.write = iconCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        IconCompatParcelizer<K, V> IconCompatParcelizer2 = IconCompatParcelizer(obj);
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2.AudioAttributesImplApi21Parcelizer;
        }
        return null;
    }

    private IconCompatParcelizer<K, V> write(K k, boolean z) {
        int iCompare;
        IconCompatParcelizer<K, V> iconCompatParcelizer;
        Comparator<? super K> comparator = this.MediaBrowserCompatItemReceiver;
        IconCompatParcelizer<K, V> iconCompatParcelizer2 = this.AudioAttributesImplApi26Parcelizer;
        if (iconCompatParcelizer2 != null) {
            Comparable comparable = comparator == read ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    iCompare = comparable.compareTo(iconCompatParcelizer2.RemoteActionCompatParcelizer);
                } else {
                    iCompare = comparator.compare(k, iconCompatParcelizer2.RemoteActionCompatParcelizer);
                }
                if (iCompare != 0) {
                    IconCompatParcelizer<K, V> iconCompatParcelizer3 = iCompare < 0 ? iconCompatParcelizer2.read : iconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver;
                    if (iconCompatParcelizer3 == null) {
                        break;
                    }
                    iconCompatParcelizer2 = iconCompatParcelizer3;
                } else {
                    return iconCompatParcelizer2;
                }
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        IconCompatParcelizer<K, V> iconCompatParcelizer4 = this.IconCompatParcelizer;
        if (iconCompatParcelizer2 == null) {
            if (comparator == read && !(k instanceof Comparable)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            iconCompatParcelizer = new IconCompatParcelizer<>(this.AudioAttributesCompatParcelizer, iconCompatParcelizer2, k, iconCompatParcelizer4, iconCompatParcelizer4.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        } else {
            iconCompatParcelizer = new IconCompatParcelizer<>(this.AudioAttributesCompatParcelizer, iconCompatParcelizer2, k, iconCompatParcelizer4, iconCompatParcelizer4.AudioAttributesImplApi26Parcelizer);
            if (iCompare < 0) {
                iconCompatParcelizer2.read = iconCompatParcelizer;
            } else {
                iconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            }
            RemoteActionCompatParcelizer(iconCompatParcelizer2, true);
        }
        this.RemoteActionCompatParcelizer++;
        this.write++;
        return iconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IconCompatParcelizer<K, V> read(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return write(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(Map.Entry<?, ?> entry) {
        IconCompatParcelizer<K, V> iconCompatParcelizer = read(entry.getKey());
        if (iconCompatParcelizer == null || !write(iconCompatParcelizer.AudioAttributesImplApi21Parcelizer, entry.getValue())) {
            return null;
        }
        return iconCompatParcelizer;
    }

    private static boolean write(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    final void IconCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer, boolean z) {
        int i;
        if (z) {
            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer.write = iconCompatParcelizer.write;
            iconCompatParcelizer.write.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        }
        IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer.read;
        IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        IconCompatParcelizer<K, V> iconCompatParcelizer4 = iconCompatParcelizer.IconCompatParcelizer;
        int i2 = 0;
        if (iconCompatParcelizer2 != null && iconCompatParcelizer3 != null) {
            IconCompatParcelizer<K, V> iconCompatParcelizerAudioAttributesCompatParcelizer = iconCompatParcelizer2.AudioAttributesCompatParcelizer > iconCompatParcelizer3.AudioAttributesCompatParcelizer ? iconCompatParcelizer2.AudioAttributesCompatParcelizer() : iconCompatParcelizer3.IconCompatParcelizer();
            IconCompatParcelizer((IconCompatParcelizer) iconCompatParcelizerAudioAttributesCompatParcelizer, false);
            IconCompatParcelizer<K, V> iconCompatParcelizer5 = iconCompatParcelizer.read;
            if (iconCompatParcelizer5 != null) {
                i = iconCompatParcelizer5.AudioAttributesCompatParcelizer;
                iconCompatParcelizerAudioAttributesCompatParcelizer.read = iconCompatParcelizer5;
                iconCompatParcelizer5.IconCompatParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer;
                iconCompatParcelizer.read = null;
            } else {
                i = 0;
            }
            IconCompatParcelizer<K, V> iconCompatParcelizer6 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            if (iconCompatParcelizer6 != null) {
                i2 = iconCompatParcelizer6.AudioAttributesCompatParcelizer;
                iconCompatParcelizerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer6;
                iconCompatParcelizer6.IconCompatParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer;
                iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = null;
            }
            iconCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(i, i2) + 1;
            IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizerAudioAttributesCompatParcelizer);
            return;
        }
        if (iconCompatParcelizer2 != null) {
            IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2);
            iconCompatParcelizer.read = null;
        } else if (iconCompatParcelizer3 != null) {
            IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer3);
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = null;
        } else {
            IconCompatParcelizer(iconCompatParcelizer, (IconCompatParcelizer) null);
        }
        RemoteActionCompatParcelizer(iconCompatParcelizer4, false);
        this.RemoteActionCompatParcelizer--;
        this.write++;
    }

    final IconCompatParcelizer<K, V> IconCompatParcelizer(Object obj) {
        IconCompatParcelizer<K, V> iconCompatParcelizer = read(obj);
        if (iconCompatParcelizer != null) {
            IconCompatParcelizer((IconCompatParcelizer) iconCompatParcelizer, true);
        }
        return iconCompatParcelizer;
    }

    private void IconCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer, IconCompatParcelizer<K, V> iconCompatParcelizer2) {
        IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer.IconCompatParcelizer;
        iconCompatParcelizer.IconCompatParcelizer = null;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.IconCompatParcelizer = iconCompatParcelizer3;
        }
        if (iconCompatParcelizer3 != null) {
            if (iconCompatParcelizer3.read == iconCompatParcelizer) {
                iconCompatParcelizer3.read = iconCompatParcelizer2;
                return;
            } else {
                iconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer2;
                return;
            }
        }
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer2;
    }

    private void RemoteActionCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer, boolean z) {
        while (iconCompatParcelizer != null) {
            IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer.read;
            IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            int i = iconCompatParcelizer2 != null ? iconCompatParcelizer2.AudioAttributesCompatParcelizer : 0;
            int i2 = iconCompatParcelizer3 != null ? iconCompatParcelizer3.AudioAttributesCompatParcelizer : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                IconCompatParcelizer<K, V> iconCompatParcelizer4 = iconCompatParcelizer3.read;
                IconCompatParcelizer<K, V> iconCompatParcelizer5 = iconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver;
                int i4 = (iconCompatParcelizer4 != null ? iconCompatParcelizer4.AudioAttributesCompatParcelizer : 0) - (iconCompatParcelizer5 != null ? iconCompatParcelizer5.AudioAttributesCompatParcelizer : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    write(iconCompatParcelizer3);
                }
                AudioAttributesCompatParcelizer((IconCompatParcelizer) iconCompatParcelizer);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                IconCompatParcelizer<K, V> iconCompatParcelizer6 = iconCompatParcelizer2.read;
                IconCompatParcelizer<K, V> iconCompatParcelizer7 = iconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver;
                int i5 = (iconCompatParcelizer6 != null ? iconCompatParcelizer6.AudioAttributesCompatParcelizer : 0) - (iconCompatParcelizer7 != null ? iconCompatParcelizer7.AudioAttributesCompatParcelizer : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    AudioAttributesCompatParcelizer((IconCompatParcelizer) iconCompatParcelizer2);
                }
                write(iconCompatParcelizer);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer = i + 1;
                if (z) {
                    return;
                }
            } else {
                iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            iconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
        }
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer) {
        IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer.read;
        IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        IconCompatParcelizer<K, V> iconCompatParcelizer4 = iconCompatParcelizer3.read;
        IconCompatParcelizer<K, V> iconCompatParcelizer5 = iconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver;
        iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer4;
        if (iconCompatParcelizer4 != null) {
            iconCompatParcelizer4.IconCompatParcelizer = iconCompatParcelizer;
        }
        IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer3);
        iconCompatParcelizer3.read = iconCompatParcelizer;
        iconCompatParcelizer.IconCompatParcelizer = iconCompatParcelizer3;
        iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer2 != null ? iconCompatParcelizer2.AudioAttributesCompatParcelizer : 0, iconCompatParcelizer4 != null ? iconCompatParcelizer4.AudioAttributesCompatParcelizer : 0) + 1;
        iconCompatParcelizer3.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer5 != null ? iconCompatParcelizer5.AudioAttributesCompatParcelizer : 0) + 1;
    }

    private void write(IconCompatParcelizer<K, V> iconCompatParcelizer) {
        IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer.read;
        IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        IconCompatParcelizer<K, V> iconCompatParcelizer4 = iconCompatParcelizer2.read;
        IconCompatParcelizer<K, V> iconCompatParcelizer5 = iconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver;
        iconCompatParcelizer.read = iconCompatParcelizer5;
        if (iconCompatParcelizer5 != null) {
            iconCompatParcelizer5.IconCompatParcelizer = iconCompatParcelizer;
        }
        IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2);
        iconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
        iconCompatParcelizer.IconCompatParcelizer = iconCompatParcelizer2;
        iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer3 != null ? iconCompatParcelizer3.AudioAttributesCompatParcelizer : 0, iconCompatParcelizer5 != null ? iconCompatParcelizer5.AudioAttributesCompatParcelizer : 0) + 1;
        iconCompatParcelizer2.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer4 != null ? iconCompatParcelizer4.AudioAttributesCompatParcelizer : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        DownloadHelper<K, V>.read readVar = this.AudioAttributesImplApi21Parcelizer;
        if (readVar != null) {
            return readVar;
        }
        DownloadHelper<K, V>.read readVar2 = new read();
        this.AudioAttributesImplApi21Parcelizer = readVar2;
        return readVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        DownloadHelper<K, V>.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer;
        }
        DownloadHelper<K, V>.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer2;
        return remoteActionCompatParcelizer2;
    }

    static final class IconCompatParcelizer<K, V> implements Map.Entry<K, V> {
        int AudioAttributesCompatParcelizer;
        V AudioAttributesImplApi21Parcelizer;
        IconCompatParcelizer<K, V> AudioAttributesImplApi26Parcelizer;
        IconCompatParcelizer<K, V> IconCompatParcelizer;
        IconCompatParcelizer<K, V> MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        final K RemoteActionCompatParcelizer;
        IconCompatParcelizer<K, V> read;
        IconCompatParcelizer<K, V> write;

        IconCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatItemReceiver = z;
            this.AudioAttributesImplApi26Parcelizer = this;
            this.write = this;
        }

        IconCompatParcelizer(boolean z, IconCompatParcelizer<K, V> iconCompatParcelizer, K k, IconCompatParcelizer<K, V> iconCompatParcelizer2, IconCompatParcelizer<K, V> iconCompatParcelizer3) {
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = k;
            this.MediaBrowserCompatItemReceiver = z;
            this.AudioAttributesCompatParcelizer = 1;
            this.write = iconCompatParcelizer2;
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer3;
            iconCompatParcelizer3.write = this;
            iconCompatParcelizer2.AudioAttributesImplApi26Parcelizer = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null && !this.MediaBrowserCompatItemReceiver) {
                throw new NullPointerException("value == null");
            }
            V v2 = this.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi21Parcelizer = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.RemoteActionCompatParcelizer;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.AudioAttributesImplApi21Parcelizer;
            return v == null ? entry.getValue() == null : v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.RemoteActionCompatParcelizer;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.AudioAttributesImplApi21Parcelizer;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("=");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            return sb.toString();
        }

        public final IconCompatParcelizer<K, V> IconCompatParcelizer() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.read;
            while (iconCompatParcelizer != null) {
                IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer;
                iconCompatParcelizer = iconCompatParcelizer.read;
                this = iconCompatParcelizer2;
            }
            return this;
        }

        public final IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            while (iconCompatParcelizer != null) {
                IconCompatParcelizer<K, V> iconCompatParcelizer2 = iconCompatParcelizer;
                iconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                this = iconCompatParcelizer2;
            }
            return this;
        }
    }

    abstract class AudioAttributesCompatParcelizer<T> implements Iterator<T> {
        private IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer = null;
        private IconCompatParcelizer<K, V> IconCompatParcelizer;
        private int read;

        AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = DownloadHelper.this.IconCompatParcelizer.write;
            this.read = DownloadHelper.this.write;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer != DownloadHelper.this.IconCompatParcelizer;
        }

        final IconCompatParcelizer<K, V> IconCompatParcelizer() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.IconCompatParcelizer;
            if (iconCompatParcelizer == DownloadHelper.this.IconCompatParcelizer) {
                throw new NoSuchElementException();
            }
            if (DownloadHelper.this.write != this.read) {
                throw new ConcurrentModificationException();
            }
            this.IconCompatParcelizer = iconCompatParcelizer.write;
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            return iconCompatParcelizer;
        }

        @Override // java.util.Iterator
        public final void remove() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (iconCompatParcelizer == null) {
                throw new IllegalStateException();
            }
            DownloadHelper.this.IconCompatParcelizer((IconCompatParcelizer) iconCompatParcelizer, true);
            this.AudioAttributesCompatParcelizer = null;
            this.read = DownloadHelper.this.write;
        }
    }

    class read extends AbstractSet<Map.Entry<K, V>> {
        read() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return DownloadHelper.this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new DownloadHelper<K, V>.AudioAttributesCompatParcelizer<Map.Entry<K, V>>() { // from class: o.DownloadHelper.read.3
                {
                    DownloadHelper downloadHelper = DownloadHelper.this;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.Iterator
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> next() {
                    return IconCompatParcelizer();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && DownloadHelper.this.AudioAttributesCompatParcelizer((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            IconCompatParcelizer<K, V> iconCompatParcelizerAudioAttributesCompatParcelizer;
            if (!(obj instanceof Map.Entry) || (iconCompatParcelizerAudioAttributesCompatParcelizer = DownloadHelper.this.AudioAttributesCompatParcelizer((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            DownloadHelper.this.IconCompatParcelizer((IconCompatParcelizer) iconCompatParcelizerAudioAttributesCompatParcelizer, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            DownloadHelper.this.clear();
        }
    }

    final class RemoteActionCompatParcelizer extends AbstractSet<K> {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return DownloadHelper.this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new DownloadHelper<K, V>.AudioAttributesCompatParcelizer<K>() { // from class: o.DownloadHelper.RemoteActionCompatParcelizer.3
                {
                    DownloadHelper downloadHelper = DownloadHelper.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return IconCompatParcelizer().RemoteActionCompatParcelizer;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return DownloadHelper.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return DownloadHelper.this.IconCompatParcelizer(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            DownloadHelper.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
