package kotlin;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ#\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u000bR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017"}, d2 = {"Lo/tryDecToDoubleWithFastAlgorithm;", "K", "V", "Lo/valueOfFloatLiteral;", "", "Lo/toBigInteger;", "p0", "<init>", "(Lo/toBigInteger;)V", "", "write", "(Ljava/util/Map$Entry;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "read", "IconCompatParcelizer", "Lo/toBigInteger;", "", "()I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryDecToDoubleWithFastAlgorithm<K, V> extends valueOfFloatLiteral<Map.Entry<K, V>, K, V> {
    private final toBigInteger<K, V> IconCompatParcelizer;

    public tryDecToDoubleWithFastAlgorithm(toBigInteger<K, V> tobiginteger) {
        this.IconCompatParcelizer = tobiginteger;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final boolean add(Map.Entry<K, V> p0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new FastDoubleSwar(this.IconCompatParcelizer);
    }

    @Override // kotlin.valueOfFloatLiteral
    public final boolean read(Map.Entry<? extends K, ? extends V> p0) {
        return this.IconCompatParcelizer.remove(p0.getKey(), p0.getValue());
    }

    @Override // kotlin.getCardContent
    public final int read() {
        return this.IconCompatParcelizer.size();
    }

    @Override // kotlin.valueOfFloatLiteral
    public final boolean IconCompatParcelizer(Map.Entry<? extends K, ? extends V> p0) {
        V v = this.IconCompatParcelizer.get(p0.getKey());
        return v != null ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(v, p0.getValue()) : p0.getValue() == null && this.IconCompatParcelizer.containsKey(p0.getKey());
    }
}
