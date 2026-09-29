package kotlin;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00142\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lo/BigSignificand;", "K", "V", "T", "", "Lo/fma;", "Lo/toBigInteger;", "p0", "", "Lo/tryToParseFourDigitsUtf16;", "p1", "<init>", "(Lo/toBigInteger;[Lo/tryToParseFourDigitsUtf16;)V", "next", "()Ljava/lang/Object;", "", "remove", "()V", "write", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Lo/tryToParseEightHexDigits;", "p2", "p3", "IconCompatParcelizer", "(ILo/tryToParseEightHexDigits;Ljava/lang/Object;I)V", "read", "Lo/toBigInteger;", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "", "Z", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BigSignificand<K, V, T> extends fma<K, V, T> implements Iterator<T>, isModuleGeneratedVisible {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final toBigInteger<K, V> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private K IconCompatParcelizer;
    private boolean write;

    public BigSignificand(toBigInteger<K, V> tobiginteger, tryToParseFourDigitsUtf16<K, V, T>[] trytoparsefourdigitsutf16Arr) {
        super(tobiginteger.AudioAttributesImplApi21Parcelizer(), trytoparsefourdigitsutf16Arr);
        this.read = tobiginteger;
        this.RemoteActionCompatParcelizer = tobiginteger.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.fma, java.util.Iterator
    public T next() {
        write();
        this.IconCompatParcelizer = RemoteActionCompatParcelizer();
        this.write = true;
        return (T) super.next();
    }

    @Override // kotlin.fma, java.util.Iterator
    public void remove() {
        read();
        if (getRemoteActionCompatParcelizer()) {
            K kRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            toMagicModuleStatsLSModel.write(this.read).remove(this.IconCompatParcelizer);
            IconCompatParcelizer(kRemoteActionCompatParcelizer != null ? kRemoteActionCompatParcelizer.hashCode() : 0, this.read.AudioAttributesImplApi21Parcelizer(), kRemoteActionCompatParcelizer, 0);
        } else {
            toMagicModuleStatsLSModel.write(this.read).remove(this.IconCompatParcelizer);
        }
        this.IconCompatParcelizer = null;
        this.write = false;
        this.RemoteActionCompatParcelizer = this.read.getAudioAttributesCompatParcelizer();
    }

    public final void write(K p0, V p1) {
        if (this.read.containsKey(p0)) {
            if (getRemoteActionCompatParcelizer()) {
                K kRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                this.read.put(p0, p1);
                IconCompatParcelizer(kRemoteActionCompatParcelizer != null ? kRemoteActionCompatParcelizer.hashCode() : 0, this.read.AudioAttributesImplApi21Parcelizer(), kRemoteActionCompatParcelizer, 0);
            } else {
                this.read.put(p0, p1);
            }
            this.RemoteActionCompatParcelizer = this.read.getAudioAttributesCompatParcelizer();
        }
    }

    private final void IconCompatParcelizer(int p0, tryToParseEightHexDigits<?, ?> p1, K p2, int p3) {
        int i = p3 * 5;
        if (i > 30) {
            IconCompatParcelizer()[p3].write(p1.getWrite(), p1.getWrite().length, 0);
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer()[p3].AudioAttributesCompatParcelizer(), p2)) {
                IconCompatParcelizer()[p3].AudioAttributesImplApi26Parcelizer();
            }
            read(p3);
            return;
        }
        int i2 = 1 << writeIntBE.read(p0, i);
        if (p1.IconCompatParcelizer(i2)) {
            IconCompatParcelizer()[p3].write(p1.getWrite(), p1.RemoteActionCompatParcelizer() << 1, p1.RemoteActionCompatParcelizer(i2));
            read(p3);
        } else {
            int i3 = p1.read(i2);
            tryToParseEightHexDigits<?, ?> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = p1.AudioAttributesCompatParcelizer(i3);
            IconCompatParcelizer()[p3].write(p1.getWrite(), p1.RemoteActionCompatParcelizer() << 1, i3);
            IconCompatParcelizer(p0, trytoparseeighthexdigitsAudioAttributesCompatParcelizer, p2, p3 + 1);
        }
    }

    private final void read() {
        if (!this.write) {
            throw new IllegalStateException();
        }
    }

    private final void write() {
        if (this.read.getAudioAttributesCompatParcelizer() != this.RemoteActionCompatParcelizer) {
            throw new ConcurrentModificationException();
        }
    }
}
