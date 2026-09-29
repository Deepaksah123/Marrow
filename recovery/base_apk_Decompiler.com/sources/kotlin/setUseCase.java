package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class setUseCase implements setOnRatingBarChangedListener {
    private final ResetBookmarkRequestBody AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer = 0;

    setUseCase(ResetBookmarkRequestBody resetBookmarkRequestBody) {
        this.AudioAttributesCompatParcelizer = resetBookmarkRequestBody;
    }

    private InputStream write() throws IOException {
        int iIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        if (iIconCompatParcelizer <= 0) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i = this.AudioAttributesCompatParcelizer.read();
        this.RemoteActionCompatParcelizer = i;
        if (i > 0) {
            if (iIconCompatParcelizer < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final InputStream RemoteActionCompatParcelizer() throws IOException {
        return write();
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return InteractivePanelTextView.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write());
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final int read() {
        return this.RemoteActionCompatParcelizer;
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
