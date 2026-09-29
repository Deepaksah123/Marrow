package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.getModuleId;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0084\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BG\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020!H\u0016J\u0015\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020!2\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00100J\u0018\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00103J\u001f\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00105J\u001e\u00106\u001a\u00020*2\u0014\u00107\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0017\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\b\u00109\u001a\u00020*H\u0016J\u0013\u0010E\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010G\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020*H\u0002J\r\u0010O\u001a\u00020*H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020\rH\u0002J\u0010\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020\rH\u0002J\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020!H\u0002J\u0010\u0010]\u001a\u00020*2\u0006\u0010^\u001a\u00020\rH\u0002J\u0010\u0010_\u001a\u00020!2\u0006\u0010`\u001a\u00020\rH\u0002J\u0015\u0010a\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0015\u0010b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010ZJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bd\u0010ZJ\u0017\u0010e\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bf\u00100J\u0010\u0010g\u001a\u00020*2\u0006\u0010h\u001a\u00020\rH\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\rH\u0002J!\u0010k\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bnJ\u0018\u0010o\u001a\u00020!2\u000e\u0010F\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0002J\u0019\u0010p\u001a\u00020!2\n\u0010q\u001a\u0006\u0012\u0002\b\u00030rH\u0000¢\u0006\u0002\bsJ\u001c\u0010t\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0002J\"\u0010u\u001a\u00020!2\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010m0rH\u0002J!\u0010v\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u00020!2\u0006\u0010y\u001a\u00028\u0001H\u0000¢\u0006\u0004\bz\u00100J\u0019\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|H\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0014\u0010J\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001aR\u0014\u0010L\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u001a¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "", SessionDescription.ATTR_LENGTH, "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "[Ljava/lang/Object;", "hashShift", "modCount", AppMeasurementSdk.ConditionalUserProperty.VALUE, "size", "getSize", "()I", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "build", "", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "isEmpty", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "remove", "clear", "keys", "", "getKeys", "()Ljava/util/Set;", "values", "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "equals", "other", "hashCode", "toString", "", "capacity", "getCapacity$kotlin_stdlib", "hashSize", "getHashSize", "registerModification", "checkIsMutable", "checkIsMutable$kotlin_stdlib", "ensureExtraCapacity", "n", "shouldCompact", "extraCapacity", "ensureCapacity", "minCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "(Ljava/lang/Object;)I", "compact", "updateHashArray", "rehash", "newHashSize", "putRehash", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "findKey", "findValue", "addKey", "addKey$kotlin_stdlib", "removeKey", "removeKey$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "contentEquals", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "putEntry", "putAllEntries", "removeEntry", "removeEntry$kotlin_stdlib", "removeValue", "element", "removeValue$kotlin_stdlib", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getLoggedUser<K, V> implements Map<K, V>, Serializable, getModuleId {
    private static final getLoggedUser IconCompatParcelizer;
    public static final read write = new read(null);
    private int[] AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private UserConfigCreator<K> AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private K[] MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private V[] MediaDescriptionCompat;
    private UserConfig<V> MediaMetadataCompat;
    private int RatingCompat;
    private ConfigMinPlayback<K, V> RemoteActionCompatParcelizer;
    private int read;

    private getLoggedUser(K[] kArr, int[] iArr, int[] iArr2) {
        this.MediaBrowserCompatItemReceiver = kArr;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.AudioAttributesCompatParcelizer = iArr2;
        this.AudioAttributesImplApi21Parcelizer = 2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.read = read.write(AudioAttributesImplApi26Parcelizer());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return MediaDescriptionCompat();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return RatingCompat();
    }

    @Override // java.util.Map
    public final int size() {
        return getRatingCompat();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    private int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public getLoggedUser() {
        this(8);
    }

    public getLoggedUser(int i) {
        this(ProResponse.RemoteActionCompatParcelizer(i), new int[i], new int[read.AudioAttributesCompatParcelizer(i)]);
    }

    public final Map<K, V> AudioAttributesCompatParcelizer() {
        read();
        this.AudioAttributesImplApi26Parcelizer = true;
        if (size() > 0) {
            return this;
        }
        getLoggedUser getloggeduser = IconCompatParcelizer;
        toMagicModuleMetaRepoModel.read(getloggeduser, "");
        return getloggeduser;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return new getC0(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object key) {
        return AudioAttributesCompatParcelizer(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object value) {
        return write(value) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object key) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(key);
        if (iAudioAttributesCompatParcelizer < 0) {
            return null;
        }
        V[] vArr = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(vArr);
        return vArr[iAudioAttributesCompatParcelizer];
    }

    @Override // java.util.Map
    public final V put(K key, V value) {
        read();
        int i = read(key);
        V[] vArrMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i < 0) {
            int i2 = (-i) - 1;
            V v = vArrMediaBrowserCompatItemReceiver[i2];
            vArrMediaBrowserCompatItemReceiver[i2] = value;
            return v;
        }
        vArrMediaBrowserCompatItemReceiver[i] = value;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        toMagicModuleMetaRepoModel.write(from, "");
        read();
        write((Collection) from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object key) {
        read();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(key);
        if (iAudioAttributesCompatParcelizer < 0) {
            return null;
        }
        V[] vArr = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(vArr);
        V v = vArr[iAudioAttributesCompatParcelizer];
        write(iAudioAttributesCompatParcelizer);
        return v;
    }

    @Override // java.util.Map
    public final void clear() {
        read();
        int i = this.MediaBrowserCompatCustomActionResultReceiver - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.AudioAttributesCompatParcelizer[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ProResponse.write(this.MediaBrowserCompatItemReceiver, 0, this.MediaBrowserCompatCustomActionResultReceiver);
        V[] vArr = this.MediaDescriptionCompat;
        if (vArr != null) {
            ProResponse.write(vArr, 0, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.RatingCompat = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplApi21Parcelizer();
    }

    private Set<K> RatingCompat() {
        UserConfigCreator<K> userConfigCreator = this.AudioAttributesImplBaseParcelizer;
        if (userConfigCreator == null) {
            UserConfigCreator<K> userConfigCreator2 = new UserConfigCreator<>(this);
            this.AudioAttributesImplBaseParcelizer = userConfigCreator2;
            return userConfigCreator2;
        }
        return userConfigCreator;
    }

    private Collection<V> MediaBrowserCompatSearchResultReceiver() {
        UserConfig<V> userConfig = this.MediaMetadataCompat;
        if (userConfig == null) {
            UserConfig<V> userConfig2 = new UserConfig<>(this);
            this.MediaMetadataCompat = userConfig2;
            return userConfig2;
        }
        return userConfig;
    }

    private Set<Map.Entry<K, V>> MediaDescriptionCompat() {
        ConfigMinPlayback<K, V> configMinPlayback = this.RemoteActionCompatParcelizer;
        if (configMinPlayback == null) {
            ConfigMinPlayback<K, V> configMinPlayback2 = new ConfigMinPlayback<>(this);
            this.RemoteActionCompatParcelizer = configMinPlayback2;
            return configMinPlayback2;
        }
        return configMinPlayback;
    }

    @Override // java.util.Map
    public final boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && write((Map<?, ?>) other);
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        write<K, V> writeVarIconCompatParcelizer = IconCompatParcelizer();
        int iWrite = 0;
        while (writeVarIconCompatParcelizer.hasNext()) {
            iWrite += writeVarIconCompatParcelizer.write();
        }
        return iWrite;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        write<K, V> writeVarIconCompatParcelizer = IconCompatParcelizer();
        int i = 0;
        while (writeVarIconCompatParcelizer.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            writeVarIconCompatParcelizer.IconCompatParcelizer(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private int MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatItemReceiver.length;
    }

    private final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.length;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.MediaBrowserCompatMediaItem++;
    }

    public final void read() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            throw new UnsupportedOperationException();
        }
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        if (AudioAttributesImplBaseParcelizer(i)) {
            write(true);
        } else {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver + i);
        }
    }

    private final boolean AudioAttributesImplBaseParcelizer(int i) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = iMediaBrowserCompatMediaItem - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= MediaBrowserCompatMediaItem() / 4;
    }

    private final void RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > MediaBrowserCompatMediaItem()) {
            setUrl.Companion companion = setUrl.INSTANCE;
            int iRemoteActionCompatParcelizer = setUrl.Companion.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem(), i);
            this.MediaBrowserCompatItemReceiver = (K[]) ProResponse.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, iRemoteActionCompatParcelizer);
            V[] vArr = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = vArr != null ? (V[]) ProResponse.RemoteActionCompatParcelizer(vArr, iRemoteActionCompatParcelizer) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.MediaBrowserCompatSearchResultReceiver, iRemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
            this.MediaBrowserCompatSearchResultReceiver = iArrCopyOf;
            int iAudioAttributesCompatParcelizer = read.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
            if (iAudioAttributesCompatParcelizer > AudioAttributesImplApi26Parcelizer()) {
                IconCompatParcelizer(iAudioAttributesCompatParcelizer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] MediaBrowserCompatItemReceiver() {
        V[] vArr = this.MediaDescriptionCompat;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ProResponse.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem());
        this.MediaDescriptionCompat = vArr2;
        return vArr2;
    }

    private final int MediaBrowserCompatItemReceiver(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.read;
    }

    private final void write(boolean z) {
        int i;
        V[] vArr = this.MediaDescriptionCompat;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.MediaBrowserCompatItemReceiver;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.AudioAttributesCompatParcelizer[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ProResponse.write(this.MediaBrowserCompatItemReceiver, i3, i);
        if (vArr != null) {
            ProResponse.write(vArr, i3, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
    }

    private final void IconCompatParcelizer(int i) {
        AudioAttributesImplApi21Parcelizer();
        if (this.MediaBrowserCompatCustomActionResultReceiver > size()) {
            write(false);
        }
        this.AudioAttributesCompatParcelizer = new int[i];
        this.read = read.write(i);
        for (int i2 = 0; i2 < this.MediaBrowserCompatCustomActionResultReceiver; i2++) {
            if (!read(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final boolean read(int i) {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver[i]);
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        while (true) {
            int[] iArr = this.AudioAttributesCompatParcelizer;
            if (iArr[iMediaBrowserCompatItemReceiver] == 0) {
                iArr[iMediaBrowserCompatItemReceiver] = i + 1;
                this.MediaBrowserCompatSearchResultReceiver[i] = iMediaBrowserCompatItemReceiver;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iMediaBrowserCompatItemReceiver = iMediaBrowserCompatItemReceiver == 0 ? AudioAttributesImplApi26Parcelizer() - 1 : iMediaBrowserCompatItemReceiver - 1;
        }
    }

    private final int AudioAttributesCompatParcelizer(K k) {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(k);
        int i = this.AudioAttributesImplApi21Parcelizer;
        while (true) {
            int i2 = this.AudioAttributesCompatParcelizer[iMediaBrowserCompatItemReceiver];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iMediaBrowserCompatItemReceiver = iMediaBrowserCompatItemReceiver == 0 ? AudioAttributesImplApi26Parcelizer() - 1 : iMediaBrowserCompatItemReceiver - 1;
        }
    }

    private final int write(V v) {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.MediaBrowserCompatSearchResultReceiver[i] >= 0) {
                V[] vArr = this.MediaDescriptionCompat;
                toMagicModuleMetaRepoModel.write(vArr);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int read(K k) {
        read();
        while (true) {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(k);
            int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer << 1, AudioAttributesImplApi26Parcelizer() / 2);
            int i = 0;
            while (true) {
                int i2 = this.AudioAttributesCompatParcelizer[iMediaBrowserCompatItemReceiver];
                if (i2 <= 0) {
                    if (this.MediaBrowserCompatCustomActionResultReceiver >= MediaBrowserCompatMediaItem()) {
                        AudioAttributesCompatParcelizer(1);
                    } else {
                        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                        int i4 = i3 + 1;
                        this.MediaBrowserCompatCustomActionResultReceiver = i4;
                        this.MediaBrowserCompatItemReceiver[i3] = k;
                        this.MediaBrowserCompatSearchResultReceiver[i3] = iMediaBrowserCompatItemReceiver;
                        this.AudioAttributesCompatParcelizer[iMediaBrowserCompatItemReceiver] = i4;
                        this.RatingCompat = size() + 1;
                        AudioAttributesImplApi21Parcelizer();
                        if (i > this.AudioAttributesImplApi21Parcelizer) {
                            this.AudioAttributesImplApi21Parcelizer = i;
                        }
                        return i3;
                    }
                } else {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2 - 1], k)) {
                        return -i2;
                    }
                    i++;
                    if (i > iRemoteActionCompatParcelizer) {
                        IconCompatParcelizer(AudioAttributesImplApi26Parcelizer() << 1);
                        break;
                    }
                    iMediaBrowserCompatItemReceiver = iMediaBrowserCompatItemReceiver == 0 ? AudioAttributesImplApi26Parcelizer() - 1 : iMediaBrowserCompatItemReceiver - 1;
                }
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer(K k) {
        read();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(k);
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        write(iAudioAttributesCompatParcelizer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int i) {
        ProResponse.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, i);
        V[] vArr = this.MediaDescriptionCompat;
        if (vArr != null) {
            ProResponse.IconCompatParcelizer(vArr, i);
        }
        AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver[i]);
        this.MediaBrowserCompatSearchResultReceiver[i] = -1;
        this.RatingCompat = size() - 1;
        AudioAttributesImplApi21Parcelizer();
    }

    private final void AudioAttributesImplApi21Parcelizer(int i) {
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer << 1, AudioAttributesImplApi26Parcelizer() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? AudioAttributesImplApi26Parcelizer() - 1 : i - 1;
            i2++;
            if (i2 > this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesCompatParcelizer[i3] = 0;
                return;
            }
            int[] iArr = this.AudioAttributesCompatParcelizer;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver[i5]) - i) & (AudioAttributesImplApi26Parcelizer() - 1)) >= i2) {
                    this.AudioAttributesCompatParcelizer[i3] = i4;
                    this.MediaBrowserCompatSearchResultReceiver[i5] = i3;
                }
                iRemoteActionCompatParcelizer--;
            }
            i3 = i;
            i2 = 0;
            iRemoteActionCompatParcelizer--;
        } while (iRemoteActionCompatParcelizer >= 0);
        this.AudioAttributesCompatParcelizer[i3] = -1;
    }

    public final boolean write(Map.Entry<? extends K, ? extends V> entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(entry.getKey());
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        V[] vArr = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(vArr);
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(vArr[iAudioAttributesCompatParcelizer], entry.getValue());
    }

    private final boolean write(Map<?, ?> map) {
        return size() == map.size() && read((Collection<?>) map.entrySet());
    }

    public final boolean read(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!write((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean RemoteActionCompatParcelizer(Map.Entry<? extends K, ? extends V> entry) {
        int i = read(entry.getKey());
        V[] vArrMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i >= 0) {
            vArrMediaBrowserCompatItemReceiver[i] = entry.getValue();
            return true;
        }
        int i2 = (-i) - 1;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getValue(), vArrMediaBrowserCompatItemReceiver[i2])) {
            return false;
        }
        vArrMediaBrowserCompatItemReceiver[i2] = entry.getValue();
        return true;
    }

    private final boolean write(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        AudioAttributesCompatParcelizer(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (RemoteActionCompatParcelizer((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean AudioAttributesCompatParcelizer(Map.Entry<? extends K, ? extends V> entry) {
        toMagicModuleMetaRepoModel.write(entry, "");
        read();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(entry.getKey());
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        V[] vArr = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(vArr);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(vArr[iAudioAttributesCompatParcelizer], entry.getValue())) {
            return false;
        }
        write(iAudioAttributesCompatParcelizer);
        return true;
    }

    public final boolean IconCompatParcelizer(V v) {
        read();
        int iWrite = write(v);
        if (iWrite < 0) {
            return false;
        }
        write(iWrite);
        return true;
    }

    public final AudioAttributesCompatParcelizer<K, V> MediaBrowserCompatCustomActionResultReceiver() {
        return new AudioAttributesCompatParcelizer<>(this);
    }

    public final MediaBrowserCompatCustomActionResultReceiver<K, V> AudioAttributesImplBaseParcelizer() {
        return new MediaBrowserCompatCustomActionResultReceiver<>(this);
    }

    public final write<K, V> IconCompatParcelizer() {
        return new write<>(this);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\r"}, d2 = {"Lo/getLoggedUser$read;", "", "<init>", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "write", "Lo/getLoggedUser;", "", "IconCompatParcelizer", "Lo/getLoggedUser;", "()Lo/getLoggedUser;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public static getLoggedUser write() {
            return getLoggedUser.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesCompatParcelizer(int p0) {
            return Integer.highestOneBit(getQues.write(p0, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int write(int p0) {
            return Integer.numberOfLeadingZeros(p0) + 1;
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getLoggedUser getloggeduser = new getLoggedUser(0);
        getloggeduser.AudioAttributesImplApi26Parcelizer = true;
        IconCompatParcelizer = getloggeduser;
    }

    public static class IconCompatParcelizer<K, V> {
        private int AudioAttributesCompatParcelizer;
        private final getLoggedUser<K, V> IconCompatParcelizer;
        private int read;
        private int write;

        public IconCompatParcelizer(getLoggedUser<K, V> getloggeduser) {
            toMagicModuleMetaRepoModel.write(getloggeduser, "");
            this.IconCompatParcelizer = getloggeduser;
            this.AudioAttributesCompatParcelizer = -1;
            this.read = ((getLoggedUser) getloggeduser).MediaBrowserCompatMediaItem;
            MediaBrowserCompatItemReceiver();
        }

        public final getLoggedUser<K, V> IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final void IconCompatParcelizer(int i) {
            this.write = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void write(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final void MediaBrowserCompatItemReceiver() {
            while (this.write < ((getLoggedUser) this.IconCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver) {
                int[] iArr = ((getLoggedUser) this.IconCompatParcelizer).MediaBrowserCompatSearchResultReceiver;
                int i = this.write;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.write = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.write < ((getLoggedUser) this.IconCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver;
        }

        public final void remove() {
            read();
            if (this.AudioAttributesCompatParcelizer == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.IconCompatParcelizer.read();
            this.IconCompatParcelizer.write(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = -1;
            this.read = ((getLoggedUser) this.IconCompatParcelizer).MediaBrowserCompatMediaItem;
        }

        public final void read() {
            if (((getLoggedUser) this.IconCompatParcelizer).MediaBrowserCompatMediaItem != this.read) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer<K, V> extends IconCompatParcelizer<K, V> implements Iterator<K>, isModuleGeneratedVisible {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(getLoggedUser<K, V> getloggeduser) {
            super(getloggeduser);
            toMagicModuleMetaRepoModel.write(getloggeduser, "");
        }

        @Override // java.util.Iterator
        public final K next() {
            read();
            if (AudioAttributesCompatParcelizer() >= ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver) {
                throw new NoSuchElementException();
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(iAudioAttributesCompatParcelizer + 1);
            write(iAudioAttributesCompatParcelizer);
            K k = (K) ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatItemReceiver[RemoteActionCompatParcelizer()];
            MediaBrowserCompatItemReceiver();
            return k;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver<K, V> extends IconCompatParcelizer<K, V> implements Iterator<V>, isModuleGeneratedVisible {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(getLoggedUser<K, V> getloggeduser) {
            super(getloggeduser);
            toMagicModuleMetaRepoModel.write(getloggeduser, "");
        }

        @Override // java.util.Iterator
        public final V next() {
            read();
            if (AudioAttributesCompatParcelizer() >= ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver) {
                throw new NoSuchElementException();
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(iAudioAttributesCompatParcelizer + 1);
            write(iAudioAttributesCompatParcelizer);
            Object[] objArr = ((getLoggedUser) IconCompatParcelizer()).MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.write(objArr);
            V v = (V) objArr[RemoteActionCompatParcelizer()];
            MediaBrowserCompatItemReceiver();
            return v;
        }
    }

    public static final class write<K, V> extends IconCompatParcelizer<K, V> implements Iterator<Map.Entry<K, V>>, isModuleGeneratedVisible {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(getLoggedUser<K, V> getloggeduser) {
            super(getloggeduser);
            toMagicModuleMetaRepoModel.write(getloggeduser, "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer<K, V> next() {
            read();
            if (AudioAttributesCompatParcelizer() >= ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver) {
                throw new NoSuchElementException();
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(iAudioAttributesCompatParcelizer + 1);
            write(iAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer = new RemoteActionCompatParcelizer<>(IconCompatParcelizer(), RemoteActionCompatParcelizer());
            MediaBrowserCompatItemReceiver();
            return remoteActionCompatParcelizer;
        }

        public final int write() {
            if (AudioAttributesCompatParcelizer() >= ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver) {
                throw new NoSuchElementException();
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(iAudioAttributesCompatParcelizer + 1);
            write(iAudioAttributesCompatParcelizer);
            Object obj = ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatItemReceiver[RemoteActionCompatParcelizer()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((getLoggedUser) IconCompatParcelizer()).MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.write(objArr);
            Object obj2 = objArr[RemoteActionCompatParcelizer()];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            MediaBrowserCompatItemReceiver();
            return iHashCode ^ iHashCode2;
        }

        public final void IconCompatParcelizer(StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(sb, "");
            if (AudioAttributesCompatParcelizer() >= ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver) {
                throw new NoSuchElementException();
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer(iAudioAttributesCompatParcelizer + 1);
            write(iAudioAttributesCompatParcelizer);
            Object obj = ((getLoggedUser) IconCompatParcelizer()).MediaBrowserCompatItemReceiver[RemoteActionCompatParcelizer()];
            if (obj == IconCompatParcelizer()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((getLoggedUser) IconCompatParcelizer()).MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.write(objArr);
            Object obj2 = objArr[RemoteActionCompatParcelizer()];
            if (obj2 == IconCompatParcelizer()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            MediaBrowserCompatItemReceiver();
        }
    }

    public static final class RemoteActionCompatParcelizer<K, V> implements Map.Entry<K, V>, getModuleId.read {
        private final int AudioAttributesCompatParcelizer;
        private final getLoggedUser<K, V> read;
        private final int write;

        public RemoteActionCompatParcelizer(getLoggedUser<K, V> getloggeduser, int i) {
            toMagicModuleMetaRepoModel.write(getloggeduser, "");
            this.read = getloggeduser;
            this.AudioAttributesCompatParcelizer = i;
            this.write = ((getLoggedUser) getloggeduser).MediaBrowserCompatMediaItem;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            RemoteActionCompatParcelizer();
            return (K) ((getLoggedUser) this.read).MediaBrowserCompatItemReceiver[this.AudioAttributesCompatParcelizer];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            RemoteActionCompatParcelizer();
            Object[] objArr = ((getLoggedUser) this.read).MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.write(objArr);
            return (V) objArr[this.AudioAttributesCompatParcelizer];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            RemoteActionCompatParcelizer();
            this.read.read();
            Object[] objArrMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
            int i = this.AudioAttributesCompatParcelizer;
            V v2 = (V) objArrMediaBrowserCompatItemReceiver[i];
            objArrMediaBrowserCompatItemReceiver[i] = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getKey(), getKey()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }

        private final void RemoteActionCompatParcelizer() {
            if (((getLoggedUser) this.read).MediaBrowserCompatMediaItem != this.write) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }
    }
}
