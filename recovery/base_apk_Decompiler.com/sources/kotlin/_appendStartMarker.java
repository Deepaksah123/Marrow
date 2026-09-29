package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class _appendStartMarker implements isLenient {
    private final List<getDefaultImpl> RemoteActionCompatParcelizer;

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer(long j) {
        return j < 0 ? 0 : -1;
    }

    public _appendStartMarker(List<getDefaultImpl> list) {
        this.RemoteActionCompatParcelizer = list;
    }

    @Override // kotlin.isLenient
    public final long write(int i) {
        buildTypeSerializer.IconCompatParcelizer(i == 0);
        return 0L;
    }

    @Override // kotlin.isLenient
    public final List<getDefaultImpl> read(long j) {
        return j >= 0 ? this.RemoteActionCompatParcelizer : Collections.emptyList();
    }
}
