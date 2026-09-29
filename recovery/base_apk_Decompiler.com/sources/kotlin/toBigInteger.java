package kotlin;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.illegalSurrogate;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0010\u001f\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0006\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\t\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001d8\u0007@EX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u001e\u0010\"R(\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010*\u001a\u0004\u0018\u00018\u00018\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010(\"\u0004\b$\u0010)R\"\u0010\u001e\u001a\u00020+8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b\u001e\u0010-\"\u0004\b\u001b\u0010.R*\u00101\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b/\u0010,\u001a\u0004\b0\u0010-\"\u0004\b\u001e\u0010.R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00104R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u0000028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u00104R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u0001058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00106"}, d2 = {"Lo/toBigInteger;", "K", "V", "Lo/illegalSurrogate$AudioAttributesCompatParcelizer;", "Lo/getGroupSubTitle;", "Lo/FastDoubleMath;", "p0", "<init>", "(Lo/FastDoubleMath;)V", "IconCompatParcelizer", "()Lo/FastDoubleMath;", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "p1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "write", "Lo/FastDoubleMath;", "Lo/estimateNumBits;", "AudioAttributesCompatParcelizer", "Lo/estimateNumBits;", "MediaBrowserCompatItemReceiver", "()Lo/estimateNumBits;", "(Lo/estimateNumBits;)V", "Lo/tryToParseEightHexDigits;", "RemoteActionCompatParcelizer", "Lo/tryToParseEightHexDigits;", "AudioAttributesImplApi21Parcelizer", "()Lo/tryToParseEightHexDigits;", "Ljava/lang/Object;", "(Ljava/lang/Object;)V", "read", "", "I", "()I", "(I)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "", "", "()Ljava/util/Set;", "", "()Ljava/util/Collection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class toBigInteger<K, V> extends getGroupSubTitle<K, V> implements illegalSurrogate.AudioAttributesCompatParcelizer<K, V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private estimateNumBits IconCompatParcelizer = new estimateNumBits();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private V read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;
    private tryToParseEightHexDigits<K, V> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;
    private FastDoubleMath<K, V> write;

    public toBigInteger(FastDoubleMath<K, V> fastDoubleMath) {
        this.write = fastDoubleMath;
        this.RemoteActionCompatParcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesImplApi26Parcelizer = this.write.size();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final estimateNumBits getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesCompatParcelizer(estimateNumBits estimatenumbits) {
        this.IconCompatParcelizer = estimatenumbits;
    }

    public final tryToParseEightHexDigits<K, V> AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(V v) {
        this.read = v;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.getGroupSubTitle
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesCompatParcelizer++;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer */
    public FastDoubleMath<K, V> RemoteActionCompatParcelizer() {
        FastDoubleMath<K, V> fastDoubleMath;
        if (this.RemoteActionCompatParcelizer == this.write.AudioAttributesImplApi26Parcelizer()) {
            fastDoubleMath = this.write;
        } else {
            this.IconCompatParcelizer = new estimateNumBits();
            fastDoubleMath = new FastDoubleMath<>(this.RemoteActionCompatParcelizer, size());
        }
        this.write = fastDoubleMath;
        return fastDoubleMath;
    }

    @Override // kotlin.getGroupSubTitle
    public Set<Map.Entry<K, V>> read() {
        return new tryDecToDoubleWithFastAlgorithm(this);
    }

    @Override // kotlin.getGroupSubTitle
    public Set<K> write() {
        return new isDigit(this);
    }

    @Override // kotlin.getGroupSubTitle
    public Collection<V> AudioAttributesImplApi26Parcelizer() {
        return new tryHexFloatToDoubleTruncated(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object p0) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0 != null ? p0.hashCode() : 0, p0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object p0) {
        return this.RemoteActionCompatParcelizer.write(p0 != null ? p0.hashCode() : 0, p0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K p0, V p1) {
        this.read = null;
        this.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write(p0 != null ? p0.hashCode() : 0, p0, p1, 0, this);
        return this.read;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> p0) {
        FastDoubleMath<K, V> fastDoubleMathIconCompatParcelizer = p0 instanceof FastDoubleMath ? (FastDoubleMath) p0 : null;
        if (fastDoubleMathIconCompatParcelizer == null) {
            toBigInteger tobiginteger = p0 instanceof toBigInteger ? (toBigInteger) p0 : null;
            fastDoubleMathIconCompatParcelizer = tobiginteger != null ? tobiginteger.RemoteActionCompatParcelizer() : null;
        }
        if (fastDoubleMathIconCompatParcelizer != null) {
            tryDecToFloatWithFastAlgorithm trydectofloatwithfastalgorithm = new tryDecToFloatWithFastAlgorithm(0, 1, null);
            int size = size();
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigits = this.RemoteActionCompatParcelizer;
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesImplApi26Parcelizer = fastDoubleMathIconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.read(trytoparseeighthexdigitsAudioAttributesImplApi26Parcelizer, "");
            this.RemoteActionCompatParcelizer = trytoparseeighthexdigits.RemoteActionCompatParcelizer(trytoparseeighthexdigitsAudioAttributesImplApi26Parcelizer, 0, trydectofloatwithfastalgorithm, this);
            int size2 = (fastDoubleMathIconCompatParcelizer.size() + size) - trydectofloatwithfastalgorithm.getWrite();
            if (size != size2) {
                AudioAttributesCompatParcelizer(size2);
                return;
            }
            return;
        }
        super.putAll(p0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object p0) {
        this.read = null;
        tryToParseEightHexDigits trytoparseeighthexdigitsWrite = this.RemoteActionCompatParcelizer.write(p0 != null ? p0.hashCode() : 0, p0, 0, this);
        if (trytoparseeighthexdigitsWrite == null) {
            trytoparseeighthexdigitsWrite = tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.read(trytoparseeighthexdigitsWrite, "");
        }
        this.RemoteActionCompatParcelizer = trytoparseeighthexdigitsWrite;
        return this.read;
    }

    @Override // java.util.Map
    public final boolean remove(Object p0, Object p1) {
        int size = size();
        tryToParseEightHexDigits trytoparseeighthexdigitsAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0 != null ? p0.hashCode() : 0, p0, p1, 0, this);
        if (trytoparseeighthexdigitsAudioAttributesCompatParcelizer == null) {
            trytoparseeighthexdigitsAudioAttributesCompatParcelizer = tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.read(trytoparseeighthexdigitsAudioAttributesCompatParcelizer, "");
        }
        this.RemoteActionCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsIconCompatParcelizer = tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(trytoparseeighthexdigitsIconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = trytoparseeighthexdigitsIconCompatParcelizer;
        AudioAttributesCompatParcelizer(0);
    }
}
