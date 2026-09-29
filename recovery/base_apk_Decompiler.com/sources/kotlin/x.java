package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.getModuleId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00028\u00018\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000f\u0010\u0014"}, d2 = {"Lo/x;", "K", "V", "Lo/AbstractNumberParser;", "", "Lo/FastDoubleSwar;", "p0", "p1", "p2", "<init>", "(Lo/FastDoubleSwar;Ljava/lang/Object;Ljava/lang/Object;)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/FastDoubleSwar;", "write", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class x<K, V> extends AbstractNumberParser<K, V> implements Map.Entry<K, V>, getModuleId.read {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final FastDoubleSwar<K, V> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private V read;

    public x(FastDoubleSwar<K, V> fastDoubleSwar, K k, V v) {
        super(k, v);
        this.write = fastDoubleSwar;
        this.read = v;
    }

    @Override // kotlin.AbstractNumberParser, java.util.Map.Entry
    public final V getValue() {
        return this.read;
    }

    public final void write(V v) {
        this.read = v;
    }

    @Override // kotlin.AbstractNumberParser, java.util.Map.Entry
    public final V setValue(V p0) {
        V value = getValue();
        write(p0);
        this.write.AudioAttributesCompatParcelizer(getKey(), p0);
        return value;
    }
}
