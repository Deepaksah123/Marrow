package kotlin;

import kotlin.getTypeDescription;

/* JADX INFO: loaded from: classes2.dex */
final class rethrowIfFatal extends backticked implements contents {
    private final long AudioAttributesCompatParcelizer;
    private final int write;

    public rethrowIfFatal(long j, long j2, getTypeDescription.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        this(j, j2, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.read, z);
    }

    public rethrowIfFatal(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.write = i;
        this.AudioAttributesCompatParcelizer = j == -1 ? -1L : j;
    }

    @Override // kotlin.contents
    public final long RemoteActionCompatParcelizer(long j) {
        return AudioAttributesCompatParcelizer(j);
    }

    @Override // kotlin.contents
    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.contents
    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }
}
