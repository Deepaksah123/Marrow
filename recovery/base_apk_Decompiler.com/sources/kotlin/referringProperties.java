package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getReferencedType;", "Lo/hasReferringProperties;", "p0", "RemoteActionCompatParcelizer", "(JJ)J", "AudioAttributesCompatParcelizer", "(J)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class referringProperties {
    public static final long RemoteActionCompatParcelizer(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(j2);
        long j3 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) + hasReferringProperties.AudioAttributesCompatParcelizer(j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat + fIconCompatParcelizer) << 32));
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(j2);
        long j3 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) - hasReferringProperties.AudioAttributesCompatParcelizer(j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat - fIconCompatParcelizer) << 32));
    }

    public static final long AudioAttributesCompatParcelizer(long j) {
        long j2 = -1;
        return hasReferringProperties.read((((long) Math.round(Float.intBitsToFloat((int) j))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
