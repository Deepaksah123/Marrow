package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MagicModuleUseCaseImpl_Factory {
    public ResponseErrorCompanion IconCompatParcelizer(r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8 r8lambdau4a5cx80yg41yni9n_ha0r1dap8) {
        return r8lambdau4a5cx80yg41yni9n_ha0r1dap8;
    }

    public isRateLimitingError RemoteActionCompatParcelizer(getTotalSolvedModules gettotalsolvedmodules) {
        return gettotalsolvedmodules;
    }

    public getErrorMessageId read(MagicModuleRepoModelsKt magicModuleRepoModelsKt) {
        return magicModuleRepoModelsKt;
    }

    public clearCache write(downloadMagicModuleMetalambda1 downloadmagicmodulemetalambda1) {
        return downloadmagicmodulemetalambda1;
    }

    public isLogoutRequired write(downloadMagicModuleDetaildefault downloadmagicmoduledetaildefault) {
        return downloadmagicmoduledetaildefault;
    }

    public isVideoNetworkError write(MagicModuleUseCaseImplExternalSyntheticLambda0 magicModuleUseCaseImplExternalSyntheticLambda0) {
        return magicModuleUseCaseImplExternalSyntheticLambda0;
    }

    public isAuthError read(Class cls, String str) {
        return new setMagicModuleIntroShown(cls, str);
    }

    public isHdPlaybackError RemoteActionCompatParcelizer(Class cls) {
        return new markCompletelambda2(cls);
    }

    public String write(MagicModuleUseCase magicModuleUseCase) {
        return IconCompatParcelizer(magicModuleUseCase);
    }

    public String IconCompatParcelizer(MagicModuleMetaRepoModel magicModuleMetaRepoModel) {
        String string = magicModuleMetaRepoModel.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public deleteOfflineDownloadedFiles IconCompatParcelizer(isApiBlockError isapiblockerror, List<clearAllAppData> list) {
        return new toMagicModuleMetaDataUcModeldefault(isapiblockerror, list, true);
    }
}
