package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\t\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u000eJ \u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0010J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/getTimelineAdapter;", "", "<init>", "()V", "", "p0", "IconCompatParcelizer", "(I)I", "()I", "read", "", "RemoteActionCompatParcelizer", "(I)Z", "", "(Lo/getTimelineAdapter;)V", "p1", "(II)Lo/getTimelineAdapter;", "write", "set", "I", "", "values", "[I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getTimelineAdapter {
    public static final int COUNT = 10;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    public final int write() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int RemoteActionCompatParcelizer() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final getTimelineAdapter read(int p0, int p1) {
        if (p0 >= 0) {
            int[] iArr = this.values;
            if (p0 < iArr.length) {
                this.set = (1 << p0) | this.set;
                iArr[p0] = p1;
            }
        }
        return this;
    }

    public final boolean RemoteActionCompatParcelizer(int p0) {
        return (this.set & (1 << p0)) != 0;
    }

    public final int IconCompatParcelizer(int p0) {
        return this.values[p0];
    }

    public final int read() {
        return Integer.bitCount(this.set);
    }

    public final int IconCompatParcelizer() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int read(int p0) {
        return (this.set & 32) != 0 ? this.values[5] : p0;
    }

    public final void read(getTimelineAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (int i = 0; i < 10; i++) {
            if (p0.RemoteActionCompatParcelizer(i)) {
                read(i, p0.IconCompatParcelizer(i));
            }
        }
    }
}
