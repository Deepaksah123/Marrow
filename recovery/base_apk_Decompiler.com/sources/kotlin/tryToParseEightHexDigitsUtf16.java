package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/tryToParseEightHexDigitsUtf16;", "K", "V", "Lo/reportUnexpectedEOF;", "Lo/setBigButtonText;", "Lo/FastDoubleMath;", "p0", "<init>", "(Lo/FastDoubleMath;)V", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "RemoteActionCompatParcelizer", "Lo/FastDoubleMath;", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "()I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryToParseEightHexDigitsUtf16<K, V> extends setBigButtonText<V> implements reportUnexpectedEOF<V> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final FastDoubleMath<K, V> IconCompatParcelizer;

    public tryToParseEightHexDigitsUtf16(FastDoubleMath<K, V> fastDoubleMath) {
        this.IconCompatParcelizer = fastDoubleMath;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getWrite() {
        return this.IconCompatParcelizer.size();
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final boolean contains(Object p0) {
        return this.IconCompatParcelizer.containsValue(p0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new tryToParseFourDigits(this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer());
    }
}
