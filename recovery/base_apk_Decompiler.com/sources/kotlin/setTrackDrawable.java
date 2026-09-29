package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00028\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011\u0082\u0001\u0001\u0012"}, d2 = {"Lo/setTrackDrawable;", "T", "", "p0", "Lo/setOnQueryTextFocusChangeListener;", "p1", "<init>", "(Ljava/lang/Object;Lo/setOnQueryTextFocusChangeListener;)V", "IconCompatParcelizer", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "read", "Lo/setOnQueryTextFocusChangeListener;", "write", "()Lo/setOnQueryTextFocusChangeListener;", "(Lo/setOnQueryTextFocusChangeListener;)V", "Lo/setThumbTintList$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setTrackDrawable<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final T AudioAttributesCompatParcelizer;
    private setOnQueryTextFocusChangeListener read;

    private setTrackDrawable(T t, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        this.AudioAttributesCompatParcelizer = t;
        this.read = setonquerytextfocuschangelistener;
    }

    public final void IconCompatParcelizer(setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        this.read = setonquerytextfocuschangelistener;
    }

    public final T RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setOnQueryTextFocusChangeListener getRead() {
        return this.read;
    }

    public /* synthetic */ setTrackDrawable(Object obj, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj, setonquerytextfocuschangelistener);
    }
}
