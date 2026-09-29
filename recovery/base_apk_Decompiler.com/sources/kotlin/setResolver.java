package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\f\u001a%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010\"\u0015\u0010\u0005\u001a\u00020\u0004*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0013\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0004*\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015\"\u0015\u0010\u000e\u001a\u00020\u0004*\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015"}, d2 = {"", "p0", "Lo/processUnwrapped;", "p1", "Lo/ReadableObjectIdReferring;", "IconCompatParcelizer", "(FJ)J", "", "(JF)J", "", "RemoteActionCompatParcelizer", "(J)V", "(JJ)V", "p2", "write", "(JJF)J", "(F)J", "AudioAttributesCompatParcelizer", "", "(D)J", "", "(I)J", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setResolver {
    public static final long IconCompatParcelizer(float f, long j) {
        return IconCompatParcelizer(j, f);
    }

    public static final long RemoteActionCompatParcelizer(float f) {
        long j = 0;
        return IconCompatParcelizer((((long) 1) << 32) | (j - ((j >> 63) << 32)), f);
    }

    public static final long IconCompatParcelizer(double d) {
        long j = 0;
        return IconCompatParcelizer((((long) 1) << 32) | (j - ((j >> 63) << 32)), (float) d);
    }

    public static final long AudioAttributesCompatParcelizer(double d) {
        long j = 0;
        return IconCompatParcelizer((((long) 2) << 32) | (j - ((j >> 63) << 32)), (float) d);
    }

    public static final long RemoteActionCompatParcelizer(int i) {
        long j = 0;
        return IconCompatParcelizer((((long) 1) << 32) | (j - ((j >> 63) << 32)), i);
    }

    public static final long AudioAttributesCompatParcelizer(int i) {
        long j = 0;
        return IconCompatParcelizer((((long) 2) << 32) | (j - ((j >> 63) << 32)), i);
    }

    public static final long IconCompatParcelizer(long j, float f) {
        long j2 = -1;
        return ReadableObjectIdReferring.IconCompatParcelizer(j | (((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    public static final long write(long j, long j2, float f) {
        IconCompatParcelizer(j, j2);
        return IconCompatParcelizer(ReadableObjectIdReferring.RemoteActionCompatParcelizer(j), AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j), ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j2), f));
    }

    public static final void RemoteActionCompatParcelizer(long j) {
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j) == 0) {
            readIdProperty.read("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void IconCompatParcelizer(long j, long j2) {
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j) == 0 || ReadableObjectIdReferring.RemoteActionCompatParcelizer(j2) == 0) {
            readIdProperty.read("Cannot perform operation for Unspecified type.");
        }
        if (processUnwrapped.read(ReadableObjectIdReferring.write(j), ReadableObjectIdReferring.write(j2))) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot perform operation for ");
        sb.append((Object) processUnwrapped.read(ReadableObjectIdReferring.write(j)));
        sb.append(" and ");
        sb.append((Object) processUnwrapped.read(ReadableObjectIdReferring.write(j2)));
        readIdProperty.read(sb.toString());
    }
}
