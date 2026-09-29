package kotlin;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class resolveMediaPeriodIdForAdsAfterPeriodPositionChange extends lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue<Bitmap> {
    public resolveMediaPeriodIdForAdsAfterPeriodPositionChange(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void write(Bitmap bitmap) {
        ((ImageView) this.RemoteActionCompatParcelizer).setImageBitmap(bitmap);
    }
}
