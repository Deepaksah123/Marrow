package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.util.List;
import kotlin.C0156TypeKt;
import kotlin.MarrowTheme;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoConfigModule implements MarrowTheme {
    private final AppTheme IconCompatParcelizer;

    public VideoConfigModule(AppTheme appTheme) {
        toMagicModuleMetaRepoModel.write(appTheme, "");
        this.IconCompatParcelizer = appTheme;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        ActivityAdapterModule body;
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = themeKtExternalSyntheticLambda0IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        ThemeKtExternalSyntheticLambda2 body2 = themeKtExternalSyntheticLambda0IconCompatParcelizer.getBody();
        if (body2 != null) {
            MediaType iconCompatParcelizer = body2.getIconCompatParcelizer();
            if (iconCompatParcelizer != null) {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_TYPE, iconCompatParcelizer.toString());
            }
            long jContentLength = body2.contentLength();
            if (jContentLength == -1) {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Transfer-Encoding", "chunked");
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_LENGTH);
            } else {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Transfer-Encoding");
            }
        }
        if (themeKtExternalSyntheticLambda0IconCompatParcelizer.AudioAttributesCompatParcelizer("Host") == null) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Host", FirebaseDataModule.write(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl(), false));
        }
        if (themeKtExternalSyntheticLambda0IconCompatParcelizer.AudioAttributesCompatParcelizer(RtspHeaders.CONNECTION) == null) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONNECTION, "Keep-Alive");
        }
        boolean z = false;
        if (themeKtExternalSyntheticLambda0IconCompatParcelizer.AudioAttributesCompatParcelizer("Accept-Encoding") == null && themeKtExternalSyntheticLambda0IconCompatParcelizer.AudioAttributesCompatParcelizer(RtspHeaders.RANGE) == null) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Accept-Encoding", "gzip");
            z = true;
        }
        List<MarrowVideoDownloadExceptionCompanion> list = this.IconCompatParcelizer.read(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl());
        if (!list.isEmpty()) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Cookie", IconCompatParcelizer(list));
        }
        if (themeKtExternalSyntheticLambda0IconCompatParcelizer.AudioAttributesCompatParcelizer(RtspHeaders.USER_AGENT) == null) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.USER_AGENT, "okhttp/4.12.0");
        }
        C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizerMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
        FragmentProviderModule.RemoteActionCompatParcelizer(this.IconCompatParcelizer, themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl(), c0156TypeKtRemoteActionCompatParcelizer.getHeaders());
        C0156TypeKt.IconCompatParcelizer iconCompatParcelizer2 = c0156TypeKtRemoteActionCompatParcelizer.MediaDescriptionCompat().read(themeKtExternalSyntheticLambda0IconCompatParcelizer);
        if (z && TestGroupLSModel.read("gzip", C0156TypeKt.IconCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer, RtspHeaders.CONTENT_ENCODING), true) && FragmentProviderModule.write(c0156TypeKtRemoteActionCompatParcelizer) && (body = c0156TypeKtRemoteActionCompatParcelizer.getBody()) != null) {
            BookReferenceView bookReferenceView = new BookReferenceView(body.AudioAttributesCompatParcelizer());
            iconCompatParcelizer2.RemoteActionCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getHeaders().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_ENCODING).AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_LENGTH).AudioAttributesCompatParcelizer());
            iconCompatParcelizer2.write(new onPaymentError(C0156TypeKt.IconCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer, RtspHeaders.CONTENT_TYPE), -1L, CustomAppBarLayout.AudioAttributesCompatParcelizer(bookReferenceView)));
        }
        return iconCompatParcelizer2.IconCompatParcelizer();
    }

    private static String IconCompatParcelizer(List<MarrowVideoDownloadExceptionCompanion> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            MarrowVideoDownloadExceptionCompanion marrowVideoDownloadExceptionCompanion = (MarrowVideoDownloadExceptionCompanion) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(marrowVideoDownloadExceptionCompanion.getRead());
            sb.append('=');
            sb.append(marrowVideoDownloadExceptionCompanion.getAudioAttributesImplBaseParcelizer());
            i++;
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
