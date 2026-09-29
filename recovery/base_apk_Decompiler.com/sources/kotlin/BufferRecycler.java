package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lo/getReferencedType;", "p0", "Lo/calloc;", "p1", "Lo/WritableTypeIdInclusion;", "read", "(JJ)Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "", "(JF)Lo/WritableTypeIdInclusion;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BufferRecycler {
    public static final WritableTypeIdInclusion read(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        return new WritableTypeIdInclusion(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) j2));
    }

    public static final WritableTypeIdInclusion IconCompatParcelizer(long j, long j2) {
        return new WritableTypeIdInclusion(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) j2));
    }

    public static final WritableTypeIdInclusion read(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        return new WritableTypeIdInclusion(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }
}
