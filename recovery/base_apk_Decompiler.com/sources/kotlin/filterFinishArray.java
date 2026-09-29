package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000eJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\rJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012"}, d2 = {"Lo/filterFinishArray;", "", "<init>", "()V", "", "write", "()[I", "", "p0", "", "RemoteActionCompatParcelizer", "(I)V", "AudioAttributesCompatParcelizer", "()I", "(I)I", "IconCompatParcelizer", "read", "[I", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class filterFinishArray {
    public int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public int[] read = new int[10];

    private final int[] write() {
        int[] iArr = this.read;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length << 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
        this.read = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        int[] iArrWrite = this.read;
        if (this.AudioAttributesCompatParcelizer >= iArrWrite.length) {
            iArrWrite = write();
        }
        int i = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = i + 1;
        iArrWrite[i] = p0;
    }

    public final int AudioAttributesCompatParcelizer() {
        int[] iArr = this.read;
        int i = this.AudioAttributesCompatParcelizer - 1;
        this.AudioAttributesCompatParcelizer = i;
        return iArr[i];
    }

    public final int write(int p0) {
        int i = this.AudioAttributesCompatParcelizer - 1;
        return i >= 0 ? this.read[i] : p0;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read[this.AudioAttributesCompatParcelizer - 1];
    }

    public final int IconCompatParcelizer() {
        return this.read[this.AudioAttributesCompatParcelizer - 2];
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.read[p0];
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final int read(int p0) {
        int[] iArr = this.read;
        int iMin = Math.min(iArr.length, this.AudioAttributesCompatParcelizer);
        for (int i = 0; i < iMin; i++) {
            if (iArr[i] == p0) {
                return i;
            }
        }
        return -1;
    }
}
