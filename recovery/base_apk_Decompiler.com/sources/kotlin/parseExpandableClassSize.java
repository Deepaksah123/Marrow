package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class parseExpandableClassSize extends parseAudioSampleEntry {
    private /* synthetic */ IndexSeeker read;

    parseExpandableClassSize(IndexSeeker indexSeeker) {
        this.read = indexSeeker;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        synchronized (this.read.MediaBrowserCompatItemReceiver) {
            if (this.read.MediaBrowserCompatSearchResultReceiver.get() > 0 && this.read.MediaBrowserCompatSearchResultReceiver.decrementAndGet() > 0) {
                this.read.read.RemoteActionCompatParcelizer("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            IndexSeeker indexSeeker = this.read;
            if (indexSeeker.MediaDescriptionCompat != null) {
                indexSeeker.read.RemoteActionCompatParcelizer("Unbind from service.", new Object[0]);
                IndexSeeker indexSeeker2 = this.read;
                indexSeeker2.IconCompatParcelizer.unbindService(indexSeeker2.RatingCompat);
                this.read.AudioAttributesImplBaseParcelizer = false;
                this.read.MediaDescriptionCompat = null;
                this.read.RatingCompat = null;
            }
            this.read.IconCompatParcelizer();
        }
    }
}
