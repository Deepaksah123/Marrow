package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setCode extends setMsFixedDuration {
    private int write;

    public setCode() {
        this.write = -1;
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public setCode(LottieRatingBar lottieRatingBar) {
        super(lottieRatingBar);
        this.write = -1;
    }

    public setCode(setHtmlLoadListener sethtmlloadlistener) {
        super(sethtmlloadlistener);
        this.write = -1;
    }

    setCode(LottieRatingBar[] lottieRatingBarArr) {
        super(lottieRatingBarArr, false);
        this.write = -1;
    }

    private int MediaBrowserCompatMediaItem() throws IOException {
        if (this.write < 0) {
            int length = this.RemoteActionCompatParcelizer.length;
            int iWrite = 0;
            for (int i = 0; i < length; i++) {
                iWrite += this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().write(true);
            }
            this.write = iWrite;
        }
        return this.write;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 48);
        VideoDownloadFGService videoDownloadFGService = setminimumwidthmargin.read();
        int length = this.RemoteActionCompatParcelizer.length;
        int i = 0;
        if (this.write >= 0 || length > 16) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem());
            while (i < length) {
                this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer(videoDownloadFGService, true);
                i++;
            }
            return;
        }
        setMsDelay[] setmsdelayArr = new setMsDelay[length];
        int iWrite = 0;
        for (int i2 = 0; i2 < length; i2++) {
            setMsDelay setmsdelayIconCompatParcelizer = this.RemoteActionCompatParcelizer[i2].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
            setmsdelayArr[i2] = setmsdelayIconCompatParcelizer;
            iWrite += setmsdelayIconCompatParcelizer.write(true);
        }
        this.write = iWrite;
        setminimumwidthmargin.RemoteActionCompatParcelizer(iWrite);
        while (i < length) {
            setmsdelayArr[i].RemoteActionCompatParcelizer(videoDownloadFGService, true);
            i++;
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, MediaBrowserCompatMediaItem());
    }

    @Override // kotlin.setMsFixedDuration
    final InteractivePanelTextView AudioAttributesImplBaseParcelizer() {
        return new isSuppressed(DeletedDownloadExceptionCompanion.write(read()));
    }

    @Override // kotlin.setMsFixedDuration
    final LottieRatingBarBig AudioAttributesImplApi21Parcelizer() {
        return new TemporarySessionResponseBody(this);
    }

    @Override // kotlin.setMsFixedDuration
    final setIsTablet RatingCompat() {
        return new EmptyBody(MarrowFileException.write(AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.setMsFixedDuration
    final ResponsiveScrollView MediaBrowserCompatSearchResultReceiver() {
        return new McqBookmarkResponseBody(MediaDescriptionCompat());
    }
}
