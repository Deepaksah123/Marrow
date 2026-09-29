package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u000f\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\r\u0010\u0017"}, d2 = {"Lo/getCanUseCompositingLayerui_graphics;", "Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableFloatState;", "Lo/SearchViewSearchAutoComplete;", "p0", "<init>", "(Lo/SearchViewSearchAutoComplete;)V", "", "p1", "p2", "write", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "AudioAttributesCompatParcelizer", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)J", "IconCompatParcelizer", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "Lo/SearchViewSearchAutoComplete;", "read", "Lo/ScrollingTabContainerView;", "RemoteActionCompatParcelizer", "", "F", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getCanUseCompositingLayerui_graphics<V extends ScrollingTabContainerView> implements ParcelableSnapshotMutableFloatState<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private V write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final SearchViewSearchAutoComplete read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private V IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private V RemoteActionCompatParcelizer;

    public getCanUseCompositingLayerui_graphics(SearchViewSearchAutoComplete searchViewSearchAutoComplete) {
        this.read = searchViewSearchAutoComplete;
        this.AudioAttributesCompatParcelizer = searchViewSearchAutoComplete.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.ParcelableSnapshotMutableFloatState
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ParcelableSnapshotMutableFloatState
    public final V write(long p0, V p1, V p2) {
        if (this.write == null) {
            this.write = (V) SearchView.IconCompatParcelizer(p1);
        }
        V v = this.write;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int iconCompatParcelizer = v.getIconCompatParcelizer();
        for (int i = 0; i < iconCompatParcelizer; i++) {
            V v2 = this.write;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.IconCompatParcelizer(p0, p1.read(i), p2.read(i)));
        }
        V v3 = this.write;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.ParcelableSnapshotMutableFloatState
    public final long AudioAttributesCompatParcelizer(V p0, V p1) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = (V) SearchView.IconCompatParcelizer(p0);
        }
        V v = this.IconCompatParcelizer;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int iconCompatParcelizer = v.getIconCompatParcelizer();
        long jMax = 0;
        for (int i = 0; i < iconCompatParcelizer; i++) {
            jMax = Math.max(jMax, this.read.AudioAttributesCompatParcelizer(p0.read(i), p1.read(i)));
        }
        return jMax;
    }

    @Override // kotlin.ParcelableSnapshotMutableFloatState
    public final V IconCompatParcelizer(long p0, V p1, V p2) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = (V) SearchView.IconCompatParcelizer(p1);
        }
        V v = this.IconCompatParcelizer;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int iconCompatParcelizer = v.getIconCompatParcelizer();
        for (int i = 0; i < iconCompatParcelizer; i++) {
            V v2 = this.IconCompatParcelizer;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.RemoteActionCompatParcelizer(p0, p1.read(i), p2.read(i)));
        }
        V v3 = this.IconCompatParcelizer;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.ParcelableSnapshotMutableFloatState
    public final V write(V p0, V p1) {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = (V) SearchView.IconCompatParcelizer(p0);
        }
        V v = this.RemoteActionCompatParcelizer;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int iconCompatParcelizer = v.getIconCompatParcelizer();
        for (int i = 0; i < iconCompatParcelizer; i++) {
            V v2 = this.RemoteActionCompatParcelizer;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.write(p0.read(i), p1.read(i)));
        }
        V v3 = this.RemoteActionCompatParcelizer;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }
}
