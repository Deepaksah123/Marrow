package kotlin;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/readIntBE;", "K", "V", "Lo/UTF8Writer;", "", "Lo/getGroupTitle;", "Lo/FastDoubleMath;", "p0", "<init>", "(Lo/FastDoubleMath;)V", "", "write", "(Ljava/util/Map$Entry;)Z", "", "iterator", "()Ljava/util/Iterator;", "read", "Lo/FastDoubleMath;", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class readIntBE<K, V> extends getGroupTitle<Map.Entry<? extends K, ? extends V>> implements UTF8Writer<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final FastDoubleMath<K, V> RemoteActionCompatParcelizer;

    public readIntBE(FastDoubleMath<K, V> fastDoubleMath) {
        this.RemoteActionCompatParcelizer = fastDoubleMath;
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return write((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getWrite() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public final boolean write(Map.Entry<? extends K, ? extends V> p0) {
        if (!(p0 instanceof Map.Entry)) {
            return false;
        }
        V v = this.RemoteActionCompatParcelizer.get(p0.getKey());
        return v != null ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(v, p0.getValue()) : p0.getValue() == null && this.RemoteActionCompatParcelizer.containsKey(p0.getKey());
    }

    @Override // kotlin.getGroupTitle, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new tryToParseEightDigitsUtf16(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
    }
}
