package kotlin;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.SettingsItemNav;
import kotlin.VideoTimelineSideSheetViewModel_HiltModulesKeyModule;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0012"}, d2 = {"Lo/PlanContractPresenter;", "Lo/PlanPresenter;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "write", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlanContractPresenter implements PlanPresenter {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer write = new RemoteActionCompatParcelizer();

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return Conscrypt.isConscrypt(p0);
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer() {
        SettingsItemNav.Companion companion = SettingsItemNav.INSTANCE;
        return SettingsItemNav.Companion.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlanPresenter
    public final String write(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (AudioAttributesCompatParcelizer(p0)) {
            return Conscrypt.getApplicationProtocol(p0);
        }
        return null;
    }

    @Override // kotlin.PlanPresenter
    public final void AudioAttributesCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (AudioAttributesCompatParcelizer(p0)) {
            Conscrypt.setUseSessionTickets(p0, true);
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            Conscrypt.setApplicationProtocols(p0, (String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
        }
    }

    /* JADX INFO: renamed from: o.PlanContractPresenter$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/PlanContractPresenter$read;", "", "<init>", "()V", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "write", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return PlanContractPresenter.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class RemoteActionCompatParcelizer implements VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
            toMagicModuleMetaRepoModel.write(sSLSocket, "");
            SettingsItemNav.Companion companion = SettingsItemNav.INSTANCE;
            return SettingsItemNav.Companion.AudioAttributesCompatParcelizer() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // o.VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer
        public final PlanPresenter IconCompatParcelizer(SSLSocket sSLSocket) {
            toMagicModuleMetaRepoModel.write(sSLSocket, "");
            return new PlanContractPresenter();
        }
    }
}
