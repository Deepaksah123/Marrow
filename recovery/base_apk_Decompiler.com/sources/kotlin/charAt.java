package kotlin;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a"}, d2 = {"Lo/charAt;", "E", "Lo/AbstractJavaFloatingPointBitsFromByteArray;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "([Ljava/lang/Object;III)V", "", "read", "IconCompatParcelizer", "(II)V", "write", "(I)V", "()Ljava/lang/Object;", "next", "previous", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "[Ljava/lang/Object;", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class charAt<E> extends AbstractJavaFloatingPointBitsFromByteArray<E> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Object[] write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public charAt(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.IconCompatParcelizer = i3;
        Object[] objArr2 = new Object[i3];
        this.write = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.AudioAttributesCompatParcelizer = r5;
        objArr2[0] = objArr;
        IconCompatParcelizer(i - r5, 1);
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void read(Object[] p0, int p1, int p2, int p3) {
        read(p1);
        AudioAttributesCompatParcelizer(p2);
        this.IconCompatParcelizer = p3;
        if (this.write.length < p3) {
            this.write = new Object[p3];
        }
        this.write[0] = p0;
        ?? r0 = p1 == p2 ? 1 : 0;
        this.AudioAttributesCompatParcelizer = r0;
        IconCompatParcelizer(p1 - r0, 1);
    }

    private final void IconCompatParcelizer(int p0, int p1) {
        int i = (this.IconCompatParcelizer - p1) * 5;
        while (p1 < this.IconCompatParcelizer) {
            Object[] objArr = this.write;
            Object obj = objArr[p1 - 1];
            toMagicModuleMetaRepoModel.read(obj, "");
            objArr[p1] = ((Object[]) obj)[lookupHex.write(p0, i)];
            i -= 5;
            p1++;
        }
    }

    private final void write(int p0) {
        int i = 0;
        while (lookupHex.write(write(), i) == p0) {
            i += 5;
        }
        if (i > 0) {
            IconCompatParcelizer(write(), ((this.IconCompatParcelizer - 1) - (i / 5)) + 1);
        }
    }

    private final E IconCompatParcelizer() {
        int iWrite = write();
        Object obj = this.write[this.IconCompatParcelizer - 1];
        toMagicModuleMetaRepoModel.read(obj, "");
        return (E) ((Object[]) obj)[iWrite & 31];
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eIconCompatParcelizer = IconCompatParcelizer();
        read(write() + 1);
        if (write() == getIconCompatParcelizer()) {
            this.AudioAttributesCompatParcelizer = true;
            return eIconCompatParcelizer;
        }
        write(0);
        return eIconCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        read(write() - 1);
        if (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = false;
            return IconCompatParcelizer();
        }
        write(31);
        return IconCompatParcelizer();
    }
}
