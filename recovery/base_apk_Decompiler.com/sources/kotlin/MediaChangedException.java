package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaChangedException implements setOnRatingBarChangedListener {
    private VideoPlayerExceptionNoInternetException RemoteActionCompatParcelizer;
    private setScrollEndListener read;

    MediaChangedException(setScrollEndListener setscrollendlistener) {
        this.read = setscrollendlistener;
    }

    static DeletedDownloadExceptionCompanion RemoteActionCompatParcelizer(setScrollEndListener setscrollendlistener) throws IOException {
        VideoPlayerExceptionNoInternetException videoPlayerExceptionNoInternetException = new VideoPlayerExceptionNoInternetException(setscrollendlistener);
        return new DeletedDownloadExceptionCompanion(CustomModuleLSModelKt.IconCompatParcelizer(videoPlayerExceptionNoInternetException), videoPlayerExceptionNoInternetException.IconCompatParcelizer());
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final InputStream RemoteActionCompatParcelizer() throws IOException {
        VideoPlayerExceptionNoInternetException videoPlayerExceptionNoInternetException = new VideoPlayerExceptionNoInternetException(this.read);
        this.RemoteActionCompatParcelizer = videoPlayerExceptionNoInternetException;
        return videoPlayerExceptionNoInternetException;
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return RemoteActionCompatParcelizer(this.read);
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final int read() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        try {
            return AudioAttributesCompatParcelizer();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("IOException converting stream to byte array: ");
            sb.append(e.getMessage());
            throw new setHideRunner(sb.toString(), e);
        }
    }
}
