package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\n\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011R\u0014\u0010\u000f\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t"}, d2 = {"Lo/performOptionsMenuClosed;", "Lo/onAbandon;", "Lo/setSharedElementReturnTransition;", "p0", "", "p1", "<init>", "(Lo/setSharedElementReturnTransition;I)V", "read", "()I", "AudioAttributesCompatParcelizer", "Lo/setSharedElementReturnTransition;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "I", "write", "", "()Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class performOptionsMenuClosed implements onAbandon {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setSharedElementReturnTransition IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    public performOptionsMenuClosed(setSharedElementReturnTransition setsharedelementreturntransition, int i) {
        this.IconCompatParcelizer = setsharedelementreturntransition;
        this.read = i;
    }

    @Override // kotlin.onAbandon
    public final int write() {
        return this.IconCompatParcelizer.MediaDescriptionCompat().getMediaMetadataCompat();
    }

    @Override // kotlin.onAbandon
    public final boolean IconCompatParcelizer() {
        return !this.IconCompatParcelizer.MediaDescriptionCompat().AudioAttributesImplBaseParcelizer().isEmpty();
    }

    @Override // kotlin.onAbandon
    public final int RemoteActionCompatParcelizer() {
        return Math.max(0, this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer() - this.read);
    }

    @Override // kotlin.onAbandon
    public final int AudioAttributesCompatParcelizer() {
        return Math.min(write() - 1, ((performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.IconCompatParcelizer.MediaDescriptionCompat().AudioAttributesImplBaseParcelizer())).getIconCompatParcelizer() + this.read);
    }

    @Override // kotlin.onAbandon
    public final int read() {
        if (this.IconCompatParcelizer.MediaDescriptionCompat().AudioAttributesImplBaseParcelizer().isEmpty()) {
            return 0;
        }
        int i = copyRootViewBounds.read(this.IconCompatParcelizer.MediaDescriptionCompat());
        int iIconCompatParcelizer = requireHost.IconCompatParcelizer(this.IconCompatParcelizer.MediaDescriptionCompat());
        if (iIconCompatParcelizer == 0) {
            return 1;
        }
        return getQues.write(i / iIconCompatParcelizer, 1);
    }
}
