package kotlin;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0012"}, d2 = {"Lo/SettingsResultToggleChanged;", "Lo/PlanPresenter;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "write", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsResultToggleChanged implements PlanPresenter {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return SSLSockets.isSupportedSocket(p0);
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer() {
        return Companion.write();
    }

    @Override // kotlin.PlanPresenter
    public final String write(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String applicationProtocol = p0.getApplicationProtocol();
        if (applicationProtocol == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) applicationProtocol, (Object) "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kotlin.PlanPresenter
    public final void AudioAttributesCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        try {
            SSLSockets.setUseSessionTickets(p0, true);
            SSLParameters sSLParameters = p0.getSSLParameters();
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            sSLParameters.setApplicationProtocols((String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
            p0.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* JADX INFO: renamed from: o.SettingsResultToggleChanged$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/SettingsResultToggleChanged$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/PlanPresenter;", "RemoteActionCompatParcelizer", "()Lo/PlanPresenter;", "", "write", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static PlanPresenter RemoteActionCompatParcelizer() {
            if (write()) {
                return new SettingsResultToggleChanged();
            }
            return null;
        }

        public static boolean write() {
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            return SettingsItem.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
