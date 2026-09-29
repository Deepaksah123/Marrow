package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class downloadMagicModuleMetalambda0 extends MagicModuleUseCaseImplExternalSyntheticLambda0 {
    public downloadMagicModuleMetalambda0(isAuthError isautherror, String str, String str2) {
        super(MediaBrowserCompatItemReceiver, ((downloadMagicModuleDetaillambda1) isautherror).RemoteActionCompatParcelizer(), str, str2, !(isautherror instanceof isHdPlaybackError) ? 1 : 0);
    }

    public downloadMagicModuleMetalambda0(Class cls, String str, String str2, int i) {
        super(MediaBrowserCompatItemReceiver, cls, str, str2, i);
    }

    @Override // kotlin.isVideoNetworkError
    public Object AudioAttributesCompatParcelizer(Object obj) {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(obj);
    }
}
