package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecoderInfosSoftMatch implements MarrowVideoDownloadException {
    private final long AudioAttributesCompatParcelizer;
    private final avcLevelToMaxFrameSize IconCompatParcelizer;
    private final Timer read;
    private final MarrowVideoDownloadException write;

    public getDecoderInfosSoftMatch(MarrowVideoDownloadException marrowVideoDownloadException, sortByScore sortbyscore, Timer timer, long j) {
        this.write = marrowVideoDownloadException;
        this.IconCompatParcelizer = avcLevelToMaxFrameSize.write(sortbyscore);
        this.AudioAttributesCompatParcelizer = j;
        this.read = timer;
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, IOException iOException) {
        ThemeKtExternalSyntheticLambda0 originalRequest = todownloadinfo.getOriginalRequest();
        if (originalRequest != null) {
            ThemeAlphaConstantsKt url = originalRequest.getUrl();
            if (url != null) {
                this.IconCompatParcelizer.IconCompatParcelizer(url.onCommand().toString());
            }
            if (originalRequest.getMethod() != null) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(originalRequest.getMethod());
            }
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.read.AudioAttributesCompatParcelizer());
        getDecoderInfosSortedByFormatSupport.read(this.IconCompatParcelizer);
        this.write.read(todownloadinfo, iOException);
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, C0156TypeKt c0156TypeKt) throws IOException {
        dolbyVisionStringToProfile.AudioAttributesCompatParcelizer(c0156TypeKt, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read.AudioAttributesCompatParcelizer());
        this.write.read(todownloadinfo, c0156TypeKt);
    }
}
