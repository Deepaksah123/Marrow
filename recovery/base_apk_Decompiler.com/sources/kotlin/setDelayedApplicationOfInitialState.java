package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lo/setDelayedApplicationOfInitialState;", "Lo/writerFor;", "Lo/setElevation;", "Lo/setTranslationY;", "p0", "", "p1", "p2", "<init>", "(Lo/setTranslationY;ZZ)V", "AudioAttributesCompatParcelizer", "()Lo/setElevation;", "", "(Lo/setElevation;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/setTranslationY;", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDelayedApplicationOfInitialState extends writerFor<setElevation> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setTranslationY AudioAttributesCompatParcelizer;

    public setDelayedApplicationOfInitialState(setTranslationY settranslationy, boolean z, boolean z2) {
        this.AudioAttributesCompatParcelizer = settranslationy;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setElevation IconCompatParcelizer() {
        return new setElevation(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(setElevation p0) {
        p0.read(this.AudioAttributesCompatParcelizer);
        p0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.read(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setDelayedApplicationOfInitialState)) {
            return false;
        }
        setDelayedApplicationOfInitialState setdelayedapplicationofinitialstate = (setDelayedApplicationOfInitialState) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, setdelayedapplicationofinitialstate.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == setdelayedapplicationofinitialstate.RemoteActionCompatParcelizer && this.IconCompatParcelizer == setdelayedapplicationofinitialstate.IconCompatParcelizer;
    }
}
