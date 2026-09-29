package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultsjackson_module_kotlin<T> extends setUrl<T> {
    private final int AudioAttributesCompatParcelizer;
    private final List<T> read;
    private final int write;

    /* JADX WARN: Multi-variable type inference failed */
    public getDefaultsjackson_module_kotlin(int i, int i2, List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = i;
        this.write = i2;
        this.read = list;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getIconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer + this.read.size() + this.write;
    }

    @Override // kotlin.setUrl, java.util.List
    public final T get(int i) {
        if (i >= 0 && i < this.AudioAttributesCompatParcelizer) {
            return null;
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i < this.read.size() + i2 && i2 <= i) {
            return this.read.get(i - this.AudioAttributesCompatParcelizer);
        }
        int i3 = this.AudioAttributesCompatParcelizer;
        int size = this.read.size();
        if (i < size() && i3 + size <= i) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Illegal attempt to access index ");
        sb.append(i);
        sb.append(" in ItemSnapshotList of size ");
        sb.append(size());
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
