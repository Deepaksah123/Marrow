package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes4.dex */
public final class FailingSerializer implements Serializers {
    private final long RemoteActionCompatParcelizer;
    private final _failGetClassMethods write;

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer() {
        return 0L;
    }

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // kotlin.Serializers
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin.Serializers
    public final long read(long j, long j2) {
        return 0L;
    }

    public FailingSerializer(_failGetClassMethods _failgetclassmethods, long j) {
        this.write = _failgetclassmethods;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // kotlin.Serializers
    public final long AudioAttributesCompatParcelizer(long j) {
        return this.write.IconCompatParcelizer;
    }

    @Override // kotlin.Serializers
    public final long write(long j, long j2) {
        return this.write.IconCompatParcelizer;
    }

    @Override // kotlin.Serializers
    public final long write(long j) {
        return this.write.AudioAttributesCompatParcelizer[(int) j] - this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.Serializers
    public final long IconCompatParcelizer(long j, long j2) {
        return this.write.RemoteActionCompatParcelizer[(int) j];
    }

    @Override // kotlin.Serializers
    public final _withResolved IconCompatParcelizer(long j) {
        return new _withResolved(null, this.write.write[(int) j], this.write.read[r8]);
    }

    @Override // kotlin.Serializers
    public final long RemoteActionCompatParcelizer(long j, long j2) {
        return this.write.read(j + this.RemoteActionCompatParcelizer);
    }
}
