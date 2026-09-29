package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class downloadMagicModuleDetaillambda0 extends setGroupTitle {
    private final byte[] AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    public downloadMagicModuleDetaillambda0(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.AudioAttributesCompatParcelizer.length;
    }

    @Override // kotlin.setGroupTitle
    public final byte IconCompatParcelizer() {
        try {
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.RemoteActionCompatParcelizer--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
