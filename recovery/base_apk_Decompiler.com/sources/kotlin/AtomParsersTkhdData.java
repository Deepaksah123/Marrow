package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class AtomParsersTkhdData<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    private transient Object[] AudioAttributesImplApi21Parcelizer;
    private transient Object AudioAttributesImplApi26Parcelizer;
    private transient int AudioAttributesImplBaseParcelizer;
    private transient Object[] IconCompatParcelizer;
    private transient int MediaBrowserCompatCustomActionResultReceiver;
    private transient Collection<V> MediaBrowserCompatItemReceiver;
    private transient Set<Map.Entry<K, V>> RemoteActionCompatParcelizer;
    private transient int[] read;
    private transient Set<K> write;

    static int read(int i) {
        return i - 1;
    }

    static /* synthetic */ int AudioAttributesCompatParcelizer(AtomParsersTkhdData atomParsersTkhdData) {
        int i = atomParsersTkhdData.AudioAttributesImplBaseParcelizer;
        atomParsersTkhdData.AudioAttributesImplBaseParcelizer = i - 1;
        return i;
    }

    public static <K, V> AtomParsersTkhdData<K, V> RemoteActionCompatParcelizer() {
        return new AtomParsersTkhdData<>();
    }

    public static <K, V> AtomParsersTkhdData<K, V> RemoteActionCompatParcelizer(int i) {
        return new AtomParsersTkhdData<>(i);
    }

    AtomParsersTkhdData() {
        AudioAttributesImplApi21Parcelizer(3);
    }

    private AtomParsersTkhdData(int i) {
        AudioAttributesImplApi21Parcelizer(i);
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        parseStsd.write(i >= 0, "Expected size must be >= 0");
        this.MediaBrowserCompatCustomActionResultReceiver = parseTextAttribute.AudioAttributesCompatParcelizer(i, 1);
    }

    final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer == null;
    }

    private int MediaBrowserCompatMediaItem() {
        parseStsd.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), "Arrays already allocated");
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int iWrite = AtomParsersUdtaInfo.write(i);
        this.AudioAttributesImplApi26Parcelizer = AtomParsersUdtaInfo.read(iWrite);
        AudioAttributesImplBaseParcelizer(iWrite - 1);
        this.read = new int[i];
        this.IconCompatParcelizer = new Object[i];
        this.AudioAttributesImplApi21Parcelizer = new Object[i];
        return i;
    }

    final Map<K, V> IconCompatParcelizer() {
        Object obj = this.AudioAttributesImplApi26Parcelizer;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private static Map<K, V> MediaBrowserCompatCustomActionResultReceiver(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    private Map<K, V> onCustomAction() {
        Map<K, V> mapMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(AudioAttributesImplApi26Parcelizer() + 1);
        int iAudioAttributesCompatParcelizer = read();
        while (iAudioAttributesCompatParcelizer >= 0) {
            mapMediaBrowserCompatCustomActionResultReceiver.put(write(iAudioAttributesCompatParcelizer), MediaBrowserCompatItemReceiver(iAudioAttributesCompatParcelizer));
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = mapMediaBrowserCompatCustomActionResultReceiver;
        this.read = null;
        this.IconCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        MediaBrowserCompatCustomActionResultReceiver();
        return mapMediaBrowserCompatCustomActionResultReceiver;
    }

    private void AudioAttributesImplBaseParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int AudioAttributesImplApi26Parcelizer() {
        return (1 << (this.MediaBrowserCompatCustomActionResultReceiver & 31)) - 1;
    }

    final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatCustomActionResultReceiver += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int iAudioAttributesCompatParcelizer;
        int i;
        if (AudioAttributesImplBaseParcelizer()) {
            MediaBrowserCompatMediaItem();
        }
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.put(k, v);
        }
        int[] iArrMediaMetadataCompat = MediaMetadataCompat();
        Object[] objArrRatingCompat = RatingCompat();
        Object[] objArrMediaDescriptionCompat = MediaDescriptionCompat();
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 1;
        int i4 = getDefaultSampleValues.read(k);
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i5 = i4 & iAudioAttributesImplApi26Parcelizer;
        int iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), i5);
        if (iRemoteActionCompatParcelizer != 0) {
            int iAudioAttributesCompatParcelizer2 = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i4, iAudioAttributesImplApi26Parcelizer);
            int i6 = 0;
            while (true) {
                int i7 = iRemoteActionCompatParcelizer - 1;
                int i8 = iArrMediaMetadataCompat[i7];
                if (AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i8, iAudioAttributesImplApi26Parcelizer) == iAudioAttributesCompatParcelizer2 && parseSmta.AudioAttributesCompatParcelizer(k, objArrRatingCompat[i7])) {
                    V v2 = (V) objArrMediaDescriptionCompat[i7];
                    objArrMediaDescriptionCompat[i7] = v;
                    return v2;
                }
                int iWrite = AtomParsersUdtaInfo.write(i8, iAudioAttributesImplApi26Parcelizer);
                i6++;
                if (iWrite != 0) {
                    iRemoteActionCompatParcelizer = iWrite;
                } else {
                    if (i6 >= 9) {
                        return onCustomAction().put(k, v);
                    }
                    if (i3 > iAudioAttributesImplApi26Parcelizer) {
                        iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, AtomParsersUdtaInfo.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer), i4, i2);
                    } else {
                        iArrMediaMetadataCompat[i7] = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i8, i3, iAudioAttributesImplApi26Parcelizer);
                    }
                }
            }
            i = iAudioAttributesImplApi26Parcelizer;
        } else if (i3 > iAudioAttributesImplApi26Parcelizer) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesImplApi26Parcelizer, AtomParsersUdtaInfo.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer), i4, i2);
            i = iAudioAttributesCompatParcelizer;
        } else {
            AtomParsersUdtaInfo.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), i5, i3);
            i = iAudioAttributesImplApi26Parcelizer;
        }
        AudioAttributesImplApi26Parcelizer(i3);
        write(i2, k, v, i4, i);
        this.AudioAttributesImplBaseParcelizer = i3;
        MediaBrowserCompatCustomActionResultReceiver();
        return null;
    }

    private void write(int i, K k, V v, int i2, int i3) {
        write(i, AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i2, 0, i3));
        write(i, k);
        read(i, v);
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        int iMin;
        int length = MediaMetadataCompat().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        MediaDescriptionCompat(iMin);
    }

    private void MediaDescriptionCompat(int i) {
        this.read = Arrays.copyOf(MediaMetadataCompat(), i);
        this.IconCompatParcelizer = Arrays.copyOf(RatingCompat(), i);
        this.AudioAttributesImplApi21Parcelizer = Arrays.copyOf(MediaDescriptionCompat(), i);
    }

    private int AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
        Object obj = AtomParsersUdtaInfo.read(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AtomParsersUdtaInfo.IconCompatParcelizer(obj, i3 & i5, i4 + 1);
        }
        Object objMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        int[] iArrMediaMetadataCompat = MediaMetadataCompat();
        for (int i6 = 0; i6 <= i; i6++) {
            int iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.RemoteActionCompatParcelizer(objMediaBrowserCompatSearchResultReceiver, i6);
            while (iRemoteActionCompatParcelizer != 0) {
                int i7 = iRemoteActionCompatParcelizer - 1;
                int i8 = iArrMediaMetadataCompat[i7];
                int iAudioAttributesCompatParcelizer = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i8, i) | i6;
                int i9 = iAudioAttributesCompatParcelizer & i5;
                int iRemoteActionCompatParcelizer2 = AtomParsersUdtaInfo.RemoteActionCompatParcelizer(obj, i9);
                AtomParsersUdtaInfo.IconCompatParcelizer(obj, i9, iRemoteActionCompatParcelizer);
                iArrMediaMetadataCompat[i7] = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer2, i5);
                iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.write(i8, i);
            }
        }
        this.AudioAttributesImplApi26Parcelizer = obj;
        AudioAttributesImplBaseParcelizer(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int RemoteActionCompatParcelizer(Object obj) {
        if (AudioAttributesImplBaseParcelizer()) {
            return -1;
        }
        int i = getDefaultSampleValues.read(obj);
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), i & iAudioAttributesImplApi26Parcelizer);
        if (iRemoteActionCompatParcelizer == 0) {
            return -1;
        }
        int iAudioAttributesCompatParcelizer = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i, iAudioAttributesImplApi26Parcelizer);
        do {
            int i2 = iRemoteActionCompatParcelizer - 1;
            int iIconCompatParcelizer = IconCompatParcelizer(i2);
            if (AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(iIconCompatParcelizer, iAudioAttributesImplApi26Parcelizer) == iAudioAttributesCompatParcelizer && parseSmta.AudioAttributesCompatParcelizer(obj, write(i2))) {
                return i2;
            }
            iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.write(iIconCompatParcelizer, iAudioAttributesImplApi26Parcelizer);
        } while (iRemoteActionCompatParcelizer != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.containsKey(obj);
        }
        return RemoteActionCompatParcelizer(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.get(obj);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (iRemoteActionCompatParcelizer == -1) {
            return null;
        }
        return MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.remove(obj);
        }
        V v = (V) write(obj);
        if (v == AudioAttributesCompatParcelizer) {
            return null;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object write(Object obj) {
        if (AudioAttributesImplBaseParcelizer()) {
            return AudioAttributesCompatParcelizer;
        }
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i = AtomParsersUdtaInfo.read(obj, null, iAudioAttributesImplApi26Parcelizer, MediaBrowserCompatSearchResultReceiver(), MediaMetadataCompat(), RatingCompat(), null);
        if (i == -1) {
            return AudioAttributesCompatParcelizer;
        }
        V vMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
        AudioAttributesCompatParcelizer(i, iAudioAttributesImplApi26Parcelizer);
        this.AudioAttributesImplBaseParcelizer--;
        MediaBrowserCompatCustomActionResultReceiver();
        return vMediaBrowserCompatItemReceiver;
    }

    final void AudioAttributesCompatParcelizer(int i, int i2) {
        Object objMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        int[] iArrMediaMetadataCompat = MediaMetadataCompat();
        Object[] objArrRatingCompat = RatingCompat();
        Object[] objArrMediaDescriptionCompat = MediaDescriptionCompat();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = objArrRatingCompat[i3];
            objArrRatingCompat[i] = obj;
            objArrMediaDescriptionCompat[i] = objArrMediaDescriptionCompat[i3];
            objArrRatingCompat[i3] = null;
            objArrMediaDescriptionCompat[i3] = null;
            iArrMediaMetadataCompat[i] = iArrMediaMetadataCompat[i3];
            iArrMediaMetadataCompat[i3] = 0;
            int i4 = getDefaultSampleValues.read(obj) & i2;
            int iRemoteActionCompatParcelizer = AtomParsersUdtaInfo.RemoteActionCompatParcelizer(objMediaBrowserCompatSearchResultReceiver, i4);
            if (iRemoteActionCompatParcelizer == size) {
                AtomParsersUdtaInfo.IconCompatParcelizer(objMediaBrowserCompatSearchResultReceiver, i4, i + 1);
                return;
            }
            while (true) {
                int i5 = iRemoteActionCompatParcelizer - 1;
                int i6 = iArrMediaMetadataCompat[i5];
                int iWrite = AtomParsersUdtaInfo.write(i6, i2);
                if (iWrite == size) {
                    iArrMediaMetadataCompat[i5] = AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(i6, i + 1, i2);
                    return;
                }
                iRemoteActionCompatParcelizer = iWrite;
            }
        } else {
            objArrRatingCompat[i] = null;
            objArrMediaDescriptionCompat[i] = null;
            iArrMediaMetadataCompat[i] = 0;
        }
    }

    final int read() {
        return isEmpty() ? -1 : 0;
    }

    final int AudioAttributesCompatParcelizer(int i) {
        int i2 = i + 1;
        if (i2 < this.AudioAttributesImplBaseParcelizer) {
            return i2;
        }
        return -1;
    }

    abstract class RemoteActionCompatParcelizer<T> implements Iterator<T> {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int write;

        abstract T write(int i);

        private RemoteActionCompatParcelizer() {
            this.write = AtomParsersTkhdData.this.MediaBrowserCompatCustomActionResultReceiver;
            this.AudioAttributesCompatParcelizer = AtomParsersTkhdData.this.read();
            this.IconCompatParcelizer = -1;
        }

        /* synthetic */ RemoteActionCompatParcelizer(AtomParsersTkhdData atomParsersTkhdData, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AudioAttributesCompatParcelizer >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            write();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.AudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = i;
            T tWrite = write(i);
            this.AudioAttributesCompatParcelizer = AtomParsersTkhdData.this.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            return tWrite;
        }

        @Override // java.util.Iterator
        public void remove() {
            write();
            FixedSampleSizeRechunker.IconCompatParcelizer(this.IconCompatParcelizer >= 0);
            AudioAttributesCompatParcelizer();
            AtomParsersTkhdData atomParsersTkhdData = AtomParsersTkhdData.this;
            atomParsersTkhdData.remove(atomParsersTkhdData.write(this.IconCompatParcelizer));
            this.AudioAttributesCompatParcelizer = AtomParsersTkhdData.read(this.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = -1;
        }

        private void AudioAttributesCompatParcelizer() {
            this.write += 32;
        }

        private void write() {
            if (AtomParsersTkhdData.this.MediaBrowserCompatCustomActionResultReceiver != this.write) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.write;
        if (set != null) {
            return set;
        }
        Set<K> setMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.write = setMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return setMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    private Set<K> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return new read();
    }

    class read extends AbstractSet<K> {
        read() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AtomParsersTkhdData.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return AtomParsersTkhdData.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map<K, V> mapIconCompatParcelizer = AtomParsersTkhdData.this.IconCompatParcelizer();
            if (mapIconCompatParcelizer != null) {
                return mapIconCompatParcelizer.keySet().remove(obj);
            }
            return AtomParsersTkhdData.this.write(obj) != AtomParsersTkhdData.AudioAttributesCompatParcelizer;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return AtomParsersTkhdData.this.MediaBrowserCompatItemReceiver();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AtomParsersTkhdData.this.clear();
        }
    }

    final Iterator<K> MediaBrowserCompatItemReceiver() {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.keySet().iterator();
        }
        return new AtomParsersTkhdData<K, V>.RemoteActionCompatParcelizer<K>() { // from class: o.AtomParsersTkhdData.2
            @Override // o.AtomParsersTkhdData.RemoteActionCompatParcelizer
            final K write(int i) {
                return (K) AtomParsersTkhdData.this.write(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.RemoteActionCompatParcelizer;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setOnCommand = onCommand();
        this.RemoteActionCompatParcelizer = setOnCommand;
        return setOnCommand;
    }

    private Set<Map.Entry<K, V>> onCommand() {
        return new write();
    }

    class write extends AbstractSet<Map.Entry<K, V>> {
        write() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AtomParsersTkhdData.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AtomParsersTkhdData.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return AtomParsersTkhdData.this.write();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map<K, V> mapIconCompatParcelizer = AtomParsersTkhdData.this.IconCompatParcelizer();
            if (mapIconCompatParcelizer != null) {
                return mapIconCompatParcelizer.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iRemoteActionCompatParcelizer = AtomParsersTkhdData.this.RemoteActionCompatParcelizer(entry.getKey());
            return iRemoteActionCompatParcelizer != -1 && parseSmta.AudioAttributesCompatParcelizer(AtomParsersTkhdData.this.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map<K, V> mapIconCompatParcelizer = AtomParsersTkhdData.this.IconCompatParcelizer();
            if (mapIconCompatParcelizer != null) {
                return mapIconCompatParcelizer.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (AtomParsersTkhdData.this.AudioAttributesImplBaseParcelizer()) {
                return false;
            }
            int iAudioAttributesImplApi26Parcelizer = AtomParsersTkhdData.this.AudioAttributesImplApi26Parcelizer();
            int i = AtomParsersUdtaInfo.read(entry.getKey(), entry.getValue(), iAudioAttributesImplApi26Parcelizer, AtomParsersTkhdData.this.MediaBrowserCompatSearchResultReceiver(), AtomParsersTkhdData.this.MediaMetadataCompat(), AtomParsersTkhdData.this.RatingCompat(), AtomParsersTkhdData.this.MediaDescriptionCompat());
            if (i == -1) {
                return false;
            }
            AtomParsersTkhdData.this.AudioAttributesCompatParcelizer(i, iAudioAttributesImplApi26Parcelizer);
            AtomParsersTkhdData.AudioAttributesCompatParcelizer(AtomParsersTkhdData.this);
            AtomParsersTkhdData.this.MediaBrowserCompatCustomActionResultReceiver();
            return true;
        }
    }

    final Iterator<Map.Entry<K, V>> write() {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.entrySet().iterator();
        }
        return new AtomParsersTkhdData<K, V>.RemoteActionCompatParcelizer<Map.Entry<K, V>>() { // from class: o.AtomParsersTkhdData.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.AtomParsersTkhdData.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> write(int i) {
                return new AudioAttributesCompatParcelizer(i);
            }
        };
    }

    final class AudioAttributesCompatParcelizer extends AtomParsersEsdsData<K, V> {
        private final K AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = (K) AtomParsersTkhdData.this.write(i);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
        public final K getKey() {
            return this.AudioAttributesCompatParcelizer;
        }

        private void IconCompatParcelizer() {
            int i = this.IconCompatParcelizer;
            if (i == -1 || i >= AtomParsersTkhdData.this.size() || !parseSmta.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, AtomParsersTkhdData.this.write(this.IconCompatParcelizer))) {
                this.IconCompatParcelizer = AtomParsersTkhdData.this.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }

        @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
        public final V getValue() {
            Map<K, V> mapIconCompatParcelizer = AtomParsersTkhdData.this.IconCompatParcelizer();
            if (mapIconCompatParcelizer != null) {
                return (V) parseTfdt.IconCompatParcelizer(mapIconCompatParcelizer.get(this.AudioAttributesCompatParcelizer));
            }
            IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == -1) {
                return null;
            }
            return (V) AtomParsersTkhdData.this.MediaBrowserCompatItemReceiver(i);
        }

        @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
        public final V setValue(V v) {
            Map<K, V> mapIconCompatParcelizer = AtomParsersTkhdData.this.IconCompatParcelizer();
            if (mapIconCompatParcelizer != null) {
                return (V) parseTfdt.IconCompatParcelizer(mapIconCompatParcelizer.put(this.AudioAttributesCompatParcelizer, v));
            }
            IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i != -1) {
                V v2 = (V) AtomParsersTkhdData.this.MediaBrowserCompatItemReceiver(i);
                AtomParsersTkhdData.this.read(this.IconCompatParcelizer, v);
                return v2;
            }
            AtomParsersTkhdData.this.put(this.AudioAttributesCompatParcelizer, v);
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        return mapIconCompatParcelizer != null ? mapIconCompatParcelizer.size() : this.AudioAttributesImplBaseParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.containsValue(obj);
        }
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer; i++) {
            if (parseSmta.AudioAttributesCompatParcelizer(obj, MediaBrowserCompatItemReceiver(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.MediaBrowserCompatItemReceiver;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        this.MediaBrowserCompatItemReceiver = collectionHandleMediaPlayPauseIfPendingOnHandler;
        return collectionHandleMediaPlayPauseIfPendingOnHandler;
    }

    private Collection<V> handleMediaPlayPauseIfPendingOnHandler() {
        return new IconCompatParcelizer();
    }

    class IconCompatParcelizer extends AbstractCollection<V> {
        IconCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AtomParsersTkhdData.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AtomParsersTkhdData.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return AtomParsersTkhdData.this.AudioAttributesImplApi21Parcelizer();
        }
    }

    final Iterator<V> AudioAttributesImplApi21Parcelizer() {
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            return mapIconCompatParcelizer.values().iterator();
        }
        return new AtomParsersTkhdData<K, V>.RemoteActionCompatParcelizer<V>() { // from class: o.AtomParsersTkhdData.3
            @Override // o.AtomParsersTkhdData.RemoteActionCompatParcelizer
            final V write(int i) {
                return (V) AtomParsersTkhdData.this.MediaBrowserCompatItemReceiver(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (AudioAttributesImplBaseParcelizer()) {
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver();
        Map<K, V> mapIconCompatParcelizer = IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = parseTextAttribute.AudioAttributesCompatParcelizer(size(), 3);
            mapIconCompatParcelizer.clear();
            this.AudioAttributesImplApi26Parcelizer = null;
            this.AudioAttributesImplBaseParcelizer = 0;
            return;
        }
        Arrays.fill(RatingCompat(), 0, this.AudioAttributesImplBaseParcelizer, (Object) null);
        Arrays.fill(MediaDescriptionCompat(), 0, this.AudioAttributesImplBaseParcelizer, (Object) null);
        AtomParsersUdtaInfo.AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver());
        Arrays.fill(MediaMetadataCompat(), 0, this.AudioAttributesImplBaseParcelizer, 0);
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itWrite = write();
        while (itWrite.hasNext()) {
            Map.Entry<K, V> next = itWrite.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: ".concat(String.valueOf(i)));
        }
        AudioAttributesImplApi21Parcelizer(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object MediaBrowserCompatSearchResultReceiver() {
        return Objects.requireNonNull(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] MediaMetadataCompat() {
        return (int[]) Objects.requireNonNull(this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] RatingCompat() {
        return (Object[]) Objects.requireNonNull(this.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] MediaDescriptionCompat() {
        return (Object[]) Objects.requireNonNull(this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K write(int i) {
        return (K) RatingCompat()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V MediaBrowserCompatItemReceiver(int i) {
        return (V) MediaDescriptionCompat()[i];
    }

    private int IconCompatParcelizer(int i) {
        return MediaMetadataCompat()[i];
    }

    private void write(int i, K k) {
        RatingCompat()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(int i, V v) {
        MediaDescriptionCompat()[i] = v;
    }

    private void write(int i, int i2) {
        MediaMetadataCompat()[i] = i2;
    }
}
