package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getFrameSizeInBytes extends getBitrateFromFrameSize {
    private final float IconCompatParcelizer;
    private final getBitrateFromFrameSize RemoteActionCompatParcelizer;

    public getFrameSizeInBytes(getBitrateFromFrameSize getbitratefromframesize, float f) {
        this.RemoteActionCompatParcelizer = getbitratefromframesize;
        this.IconCompatParcelizer = f;
    }

    @Override // kotlin.getBitrateFromFrameSize
    public final void read(float f, float f2, float f3, peekNextSampleSize peeknextsamplesize) {
        this.RemoteActionCompatParcelizer.read(f, f2 - this.IconCompatParcelizer, f3, peeknextsamplesize);
    }

    @Override // kotlin.getBitrateFromFrameSize
    final boolean AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }
}
