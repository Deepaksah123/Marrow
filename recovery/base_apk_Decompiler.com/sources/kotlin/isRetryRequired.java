package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class isRetryRequired extends ZoomableLinearLayoutManager {
    isRetryRequired(int i, int i2, int i3, LottieRatingBar lottieRatingBar) {
        super(i, i2, i3, lottieRatingBar);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        if (z) {
            int i = this.AudioAttributesCompatParcelizer;
            if (zMediaDescriptionCompat || setmsdelayAudioAttributesImplApi26Parcelizer.write()) {
                i |= 32;
            }
            setminimumwidthmargin.IconCompatParcelizer(i, this.read);
        }
        if (!zMediaDescriptionCompat) {
            setmsdelayAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(setminimumwidthmargin, false);
            return;
        }
        setminimumwidthmargin.write(128);
        setmsdelayAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(setminimumwidthmargin, true);
        setminimumwidthmargin.write(0);
        setminimumwidthmargin.write(0);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return MediaDescriptionCompat() || this.write.AudioAttributesImplApi26Parcelizer().write();
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        boolean zMediaDescriptionCompat = MediaDescriptionCompat();
        int iWrite = setmsdelayAudioAttributesImplApi26Parcelizer.write(zMediaDescriptionCompat);
        if (zMediaDescriptionCompat) {
            iWrite += 3;
        }
        return iWrite + (z ? setMinimumWidthMargin.read(this.read) : 0);
    }

    @Override // kotlin.ZoomableLinearLayoutManager
    final setMsFixedDuration write(setMsDelay setmsdelay) {
        return new safeParam(setmsdelay);
    }
}
