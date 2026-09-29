package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/splitFloor16;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "p0", "<init>", "(I)V", "RemoteActionCompatParcelizer", "(I)I", "", "AudioAttributesCompatParcelizer", "()B", "", "AudioAttributesImplApi26Parcelizer", "()S"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class splitFloor16 extends AtomicInteger {
    public splitFloor16(int i) {
        super(i);
    }

    public final float IconCompatParcelizer() {
        return super.floatValue();
    }

    public final double RemoteActionCompatParcelizer() {
        return super.doubleValue();
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final double doubleValue() {
        return RemoteActionCompatParcelizer();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final float floatValue() {
        return IconCompatParcelizer();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final int intValue() {
        return read();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final long longValue() {
        return write();
    }

    public final int read() {
        return super.intValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return AudioAttributesImplApi26Parcelizer();
    }

    public final long write() {
        return super.longValue();
    }

    public final int RemoteActionCompatParcelizer(int p0) {
        return addAndGet(p0);
    }

    public final byte AudioAttributesCompatParcelizer() {
        return (byte) intValue();
    }

    public final short AudioAttributesImplApi26Parcelizer() {
        return (short) intValue();
    }
}
