package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/positiveInfinity;", "E", "Lo/AbstractJavaFloatingPointBitsFromByteArray;", "p0", "", "p1", "<init>", "(Ljava/lang/Object;I)V", "next", "()Ljava/lang/Object;", "previous", "read", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class positiveInfinity<E> extends AbstractJavaFloatingPointBitsFromByteArray<E> {
    private final E read;

    public positiveInfinity(E e, int i) {
        super(i, 1);
        this.read = e;
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator, java.util.Iterator
    public final E next() {
        AudioAttributesCompatParcelizer();
        read(write() + 1);
        return this.read;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        read();
        read(write() - 1);
        return this.read;
    }
}
