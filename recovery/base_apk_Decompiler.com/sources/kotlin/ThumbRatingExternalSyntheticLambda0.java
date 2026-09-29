package kotlin;

import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00198CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u000f\u0010\u0013"}, d2 = {"Lo/ThumbRatingExternalSyntheticLambda0;", "Lo/StreamVolumeManagerVolumeChangeReceiver;", "", "p0", "Lo/RendererWakeupListener;", "p1", "", "p2", "<init>", "(ZLo/RendererWakeupListener;Ljava/lang/String;)V", "Lo/lambdaonReceive0;", "Lo/Timeline;", "read", "(Lo/lambdaonReceive0;)Lo/Timeline;", "Ljavax/net/ssl/HttpsURLConnection;", "IconCompatParcelizer", "(Lo/lambdaonReceive0;)Ljavax/net/ssl/HttpsURLConnection;", "Ljavax/net/ssl/SSLContext;", "RemoteActionCompatParcelizer", "()Ljavax/net/ssl/SSLContext;", "AudioAttributesCompatParcelizer", "Z", "Lo/RendererWakeupListener;", "Ljava/lang/String;", "write", "Ljavax/net/ssl/SSLSocketFactory;", "Lo/RenewEligible;", "()Ljavax/net/ssl/SSLSocketFactory;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThumbRatingExternalSyntheticLambda0 implements StreamVolumeManagerVolumeChangeReceiver {
    public boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;
    private final RendererWakeupListener read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    public ThumbRatingExternalSyntheticLambda0(boolean z, RendererWakeupListener rendererWakeupListener, String str) {
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = z;
        this.read = rendererWakeupListener;
        this.write = str;
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.fromBundleListRetriever
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ThumbRatingExternalSyntheticLambda0.RemoteActionCompatParcelizer(this.write);
            }
        });
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.isThumbsUp
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ThumbRatingExternalSyntheticLambda0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private final SSLSocketFactory write() {
        return (SSLSocketFactory) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SSLSocketFactory RemoteActionCompatParcelizer(ThumbRatingExternalSyntheticLambda0 thumbRatingExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(thumbRatingExternalSyntheticLambda0, "");
        try {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            SSLContext sSLContextIconCompatParcelizer = thumbRatingExternalSyntheticLambda0.IconCompatParcelizer();
            if (sSLContextIconCompatParcelizer != null) {
                return sSLContextIconCompatParcelizer.getSocketFactory();
            }
            return null;
        } catch (Exception e) {
            RendererWakeupListener.AudioAttributesImplBaseParcelizer();
            return null;
        }
    }

    private final SSLContext IconCompatParcelizer() {
        return (SSLContext) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SSLContext IconCompatParcelizer(ThumbRatingExternalSyntheticLambda0 thumbRatingExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(thumbRatingExternalSyntheticLambda0, "");
        return RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, javax.net.ssl.HttpsURLConnection] */
    @Override // kotlin.StreamVolumeManagerVolumeChangeReceiver
    public final Timeline read(lambdaonReceive0 p0) {
        Timeline timeline;
        toMagicModuleMetaRepoModel.write(p0, "");
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        try {
            try {
                TrafficStats.setThreadStatsTag(17);
                writeVar.write = IconCompatParcelizer(p0);
                RendererWakeupListener rendererWakeupListener = this.read;
                String str = this.write;
                StringBuilder sb = new StringBuilder("Sending request to: ");
                sb.append(p0.IconCompatParcelizer());
                rendererWakeupListener.IconCompatParcelizer(str, sb.toString());
                int responseCode = ((HttpsURLConnection) writeVar.write).getResponseCode();
                Map<String, List<String>> headerFields = ((HttpsURLConnection) writeVar.write).getHeaderFields();
                getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.r8lambdaNGYAVvH1DGQT2uzFd9G1CZ35pM
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return ThumbRatingExternalSyntheticLambda0.write(writeVar);
                    }
                };
                if (responseCode == 200) {
                    toMagicModuleMetaRepoModel.write(headerFields);
                    timeline = new Timeline(p0, responseCode, headerFields, ((HttpsURLConnection) writeVar.write).getInputStream(), getcreatedondatems);
                } else {
                    toMagicModuleMetaRepoModel.write(headerFields);
                    timeline = new Timeline(p0, responseCode, headerFields, ((HttpsURLConnection) writeVar.write).getErrorStream(), getcreatedondatems);
                }
                return timeline;
            } catch (Exception e) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) writeVar.write;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw e;
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup write(MagicModuleUseCaseImplWhenMappings.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        ((HttpsURLConnection) writeVar.write).disconnect();
        return getShowPopup.INSTANCE;
    }

    private final HttpsURLConnection IconCompatParcelizer(lambdaonReceive0 p0) throws IOException {
        URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(p0.IconCompatParcelizer().toString()).openConnection());
        toMagicModuleMetaRepoModel.read(uRLConnection, "");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        for (Map.Entry<String, String> entry : p0.read().entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.AudioAttributesCompatParcelizer && IconCompatParcelizer() != null) {
            httpsURLConnection.setSSLSocketFactory(write());
        }
        if (p0.AudioAttributesCompatParcelizer() == null) {
            return httpsURLConnection;
        }
        httpsURLConnection.setDoOutput(true);
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            byte[] bytes = p0.AudioAttributesCompatParcelizer().getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            outputStream.write(bytes);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(outputStream, null);
            return httpsURLConnection;
        } finally {
        }
    }

    private static SSLContext RemoteActionCompatParcelizer() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            ClassLoader classLoader = keyStore.getClass().getClassLoader();
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(classLoader != null ? classLoader.getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer") : null));
            toMagicModuleMetaRepoModel.read(certificateGenerateCertificate, "");
            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateGenerateCertificate);
            trustManagerFactory.init(keyStore);
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return sSLContext;
        } catch (Exception e) {
            RendererWakeupListener.MediaDescriptionCompat();
            return null;
        }
    }
}
