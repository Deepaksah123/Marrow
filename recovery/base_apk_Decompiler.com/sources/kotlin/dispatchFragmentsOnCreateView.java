package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b"}, d2 = {"Lo/dispatchFragmentsOnCreateView;", "Lo/onAbandon;", "Lo/onActivityPostCreated;", "p0", "<init>", "(Lo/onActivityPostCreated;)V", "", "read", "()I", "IconCompatParcelizer", "Lo/onActivityPostCreated;", "RemoteActionCompatParcelizer", "write", "", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dispatchFragmentsOnCreateView implements onAbandon {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final onActivityPostCreated RemoteActionCompatParcelizer;

    public dispatchFragmentsOnCreateView(onActivityPostCreated onactivitypostcreated) {
        this.RemoteActionCompatParcelizer = onactivitypostcreated;
    }

    @Override // kotlin.onAbandon
    public final int write() {
        return this.RemoteActionCompatParcelizer.RatingCompat().getOnAddQueueItem();
    }

    @Override // kotlin.onAbandon
    public final boolean IconCompatParcelizer() {
        return !this.RemoteActionCompatParcelizer.RatingCompat().AudioAttributesImplApi21Parcelizer().isEmpty();
    }

    @Override // kotlin.onAbandon
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.onAbandon
    public final int AudioAttributesCompatParcelizer() {
        return ((onResumeFragments) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.RemoteActionCompatParcelizer.RatingCompat().AudioAttributesImplApi21Parcelizer())).getIconCompatParcelizer();
    }

    @Override // kotlin.onAbandon
    public final int read() {
        if (this.RemoteActionCompatParcelizer.RatingCompat().AudioAttributesImplApi21Parcelizer().isEmpty()) {
            return 0;
        }
        int iRemoteActionCompatParcelizer = onPopulateAccessibilityEvent.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.RatingCompat());
        int i = FragmentState.read(this.RemoteActionCompatParcelizer.RatingCompat());
        if (i == 0) {
            return 1;
        }
        return getQues.write(iRemoteActionCompatParcelizer / i, 1);
    }
}
