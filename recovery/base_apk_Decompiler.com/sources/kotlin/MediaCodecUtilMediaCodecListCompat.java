package kotlin;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaCodecUtilMediaCodecListCompat {
    private long IconCompatParcelizer;
    private TimeUnit read;
    private long write;

    public MediaCodecUtilMediaCodecListCompat(long j, long j2, TimeUnit timeUnit) {
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.read = timeUnit;
    }

    /* JADX INFO: renamed from: o.MediaCodecUtilMediaCodecListCompat$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final double IconCompatParcelizer() {
        int i = AnonymousClass4.AudioAttributesCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            return (this.write / this.IconCompatParcelizer) * TimeUnit.SECONDS.toNanos(1L);
        }
        if (i == 2) {
            return (this.write / this.IconCompatParcelizer) * TimeUnit.SECONDS.toMicros(1L);
        }
        if (i == 3) {
            return (this.write / this.IconCompatParcelizer) * TimeUnit.SECONDS.toMillis(1L);
        }
        return this.write / this.read.toSeconds(this.IconCompatParcelizer);
    }
}
