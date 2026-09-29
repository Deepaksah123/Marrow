package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000f"}, d2 = {"Lo/setHasNonEmbeddedTabs;", "", "", "p0", "<init>", "(I)V", "", "RemoteActionCompatParcelizer", "write", "()V", "AudioAttributesCompatParcelizer", "", "read", "()Z", "()I", "I", "", "IconCompatParcelizer", "[I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setHasNonEmbeddedTabs {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int[] AudioAttributesCompatParcelizer;
    private int read;
    private int write;

    private setHasNonEmbeddedTabs(int i) {
        if (i <= 0) {
            AppCompatImageButton.read("capacity must be >= 1");
        }
        if (i > 1073741824) {
            AppCompatImageButton.read("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.RemoteActionCompatParcelizer = i - 1;
        this.AudioAttributesCompatParcelizer = new int[i];
    }

    public /* synthetic */ setHasNonEmbeddedTabs(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void AudioAttributesCompatParcelizer() {
        int[] iArr = this.AudioAttributesCompatParcelizer;
        int length = iArr.length;
        int i = this.read;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i2];
        getOrderDetails.read(iArr, iArr2, 0, i, length);
        getOrderDetails.read(this.AudioAttributesCompatParcelizer, iArr2, length - i, 0, this.read);
        this.AudioAttributesCompatParcelizer = iArr2;
        this.read = 0;
        this.write = length;
        this.RemoteActionCompatParcelizer = i2 - 1;
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        int[] iArr = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        iArr[i] = p0;
        int i2 = this.RemoteActionCompatParcelizer & (i + 1);
        this.write = i2;
        if (i2 == this.read) {
            AudioAttributesCompatParcelizer();
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int i = this.read;
        if (i == this.write) {
            setLogo setlogo = setLogo.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.AudioAttributesCompatParcelizer[i];
        this.read = (i + 1) & this.RemoteActionCompatParcelizer;
        return i2;
    }

    public final void write() {
        this.write = this.read;
    }

    public final boolean read() {
        return this.read == this.write;
    }

    public setHasNonEmbeddedTabs() {
        this(0, 1, null);
    }
}
