package kotlin;

import java.util.List;
import java.util.RandomAccess;
import kotlin.setUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class KYCMetaV1<E> extends setUrl<E> implements RandomAccess {
    private final List<E> AudioAttributesCompatParcelizer;
    private int read;
    private int write;

    /* JADX WARN: Multi-variable type inference failed */
    public KYCMetaV1(List<? extends E> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
    }

    public final void write(int i, int i2) {
        setUrl.Companion.write(i, i2, this.AudioAttributesCompatParcelizer.size());
        this.write = i;
        this.read = i2 - i;
    }

    @Override // kotlin.setUrl, java.util.List
    public final E get(int i) {
        setUrl.Companion.IconCompatParcelizer(i, this.read);
        return this.AudioAttributesCompatParcelizer.get(this.write + i);
    }

    @Override // kotlin.setBigButtonText
    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
