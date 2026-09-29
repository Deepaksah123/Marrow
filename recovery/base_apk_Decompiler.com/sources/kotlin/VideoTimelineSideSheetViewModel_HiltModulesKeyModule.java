package kotlin;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoTimelineSideSheetViewModel_HiltModulesKeyModule implements PlanPresenter {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private PlanPresenter read;

    public interface AudioAttributesCompatParcelizer {
        PlanPresenter IconCompatParcelizer(SSLSocket sSLSocket);

        boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket);
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer() {
        return true;
    }

    public VideoTimelineSideSheetViewModel_HiltModulesKeyModule(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.PlanPresenter
    public final boolean AudioAttributesCompatParcelizer(SSLSocket sSLSocket) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sSLSocket);
    }

    @Override // kotlin.PlanPresenter
    public final void AudioAttributesCompatParcelizer(SSLSocket sSLSocket, String str, List<? extends ThemeKtExternalSyntheticLambda1> list) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        toMagicModuleMetaRepoModel.write(list, "");
        PlanPresenter planPresenter = read(sSLSocket);
        if (planPresenter != null) {
            planPresenter.AudioAttributesCompatParcelizer(sSLSocket, str, list);
        }
    }

    @Override // kotlin.PlanPresenter
    public final String write(SSLSocket sSLSocket) {
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        PlanPresenter planPresenter = read(sSLSocket);
        if (planPresenter != null) {
            return planPresenter.write(sSLSocket);
        }
        return null;
    }

    private final PlanPresenter read(SSLSocket sSLSocket) {
        PlanPresenter planPresenter;
        synchronized (this) {
            if (this.read == null && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sSLSocket)) {
                this.read = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(sSLSocket);
            }
            planPresenter = this.read;
        }
        return planPresenter;
    }
}
