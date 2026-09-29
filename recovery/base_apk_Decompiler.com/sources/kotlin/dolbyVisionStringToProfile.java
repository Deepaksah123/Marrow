package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class dolbyVisionStringToProfile {
    public static C0156TypeKt read(toDownloadInfo todownloadinfo) throws IOException {
        avcLevelToMaxFrameSize avcleveltomaxframesizeWrite = avcLevelToMaxFrameSize.write(sortByScore.read());
        Timer timer = new Timer();
        long jWrite = timer.write();
        try {
            C0156TypeKt c0156TypeKtWrite = todownloadinfo.write();
            AudioAttributesCompatParcelizer(c0156TypeKtWrite, avcleveltomaxframesizeWrite, jWrite, timer.AudioAttributesCompatParcelizer());
            return c0156TypeKtWrite;
        } catch (IOException e) {
            ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0AudioAttributesCompatParcelizer = todownloadinfo.getOriginalRequest();
            if (themeKtExternalSyntheticLambda0AudioAttributesCompatParcelizer != null) {
                ThemeAlphaConstantsKt url = themeKtExternalSyntheticLambda0AudioAttributesCompatParcelizer.getUrl();
                if (url != null) {
                    avcleveltomaxframesizeWrite.IconCompatParcelizer(url.onCommand().toString());
                }
                if (themeKtExternalSyntheticLambda0AudioAttributesCompatParcelizer.getMethod() != null) {
                    avcleveltomaxframesizeWrite.AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda0AudioAttributesCompatParcelizer.getMethod());
                }
            }
            avcleveltomaxframesizeWrite.AudioAttributesCompatParcelizer(jWrite);
            avcleveltomaxframesizeWrite.RemoteActionCompatParcelizer(timer.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(avcleveltomaxframesizeWrite);
            throw e;
        }
    }

    public static void read(toDownloadInfo todownloadinfo, MarrowVideoDownloadException marrowVideoDownloadException) {
        Timer timer = new Timer();
        todownloadinfo.IconCompatParcelizer(new getDecoderInfosSoftMatch(marrowVideoDownloadException, sortByScore.read(), timer, timer.write()));
    }

    static void AudioAttributesCompatParcelizer(C0156TypeKt c0156TypeKt, avcLevelToMaxFrameSize avcleveltomaxframesize, long j, long j2) throws IOException {
        ThemeKtExternalSyntheticLambda0 request = c0156TypeKt.getRequest();
        if (request == null) {
            return;
        }
        avcleveltomaxframesize.IconCompatParcelizer(request.getUrl().onCommand().toString());
        avcleveltomaxframesize.AudioAttributesCompatParcelizer(request.getMethod());
        if (request.getBody() != null) {
            long jContentLength = request.getBody().contentLength();
            if (jContentLength != -1) {
                avcleveltomaxframesize.write(jContentLength);
            }
        }
        ActivityAdapterModule body = c0156TypeKt.getBody();
        if (body != null) {
            long j3 = body.read();
            if (j3 != -1) {
                avcleveltomaxframesize.read(j3);
            }
            MediaType mediaTypeWrite = body.write();
            if (mediaTypeWrite != null) {
                avcleveltomaxframesize.read(mediaTypeWrite.toString());
            }
        }
        avcleveltomaxframesize.IconCompatParcelizer(c0156TypeKt.getCode());
        avcleveltomaxframesize.AudioAttributesCompatParcelizer(j);
        avcleveltomaxframesize.RemoteActionCompatParcelizer(j2);
        avcleveltomaxframesize.RemoteActionCompatParcelizer();
    }
}
