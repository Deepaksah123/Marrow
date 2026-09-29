package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\n\u0010\b\"\u0015\u0010\t\u001a\u00020\u000b*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\b"}, d2 = {"", "p0", "p1", "Lo/getKey;", "read", "(II)J", "Lo/calloc;", "AudioAttributesCompatParcelizer", "(J)J", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/hasReferringProperties;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SetterlessProperty {
    public static final long read(int i, int i2) {
        long j = -1;
        return getKey.read((((long) i2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i) << 32));
    }

    public static final long read(long j) {
        long j2 = -1;
        return hasReferringProperties.read(((j >> 33) << 32) | (((j << 32) >> 33) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    public static final long AudioAttributesCompatParcelizer(long j) {
        long j2 = -1;
        return calloc.write((((long) Float.floatToRawIntBits((int) j)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
    }

    public static final long IconCompatParcelizer(long j) {
        long j2 = -1;
        return getKey.read((((long) ((int) Float.intBitsToFloat((int) j))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) ((int) Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        long j2 = -1;
        return getKey.read((((long) Math.round(Float.intBitsToFloat((int) j))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
