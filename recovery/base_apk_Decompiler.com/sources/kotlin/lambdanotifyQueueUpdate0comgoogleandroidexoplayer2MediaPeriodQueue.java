package kotlin;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue<Z> extends MediaPeriodQueueExternalSyntheticLambda0<ImageView, Z> {
    private Animatable write;

    protected abstract void write(Z z);

    public lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue(ImageView imageView) {
        super(imageView);
    }

    private void read(Drawable drawable) {
        ((ImageView) this.RemoteActionCompatParcelizer).setImageDrawable(drawable);
    }

    @Override // kotlin.MediaPeriodQueueExternalSyntheticLambda0, kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public void write(Drawable drawable) {
        super.write(drawable);
        read((Object) null);
        read(drawable);
    }

    @Override // kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(Drawable drawable) {
        super.RemoteActionCompatParcelizer(drawable);
        read((Object) null);
        read(drawable);
    }

    @Override // kotlin.MediaPeriodQueueExternalSyntheticLambda0, kotlin.removeAfter, kotlin.MediaSourceInfoHolder
    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        super.AudioAttributesCompatParcelizer(drawable);
        Animatable animatable = this.write;
        if (animatable != null) {
            animatable.stop();
        }
        read((Object) null);
        read(drawable);
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(Z z) {
        read(z);
    }

    @Override // kotlin.removeAfter, kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
        Animatable animatable = this.write;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // kotlin.removeAfter, kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
        Animatable animatable = this.write;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void read(Z z) {
        write(z);
        IconCompatParcelizer(z);
    }

    private void IconCompatParcelizer(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.write = animatable;
            animatable.start();
            return;
        }
        this.write = null;
    }
}
