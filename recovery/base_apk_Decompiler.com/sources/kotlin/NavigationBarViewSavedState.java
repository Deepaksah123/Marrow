package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lo/NavigationBarViewSavedState;", "", "", "p0", "p1", "p2", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "read", "RemoteActionCompatParcelizer", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavigationBarViewSavedState {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Integer write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Integer read;

    public NavigationBarViewSavedState(int i, Integer num, Integer num2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = num;
        this.write = num2;
    }

    public /* synthetic */ NavigationBarViewSavedState(int i, Integer num, Integer num2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Integer getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Integer getWrite() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NavigationBarViewSavedState)) {
            return false;
        }
        NavigationBarViewSavedState navigationBarViewSavedState = (NavigationBarViewSavedState) p0;
        return this.RemoteActionCompatParcelizer == navigationBarViewSavedState.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, navigationBarViewSavedState.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, navigationBarViewSavedState.write);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        Integer num = this.read;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        Integer num = this.read;
        Integer num2 = this.write;
        StringBuilder sb = new StringBuilder("NavigationBarViewSavedState(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(num);
        sb.append(", write=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
