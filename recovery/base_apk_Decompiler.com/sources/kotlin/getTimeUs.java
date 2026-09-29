package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class getTimeUs extends parseAudioSampleEntry {
    private /* synthetic */ ConstantBitrateSeeker RemoteActionCompatParcelizer;

    getTimeUs(ConstantBitrateSeeker constantBitrateSeeker) {
        this.RemoteActionCompatParcelizer = constantBitrateSeeker;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        IndexSeeker.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.MediaDescriptionCompat = null;
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
    }
}
