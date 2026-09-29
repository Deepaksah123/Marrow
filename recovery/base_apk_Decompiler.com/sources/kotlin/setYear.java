package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import java.nio.ByteBuffer;
import kotlin.MediaPeriodHolder;

/* JADX INFO: loaded from: classes2.dex */
public class setYear extends Drawable implements MediaPeriodHolder.AudioAttributesCompatParcelizer, Animatable, getActivityBanner {
    private boolean AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private Paint AudioAttributesImplApi26Parcelizer;
    private final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private Rect read;
    private boolean write;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public setYear(Context context, onAvailableCommandsChanged onavailablecommandschanged, MediaItem<Bitmap> mediaItem, int i, int i2, Bitmap bitmap) {
        this(new RemoteActionCompatParcelizer(new MediaPeriodHolder(Glide.read(context), onavailablecommandschanged, i, i2, mediaItem, bitmap)));
    }

    setYear(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = true;
        this.MediaBrowserCompatItemReceiver = -1;
        this.AudioAttributesImplBaseParcelizer = (RemoteActionCompatParcelizer) moveMediaSource.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    public final Bitmap read() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.read();
    }

    public final void IconCompatParcelizer(MediaItem<Bitmap> mediaItem, Bitmap bitmap) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.read(mediaItem, bitmap);
    }

    public final ByteBuffer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private int MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    private int RatingCompat() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.write = true;
        MediaBrowserCompatCustomActionResultReceiver();
        if (this.AudioAttributesImplApi21Parcelizer) {
            MediaBrowserCompatItemReceiver();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.write = false;
        MediaBrowserCompatSearchResultReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        moveMediaSource.AudioAttributesCompatParcelizer(!this.RemoteActionCompatParcelizer, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.MediaBrowserCompatItemReceiver() == 1) {
            invalidateSelf();
        } else {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
            invalidateSelf();
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        moveMediaSource.AudioAttributesCompatParcelizer(!this.RemoteActionCompatParcelizer, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.AudioAttributesImplApi21Parcelizer = z;
        if (!z) {
            MediaBrowserCompatSearchResultReceiver();
        } else if (this.write) {
            MediaBrowserCompatItemReceiver();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.IconCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.AudioAttributesCompatParcelizer = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), AudioAttributesImplBaseParcelizer());
            this.AudioAttributesCompatParcelizer = false;
        }
        canvas.drawBitmap(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.IconCompatParcelizer(), (Rect) null, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi26Parcelizer());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        AudioAttributesImplApi26Parcelizer().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AudioAttributesImplApi26Parcelizer().setColorFilter(colorFilter);
    }

    private Rect AudioAttributesImplBaseParcelizer() {
        if (this.read == null) {
            this.read = new Rect();
        }
        return this.read;
    }

    private Paint AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new Paint(2);
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback AudioAttributesImplApi21Parcelizer() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // o.MediaPeriodHolder.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        if (AudioAttributesImplApi21Parcelizer() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (RatingCompat() == MediaBrowserCompatMediaItem() - 1) {
            this.MediaBrowserCompatCustomActionResultReceiver++;
        }
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == -1 || this.MediaBrowserCompatCustomActionResultReceiver < i) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void write() {
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.write();
    }

    static final class RemoteActionCompatParcelizer extends Drawable.ConstantState {
        final MediaPeriodHolder IconCompatParcelizer;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        RemoteActionCompatParcelizer(MediaPeriodHolder mediaPeriodHolder) {
            this.IconCompatParcelizer = mediaPeriodHolder;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new setYear(this);
        }
    }
}
