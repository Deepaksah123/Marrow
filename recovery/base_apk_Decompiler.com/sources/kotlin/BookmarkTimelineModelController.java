package kotlin;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\b\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/BookmarkTimelineModelController;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "p0", "", "", "write", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "", "p1", "AudioAttributesCompatParcelizer", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "Ljavax/net/ssl/SSLSession;", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "read", "(Ljava/lang/String;Ljava/lang/String;)Z", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "IconCompatParcelizer", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BookmarkTimelineModelController implements HostnameVerifier {
    public static final BookmarkTimelineModelController INSTANCE = new BookmarkTimelineModelController();

    private BookmarkTimelineModelController() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String p0, SSLSession p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!IconCompatParcelizer(p0)) {
            return false;
        }
        try {
            Certificate certificate = p1.getPeerCertificates()[0];
            toMagicModuleMetaRepoModel.read(certificate, "");
            return write(p0, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean write(String p0, X509Certificate p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return FirebaseDataModule.IconCompatParcelizer(p0) ? RemoteActionCompatParcelizer(p0, p1) : read(p0, p1);
    }

    private static boolean RemoteActionCompatParcelizer(String p0, X509Certificate p1) {
        String strWrite = InterceptorModule.write(p0);
        List<String> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1, 7);
        if ((listAudioAttributesCompatParcelizer instanceof Collection) && listAudioAttributesCompatParcelizer.isEmpty()) {
            return false;
        }
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) InterceptorModule.write((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    private final boolean read(String p0, X509Certificate p1) {
        String str = read(p0);
        List<String> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1, 2);
        if ((listAudioAttributesCompatParcelizer instanceof Collection) && listAudioAttributesCompatParcelizer.isEmpty()) {
            return false;
        }
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (INSTANCE.write(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static String read(String str) {
        if (!IconCompatParcelizer(str)) {
            return str;
        }
        Locale locale = Locale.US;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        String lowerCase = str.toLowerCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return lowerCase;
    }

    private static boolean IconCompatParcelizer(String str) {
        return str.length() == ((int) CustomTypefaceSpan.write(str, 0, str.length()));
    }

    private final boolean write(String p0, String p1) {
        String str;
        String str2 = p0;
        if (str2 != null && str2.length() != 0 && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, ".") && !TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, "..") && (str = p1) != null && str.length() != 0 && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p1, ".") && !TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p1, "..")) {
            if (!TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, ".")) {
                StringBuilder sb = new StringBuilder();
                sb.append(p0);
                sb.append('.');
                p0 = sb.toString();
            }
            if (!TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p1, ".")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p1);
                sb2.append('.');
                p1 = sb2.toString();
            }
            String str3 = read(p1);
            String str4 = str3;
            if (!TestGroupLSModel.write((CharSequence) str4, (CharSequence) "*", false)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) str3);
            }
            if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str3, "*.") || TestGroupLSModel.IconCompatParcelizer((CharSequence) str4, '*', 1, false, 4) != -1 || p0.length() < str3.length() || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "*.", (Object) str3)) {
                return false;
            }
            String strSubstring = str3.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            if (!TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, strSubstring)) {
                return false;
            }
            int length = p0.length() - strSubstring.length();
            return length <= 0 || TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) p0, '.', length - 1, 4) == -1;
        }
        return false;
    }

    public static List<String> write(X509Certificate p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) AudioAttributesCompatParcelizer(p0, 7), (Iterable) AudioAttributesCompatParcelizer(p0, 2));
    }

    private static List<String> AudioAttributesCompatParcelizer(X509Certificate p0, int p1) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = p0.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(list.get(0), Integer.valueOf(p1)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
    }
}
