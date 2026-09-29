package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class setRoleFlags {
    public static final ForwardingPlayer write(setTileCountVertical<?> settilecountvertical) {
        toMagicModuleMetaRepoModel.write(settilecountvertical, "");
        return settilecountvertical.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Incorrect types in method signature: <ResourceT:Ljava/lang/Object;TargetAndRequestListenerT::Lo/MediaSourceInfoHolder<TResourceT;>;:Lo/getUpdatedMediaPeriodInfo<TResourceT;>;>(Lo/setTileCountVertical<TResourceT;>;TTargetAndRequestListenerT;)V */
    public static final void RemoteActionCompatParcelizer(setTileCountVertical settilecountvertical, MediaSourceInfoHolder mediaSourceInfoHolder) {
        toMagicModuleMetaRepoModel.write(settilecountvertical, "");
        toMagicModuleMetaRepoModel.write(mediaSourceInfoHolder, "");
        settilecountvertical.RemoteActionCompatParcelizer(mediaSourceInfoHolder, (getUpdatedMediaPeriodInfo) mediaSourceInfoHolder, new Executor() { // from class: o.setProjectionData
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                setRoleFlags.IconCompatParcelizer(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(Runnable runnable) {
        runnable.run();
    }
}
