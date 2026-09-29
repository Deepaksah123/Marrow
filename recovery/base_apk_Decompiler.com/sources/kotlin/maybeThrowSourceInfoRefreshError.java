package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u000f"}, d2 = {"Lo/maybeThrowSourceInfoRefreshError;", "Lo/MotionTelltales;", "Lo/ApicFrame;", "p0", "p1", "<init>", "(Lo/ApicFrame;Lo/MotionTelltales;)V", "", "p2", "AudioAttributesCompatParcelizer", "(FFF)F", "write", "(F)F", "read", "Lo/ApicFrame;", "Lo/MotionTelltales;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class maybeThrowSourceInfoRefreshError implements MotionTelltales {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final MotionTelltales RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ApicFrame write;

    public maybeThrowSourceInfoRefreshError(ApicFrame apicFrame, MotionTelltales motionTelltales) {
        this.write = apicFrame;
        this.RemoteActionCompatParcelizer = motionTelltales;
    }

    @Override // kotlin.MotionTelltales
    public final float AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
        float fAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
        float f = p0 + p1;
        boolean z = p0 <= BitmapDescriptorFactory.HUE_RED ? f <= BitmapDescriptorFactory.HUE_RED : f > p2;
        if (Math.abs(fAudioAttributesCompatParcelizer) != BitmapDescriptorFactory.HUE_RED && z) {
            return write(fAudioAttributesCompatParcelizer);
        }
        if (Math.abs(this.write.getAudioAttributesImplApi21Parcelizer()) < 1.0E-6d) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float fOnPause = -this.write.getAudioAttributesImplApi21Parcelizer();
        if (this.write.handleMediaPlayPauseIfPendingOnHandler()) {
            fOnPause += this.write.onPause();
        }
        return getQues.read(fOnPause, -p2, p2);
    }

    private final float write(float p0) {
        float fOnPause = -this.write.getAudioAttributesImplApi21Parcelizer();
        while (p0 > BitmapDescriptorFactory.HUE_RED && fOnPause < p0) {
            fOnPause += this.write.onPause();
        }
        while (p0 < BitmapDescriptorFactory.HUE_RED && fOnPause > p0) {
            fOnPause -= this.write.onPause();
        }
        return fOnPause;
    }
}
