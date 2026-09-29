package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class isSetterLike<T> implements getValidationToken<T> {
    private final UserConfigSerializer<T> write;

    /* JADX WARN: Multi-variable type inference failed */
    public isSetterLike(UserConfigSerializer<? super T> userConfigSerializer) {
        toMagicModuleMetaRepoModel.write(userConfigSerializer, "");
        this.write = userConfigSerializer;
    }

    @Override // kotlin.getValidationToken
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(t, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
