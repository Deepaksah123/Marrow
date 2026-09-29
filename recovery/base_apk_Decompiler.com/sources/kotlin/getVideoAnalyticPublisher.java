package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoAnalyticPublisher extends ZoomableLinearLayoutManager {
    getVideoAnalyticPublisher(int i, int i2, int i3, LottieRatingBar lottieRatingBar) {
        super(i, i2, i3, lottieRatingBar);
    }

    @Override // kotlin.ZoomableLinearLayoutManager, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.ZoomableLinearLayoutManager, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public getVideoAnalyticPublisher(boolean z, int i, LottieRatingBar lottieRatingBar) {
        super(z, i, lottieRatingBar);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setMsDelay setmsdelayIconCompatParcelizer = this.write.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        if (z) {
            int i = this.AudioAttributesCompatParcelizer;
            if (zMediaDescriptionCompat || setmsdelayIconCompatParcelizer.write()) {
                i |= 32;
            }
            setminimumwidthmargin.IconCompatParcelizer(i, this.read);
        }
        if (zMediaDescriptionCompat) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(setmsdelayIconCompatParcelizer.write(true));
        }
        setmsdelayIconCompatParcelizer.RemoteActionCompatParcelizer(setminimumwidthmargin.read(), zMediaDescriptionCompat);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return MediaDescriptionCompat() || this.write.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().write();
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        setMsDelay setmsdelayIconCompatParcelizer = this.write.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        int iWrite = setmsdelayIconCompatParcelizer.write(zMediaDescriptionCompat);
        if (zMediaDescriptionCompat) {
            iWrite += setMinimumWidthMargin.IconCompatParcelizer(iWrite);
        }
        return iWrite + (z ? setMinimumWidthMargin.read(this.read) : 0);
    }

    @Override // kotlin.ZoomableLinearLayoutManager
    final setMsFixedDuration write(setMsDelay setmsdelay) {
        return new setCode(setmsdelay);
    }
}
