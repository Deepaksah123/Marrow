package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class isPersistent extends setPlanBUpgradeDataList {
    private final int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final int read;
    private boolean write;

    public isPersistent(char c, char c2, int i) {
        this.read = i;
        this.IconCompatParcelizer = c2;
        boolean z = i <= 0 ? toMagicModuleMetaRepoModel.read((int) c, (int) c2) >= 0 : toMagicModuleMetaRepoModel.read((int) c, (int) c2) <= 0;
        this.write = z;
        this.RemoteActionCompatParcelizer = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write;
    }

    @Override // kotlin.setPlanBUpgradeDataList
    public final char write() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == this.IconCompatParcelizer) {
            if (!this.write) {
                throw new NoSuchElementException();
            }
            this.write = false;
        } else {
            this.RemoteActionCompatParcelizer = this.read + i;
        }
        return (char) i;
    }
}
