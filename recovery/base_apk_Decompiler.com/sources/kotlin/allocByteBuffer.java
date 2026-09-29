package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0011\u001a\u00020\r*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010\"\u0015\u0010\u000e\u001a\u00020\u0012*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"", "p0", "p1", "p2", "p3", "p4", "p5", "Lo/WritableTypeId;", "write", "(FFFFFF)Lo/WritableTypeId;", "Lo/TypeReference;", "AudioAttributesCompatParcelizer", "(FFFFJ)Lo/WritableTypeId;", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;JJJJ)Lo/WritableTypeId;", "(Lo/WritableTypeId;)Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "", "read", "(Lo/WritableTypeId;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class allocByteBuffer {
    public static final WritableTypeId RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, long j, long j2, long j3, long j4) {
        return new WritableTypeId(writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), writableTypeIdInclusion.getRemoteActionCompatParcelizer(), writableTypeIdInclusion.getWrite(), writableTypeIdInclusion.getIconCompatParcelizer(), j, j2, j3, j4, null);
    }

    public static final WritableTypeIdInclusion write(WritableTypeId writableTypeId) {
        return new WritableTypeIdInclusion(writableTypeId.getRemoteActionCompatParcelizer(), writableTypeId.getIconCompatParcelizer(), writableTypeId.getRead(), writableTypeId.getAudioAttributesCompatParcelizer());
    }

    public static final boolean read(WritableTypeId writableTypeId) {
        long write = writableTypeId.getWrite();
        long j = -1;
        return (write >>> 32) == (write & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) && writableTypeId.getWrite() == writableTypeId.getMediaBrowserCompatItemReceiver() && writableTypeId.getWrite() == writableTypeId.getMediaBrowserCompatCustomActionResultReceiver() && writableTypeId.getWrite() == writableTypeId.getAudioAttributesImplBaseParcelizer();
    }

    public static final WritableTypeId write(float f, float f2, float f3, float f4, float f5, float f6) {
        long j = -1;
        long jAudioAttributesCompatParcelizer = TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        return new WritableTypeId(f, f2, f3, f4, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, null);
    }

    public static final WritableTypeId AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, long j) {
        return write(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) j));
    }
}
