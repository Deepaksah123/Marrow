package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutinesScopesModule implements setMoveRunner {
    private ResetBookmarkRequestBody read;

    CoroutinesScopesModule(ResetBookmarkRequestBody resetBookmarkRequestBody) {
        this.read = resetBookmarkRequestBody;
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return new EmptyBody(this.read.write());
    }

    @Override // kotlin.setMoveRunner
    public final InputStream RemoteActionCompatParcelizer() {
        return this.read;
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
