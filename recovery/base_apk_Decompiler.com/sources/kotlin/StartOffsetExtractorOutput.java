package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class StartOffsetExtractorOutput extends outputImageTrack {
    private /* synthetic */ MotionPhotoDescription RemoteActionCompatParcelizer;

    StartOffsetExtractorOutput(MotionPhotoDescription motionPhotoDescription) {
        this.RemoteActionCompatParcelizer = motionPhotoDescription;
    }

    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        startReadingMotionPhoto.MediaDescriptionCompat(this.RemoteActionCompatParcelizer.write);
        this.RemoteActionCompatParcelizer.write.MediaBrowserCompatMediaItem = null;
        this.RemoteActionCompatParcelizer.write.AudioAttributesImplApi21Parcelizer = false;
    }
}
