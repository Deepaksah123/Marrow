package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class assertInitialized extends getBitrateFromFrameSize {
    private final float read;

    @Override // kotlin.getBitrateFromFrameSize
    final boolean AudioAttributesImplApi21Parcelizer() {
        return true;
    }

    public assertInitialized(float f) {
        this.read = f - 0.001f;
    }

    @Override // kotlin.getBitrateFromFrameSize
    public final void read(float f, float f2, float f3, peekNextSampleSize peeknextsamplesize) {
        float fSqrt = (float) ((((double) this.read) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.read, 2.0d) - Math.pow(fSqrt, 2.0d));
        peeknextsamplesize.RemoteActionCompatParcelizer(f2 - fSqrt, ((float) (-((((double) this.read) * Math.sqrt(2.0d)) - ((double) this.read)))) + fSqrt2);
        peeknextsamplesize.write(f2, (float) (-((((double) this.read) * Math.sqrt(2.0d)) - ((double) this.read))));
        peeknextsamplesize.write(f2 + fSqrt, ((float) (-((((double) this.read) * Math.sqrt(2.0d)) - ((double) this.read)))) + fSqrt2);
    }
}
