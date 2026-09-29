package kotlin;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.SettingsItem;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017"}, d2 = {"Lo/OptionItemResolutionOptionItem;", "Lo/SettingsItem;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "read", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "bs_", "()Ljavax/net/ssl/X509TrustManager;", "Ljava/security/Provider;", "Ljava/security/Provider;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OptionItemResolutionOptionItem extends SettingsItem {
    private static final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Provider read;

    private OptionItemResolutionOptionItem() {
        this.read = new BouncyCastleJsseProvider();
    }

    @Override // kotlin.SettingsItem
    public final SSLContext read() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.read);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sSLContext, "");
        return sSLContext;
    }

    @Override // kotlin.SettingsItem
    public final X509TrustManager bs_() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p0 instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) p0;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.RemoteActionCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) p0).getApplicationProtocol();
            if (applicationProtocol == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) applicationProtocol, (Object) "")) {
                return null;
            }
            return applicationProtocol;
        }
        return super.AudioAttributesCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: o.OptionItemResolutionOptionItem$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0005\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/OptionItemResolutionOptionItem$write;", "", "<init>", "()V", "Lo/OptionItemResolutionOptionItem;", "IconCompatParcelizer", "()Lo/OptionItemResolutionOptionItem;", "", "Z", "write", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static boolean write() {
            return OptionItemResolutionOptionItem.IconCompatParcelizer;
        }

        public static OptionItemResolutionOptionItem IconCompatParcelizer() {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (write()) {
                return new OptionItemResolutionOptionItem(magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            return null;
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
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        IconCompatParcelizer = z;
    }

    public /* synthetic */ OptionItemResolutionOptionItem(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
