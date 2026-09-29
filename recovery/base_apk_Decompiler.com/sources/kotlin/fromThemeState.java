package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class fromThemeState<T> extends UserShortInfo<T> {
    private final MagicModuleSubmissionRequestBody<getValidationToken<? super T>, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public fromThemeState(MagicModuleSubmissionRequestBody<? super getValidationToken<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.UserShortInfo
    public final Object read(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objInvoke = this.IconCompatParcelizer.invoke(getvalidationtoken, sampleVideos);
        return objInvoke == getYear.IconCompatParcelizer() ? objInvoke : getShowPopup.INSTANCE;
    }
}
