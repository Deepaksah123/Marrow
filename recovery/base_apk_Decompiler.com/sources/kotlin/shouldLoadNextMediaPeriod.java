package kotlin;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class shouldLoadNextMediaPeriod extends lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue<Drawable> {
    public shouldLoadNextMediaPeriod(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void write(Drawable drawable) {
        ((ImageView) this.RemoteActionCompatParcelizer).setImageDrawable(drawable);
    }
}
