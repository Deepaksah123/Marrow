package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class inRange<T> implements isDark<T>, UserShortInfoJsonParser<T>, getPbConfig<T> {
    private final setPassingYear read;
    private final /* synthetic */ isDark<T> write;

    /* JADX WARN: Multi-variable type inference failed */
    public inRange(isDark<? extends T> isdark, setPassingYear setpassingyear) {
        this.write = isdark;
        this.read = setpassingyear;
    }

    @Override // kotlin.getPbConfig
    public final NewNumberOtpResendRequest<T> write(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        return getThemeState.write(this, currentQuery, i, setaddressline2);
    }

    @Override // kotlin.isDark, kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<?> sampleVideos) {
        return this.write.write(getvalidationtoken, sampleVideos);
    }

    @Override // kotlin.isDark
    public final List<T> bm_() {
        return this.write.bm_();
    }
}
