package kotlin;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes4.dex */
public final class getPreferenceDataProvider implements getCurrentSelectedPosition {
    private final Map<X500Principal, Set<X509Certificate>> write;

    public getPreferenceDataProvider(X509Certificate... x509CertificateArr) {
        toMagicModuleMetaRepoModel.write(x509CertificateArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectX500Principal, "");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (Set) new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.write = linkedHashMap;
    }

    @Override // kotlin.getCurrentSelectedPosition
    public final X509Certificate AudioAttributesCompatParcelizer(X509Certificate x509Certificate) {
        toMagicModuleMetaRepoModel.write(x509Certificate, "");
        Set<X509Certificate> set = this.write.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof getPreferenceDataProvider) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getPreferenceDataProvider) obj).write, this.write);
        }
        return true;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
