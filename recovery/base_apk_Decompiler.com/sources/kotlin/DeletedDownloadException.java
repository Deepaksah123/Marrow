package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class DeletedDownloadException implements setMoveRunner {
    private setScrollEndListener read;

    DeletedDownloadException(setScrollEndListener setscrollendlistener) {
        this.read = setscrollendlistener;
    }

    static MarrowFileException AudioAttributesCompatParcelizer(setScrollEndListener setscrollendlistener) throws IOException {
        return new MarrowFileException(CustomModuleLSModelKt.IconCompatParcelizer(new VideoPlayerExceptionInternalPlaybackException(setscrollendlistener)));
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return AudioAttributesCompatParcelizer(this.read);
    }

    @Override // kotlin.setMoveRunner
    public final InputStream RemoteActionCompatParcelizer() {
        return new VideoPlayerExceptionInternalPlaybackException(this.read);
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
