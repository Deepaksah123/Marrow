package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"Lo/_reportBase64UnexpectedPadding;", "", "Lo/assignParameter;", "p0", "p1", "<init>", "(FFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "F", "RemoteActionCompatParcelizer", "()F", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _reportBase64UnexpectedPadding {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    private _reportBase64UnexpectedPadding(float f, float f2) {
        this.IconCompatParcelizer = f;
        this.write = f2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    public final float IconCompatParcelizer() {
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer + this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _reportBase64UnexpectedPadding)) {
            return false;
        }
        _reportBase64UnexpectedPadding _reportbase64unexpectedpadding = (_reportBase64UnexpectedPadding) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, _reportbase64unexpectedpadding.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, _reportbase64unexpectedpadding.write);
    }

    public final int hashCode() {
        return (assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", right=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(IconCompatParcelizer()));
        sb.append(", width=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.write));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _reportBase64UnexpectedPadding(float f, float f2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2);
    }
}
