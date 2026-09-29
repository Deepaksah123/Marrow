package kotlin;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/PaymentInternalWebActivity;", "Lo/getSubscriptionDataProvider;", "Lo/getCurrentSelectedPosition;", "p0", "<init>", "(Lo/getCurrentSelectedPosition;)V", "", "Ljava/security/cert/Certificate;", "", "p1", "RemoteActionCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/security/cert/X509Certificate;", "IconCompatParcelizer", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z", "AudioAttributesCompatParcelizer", "Lo/getCurrentSelectedPosition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaymentInternalWebActivity extends getSubscriptionDataProvider {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCurrentSelectedPosition RemoteActionCompatParcelizer;

    public PaymentInternalWebActivity(getCurrentSelectedPosition getcurrentselectedposition) {
        toMagicModuleMetaRepoModel.write(getcurrentselectedposition, "");
        this.RemoteActionCompatParcelizer = getcurrentselectedposition;
    }

    @Override // kotlin.getSubscriptionDataProvider
    public final List<Certificate> RemoteActionCompatParcelizer(List<? extends Certificate> p0, String p1) throws SSLPeerUnverifiedException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ArrayDeque arrayDeque = new ArrayDeque(p0);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoveFirst, "");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            toMagicModuleMetaRepoModel.read(obj, "");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(x509Certificate);
            if (x509CertificateAudioAttributesCompatParcelizer != null) {
                if (arrayList.size() > 1 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(x509Certificate, x509CertificateAudioAttributesCompatParcelizer)) {
                    arrayList.add(x509CertificateAudioAttributesCompatParcelizer);
                }
                if (IconCompatParcelizer(x509CertificateAudioAttributesCompatParcelizer, x509CertificateAudioAttributesCompatParcelizer)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
                while (it.hasNext()) {
                    Object next = it.next();
                    toMagicModuleMetaRepoModel.read(next, "");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (IconCompatParcelizer(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    private static boolean IconCompatParcelizer(X509Certificate p0, X509Certificate p1) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getIssuerDN(), p1.getSubjectDN())) {
            return false;
        }
        try {
            p0.verify(p1.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        return (p0 instanceof PaymentInternalWebActivity) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((PaymentInternalWebActivity) p0).RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
    }
}
