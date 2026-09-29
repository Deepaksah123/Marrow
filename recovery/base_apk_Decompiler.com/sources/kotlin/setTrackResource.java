package kotlin;

import kotlin.Metadata;
import kotlin.setTrackDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\t\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u000b8\u0007@FX\u0087\f¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0016"}, d2 = {"Lo/setTrackResource;", "T", "Lo/setTrackDrawable;", "E", "", "<init>", "()V", "Lo/setOnQueryTextFocusChangeListener;", "p0", "AudioAttributesCompatParcelizer", "(Lo/setTrackDrawable;Lo/setOnQueryTextFocusChangeListener;)Lo/setTrackDrawable;", "", "I", "()I", "read", "(I)V", "IconCompatParcelizer", "Lo/setProvider;", "Lo/setProvider;", "write", "()Lo/setProvider;", "RemoteActionCompatParcelizer", "Lo/setThumbTintList$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setTrackResource<T, E extends setTrackDrawable<T>> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read;
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setProvider<E> RemoteActionCompatParcelizer;

    private setTrackResource() {
        this.read = 300;
        this.RemoteActionCompatParcelizer = ActionMenuView.write();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final void read(int i) {
        this.read = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setProvider<E> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final E AudioAttributesCompatParcelizer(E e, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        e.IconCompatParcelizer(setonquerytextfocuschangelistener);
        return e;
    }

    public /* synthetic */ setTrackResource(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
