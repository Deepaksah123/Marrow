package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b"}, d2 = {"Lo/setLineHeight;", "", "", "p0", "Lo/findCreatorAnnotation;", "p1", "Lo/SwitchCompat;", "p2", "<init>", "(FJLo/SwitchCompat;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "F", "()F", "RemoteActionCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J", "Lo/SwitchCompat;", "()Lo/SwitchCompat;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class setLineHeight {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SwitchCompat<Float> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;
    private final float write;

    private setLineHeight(float f, long j, SwitchCompat<Float> switchCompat) {
        this.write = f;
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = switchCompat;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final SwitchCompat<Float> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ setLineHeight(float f, long j, SwitchCompat switchCompat, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, j, switchCompat);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setLineHeight)) {
            return false;
        }
        setLineHeight setlineheight = (setLineHeight) p0;
        return Float.compare(this.write, setlineheight.write) == 0 && findCreatorAnnotation.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, setlineheight.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setlineheight.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((Float.hashCode(this.write) * 31) + findCreatorAnnotation.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setLineHeight(write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append((Object) findCreatorAnnotation.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer));
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
