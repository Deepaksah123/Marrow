package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0019"}, d2 = {"Lo/growArrayBy;", "", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(I)Z", "p1", "", "RemoteActionCompatParcelizer", "(IZ)V", "AudioAttributesCompatParcelizer", "(I)I", "(II)V", "", "toString", "()Ljava/lang/String;", "", "J", "read", "", "write", "[J", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class growArrayBy {
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long[] read = InputDecorator.write;

    public final int RemoteActionCompatParcelizer() {
        return (this.read.length + 2) << 6;
    }

    public final boolean IconCompatParcelizer(int p0) {
        int i;
        if (p0 < 64) {
            return (this.RemoteActionCompatParcelizer & (1 << p0)) != 0;
        }
        if (p0 < 128) {
            return (this.IconCompatParcelizer & (1 << (p0 - 64))) != 0;
        }
        long[] jArr = this.read;
        int length = jArr.length;
        if (length != 0 && (p0 / 64) - 2 < length) {
            return (jArr[i] & (1 << (p0 % 64))) != 0;
        }
        return false;
    }

    public final void RemoteActionCompatParcelizer(int p0, boolean p1) {
        if (p0 < 64) {
            this.RemoteActionCompatParcelizer = ((~(1 << p0)) & this.RemoteActionCompatParcelizer) | ((p1 ? 1L : 0L) << p0);
            return;
        }
        if (p0 < 128) {
            this.IconCompatParcelizer = ((~(1 << (p0 - 64))) & this.IconCompatParcelizer) | ((p1 ? 1L : 0L) << p0);
            return;
        }
        int i = p0 / 64;
        int i2 = i - 2;
        int i3 = p0 % 64;
        long[] jArrCopyOf = this.read;
        if (i2 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i - 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
            this.read = jArrCopyOf;
        }
        jArrCopyOf[i2] = ((~(1 << i3)) & jArrCopyOf[i2]) | ((p1 ? 1L : 0L) << i3);
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1) {
        long j = p0 < p1 ? -1L : 0L;
        this.RemoteActionCompatParcelizer = (((((long) (p0 < 64 ? 1 : 0)) * j) >>> (64 - (Math.min(64, p1) - p0))) << p0) | this.RemoteActionCompatParcelizer;
        if (p1 > 64) {
            int iMax = Math.max(p0, 64);
            this.IconCompatParcelizer = (((j * ((long) (iMax < 128 ? 1 : 0))) >>> (128 - (Math.min(128, p1) - iMax))) << iMax) | this.IconCompatParcelizer;
            if (p1 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < p1; iMax2++) {
                    RemoteActionCompatParcelizer(iMax2, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        boolean z = true;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            if (IconCompatParcelizer(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(']');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        int iNumberOfTrailingZeros;
        if (p0 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.RemoteActionCompatParcelizer) >>> p0) << p0)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (p0 < 128) {
            int i = p0 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.IconCompatParcelizer) >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(p0, 128);
        int i2 = (iMax / 64) - 2;
        long[] jArr = this.read;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = ~jArr[i3];
            if (i3 == i2) {
                int i4 = iMax % 64;
                j = (j >>> i4) << i4;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i3 << 6) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }
}
