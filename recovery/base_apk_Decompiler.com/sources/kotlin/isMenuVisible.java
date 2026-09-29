package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018"}, d2 = {"Lo/isMenuVisible;", "Lo/onCreateView;", "p0", "p1", "<init>", "(Lo/onCreateView;Lo/onCreateView;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "read", "Lo/onCreateView;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isMenuVisible implements onCreateView {
    private final onCreateView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onCreateView write;

    public isMenuVisible(onCreateView oncreateview, onCreateView oncreateview2) {
        this.write = oncreateview;
        this.RemoteActionCompatParcelizer = oncreateview2;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return Math.max(this.write.RemoteActionCompatParcelizer(p0, p1), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0, p1));
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return Math.max(this.write.AudioAttributesCompatParcelizer(p0), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0));
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return Math.max(this.write.write(p0, p1), this.RemoteActionCompatParcelizer.write(p0, p1));
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return Math.max(this.write.RemoteActionCompatParcelizer(p0), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0));
    }

    public final int hashCode() {
        return this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isMenuVisible)) {
            return false;
        }
        isMenuVisible ismenuvisible = (isMenuVisible) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ismenuvisible.write, this.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ismenuvisible.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.write);
        sb.append(" ∪ ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
