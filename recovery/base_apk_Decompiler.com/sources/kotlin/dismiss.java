package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/dismiss;", "Lo/onCreateView;", "p0", "p1", "<init>", "(Lo/onCreateView;Lo/onCreateView;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "Lo/onCreateView;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class dismiss implements onCreateView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final onCreateView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onCreateView write;

    public dismiss(onCreateView oncreateview, onCreateView oncreateview2) {
        this.RemoteActionCompatParcelizer = oncreateview;
        this.write = oncreateview2;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return getQues.write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0, p1) - this.write.RemoteActionCompatParcelizer(p0, p1), 0);
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return getQues.write(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0) - this.write.AudioAttributesCompatParcelizer(p0), 0);
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return getQues.write(this.RemoteActionCompatParcelizer.write(p0, p1) - this.write.write(p0, p1), 0);
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return getQues.write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0) - this.write.RemoteActionCompatParcelizer(p0), 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" - ");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof dismiss)) {
            return false;
        }
        dismiss dismissVar = (dismiss) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dismissVar.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dismissVar.write, this.write);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }
}
