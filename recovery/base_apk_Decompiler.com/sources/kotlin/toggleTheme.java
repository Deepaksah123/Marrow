package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class toggleTheme<T> implements setUpdatedStatus<T>, UserShortInfoJsonParser<T>, getPbConfig<T> {
    private final setPassingYear AudioAttributesCompatParcelizer;
    private final /* synthetic */ setUpdatedStatus<T> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public toggleTheme(setUpdatedStatus<? extends T> setupdatedstatus, setPassingYear setpassingyear) {
        this.RemoteActionCompatParcelizer = setupdatedstatus;
        this.AudioAttributesCompatParcelizer = setpassingyear;
    }

    @Override // kotlin.getPbConfig
    public final NewNumberOtpResendRequest<T> write(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        return setStartTime.read(this, currentQuery, i, setaddressline2);
    }

    @Override // kotlin.isDark, kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<?> sampleVideos) {
        return this.RemoteActionCompatParcelizer.write(getvalidationtoken, sampleVideos);
    }

    @Override // kotlin.isDark
    public final List<T> bm_() {
        return this.RemoteActionCompatParcelizer.bm_();
    }

    @Override // kotlin.setUpdatedStatus
    public final T IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }
}
