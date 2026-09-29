package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/ViewPager2LinearLayoutManagerImpl;", "Lo/writerFor;", "Lo/getPresentationContext;", "Lo/ViewPager2SavedState;", "p0", "Lo/setImageDisplayMode;", "p1", "Lo/Typed3EpoxyController;", "p2", "<init>", "(Lo/ViewPager2SavedState;Lo/setImageDisplayMode;Lo/Typed3EpoxyController;)V", "AudioAttributesCompatParcelizer", "()Lo/getPresentationContext;", "", "read", "(Lo/getPresentationContext;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/ViewPager2SavedState;", "write", "Lo/setImageDisplayMode;", "IconCompatParcelizer", "Lo/Typed3EpoxyController;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ViewPager2LinearLayoutManagerImpl extends writerFor<getPresentationContext> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Typed3EpoxyController RemoteActionCompatParcelizer;
    private final ViewPager2SavedState read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setImageDisplayMode IconCompatParcelizer;

    public ViewPager2LinearLayoutManagerImpl(ViewPager2SavedState viewPager2SavedState, setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController) {
        this.read = viewPager2SavedState;
        this.IconCompatParcelizer = setimagedisplaymode;
        this.RemoteActionCompatParcelizer = typed3EpoxyController;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getPresentationContext IconCompatParcelizer() {
        return new getPresentationContext(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getPresentationContext p0) {
        p0.IconCompatParcelizer(this.read);
        p0.read(this.IconCompatParcelizer);
        p0.read(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ViewPager2LinearLayoutManagerImpl)) {
            return false;
        }
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl = (ViewPager2LinearLayoutManagerImpl) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, viewPager2LinearLayoutManagerImpl.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, viewPager2LinearLayoutManagerImpl.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, viewPager2LinearLayoutManagerImpl.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewPager2LinearLayoutManagerImpl(read=");
        sb.append(this.read);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
