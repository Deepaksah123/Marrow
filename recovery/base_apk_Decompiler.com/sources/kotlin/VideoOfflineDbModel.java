package kotlin;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.ThemeAlphaConstantsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u0019\u0010&\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148GX\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148GX\u0087\u0004¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b \u0010-R\u001c\u00107\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020K8GX\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O"}, d2 = {"Lo/VideoOfflineDbModel;", "", "", "p0", "", "p1", "Lo/AppThemePreviewProvider;", "p2", "Ljavax/net/SocketFactory;", "p3", "Ljavax/net/ssl/SSLSocketFactory;", "p4", "Ljavax/net/ssl/HostnameVerifier;", "p5", "Lo/toLicenseLSModel;", "p6", "Lo/getLevel;", "p7", "Ljava/net/Proxy;", "p8", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p9", "Lo/UserLoggedOutExceptionCompanion;", "p10", "Ljava/net/ProxySelector;", "p11", "<init>", "(Ljava/lang/String;ILo/AppThemePreviewProvider;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lo/toLicenseLSModel;Lo/getLevel;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "", "equals", "(Ljava/lang/Object;)Z", "AudioAttributesCompatParcelizer", "(Lo/VideoOfflineDbModel;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "certificatePinner", "Lo/toLicenseLSModel;", "read", "()Lo/toLicenseLSModel;", "connectionSpecs", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "dns", "Lo/AppThemePreviewProvider;", "write", "()Lo/AppThemePreviewProvider;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "RemoteActionCompatParcelizer", "()Ljavax/net/ssl/HostnameVerifier;", "protocols", "proxy", "Ljava/net/Proxy;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/net/Proxy;", "proxyAuthenticator", "Lo/getLevel;", "AudioAttributesImplApi21Parcelizer", "()Lo/getLevel;", "proxySelector", "Ljava/net/ProxySelector;", "MediaBrowserCompatItemReceiver", "()Ljava/net/ProxySelector;", "socketFactory", "Ljavax/net/SocketFactory;", "AudioAttributesImplApi26Parcelizer", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "AudioAttributesImplBaseParcelizer", "()Ljavax/net/ssl/SSLSocketFactory;", "Lo/ThemeAlphaConstantsKt;", "url", "Lo/ThemeAlphaConstantsKt;", "MediaBrowserCompatMediaItem", "()Lo/ThemeAlphaConstantsKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoOfflineDbModel {
    private final toLicenseLSModel certificatePinner;
    private final List<UserLoggedOutExceptionCompanion> connectionSpecs;
    private final AppThemePreviewProvider dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<ThemeKtExternalSyntheticLambda1> protocols;
    private final Proxy proxy;
    private final getLevel proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final ThemeAlphaConstantsKt url;

    public VideoOfflineDbModel(String str, int i, AppThemePreviewProvider appThemePreviewProvider, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, toLicenseLSModel tolicenselsmodel, getLevel getlevel, Proxy proxy, List<? extends ThemeKtExternalSyntheticLambda1> list, List<UserLoggedOutExceptionCompanion> list2, ProxySelector proxySelector) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(appThemePreviewProvider, "");
        toMagicModuleMetaRepoModel.write(socketFactory, "");
        toMagicModuleMetaRepoModel.write(getlevel, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(proxySelector, "");
        this.dns = appThemePreviewProvider;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = tolicenselsmodel;
        this.proxyAuthenticator = getlevel;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new ThemeAlphaConstantsKt.write().read(sSLSocketFactory != null ? "https" : "http").IconCompatParcelizer(str).IconCompatParcelizer(i).read();
        this.protocols = FirebaseDataModule.AudioAttributesCompatParcelizer(list);
        this.connectionSpecs = FirebaseDataModule.AudioAttributesCompatParcelizer(list2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final AppThemePreviewProvider getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final toLicenseLSModel getCertificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final getLevel getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final ThemeAlphaConstantsKt getUrl() {
        return this.url;
    }

    public final List<ThemeKtExternalSyntheticLambda1> AudioAttributesCompatParcelizer() {
        return this.protocols;
    }

    public final List<UserLoggedOutExceptionCompanion> IconCompatParcelizer() {
        return this.connectionSpecs;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof VideoOfflineDbModel)) {
            return false;
        }
        VideoOfflineDbModel videoOfflineDbModel = (VideoOfflineDbModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.url, videoOfflineDbModel.url) && AudioAttributesCompatParcelizer(videoOfflineDbModel);
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode();
        int iHashCode2 = this.dns.hashCode();
        int iHashCode3 = this.proxyAuthenticator.hashCode();
        int iHashCode4 = this.protocols.hashCode();
        int iHashCode5 = this.connectionSpecs.hashCode();
        int iHashCode6 = this.proxySelector.hashCode();
        int iHashCode7 = Objects.hashCode(this.proxy);
        return ((((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    public final boolean AudioAttributesCompatParcelizer(VideoOfflineDbModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.dns, p0.dns) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.proxyAuthenticator, p0.proxyAuthenticator) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.protocols, p0.protocols) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.connectionSpecs, p0.connectionSpecs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.proxySelector, p0.proxySelector) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.proxy, p0.proxy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sslSocketFactory, p0.sslSocketFactory) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.hostnameVerifier, p0.hostnameVerifier) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.certificatePinner, p0.certificatePinner) && this.url.getPort() == p0.url.getPort();
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.getHost());
        sb2.append(':');
        sb2.append(this.url.getPort());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
