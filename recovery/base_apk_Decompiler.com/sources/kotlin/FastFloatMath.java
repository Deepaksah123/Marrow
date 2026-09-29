package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/FastFloatMath;", "K", "V", "Lo/tryToParseFourDigitsUtf16;", "<init>", "()V", "next", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FastFloatMath<K, V> extends tryToParseFourDigitsUtf16<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        createPowersOfTenFloor16Map.IconCompatParcelizer(RemoteActionCompatParcelizer());
        read(getWrite() + 2);
        return (V) getRemoteActionCompatParcelizer()[getWrite() - 1];
    }
}
