package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class readSegmentLength extends outputImageTrack {
    private /* synthetic */ startReadingMotionPhoto IconCompatParcelizer;

    readSegmentLength(startReadingMotionPhoto startreadingmotionphoto) {
        this.IconCompatParcelizer = startreadingmotionphoto;
    }

    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer) {
            if (this.IconCompatParcelizer.RatingCompat.get() > 0 && this.IconCompatParcelizer.RatingCompat.decrementAndGet() > 0) {
                this.IconCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            startReadingMotionPhoto startreadingmotionphoto = this.IconCompatParcelizer;
            if (startreadingmotionphoto.MediaBrowserCompatMediaItem != null) {
                startreadingmotionphoto.IconCompatParcelizer.AudioAttributesCompatParcelizer("Unbind from service.", new Object[0]);
                startReadingMotionPhoto startreadingmotionphoto2 = this.IconCompatParcelizer;
                startreadingmotionphoto2.read.unbindService(startreadingmotionphoto2.MediaBrowserCompatSearchResultReceiver);
                this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer = false;
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem = null;
                this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver = null;
            }
            this.IconCompatParcelizer.read();
        }
    }
}
