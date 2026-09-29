package kotlin;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class setOffset extends Drawable implements Animatable {
    private final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private Resources AudioAttributesImplBaseParcelizer;
    private Animator MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    float RemoteActionCompatParcelizer;
    boolean write;
    private static final Interpolator read = new LinearInterpolator();
    private static final Interpolator AudioAttributesCompatParcelizer = new _selectSetterFromMultiple();
    private static final int[] IconCompatParcelizer = {-16777216};

    private static int AudioAttributesCompatParcelizer(float f, int i, int i2) {
        return (((i >>> 24) + ((int) (((i2 >>> 24) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r5))));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public setOffset(Context context) {
        this.AudioAttributesImplBaseParcelizer = ((Context) StringCollectionDeserializer.RemoteActionCompatParcelizer(context)).getResources();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer);
        write(2.5f);
        AudioAttributesCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        float f5 = this.AudioAttributesImplBaseParcelizer.getDisplayMetrics().density;
        remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(f2 * f5);
        remoteActionCompatParcelizer.IconCompatParcelizer(f * f5);
        remoteActionCompatParcelizer.write(0);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(f3 * f5, f4 * f5);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            AudioAttributesCompatParcelizer(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            AudioAttributesCompatParcelizer(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void write(float f) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer(f);
        invalidateSelf();
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(40.0f);
        invalidateSelf();
    }

    public final void write(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.read(z);
        invalidateSelf();
    }

    public final void read(float f) {
        this.AudioAttributesImplApi26Parcelizer.read(f);
        invalidateSelf();
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesImplApi26Parcelizer.write(BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(f);
        invalidateSelf();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(f);
        invalidateSelf();
    }

    public final void AudioAttributesCompatParcelizer(int... iArr) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(iArr);
        this.AudioAttributesImplApi26Parcelizer.write(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.MediaBrowserCompatItemReceiver, bounds.exactCenterX(), bounds.exactCenterY());
        this.AudioAttributesImplApi26Parcelizer.read(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.AudioAttributesImplApi26Parcelizer.read(colorFilter);
        invalidateSelf();
    }

    private void IconCompatParcelizer(float f) {
        this.MediaBrowserCompatItemReceiver = f;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.MediaBrowserCompatCustomActionResultReceiver.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.MediaBrowserCompatCustomActionResultReceiver.cancel();
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
        if (this.AudioAttributesImplApi26Parcelizer.write() != this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()) {
            this.write = true;
            this.MediaBrowserCompatCustomActionResultReceiver.setDuration(666L);
            this.MediaBrowserCompatCustomActionResultReceiver.start();
        } else {
            this.AudioAttributesImplApi26Parcelizer.write(0);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            this.MediaBrowserCompatCustomActionResultReceiver.setDuration(1332L);
            this.MediaBrowserCompatCustomActionResultReceiver.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.MediaBrowserCompatCustomActionResultReceiver.cancel();
        IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplApi26Parcelizer.read(false);
        this.AudioAttributesImplApi26Parcelizer.write(0);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        invalidateSelf();
    }

    static void IconCompatParcelizer(float f, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (f > 0.75f) {
            remoteActionCompatParcelizer.read(AudioAttributesCompatParcelizer((f - 0.75f) / 0.25f, remoteActionCompatParcelizer.read(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()));
        } else {
            remoteActionCompatParcelizer.read(remoteActionCompatParcelizer.read());
        }
    }

    private void write(float f, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        IconCompatParcelizer(f, remoteActionCompatParcelizer);
        float fFloor = (float) (Math.floor(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() / 0.8f) + 1.0d);
        remoteActionCompatParcelizer.write(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() + (((remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() - 0.01f) - remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) * f));
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer());
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() + ((fFloor - remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) * f));
    }

    final void write(float f, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.write) {
            write(f, remoteActionCompatParcelizer);
            return;
        }
        if (f != 1.0f || z) {
            float fAudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            if (f < 0.5f) {
                interpolation = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                interpolation2 = (AudioAttributesCompatParcelizer.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fMediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() + 0.79f;
                interpolation = fMediaBrowserCompatCustomActionResultReceiver - (((1.0f - AudioAttributesCompatParcelizer.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fMediaBrowserCompatCustomActionResultReceiver;
            }
            float f2 = this.RemoteActionCompatParcelizer;
            remoteActionCompatParcelizer.write(interpolation);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(interpolation2);
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(fAudioAttributesImplBaseParcelizer + (0.20999998f * f));
            IconCompatParcelizer((f + f2) * 216.0f);
        }
    }

    private void AudioAttributesCompatParcelizer() {
        final RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setOffset.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                setOffset.IconCompatParcelizer(fFloatValue, remoteActionCompatParcelizer);
                setOffset.this.write(fFloatValue, remoteActionCompatParcelizer, false);
                setOffset.this.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(read);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: o.setOffset.5
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                setOffset.this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                setOffset.this.write(1.0f, remoteActionCompatParcelizer, true);
                remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
                remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                if (setOffset.this.write) {
                    setOffset.this.write = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    remoteActionCompatParcelizer.read(false);
                    return;
                }
                setOffset.this.RemoteActionCompatParcelizer += 1.0f;
            }
        });
        this.MediaBrowserCompatCustomActionResultReceiver = valueAnimatorOfFloat;
    }

    static class RemoteActionCompatParcelizer {
        final RectF AudioAttributesCompatParcelizer = new RectF();
        private float AudioAttributesImplApi21Parcelizer;
        private Path AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private float MediaBrowserCompatMediaItem;
        private int[] MediaBrowserCompatSearchResultReceiver;
        private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private float MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private float RatingCompat;
        final Paint RemoteActionCompatParcelizer;
        private float handleMediaPlayPauseIfPendingOnHandler;
        private float onAddQueueItem;
        private float onCommand;
        private float onCustomAction;
        private float onFastForward;
        final Paint read;
        final Paint write;

        RemoteActionCompatParcelizer() {
            Paint paint = new Paint();
            this.read = paint;
            Paint paint2 = new Paint();
            this.RemoteActionCompatParcelizer = paint2;
            Paint paint3 = new Paint();
            this.write = paint3;
            this.onAddQueueItem = BitmapDescriptorFactory.HUE_RED;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
            this.onFastForward = 5.0f;
            this.AudioAttributesImplApi21Parcelizer = 1.0f;
            this.IconCompatParcelizer = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        final void AudioAttributesCompatParcelizer(float f, float f2) {
            this.MediaBrowserCompatItemReceiver = (int) f;
            this.AudioAttributesImplBaseParcelizer = (int) f2;
        }

        final void read(Canvas canvas, Rect rect) {
            RectF rectF = this.AudioAttributesCompatParcelizer;
            float f = this.RatingCompat;
            float fMin = (this.onFastForward / 2.0f) + f;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.MediaBrowserCompatItemReceiver * this.AudioAttributesImplApi21Parcelizer) / 2.0f, this.onFastForward / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.onAddQueueItem;
            float f3 = this.MediaBrowserCompatMediaItem;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.MediaDescriptionCompat + f3) * 360.0f) - f4;
            this.read.setColor(this.MediaMetadataCompat);
            this.read.setAlpha(this.IconCompatParcelizer);
            float f6 = this.onFastForward / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.write);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.read);
            RemoteActionCompatParcelizer(canvas, f4, f5, rectF);
        }

        private void RemoteActionCompatParcelizer(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                Path path = this.AudioAttributesImplApi26Parcelizer;
                if (path == null) {
                    Path path2 = new Path();
                    this.AudioAttributesImplApi26Parcelizer = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.MediaBrowserCompatItemReceiver * this.AudioAttributesImplApi21Parcelizer) / 2.0f;
                this.AudioAttributesImplApi26Parcelizer.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.AudioAttributesImplApi26Parcelizer.lineTo(this.MediaBrowserCompatItemReceiver * this.AudioAttributesImplApi21Parcelizer, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.AudioAttributesImplApi26Parcelizer;
                float f4 = this.MediaBrowserCompatItemReceiver;
                float f5 = this.AudioAttributesImplApi21Parcelizer;
                path3.lineTo((f4 * f5) / 2.0f, this.AudioAttributesImplBaseParcelizer * f5);
                this.AudioAttributesImplApi26Parcelizer.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.onFastForward / 2.0f));
                this.AudioAttributesImplApi26Parcelizer.close();
                this.RemoteActionCompatParcelizer.setColor(this.MediaMetadataCompat);
                this.RemoteActionCompatParcelizer.setAlpha(this.IconCompatParcelizer);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer);
                canvas.restore();
            }
        }

        final void AudioAttributesCompatParcelizer(int[] iArr) {
            this.MediaBrowserCompatSearchResultReceiver = iArr;
            write(0);
        }

        final void read(int i) {
            this.MediaMetadataCompat = i;
        }

        final void write(int i) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.MediaMetadataCompat = this.MediaBrowserCompatSearchResultReceiver[i];
        }

        final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver[RatingCompat()];
        }

        private int RatingCompat() {
            return (this.MediaBrowserCompatCustomActionResultReceiver + 1) % this.MediaBrowserCompatSearchResultReceiver.length;
        }

        final void AudioAttributesImplApi26Parcelizer() {
            write(RatingCompat());
        }

        final void read(ColorFilter colorFilter) {
            this.read.setColorFilter(colorFilter);
        }

        final void AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }

        final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        final void AudioAttributesImplApi21Parcelizer(float f) {
            this.onFastForward = f;
            this.read.setStrokeWidth(f);
        }

        final void write(float f) {
            this.onAddQueueItem = f;
        }

        final float IconCompatParcelizer() {
            return this.onAddQueueItem;
        }

        final float MediaBrowserCompatCustomActionResultReceiver() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        final float AudioAttributesImplApi21Parcelizer() {
            return this.onCommand;
        }

        final int read() {
            return this.MediaBrowserCompatSearchResultReceiver[this.MediaBrowserCompatCustomActionResultReceiver];
        }

        final void AudioAttributesCompatParcelizer(float f) {
            this.MediaDescriptionCompat = f;
        }

        final float write() {
            return this.MediaDescriptionCompat;
        }

        final void RemoteActionCompatParcelizer(float f) {
            this.MediaBrowserCompatMediaItem = f;
        }

        final void IconCompatParcelizer(float f) {
            this.RatingCompat = f;
        }

        final void read(boolean z) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != z) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            }
        }

        final void read(float f) {
            if (f != this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesImplApi21Parcelizer = f;
            }
        }

        final float AudioAttributesImplBaseParcelizer() {
            return this.onCustomAction;
        }

        final void MediaBrowserCompatSearchResultReceiver() {
            this.handleMediaPlayPauseIfPendingOnHandler = this.onAddQueueItem;
            this.onCommand = this.MediaDescriptionCompat;
            this.onCustomAction = this.MediaBrowserCompatMediaItem;
        }

        final void MediaBrowserCompatItemReceiver() {
            this.handleMediaPlayPauseIfPendingOnHandler = BitmapDescriptorFactory.HUE_RED;
            this.onCommand = BitmapDescriptorFactory.HUE_RED;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            write(BitmapDescriptorFactory.HUE_RED);
            AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
