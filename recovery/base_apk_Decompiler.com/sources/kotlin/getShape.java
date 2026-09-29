package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\fR+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0004"}, d2 = {"Lo/getShape;", "Lo/onCreateView;", "p0", "<init>", "(Lo/onCreateView;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "Lo/InputAccessor;", "()Lo/onCreateView;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getShape implements onCreateView {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor IconCompatParcelizer;

    public getShape(onCreateView oncreateview) {
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(oncreateview, null, 2, null);
    }

    public /* synthetic */ getShape(onCreateView oncreateview, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? onDestroy.read(0, 0, 0, 0) : oncreateview);
    }

    public final void read(onCreateView oncreateview) {
        this.IconCompatParcelizer.write(oncreateview);
    }

    public final onCreateView write() {
        return (onCreateView) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return write().RemoteActionCompatParcelizer(p0, p1);
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return write().AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return write().write(p0, p1);
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return write().RemoteActionCompatParcelizer(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getShape() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
