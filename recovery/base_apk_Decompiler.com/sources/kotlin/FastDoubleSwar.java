package kotlin;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\f\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/FastDoubleSwar;", "K", "V", "", "", "Lo/toBigInteger;", "p0", "<init>", "(Lo/toBigInteger;)V", "", "hasNext", "()Z", "write", "()Ljava/util/Map$Entry;", "", "remove", "()V", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lo/BigSignificand;", "IconCompatParcelizer", "Lo/BigSignificand;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FastDoubleSwar<K, V> implements Iterator<Map.Entry<K, V>>, isModuleGeneratedVisible {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final BigSignificand<K, V, Map.Entry<K, V>> write;

    public FastDoubleSwar(toBigInteger<K, V> tobiginteger) {
        tryToParseFourDigitsUtf16[] trytoparsefourdigitsutf16Arr = new tryToParseFourDigitsUtf16[8];
        for (int i = 0; i < 8; i++) {
            trytoparsefourdigitsutf16Arr[i] = new tryToParseUpTo7Digits(this);
        }
        this.write = new BigSignificand<>(tobiginteger, trytoparsefourdigitsutf16Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> next() {
        return this.write.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.write.remove();
    }

    public final void AudioAttributesCompatParcelizer(K p0, V p1) {
        this.write.write(p0, p1);
    }
}
