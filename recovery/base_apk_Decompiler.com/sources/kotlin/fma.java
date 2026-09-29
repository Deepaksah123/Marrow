package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011R2\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\f8\u0004@\u0005X\u0085\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u0018\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e"}, d2 = {"Lo/fma;", "K", "V", "T", "", "Lo/tryToParseEightHexDigits;", "p0", "", "Lo/tryToParseFourDigitsUtf16;", "p1", "<init>", "(Lo/tryToParseEightHexDigits;[Lo/tryToParseFourDigitsUtf16;)V", "", "IconCompatParcelizer", "(I)I", "", "AudioAttributesCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "read", "[Lo/tryToParseFourDigitsUtf16;", "()[Lo/tryToParseFourDigitsUtf16;", "write", "I", "(I)V", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class fma<K, V, T> implements Iterator<T>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final tryToParseFourDigitsUtf16<K, V, T>[] AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer = true;
    private int write;

    public fma(tryToParseEightHexDigits<K, V> trytoparseeighthexdigits, tryToParseFourDigitsUtf16<K, V, T>[] trytoparsefourdigitsutf16Arr) {
        this.AudioAttributesCompatParcelizer = trytoparsefourdigitsutf16Arr;
        trytoparsefourdigitsutf16Arr[0].write(trytoparseeighthexdigits.getWrite(), trytoparseeighthexdigits.RemoteActionCompatParcelizer() << 1);
        this.write = 0;
        AudioAttributesCompatParcelizer();
    }

    protected final tryToParseFourDigitsUtf16<K, V, T>[] IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void read(int i) {
        this.write = i;
    }

    private final int IconCompatParcelizer(int p0) {
        if (this.AudioAttributesCompatParcelizer[p0].RemoteActionCompatParcelizer()) {
            return p0;
        }
        if (!this.AudioAttributesCompatParcelizer[p0].MediaBrowserCompatItemReceiver()) {
            return -1;
        }
        tryToParseEightHexDigits<? extends K, ? extends V> trytoparseeighthexdigitsIconCompatParcelizer = this.AudioAttributesCompatParcelizer[p0].IconCompatParcelizer();
        if (p0 == 6) {
            this.AudioAttributesCompatParcelizer[p0 + 1].write(trytoparseeighthexdigitsIconCompatParcelizer.getWrite(), trytoparseeighthexdigitsIconCompatParcelizer.getWrite().length);
        } else {
            this.AudioAttributesCompatParcelizer[p0 + 1].write(trytoparseeighthexdigitsIconCompatParcelizer.getWrite(), trytoparseeighthexdigitsIconCompatParcelizer.RemoteActionCompatParcelizer() << 1);
        }
        return IconCompatParcelizer(p0 + 1);
    }

    private final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer[this.write].RemoteActionCompatParcelizer()) {
            return;
        }
        for (int i = this.write; i >= 0; i--) {
            int iIconCompatParcelizer = IconCompatParcelizer(i);
            if (iIconCompatParcelizer == -1 && this.AudioAttributesCompatParcelizer[i].MediaBrowserCompatItemReceiver()) {
                this.AudioAttributesCompatParcelizer[i].AudioAttributesImplApi21Parcelizer();
                iIconCompatParcelizer = IconCompatParcelizer(i);
            }
            if (iIconCompatParcelizer != -1) {
                this.write = iIconCompatParcelizer;
                return;
            }
            if (i > 0) {
                this.AudioAttributesCompatParcelizer[i - 1].AudioAttributesImplApi21Parcelizer();
            }
            this.AudioAttributesCompatParcelizer[i].write(tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer().getWrite(), 0);
        }
        this.RemoteActionCompatParcelizer = false;
    }

    protected final K RemoteActionCompatParcelizer() {
        read();
        return this.AudioAttributesCompatParcelizer[this.write].AudioAttributesCompatParcelizer();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public T next() {
        read();
        T next = this.AudioAttributesCompatParcelizer[this.write].next();
        AudioAttributesCompatParcelizer();
        return next;
    }

    private final void read() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
