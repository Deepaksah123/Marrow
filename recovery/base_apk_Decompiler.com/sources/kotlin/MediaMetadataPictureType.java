package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataPictureType extends setRecordingYear<setYear> {
    public MediaMetadataPictureType(setYear setyear) {
        super(setyear);
    }

    @Override // kotlin.setMimeType
    public final Class<setYear> read() {
        return setYear.class;
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return ((setYear) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
    }

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        ((setYear) this.RemoteActionCompatParcelizer).stop();
        ((setYear) this.RemoteActionCompatParcelizer).write();
    }

    @Override // kotlin.setRecordingYear, kotlin.setLiveTargetOffsetMs
    public final void IconCompatParcelizer() {
        ((setYear) this.RemoteActionCompatParcelizer).read().prepareToDraw();
    }
}
