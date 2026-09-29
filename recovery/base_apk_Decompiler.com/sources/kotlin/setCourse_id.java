package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setCourse_id extends ZoomableLinearLayoutManager {
    setCourse_id(int i, int i2, int i3, LottieRatingBar lottieRatingBar) {
        super(i, i2, i3, lottieRatingBar);
    }

    @Override // kotlin.ZoomableLinearLayoutManager, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public setCourse_id(boolean z, int i, LottieRatingBar lottieRatingBar) {
        super(z, i, lottieRatingBar);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setMsDelay setmsdelayMediaBrowserCompatItemReceiver = this.write.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        if (z) {
            int i = this.AudioAttributesCompatParcelizer;
            if (zMediaDescriptionCompat || setmsdelayMediaBrowserCompatItemReceiver.write()) {
                i |= 32;
            }
            setminimumwidthmargin.IconCompatParcelizer(i, this.read);
        }
        if (zMediaDescriptionCompat) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(setmsdelayMediaBrowserCompatItemReceiver.write(true));
        }
        setmsdelayMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(setminimumwidthmargin.write(), zMediaDescriptionCompat);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return MediaDescriptionCompat() || this.write.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver().write();
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        setMsDelay setmsdelayMediaBrowserCompatItemReceiver = this.write.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        int iWrite = setmsdelayMediaBrowserCompatItemReceiver.write(zMediaDescriptionCompat);
        if (zMediaDescriptionCompat) {
            iWrite += setMinimumWidthMargin.IconCompatParcelizer(iWrite);
        }
        return iWrite + (z ? setMinimumWidthMargin.read(this.read) : 0);
    }

    @Override // kotlin.ZoomableLinearLayoutManager
    final setMsFixedDuration write(setMsDelay setmsdelay) {
        return new getCourse_id(setmsdelay);
    }
}
