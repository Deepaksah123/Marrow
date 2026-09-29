package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/DataModule;", "Lo/getLevel;", "Lo/AppThemePreviewProvider;", "p0", "<init>", "(Lo/AppThemePreviewProvider;)V", "Lo/ActivityPresenterModule;", "Lo/TypeKt;", "p1", "Lo/ThemeKtExternalSyntheticLambda0;", "RemoteActionCompatParcelizer", "(Lo/ActivityPresenterModule;Lo/TypeKt;)Lo/ThemeKtExternalSyntheticLambda0;", "Ljava/net/Proxy;", "Lo/ThemeAlphaConstantsKt;", "Ljava/net/InetAddress;", "read", "(Ljava/net/Proxy;Lo/ThemeAlphaConstantsKt;Lo/AppThemePreviewProvider;)Ljava/net/InetAddress;", "IconCompatParcelizer", "Lo/AppThemePreviewProvider;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataModule implements getLevel {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AppThemePreviewProvider write;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    private DataModule(AppThemePreviewProvider appThemePreviewProvider) {
        toMagicModuleMetaRepoModel.write(appThemePreviewProvider, "");
        this.write = appThemePreviewProvider;
    }

    public /* synthetic */ DataModule(AppThemePreviewProvider appThemePreviewProvider, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? AppThemePreviewProvider.SYSTEM : appThemePreviewProvider);
    }

    @Override // kotlin.getLevel
    public final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer(ActivityPresenterModule p0, C0156TypeKt p1) throws IOException {
        Proxy proxy;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        VideoOfflineDbModel address;
        AppThemePreviewProvider dns;
        toMagicModuleMetaRepoModel.write(p1, "");
        List<EmptyResponseException> listWrite = p1.write();
        ThemeKtExternalSyntheticLambda0 request = p1.getRequest();
        ThemeAlphaConstantsKt url = request.getUrl();
        boolean z = p1.getCode() == 407;
        if (p0 == null || (proxy = p0.getProxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (EmptyResponseException emptyResponseException : listWrite) {
            if (TestGroupLSModel.read("Basic", emptyResponseException.AudioAttributesCompatParcelizer(), true)) {
                AppThemePreviewProvider appThemePreviewProvider = (p0 == null || (address = p0.getAddress()) == null || (dns = address.getDns()) == null) ? this.write : dns;
                if (z) {
                    SocketAddress socketAddressAddress = proxy.address();
                    toMagicModuleMetaRepoModel.read(socketAddressAddress, "");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(proxy, "");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, read(proxy, url, appThemePreviewProvider), inetSocketAddress.getPort(), url.getScheme(), emptyResponseException.RemoteActionCompatParcelizer(), emptyResponseException.AudioAttributesCompatParcelizer(), url.onCommand(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.getHost();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(proxy, "");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, read(proxy, url, appThemePreviewProvider), url.getPort(), url.getScheme(), emptyResponseException.RemoteActionCompatParcelizer(), emptyResponseException.AudioAttributesCompatParcelizer(), url.onCommand(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : RtspHeaders.AUTHORIZATION;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userName, "");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(password, "");
                    return request.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(str, ColorKt.write(userName, new String(password), emptyResponseException.IconCompatParcelizer())).RemoteActionCompatParcelizer();
                }
            }
        }
        return null;
    }

    private static InetAddress read(Proxy proxy, ThemeAlphaConstantsKt themeAlphaConstantsKt, AppThemePreviewProvider appThemePreviewProvider) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && IconCompatParcelizer.AudioAttributesCompatParcelizer[type.ordinal()] == 1) {
            return (InetAddress) IntermediateLoginResponseBody.RatingCompat((List) appThemePreviewProvider.IconCompatParcelizer(themeAlphaConstantsKt.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        toMagicModuleMetaRepoModel.read(socketAddressAddress, "");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(address, "");
        return address;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataModule() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
