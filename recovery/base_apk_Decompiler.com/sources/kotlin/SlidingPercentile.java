package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class SlidingPercentile implements ensureSortedByIndex {
    private final SlidingPercentile1 AudioAttributesCompatParcelizer;

    @setSdkPayload
    public SlidingPercentile(SlidingPercentile1 slidingPercentile1) {
        toMagicModuleMetaRepoModel.write(slidingPercentile1, "");
        this.AudioAttributesCompatParcelizer = slidingPercentile1;
    }

    @Override // kotlin.ensureSortedByIndex
    public final Object write(int i) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(1);
    }

    @Override // kotlin.ensureSortedByIndex
    public final Object read(addSample addsample) {
        this.AudioAttributesCompatParcelizer.read(addsample);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.ensureSortedByIndex
    public final Object read(int i, int i2) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, 1);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.ensureSortedByIndex
    public final Object IconCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }
}
