package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setScaleYEnabled implements setDrawGridBackground {
    private final setViewPortOffsets RemoteActionCompatParcelizer;

    public setScaleYEnabled(setViewPortOffsets setviewportoffsets) {
        toMagicModuleMetaRepoModel.write(setviewportoffsets, "");
        this.RemoteActionCompatParcelizer = setviewportoffsets;
    }

    public final setViewPortOffsets RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private final setScaleXEnabled write() {
        String read = this.RemoteActionCompatParcelizer.read().getRead();
        if (read == null) {
            read = ":memory:";
        }
        return new setScaleXEnabled(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(read));
    }

    @Override // kotlin.setDrawGridBackground
    public final <R> Object IconCompatParcelizer(boolean z, MagicModuleSubmissionRequestBody<? super a, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        return magicModuleSubmissionRequestBody.invoke(write(), sampleVideos);
    }

    @Override // kotlin.setDrawGridBackground, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.read().close();
    }
}
