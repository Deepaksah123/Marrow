package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
final class contentSchema implements Serializers {
    private final _withResolved IconCompatParcelizer;

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer() {
        return 0L;
    }

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer(long j) {
        return 1L;
    }

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // kotlin.Serializers
    public final long IconCompatParcelizer(long j, long j2) {
        return j2;
    }

    @Override // kotlin.Serializers
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin.Serializers
    public final long RemoteActionCompatParcelizer(long j, long j2) {
        return 0L;
    }

    @Override // kotlin.Serializers
    public final long read(long j, long j2) {
        return 0L;
    }

    @Override // kotlin.Serializers
    public final long write(long j) {
        return 0L;
    }

    @Override // kotlin.Serializers
    public final long write(long j, long j2) {
        return 1L;
    }

    public contentSchema(_withResolved _withresolved) {
        this.IconCompatParcelizer = _withresolved;
    }

    @Override // kotlin.Serializers
    public final _withResolved IconCompatParcelizer(long j) {
        return this.IconCompatParcelizer;
    }
}
