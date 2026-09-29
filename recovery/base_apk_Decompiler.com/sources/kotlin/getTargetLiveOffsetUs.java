package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\b\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t"}, d2 = {"Lo/getTargetLiveOffsetUs;", "Lo/onAbandon;", "Lo/ApicFrame;", "p0", "", "p1", "<init>", "(Lo/ApicFrame;I)V", "read", "()I", "IconCompatParcelizer", "Lo/ApicFrame;", "I", "AudioAttributesCompatParcelizer", "write", "", "()Z", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTargetLiveOffsetUs implements onAbandon {
    private final ApicFrame IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public getTargetLiveOffsetUs(ApicFrame apicFrame, int i) {
        this.IconCompatParcelizer = apicFrame;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.onAbandon
    public final int write() {
        return this.IconCompatParcelizer.write();
    }

    @Override // kotlin.onAbandon
    public final boolean IconCompatParcelizer() {
        return !this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat().isEmpty();
    }

    @Override // kotlin.onAbandon
    public final int RemoteActionCompatParcelizer() {
        return Math.max(0, this.IconCompatParcelizer.getAudioAttributesImplBaseParcelizer() - this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.onAbandon
    public final int AudioAttributesCompatParcelizer() {
        return Math.min(write() - 1, ((createPeriod) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat())).getWrite() + this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.onAbandon
    public final int read() {
        if (this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat().size() == 0) {
            return 0;
        }
        int iAudioAttributesCompatParcelizer = enableInternal.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        int audioAttributesCompatParcelizer = this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getAudioAttributesCompatParcelizer() + this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getRemoteActionCompatParcelizer();
        if (audioAttributesCompatParcelizer == 0) {
            return 1;
        }
        return getQues.write(iAudioAttributesCompatParcelizer / audioAttributesCompatParcelizer, 1);
    }
}
