package kotlin;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017"}, d2 = {"Lo/tryHexFloatToDoubleTruncated;", "K", "V", "", "Lo/setPrice;", "Lo/toBigInteger;", "p0", "<init>", "(Lo/toBigInteger;)V", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "IconCompatParcelizer", "Lo/toBigInteger;", "RemoteActionCompatParcelizer", "", "()I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryHexFloatToDoubleTruncated<K, V> extends setPrice<V> implements Collection<V> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final toBigInteger<K, V> RemoteActionCompatParcelizer;

    public tryHexFloatToDoubleTruncated(toBigInteger<K, V> tobiginteger) {
        this.RemoteActionCompatParcelizer = tobiginteger;
    }

    @Override // kotlin.setPrice
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object p0) {
        return this.RemoteActionCompatParcelizer.containsValue(p0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V p0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.RemoteActionCompatParcelizer.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new isEightDigits(this.RemoteActionCompatParcelizer);
    }
}
