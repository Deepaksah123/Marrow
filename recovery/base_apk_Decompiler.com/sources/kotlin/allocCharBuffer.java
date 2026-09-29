package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"", "p0", "p1", "Lo/calloc;", "IconCompatParcelizer", "(FF)J", "Lo/WritableTypeIdInclusion;", "(J)Lo/WritableTypeIdInclusion;", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(J)J", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class allocCharBuffer {
    public static final WritableTypeIdInclusion IconCompatParcelizer(long j) {
        return BufferRecycler.read(getReferencedType.INSTANCE.write(), j);
    }

    public static final long IconCompatParcelizer(float f, float f2) {
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static final long AudioAttributesCompatParcelizer(long j) {
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) / 2.0f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / 2.0f)) << 32));
    }
}
