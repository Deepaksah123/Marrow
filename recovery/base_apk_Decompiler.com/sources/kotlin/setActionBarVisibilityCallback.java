package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lo/setActionBarVisibilityCallback;", "E", "", "", "p0", "<init>", "(I)V", "", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "write", "()V", "read", "(I)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "()Z", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()I", "I", "", "[Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setActionBarVisibilityCallback<E> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;
    private E[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    public setActionBarVisibilityCallback(int i) {
        if (i <= 0) {
            AppCompatImageButton.read("capacity must be >= 1");
        }
        if (i > 1073741824) {
            AppCompatImageButton.read("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.AudioAttributesCompatParcelizer = i - 1;
        this.IconCompatParcelizer = (E[]) new Object[i];
    }

    public /* synthetic */ setActionBarVisibilityCallback(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void write() {
        E[] eArr = this.IconCompatParcelizer;
        int length = eArr.length;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i2];
        getOrderDetails.RemoteActionCompatParcelizer(eArr, eArr2, 0, i, length);
        getOrderDetails.RemoteActionCompatParcelizer(this.IconCompatParcelizer, eArr2, length - i, 0, this.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = eArr2;
        this.RemoteActionCompatParcelizer = 0;
        this.read = length;
        this.AudioAttributesCompatParcelizer = i2 - 1;
    }

    public final void IconCompatParcelizer(E p0) {
        E[] eArr = this.IconCompatParcelizer;
        int i = this.read;
        eArr[i] = p0;
        int i2 = this.AudioAttributesCompatParcelizer & (i + 1);
        this.read = i2;
        if (i2 == this.RemoteActionCompatParcelizer) {
            write();
        }
    }

    public final E IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == this.read) {
            setLogo setlogo = setLogo.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.IconCompatParcelizer;
        E e = eArr[i];
        eArr[i] = null;
        this.RemoteActionCompatParcelizer = (i + 1) & this.AudioAttributesCompatParcelizer;
        return e;
    }

    public final E read(int p0) {
        if (p0 < 0 || p0 >= RemoteActionCompatParcelizer()) {
            setLogo setlogo = setLogo.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.IconCompatParcelizer[this.AudioAttributesCompatParcelizer & (this.RemoteActionCompatParcelizer + p0)];
        toMagicModuleMetaRepoModel.write(e);
        return e;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer & (this.read - this.RemoteActionCompatParcelizer);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == this.read;
    }

    public setActionBarVisibilityCallback() {
        this(0, 1, null);
    }
}
