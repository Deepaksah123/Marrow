package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class newEncryptedArray extends getMcqGuessedMap {
    private final long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private boolean read;
    private final long write;

    public newEncryptedArray(long j, long j2, long j3) {
        this.IconCompatParcelizer = j3;
        this.write = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.read = z;
        this.RemoteActionCompatParcelizer = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read;
    }

    @Override // kotlin.getMcqGuessedMap
    public final long AudioAttributesCompatParcelizer() {
        long j = this.RemoteActionCompatParcelizer;
        if (j == this.write) {
            if (!this.read) {
                throw new NoSuchElementException();
            }
            this.read = false;
            return j;
        }
        this.RemoteActionCompatParcelizer = this.IconCompatParcelizer + j;
        return j;
    }
}
