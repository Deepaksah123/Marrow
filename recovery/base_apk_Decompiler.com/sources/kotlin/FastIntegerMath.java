package kotlin;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/FastIntegerMath;", "E", "", "", "p0", "", "Lo/hexFloatLiteralToFloat;", "p1", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "read", "()V", "IconCompatParcelizer", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Ljava/util/Map;", "", "write", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FastIntegerMath<E> implements Iterator<E>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<E, hexFloatLiteralToFloat> IconCompatParcelizer;
    public int write;

    public FastIntegerMath(Object obj, Map<E, hexFloatLiteralToFloat> map) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.write < this.IconCompatParcelizer.size();
    }

    @Override // java.util.Iterator
    public E next() {
        read();
        E e = (E) this.RemoteActionCompatParcelizer;
        this.write++;
        hexFloatLiteralToFloat hexfloatliteraltofloat = this.IconCompatParcelizer.get(e);
        if (hexfloatliteraltofloat != null) {
            this.RemoteActionCompatParcelizer = hexfloatliteraltofloat.getIconCompatParcelizer();
            return e;
        }
        StringBuilder sb = new StringBuilder("Hash code of an element (");
        sb.append(e);
        sb.append(") has changed after it was added to the persistent set.");
        throw new ConcurrentModificationException(sb.toString());
    }

    private final void read() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
