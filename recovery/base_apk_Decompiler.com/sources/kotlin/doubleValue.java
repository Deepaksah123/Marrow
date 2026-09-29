package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/calloc;", "Lo/asInt;", "p0", "IconCompatParcelizer", "(JJ)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class doubleValue {
    public static final long IconCompatParcelizer(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        long j3 = -1;
        return calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) * Float.intBitsToFloat((int) j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat * fIntBitsToFloat2) << 32));
    }
}
