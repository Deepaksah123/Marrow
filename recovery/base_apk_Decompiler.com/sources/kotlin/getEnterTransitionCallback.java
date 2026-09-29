package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getEnterTransitionCallback;", "Lo/onCreateView;", "p0", "Lo/onOptionsItemSelected;", "p1", "<init>", "(Lo/onCreateView;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/onCreateView;", "IconCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getEnterTransitionCallback implements onCreateView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final onCreateView AudioAttributesCompatParcelizer;

    private getEnterTransitionCallback(onCreateView oncreateview, int i) {
        this.AudioAttributesCompatParcelizer = oncreateview;
        this.write = i;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        int iWrite;
        if (p1 == tryToResolveUnresolved.write) {
            iWrite = onOptionsItemSelected.INSTANCE.RemoteActionCompatParcelizer();
        } else {
            iWrite = onOptionsItemSelected.INSTANCE.write();
        }
        if (onOptionsItemSelected.read(this.write, iWrite)) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
        }
        return 0;
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        if (onOptionsItemSelected.read(this.write, onOptionsItemSelected.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }
        return 0;
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        int iIconCompatParcelizer;
        if (p1 == tryToResolveUnresolved.write) {
            iIconCompatParcelizer = onOptionsItemSelected.INSTANCE.AudioAttributesCompatParcelizer();
        } else {
            iIconCompatParcelizer = onOptionsItemSelected.INSTANCE.IconCompatParcelizer();
        }
        if (onOptionsItemSelected.read(this.write, iIconCompatParcelizer)) {
            return this.AudioAttributesCompatParcelizer.write(p0, p1);
        }
        return 0;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        if (onOptionsItemSelected.read(this.write, onOptionsItemSelected.INSTANCE.read())) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }
        return 0;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getEnterTransitionCallback)) {
            return false;
        }
        getEnterTransitionCallback getentertransitioncallback = (getEnterTransitionCallback) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getentertransitioncallback.AudioAttributesCompatParcelizer) && onOptionsItemSelected.RemoteActionCompatParcelizer(this.write, getentertransitioncallback.write);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + onOptionsItemSelected.RemoteActionCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" only ");
        sb.append((Object) onOptionsItemSelected.IconCompatParcelizer(this.write));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ getEnterTransitionCallback(onCreateView oncreateview, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(oncreateview, i);
    }
}
