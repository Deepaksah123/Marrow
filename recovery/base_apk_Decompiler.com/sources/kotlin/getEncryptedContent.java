package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getEncryptedContent extends getSINGLE_SYNC_RESULT {
    private boolean AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int read;
    private int write;

    public getEncryptedContent(int i, int i2, int i3) {
        this.IconCompatParcelizer = i3;
        this.read = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.AudioAttributesCompatParcelizer = z;
        this.write = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getSINGLE_SYNC_RESULT
    public final int RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i == this.read) {
            if (!this.AudioAttributesCompatParcelizer) {
                throw new NoSuchElementException();
            }
            this.AudioAttributesCompatParcelizer = false;
            return i;
        }
        this.write = this.IconCompatParcelizer + i;
        return i;
    }
}
