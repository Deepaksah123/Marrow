package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b"}, d2 = {"Lo/dismissAllowingStateLoss;", "Lo/onCreateView;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class dismissAllowingStateLoss implements onCreateView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;
    private final float write;

    private dismissAllowingStateLoss(float f, float f2, float f3, float f4) {
        this.read = f;
        this.IconCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.write = f4;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return p0.IconCompatParcelizer(this.read);
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return p0.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return p0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return p0.IconCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.read));
        sb.append(", top=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", right=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", bottom=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.write));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof dismissAllowingStateLoss)) {
            return false;
        }
        dismissAllowingStateLoss dismissallowingstateloss = (dismissAllowingStateLoss) p0;
        return assignParameter.IconCompatParcelizer(this.read, dismissallowingstateloss.read) && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, dismissallowingstateloss.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, dismissallowingstateloss.AudioAttributesCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, dismissallowingstateloss.write);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.read);
        return (((((iAudioAttributesCompatParcelizer * 31) + assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write);
    }

    public /* synthetic */ dismissAllowingStateLoss(float f, float f2, float f3, float f4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4);
    }
}
