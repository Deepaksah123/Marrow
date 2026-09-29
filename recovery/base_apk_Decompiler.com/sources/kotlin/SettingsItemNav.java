package kotlin;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.SettingsItem;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0002\f\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/SettingsItemNav;", "Lo/SettingsItem;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "read", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "bs_", "()Ljavax/net/ssl/X509TrustManager;", "Ljava/security/Provider;", "IconCompatParcelizer", "Ljava/security/Provider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsItemNav extends SettingsItem {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final boolean read;
    private final Provider IconCompatParcelizer;

    private SettingsItemNav() {
        Provider providerNewProvider = Conscrypt.newProvider();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(providerNewProvider, "");
        this.IconCompatParcelizer = providerNewProvider;
    }

    @Override // kotlin.SettingsItem
    public final SSLContext read() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sSLContext, "");
        return sSLContext;
    }

    @Override // kotlin.SettingsItem
    public final X509TrustManager bs_() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        toMagicModuleMetaRepoModel.write(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                toMagicModuleMetaRepoModel.read(trustManager, "");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, read.read);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final class read implements ConscryptHostnameVerifier {
        public static final read read = new read();

        private read() {
        }
    }

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (Conscrypt.isConscrypt(p0)) {
            Conscrypt.setUseSessionTickets(p0, true);
            Conscrypt.setApplicationProtocols(p0, (String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
        } else {
            super.RemoteActionCompatParcelizer(p0, p1, p2);
        }
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (Conscrypt.isConscrypt(p0)) {
            return Conscrypt.getApplicationProtocol(p0);
        }
        return super.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.SettingsItem
    public final SSLSocketFactory AudioAttributesCompatParcelizer(X509TrustManager p0) throws NoSuchAlgorithmException, KeyManagementException {
        toMagicModuleMetaRepoModel.write(p0, "");
        SSLContext sSLContext = read();
        sSLContext.init(null, new TrustManager[]{p0}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(socketFactory, "");
        return socketFactory;
    }

    /* JADX INFO: renamed from: o.SettingsItemNav$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\f\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\n"}, d2 = {"Lo/SettingsItemNav$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "p2", "", "write", "()Z", "Lo/SettingsItemNav;", "RemoteActionCompatParcelizer", "()Lo/SettingsItemNav;", "read", "Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static boolean AudioAttributesCompatParcelizer() {
            return SettingsItemNav.read;
        }

        public static SettingsItemNav RemoteActionCompatParcelizer() {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (AudioAttributesCompatParcelizer()) {
                return new SettingsItemNav(magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            return null;
        }

        public static boolean write() {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (Companion.write()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        read = z;
    }

    public /* synthetic */ SettingsItemNav(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
