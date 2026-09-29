package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setSeekCount extends getPlatform implements getCurrentYear {
    private final String AudioAttributesCompatParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final /* synthetic */ getCurrentYear write;

    /* JADX WARN: Multi-variable type inference failed */
    public setSeekCount(getPlatform getplatform, String str) {
        getCurrentYear getcurrentyear = getplatform instanceof getCurrentYear ? (getCurrentYear) getplatform : null;
        this.write = getcurrentyear == null ? getVerifiedOn.AudioAttributesCompatParcelizer() : getcurrentyear;
        this.IconCompatParcelizer = getplatform;
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.getPlatform
    public final boolean IconCompatParcelizer(CurrentQuery currentQuery) {
        return this.IconCompatParcelizer.IconCompatParcelizer(currentQuery);
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(currentQuery, runnable);
    }

    @Override // kotlin.getPlatform
    public final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(currentQuery, runnable);
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getCurrentYear
    public final setYearOfPassout read(long j, Runnable runnable, CurrentQuery currentQuery) {
        return this.write.read(j, runnable, currentQuery);
    }

    @Override // kotlin.getCurrentYear
    public final void write(long j, setStateRank<? super getShowPopup> setstaterank) {
        this.write.write(j, setstaterank);
    }
}
