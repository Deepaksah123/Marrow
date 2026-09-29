package kotlin;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.parseTfhd;

/* JADX INFO: loaded from: classes3.dex */
abstract class readNextSampleSize<K, V> implements outputPendingMetadataSamples<K, V> {
    private transient Collection<V> AudioAttributesCompatParcelizer;
    private transient Collection<Map.Entry<K, V>> RemoteActionCompatParcelizer;
    private transient Map<K, Collection<V>> read;
    private transient Set<K> write;

    abstract Map<K, Collection<V>> AudioAttributesImplApi21Parcelizer();

    abstract Set<K> AudioAttributesImplApi26Parcelizer();

    abstract Collection<Map.Entry<K, V>> MediaBrowserCompatItemReceiver();

    abstract Iterator<Map.Entry<K, V>> MediaBrowserCompatMediaItem();

    abstract Collection<V> MediaBrowserCompatSearchResultReceiver();

    readNextSampleSize() {
    }

    @Override // kotlin.outputPendingMetadataSamples
    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return RatingCompat() == 0;
    }

    public boolean AudioAttributesCompatParcelizer(Object obj) {
        Iterator<Collection<V>> it = RemoteActionCompatParcelizer().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.outputPendingMetadataSamples
    public boolean IconCompatParcelizer(Object obj, Object obj2) {
        Collection<V> collection = RemoteActionCompatParcelizer().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // kotlin.outputPendingMetadataSamples
    public boolean write(Object obj, Object obj2) {
        Collection<V> collection = RemoteActionCompatParcelizer().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // kotlin.outputPendingMetadataSamples
    public boolean read(K k, V v) {
        return RemoteActionCompatParcelizer(k).add(v);
    }

    public boolean read(K k, Iterable<? extends V> iterable) {
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && RemoteActionCompatParcelizer(k).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && parseSaio.IconCompatParcelizer(RemoteActionCompatParcelizer(k), it);
    }

    @Override // kotlin.outputPendingMetadataSamples
    public Collection<Map.Entry<K, V>> MediaMetadataCompat() {
        Collection<Map.Entry<K, V>> collection = this.RemoteActionCompatParcelizer;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        this.RemoteActionCompatParcelizer = collectionMediaBrowserCompatItemReceiver;
        return collectionMediaBrowserCompatItemReceiver;
    }

    class AudioAttributesCompatParcelizer extends parseTfhd.RemoteActionCompatParcelizer<K, V> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // o.parseTfhd.RemoteActionCompatParcelizer
        final outputPendingMetadataSamples<K, V> write() {
            return readNextSampleSize.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return readNextSampleSize.this.MediaBrowserCompatMediaItem();
        }
    }

    class IconCompatParcelizer extends readNextSampleSize<K, V>.AudioAttributesCompatParcelizer implements Set<Map.Entry<K, V>> {
        IconCompatParcelizer(readNextSampleSize readnextsamplesize) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return modifyTrack.AudioAttributesCompatParcelizer(this);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return modifyTrack.RemoteActionCompatParcelizer(this, obj);
        }
    }

    @Override // kotlin.outputPendingMetadataSamples
    public Set<K> onCommand() {
        Set<K> set = this.write;
        if (set != null) {
            return set;
        }
        Set<K> setAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        this.write = setAudioAttributesImplApi26Parcelizer;
        return setAudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.outputPendingMetadataSamples
    public Collection<V> onAddQueueItem() {
        Collection<V> collection = this.AudioAttributesCompatParcelizer;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        this.AudioAttributesCompatParcelizer = collectionMediaBrowserCompatSearchResultReceiver;
        return collectionMediaBrowserCompatSearchResultReceiver;
    }

    class write extends AbstractCollection<V> {
        write() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return readNextSampleSize.this.MediaDescriptionCompat();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return readNextSampleSize.this.RatingCompat();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return readNextSampleSize.this.AudioAttributesCompatParcelizer(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            readNextSampleSize.this.read();
        }
    }

    Iterator<V> MediaDescriptionCompat() {
        return parseSaiz.AudioAttributesCompatParcelizer(MediaMetadataCompat().iterator());
    }

    @Override // kotlin.outputPendingMetadataSamples
    public Map<K, Collection<V>> RemoteActionCompatParcelizer() {
        Map<K, Collection<V>> map = this.read;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        this.read = mapAudioAttributesImplApi21Parcelizer;
        return mapAudioAttributesImplApi21Parcelizer;
    }

    public boolean equals(Object obj) {
        return parseTfhd.read(this, obj);
    }

    public int hashCode() {
        return RemoteActionCompatParcelizer().hashCode();
    }

    public String toString() {
        return RemoteActionCompatParcelizer().toString();
    }
}
