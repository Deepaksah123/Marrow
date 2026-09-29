package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u000b"}, d2 = {"", "p0", "p1", "p2", "", "p3", "IconCompatParcelizer", "(IIIZ)I", "AudioAttributesCompatParcelizer", "(IIIZ)Z", "write", "(IIZ)I", "read", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setImageRotate {
    private static final boolean AudioAttributesCompatParcelizer(int i, int i2, int i3, boolean z) {
        return z ? i2 <= i : i3 - i2 > i;
    }

    private static final int RemoteActionCompatParcelizer(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final int write(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    public static /* synthetic */ int IconCompatParcelizer$default(int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = true;
        }
        return IconCompatParcelizer(i, i2, i3, z);
    }

    public static final int IconCompatParcelizer(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return RemoteActionCompatParcelizer(i2, i3, z);
        }
        if (write(i, i2, i3, z)) {
            return write(i, i2, z);
        }
        if (AudioAttributesCompatParcelizer(i, i2, i3, z)) {
            return read(i, i2, z);
        }
        return AudioAttributesCompatParcelizer(i2, i3, z);
    }

    private static final boolean write(int i, int i2, int i3, boolean z) {
        return AudioAttributesCompatParcelizer(i, i2, i3, !z);
    }

    private static final int read(int i, int i2, boolean z) {
        return write(i, i2, !z);
    }

    private static final int AudioAttributesCompatParcelizer(int i, int i2, boolean z) {
        return RemoteActionCompatParcelizer(i, i2, !z);
    }
}
