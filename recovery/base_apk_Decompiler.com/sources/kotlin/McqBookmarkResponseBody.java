package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class McqBookmarkResponseBody extends ResponsiveScrollView {
    private int IconCompatParcelizer;

    public McqBookmarkResponseBody() {
        this.IconCompatParcelizer = -1;
    }

    @Override // kotlin.ResponsiveScrollView, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public McqBookmarkResponseBody(setHtmlLoadListener sethtmlloadlistener) {
        super(sethtmlloadlistener);
        this.IconCompatParcelizer = -1;
    }

    McqBookmarkResponseBody(LottieRatingBar[] lottieRatingBarArr) {
        super(false, lottieRatingBarArr);
        this.IconCompatParcelizer = -1;
    }

    McqBookmarkResponseBody(LottieRatingBar[] lottieRatingBarArr, LottieRatingBar[] lottieRatingBarArr2) {
        super(lottieRatingBarArr, lottieRatingBarArr2);
        this.IconCompatParcelizer = -1;
    }

    private int RemoteActionCompatParcelizer() throws IOException {
        if (this.IconCompatParcelizer < 0) {
            int length = this.read.length;
            int iWrite = 0;
            for (int i = 0; i < length; i++) {
                iWrite += this.read[i].AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver().write(true);
            }
            this.IconCompatParcelizer = iWrite;
        }
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 49);
        PaginatedSyncTask paginatedSyncTaskWrite = setminimumwidthmargin.write();
        int length = this.read.length;
        int i = 0;
        if (this.IconCompatParcelizer >= 0 || length > 16) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer());
            while (i < length) {
                paginatedSyncTaskWrite.RemoteActionCompatParcelizer(this.read[i].AudioAttributesImplApi26Parcelizer());
                i++;
            }
            return;
        }
        setMsDelay[] setmsdelayArr = new setMsDelay[length];
        int iWrite = 0;
        for (int i2 = 0; i2 < length; i2++) {
            setMsDelay setmsdelayMediaBrowserCompatItemReceiver = this.read[i2].AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver();
            setmsdelayArr[i2] = setmsdelayMediaBrowserCompatItemReceiver;
            iWrite += setmsdelayMediaBrowserCompatItemReceiver.write(true);
        }
        this.IconCompatParcelizer = iWrite;
        setminimumwidthmargin.RemoteActionCompatParcelizer(iWrite);
        while (i < length) {
            paginatedSyncTaskWrite.RemoteActionCompatParcelizer(setmsdelayArr[i]);
            i++;
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, RemoteActionCompatParcelizer());
    }
}
