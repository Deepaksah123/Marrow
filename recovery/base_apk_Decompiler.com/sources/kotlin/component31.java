package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class component31 extends MagicModuleUseCaseImpl_Factory {
    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final isAuthError read(Class cls, String str) {
        return updateUserTable.read(cls);
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final isHdPlaybackError RemoteActionCompatParcelizer(Class cls) {
        return updateUserTable.IconCompatParcelizer(cls);
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final String write(MagicModuleUseCase magicModuleUseCase) {
        return IconCompatParcelizer(magicModuleUseCase);
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final String IconCompatParcelizer(MagicModuleMetaRepoModel magicModuleMetaRepoModel) {
        component17 component17Var;
        getErrorMessageId geterrormessageidIconCompatParcelizer = stopAllServices.IconCompatParcelizer(magicModuleMetaRepoModel);
        if (geterrormessageidIconCompatParcelizer != null && (component17Var = getCourseStrings.read(geterrormessageidIconCompatParcelizer)) != null) {
            component29 component29Var = component29.read;
            return component29.read(component17Var.RatingCompat());
        }
        return super.IconCompatParcelizer(magicModuleMetaRepoModel);
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final getErrorMessageId read(MagicModuleRepoModelsKt magicModuleRepoModelsKt) {
        return new component17(RemoteActionCompatParcelizer(magicModuleRepoModelsKt), magicModuleRepoModelsKt.MediaBrowserCompatCustomActionResultReceiver(), magicModuleRepoModelsKt.MediaBrowserCompatMediaItem(), magicModuleRepoModelsKt.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final ResponseErrorCompanion IconCompatParcelizer(r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8 r8lambdau4a5cx80yg41yni9n_ha0r1dap8) {
        return new component20(RemoteActionCompatParcelizer(r8lambdau4a5cx80yg41yni9n_ha0r1dap8), r8lambdau4a5cx80yg41yni9n_ha0r1dap8.MediaBrowserCompatCustomActionResultReceiver(), r8lambdau4a5cx80yg41yni9n_ha0r1dap8.MediaBrowserCompatMediaItem(), r8lambdau4a5cx80yg41yni9n_ha0r1dap8.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final isLogoutRequired write(downloadMagicModuleDetaildefault downloadmagicmoduledetaildefault) {
        return new CourseConfigV2(RemoteActionCompatParcelizer(downloadmagicmoduledetaildefault), downloadmagicmoduledetaildefault.MediaBrowserCompatCustomActionResultReceiver(), downloadmagicmoduledetaildefault.MediaBrowserCompatMediaItem(), downloadmagicmoduledetaildefault.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final isVideoNetworkError write(MagicModuleUseCaseImplExternalSyntheticLambda0 magicModuleUseCaseImplExternalSyntheticLambda0) {
        return new component19(RemoteActionCompatParcelizer(magicModuleUseCaseImplExternalSyntheticLambda0), magicModuleUseCaseImplExternalSyntheticLambda0.MediaBrowserCompatCustomActionResultReceiver(), magicModuleUseCaseImplExternalSyntheticLambda0.MediaBrowserCompatMediaItem(), magicModuleUseCaseImplExternalSyntheticLambda0.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final isRateLimitingError RemoteActionCompatParcelizer(getTotalSolvedModules gettotalsolvedmodules) {
        return new component18(RemoteActionCompatParcelizer((r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA) gettotalsolvedmodules), gettotalsolvedmodules.MediaBrowserCompatCustomActionResultReceiver(), gettotalsolvedmodules.MediaBrowserCompatMediaItem(), gettotalsolvedmodules.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final clearCache write(downloadMagicModuleMetalambda1 downloadmagicmodulemetalambda1) {
        return new component21(RemoteActionCompatParcelizer(downloadmagicmodulemetalambda1), downloadmagicmodulemetalambda1.MediaBrowserCompatCustomActionResultReceiver(), downloadmagicmodulemetalambda1.MediaBrowserCompatMediaItem());
    }

    private static getNavDrawerKey RemoteActionCompatParcelizer(r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA r8lambdawoozi0yme1vxdgon3uosqjbjuqa) {
        isAuthError isautherrorMediaDescriptionCompat = r8lambdawoozi0yme1vxdgon3uosqjbjuqa.MediaDescriptionCompat();
        return isautherrorMediaDescriptionCompat instanceof getNavDrawerKey ? (getNavDrawerKey) isautherrorMediaDescriptionCompat : getAllowResetAfter.INSTANCE;
    }

    @Override // kotlin.MagicModuleUseCaseImpl_Factory
    public final deleteOfflineDownloadedFiles IconCompatParcelizer(isApiBlockError isapiblockerror, List<clearAllAppData> list) {
        if (isapiblockerror instanceof downloadMagicModuleDetaillambda1) {
            return updateUserTable.RemoteActionCompatParcelizer(((downloadMagicModuleDetaillambda1) isapiblockerror).RemoteActionCompatParcelizer(), list, true);
        }
        return logFirebaseException.read(isapiblockerror, list, true, Collections.emptyList());
    }
}
