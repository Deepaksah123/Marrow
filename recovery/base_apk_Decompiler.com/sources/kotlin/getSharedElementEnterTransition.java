package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0019"}, d2 = {"Lo/getSharedElementEnterTransition;", "Lo/getReturnTransition;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/tryToResolveUnresolved;", "read", "(Lo/tryToResolveUnresolved;)F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSharedElementEnterTransition implements getReturnTransition {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    private getSharedElementEnterTransition(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.read = f2;
        this.write = f3;
        this.RemoteActionCompatParcelizer = f4;
        boolean z = f >= BitmapDescriptorFactory.HUE_RED;
        boolean z2 = f2 >= BitmapDescriptorFactory.HUE_RED;
        if (!(z & z2 & (f3 >= BitmapDescriptorFactory.HUE_RED)) || !(f4 >= BitmapDescriptorFactory.HUE_RED)) {
            performCreate.IconCompatParcelizer("Padding must be non-negative");
        }
    }

    @Override // kotlin.getReturnTransition
    public final float read(tryToResolveUnresolved p0) {
        return p0 == tryToResolveUnresolved.write ? this.IconCompatParcelizer : this.write;
    }

    @Override // kotlin.getReturnTransition
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    @Override // kotlin.getReturnTransition
    public final float RemoteActionCompatParcelizer(tryToResolveUnresolved p0) {
        return p0 == tryToResolveUnresolved.write ? this.write : this.IconCompatParcelizer;
    }

    @Override // kotlin.getReturnTransition
    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof getSharedElementEnterTransition)) {
            return false;
        }
        getSharedElementEnterTransition getsharedelemententertransition = (getSharedElementEnterTransition) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, getsharedelemententertransition.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.read, getsharedelemententertransition.read) && assignParameter.IconCompatParcelizer(this.write, getsharedelemententertransition.write) && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, getsharedelemententertransition.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", top=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.read));
        sb.append(", end=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.write));
        sb.append(", bottom=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ getSharedElementEnterTransition(float f, float f2, float f3, float f4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4);
    }
}
