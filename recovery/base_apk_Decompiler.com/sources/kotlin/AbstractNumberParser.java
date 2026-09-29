package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lo/AbstractNumberParser;", "K", "V", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "write", "getValue", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AbstractNumberParser<K, V> implements Map.Entry<K, V>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final K write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final V IconCompatParcelizer;

    public AbstractNumberParser(K k, V v) {
        this.write = k;
        this.IconCompatParcelizer = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object p0) {
        Map.Entry entry = p0 instanceof Map.Entry ? (Map.Entry) p0 : null;
        return entry != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getKey(), getKey()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getValue(), getValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
