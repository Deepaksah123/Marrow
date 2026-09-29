package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"", "p0", "p1", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(FF)J", "p2", "(JJF)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requiresObjectContext {
    public static final long AudioAttributesCompatParcelizer(float f, float f2) {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2, float f) {
        long j3 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f))) << 32) | (((long) Float.floatToRawIntBits(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2), f))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))));
    }
}
