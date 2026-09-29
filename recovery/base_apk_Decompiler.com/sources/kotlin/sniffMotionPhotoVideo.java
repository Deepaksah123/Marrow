package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class sniffMotionPhotoVideo extends outputImageTrack {
    private /* synthetic */ TaskCompletionSource IconCompatParcelizer;
    private /* synthetic */ startReadingMotionPhoto RemoteActionCompatParcelizer;
    private /* synthetic */ outputImageTrack read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    sniffMotionPhotoVideo(startReadingMotionPhoto startreadingmotionphoto, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, outputImageTrack outputimagetrack) {
        super(taskCompletionSource);
        this.RemoteActionCompatParcelizer = startreadingmotionphoto;
        this.IconCompatParcelizer = taskCompletionSource2;
        this.read = outputimagetrack;
    }

    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer) {
            startReadingMotionPhoto.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
            if (this.RemoteActionCompatParcelizer.RatingCompat.getAndIncrement() > 0) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer("Already connected to the service.", new Object[0]);
            }
            startReadingMotionPhoto.write(this.RemoteActionCompatParcelizer, this.read);
        }
    }
}
