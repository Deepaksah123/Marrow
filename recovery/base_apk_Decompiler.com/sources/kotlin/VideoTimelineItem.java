package kotlin;

import android.net.http.X509TrustManagerExtensions;
import in.juspay.hypersdk.core.Constants;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/VideoTimelineItem;", "Lo/getSubscriptionDataProvider;", "Ljavax/net/ssl/X509TrustManager;", "p0", "Landroid/net/http/X509TrustManagerExtensions;", "p1", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "", "Ljava/security/cert/Certificate;", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljavax/net/ssl/X509TrustManager;", "IconCompatParcelizer", "read", "Landroid/net/http/X509TrustManagerExtensions;", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoTimelineItem extends getSubscriptionDataProvider {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final X509TrustManager IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final X509TrustManagerExtensions write;

    public VideoTimelineItem(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        toMagicModuleMetaRepoModel.write(x509TrustManager, "");
        toMagicModuleMetaRepoModel.write(x509TrustManagerExtensions, "");
        this.IconCompatParcelizer = x509TrustManager;
        this.write = x509TrustManagerExtensions;
    }

    @Override // kotlin.getSubscriptionDataProvider
    public final List<Certificate> RemoteActionCompatParcelizer(List<? extends Certificate> p0, String p1) throws SSLPeerUnverifiedException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            List<X509Certificate> listCheckServerTrusted = this.write.checkServerTrusted((X509Certificate[]) p0.toArray(new X509Certificate[0]), Constants.ALG_RSA, p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listCheckServerTrusted, "");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof VideoTimelineItem) && ((VideoTimelineItem) p0).IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return System.identityHashCode(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.VideoTimelineItem$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/VideoTimelineItem$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "p0", "Lo/VideoTimelineItem;", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/X509TrustManager;)Lo/VideoTimelineItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static VideoTimelineItem RemoteActionCompatParcelizer(X509TrustManager p0) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(p0);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new VideoTimelineItem(p0, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
