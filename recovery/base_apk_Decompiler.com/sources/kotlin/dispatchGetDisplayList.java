package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\u000bJ(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\r\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/dispatchGetDisplayList;", "Lo/ScrollingTabContainerView;", "V", "Lo/setCanUseCompositingLayerui_graphics;", "", "p0", "p1", "Lo/setIconified;", "p2", "<init>", "(FFLo/setIconified;)V", "(FFLo/ScrollingTabContainerView;)V", "", "write", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)J", "RemoteActionCompatParcelizer", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "p3", "IconCompatParcelizer", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "read", "F", "", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dispatchGetDisplayList<V extends ScrollingTabContainerView> implements setCanUseCompositingLayerui_graphics<V> {
    private final /* synthetic */ setDrawParams<V> AudioAttributesCompatParcelizer;
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    private dispatchGetDisplayList(float f, float f2, setIconified seticonified) {
        this.AudioAttributesCompatParcelizer = new setDrawParams<>(seticonified);
        this.read = f;
        this.IconCompatParcelizer = f2;
    }

    public dispatchGetDisplayList(float f, float f2, V v) {
        this(f, f2, ParcelableSnapshotMutableState.RemoteActionCompatParcelizer(v, f, f2));
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final long write(V p0, V p1, V p2) {
        return this.AudioAttributesCompatParcelizer.write(p0, p1, p2);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V RemoteActionCompatParcelizer(V p0, V p1, V p2) {
        return (V) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        return (V) this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1, p2, p3);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        return (V) this.AudioAttributesCompatParcelizer.read(p0, p1, p2, p3);
    }

    @Override // kotlin.setCanUseCompositingLayerui_graphics, kotlin.ParcelableSnapshotMutableIntState
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
