package kotlin;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class toMagicModuleMetaDataUcModel {
    private static final MagicModuleUseCaseImpl_Factory read;

    static {
        MagicModuleUseCaseImpl_Factory magicModuleUseCaseImpl_Factory;
        try {
            magicModuleUseCaseImpl_Factory = (MagicModuleUseCaseImpl_Factory) Class.forName("o.component31").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            magicModuleUseCaseImpl_Factory = null;
        }
        if (magicModuleUseCaseImpl_Factory == null) {
            magicModuleUseCaseImpl_Factory = new MagicModuleUseCaseImpl_Factory();
        }
        read = magicModuleUseCaseImpl_Factory;
        isHdPlaybackError[] ishdplaybackerrorArr = new isHdPlaybackError[0];
    }

    public static isAuthError RemoteActionCompatParcelizer(Class cls) {
        return read.read(cls, "");
    }

    public static isAuthError read(Class cls, String str) {
        return read.read(cls, str);
    }

    public static isHdPlaybackError write(Class cls) {
        return read.RemoteActionCompatParcelizer(cls);
    }

    public static String write(MagicModuleUseCase magicModuleUseCase) {
        return read.write(magicModuleUseCase);
    }

    public static String RemoteActionCompatParcelizer(MagicModuleMetaRepoModel magicModuleMetaRepoModel) {
        return read.IconCompatParcelizer(magicModuleMetaRepoModel);
    }

    public static getErrorMessageId AudioAttributesCompatParcelizer(MagicModuleRepoModelsKt magicModuleRepoModelsKt) {
        return read.read(magicModuleRepoModelsKt);
    }

    public static ResponseErrorCompanion IconCompatParcelizer(r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8 r8lambdau4a5cx80yg41yni9n_ha0r1dap8) {
        return read.IconCompatParcelizer(r8lambdau4a5cx80yg41yni9n_ha0r1dap8);
    }

    public static isLogoutRequired IconCompatParcelizer(downloadMagicModuleDetaildefault downloadmagicmoduledetaildefault) {
        return read.write(downloadmagicmoduledetaildefault);
    }

    public static isVideoNetworkError write(MagicModuleUseCaseImplExternalSyntheticLambda0 magicModuleUseCaseImplExternalSyntheticLambda0) {
        return read.write(magicModuleUseCaseImplExternalSyntheticLambda0);
    }

    public static isRateLimitingError IconCompatParcelizer(getTotalSolvedModules gettotalsolvedmodules) {
        return read.RemoteActionCompatParcelizer(gettotalsolvedmodules);
    }

    public static clearCache AudioAttributesCompatParcelizer(downloadMagicModuleMetalambda1 downloadmagicmodulemetalambda1) {
        return read.write(downloadmagicmodulemetalambda1);
    }

    public static deleteOfflineDownloadedFiles read(Class cls) {
        return read.IconCompatParcelizer(write(cls), Collections.emptyList());
    }
}
