package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getCourse_id extends setMsFixedDuration {
    private int write;

    public getCourse_id() {
        this.write = -1;
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public getCourse_id(LottieRatingBar lottieRatingBar) {
        super(lottieRatingBar);
        this.write = -1;
    }

    public getCourse_id(setHtmlLoadListener sethtmlloadlistener) {
        super(sethtmlloadlistener);
        this.write = -1;
    }

    getCourse_id(LottieRatingBar[] lottieRatingBarArr) {
        super(lottieRatingBarArr, false);
        this.write = -1;
    }

    private int MediaMetadataCompat() throws IOException {
        if (this.write < 0) {
            int length = this.RemoteActionCompatParcelizer.length;
            int iWrite = 0;
            for (int i = 0; i < length; i++) {
                iWrite += this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver().write(true);
            }
            this.write = iWrite;
        }
        return this.write;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 48);
        PaginatedSyncTask paginatedSyncTaskWrite = setminimumwidthmargin.write();
        int length = this.RemoteActionCompatParcelizer.length;
        int i = 0;
        if (this.write >= 0 || length > 16) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(MediaMetadataCompat());
            while (i < length) {
                paginatedSyncTaskWrite.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer());
                i++;
            }
            return;
        }
        setMsDelay[] setmsdelayArr = new setMsDelay[length];
        int iWrite = 0;
        for (int i2 = 0; i2 < length; i2++) {
            setMsDelay setmsdelayMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer[i2].AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver();
            setmsdelayArr[i2] = setmsdelayMediaBrowserCompatItemReceiver;
            iWrite += setmsdelayMediaBrowserCompatItemReceiver.write(true);
        }
        this.write = iWrite;
        setminimumwidthmargin.RemoteActionCompatParcelizer(iWrite);
        while (i < length) {
            paginatedSyncTaskWrite.RemoteActionCompatParcelizer(setmsdelayArr[i]);
            i++;
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, MediaMetadataCompat());
    }

    @Override // kotlin.setMsFixedDuration
    final InteractivePanelTextView AudioAttributesImplBaseParcelizer() {
        return new setNetworkObserver(DeletedDownloadExceptionCompanion.write(read()));
    }

    @Override // kotlin.setMsFixedDuration
    final LottieRatingBarBig AudioAttributesImplApi21Parcelizer() {
        return new getEventBus(this);
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
