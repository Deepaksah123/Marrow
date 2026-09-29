package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\r\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u001bJ\u001f\u0010\r\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\r\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e"}, d2 = {"Lo/UpgradePlanActivity;", "Lo/MarrowTheme;", "Lo/ThemeKtExternalSyntheticLambda3;", "p0", "<init>", "(Lo/ThemeKtExternalSyntheticLambda3;)V", "Lo/TypeKt;", "", "p1", "Lo/ThemeKtExternalSyntheticLambda0;", "IconCompatParcelizer", "(Lo/TypeKt;Ljava/lang/String;)Lo/ThemeKtExternalSyntheticLambda0;", "Lo/LicenseProviderModule;", "RemoteActionCompatParcelizer", "(Lo/TypeKt;Lo/LicenseProviderModule;)Lo/ThemeKtExternalSyntheticLambda0;", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "Ljava/io/IOException;", "", "read", "(Ljava/io/IOException;Z)Z", "Lo/PlaybackDrmModule;", "p2", "p3", "write", "(Ljava/io/IOException;Lo/PlaybackDrmModule;Lo/ThemeKtExternalSyntheticLambda0;Z)Z", "(Ljava/io/IOException;Lo/ThemeKtExternalSyntheticLambda0;)Z", "", "(Lo/TypeKt;I)I", "Lo/ThemeKtExternalSyntheticLambda3;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpgradePlanActivity implements MarrowTheme {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ThemeKtExternalSyntheticLambda3 write;

    public UpgradePlanActivity(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3, "");
        this.write = themeKtExternalSyntheticLambda3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r5 = r0;
        r0 = r1.getInterceptorScopedExchange();
        r8 = RemoteActionCompatParcelizer(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.getIsDuplex() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r1.MediaDescriptionCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r1.RemoteActionCompatParcelizer(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r0 = r8.getBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0.isOneShot() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r1.RemoteActionCompatParcelizer(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r0 = r5.getBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        kotlin.FirebaseDataModule.read(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r6 > 20) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r11 = new java.lang.StringBuilder();
        r11.append("Too many follow-up requests: ");
        r11.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        throw new java.net.ProtocolException(r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.MediaDescriptionCompat().IconCompatParcelizer(r5.MediaDescriptionCompat().write((kotlin.ActivityAdapterModule) null).IconCompatParcelizer()).IconCompatParcelizer();
     */
    @Override // kotlin.MarrowTheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C0156TypeKt AudioAttributesCompatParcelizer(o.MarrowTheme.AudioAttributesCompatParcelizer r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UpgradePlanActivity.AudioAttributesCompatParcelizer(o.MarrowTheme$AudioAttributesCompatParcelizer):o.TypeKt");
    }

    private final boolean write(IOException p0, PlaybackDrmModule p1, ThemeKtExternalSyntheticLambda0 p2, boolean p3) {
        if (this.write.getRetryOnConnectionFailure()) {
            return !(p3 && RemoteActionCompatParcelizer(p0, p2)) && read(p0, p3) && p1.MediaBrowserCompatMediaItem();
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(IOException p0, ThemeKtExternalSyntheticLambda0 p1) {
        ThemeKtExternalSyntheticLambda2 body = p1.getBody();
        return (body != null && body.isOneShot()) || (p0 instanceof FileNotFoundException);
    }

    private static boolean read(IOException p0, boolean p1) {
        if (p0 instanceof ProtocolException) {
            return false;
        }
        return p0 instanceof InterruptedIOException ? (p0 instanceof SocketTimeoutException) && !p1 : (((p0 instanceof SSLHandshakeException) && (p0.getCause() instanceof CertificateException)) || (p0 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer(C0156TypeKt p0, LicenseProviderModule p1) throws IOException {
        VideoAnalyticModule connection;
        ActivityPresenterModule route = (p1 == null || (connection = p1.getConnection()) == null) ? null : connection.getRoute();
        int code = p0.getCode();
        String method = p0.getRequest().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.write.getAuthenticator().RemoteActionCompatParcelizer(route, p0);
            }
            if (code == 421) {
                ThemeKtExternalSyntheticLambda2 body = p0.getRequest().getBody();
                if ((body != null && body.isOneShot()) || p1 == null || !p1.AudioAttributesImplApi21Parcelizer()) {
                    return null;
                }
                p1.getConnection().MediaBrowserCompatCustomActionResultReceiver();
                return p0.getRequest();
            }
            if (code == 503) {
                C0156TypeKt priorResponse = p0.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && RemoteActionCompatParcelizer(p0, Integer.MAX_VALUE) == 0) {
                    return p0.getRequest();
                }
                return null;
            }
            if (code == 407) {
                toMagicModuleMetaRepoModel.write(route);
                if (route.getProxy().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.write.getProxyAuthenticator().RemoteActionCompatParcelizer(route, p0);
            }
            if (code == 408) {
                if (!this.write.getRetryOnConnectionFailure()) {
                    return null;
                }
                ThemeKtExternalSyntheticLambda2 body2 = p0.getRequest().getBody();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                C0156TypeKt priorResponse2 = p0.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && RemoteActionCompatParcelizer(p0, 0) <= 0) {
                    return p0.getRequest();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return IconCompatParcelizer(p0, method);
    }

    private final ThemeKtExternalSyntheticLambda0 IconCompatParcelizer(C0156TypeKt p0, String p1) {
        String strIconCompatParcelizer;
        ThemeAlphaConstantsKt themeAlphaConstantsKt;
        if (!this.write.getFollowRedirects() || (strIconCompatParcelizer = C0156TypeKt.IconCompatParcelizer(p0, RtspHeaders.LOCATION)) == null || (themeAlphaConstantsKt = p0.getRequest().getUrl().read(strIconCompatParcelizer)) == null) {
            return null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) themeAlphaConstantsKt.getScheme(), (Object) p0.getRequest().getUrl().getScheme()) && !this.write.getFollowSslRedirects()) {
            return null;
        }
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = p0.getRequest().MediaBrowserCompatItemReceiver();
        if (ServicePresenterModule.AudioAttributesCompatParcelizer(p1)) {
            int code = p0.getCode();
            ServicePresenterModule servicePresenterModule = ServicePresenterModule.INSTANCE;
            boolean z = ServicePresenterModule.IconCompatParcelizer(p1) || code == 308 || code == 307;
            ServicePresenterModule servicePresenterModule2 = ServicePresenterModule.INSTANCE;
            if (ServicePresenterModule.read(p1) && code != 308 && code != 307) {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("GET", (ThemeKtExternalSyntheticLambda2) null);
            } else {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p1, z ? p0.getRequest().getBody() : null);
            }
            if (!z) {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer("Transfer-Encoding");
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_LENGTH);
                iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.CONTENT_TYPE);
            }
        }
        if (!FirebaseDataModule.IconCompatParcelizer(p0.getRequest().getUrl(), themeAlphaConstantsKt)) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(RtspHeaders.AUTHORIZATION);
        }
        return iconCompatParcelizerMediaBrowserCompatItemReceiver.write(themeAlphaConstantsKt).RemoteActionCompatParcelizer();
    }

    private static int RemoteActionCompatParcelizer(C0156TypeKt p0, int p1) {
        String strIconCompatParcelizer = C0156TypeKt.IconCompatParcelizer(p0, "Retry-After");
        if (strIconCompatParcelizer == null) {
            return p1;
        }
        if (!new newYearNameItem("\\d+").write(strIconCompatParcelizer)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strIconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(numValueOf, "");
        return numValueOf.intValue();
    }
}
