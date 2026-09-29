package kotlin;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.AppProviderModule;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 '2\u00020\u0001:\u0001'B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001dR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010\u0018\u001a\u00020\u0013*\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010&"}, d2 = {"Lo/ThemeKt;", "", "Lo/AppProviderModule;", "p0", "Lo/getQualityHashCipher;", "p1", "", "Ljava/security/cert/Certificate;", "p2", "Lkotlin/Function0;", "p3", "<init>", "(Lo/AppProviderModule;Lo/getQualityHashCipher;Ljava/util/List;Lo/getCreatedOnDateMs;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "cipherSuite", "Lo/getQualityHashCipher;", "write", "()Lo/getQualityHashCipher;", "localCertificates", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "peerCertificates$delegate", "Lo/RenewEligible;", "read", "peerCertificates", "tlsVersion", "Lo/AppProviderModule;", "AudioAttributesCompatParcelizer", "()Lo/AppProviderModule;", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeKt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final getQualityHashCipher cipherSuite;
    private final List<Certificate> localCertificates;

    /* JADX INFO: renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    private final RenewEligible peerCertificates;
    private final AppProviderModule tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeKt(AppProviderModule appProviderModule, getQualityHashCipher getqualityhashcipher, List<? extends Certificate> list, getCreatedOnDateMs<? extends List<? extends Certificate>> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(appProviderModule, "");
        toMagicModuleMetaRepoModel.write(getqualityhashcipher, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.tlsVersion = appProviderModule;
        this.cipherSuite = getqualityhashcipher;
        this.localCertificates = list;
        this.peerCertificates = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass1(getcreatedondatems));
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final AppProviderModule getTlsVersion() {
        return this.tlsVersion;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getQualityHashCipher getCipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> IconCompatParcelizer() {
        return this.localCertificates;
    }

    public final List<Certificate> read() {
        return (List) this.peerCertificates.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.ThemeKt$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "read", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Certificate>> {
        private /* synthetic */ getCreatedOnDateMs<List<Certificate>> $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            try {
                return this.$write.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(getCreatedOnDateMs<? extends List<? extends Certificate>> getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof ThemeKt)) {
            return false;
        }
        ThemeKt themeKt = (ThemeKt) p0;
        return themeKt.tlsVersion == this.tlsVersion && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(themeKt.cipherSuite, this.cipherSuite) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(themeKt.read(), read()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(themeKt.localCertificates, this.localCertificates);
    }

    public final int hashCode() {
        int iHashCode = this.tlsVersion.hashCode();
        return ((((((iHashCode + 527) * 31) + this.cipherSuite.hashCode()) * 31) + read().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final String toString() {
        List<Certificate> list = read();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(read((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list2 = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(read((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    private static String read(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
        return type;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b*\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0013"}, d2 = {"Lo/ThemeKt$Companion;", "", "<init>", "()V", "Lo/AppProviderModule;", "p0", "Lo/getQualityHashCipher;", "p1", "", "Ljava/security/cert/Certificate;", "p2", "p3", "Lo/ThemeKt;", "RemoteActionCompatParcelizer", "(Lo/AppProviderModule;Lo/getQualityHashCipher;Ljava/util/List;Ljava/util/List;)Lo/ThemeKt;", "Ljavax/net/ssl/SSLSession;", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSession;)Lo/ThemeKt;", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static ThemeKt AudioAttributesCompatParcelizer(SSLSession sSLSession) throws IOException {
            List<Certificate> listRemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(sSLSession, "");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) cipherSuite, (Object) "TLS_NULL_WITH_NULL_NULL") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) cipherSuite, (Object) "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(String.valueOf(cipherSuite)));
            }
            getQualityHashCipher getqualityhashcipherWrite = getQualityHashCipher.INSTANCE.write(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "NONE", (Object) protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            AppProviderModule.Companion companion = AppProviderModule.INSTANCE;
            AppProviderModule appProviderModuleAudioAttributesCompatParcelizer = AppProviderModule.Companion.AudioAttributesCompatParcelizer(protocol);
            try {
                listRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return new ThemeKt(appProviderModuleAudioAttributesCompatParcelizer, getqualityhashcipherWrite, AudioAttributesCompatParcelizer(sSLSession.getLocalCertificates()), new AnonymousClass2(listRemoteActionCompatParcelizer));
        }

        private static List<Certificate> AudioAttributesCompatParcelizer(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return FirebaseDataModule.IconCompatParcelizer(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @getMagicModuleMeta
        public static ThemeKt RemoteActionCompatParcelizer(AppProviderModule p0, getQualityHashCipher p1, List<? extends Certificate> p2, List<? extends Certificate> p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new ThemeKt(p0, p1, FirebaseDataModule.AudioAttributesCompatParcelizer(p3), new AnonymousClass5(FirebaseDataModule.AudioAttributesCompatParcelizer(p2)));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.ThemeKt$read$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Certificate>> {
        private /* synthetic */ List<Certificate> $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends Certificate> list) {
            super(0);
            this.$IconCompatParcelizer = list;
        }
    }

    /* JADX INFO: renamed from: o.ThemeKt$read$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Certificate>> {
        private /* synthetic */ List<Certificate> $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(List<? extends Certificate> list) {
            super(0);
            this.$RemoteActionCompatParcelizer = list;
        }
    }
}
