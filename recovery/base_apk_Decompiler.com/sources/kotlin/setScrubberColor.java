package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setScrubberColor;", "Lo/setUnplayedColor;", "Lo/JsonAppendProp;", "Lo/assignParameter;", "p0", "<init>", "(FLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/calloc;", "Lo/bufferMapProperty;", "p1", "", "write", "(JLo/bufferMapProperty;)F", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class setScrubberColor implements setUnplayedColor, JsonAppendProp {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    private setScrubberColor(float f) {
        this.write = f;
    }

    @Override // kotlin.setUnplayedColor
    public final float write(long p0, bufferMapProperty p1) {
        return p1.AudioAttributesCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CornerSize(size = ");
        sb.append(this.write);
        sb.append(".dp)");
        return sb.toString();
    }

    public /* synthetic */ setScrubberColor(float f, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setScrubberColor) && assignParameter.IconCompatParcelizer(this.write, ((setScrubberColor) p0).write);
    }

    public final int hashCode() {
        return assignParameter.AudioAttributesCompatParcelizer(this.write);
    }
}
