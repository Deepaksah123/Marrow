package kotlin;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/SettingsItemToggle;", "Lo/SettingsItem;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SettingsItemToggle extends SettingsItem {
    private static final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        SSLParameters sSLParameters = p0.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
        p0.setSSLParameters(sSLParameters);
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            String applicationProtocol = p0.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) applicationProtocol, (Object) "")) {
                    return applicationProtocol;
                }
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o.SettingsItemToggle$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0005\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n"}, d2 = {"Lo/SettingsItemToggle$read;", "", "<init>", "()V", "Lo/SettingsItemToggle;", "write", "()Lo/SettingsItemToggle;", "", "RemoteActionCompatParcelizer", "Z", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean RemoteActionCompatParcelizer() {
            return SettingsItemToggle.RemoteActionCompatParcelizer;
        }

        public static SettingsItemToggle write() {
            if (RemoteActionCompatParcelizer()) {
                return new SettingsItemToggle();
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer numAudioAttributesImplApi26Parcelizer = property != null ? TestGroupLSModel.AudioAttributesImplApi26Parcelizer(property) : null;
        boolean z = false;
        if (numAudioAttributesImplApi26Parcelizer != null) {
            if (numAudioAttributesImplApi26Parcelizer.intValue() >= 9) {
                z = true;
            }
        } else {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        }
        RemoteActionCompatParcelizer = z;
    }
}
