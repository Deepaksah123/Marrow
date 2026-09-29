package kotlin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setIsTablet extends setMsDelay implements setMoveRunner {
    static final setScaleType IconCompatParcelizer = new setScaleType(setIsTablet.class) { // from class: o.setIsTablet.4
        @Override // kotlin.setScaleType
        final setMsDelay read(EmptyBody emptyBody) {
            return emptyBody;
        }

        @Override // kotlin.setScaleType
        final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
            return setmsfixedduration.RatingCompat();
        }
    };
    static final byte[] read = new byte[0];
    byte[] RemoteActionCompatParcelizer;

    public setIsTablet(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.RemoteActionCompatParcelizer = bArr;
    }

    static setIsTablet AudioAttributesCompatParcelizer(byte[] bArr) {
        return new EmptyBody(bArr);
    }

    public static setIsTablet AudioAttributesCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof setIsTablet)) {
            return (setIsTablet) obj;
        }
        if (obj instanceof LottieRatingBar) {
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = ((LottieRatingBar) obj).AudioAttributesImplApi26Parcelizer();
            if (setmsdelayAudioAttributesImplApi26Parcelizer instanceof setIsTablet) {
                return (setIsTablet) setmsdelayAudioAttributesImplApi26Parcelizer;
            }
        }
        StringBuilder sb = new StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static setIsTablet write(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        return (setIsTablet) IconCompatParcelizer.IconCompatParcelizer(zoomableLinearLayoutManager, false);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setIsTablet) {
            return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer, ((setIsTablet) setmsdelay).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.setMoveRunner
    public final InputStream RemoteActionCompatParcelizer() {
        return new ByteArrayInputStream(this.RemoteActionCompatParcelizer);
    }

    public final byte[] read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(read());
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new EmptyBody(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new EmptyBody(this.RemoteActionCompatParcelizer);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("#");
        sb.append(ShareCopyRSModel.RemoteActionCompatParcelizer(getShortDescription.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer)));
        return sb.toString();
    }
}
