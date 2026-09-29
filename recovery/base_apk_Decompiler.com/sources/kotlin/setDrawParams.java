package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0013\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u000e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017"}, d2 = {"Lo/setDrawParams;", "Lo/ScrollingTabContainerView;", "V", "Lo/setCanUseCompositingLayerui_graphics;", "Lo/setIconified;", "p0", "<init>", "(Lo/setIconified;)V", "Lo/SearchViewSavedState;", "(Lo/SearchViewSavedState;)V", "", "p1", "p2", "p3", "IconCompatParcelizer", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "read", "RemoteActionCompatParcelizer", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "write", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)J", "AudioAttributesCompatParcelizer", "Lo/setIconified;", "Lo/ScrollingTabContainerView;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDrawParams<V extends ScrollingTabContainerView> implements setCanUseCompositingLayerui_graphics<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setIconified read;
    private V IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private V write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private V AudioAttributesCompatParcelizer;

    public setDrawParams(setIconified seticonified) {
        this.read = seticonified;
    }

    public setDrawParams(final SearchViewSavedState searchViewSavedState) {
        this(new setIconified() { // from class: o.setDrawParams.4
            @Override // kotlin.setIconified
            public final SearchViewSavedState RemoteActionCompatParcelizer(int p0) {
                return searchViewSavedState;
            }
        });
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        if (this.write == null) {
            this.write = (V) SearchView.IconCompatParcelizer(p1);
        }
        V v = this.write;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int write = v.getIconCompatParcelizer();
        for (int i = 0; i < write; i++) {
            V v2 = this.write;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.RemoteActionCompatParcelizer(i).AudioAttributesCompatParcelizer(p0, p1.read(i), p2.read(i), p3.read(i)));
        }
        V v3 = this.write;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = (V) SearchView.IconCompatParcelizer(p3);
        }
        V v = this.IconCompatParcelizer;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int write = v.getIconCompatParcelizer();
        for (int i = 0; i < write; i++) {
            V v2 = this.IconCompatParcelizer;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.RemoteActionCompatParcelizer(i).read(p0, p1.read(i), p2.read(i), p3.read(i)));
        }
        V v3 = this.IconCompatParcelizer;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V RemoteActionCompatParcelizer(V p0, V p1, V p2) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = (V) SearchView.IconCompatParcelizer(p2);
        }
        V v = this.AudioAttributesCompatParcelizer;
        if (v == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            v = null;
        }
        int write = v.getIconCompatParcelizer();
        for (int i = 0; i < write; i++) {
            V v2 = this.AudioAttributesCompatParcelizer;
            if (v2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                v2 = null;
            }
            v2.IconCompatParcelizer(i, this.read.RemoteActionCompatParcelizer(i).RemoteActionCompatParcelizer(p0.read(i), p1.read(i), p2.read(i)));
        }
        V v3 = this.AudioAttributesCompatParcelizer;
        if (v3 != null) {
            return v3;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final long write(V p0, V p1, V p2) {
        int write = p0.getIconCompatParcelizer();
        long jMax = 0;
        for (int i = 0; i < write; i++) {
            jMax = Math.max(jMax, this.read.RemoteActionCompatParcelizer(i).AudioAttributesCompatParcelizer(p0.read(i), p1.read(i), p2.read(i)));
        }
        return jMax;
    }
}
