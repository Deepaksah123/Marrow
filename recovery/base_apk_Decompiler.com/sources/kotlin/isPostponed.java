package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\r\u0010\bR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/isPostponed;", "Lo/prepareCallInternal;", "Lo/_initForReading;", "Lkotlin/Function1;", "Lo/onCreateContextMenu;", "Lo/onCreateView;", "p0", "<init>", "(Lo/getAnswerMap;)V", "", "c_", "()V", "MediaDescriptionCompat", "IconCompatParcelizer", "read", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Lo/onCreateContextMenu;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isPostponed extends prepareCallInternal {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public onCreateContextMenu write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getAnswerMap<? super onCreateContextMenu, ? extends onCreateView> RemoteActionCompatParcelizer;

    public isPostponed(getAnswerMap<? super onCreateContextMenu, ? extends onCreateView> getanswermap) {
        super(onDestroy.write());
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    @Override // kotlin.initLifecycle, o._handleOddName.IconCompatParcelizer
    public final void c_() {
        View viewRemoteActionCompatParcelizer = C0217version.RemoteActionCompatParcelizer(this);
        onCreateContextMenu oncreatecontextmenuIconCompatParcelizer = onCreateContextMenu.INSTANCE.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
        oncreatecontextmenuIconCompatParcelizer.write(viewRemoteActionCompatParcelizer);
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.invoke(oncreatecontextmenuIconCompatParcelizer));
        this.write = oncreatecontextmenuIconCompatParcelizer;
        super.c_();
    }

    @Override // kotlin.initLifecycle, o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        View viewRemoteActionCompatParcelizer = C0217version.RemoteActionCompatParcelizer(this);
        onCreateContextMenu oncreatecontextmenu = this.write;
        if (oncreatecontextmenu != null) {
            oncreatecontextmenu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
        }
        super.MediaDescriptionCompat();
    }

    public final void IconCompatParcelizer(getAnswerMap<? super onCreateContextMenu, ? extends onCreateView> p0) {
        if (this.RemoteActionCompatParcelizer != p0) {
            this.RemoteActionCompatParcelizer = p0;
            onCreateContextMenu oncreatecontextmenu = this.write;
            if (oncreatecontextmenu != null) {
                AudioAttributesCompatParcelizer(p0.invoke(oncreatecontextmenu));
            }
        }
    }
}
