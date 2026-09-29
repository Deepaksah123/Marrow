package kotlin;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.PlanActivity;
import kotlin.PlanContractPresenter;
import kotlin.PlanContractView;
import kotlin.SettingsItem;
import kotlin.VideoTimelineItem;
import kotlin.onPaymentStarted;
import kotlin.setPreferenceDataProvider;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\n\u0010\u001cJ\u0017\u0010\u0007\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010\u001eJ!\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0019\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#"}, d2 = {"Lo/OptionItem;", "Lo/SettingsItem;", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "p0", "Lo/getSubscriptionDataProvider;", "IconCompatParcelizer", "(Ljavax/net/ssl/X509TrustManager;)Lo/getSubscriptionDataProvider;", "Lo/getCurrentSelectedPosition;", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/X509TrustManager;)Lo/getCurrentSelectedPosition;", "Ljavax/net/ssl/SSLSocket;", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/Socket;", "Ljava/net/InetSocketAddress;", "", "read", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "", "(Ljava/lang/String;)Z", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lo/onPaymentStarted;", "Lo/onPaymentStarted;", "Lo/PlanPresenter;", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OptionItem extends SettingsItem {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final onPaymentStarted AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<PlanPresenter> RemoteActionCompatParcelizer;

    public OptionItem() {
        setPreferenceDataProvider.Companion companion = setPreferenceDataProvider.INSTANCE;
        PlanActivity.Companion readVar = PlanActivity.INSTANCE;
        PlanContractPresenter.Companion readVar2 = PlanContractPresenter.INSTANCE;
        PlanContractView.Companion audioAttributesCompatParcelizer = PlanContractView.INSTANCE;
        List list = IntermediateLoginResponseBody.read(setPreferenceDataProvider.Companion.RemoteActionCompatParcelizer("com.android.org.conscrypt"), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanActivity.Companion.AudioAttributesCompatParcelizer()), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanContractPresenter.Companion.RemoteActionCompatParcelizer()), new VideoTimelineSideSheetViewModel_HiltModulesKeyModule(PlanContractView.Companion.write()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlanPresenter) obj).AudioAttributesCompatParcelizer()) {
                arrayList.add(obj);
            }
        }
        this.RemoteActionCompatParcelizer = arrayList;
        onPaymentStarted.Companion companion2 = onPaymentStarted.INSTANCE;
        this.AudioAttributesCompatParcelizer = onPaymentStarted.Companion.read();
    }

    @Override // kotlin.SettingsItem
    public final void read(Socket p0, InetSocketAddress p1, int p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        p0.connect(p1, p2);
    }

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<ThemeKtExternalSyntheticLambda1> p2) {
        Object next;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PlanPresenter) next).AudioAttributesCompatParcelizer(p0)) {
                    break;
                }
            }
        }
        PlanPresenter planPresenter = (PlanPresenter) next;
        if (planPresenter != null) {
            planPresenter.AudioAttributesCompatParcelizer(p0, p1, p2);
        }
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        Object next;
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PlanPresenter) next).AudioAttributesCompatParcelizer(p0)) {
                break;
            }
        }
        PlanPresenter planPresenter = (PlanPresenter) next;
        if (planPresenter != null) {
            return planPresenter.write(p0);
        }
        return null;
    }

    @Override // kotlin.SettingsItem
    public final Object RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
    }

    @Override // kotlin.SettingsItem
    public final void AudioAttributesCompatParcelizer(String p0, Object p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p1)) {
            return;
        }
        SettingsItem.RemoteActionCompatParcelizer(p0, 5, 4);
    }

    @Override // kotlin.SettingsItem
    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(p0);
    }

    @Override // kotlin.SettingsItem
    public final getSubscriptionDataProvider IconCompatParcelizer(X509TrustManager p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoTimelineItem.Companion companion = VideoTimelineItem.INSTANCE;
        VideoTimelineItem videoTimelineItemRemoteActionCompatParcelizer = VideoTimelineItem.Companion.RemoteActionCompatParcelizer(p0);
        return videoTimelineItemRemoteActionCompatParcelizer != null ? videoTimelineItemRemoteActionCompatParcelizer : super.IconCompatParcelizer(p0);
    }

    @Override // kotlin.SettingsItem
    public final getCurrentSelectedPosition RemoteActionCompatParcelizer(X509TrustManager p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Method declaredMethod = p0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethod, "");
            return new AudioAttributesCompatParcelizer(p0, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.RemoteActionCompatParcelizer(p0);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements getCurrentSelectedPosition {
        private final Method AudioAttributesCompatParcelizer;
        private final X509TrustManager RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(X509TrustManager x509TrustManager, Method method) {
            toMagicModuleMetaRepoModel.write(x509TrustManager, "");
            toMagicModuleMetaRepoModel.write(method, "");
            this.RemoteActionCompatParcelizer = x509TrustManager;
            this.AudioAttributesCompatParcelizer = method;
        }

        @Override // kotlin.getCurrentSelectedPosition
        public final X509Certificate AudioAttributesCompatParcelizer(X509Certificate x509Certificate) {
            toMagicModuleMetaRepoModel.write(x509Certificate, "");
            try {
                Object objInvoke = this.AudioAttributesCompatParcelizer.invoke(this.RemoteActionCompatParcelizer, x509Certificate);
                toMagicModuleMetaRepoModel.read(objInvoke, "");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomTrustRootIndex(trustManager=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", findByIssuerAndSignatureMethod=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.OptionItem$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/OptionItem$IconCompatParcelizer;", "", "<init>", "()V", "Lo/SettingsItem;", "IconCompatParcelizer", "()Lo/SettingsItem;", "", "write", "Z", "read", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static boolean read() {
            return OptionItem.write;
        }

        public static SettingsItem IconCompatParcelizer() {
            if (read()) {
                return new OptionItem();
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        write = SettingsItem.IconCompatParcelizer.RemoteActionCompatParcelizer() && Build.VERSION.SDK_INT < 30;
    }
}
