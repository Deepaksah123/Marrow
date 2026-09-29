package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0003\u000e!\"B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lo/toLicenseLSModel;", "", "", "Lo/toLicenseLSModel$AudioAttributesCompatParcelizer;", "p0", "Lo/getSubscriptionDataProvider;", "p1", "<init>", "(Ljava/util/Set;Lo/getSubscriptionDataProvider;)V", "", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/getCreatedOnDateMs;)V", "Ljava/security/cert/Certificate;", "read", "(Ljava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "(Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "IconCompatParcelizer", "(Lo/getSubscriptionDataProvider;)Lo/toLicenseLSModel;", "certificateChainCleaner", "Lo/getSubscriptionDataProvider;", "()Lo/getSubscriptionDataProvider;", "pins", "Ljava/util/Set;", "Companion", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class toLicenseLSModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final toLicenseLSModel DEFAULT = new RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
    private final getSubscriptionDataProvider certificateChainCleaner;
    private final Set<AudioAttributesCompatParcelizer> pins;

    private toLicenseLSModel(Set<AudioAttributesCompatParcelizer> set, getSubscriptionDataProvider getsubscriptiondataprovider) {
        toMagicModuleMetaRepoModel.write(set, "");
        this.pins = set;
        this.certificateChainCleaner = getsubscriptiondataprovider;
    }

    public /* synthetic */ toLicenseLSModel(Set set, getSubscriptionDataProvider getsubscriptiondataprovider, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(set, (i & 2) != 0 ? null : getsubscriptiondataprovider);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getSubscriptionDataProvider getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    /* JADX INFO: renamed from: o.toLicenseLSModel$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "write", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends X509Certificate>> {
        public static int read;
        public static int write;
        private /* synthetic */ String $AudioAttributesCompatParcelizer;
        private /* synthetic */ List<Certificate> $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            List<Certificate> listRemoteActionCompatParcelizer;
            getSubscriptionDataProvider certificateChainCleaner = toLicenseLSModel.this.getCertificateChainCleaner();
            if (certificateChainCleaner == null || (listRemoteActionCompatParcelizer = certificateChainCleaner.RemoteActionCompatParcelizer(this.$IconCompatParcelizer, this.$AudioAttributesCompatParcelizer)) == null) {
                listRemoteActionCompatParcelizer = this.$IconCompatParcelizer;
            }
            List<Certificate> list = listRemoteActionCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (Certificate certificate : list) {
                toMagicModuleMetaRepoModel.read(certificate, "");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(List<? extends Certificate> list, String str) {
            super(0);
            this.$IconCompatParcelizer = list;
            this.$AudioAttributesCompatParcelizer = str;
        }

        public static int IconCompatParcelizer() {
            int i = write;
            int i2 = i % 7087670;
            write = i + 1;
            if (i2 != 0) {
                return read;
            }
            int iNextInt = new Random().nextInt();
            read = iNextInt;
            return iNextInt;
        }
    }

    public final void read(String p0, List<? extends Certificate> p1) throws SSLPeerUnverifiedException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RemoteActionCompatParcelizer(p0, new AnonymousClass4(p1, p0));
    }

    public final void RemoteActionCompatParcelizer(String p0, getCreatedOnDateMs<? extends List<? extends X509Certificate>> p1) throws SSLPeerUnverifiedException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        List<AudioAttributesCompatParcelizer> list = read(p0);
        if (list.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = p1.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            getRelatedModuleAdapter getrelatedmoduleadapterIconCompatParcelizer = null;
            getRelatedModuleAdapter getrelatedmoduleadapter = null;
            for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : list) {
                String hashAlgorithm = audioAttributesCompatParcelizer.getHashAlgorithm();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) hashAlgorithm, (Object) "sha256")) {
                    if (getrelatedmoduleadapterIconCompatParcelizer == null) {
                        getrelatedmoduleadapterIconCompatParcelizer = Companion.IconCompatParcelizer(x509Certificate);
                    }
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.getHash(), getrelatedmoduleadapterIconCompatParcelizer)) {
                        return;
                    }
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) hashAlgorithm, (Object) "sha1")) {
                    if (getrelatedmoduleadapter == null) {
                        getrelatedmoduleadapter = Companion.read(x509Certificate);
                    }
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.getHash(), getrelatedmoduleadapter)) {
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                    sb.append(audioAttributesCompatParcelizer.getHashAlgorithm());
                    throw new AssertionError(sb.toString());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(Companion.read((Certificate) x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(p0);
        sb2.append(":");
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : list) {
            sb2.append("\n    ");
            sb2.append(audioAttributesCompatParcelizer2);
        }
        String string = sb2.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        throw new SSLPeerUnverifiedException(string);
    }

    private List<AudioAttributesCompatParcelizer> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Set<AudioAttributesCompatParcelizer> set = this.pins;
        ArrayList arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        for (Object obj : set) {
            if (((AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer(p0)) {
                if (arrayListRemoteActionCompatParcelizer.isEmpty()) {
                    arrayListRemoteActionCompatParcelizer = new ArrayList();
                }
                toMagicModuleMetaRepoModel.read(arrayListRemoteActionCompatParcelizer, "");
                toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(arrayListRemoteActionCompatParcelizer).add(obj);
            }
        }
        return arrayListRemoteActionCompatParcelizer;
    }

    public final toLicenseLSModel IconCompatParcelizer(getSubscriptionDataProvider p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.certificateChainCleaner, p0) ? this : new toLicenseLSModel(this.pins, p0);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof toLicenseLSModel)) {
            return false;
        }
        toLicenseLSModel tolicenselsmodel = (toLicenseLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tolicenselsmodel.pins, this.pins) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tolicenselsmodel.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final int hashCode() {
        int iHashCode = this.pins.hashCode();
        getSubscriptionDataProvider getsubscriptiondataprovider = this.certificateChainCleaner;
        return ((iHashCode + 1517) * 41) + (getsubscriptiondataprovider != null ? getsubscriptiondataprovider.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lo/toLicenseLSModel$AudioAttributesCompatParcelizer;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "Lo/getRelatedModuleAdapter;", "hash", "Lo/getRelatedModuleAdapter;", "IconCompatParcelizer", "()Lo/getRelatedModuleAdapter;", "hashAlgorithm", "Ljava/lang/String;", "write", "pattern"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private final getRelatedModuleAdapter hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final getRelatedModuleAdapter getHash() {
            return this.hash;
        }

        public final boolean RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.pattern, "**.")) {
                int length = this.pattern.length() - 3;
                int length2 = p0.length() - length;
                return TestGroupLSModel.IconCompatParcelizer(p0, p0.length() - length, this.pattern, 3, length, false) && (length2 == 0 || p0.charAt(length2 - 1) == '.');
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.pattern, "*.")) {
                int length3 = this.pattern.length() - 1;
                return TestGroupLSModel.IconCompatParcelizer(p0, p0.length() - length3, this.pattern, 1, length3, false) && TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) p0, '.', (p0.length() - length3) - 1, 4) == -1;
            }
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) this.pattern);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append('/');
            sb.append(this.hash.AudioAttributesCompatParcelizer());
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pattern, (Object) audioAttributesCompatParcelizer.pattern) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.hashAlgorithm, (Object) audioAttributesCompatParcelizer.hashAlgorithm) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.hash, audioAttributesCompatParcelizer.hash);
        }

        public final int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private final List<AudioAttributesCompatParcelizer> write = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final toLicenseLSModel AudioAttributesCompatParcelizer() {
            return new toLicenseLSModel(IntermediateLoginResponseBody.onPlayFromUri(this.write), null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0007\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0013\u0010\f\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/toLicenseLSModel$Companion;", "", "<init>", "()V", "Ljava/security/cert/Certificate;", "p0", "", "read", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "Lo/getRelatedModuleAdapter;", "(Ljava/security/cert/X509Certificate;)Lo/getRelatedModuleAdapter;", "IconCompatParcelizer", "Lo/toLicenseLSModel;", VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, "Lo/toLicenseLSModel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter read(X509Certificate x509Certificate) {
            toMagicModuleMetaRepoModel.write(x509Certificate, "");
            getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(encoded, "");
            return getRelatedModuleAdapter.Companion.IconCompatParcelizer(encoded, 0, isConciseModeOn.RemoteActionCompatParcelizer()).AudioAttributesImplApi21Parcelizer();
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter IconCompatParcelizer(X509Certificate x509Certificate) {
            toMagicModuleMetaRepoModel.write(x509Certificate, "");
            getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(encoded, "");
            return getRelatedModuleAdapter.Companion.IconCompatParcelizer(encoded, 0, isConciseModeOn.RemoteActionCompatParcelizer()).AudioAttributesImplApi26Parcelizer();
        }

        @getMagicModuleMeta
        public static String read(Certificate p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (!(p0 instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(IconCompatParcelizer((X509Certificate) p0).AudioAttributesCompatParcelizer());
            return sb.toString();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
