package kotlin;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.OptionItemResolutionOptionItem;
import kotlin.SettingsItem;
import kotlin.VideoTimelineSideSheetViewModel_HiltModulesKeyModule;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0012"}, d2 = {"Lo/PlanContractView;", "Lo/PlanPresenter;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p2", "", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "write", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlanContractView implements PlanPresenter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0 instanceof BCSSLSocket;
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer() {
        OptionItemResolutionOptionItem.Companion companion = OptionItemResolutionOptionItem.INSTANCE;
        return OptionItemResolutionOptionItem.Companion.write();
    }

    @Override // kotlin.PlanPresenter
    public final String write(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String applicationProtocol = ((BCSSLSocket) p0).getApplicationProtocol();
        if (applicationProtocol == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) applicationProtocol, (Object) "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kotlin.PlanPresenter
    public final void AudioAttributesCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (AudioAttributesCompatParcelizer(p0)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) p0;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            parameters.setApplicationProtocols((String[]) SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    /* JADX INFO: renamed from: o.PlanContractView$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/PlanContractView$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "write", "()Lo/VideoTimelineSideSheetViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer write() {
            return PlanContractView.IconCompatParcelizer;
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
            OptionItemResolutionOptionItem.Companion companion = OptionItemResolutionOptionItem.INSTANCE;
            return OptionItemResolutionOptionItem.Companion.write() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // o.VideoTimelineSideSheetViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer
        public final PlanPresenter IconCompatParcelizer(SSLSocket sSLSocket) {
            toMagicModuleMetaRepoModel.write(sSLSocket, "");
            return new PlanContractView();
        }
    }
}
