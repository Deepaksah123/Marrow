package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lo/PointerInputEventHandler;", "Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableLongState;", "", "p0", "p1", "Lo/setOnQueryTextFocusChangeListener;", "p2", "<init>", "(IILo/setOnQueryTextFocusChangeListener;)V", "", "p3", "IconCompatParcelizer", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "read", "I", "()I", "RemoteActionCompatParcelizer", "write", "Lo/setOnQueryTextFocusChangeListener;", "AudioAttributesCompatParcelizer", "Lo/setDrawParams;", "Lo/setDrawParams;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointerInputEventHandler<V extends ScrollingTabContainerView> implements ParcelableSnapshotMutableLongState<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDrawParams<V> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer;

    public PointerInputEventHandler(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = setonquerytextfocuschangelistener;
        this.read = new setDrawParams<>(new setSwitchMinWidth(getRemoteActionCompatParcelizer(), getIconCompatParcelizer(), setonquerytextfocuschangelistener));
    }

    @Override // kotlin.ParcelableSnapshotMutableLongState
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ParcelableSnapshotMutableLongState
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ PointerInputEventHandler(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? setShowText.AudioAttributesCompatParcelizer() : setonquerytextfocuschangelistener);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        return (V) this.read.IconCompatParcelizer(p0, p1, p2, p3);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        return (V) this.read.read(p0, p1, p2, p3);
    }

    public PointerInputEventHandler() {
        this(0, 0, null, 7, null);
    }
}
