package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0006J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0019\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u0013R4\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\"\u0010\u000e\u001a\u00020\n8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b\u000e\u0010!\"\u0004\b\u001e\u0010\""}, d2 = {"Lo/tryToParseFourDigitsUtf16;", "K", "V", "T", "", "<init>", "()V", "", "", "p0", "", "p1", "p2", "", "write", "([Ljava/lang/Object;II)V", "([Ljava/lang/Object;I)V", "", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/tryToParseEightHexDigits;", "IconCompatParcelizer", "()Lo/tryToParseEightHexDigits;", "AudioAttributesImplApi21Parcelizer", "hasNext", "[Ljava/lang/Object;", "read", "()[Ljava/lang/Object;", "I", "()I", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class tryToParseFourDigitsUtf16<K, V, T> implements Iterator<T>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Object[] RemoteActionCompatParcelizer = tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer().getWrite();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from getter */
    protected final Object[] getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final void read(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    protected final int getWrite() {
        return this.write;
    }

    public final void write(Object[] p0, int p1, int p2) {
        this.RemoteActionCompatParcelizer = p0;
        this.AudioAttributesCompatParcelizer = p1;
        this.write = p2;
    }

    public final void write(Object[] p0, int p1) {
        write(p0, p1, 0);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write < this.AudioAttributesCompatParcelizer;
    }

    public final K AudioAttributesCompatParcelizer() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(RemoteActionCompatParcelizer());
        return (K) this.RemoteActionCompatParcelizer[this.write];
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(RemoteActionCompatParcelizer());
        this.write += 2;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(this.write >= this.AudioAttributesCompatParcelizer);
        return this.write < this.RemoteActionCompatParcelizer.length;
    }

    public final tryToParseEightHexDigits<? extends K, ? extends V> IconCompatParcelizer() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(MediaBrowserCompatItemReceiver());
        Object obj = this.RemoteActionCompatParcelizer[this.write];
        toMagicModuleMetaRepoModel.read(obj, "");
        return (tryToParseEightHexDigits) obj;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(MediaBrowserCompatItemReceiver());
        this.write++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return RemoteActionCompatParcelizer();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
