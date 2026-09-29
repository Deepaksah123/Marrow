package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a"}, d2 = {"Lo/safeSizeOf;", "T", "Lo/setOnQueryTextListener;", "", "p0", "p1", "Lo/setOnQueryTextFocusChangeListener;", "p2", "<init>", "(IILo/setOnQueryTextFocusChangeListener;)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/PointerInputEventHandler;", "read", "(Lo/evictionCount;)Lo/PointerInputEventHandler;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "write", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setOnQueryTextFocusChangeListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class safeSizeOf<T> implements setOnQueryTextListener<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public safeSizeOf(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = setonquerytextfocuschangelistener;
    }

    public /* synthetic */ safeSizeOf(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? setShowText.AudioAttributesCompatParcelizer() : setonquerytextfocuschangelistener);
    }

    @Override // kotlin.setOnQueryTextListener
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final <V extends ScrollingTabContainerView> PointerInputEventHandler<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        return new PointerInputEventHandler<>(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof safeSizeOf)) {
            return false;
        }
        safeSizeOf safesizeof = (safeSizeOf) p0;
        return safesizeof.read == this.read && safesizeof.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(safesizeof.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer;
    }

    public safeSizeOf() {
        this(0, 0, null, 7, null);
    }
}
