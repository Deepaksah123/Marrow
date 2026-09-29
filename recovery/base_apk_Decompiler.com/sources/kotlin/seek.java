package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class seek extends Drawable {
    private int AudioAttributesCompatParcelizer;
    private final Paint AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private ColorStateList IconCompatParcelizer;
    private int MediaDescriptionCompat;
    private isValidFrameType RatingCompat;
    private int onCommand;
    private float read;
    private int write;
    private final isNarrowBandValidFrameType MediaBrowserCompatCustomActionResultReceiver = isNarrowBandValidFrameType.RemoteActionCompatParcelizer();
    private final Path MediaBrowserCompatMediaItem = new Path();
    private final Rect MediaBrowserCompatItemReceiver = new Rect();
    private final RectF MediaMetadataCompat = new RectF();
    private final RectF RemoteActionCompatParcelizer = new RectF();
    private final AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver = new AudioAttributesCompatParcelizer(this, 0);
    private boolean AudioAttributesImplApi26Parcelizer = true;

    seek(isValidFrameType isvalidframetype) {
        this.RatingCompat = isvalidframetype;
        Paint paint = new Paint(1);
        this.AudioAttributesImplApi21Parcelizer = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.read != f) {
            this.read = f;
            this.AudioAttributesImplApi21Parcelizer.setStrokeWidth(f * 1.3333f);
            this.AudioAttributesImplApi26Parcelizer = true;
            invalidateSelf();
        }
    }

    final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.AudioAttributesImplBaseParcelizer = colorStateList.getColorForState(getState(), this.AudioAttributesImplBaseParcelizer);
        }
        this.IconCompatParcelizer = colorStateList;
        this.AudioAttributesImplApi26Parcelizer = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.AudioAttributesImplApi21Parcelizer.setColorFilter(colorFilter);
        invalidateSelf();
    }

    final void write(int i, int i2, int i3, int i4) {
        this.onCommand = i;
        this.MediaDescriptionCompat = i2;
        this.write = i3;
        this.AudioAttributesCompatParcelizer = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer.setShader(RemoteActionCompatParcelizer());
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        float strokeWidth = this.AudioAttributesImplApi21Parcelizer.getStrokeWidth() / 2.0f;
        copyBounds(this.MediaBrowserCompatItemReceiver);
        this.MediaMetadataCompat.set(this.MediaBrowserCompatItemReceiver);
        float fMin = Math.min(this.RatingCompat.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(AudioAttributesCompatParcelizer()), this.MediaMetadataCompat.width() / 2.0f);
        if (this.RatingCompat.read(AudioAttributesCompatParcelizer())) {
            this.MediaMetadataCompat.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.MediaMetadataCompat, fMin, fMin, this.AudioAttributesImplApi21Parcelizer);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.RatingCompat.read(AudioAttributesCompatParcelizer())) {
            outline.setRoundRect(getBounds(), this.RatingCompat.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(AudioAttributesCompatParcelizer()));
        } else {
            copyBounds(this.MediaBrowserCompatItemReceiver);
            this.MediaMetadataCompat.set(this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat, 1.0f, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem);
            DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(outline, this.MediaBrowserCompatMediaItem);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.RatingCompat.read(AudioAttributesCompatParcelizer())) {
            return true;
        }
        int iRound = Math.round(this.read);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    private RectF AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.set(getBounds());
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(isValidFrameType isvalidframetype) {
        this.RatingCompat = isvalidframetype;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.AudioAttributesImplApi21Parcelizer.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.read > BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.IconCompatParcelizer;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.IconCompatParcelizer;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.AudioAttributesImplBaseParcelizer)) != this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = true;
            this.AudioAttributesImplBaseParcelizer = colorForState;
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            invalidateSelf();
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private Shader RemoteActionCompatParcelizer() {
        copyBounds(this.MediaBrowserCompatItemReceiver);
        float fHeight = this.read / r1.height();
        return new LinearGradient(BitmapDescriptorFactory.HUE_RED, r1.top, BitmapDescriptorFactory.HUE_RED, r1.bottom, new int[]{_verifyNumberForScalarCoercion.read(this.onCommand, this.AudioAttributesImplBaseParcelizer), _verifyNumberForScalarCoercion.read(this.MediaDescriptionCompat, this.AudioAttributesImplBaseParcelizer), _verifyNumberForScalarCoercion.read(_verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, 0), this.AudioAttributesImplBaseParcelizer), _verifyNumberForScalarCoercion.read(_verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 0), this.AudioAttributesImplBaseParcelizer), _verifyNumberForScalarCoercion.read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer), _verifyNumberForScalarCoercion.read(this.write, this.AudioAttributesImplBaseParcelizer)}, new float[]{BitmapDescriptorFactory.HUE_RED, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    class AudioAttributesCompatParcelizer extends Drawable.ConstantState {
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(seek seekVar, byte b) {
            this();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return seek.this;
        }
    }
}
