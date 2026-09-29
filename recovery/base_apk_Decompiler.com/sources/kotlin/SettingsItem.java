package kotlin;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.OptionItem;
import kotlin.OptionItemResolutionOptionItem;
import kotlin.OptionItemSeekOptionItem;
import kotlin.OptionItemSubjectTextOptionItem;
import kotlin.SettingsItemNav;
import kotlin.SettingsItemToggle;
import kotlin.SettingsResult;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", "log", "message", "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SettingsItem {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private static volatile SettingsItem read;
    private static final Logger write;

    public static String MediaBrowserCompatItemReceiver() {
        return "OkHttp";
    }

    public SSLContext read() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sSLContext, "");
        return sSLContext;
    }

    public X509TrustManager bs_() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        toMagicModuleMetaRepoModel.write(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                toMagicModuleMetaRepoModel.read(trustManager, "");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public void read(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        toMagicModuleMetaRepoModel.write(socket, "");
        toMagicModuleMetaRepoModel.write(inetSocketAddress, "");
        socket.connect(inetSocketAddress, i);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        AudioAttributesCompatParcelizer(str, i, null);
    }

    public static void AudioAttributesCompatParcelizer(String str, int i, Throwable th) {
        toMagicModuleMetaRepoModel.write(str, "");
        write.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (write.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void AudioAttributesCompatParcelizer(String str, Object obj) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        AudioAttributesCompatParcelizer(str, 5, (Throwable) obj);
    }

    public getSubscriptionDataProvider IconCompatParcelizer(X509TrustManager x509TrustManager) {
        toMagicModuleMetaRepoModel.write(x509TrustManager, "");
        return new PaymentInternalWebActivity(RemoteActionCompatParcelizer(x509TrustManager));
    }

    public getCurrentSelectedPosition RemoteActionCompatParcelizer(X509TrustManager x509TrustManager) {
        toMagicModuleMetaRepoModel.write(x509TrustManager, "");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(acceptedIssuers, "");
        return new getPreferenceDataProvider((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public SSLSocketFactory AudioAttributesCompatParcelizer(X509TrustManager x509TrustManager) {
        toMagicModuleMetaRepoModel.write(x509TrustManager, "");
        try {
            SSLContext sSLContext = read();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(socketFactory, "");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: ".concat(String.valueOf(e)), e);
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
        return simpleName;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\b\u001a\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u000eJ\u000f\u0010\u000b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0006*\u00020\u00170\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019"}, d2 = {"Lo/SettingsItem$IconCompatParcelizer;", "", "<init>", "()V", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p0", "", "IconCompatParcelizer", "(Ljava/util/List;)Ljava/util/List;", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)[B", "Lo/SettingsItem;", "()Lo/SettingsItem;", "read", "write", "", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Ljava/util/logging/Logger;", "Ljava/util/logging/Logger;", "Lo/SettingsItem;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static SettingsItem write() {
            return SettingsItem.read;
        }

        public static List<String> IconCompatParcelizer(List<? extends ThemeKtExternalSyntheticLambda1> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : p0) {
                if (((ThemeKtExternalSyntheticLambda1) obj) != ThemeKtExternalSyntheticLambda1.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ThemeKtExternalSyntheticLambda1) it.next()).toString());
            }
            return arrayList3;
        }

        public static boolean RemoteActionCompatParcelizer() {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "Dalvik", (Object) System.getProperty("java.vm.name"));
        }

        private static boolean AudioAttributesImplApi26Parcelizer() {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "Conscrypt", (Object) Security.getProviders()[0].getName());
        }

        private static boolean MediaBrowserCompatItemReceiver() {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "OpenJSSE", (Object) Security.getProviders()[0].getName());
        }

        private static boolean AudioAttributesImplBaseParcelizer() {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "BC", (Object) Security.getProviders()[0].getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SettingsItem read() {
            if (RemoteActionCompatParcelizer()) {
                return IconCompatParcelizer();
            }
            return AudioAttributesCompatParcelizer();
        }

        private static SettingsItem IconCompatParcelizer() {
            ToggleKey toggleKey = ToggleKey.INSTANCE;
            ToggleKey.RemoteActionCompatParcelizer();
            OptionItemSeekOptionItem.Companion writeVar = OptionItemSeekOptionItem.INSTANCE;
            SettingsItem settingsItemRemoteActionCompatParcelizer = OptionItemSeekOptionItem.Companion.RemoteActionCompatParcelizer();
            if (settingsItemRemoteActionCompatParcelizer != null) {
                return settingsItemRemoteActionCompatParcelizer;
            }
            OptionItem.IconCompatParcelizer iconCompatParcelizer = OptionItem.IconCompatParcelizer;
            SettingsItem settingsItemIconCompatParcelizer = OptionItem.IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.write(settingsItemIconCompatParcelizer);
            return settingsItemIconCompatParcelizer;
        }

        private static SettingsItem AudioAttributesCompatParcelizer() {
            if (AudioAttributesImplApi26Parcelizer()) {
                SettingsItemNav.Companion remoteActionCompatParcelizer = SettingsItemNav.INSTANCE;
                SettingsItemNav settingsItemNavRemoteActionCompatParcelizer = SettingsItemNav.Companion.RemoteActionCompatParcelizer();
                if (settingsItemNavRemoteActionCompatParcelizer != null) {
                    return settingsItemNavRemoteActionCompatParcelizer;
                }
            }
            if (AudioAttributesImplBaseParcelizer()) {
                OptionItemResolutionOptionItem.Companion writeVar = OptionItemResolutionOptionItem.INSTANCE;
                OptionItemResolutionOptionItem optionItemResolutionOptionItemIconCompatParcelizer = OptionItemResolutionOptionItem.Companion.IconCompatParcelizer();
                if (optionItemResolutionOptionItemIconCompatParcelizer != null) {
                    return optionItemResolutionOptionItemIconCompatParcelizer;
                }
            }
            if (MediaBrowserCompatItemReceiver()) {
                OptionItemSubjectTextOptionItem.Companion readVar = OptionItemSubjectTextOptionItem.INSTANCE;
                OptionItemSubjectTextOptionItem optionItemSubjectTextOptionItemWrite = OptionItemSubjectTextOptionItem.Companion.write();
                if (optionItemSubjectTextOptionItemWrite != null) {
                    return optionItemSubjectTextOptionItemWrite;
                }
            }
            SettingsItemToggle.Companion readVar2 = SettingsItemToggle.INSTANCE;
            SettingsItemToggle settingsItemToggleWrite = SettingsItemToggle.Companion.write();
            if (settingsItemToggleWrite != null) {
                return settingsItemToggleWrite;
            }
            SettingsResult.write writeVar2 = SettingsResult.write;
            SettingsItem settingsItem = SettingsResult.write.read();
            return settingsItem != null ? settingsItem : new SettingsItem();
        }

        public static byte[] AudioAttributesCompatParcelizer(List<? extends ThemeKtExternalSyntheticLambda1> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
            for (String str : IconCompatParcelizer(p0)) {
                resetcurrentselectedposition.read(str.length());
                resetcurrentselectedposition.read(str);
            }
            return resetcurrentselectedposition.MediaBrowserCompatSearchResultReceiver();
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(null);
        AudioAttributesCompatParcelizer = iconCompatParcelizer;
        read = iconCompatParcelizer.read();
        write = Logger.getLogger(ThemeKtExternalSyntheticLambda3.class.getName());
    }

    public void write(SSLSocket sSLSocket) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
    }

    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List<ThemeKtExternalSyntheticLambda1> list) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        toMagicModuleMetaRepoModel.write(list, "");
    }

    public String AudioAttributesCompatParcelizer(SSLSocket sSLSocket) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        return null;
    }

    public boolean IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return true;
    }
}
