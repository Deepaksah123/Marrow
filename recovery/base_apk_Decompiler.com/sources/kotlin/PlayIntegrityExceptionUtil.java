package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayIntegrityExceptionUtil extends ResponsiveScrollView {
    public PlayIntegrityExceptionUtil() {
    }

    public PlayIntegrityExceptionUtil(setHtmlLoadListener sethtmlloadlistener) {
        super(sethtmlloadlistener);
    }

    PlayIntegrityExceptionUtil(LottieRatingBar[] lottieRatingBarArr) {
        super(false, lottieRatingBarArr);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 49, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        int iWrite = z ? 4 : 3;
        int length = this.read.length;
        for (int i = 0; i < length; i++) {
            iWrite += this.read[i].AudioAttributesImplApi26Parcelizer().write(true);
        }
        return iWrite;
    }
}
