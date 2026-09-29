package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/skipWhitespace;", "T", "Lo/AbstractJavaFloatingPointBitsFromByteArray;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "AudioAttributesCompatParcelizer", "[Ljava/lang/Object;", "read", "Lo/charAt;", "IconCompatParcelizer", "Lo/charAt;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class skipWhitespace<T> extends AbstractJavaFloatingPointBitsFromByteArray<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final T[] read;
    private final charAt<T> IconCompatParcelizer;

    public skipWhitespace(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.read = tArr;
        int iIconCompatParcelizer = lookupHex.IconCompatParcelizer(i2);
        this.IconCompatParcelizer = new charAt<>(objArr, getQues.RemoteActionCompatParcelizer(i, iIconCompatParcelizer), iIconCompatParcelizer, i3);
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator, java.util.Iterator
    public final T next() {
        AudioAttributesCompatParcelizer();
        if (this.IconCompatParcelizer.hasNext()) {
            read(write() + 1);
            return this.IconCompatParcelizer.next();
        }
        T[] tArr = this.read;
        int iWrite = write();
        read(iWrite + 1);
        return tArr[iWrite - this.IconCompatParcelizer.getIconCompatParcelizer()];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        read();
        if (write() > this.IconCompatParcelizer.getIconCompatParcelizer()) {
            T[] tArr = this.read;
            read(write() - 1);
            return tArr[write() - this.IconCompatParcelizer.getIconCompatParcelizer()];
        }
        read(write() - 1);
        return this.IconCompatParcelizer.previous();
    }
}
