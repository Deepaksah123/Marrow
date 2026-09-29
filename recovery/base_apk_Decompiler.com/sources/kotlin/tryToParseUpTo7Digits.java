package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/tryToParseUpTo7Digits;", "K", "V", "Lo/tryToParseFourDigitsUtf16;", "", "Lo/FastDoubleSwar;", "p0", "<init>", "(Lo/FastDoubleSwar;)V", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/util/Map$Entry;", "AudioAttributesCompatParcelizer", "Lo/FastDoubleSwar;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryToParseUpTo7Digits<K, V> extends tryToParseFourDigitsUtf16<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final FastDoubleSwar<K, V> IconCompatParcelizer;

    public tryToParseUpTo7Digits(FastDoubleSwar<K, V> fastDoubleSwar) {
        this.IconCompatParcelizer = fastDoubleSwar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> next() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(RemoteActionCompatParcelizer());
        read(getWrite() + 2);
        return new x(this.IconCompatParcelizer, getRemoteActionCompatParcelizer()[getWrite() - 2], getRemoteActionCompatParcelizer()[getWrite() - 1]);
    }
}
