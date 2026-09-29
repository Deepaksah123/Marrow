package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.AppProviderModule;
import kotlin.Metadata;
import kotlin.getQualityHashCipher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0002\u0014&B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0014\u0010\"R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\r\u0010\"R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00198G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001f"}, d2 = {"Lo/UserLoggedOutExceptionCompanion;", "", "", "p0", "p1", "", "", "p2", "p3", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "", "read", "(Ljavax/net/ssl/SSLSocket;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Z", "(Ljavax/net/ssl/SSLSocket;Z)Lo/UserLoggedOutExceptionCompanion;", "toString", "()Ljava/lang/String;", "", "Lo/getQualityHashCipher;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "AudioAttributesCompatParcelizer", "cipherSuitesAsString", "[Ljava/lang/String;", "isTls", "Z", "()Z", "supportsTlsExtensions", "Lo/AppProviderModule;", "tlsVersionsAsString", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserLoggedOutExceptionCompanion {
    private static final getQualityHashCipher[] APPROVED_CIPHER_SUITES;
    public static final UserLoggedOutExceptionCompanion CLEARTEXT;
    public static final UserLoggedOutExceptionCompanion COMPATIBLE_TLS;
    public static final UserLoggedOutExceptionCompanion MODERN_TLS;
    private static final getQualityHashCipher[] RESTRICTED_CIPHER_SUITES;
    public static final UserLoggedOutExceptionCompanion RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    public UserLoggedOutExceptionCompanion(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    private List<getQualityHashCipher> RemoteActionCompatParcelizer() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(getQualityHashCipher.INSTANCE.write(str));
        }
        return IntermediateLoginResponseBody.onPlay(arrayList);
    }

    private List<AppProviderModule> AudioAttributesCompatParcelizer() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            AppProviderModule.Companion companion = AppProviderModule.INSTANCE;
            arrayList.add(AppProviderModule.Companion.AudioAttributesCompatParcelizer(str));
        }
        return IntermediateLoginResponseBody.onPlay(arrayList);
    }

    public final void read(SSLSocket p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        UserLoggedOutExceptionCompanion userLoggedOutExceptionCompanionIconCompatParcelizer = IconCompatParcelizer(p0, p1);
        if (userLoggedOutExceptionCompanionIconCompatParcelizer.AudioAttributesCompatParcelizer() != null) {
            p0.setEnabledProtocols(userLoggedOutExceptionCompanionIconCompatParcelizer.tlsVersionsAsString);
        }
        if (userLoggedOutExceptionCompanionIconCompatParcelizer.RemoteActionCompatParcelizer() != null) {
            p0.setEnabledCipherSuites(userLoggedOutExceptionCompanionIconCompatParcelizer.cipherSuitesAsString);
        }
    }

    private final UserLoggedOutExceptionCompanion IconCompatParcelizer(SSLSocket p0, boolean p1) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites2 = p0.getEnabledCipherSuites();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enabledCipherSuites2, "");
            String[] strArr = this.cipherSuitesAsString;
            getQualityHashCipher.Companion companion = getQualityHashCipher.INSTANCE;
            enabledCipherSuites = FirebaseDataModule.write(enabledCipherSuites2, strArr, getQualityHashCipher.Companion.read());
        } else {
            enabledCipherSuites = p0.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = p0.getEnabledProtocols();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enabledProtocols2, "");
            enabledProtocols = FirebaseDataModule.write(enabledProtocols2, this.tlsVersionsAsString, (Comparator<? super String>) getConfigExpirySeconds.AudioAttributesCompatParcelizer());
        } else {
            enabledProtocols = p0.getEnabledProtocols();
        }
        String[] supportedCipherSuites = p0.getSupportedCipherSuites();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportedCipherSuites, "");
        getQualityHashCipher.Companion companion2 = getQualityHashCipher.INSTANCE;
        int iWrite = FirebaseDataModule.write(supportedCipherSuites, "TLS_FALLBACK_SCSV", getQualityHashCipher.Companion.read());
        if (p1 && iWrite != -1) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enabledCipherSuites, "");
            String str = supportedCipherSuites[iWrite];
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            enabledCipherSuites = FirebaseDataModule.write(enabledCipherSuites, str);
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enabledCipherSuites, "");
        IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer.read((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enabledProtocols, "");
        return iconCompatParcelizer2.AudioAttributesCompatParcelizer((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).write();
    }

    public final boolean IconCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !FirebaseDataModule.AudioAttributesCompatParcelizer(strArr, p0.getEnabledProtocols(), (Comparator<? super String>) getConfigExpirySeconds.AudioAttributesCompatParcelizer())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = p0.getEnabledCipherSuites();
        getQualityHashCipher.Companion companion = getQualityHashCipher.INSTANCE;
        return FirebaseDataModule.AudioAttributesCompatParcelizer(strArr2, enabledCipherSuites, getQualityHashCipher.Companion.read());
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof UserLoggedOutExceptionCompanion)) {
            return false;
        }
        if (p0 == this) {
            return true;
        }
        boolean z = this.isTls;
        UserLoggedOutExceptionCompanion userLoggedOutExceptionCompanion = (UserLoggedOutExceptionCompanion) p0;
        if (z != userLoggedOutExceptionCompanion.isTls) {
            return false;
        }
        return !z || (Arrays.equals(this.cipherSuitesAsString, userLoggedOutExceptionCompanion.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, userLoggedOutExceptionCompanion.tlsVersionsAsString) && this.supportsTlsExtensions == userLoggedOutExceptionCompanion.supportsTlsExtensions);
    }

    public final int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(RemoteActionCompatParcelizer(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(AudioAttributesCompatParcelizer(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.supportsTlsExtensions);
        sb.append(')');
        return sb.toString();
    }

    public static final class IconCompatParcelizer {
        private boolean IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private String[] read;
        private String[] write;

        public IconCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        public IconCompatParcelizer(UserLoggedOutExceptionCompanion userLoggedOutExceptionCompanion) {
            toMagicModuleMetaRepoModel.write(userLoggedOutExceptionCompanion, "");
            this.RemoteActionCompatParcelizer = userLoggedOutExceptionCompanion.getIsTls();
            this.write = userLoggedOutExceptionCompanion.cipherSuitesAsString;
            this.read = userLoggedOutExceptionCompanion.tlsVersionsAsString;
            this.IconCompatParcelizer = userLoggedOutExceptionCompanion.getSupportsTlsExtensions();
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(getQualityHashCipher... getqualityhashcipherArr) {
            toMagicModuleMetaRepoModel.write(getqualityhashcipherArr, "");
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(getqualityhashcipherArr.length);
            for (getQualityHashCipher getqualityhashcipher : getqualityhashcipherArr) {
                arrayList.add(getqualityhashcipher.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return read((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final IconCompatParcelizer read(String... strArr) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.write = (String[]) strArr.clone();
            return this;
        }

        public final IconCompatParcelizer read(AppProviderModule... appProviderModuleArr) {
            toMagicModuleMetaRepoModel.write(appProviderModuleArr, "");
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(appProviderModuleArr.length);
            for (AppProviderModule appProviderModule : appProviderModuleArr) {
                arrayList.add(appProviderModule.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return AudioAttributesCompatParcelizer((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String... strArr) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.read = (String[]) strArr.clone();
            return this;
        }

        @getRenewGrpId
        public final IconCompatParcelizer IconCompatParcelizer() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.IconCompatParcelizer = true;
            return this;
        }

        public final UserLoggedOutExceptionCompanion write() {
            return new UserLoggedOutExceptionCompanion(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.read);
        }
    }

    static {
        getQualityHashCipher[] getqualityhashcipherArr = {getQualityHashCipher.TLS_AES_128_GCM_SHA256, getQualityHashCipher.TLS_AES_256_GCM_SHA384, getQualityHashCipher.TLS_CHACHA20_POLY1305_SHA256, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, getQualityHashCipher.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
        RESTRICTED_CIPHER_SUITES = getqualityhashcipherArr;
        getQualityHashCipher[] getqualityhashcipherArr2 = {getQualityHashCipher.TLS_AES_128_GCM_SHA256, getQualityHashCipher.TLS_AES_256_GCM_SHA384, getQualityHashCipher.TLS_CHACHA20_POLY1305_SHA256, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, getQualityHashCipher.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, getQualityHashCipher.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, getQualityHashCipher.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, getQualityHashCipher.TLS_RSA_WITH_AES_128_GCM_SHA256, getQualityHashCipher.TLS_RSA_WITH_AES_256_GCM_SHA384, getQualityHashCipher.TLS_RSA_WITH_AES_128_CBC_SHA, getQualityHashCipher.TLS_RSA_WITH_AES_256_CBC_SHA, getQualityHashCipher.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = getqualityhashcipherArr2;
        RESTRICTED_TLS = new IconCompatParcelizer(true).RemoteActionCompatParcelizer((getQualityHashCipher[]) Arrays.copyOf(getqualityhashcipherArr, 9)).read(AppProviderModule.TLS_1_3, AppProviderModule.TLS_1_2).IconCompatParcelizer().write();
        MODERN_TLS = new IconCompatParcelizer(true).RemoteActionCompatParcelizer((getQualityHashCipher[]) Arrays.copyOf(getqualityhashcipherArr2, 16)).read(AppProviderModule.TLS_1_3, AppProviderModule.TLS_1_2).IconCompatParcelizer().write();
        COMPATIBLE_TLS = new IconCompatParcelizer(true).RemoteActionCompatParcelizer((getQualityHashCipher[]) Arrays.copyOf(getqualityhashcipherArr2, 16)).read(AppProviderModule.TLS_1_3, AppProviderModule.TLS_1_2, AppProviderModule.TLS_1_1, AppProviderModule.TLS_1_0).IconCompatParcelizer().write();
        CLEARTEXT = new IconCompatParcelizer(false).write();
    }
}
