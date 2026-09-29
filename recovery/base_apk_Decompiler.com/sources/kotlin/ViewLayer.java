package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010"}, d2 = {"Lo/ViewLayer;", "Lo/ScrollingTabContainerView;", "V", "", "p0", "Lo/setOnQueryTextFocusChangeListener;", "p1", "Lo/setSelected;", "p2", "<init>", "(Lo/ScrollingTabContainerView;Lo/setOnQueryTextFocusChangeListener;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/ScrollingTabContainerView;", "AudioAttributesCompatParcelizer", "()Lo/ScrollingTabContainerView;", "IconCompatParcelizer", "Lo/setOnQueryTextFocusChangeListener;", "write", "()Lo/setOnQueryTextFocusChangeListener;", "read", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewLayer<V extends ScrollingTabContainerView> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setOnQueryTextFocusChangeListener RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final V IconCompatParcelizer;
    private final int read;

    private ViewLayer(V v, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i) {
        this.IconCompatParcelizer = v;
        this.RemoteActionCompatParcelizer = setonquerytextfocuschangelistener;
        this.read = i;
    }

    public final V AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setOnQueryTextFocusChangeListener getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public /* synthetic */ ViewLayer(ScrollingTabContainerView scrollingTabContainerView, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(scrollingTabContainerView, setonquerytextfocuschangelistener, i);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ViewLayer)) {
            return false;
        }
        ViewLayer viewLayer = (ViewLayer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, viewLayer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, viewLayer.RemoteActionCompatParcelizer) && setSelected.write(this.read, viewLayer.read);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + setSelected.IconCompatParcelizer(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewLayer(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append((Object) setSelected.RemoteActionCompatParcelizer(this.read));
        sb.append(')');
        return sb.toString();
    }
}
