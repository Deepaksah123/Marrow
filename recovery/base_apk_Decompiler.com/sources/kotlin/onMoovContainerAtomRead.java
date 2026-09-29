package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import kotlin.getNextTrackBundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class onMoovContainerAtomRead<K, V> implements Map<K, V>, Serializable {
    private transient getNextTrackBundle<V> AudioAttributesCompatParcelizer;
    private transient onEmsgLeafAtomRead<Map.Entry<K, V>> IconCompatParcelizer;
    private transient onEmsgLeafAtomRead<K> RemoteActionCompatParcelizer;

    abstract getNextTrackBundle<V> AudioAttributesImplApi21Parcelizer();

    abstract onEmsgLeafAtomRead<Map.Entry<K, V>> IconCompatParcelizer();

    abstract boolean MediaBrowserCompatCustomActionResultReceiver();

    abstract onEmsgLeafAtomRead<K> RemoteActionCompatParcelizer();

    @Override // java.util.Map
    public abstract V get(Object obj);

    public static <K, V> onMoovContainerAtomRead<K, V> AudioAttributesCompatParcelizer() {
        return (onMoovContainerAtomRead<K, V>) parseTrun.IconCompatParcelizer;
    }

    public static <K, V> onMoovContainerAtomRead<K, V> RemoteActionCompatParcelizer(K k, V v) {
        FixedSampleSizeRechunker.write(k, v);
        return parseTrun.IconCompatParcelizer(1, new Object[]{k, v});
    }

    public static <K, V> onMoovContainerAtomRead<K, V> RemoteActionCompatParcelizer(K k, V v, K k2, V v2, K k3, V v3) {
        FixedSampleSizeRechunker.write(k, v);
        FixedSampleSizeRechunker.write(k2, v2);
        FixedSampleSizeRechunker.write(k3, v3);
        return parseTrun.IconCompatParcelizer(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> AudioAttributesCompatParcelizer<K, V> read() {
        return new AudioAttributesCompatParcelizer<>();
    }

    public static <K, V> AudioAttributesCompatParcelizer<K, V> write() {
        FixedSampleSizeRechunker.IconCompatParcelizer(109, "expectedSize");
        return new AudioAttributesCompatParcelizer<>(109);
    }

    public static class AudioAttributesCompatParcelizer<K, V> {
        private boolean AudioAttributesCompatParcelizer;
        read IconCompatParcelizer;
        private Object[] RemoteActionCompatParcelizer;
        private Comparator<? super V> read;
        private int write;

        public AudioAttributesCompatParcelizer() {
            this(4);
        }

        AudioAttributesCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = new Object[i << 1];
            this.write = 0;
            this.AudioAttributesCompatParcelizer = false;
        }

        private void read(int i) {
            int i2 = i << 1;
            Object[] objArr = this.RemoteActionCompatParcelizer;
            if (i2 > objArr.length) {
                this.RemoteActionCompatParcelizer = Arrays.copyOf(objArr, getNextTrackBundle.read.write(objArr.length, i2));
                this.AudioAttributesCompatParcelizer = false;
            }
        }

        public final AudioAttributesCompatParcelizer<K, V> read(K k, V v) {
            read(this.write + 1);
            FixedSampleSizeRechunker.write(k, v);
            Object[] objArr = this.RemoteActionCompatParcelizer;
            int i = this.write;
            int i2 = i << 1;
            objArr[i2] = k;
            objArr[i2 + 1] = v;
            this.write = i + 1;
            return this;
        }

        private AudioAttributesCompatParcelizer<K, V> AudioAttributesCompatParcelizer(Map.Entry<? extends K, ? extends V> entry) {
            return read(entry.getKey(), entry.getValue());
        }

        public final AudioAttributesCompatParcelizer<K, V> read(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                read(this.write + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer(it.next());
            }
            return this;
        }

        private onMoovContainerAtomRead<K, V> RemoteActionCompatParcelizer() {
            read readVar = this.IconCompatParcelizer;
            if (readVar != null) {
                throw readVar.write();
            }
            int i = this.write;
            Object[] objArr = this.RemoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = true;
            parseTrun parsetrunIconCompatParcelizer = parseTrun.IconCompatParcelizer(i, objArr, this);
            read readVar2 = this.IconCompatParcelizer;
            if (readVar2 == null) {
                return parsetrunIconCompatParcelizer;
            }
            throw readVar2.write();
        }

        public final onMoovContainerAtomRead<K, V> write() {
            return AudioAttributesCompatParcelizer();
        }

        public final onMoovContainerAtomRead<K, V> AudioAttributesCompatParcelizer() {
            return RemoteActionCompatParcelizer();
        }

        static final class read {
            private final Object AudioAttributesCompatParcelizer;
            private final Object IconCompatParcelizer;
            private final Object write;

            read(Object obj, Object obj2, Object obj3) {
                this.IconCompatParcelizer = obj;
                this.write = obj2;
                this.AudioAttributesCompatParcelizer = obj3;
            }

            final IllegalArgumentException write() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                sb.append(this.IconCompatParcelizer);
                sb.append("=");
                sb.append(this.write);
                sb.append(" and ");
                sb.append(this.IconCompatParcelizer);
                sb.append("=");
                sb.append(this.AudioAttributesCompatParcelizer);
                return new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static <K, V> onMoovContainerAtomRead<K, V> write(Map<? extends K, ? extends V> map) {
        if ((map instanceof onMoovContainerAtomRead) && !(map instanceof SortedMap)) {
            return (onMoovContainerAtomRead) map;
        }
        return write(map.entrySet());
    }

    private static <K, V> onMoovContainerAtomRead<K, V> write(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        audioAttributesCompatParcelizer.read(iterable);
        return audioAttributesCompatParcelizer.write();
    }

    onMoovContainerAtomRead() {
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final onEmsgLeafAtomRead<Map.Entry<K, V>> entrySet() {
        onEmsgLeafAtomRead<Map.Entry<K, V>> onemsgleafatomread = this.IconCompatParcelizer;
        if (onemsgleafatomread != null) {
            return onemsgleafatomread;
        }
        onEmsgLeafAtomRead<Map.Entry<K, V>> onemsgleafatomreadIconCompatParcelizer = IconCompatParcelizer();
        this.IconCompatParcelizer = onemsgleafatomreadIconCompatParcelizer;
        return onemsgleafatomreadIconCompatParcelizer;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final onEmsgLeafAtomRead<K> keySet() {
        onEmsgLeafAtomRead<K> onemsgleafatomread = this.RemoteActionCompatParcelizer;
        if (onemsgleafatomread != null) {
            return onemsgleafatomread;
        }
        onEmsgLeafAtomRead<K> onemsgleafatomreadRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = onemsgleafatomreadRemoteActionCompatParcelizer;
        return onemsgleafatomreadRemoteActionCompatParcelizer;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public final getNextTrackBundle<V> values() {
        getNextTrackBundle<V> getnexttrackbundle = this.AudioAttributesCompatParcelizer;
        if (getnexttrackbundle != null) {
            return getnexttrackbundle;
        }
        getNextTrackBundle<V> getnexttrackbundleAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        this.AudioAttributesCompatParcelizer = getnexttrackbundleAudioAttributesImplApi21Parcelizer;
        return getnexttrackbundleAudioAttributesImplApi21Parcelizer;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return parseSaiz.AudioAttributesCompatParcelizer(this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return modifyTrack.AudioAttributesCompatParcelizer(entrySet());
    }

    public String toString() {
        return parseSaiz.IconCompatParcelizer(this);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class write<K, V> implements Serializable {
        private final Object IconCompatParcelizer;
        private final Object read;

        write(onMoovContainerAtomRead<K, V> onmoovcontaineratomread) {
            Object[] objArr = new Object[onmoovcontaineratomread.size()];
            Object[] objArr2 = new Object[onmoovcontaineratomread.size()];
            getCurrentSampleFlags<Map.Entry<K, V>> getcurrentsampleflagsAudioAttributesImplApi21Parcelizer = onmoovcontaineratomread.entrySet().iterator();
            int i = 0;
            while (getcurrentsampleflagsAudioAttributesImplApi21Parcelizer.hasNext()) {
                Map.Entry<K, V> next = getcurrentsampleflagsAudioAttributesImplApi21Parcelizer.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.IconCompatParcelizer = objArr;
            this.read = objArr2;
        }

        final Object readResolve() {
            return RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Object RemoteActionCompatParcelizer() {
            Object[] objArr = (Object[]) this.IconCompatParcelizer;
            Object[] objArr2 = (Object[]) this.read;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                audioAttributesCompatParcelizerWrite.read(objArr[i], objArr2[i]);
            }
            return audioAttributesCompatParcelizerWrite.AudioAttributesCompatParcelizer();
        }

        private static AudioAttributesCompatParcelizer<K, V> write(int i) {
            return new AudioAttributesCompatParcelizer<>(i);
        }
    }

    Object writeReplace() {
        return new write(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
