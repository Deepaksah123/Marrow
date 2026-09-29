package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class safeParam extends setMsFixedDuration {
    public safeParam() {
    }

    public safeParam(LottieRatingBar lottieRatingBar) {
        super(lottieRatingBar);
    }

    public safeParam(setHtmlLoadListener sethtmlloadlistener) {
        super(sethtmlloadlistener);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 48, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        int iWrite = z ? 4 : 3;
        int length = this.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            iWrite += this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer().write(true);
        }
        return iWrite;
    }

    @Override // kotlin.setMsFixedDuration
    final InteractivePanelTextView AudioAttributesImplBaseParcelizer() {
        return new DeletedDownloadExceptionCompanion(read());
    }

    @Override // kotlin.setMsFixedDuration
    final LottieRatingBarBig AudioAttributesImplApi21Parcelizer() {
        return ((setMsFixedDuration) MediaBrowserCompatItemReceiver()).AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.setMsFixedDuration
    final setIsTablet RatingCompat() {
        return new MarrowFileException(AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.setMsFixedDuration
    final ResponsiveScrollView MediaBrowserCompatSearchResultReceiver() {
        return new PlayIntegrityExceptionUtil(MediaDescriptionCompat());
    }
}
