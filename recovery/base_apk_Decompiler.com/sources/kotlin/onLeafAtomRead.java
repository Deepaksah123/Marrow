package kotlin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.readEncryptionData;

/* JADX INFO: loaded from: classes3.dex */
public abstract class onLeafAtomRead<K, V> extends AtomParsersStsdData<K, V> implements Serializable {
    private transient int IconCompatParcelizer;
    final transient onMoovContainerAtomRead<K, ? extends getNextTrackBundle<V>> write;

    @Override // kotlin.outputPendingMetadataSamples, kotlin.parseMoof
    public abstract getNextTrackBundle<V> write(K k);

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, Object obj2) {
        return super.IconCompatParcelizer(obj, obj2);
    }

    @Override // kotlin.readNextSampleSize
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public final /* bridge */ /* synthetic */ boolean handleMediaPlayPauseIfPendingOnHandler() {
        return super.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.readNextSampleSize
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.readNextSampleSize
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static class IconCompatParcelizer<K, V> {
        private Map<K, Collection<V>> AudioAttributesCompatParcelizer = parseTrex.write();
        private Comparator<? super V> read;
        private Comparator<? super K> write;

        private static Collection<V> RemoteActionCompatParcelizer() {
            return new ArrayList();
        }

        public IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(K k, V v) {
            FixedSampleSizeRechunker.write(k, v);
            Collection<V> collection = this.AudioAttributesCompatParcelizer.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.AudioAttributesCompatParcelizer;
                Collection<V> collectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                map.put(k, collectionRemoteActionCompatParcelizer);
                collection = collectionRemoteActionCompatParcelizer;
            }
            collection.add(v);
            return this;
        }

        public IconCompatParcelizer<K, V> write(K k, Iterable<? extends V> iterable) {
            if (k == null) {
                StringBuilder sb = new StringBuilder("null key in entry: null=");
                sb.append(onMoofContainerAtomRead.RemoteActionCompatParcelizer(iterable));
                throw new NullPointerException(sb.toString());
            }
            Collection<V> collection = this.AudioAttributesCompatParcelizer.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    FixedSampleSizeRechunker.write(k, v);
                    collection.add(v);
                }
            } else {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> collectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    while (it.hasNext()) {
                        V next = it.next();
                        FixedSampleSizeRechunker.write(k, next);
                        collectionRemoteActionCompatParcelizer.add(next);
                    }
                    this.AudioAttributesCompatParcelizer.put(k, collectionRemoteActionCompatParcelizer);
                    return this;
                }
            }
            return this;
        }

        public IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(outputPendingMetadataSamples<? extends K, ? extends V> outputpendingmetadatasamples) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : outputpendingmetadatasamples.RemoteActionCompatParcelizer().entrySet()) {
                write(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public onLeafAtomRead<K, V> AudioAttributesCompatParcelizer() {
            return onContainerAtomRead.IconCompatParcelizer((Collection) this.AudioAttributesCompatParcelizer.entrySet(), (Comparator) this.read);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class write {
        static final readEncryptionData.IconCompatParcelizer<onLeafAtomRead> AudioAttributesCompatParcelizer = readEncryptionData.read(onLeafAtomRead.class, "map");
        static final readEncryptionData.IconCompatParcelizer<onLeafAtomRead> IconCompatParcelizer = readEncryptionData.read(onLeafAtomRead.class, "size");

        write() {
        }
    }

    onLeafAtomRead(onMoovContainerAtomRead<K, ? extends getNextTrackBundle<V>> onmoovcontaineratomread, int i) {
        this.write = onmoovcontaineratomread;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.outputPendingMetadataSamples
    @Deprecated
    public final void read() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    @Deprecated
    public final boolean read(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.readNextSampleSize
    @Deprecated
    public final boolean read(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    @Deprecated
    public final boolean write(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    final boolean AudioAttributesImplBaseParcelizer() {
        return this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean AudioAttributesImplApi26Parcelizer(Object obj) {
        return this.write.containsKey(obj);
    }

    @Override // kotlin.readNextSampleSize
    public final boolean AudioAttributesCompatParcelizer(Object obj) {
        return obj != null && super.AudioAttributesCompatParcelizer(obj);
    }

    @Override // kotlin.outputPendingMetadataSamples
    public final int RatingCompat() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final onEmsgLeafAtomRead<K> onCommand() {
        return this.write.keySet();
    }

    @Override // kotlin.readNextSampleSize
    final Set<K> AudioAttributesImplApi26Parcelizer() {
        throw new AssertionError("unreachable");
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public onMoovContainerAtomRead<K, Collection<V>> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.readNextSampleSize
    final Map<K, Collection<V>> AudioAttributesImplApi21Parcelizer() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    /* JADX INFO: renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
    public getNextTrackBundle<Map.Entry<K, V>> MediaMetadataCompat() {
        return (getNextTrackBundle) super.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.readNextSampleSize
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getNextTrackBundle<Map.Entry<K, V>> MediaBrowserCompatItemReceiver() {
        return new read(this);
    }

    static class read<K, V> extends getNextTrackBundle<Map.Entry<K, V>> {
        private onLeafAtomRead<K, V> write;

        @Override // kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Iterator iterator() {
            return iterator();
        }

        read(onLeafAtomRead<K, V> onleafatomread) {
            this.write = onleafatomread;
        }

        @Override // kotlin.getNextTrackBundle
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
        public final getCurrentSampleFlags<Map.Entry<K, V>> iterator() {
            return this.write.MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return this.write.AudioAttributesImplBaseParcelizer();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.write.RatingCompat();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.write.IconCompatParcelizer(entry.getKey(), entry.getValue());
        }

        @Override // kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.readNextSampleSize
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final getCurrentSampleFlags<Map.Entry<K, V>> MediaBrowserCompatMediaItem() {
        return new getCurrentSampleFlags<Map.Entry<K, V>>() { // from class: o.onLeafAtomRead.5
            private Iterator<? extends Map.Entry<K, ? extends getNextTrackBundle<V>>> AudioAttributesCompatParcelizer;
            private K IconCompatParcelizer = null;
            private Iterator<V> write = parseSaio.IconCompatParcelizer();

            {
                this.AudioAttributesCompatParcelizer = onLeafAtomRead.this.write.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.write.hasNext() || this.AudioAttributesCompatParcelizer.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!this.write.hasNext()) {
                    Map.Entry<K, ? extends getNextTrackBundle<V>> next = this.AudioAttributesCompatParcelizer.next();
                    this.IconCompatParcelizer = next.getKey();
                    this.write = next.getValue().iterator();
                }
                return parseSaiz.IconCompatParcelizer(Objects.requireNonNull(this.IconCompatParcelizer), this.write.next());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    /* JADX INFO: renamed from: onFastForward, reason: merged with bridge method [inline-methods] */
    public getNextTrackBundle<V> onAddQueueItem() {
        return (getNextTrackBundle) super.onAddQueueItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.readNextSampleSize
    /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
    public getNextTrackBundle<V> MediaBrowserCompatSearchResultReceiver() {
        return new AudioAttributesCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.readNextSampleSize
    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: merged with bridge method [inline-methods] */
    public final getCurrentSampleFlags<V> MediaDescriptionCompat() {
        return new getCurrentSampleFlags<V>() { // from class: o.onLeafAtomRead.3
            private Iterator<V> read = parseSaio.IconCompatParcelizer();
            private Iterator<? extends getNextTrackBundle<V>> write;

            {
                this.write = onLeafAtomRead.this.write.values().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.read.hasNext() || this.write.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                if (!this.read.hasNext()) {
                    this.read = this.write.next().iterator();
                }
                return this.read.next();
            }
        };
    }

    static final class AudioAttributesCompatParcelizer<K, V> extends getNextTrackBundle<V> {
        private final transient onLeafAtomRead<K, V> read;

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return true;
        }

        @Override // kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Iterator iterator() {
            return iterator();
        }

        AudioAttributesCompatParcelizer(onLeafAtomRead<K, V> onleafatomread) {
            this.read = onleafatomread;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.read.AudioAttributesCompatParcelizer(obj);
        }

        @Override // kotlin.getNextTrackBundle
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
        public final getCurrentSampleFlags<V> iterator() {
            return this.read.MediaDescriptionCompat();
        }

        @Override // kotlin.getNextTrackBundle
        final int IconCompatParcelizer(Object[] objArr, int i) {
            getCurrentSampleFlags<? extends getNextTrackBundle<V>> it = this.read.write.values().iterator();
            while (it.hasNext()) {
                i = it.next().IconCompatParcelizer(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.read.RatingCompat();
        }

        @Override // kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }
}
