package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setErrorMessage extends ResponsiveScrollView {
    private int write;

    public setErrorMessage() {
        this.write = -1;
    }

    private static boolean read(boolean z) {
        return true;
    }

    @Override // kotlin.ResponsiveScrollView, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    setErrorMessage(LottieRatingBar[] lottieRatingBarArr) {
        super(read(true), lottieRatingBarArr);
        this.write = -1;
    }

    private int RemoteActionCompatParcelizer() throws IOException {
        if (this.write < 0) {
            int length = this.read.length;
            int iWrite = 0;
            for (int i = 0; i < length; i++) {
                iWrite += this.read[i].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().write(true);
            }
            this.write = iWrite;
        }
        return this.write;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 49);
        VideoDownloadFGService videoDownloadFGService = setminimumwidthmargin.read();
        int length = this.read.length;
        int i = 0;
        if (this.write >= 0 || length > 16) {
            setminimumwidthmargin.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer());
            while (i < length) {
                this.read[i].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer(videoDownloadFGService, true);
                i++;
            }
            return;
        }
        setMsDelay[] setmsdelayArr = new setMsDelay[length];
        int iWrite = 0;
        for (int i2 = 0; i2 < length; i2++) {
            setMsDelay setmsdelayIconCompatParcelizer = this.read[i2].AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
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
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, RemoteActionCompatParcelizer());
    }

    @Override // kotlin.ResponsiveScrollView, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != null ? this : super.IconCompatParcelizer();
    }
}
